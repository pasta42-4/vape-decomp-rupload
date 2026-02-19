import java.lang.instrument.Instrumentation;
import java.io.*;
import java.net.*;
import java.util.jar.*;
import java.lang.reflect.*;

/**
 * Universal Java Agent Loader v2.0
 * Fixed for Java 9+ (URLClassLoader restrictions)
 * Better error handling and logging
 */
public class UniversalAgent {
    
    private static final String TARGET_JAR_NAME = "target.jar";
    private static PrintStream log = System.out;
    
    /**
     * Entry point for runtime agent attachment
     */
    public static void agentmain(String agentArgs, Instrumentation inst) {
        // Wrap everything in try-catch to prevent error 102
        try {
            printBanner();
            log("Agent attached successfully", true);
            log("Java Version: " + System.getProperty("java.version"), false);
            log("Arguments: " + (agentArgs != null ? agentArgs : "none"), false);
            
            // Get agent JAR location
            String agentPath = getAgentPath();
            if (agentPath == null) {
                log("ERROR: Cannot determine agent location", true);
                return;
            }
            
            File agentFile = new File(agentPath);
            log("Agent JAR: " + agentFile.getAbsolutePath(), false);
            
            if (!agentFile.exists()) {
                log("ERROR: Agent file not found!", true);
                return;
            }
            
            // Try to load embedded JAR
            File targetJar = extractEmbeddedJar(agentFile);
            
            // If no embedded JAR, look for external
            if (targetJar == null) {
                targetJar = findExternalJar(agentFile);
            }
            
            // Load the target
            if (targetJar != null) {
                loadJarReflective(targetJar, inst);
            } else {
                log("ERROR: No target JAR found!", true);
                log("  Place target.jar inside agent.jar", false);
                log("  Or place a JAR next to agent.jar", false);
            }
            
            printFooter();
            
        } catch (Throwable t) {
            // Catch everything to prevent error 102
            System.err.println("[FATAL] Agent failed: " + t.getClass().getName());
            System.err.println("[FATAL] Message: " + t.getMessage());
            t.printStackTrace();
        }
    }
    
    /**
     * Entry point for -javaagent flag
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        agentmain(agentArgs, inst);
    }
    
    /**
     * Get agent JAR path with multiple fallback methods
     */
    private static String getAgentPath() {
        try {
            // Method 1: Protection domain
            String path = UniversalAgent.class.getProtectionDomain()
                                              .getCodeSource()
                                              .getLocation()
                                              .getPath();
            path = URLDecoder.decode(path, "UTF-8");
            
            // Handle file:// URLs
            if (path.startsWith("file:/")) {
                path = path.substring(6);
            }
            if (path.startsWith("file:")) {
                path = path.substring(5);
            }
            
            // Windows fix: remove leading slash
            if (path.matches("^/[A-Za-z]:.*")) {
                path = path.substring(1);
            }
            
            return path;
            
        } catch (Exception e) {
            log("Warning: Failed to get agent path: " + e.getMessage(), false);
            
            // Method 2: Class resource
            try {
                URL url = UniversalAgent.class.getResource("UniversalAgent.class");
                if (url != null) {
                    String urlPath = url.toString();
                    if (urlPath.startsWith("jar:file:")) {
                        int end = urlPath.indexOf("!");
                        if (end > 0) {
                            String jarPath = urlPath.substring(9, end);
                            return URLDecoder.decode(jarPath, "UTF-8");
                        }
                    }
                }
            } catch (Exception e2) {
                // Ignore
            }
            
            return null;
        }
    }
    
