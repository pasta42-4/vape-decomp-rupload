# Vape V4 Client Decompilation Guide

**Author:** LinkNavi 
**Date:** January 26, 2026  
**Target:** Vape V4 Minecraft Client  
**Goal:** Extract and decompile the encrypted client JAR from the launcher

---

## Overview

Vape V4's client is not distributed as a regular JAR file. Instead, the launcher (`Vape.exe`) contains an encrypted/packed version of the client that is decrypted at runtime in memory. This document details the complete process of extracting and decompiling it.

---

## Tools Used

- **radare2 (r2)** - Binary analysis
- **Wine** - Running Windows executables on Linux
- **gdb** - Debugging and memory dumping
- **foremost** - File carving from memory dumps
- **CFR 0.152** - Java decompiler
- **Python 3** - Automation scripts
- **binwalk** - Binary analysis
- **7-Zip** - Archive extraction

---

## Phase 1: Initial Analysis

### 1.1 Identifying the Launcher
```bash
$ file vape_client.jar
vape_client.jar: PE32+ executable for MS Windows (x86-64)
```

The "JAR" is actually a Windows PE executable (the launcher).

### 1.2 Attempting Direct Download

First attempt was to download the client directly from the update server:
```bash
$ curl -L -o vape.jar \
  -H "User-Agent: Vape4/Launcher" \
  -H "Cookie: sessionKey=..." \
  "https://www.vape.gg/update.php?edition=V4"
```

**Result:** This only returned the launcher executable, not the client JAR.

---

## Phase 2: Binary Analysis with Radare2

### 2.1 Finding Crypto Functions
```bash
$ r2 vape_client.jar
[0x140282888]> aaa  # Analyze all
[0x140282888]> afl | grep -i crypt
```

**Key Finding:** The launcher uses CryptoPP library with AES CBC encryption:
- `CipherModeFinalTemplate_ExternalCipher_class_CryptoPP::CBC_Decryption`
- `BlockCipherFinal_0__class_CryptoPP::Rijndael::Enc`

### 2.2 Locating Encrypted Data
```bash
[0x140282888]> iS  # List sections
```

**Key Finding:** The `.vlizer` section contains 7.6MB of encrypted data:
- File offset: `0x44b200`
- Size: `0x73bd1a` (7,585,050 bytes)
- Permissions: `-rwx` (executable, suspicious for data)

### 2.3 Searching for JAR Signature
```bash
[0x140282888]> /x 504b0304  # Search for PK\x03\x04 (ZIP header)
0x14015e33b hit0_0 504b0304
```

**Critical Discovery:** Found a JAR signature at virtual address `0x14015e33b`, but it's at the wrong location and likely a reference, not the actual encrypted JAR.

---

## Phase 3: Runtime Extraction

Since the JAR is encrypted on disk and only decrypted in memory, we need to capture it during execution.

### 3.1 Running with Monitoring

Terminal 1 - Monitor file creation:
```bash
$ inotifywait -m -r ~/.wine/drive_c/users/$USER/AppData/ /tmp/ 2>/dev/null | grep -i jar
```

Terminal 2 - Run launcher:
```bash
$ wine Vape.exe
```

**Result:** The launcher crashed before writing any JAR files to disk. The decrypted JAR stays in memory only.

### 3.2 Memory Dump with GDB
```bash
$ gdb --args wine Vape.exe
(gdb) run
# Wait for crash
(gdb) generate-core-file vape.core
(gdb) quit
```

**Success:** Generated a core dump containing the process memory at crash time.

---

## Phase 4: Extracting JAR from Memory

### 4.1 File Carving with Foremost
```bash
$ foremost -t zip -i vape.core -o carved_jars/
Processing: vape.core
|****|
```

**Result:** Foremost extracted multiple ZIP archives from the memory dump.

### 4.2 Identifying the Client JAR
```bash
$ ls -lh carved_jars/zip/
00276418.zip
00312002.zip
00381506.zip

$ unzip -l carved_jars/zip/00276418.zip | head -20
Archive:  carved_jars/zip/00276418.zip
  Length      Date    Time    Name
---------  ---------- -----   ----
      376  2026-01-26 03:23   resources/textures/like active@2x.png
      538  2026-01-26 03:23   a/NG.class
     8451  2026-01-26 03:23   a/Ht.class
```

**Key Indicators:**
- Contains `a/*.class` files (obfuscated Java classes)
- Has `resources/textures/` with Vape-specific assets
- Contains `mappings.txt` (deobfuscation mappings)

### 4.3 Verification
```bash
$ unzip -l carved_jars/zip/00276418.zip | grep -i vape
      343  2026-01-26 03:23   resources/textures/vape_online.png
     2766  2026-01-26 03:23   resources/textures/vapelogo.png
     1352  2026-01-26 03:23   resources/textures/vapelogosmall.png
```

**Confirmed:** This is the Vape V4 client JAR!

---

## Phase 5: Decompilation

### 5.1 Decompiling with CFR
```bash
$ wget https://github.com/leibnitz27/cfr/releases/download/0.152/cfr-0.152.jar
$ java -jar cfr-0.152.jar vape_client_final.jar --outputdir src/
```

**Result:** Successfully decompiled 3,036 obfuscated classes into readable Java source.

