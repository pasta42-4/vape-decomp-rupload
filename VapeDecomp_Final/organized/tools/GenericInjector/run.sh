#!/usr/bin/env bash

set -euo pipefail

# --------------------------------------
# GenericInjector Run Script (fixed)
# --------------------------------------

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SRC_DIR="$SCRIPT_DIR/src"
OUT_DIR="$SCRIPT_DIR/out"

MAIN_CLASS="com.vape.injector.EnhancedInjector"


# Colors
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
NC='\033[0m'

echo -e "${CYAN}[*] GenericInjector${NC}"

# Check Java
if ! command -v javac >/dev/null || ! command -v java >/dev/null; then
    echo -e "${RED}[!] Java (JDK 11+) is required${NC}"
    exit 1
fi

# Clean & recreate output dir
rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"

# Find Java sources
JAVA_FILES=$(find "$SRC_DIR" -maxdepth 1 -name "*.java")

if [ -z "$JAVA_FILES" ]; then
    echo -e "${RED}[!] No Java source files found in src/${NC}"
    exit 1
fi

# Compile
echo -e "${CYAN}[*] Compiling...${NC}"
javac \
    --add-modules jdk.attach \
    -d "$OUT_DIR" \
    $JAVA_FILES

echo -e "${GREEN}[+] Compilation successful${NC}"

# Run
echo -e "${CYAN}[*] Running...${NC}"
echo ""
java \
    --add-modules jdk.attach \
    -cp "$OUT_DIR" \
    "$MAIN_CLASS" "$@"