    /**
     * Extract embedded target.jar
     */
    private static File extractEmbeddedJar(File agentFile) {
        log("Checking for embedded JAR: " + TARGET_JAR_NAME, false);
        
        JarFile agentJar = null;
        InputStream in = null;
        FileOutputStream out = null;
        
        try {
            agentJar = new JarFile(agentFile);
            JarEntry targetEntry = agentJar.getJarEntry(TARGET_JAR_NAME);
            
            if (targetEntry == null) {
                log("  No embedded JAR found", false);
                return null;
            }
            
            log("  Found embedded JAR! Size: " + targetEntry.getSize() + " bytes", true);
            
            // Create temp file
            File tempJar = File.createTempFile("injected_", ".jar");
            tempJar.deleteOnExit();
            
            // Extract with proper error handling
            in = agentJar.getInputStream(targetEntry);
            out = new FileOutputStream(tempJar);
            
            byte[] buffer = new byte[8192];
            int bytesRead;
            long totalBytes = 0;
            
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }
            
            log("  Extracted to: " + tempJar.getAbsolutePath(), false);
            log("  Verified size: " + totalBytes + " bytes", false);
            
            return tempJar;
            
        } catch (Exception e) {
            log("  Error extracting: " + e.getMessage(), false);
            return null;
        } finally {
            try { if (in != null) in.close(); } catch (Exception e) {}
            try { if (out != null) out.close(); } catch (Exception e) {}
            try { if (agentJar != null) agentJar.close(); } catch (Exception e) {}
        }
    }
    
    /**
     * Find external JAR next to agent
     */
    private static File findExternalJar(File agentFile) {
        log("Searching for external JARs...", false);
        
        File parentDir = agentFile.getParentFile();
        if (parentDir == null) {
            log("  Cannot determine parent directory", false);
            return null;
        }
        
        log("  Scanning: " + parentDir.getAbsolutePath(), false);
        
        File[] jars = parentDir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jar") && 
                       !name.equals(agentFile.getName());
            }
        });
        
        if (jars == null || jars.length == 0) {
            log("  No external JARs found", false);
            return null;
        }
        
        log("  Found " + jars.length + " JAR(s):", false);
        for (int i = 0; i < jars.length; i++) {
            log("    [" + (i+1) + "] " + jars[i].getName() + " (" + jars[i].length() + " bytes)", false);
        }
        
        File selected = jars[0];
        log("  Selected: " + selected.getName(), true);
        return selected;
    }
    
    /**
     * Load JAR using reflection (works on Java 9+)
     */
    private static void loadJarReflective(File jarFile, Instrumentation inst) {
        log("Loading JAR: " + jarFile.getName(), true);
        
        try {
            // Verify JAR is valid
            if (!jarFile.exists()) {
                log("  ERROR: JAR file doesn't exist!", true);
                return;
            }
            
            if (!jarFile.canRead()) {
                log("  ERROR: Cannot read JAR file!", true);
                return;
            }
            
            log("  JAR size: " + jarFile.length() + " bytes", false);
            
            // Method 1: Try instrumentation.appendToSystemClassLoaderSearch (Java 9+)
            boolean loadedViaInst = false;
            try {
                JarFile jar = new JarFile(jarFile);
                inst.appendToSystemClassLoaderSearch(jar);
                log("  Added via Instrumentation API", true);
                loadedViaInst = true;
            } catch (Exception e) {
                log("  Instrumentation method failed: " + e.getMessage(), false);
            }
            
            // Method 2: Try URLClassLoader reflection (Java 8)
            if (!loadedViaInst) {
                try {
                    ClassLoader sysLoader = ClassLoader.getSystemClassLoader();
                    Method addURL = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                    addURL.setAccessible(true);
                    addURL.invoke(sysLoader, jarFile.toURI().toURL());
                    log("  Added via URLClassLoader reflection", true);
                } catch (Exception e) {
                    log("  URLClassLoader method failed: " + e.getMessage(), false);
                    log("  ERROR: Could not add JAR to classpath!", true);
                    return;
                }
            }
            
            // Try to find and invoke Main-Class
            String mainClass = findMainClass(jarFile);
            
            if (mainClass != null) {
                log("  Main-Class: " + mainClass, true);
                
                // Wait a moment for classpath to update
                Thread.sleep(100);
                
                invokeMain(mainClass);
            } else {
                log("  No Main-Class in manifest", false);
                log("  JAR loaded but not started automatically", false);
                log("  Classes are available on classpath", true);
            }
            
            log("SUCCESS: Injection complete!", true);
            
        } catch (Exception e) {
            log("ERROR: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }
    
    /**
     * Find Main-Class from manifest
     */
    private static String findMainClass(File jarFile) {
        JarFile jar = null;
        try {
            jar = new JarFile(jarFile);
            Manifest manifest = jar.getManifest();
            
            if (manifest != null) {
                Attributes attrs = manifest.getMainAttributes();
                String mainClass = attrs.getValue("Main-Class");
                
                if (mainClass != null && !mainClass.trim().isEmpty()) {
                    return mainClass.trim();
                }
            }
        } catch (Exception e) {
            log("  Error reading manifest: " + e.getMessage(), false);
        } finally {
            try { if (jar != null) jar.close(); } catch (Exception e) {}
        }
        return null;
    }
    
    /**
     * Invoke main() method in separate thread
     */
    private static void invokeMain(final String className) {
        Thread mainThread = new Thread(new Runnable() {
            public void run() {
                try {
                    log("  Resolving class: " + className, false);
                    Class<?> mainClass = Class.forName(className);
                    
                    log("  Finding main() method...", false);
                    Method mainMethod = mainClass.getMethod("main", String[].class);
                    
                    log("  Invoking main()...", false);
                    mainMethod.invoke(null, (Object) new String[0]);
                    
                    log("  Main method completed", false);
                    
                } catch (ClassNotFoundException e) {
                    log("  ERROR: Main class not found: " + className, true);
                    log("  The JAR may not be properly loaded", false);
                } catch (NoSuchMethodException e) {
                    log("  ERROR: No main() method in: " + className, true);
                } catch (IllegalAccessException e) {
                    log("  ERROR: Cannot access main(): " + e.getMessage(), true);
                } catch (InvocationTargetException e) {
                    log("  ERROR: Exception in main():", true);
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        cause.printStackTrace();
                    } else {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    log("  ERROR: " + e.getMessage(), true);
                    e.printStackTrace();
                }
            }
        }, "InjectedMain");
        
        mainThread.setDaemon(false);
        mainThread.start();
        
        log("  Main thread started: " + mainThread.getName(), true);
    }
    
    /**
     * Print banner
     */
    private static void printBanner() {
        log.println();
        log.println("╔════════════════════════════════════════════════╗");
        log.println("║     Universal Java Agent Loader v2.0          ║");
        log.println("║     Fixed for Java 9+ & Error 102             ║");
        log.println("╚════════════════════════════════════════════════╝");
        log.println();
    }
    
    /**
     * Print footer
     */
    private static void printFooter() {
        log.println();
        log.println("════════════════════════════════════════════════");
        log.println();
    }
    
    /**
     * Styled logging
     */
    private static void log(String message, boolean important) {
        String prefix = important ? "[+]" : "[*]";
        log.println(prefix + " " + message);
    }
}
