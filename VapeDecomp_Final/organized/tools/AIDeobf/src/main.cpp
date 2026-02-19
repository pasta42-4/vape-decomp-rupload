#include <algorithm>
#include <archive.h>
#include <archive_entry.h>
#include <atomic>
#include <cstring>
#include <curl/curl.h>
#include <filesystem>
#include <fstream>
#include <iostream>
#include <map>
#include <mutex>
#include <nlohmann/json.hpp>
#include <queue>
#include <regex>
#include <set>
#include <sstream>
#include <string>
#include <thread>
#include <vector>

namespace fs = std::filesystem;
using json = nlohmann::json;

// ============================================================================
// Configuration
// ============================================================================

enum class InputType {
  SOURCE_CODE, // Decompiled .java files
  BYTECODE_JAR // Original .jar with .class files
};

// ============================================================================
// Data Structures
// ============================================================================

struct ClassInfo {
  std::string filepath;
  std::string class_name;
  std::string package_name;
  std::vector<std::string> methods;
  std::vector<std::pair<std::string, std::string>> field_types;
  std::vector<std::string> string_literals;
  std::vector<std::string> imports;
  std::set<std::string> referenced_classes;
  std::string extends;
  std::vector<std::string> implements;
  bool is_interface = false;
  bool is_enum = false;
  bool is_abstract = false;
  bool has_main_method = false;
  int importance_score = 0;

  // For bytecode mode
  std::vector<uint8_t> bytecode_data;
  bool is_bytecode = false;
  std::string original_path; // e.g., "a/NG"

  int calculate_importance() {
    int score = 0;
    if (has_main_method)
      score += 200;
    score += methods.size() * 3;
    score += string_literals.size() * 5;
    score += referenced_classes.size() * 2;
    score += imports.size();
    if (!extends.empty()) {
      score += is_obfuscated_name(extends) ? 10 : 30;
    }
    if (!implements.empty())
      score += 20;
    score += field_types.size() * 2;
    if (methods.size() < 2 && field_types.size() < 2)
      score -= 20;
    if (!is_obfuscated_name(class_name))
      score -= 100;
    score += 15;
    return score;
  }

  static bool is_obfuscated_name(const std::string &name) {
    if (name.empty())
      return false;
    if (name.length() <= 2)
      return true;
    if (std::regex_match(name, std::regex("^[a-z]{1,3}$")))
      return true;
    if (std::regex_match(name, std::regex("^[A-Z][a-z]{0,2}$")))
      return true;
    if (std::regex_match(name, std::regex("^(class|method|field)_\\d+$")))
      return true;

    int vowels = 0;
    for (char c : name) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        vowels++;
      }
    }
    if (name.length() > 3 && vowels == 0)
      return true;

    return false;
  }
};

struct Suggestion {
  std::string old_class_name;
  std::string new_class_name;
  float confidence = 0.0f;
  std::map<std::string, std::string> method_mappings;
  std::map<std::string, std::string> field_mappings;
  std::string reasoning;
  std::string suggested_package;
};

struct Mappings {
  std::map<std::string, std::string> classes;
  std::map<std::string, std::string> methods;
  std::map<std::string, std::string> fields;
  std::map<std::string, std::string> packages;
  std::map<std::string, float> confidence_scores;
  std::map<std::string, std::string> original_paths; // class_name -> "a/NG"
  std::set<std::string> used_names; // Track to avoid duplicates
  std::mutex mutex;
};

// ============================================================================
// Universal AI Deobfuscator (Source & Bytecode)
// ============================================================================

class UniversalAIDeobfuscator {
private:
  std::string api_key;
  std::string input_path;
  std::string output_path;
  InputType input_type;
  std::vector<ClassInfo> all_classes;
  Mappings mappings;
  std::atomic<int> api_calls{0};
  std::atomic<int> processed_files{0};
  int max_api_calls;
  bool restructure_project;
  std::string model_name;
  bool hybrid_mode;
  float min_confidence;

  static constexpr int BATCH_SIZE = 20;
  static constexpr int PARALLEL_REQUESTS = 3;

public:
  UniversalAIDeobfuscator(const std::string &key, const std::string &input,
                          const std::string &output, int max_calls = 100,
                          bool restructure = true, std::string model = "sonnet",
                          bool hybrid = false)
      : api_key(key), input_path(input), output_path(output),
        max_api_calls(max_calls), restructure_project(restructure),
        hybrid_mode(hybrid) {

    // Detect input type
    if (fs::is_directory(input_path)) {
      input_type = InputType::SOURCE_CODE;
      std::cout << "🔍 Detected: Source code directory\n";
    } else if (input_path.ends_with(".jar")) {
      input_type = InputType::BYTECODE_JAR;
      std::cout << "🔍 Detected: JAR bytecode file\n";
    } else {
      throw std::runtime_error(
          "Input must be a directory (.java) or .jar file");
    }

    // Set model configuration
    if (model == "haiku") {
      model_name = "claude-3-5-haiku-20241022";
      min_confidence = 0.55f;
      std::cout << "🤖 Using Claude 3.5 Haiku (fast & economical)\n";
    } else if (model == "opus") {
      model_name = "claude-opus-4-20250514";
      min_confidence = 0.7f;
      std::cout << "🤖 Using Claude Opus 4 (highest quality)\n";
    } else {
      model_name = "claude-sonnet-4-20250514";
      min_confidence = 0.6f;
      std::cout << "🤖 Using Claude Sonnet 4 (high quality)\n";
    }

    if (hybrid_mode) {
      std::cout << "🔄 Hybrid mode enabled (Haiku → Sonnet refinement)\n";
    }

    fs::create_directories(output_path);
  }