### 5.2 Understanding the Obfuscation

Classes are heavily obfuscated:
- Package: `a`
- Class names: `NG`, `Ht`, `IU`, `J6`, etc. (random 2-character names)
- No meaningful variable names

Example obfuscated code:
```java
package a;

class NG implements Bj {
    final B1 T;
    
    @Override
    public BE h() {
        return this.T;
    }
}
```

### 5.3 Deobfuscation with Mappings

The extracted JAR contained `mappings.txt` with 26,769 base64-encoded strings:
```
94:IFo6IA==
95:Z2V0VHlwZQ==
96:aXNFbXB0eQ==
```

Decoding these:
```bash
$ echo "Z2V0VHlwZQ==" | base64 -d
getType

$ echo "aXNFbXB0eQ==" | base64 -d
isEmpty
```

**Decoded all mappings:**
```python
import base64

mappings = {}
with open("mappings.txt", "r") as f:
    for line in f:
        num, encoded = line.strip().split(':', 1)
        decoded = base64.b64decode(encoded).decode('utf-8')
        mappings[num] = decoded
```

---

## Phase 6: Analysis & Organization

### 6.1 Key Findings

**Authentication System:**
- Uses Microsoft Xbox Live OAuth flow
- Endpoints:
  - `https://user.auth.xboxlive.com/user/authenticate`
  - `https://xsts.auth.xboxlive.com/xsts/authorize`
  - `https://api.minecraftservices.com/authentication/login_with_xbox`

**Vape Backend:**
- Server: `https://online.vape.gg`
- Protocol: Netty-based (NioSocketChannel)
- Auth states: `AUTHENTICATED`, `UNAUTHENTICATED`

**Key Classes:**
- `Ho.java` - Authentication handler
- `el.java` - Xbox Live OAuth implementation
- `I_.java` - Netty connection manager
- `_b.java` - Vape.gg API client

### 6.2 Automated Organization

Created Python script to:
1. Decode all mappings
2. Categorize classes by functionality (auth, network, gui, game, api)
3. Extract URLs, packet types, and entry points

**Results:**
- 9 auth classes
- 63 network classes
- 60 GUI classes
- 1,548 game-related classes
- 36 packet types identified

---

## Technical Details

### Why the JAR is Encrypted

1. **Anti-piracy:** Prevents casual extraction and redistribution
2. **Anti-reverse engineering:** Makes analysis more difficult
3. **License enforcement:** Client can only run through authenticated launcher

### Encryption Method

The `.vlizer` section contains the encrypted client, decrypted at runtime using:
- **Algorithm:** AES-CBC (CryptoPP library)
- **Key storage:** Embedded in launcher executable
- **Decryption:** Happens in memory before execution

### Why Memory Dumping Works

The launcher must decrypt the JAR into memory to execute it. By dumping memory after decryption but before the crash, we capture:
- Fully decrypted JAR file
- Loaded Java classes
- Runtime resources

---

## Challenges Encountered

1. **Session authentication fails:** The network endpoints require valid session cookies that expire
2. **Launcher crashes on Linux:** Missing Windows-specific libraries cause crashes
3. **Encrypted storage:** The JAR is not stored as a regular file on disk
4. **No direct download:** Update server only serves the launcher, not the client
5. **Heavy obfuscation:** All class and method names are randomized

---

## Summary

**Complete extraction process:**
```
1. Analyze launcher binary (radare2)
   ↓
2. Identify encrypted .vlizer section
   ↓
3. Run launcher with Wine
   ↓
4. Dump memory at crash (gdb)
   ↓
5. Carve JAR from memory dump (foremost)
   ↓
6. Decompile JAR (CFR)
   ↓
7. Decode mappings (base64)
   ↓
8. Organize and analyze code
```

**Total time:** ~2 hours  
**Lines of decompiled code:** ~150,000+  
**Success rate:** 100%

---

## Files Produced
```
vape_client_final.jar          # Extracted client JAR
src/a/*.java                   # 3,036 decompiled classes
mappings_decoded.txt           # 26,769 decoded mappings
organized_src/                 # Categorized source code
  ├── auth/                    # Authentication classes
  ├── network/                 # Networking & packets
  ├── gui/                     # User interface
  ├── game/                    # Game integration
  └── api/                     # Vape.gg API
analysis.txt                   # Automated analysis report
VapeLinux/                     # Maven project structure
```

---

## Next Steps

1. **Fix compilation errors** - Resolve missing dependencies
2. **Bypass authentication** - Remove online checks for offline use
3. **Linux compatibility** - Replace Windows-specific code with cross-platform alternatives
4. **Create custom client** - Build own implementation using reverse-engineered protocol
5. **Documentation** - Document the network protocol and cheat mechanisms

---

## Legal Notice

This document is for educational purposes only. Reverse engineering should only be performed on software you own or have explicit permission to analyze. Using this information to bypass security measures or violate terms of service may be illegal in your jurisdiction.

---

## References

- Radare2 Documentation: https://book.rada.re/
- CFR Java Decompiler: https://github.com/leibnitz27/cfr
- Netty Framework: https://netty.io/
- CryptoPP Library: https://www.cryptopp.com/

---

**End of Document**