  void run() {
    auto start = std::chrono::high_resolution_clock::now();

    print_header();

    // Phase 1: Extract and analyze
    if (input_type == InputType::BYTECODE_JAR) {
      extract_jar_and_analyze();
    } else {
      analyze_source_files();
    }

    // Phase 2: Prioritize important classes
    prioritize_classes();

    // Phase 3: AI-powered batch renaming
    if (hybrid_mode) {
      run_hybrid_mode();
    } else {
      ai_rename_batch();
    }

    // Phase 4: Infer package structure
    if (restructure_project) {
      infer_package_structure();
    }

    // Phase 5: Apply renamings
    if (input_type == InputType::BYTECODE_JAR) {
      apply_bytecode_renamings();
    } else {
      apply_source_renamings();
    }

    // Phase 6: Save mappings
    save_mappings();

    auto end = std::chrono::high_resolution_clock::now();
    auto duration =
        std::chrono::duration_cast<std::chrono::seconds>(end - start);

    print_summary(duration.count());
  }

private:
  void print_header() {
    std::cout << "\n";
    std::cout
        << "╔════════════════════════════════════════════════════════════╗\n";
    std::cout
        << "║     Universal AI Deobfuscator v3.1 (Source + Bytecode)    ║\n";
    std::cout
        << "╚════════════════════════════════════════════════════════════╝\n";
    std::cout << "\n";
    std::cout << "📁 Input:       " << input_path << "\n";
    std::cout << "📁 Output:      " << output_path << "\n";
    std::cout << "⚙️  Mode:        "
              << (input_type == InputType::BYTECODE_JAR ? "BYTECODE" : "SOURCE")
              << "\n";
    std::cout << "🤖 API Budget:  " << max_api_calls << " calls\n";
    std::cout << "📦 Batch Size:  " << BATCH_SIZE << " classes/call\n";
    std::cout << "🔄 Restructure: " << (restructure_project ? "Yes" : "No")
              << "\n";
    std::cout << "\n";
  }

  void extract_jar(const std::string &jar_path, const std::string &output_dir) {
    struct archive *a;
    struct archive *ext;
    struct archive_entry *entry;
    int r;

    a = archive_read_new();
    archive_read_support_format_zip(a);
    ext = archive_write_disk_new();
    archive_write_disk_set_options(ext, ARCHIVE_EXTRACT_TIME);

    if ((r = archive_read_open_filename(a, jar_path.c_str(), 10240))) {
      std::cerr << "❌ Error opening JAR: " << archive_error_string(a) << "\n";
      return;
    }

    int count = 0;
    int class_count = 0;
    auto start_time = std::chrono::high_resolution_clock::now();

    while (archive_read_next_header(a, &entry) == ARCHIVE_OK) {
      std::string pathname = archive_entry_pathname(entry);
      std::string full_path = output_dir + "/" + pathname;

      archive_entry_set_pathname(entry, full_path.c_str());
      archive_write_header(ext, entry);

      const void *buff;
      size_t size;
      int64_t offset;

      while (true) {
        r = archive_read_data_block(a, &buff, &size, &offset);
        if (r == ARCHIVE_EOF)
          break;
        if (r != ARCHIVE_OK)
          break;
        archive_write_data_block(ext, buff, size, offset);
      }

      archive_write_finish_entry(ext);
      count++;

      if (pathname.ends_with(".class")) {
        class_count++;
      }

      if (count % 50 == 0) {
        auto now = std::chrono::high_resolution_clock::now();
        auto elapsed =
            std::chrono::duration_cast<std::chrono::seconds>(now - start_time)
                .count();
        float rate = elapsed > 0 ? (float)count / elapsed : 0;

        std::cout << "\r📦 Extracted: " << count << " files (" << class_count
                  << " .class) | " << (int)rate << " files/s";
        std::cout.flush();
      }
    }

    std::cout << "\r✅ Extracted: " << count << " files (" << class_count
              << " .class)          \n";

    archive_read_close(a);
    archive_read_free(a);
    archive_write_close(ext);
    archive_write_free(ext);
  }

  void decompile_jar_for_analysis(const std::string &jar_path,
                                  const std::string &output_dir) {
    std::cout << "\n🔄 Decompiling JAR for analysis (this may take a few "
                 "minutes)...\n";

    fs::create_directories(output_dir);

    // Try CFR first (fastest)
    std::string cfr_cmd = "java -jar tools/cfr.jar \"" + jar_path +
                          "\" "
                          "--outputdir \"" +
                          output_dir +
                          "\" "
                          "--silent true 2>&1";

    auto start = std::chrono::high_resolution_clock::now();
    std::cout << "📝 Trying CFR...\n";
    int result = system(cfr_cmd.c_str());
    auto end = std::chrono::high_resolution_clock::now();
    auto duration =
        std::chrono::duration_cast<std::chrono::seconds>(end - start).count();

    // Check if CFR produced files
    int java_count = 0;
    if (fs::exists(output_dir)) {
      for (const auto &entry : fs::recursive_directory_iterator(output_dir)) {
        if (entry.path().extension() == ".java") {
          java_count++;
        }
      }
    }

    if (java_count == 0) {
      std::cout << "⚠️  CFR failed, trying Procyon...\n";

      // Clear output directory
      fs::remove_all(output_dir);
      fs::create_directories(output_dir);

      // Try Procyon
      std::string procyon_cmd = "java -jar tools/procyon.jar \"" + jar_path +
                                "\" -o \"" + output_dir + "\" 2>&1";
      std::cout << "📝 Running Procyon...\n";
      start = std::chrono::high_resolution_clock::now();
      result = system(procyon_cmd.c_str());
      end = std::chrono::high_resolution_clock::now();
      duration =
          std::chrono::duration_cast<std::chrono::seconds>(end - start).count();

      // Check again
      java_count = 0;
      if (fs::exists(output_dir)) {
        for (const auto &entry : fs::recursive_directory_iterator(output_dir)) {
          if (entry.path().extension() == ".java") {
            java_count++;
          }
        }
      }

      if (java_count == 0) {
        std::cerr << "❌ Both CFR and Procyon failed to decompile JAR\n";
        std::cerr << "   Make sure tools/cfr.jar and tools/procyon.jar exist\n";
        throw std::runtime_error("Decompilation failed");
      }
    }

    std::cout << "✅ Decompilation complete (" << duration << "s)\n";
    std::cout << "✅ Found " << java_count << " decompiled .java files\n";
  }

  void extract_jar_and_analyze() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "📦 Phase 1: Extracting and analyzing JAR bytecode\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    std::string temp_dir = output_path + "/temp_extracted";
    std::string decompiled_dir = output_path + "/temp_decompiled";
    fs::create_directories(temp_dir);
    fs::create_directories(decompiled_dir);

    // Extract JAR for bytecode access
    std::cout << "Extracting JAR...\n";
    extract_jar(input_path, temp_dir);

    // Decompile the original JAR
    std::cout << "\nDecompiling JAR for analysis...\n";
    decompile_jar_for_analysis(input_path, decompiled_dir);

    // Analyze the decompiled source
    analyze_decompiled_temp(decompiled_dir, temp_dir);

    std::cout << "✅ Analyzed " << all_classes.size()
              << " classes from JAR\n\n";
  }

  void analyze_decompiled_temp(const std::string &decompiled_dir,
                               const std::string &bytecode_dir) {
    std::vector<std::string> files;
    std::cout << "\n🔍 Scanning decompiled files...\n";

    if (!fs::exists(decompiled_dir)) {
      throw std::runtime_error("Decompiled directory not found: " +
                               decompiled_dir);
    }

    for (const auto &entry : fs::recursive_directory_iterator(decompiled_dir)) {
      if (entry.path().extension() == ".java") {
        files.push_back(entry.path().string());
      }
    }

    std::cout << "📁 Found " << files.size() << " decompiled classes\n";
    std::cout << "⚙️  Analyzing class structures...\n\n";

    auto start_time = std::chrono::high_resolution_clock::now();

    for (size_t i = 0; i < files.size(); i++) {
      ClassInfo info = analyze_source_class(files[i]);
      if (!info.class_name.empty()) {
        info.is_bytecode = true;

        // Find corresponding .class file in the extracted directory
        std::string relative_path = files[i];
        size_t pos = relative_path.find(decompiled_dir);
        if (pos != std::string::npos) {
          relative_path = relative_path.substr(pos + decompiled_dir.length());
          // Remove leading slash
          if (!relative_path.empty() && relative_path[0] == '/') {
            relative_path = relative_path.substr(1);
          }
        }

        // Convert .java to .class
        std::string class_file = bytecode_dir + "/" + relative_path;
        size_t java_ext = class_file.rfind(".java");
        if (java_ext != std::string::npos) {
          class_file = class_file.substr(0, java_ext) + ".class";
        }

        if (fs::exists(class_file)) {
          // Read bytecode
          std::ifstream ifs(class_file, std::ios::binary);
          info.bytecode_data =
              std::vector<uint8_t>(std::istreambuf_iterator<char>(ifs),
                                   std::istreambuf_iterator<char>());
          info.filepath = class_file;
          
          // Extract original path (e.g., "a/NG")
          std::string orig_path = relative_path;
          size_t ext_pos = orig_path.rfind(".java");
          if (ext_pos != std::string::npos) {
            orig_path = orig_path.substr(0, ext_pos);
          }
          info.original_path = orig_path;
        }

        all_classes.push_back(info);
      }

      if ((i + 1) % 10 == 0 || (i + 1) == files.size()) {
        auto now = std::chrono::high_resolution_clock::now();
        auto elapsed =
            std::chrono::duration_cast<std::chrono::seconds>(now - start_time)
                .count();
        float rate = elapsed > 0 ? (float)(i + 1) / elapsed : 0;
        int eta = rate > 0 ? (int)((files.size() - (i + 1)) / rate) : 0;

        std::string suffix = "| " + std::to_string((int)rate) +
                             " files/s | ETA: " + format_time(eta);
        print_progress_bar(i + 1, files.size(), "⚙️  Analyzing", suffix);
      }
    }

    std::cout << "\n";
  }

  // ========================================================================
  // SOURCE MODE: Analyze .java files
  // ========================================================================

  void analyze_source_files() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "📊 Phase 1: Analyzing Java source files (no API calls)\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    std::vector<std::string> files;
    std::cout << "🔍 Scanning directory...\n";
    for (const auto &entry : fs::recursive_directory_iterator(input_path)) {
      if (entry.path().extension() == ".java") {
        files.push_back(entry.path().string());
      }
    }

    std::cout << "📁 Found " << files.size() << " Java files\n\n";

    auto start_time = std::chrono::high_resolution_clock::now();

    for (size_t i = 0; i < files.size(); i++) {
      ClassInfo info = analyze_source_class(files[i]);
      if (!info.class_name.empty()) {
        all_classes.push_back(info);
      }

      if ((i + 1) % 10 == 0 || (i + 1) == files.size()) {
        auto now = std::chrono::high_resolution_clock::now();
        auto elapsed =
            std::chrono::duration_cast<std::chrono::seconds>(now - start_time)
                .count();
        float rate = elapsed > 0 ? (float)(i + 1) / elapsed : 0;
        int eta = rate > 0 ? (int)((files.size() - (i + 1)) / rate) : 0;

        std::string suffix = "| " + std::to_string((int)rate) +
                             " files/s | ETA: " + format_time(eta);
        print_progress_bar(i + 1, files.size(), "⚙️  Analyzing", suffix);
      }
    }

    std::cout << "\n✅ Analyzed " << all_classes.size() << " classes\n\n";
  }

  ClassInfo analyze_source_class(const std::string &filepath) {
    std::ifstream file(filepath);
    if (!file.is_open())
      return ClassInfo();

    std::stringstream buffer;
    buffer << file.rdbuf();
    std::string content = buffer.str();

    ClassInfo info;
    info.filepath = filepath;
    info.is_bytecode = false;

    // Extract package
    std::smatch match;
    if (std::regex_search(content, match,
                          std::regex("package\\s+([\\w.]+)\\s*;"))) {
      info.package_name = match[1];
    }

    // Extract class declaration
    std::regex class_regex("(public\\s+)?(abstract\\s+)?(final\\s+)?(class|"
                           "interface|enum)\\s+(\\w+)");
    if (std::regex_search(content, match, class_regex)) {
      info.class_name = match[5];
      info.is_interface = (match[4] == "interface");
      info.is_enum = (match[4] == "enum");
      info.is_abstract = (match[2] == "abstract");
    }

    if (info.class_name.empty())
      return info;

    // Extract extends
    if (std::regex_search(content, match,
                          std::regex("extends\\s+([\\w.<>]+)"))) {
      info.extends = match[1];
    }

    // Extract implements
    std::regex impl_regex("implements\\s+([\\w.,\\s<>]+)");
    if (std::regex_search(content, match, impl_regex)) {
      std::string impls = match[1];
      std::istringstream iss(impls);
      std::string impl;
      while (std::getline(iss, impl, ',')) {
        impl.erase(0, impl.find_first_not_of(" \t\n"));
        impl.erase(impl.find_last_not_of(" \t\n") + 1);
        if (!impl.empty())
          info.implements.push_back(impl);
      }
    }

    // Extract imports
    std::regex import_regex("import\\s+(static\\s+)?([\\w.]+)\\s*;");
    auto imports_begin =
        std::sregex_iterator(content.begin(), content.end(), import_regex);
    for (auto i = imports_begin; i != std::sregex_iterator(); ++i) {
      info.imports.push_back((*i)[2]);
    }

    // Extract methods
    std::regex method_regex("(public|private|protected|static)\\s+"
                            "(static\\s+)?(final\\s+)?(synchronized\\s+)?"
                            "([\\w<>\\[\\]]+)\\s+"
                            "(\\w+)\\s*"
                            "\\([^)]*\\)");
    auto methods_begin =
        std::sregex_iterator(content.begin(), content.end(), method_regex);

    std::set<std::string> method_set;
    for (auto i = methods_begin;
         i != std::sregex_iterator() && method_set.size() < 25; ++i) {
      std::string method_name = (*i)[6];

      if (method_name != "if" && method_name != "for" &&
          method_name != "while" && method_name != "switch" &&
          method_name != "catch" && method_name != "return" &&
          method_name != "new" && method_name != "this" &&
          method_name != "super") {

        if (method_name == "main") {
          info.has_main_method = true;
        }
        method_set.insert(method_name);
      }
    }
    info.methods.assign(method_set.begin(), method_set.end());

    // Extract fields with types (skip arrays and invalid names)
    std::regex field_regex("(public|private|protected)\\s+"
                           "(static\\s+)?(final\\s+)?"
                           "([\\w<>.]+)\\s+"
                           "(\\w+)\\s*[=;]");
    auto fields_begin =
        std::sregex_iterator(content.begin(), content.end(), field_regex);

    for (auto i = fields_begin;
         i != std::sregex_iterator() && info.field_types.size() < 20; ++i) {
      std::string type = (*i)[4];
      std::string name = (*i)[5];
      
      // Skip if field name or type contains invalid characters
      if (name.find('[') == std::string::npos && 
          name.find(']') == std::string::npos &&
          type.find('[') == std::string::npos) {
        info.field_types.push_back({name, type});
      }
    }

    // Extract string literals
    std::regex string_regex("\"([^\"]{3,80})\"");
    auto strings_begin =
        std::sregex_iterator(content.begin(), content.end(), string_regex);

    for (auto i = strings_begin;
         i != std::sregex_iterator() && info.string_literals.size() < 15; ++i) {
      std::string str = (*i)[1];
      if (str.find("\\") == std::string::npos && str.length() > 3) {
        info.string_literals.push_back(str);
      }
    }

    // Extract referenced class names
    std::regex class_ref_regex("\\b([A-Z][a-zA-Z0-9_]*)\\b");
    auto refs_begin =
        std::sregex_iterator(content.begin(), content.end(), class_ref_regex);
    for (auto i = refs_begin;
         i != std::sregex_iterator() && info.referenced_classes.size() < 30;
         ++i) {
      std::string ref = (*i)[1];
      if (ref != info.class_name) {
        info.referenced_classes.insert(ref);
      }
    }

    return info;
  }

  // ========================================================================
  // Phase 2: Prioritize Classes
  // ========================================================================

  void prioritize_classes() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "🎯 Phase 2: Prioritizing important classes\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    for (auto &cls : all_classes) {
      cls.importance_score = cls.calculate_importance();
    }

    std::sort(all_classes.begin(), all_classes.end(),
              [](const ClassInfo &a, const ClassInfo &b) {
                return a.importance_score > b.importance_score;
              });

    std::cout << "Top 5 most important classes:\n";
    for (int i = 0; i < std::min(5, (int)all_classes.size()); i++) {
      std::cout << "  " << (i + 1) << ". " << all_classes[i].class_name
                << " (score: " << all_classes[i].importance_score << ")\n";
    }
    std::cout << "\n";
  }

  // ========================================================================
  // Phase 3: AI Renaming
  // ========================================================================

  void run_hybrid_mode() {
    std::cout << "🔄 Hybrid mode implementation...\n";
    ai_rename_batch();
  }

  void ai_rename_batch() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "🤖 Phase 3: AI-powered renaming (" << model_name << ")\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    // Filter obfuscated classes
    std::vector<ClassInfo> obfuscated_classes;
    std::cout << "🔍 Identifying obfuscated classes...\n";
    for (const auto &cls : all_classes) {
      if (ClassInfo::is_obfuscated_name(cls.class_name)) {
        obfuscated_classes.push_back(cls);
      }
    }

    std::cout << "📊 Statistics:\n";
    std::cout << "   • Total classes: " << all_classes.size() << "\n";
    std::cout << "   • Obfuscated: " << obfuscated_classes.size() << "\n";
    std::cout << "   • Already named: "
              << (all_classes.size() - obfuscated_classes.size()) << "\n\n";

    // Create batches
    std::vector<std::vector<ClassInfo>> batches;
    for (size_t i = 0; i < obfuscated_classes.size(); i += BATCH_SIZE) {
      size_t end = std::min(i + BATCH_SIZE, obfuscated_classes.size());
      batches.emplace_back(obfuscated_classes.begin() + i,
                           obfuscated_classes.begin() + end);
    }

    if (batches.size() > (size_t)max_api_calls) {
      std::cout << "⚠️  Limited to " << max_api_calls
                << " API calls (budget constraint)\n";
      std::cout << "   • Will process " << (max_api_calls * BATCH_SIZE)
                << " classes\n";
      std::cout << "   • Remaining " << (batches.size() - max_api_calls)
                << " batches skipped\n\n";
      batches.resize(max_api_calls);
    }

    std::cout << "🚀 Processing " << batches.size() << " batches ("
              << (batches.size() * BATCH_SIZE) << " classes)\n";
    std::cout << "⏱️  Estimated time: " << format_time(batches.size() * 2)
              << " (at 2s/batch)\n\n";

    auto start_time = std::chrono::high_resolution_clock::now();
    int successful_batches = 0;
    int failed_batches = 0;

    for (size_t i = 0; i < batches.size(); i++) {
      auto batch_start = std::chrono::high_resolution_clock::now();

      auto now = std::chrono::high_resolution_clock::now();
      auto elapsed =
          std::chrono::duration_cast<std::chrono::seconds>(now - start_time)
              .count();
      float avg_time = i > 0 ? (float)elapsed / i : 2.0f;
      int eta = (int)(avg_time * (batches.size() - i));

      std::string status = "Batch " + std::to_string(i + 1) + "/" +
                           std::to_string(batches.size());
      std::string suffix = "| ETA: " + format_time(eta) +
                           " | Success: " + std::to_string(successful_batches) +
                           "/" + std::to_string(i);
      print_progress_bar(i, batches.size(), "🔄 " + status, suffix);

      auto suggestions = call_claude_batch(batches[i]);

      if (!suggestions.empty()) {
        apply_suggestions(suggestions);
        successful_batches++;
      } else {
        failed_batches++;
      }

      auto batch_end = std::chrono::high_resolution_clock::now();
      auto batch_time = std::chrono::duration_cast<std::chrono::milliseconds>(
                            batch_end - batch_start)
                            .count();

      api_calls++;

      suffix = "| " + std::to_string(batch_time) +
               "ms | Success: " + std::to_string(successful_batches) + "/" +
               std::to_string(i + 1);
      print_progress_bar(i + 1, batches.size(), "✅ " + status, suffix);

      if (i + 1 < batches.size()) {
        std::this_thread::sleep_for(std::chrono::milliseconds(600));
      }
    }

    std::cout << "\n\n";
    std::cout << "📊 AI Renaming Results:\n";
    std::cout << "   • Successful batches: " << successful_batches << "/"
              << batches.size() << "\n";
    std::cout << "   • Failed batches: " << failed_batches << "\n";
    std::cout << "   • Classes renamed: " << mappings.classes.size() << "\n";
    std::cout << "   • Methods renamed: " << mappings.methods.size() << "\n";
    std::cout << "   • Fields renamed: " << mappings.fields.size() << "\n";

    auto end_time = std::chrono::high_resolution_clock::now();
    auto total_time =
        std::chrono::duration_cast<std::chrono::seconds>(end_time - start_time)
            .count();
    std::cout << "   • Total time: " << format_time(total_time) << "\n";
    std::cout << "   • Avg time/batch: " << (total_time / batches.size())
              << "s\n\n";

    std::cout << "✅ AI renaming complete\n\n";
  }

  // ========================================================================
  // Progress Bar Utilities
  // ========================================================================

  void print_progress_bar(int current, int total,
                          const std::string &prefix = "",
                          const std::string &suffix = "") {
    const int bar_width = 50;
    float progress = (float)current / (float)total;
    int filled = (int)(progress * bar_width);

    std::cout << "\r" << prefix << " [";
    for (int i = 0; i < bar_width; i++) {
      if (i < filled)
        std::cout << "█";
      else
        std::cout << "░";
    }
    std::cout << "] " << (int)(progress * 100) << "% (" << current << "/"
              << total << ") " << suffix;
    std::cout.flush();
  }

  std::string format_time(int seconds) {
    if (seconds < 60)
      return std::to_string(seconds) + "s";
    int mins = seconds / 60;
    int secs = seconds % 60;
    if (mins < 60)
      return std::to_string(mins) + "m " + std::to_string(secs) + "s";
    int hours = mins / 60;
    mins = mins % 60;
    return std::to_string(hours) + "h " + std::to_string(mins) + "m";
  }

  // ========================================================================
  // Enhanced Claude API Implementation
  // ========================================================================

  std::vector<Suggestion>
  call_claude_batch(const std::vector<ClassInfo> &batch) {
    std::stringstream prompt;

    prompt << "You are a Java deobfuscation expert. Analyze these obfuscated "
              "classes and suggest UNIQUE meaningful names.\n\n";
    prompt << "CRITICAL: Each class MUST have a completely different name. "
              "Never reuse names like DataProcessor, EventHandler, etc.\n";
    prompt << "Be creative and specific. Use domain-specific terms.\n\n";
    prompt << "Guidelines:\n";
    prompt << "- Use standard Java naming (PascalCase for classes, camelCase "
              "for methods/fields)\n";
    prompt << "- Infer purpose from: methods, fields, string literals, "
              "inheritance\n";
    prompt << "- Suggest package names based on functionality\n";
    prompt << "- Each class name must be UNIQUE and descriptive\n";
    prompt << "- Be confident but realistic\n\n";
    prompt << "=== CLASSES TO ANALYZE ===\n\n";

    for (size_t i = 0; i < batch.size(); i++) {
      const auto &cls = batch[i];
      prompt << "CLASS #" << (i + 1) << ": " << cls.class_name << "\n";
      prompt << "├─ Package: "
             << (cls.package_name.empty() ? "(none)" : cls.package_name)
             << "\n";

      if (cls.is_interface)
        prompt << "├─ Type: Interface\n";
      else if (cls.is_enum)
        prompt << "├─ Type: Enum\n";
      else if (cls.is_abstract)
        prompt << "├─ Type: Abstract Class\n";

      if (!cls.extends.empty()) {
        prompt << "├─ Extends: " << cls.extends << "\n";
      }
      if (!cls.implements.empty()) {
        prompt << "├─ Implements: ";
        for (size_t j = 0; j < cls.implements.size(); j++) {
          if (j > 0)
            prompt << ", ";
          prompt << cls.implements[j];
        }
        prompt << "\n";
      }

      if (!cls.methods.empty()) {
        prompt << "├─ Methods (" << cls.methods.size() << "): ";
        for (size_t j = 0; j < std::min(cls.methods.size(), size_t(12)); j++) {
          if (j > 0)
            prompt << ", ";
          prompt << cls.methods[j] << "()";
        }
        if (cls.methods.size() > 12)
          prompt << ", ...";
        prompt << "\n";
      }

      if (!cls.field_types.empty()) {
        prompt << "├─ Fields (" << cls.field_types.size() << "):\n";
        for (size_t j = 0; j < std::min(cls.field_types.size(), size_t(10));
             j++) {
          prompt << "│  • " << cls.field_types[j].second << " "
                 << cls.field_types[j].first << "\n";
        }
        if (cls.field_types.size() > 10)
          prompt << "│  • ...\n";
      }

      if (!cls.string_literals.empty()) {
        prompt << "├─ String Literals (" << cls.string_literals.size()
               << "):\n";
        for (size_t j = 0; j < std::min(cls.string_literals.size(), size_t(8));
             j++) {
          prompt << "│  • \"" << cls.string_literals[j] << "\"\n";
        }
        if (cls.string_literals.size() > 8)
          prompt << "│  • ...\n";
      }

      prompt << "\n";
    }

    prompt << "=== RESPONSE FORMAT ===\n";
    prompt << "Respond with JSON array ONLY (no markdown, no explanation):\n";
    prompt << "[\n";
    prompt << "  {\n";
    prompt << "    \"class\": \"" << batch[0].class_name << "\",\n";
    prompt << "    \"new_name\": \"UniqueDescriptiveClassName\",\n";
    prompt << "    \"package\": \"com.app.specific.category\",\n";
    prompt << "    \"confidence\": 0.85,\n";
    prompt << "    \"reasoning\": \"Brief explanation\",\n";
    prompt << "    \"methods\": {\"oldMethod\": \"newMethod\"},\n";
    prompt << "    \"fields\": {\"oldField\": \"newField\"}\n";
    prompt << "  }\n";
    prompt << "]\n";
    prompt << "\nREMEMBER: EVERY class needs a UNIQUE name!\n";

    auto response = call_claude_api(prompt.str());
    return parse_suggestions(response);
  }

  std::vector<Suggestion> parse_suggestions(const json &response_json) {
    std::vector<Suggestion> suggestions;

    if (!response_json.is_array()) {
      return suggestions;
    }

    for (const auto &item : response_json) {
      if (!item.contains("class") || !item.contains("new_name")) {
        continue;
      }

      Suggestion sug;
      sug.old_class_name = item["class"];
      sug.new_class_name = item["new_name"];

      if (item.contains("confidence")) {
        sug.confidence = item["confidence"];
      } else {
        sug.confidence = 0.7f;
      }

      if (item.contains("reasoning")) {
        sug.reasoning = item["reasoning"];
      }

      if (item.contains("package")) {
        sug.suggested_package = item["package"];
      }

      if (item.contains("methods") && item["methods"].is_object()) {
        for (auto &[old_name, new_name] : item["methods"].items()) {
          sug.method_mappings[old_name] = new_name;
        }
      }

      if (item.contains("fields") && item["fields"].is_object()) {
        for (auto &[old_name, new_name] : item["fields"].items()) {
          sug.field_mappings[old_name] = new_name;
        }
      }

      suggestions.push_back(sug);
    }

    return suggestions;
  }

  json call_claude_api(const std::string &prompt) {
    CURL *curl = curl_easy_init();
    std::string response;

    if (!curl) {
      std::cerr << "\n❌ Failed to initialize CURL\n";
      return json::array();
    }

    json request_body = {
        {"model", model_name},
        {"max_tokens", 4096},
        {"messages", json::array({{{"role", "user"}, {"content", prompt}}})}};

    std::string request_str = request_body.dump();

    struct curl_slist *headers = nullptr;
    headers = curl_slist_append(headers, "Content-Type: application/json");
    headers = curl_slist_append(headers, ("x-api-key: " + api_key).c_str());
    headers = curl_slist_append(headers, "anthropic-version: 2023-06-01");

    curl_easy_setopt(curl, CURLOPT_URL,
                     "https://api.anthropic.com/v1/messages");
    curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
    curl_easy_setopt(curl, CURLOPT_POSTFIELDS, request_str.c_str());
    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_callback);
    curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);
    curl_easy_setopt(curl, CURLOPT_TIMEOUT, 60L);

    CURLcode res = curl_easy_perform(curl);

    curl_slist_free_all(headers);
    curl_easy_cleanup(curl);

    if (res != CURLE_OK) {
      std::cerr << "\n❌ CURL error: " << curl_easy_strerror(res) << "\n";
      return json::array();
    }

    try {
      auto response_json = json::parse(response);

      if (response_json.contains("error")) {
        std::cerr << "\n❌ API Error: " << response_json["error"]["message"]
                  << "\n";
        return json::array();
      }

      if (!response_json.contains("content") ||
          response_json["content"].empty()) {
        std::cerr << "\n❌ Empty response from API\n";
        return json::array();
      }

      std::string content = response_json["content"][0]["text"];

      size_t start = content.find('[');
      size_t end = content.rfind(']');

      if (start != std::string::npos && end != std::string::npos) {
        std::string json_str = content.substr(start, end - start + 1);
        return json::parse(json_str);
      }

      std::cerr << "\n⚠️  No JSON array found in response\n";
    } catch (const std::exception &e) {
      std::cerr << "\n❌ JSON parse error: " << e.what() << "\n";
    }

    return json::array();
  }

  void apply_suggestions(const std::vector<Suggestion> &suggestions) {
    std::lock_guard<std::mutex> lock(mappings.mutex);

    for (const auto &sug : suggestions) {
      if (sug.confidence < min_confidence)
        continue;

      // Check for duplicate names
      if (!sug.new_class_name.empty()) {
        if (mappings.used_names.count(sug.new_class_name)) {
          // Duplicate detected, skip or modify
          std::string unique_name = sug.new_class_name + std::to_string(mappings.used_names.size());
          mappings.classes[sug.old_class_name] = unique_name;
          mappings.used_names.insert(unique_name);
          mappings.confidence_scores[sug.old_class_name] = sug.confidence * 0.8f;
        } else {
          mappings.classes[sug.old_class_name] = sug.new_class_name;
          mappings.used_names.insert(sug.new_class_name);
          mappings.confidence_scores[sug.old_class_name] = sug.confidence;
        }
      }

      // Store original path for SRG export
      for (const auto &cls : all_classes) {
        if (cls.class_name == sug.old_class_name && !cls.original_path.empty()) {
          mappings.original_paths[sug.old_class_name] = cls.original_path;
          break;
        }
      }

      for (const auto &[old_m, new_m] : sug.method_mappings) {
        mappings.methods[sug.old_class_name + ":" + old_m] = new_m;
      }

      for (const auto &[old_f, new_f] : sug.field_mappings) {
        // Skip fields with invalid characters
        if (old_f.find('[') == std::string::npos && 
            old_f.find(']') == std::string::npos) {
          mappings.fields[sug.old_class_name + ":" + old_f] = new_f;
        }
      }

      if (!sug.suggested_package.empty()) {
        mappings.packages[sug.old_class_name] = sug.suggested_package;
      }
    }
  }

  // ========================================================================
  // Phase 4: Package structure inference
  // ========================================================================

  void infer_package_structure() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "📦 Phase 4: Inferring package structure\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    for (const auto &cls : all_classes) {
      std::string new_name = cls.class_name;
      if (mappings.classes.count(cls.class_name)) {
        new_name = mappings.classes[cls.class_name];
      }

      if (!mappings.packages.count(cls.class_name)) {
        std::string pkg = infer_package_for_class(cls, new_name);
        mappings.packages[cls.class_name] = pkg;
      }
    }

    std::cout << "✅ Package structure inferred\n\n";
  }

  std::string infer_package_for_class(const ClassInfo &cls,
                                      const std::string &new_name) {
    std::string lower = new_name;
    std::transform(lower.begin(), lower.end(), lower.begin(), ::tolower);

    if (lower.find("network") != std::string::npos ||
        lower.find("packet") != std::string::npos ||
        lower.find("connection") != std::string::npos) {
      return "com.app.network";
    }
    if (lower.find("ui") != std::string::npos ||
        lower.find("gui") != std::string::npos ||
        lower.find("screen") != std::string::npos ||
        lower.find("widget") != std::string::npos) {
      return "com.app.ui";
    }
    if (lower.find("config") != std::string::npos ||
        lower.find("setting") != std::string::npos) {
      return "com.app.config";
    }
    if (lower.find("util") != std::string::npos ||
        lower.find("helper") != std::string::npos) {
      return "com.app.util";
    }
    if (lower.find("model") != std::string::npos ||
        lower.find("data") != std::string::npos ||
        lower.find("entity") != std::string::npos) {
      return "com.app.model";
    }
    if (lower.find("service") != std::string::npos ||
        lower.find("manager") != std::string::npos) {
      return "com.app.service";
    }

    return "com.app.core";
  }

  void export_srg_mappings(const std::string &filename) {
    std::ofstream out(filename);

    out << "# SRG Mappings for Tiny Remapper\n";
    out << "# Format: CL: old/path/Class new/package/Class\n\n";

    // Class mappings
    for (const auto &[old_cls, new_cls] : mappings.classes) {
      std::string old_path = old_cls;
      
      // Use original_path if available (e.g., "a/NG")
      if (mappings.original_paths.count(old_cls)) {
        old_path = mappings.original_paths[old_cls];
      }
      
      std::string new_path = new_cls;

      // Add package to new path
      if (mappings.packages.count(old_cls)) {
        std::string pkg = mappings.packages[old_cls];
        std::replace(pkg.begin(), pkg.end(), '.', '/');
        new_path = pkg + "/" + new_cls;
      }

      out << "CL: " << old_path << " " << new_path << "\n";
    }

    out.close();
    std::cout << "  ✅ Exported SRG mappings: " << filename << "\n";
  }

  // ========================================================================
  // Phase 5a: Apply renamings to BYTECODE
  // ========================================================================

  void copy_jar_fallback(const std::string &output_jar) {
    std::string copy_cmd = "cp \"" + input_path + "\" \"" + output_jar + "\"";
    system(copy_cmd.c_str());
    std::cout << "📋 Copied original JAR to: " << output_jar << "\n";
    std::cout << "ℹ️  Check mappings.srg for manual remapping\n\n";
  }

  void apply_bytecode_renamings() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "🔧 Phase 5: Applying renamings to bytecode\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    std::string mappings_file = output_path + "/mappings.srg";
    export_srg_mappings(mappings_file);

    std::string output_jar = output_path + "/output.jar";

    if (!fs::exists("tools/specialsource.jar")) {
      std::cerr << "❌ tools/specialsource.jar not found!\n";
      std::cerr << "   Run: wget https://repo.maven.apache.org/maven2/net/md-5/SpecialSource/1.11.4/SpecialSource-1.11.4-shaded.jar -O tools/specialsource.jar\n";
      copy_jar_fallback(output_jar);
      return;
    }

    std::cout << "🔄 Remapping bytecode with SpecialSource...\n\n";

    std::string cmd = "java -jar tools/specialsource.jar --in-jar \"" + input_path +
                      "\" --out-jar \"" + output_jar + "\" --srg-in \"" + mappings_file +
                      "\" 2>&1";

    FILE *pipe = popen(cmd.c_str(), "r");
    if (!pipe) {
      std::cerr << "❌ Failed to execute SpecialSource\n";
      copy_jar_fallback(output_jar);
      return;
    }

    char buffer[512];
    while (fgets(buffer, sizeof(buffer), pipe) != nullptr) {
      std::cout << "  " << buffer;
    }

    int exit_code = pclose(pipe);

    std::cout << "\n";

    if (exit_code == 0 && fs::exists(output_jar)) {
      std::cout << "✅ Bytecode remapping successful!\n";
      std::cout << "📦 Remapped JAR: " << output_jar << "\n\n";
      
      // Auto-decompile
      std::cout << "🔄 Auto-decompiling remapped JAR...\n";
      std::string decompiled_dir = output_path + "/decompiled_source";
      fs::create_directories(decompiled_dir);
      
      std::string decompile_cmd;
      if (fs::exists("tools/cfr.jar")) {
        decompile_cmd = "java -jar tools/cfr.jar \"" + output_jar + 
                       "\" --outputdir \"" + decompiled_dir + "\" --silent false";
      } else if (fs::exists("tools/procyon.jar")) {
        decompile_cmd = "java -jar tools/procyon.jar \"" + output_jar + 
                       "\" -o \"" + decompiled_dir + "\"";
      }
      
      if (!decompile_cmd.empty()) {
        system(decompile_cmd.c_str());
        std::cout << "\n✅ Decompiled source: " << decompiled_dir << "\n\n";
      }
    } else {
      std::cerr << "⚠️  Remapping failed (exit " << exit_code
                << "), copying original...\n";
      copy_jar_fallback(output_jar);
    }
  }

  // ========================================================================
  // Phase 5b: Apply renamings to SOURCE CODE
  // ========================================================================

  void apply_source_renamings() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "🔧 Phase 5: Applying renamings to source code\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    int renamed_files = 0;
    int total_files = all_classes.size();
    auto start_time = std::chrono::high_resolution_clock::now();

    std::cout << "📝 Writing " << total_files << " renamed files...\n\n";

    for (const auto &cls : all_classes) {
      std::string new_name = cls.class_name;
      std::string new_package = cls.package_name;

      if (mappings.classes.count(cls.class_name)) {
        new_name = mappings.classes[cls.class_name];
      }

      if (mappings.packages.count(cls.class_name)) {
        new_package = mappings.packages[cls.class_name];
      }

      std::ifstream in(cls.filepath);
      std::stringstream buffer;
      buffer << in.rdbuf();
      std::string content = buffer.str();
      in.close();

      content = apply_renamings_to_content(content, cls);

      std::string output_file;
      if (restructure_project && !new_package.empty()) {
        std::string pkg_path = new_package;
        std::replace(pkg_path.begin(), pkg_path.end(), '.', '/');
        output_file = output_path + "/src/main/java/" + pkg_path + "/" +
                      new_name + ".java";
      } else {
        output_file = output_path + "/" + new_name + ".java";
      }

      fs::create_directories(fs::path(output_file).parent_path());

      std::ofstream out(output_file);
      out << content;
      out.close();

      renamed_files++;

      if (renamed_files % 10 == 0 || renamed_files == total_files) {
        auto now = std::chrono::high_resolution_clock::now();
        auto elapsed =
            std::chrono::duration_cast<std::chrono::seconds>(now - start_time)
                .count();
        float rate = elapsed > 0 ? (float)renamed_files / elapsed : 0;
        int eta = rate > 0 ? (int)((total_files - renamed_files) / rate) : 0;

        std::string suffix = "| " + std::to_string((int)rate) +
                             " files/s | ETA: " + format_time(eta);
        print_progress_bar(renamed_files, total_files, "💾 Writing", suffix);
      }
    }

    std::cout << "\n✅ Renamed " << renamed_files << " files\n\n";
  }

  std::string apply_renamings_to_content(std::string content,
                                         const ClassInfo &cls) {
    if (mappings.classes.count(cls.class_name)) {
      std::string new_name = mappings.classes[cls.class_name];
      std::regex class_regex("\\b" + cls.class_name + "\\b");
      content = std::regex_replace(content, class_regex, new_name);
    }

    if (mappings.packages.count(cls.class_name)) {
      std::string new_pkg = mappings.packages[cls.class_name];
      std::regex pkg_regex("package\\s+[\\w.]+;");
      content =
          std::regex_replace(content, pkg_regex, "package " + new_pkg + ";");
    }

    for (const auto &[key, new_method] : mappings.methods) {
      if (key.starts_with(cls.class_name + ":")) {
        std::string old_method = key.substr(key.find(':') + 1);
        std::regex method_regex("\\b" + old_method + "\\s*\\(");
        content = std::regex_replace(content, method_regex, new_method + "(");
      }
    }

    for (const auto &[key, new_field] : mappings.fields) {
      if (key.starts_with(cls.class_name + ":")) {
        std::string old_field = key.substr(key.find(':') + 1);
        std::regex field_regex("\\b" + old_field + "\\b");
        content = std::regex_replace(content, field_regex, new_field);
      }
    }

    for (const auto &[old_cls, new_cls] : mappings.classes) {
      std::regex ref_regex("\\b" + old_cls + "\\b");
      content = std::regex_replace(content, ref_regex, new_cls);
    }

    return content;
  }

  // ========================================================================
  // Phase 6: Save mappings
  // ========================================================================

  void save_mappings() {
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    std::cout << "💾 Phase 6: Saving mappings\n";
    std::cout << "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

    std::string mappings_file = output_path + "/MAPPINGS.txt";
    std::ofstream out(mappings_file);

    out << "# AI Deobfuscation Mappings\n";
    out << "# Generated by Universal AI Deobfuscator v3.1\n\n";

    out << "# CLASSES (" << mappings.classes.size() << ")\n";
    for (const auto &[old_name, new_name] : mappings.classes) {
      float conf = mappings.confidence_scores.count(old_name)
                       ? mappings.confidence_scores[old_name]
                       : 0.0f;
      out << old_name << " → " << new_name << " (confidence: " << conf << ")\n";
    }

    out << "\n# METHODS (" << mappings.methods.size() << ")\n";
    for (const auto &[key, new_name] : mappings.methods) {
      out << key << " → " << new_name << "\n";
    }

    out << "\n# FIELDS (" << mappings.fields.size() << ")\n";
    for (const auto &[key, new_name] : mappings.fields) {
      out << key << " → " << new_name << "\n";
    }

    out << "\n# PACKAGES (" << mappings.packages.size() << ")\n";
    for (const auto &[cls, pkg] : mappings.packages) {
      out << cls << " → " << pkg << "\n";
    }

    out.close();

    std::cout << "✅ Mappings saved to: " << mappings_file << "\n\n";
  }

  void print_summary(int duration) {
    std::cout
        << "╔════════════════════════════════════════════════════════════╗\n";
    std::cout
        << "║                      SUMMARY                               ║\n";
    std::cout
        << "╚════════════════════════════════════════════════════════════╝\n\n";

    std::cout << "⏱️  Time:           " << duration << " seconds\n";
    std::cout << "📊 Classes:        " << all_classes.size() << " analyzed\n";
    std::cout << "🎯 Renamed:        " << mappings.classes.size()
              << " classes\n";
    std::cout << "📝 Methods:        " << mappings.methods.size()
              << " renamed\n";
    std::cout << "🔧 Fields:         " << mappings.fields.size()
              << " renamed\n";
    std::cout << "🤖 API calls:      " << api_calls << " / " << max_api_calls
              << "\n";
    std::cout << "📁 Output:         " << output_path << "\n\n";

    float avg_confidence = 0.0f;
    if (!mappings.confidence_scores.empty()) {
      for (const auto &[_, conf] : mappings.confidence_scores) {
        avg_confidence += conf;
      }
      avg_confidence /= mappings.confidence_scores.size();
    }

    std::cout << "📈 Avg confidence: " << (avg_confidence * 100) << "%\n";
    std::cout << "✨ Deobfuscation complete!\n\n";
  }

  static size_t write_callback(void *contents, size_t size, size_t nmemb,
                               std::string *userp) {
    userp->append((char *)contents, size * nmemb);
    return size * nmemb;
  }
};

// ============================================================================
// Main Entry Point
// ============================================================================

int main(int argc, char *argv[]) {
  if (argc < 4) {
    std::cout << "\n";
    std::cout
        << "╔════════════════════════════════════════════════════════════╗\n";
    std::cout
        << "║   Universal AI Deobfuscator v3.1 - Source + Bytecode      ║\n";
    std::cout
        << "╚════════════════════════════════════════════════════════════╝\n";
    std::cout << "\n";
    std::cout << "Usage:\n";
    std::cout << "  " << argv[0]
              << " <input> <output> <api_key> [calls] [restructure] [model] "
                 "[hybrid]\n";
    std::cout << "\n";
    std::cout << "Input Types:\n";
    std::cout << "  • Directory with .java files (decompiled source)\n";
    std::cout << "  • .jar file (bytecode)\n";
    std::cout << "\n";
    std::cout << "Arguments:\n";
    std::cout << "  input        - Source directory OR .jar file\n";
    std::cout << "  output       - Output directory\n";
    std::cout << "  api_key      - Anthropic API key\n";
    std::cout << "  calls        - Max API calls (default: 100)\n";
    std::cout << "  restructure  - Restructure (1/0, default: 1)\n";
    std::cout << "  model        - 'sonnet' or 'haiku' (default: sonnet)\n";
    std::cout << "  hybrid       - Hybrid mode (1/0, default: 0)\n";
    std::cout << "\n";
    std::cout << "Examples:\n";
    std::cout << "  # JAR bytecode (recommended)\n";
    std::cout << "  " << argv[0]
              << " vape.jar ./output sk-ant-xxx 100 1 sonnet 0\n";
    std::cout << "\n";
    return 1;
  }

  try {
    std::string input = argv[1];
    std::string output = argv[2];
    std::string api_key = argv[3];
    int max_calls = (argc > 4) ? std::atoi(argv[4]) : 100;
    bool restructure = (argc > 5) ? (std::atoi(argv[5]) != 0) : true;
    std::string model = (argc > 6) ? argv[6] : "sonnet";
    bool hybrid = (argc > 7) ? (std::atoi(argv[7]) != 0) : false;

    UniversalAIDeobfuscator deobf(api_key, input, output, max_calls,
                                  restructure, model, hybrid);
    deobf.run();

  } catch (const std::exception &e) {
    std::cerr << "❌ Error: " << e.what() << "\n";
    return 1;
  }

  return 0;
}
