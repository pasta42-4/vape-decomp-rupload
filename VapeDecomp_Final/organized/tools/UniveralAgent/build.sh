#!/bin/bash

# Universal Agent Builder
# Builds a Java agent that can inject any JAR into a running JVM

echo "╔════════════════════════════════════════════════╗"
echo "║   Universal Agent Builder                      ║"
echo "╚════════════════════════════════════════════════╝"
echo ""

# Check if Java is available
if ! command -v javac &> /dev/null; then
    echo "❌ Error: javac not found. Please install JDK."
    exit 1
fi

if ! command -v jar &> /dev/null; then
    echo "❌ Error: jar not found. Please install JDK."
    exit 1
fi

echo "[1/4] Compiling UniversalAgent.java..."
javac UniversalAgent.java

if [ $? -ne 0 ]; then
    echo "❌ Compilation failed!"
    exit 1
fi
echo "✅ Compiled successfully"
echo ""

echo "[2/4] Creating manifest file..."
cat > manifest.txt << 'EOF'
Manifest-Version: 1.0
Agent-Class: UniversalAgent
Premain-Class: UniversalAgent
Can-Redefine-Classes: true
Can-Retransform-Classes: true
Can-Set-Native-Method-Prefix: true
EOF

echo "✅ Manifest created"
echo ""

echo "[3/4] Creating agent.jar..."
jar cvfm agent.jar manifest.txt UniversalAgent*.class

if [ $? -ne 0 ]; then
    echo "❌ JAR creation failed!"
    exit 1
fi
echo "✅ agent.jar created"
echo ""

echo "[4/4] Checking for target JAR..."
if [ -f "target.jar" ]; then
    echo "📦 Found target.jar - embedding it..."
    jar uf agent.jar target.jar
    echo "✅ Embedded target.jar into agent.jar"
elif [ -f "VapeDecomp.jar" ]; then
    echo "📦 Found VapeDecomp.jar - embedding it..."
    cp VapeDecomp.jar target.jar
    jar uf agent.jar target.jar
    echo "✅ Embedded VapeDecomp.jar as target.jar"
else
    echo "⚠️  No target.jar or VapeDecomp.jar found"
    echo "   The agent will look for external JARs at runtime"
fi
echo ""

echo "════════════════════════════════════════════════"
echo "✨ BUILD COMPLETE!"
echo "════════════════════════════════════════════════"
echo ""
echo "📦 Output: agent.jar"
echo ""
echo "Usage Options:"
echo ""
echo "Option 1 - With embedded JAR (recommended):"
echo "  1. Place your JAR as 'target.jar' in this directory"
echo "  2. Run: jar uf agent.jar target.jar"
echo "  3. Inject agent.jar using your injector"
echo ""
echo "Option 2 - External JAR:"
echo "  1. Place agent.jar and your target JAR in same folder"
echo "  2. Inject agent.jar (it will auto-find your JAR)"
echo ""
echo "Option 3 - Command line test:"
echo "  java -javaagent:agent.jar -jar MinecraftClient.jar"
echo ""

# Cleanup
rm -f manifest.txt
rm -f UniversalAgent*.class

echo "🧹 Cleaned up temporary files"
echo ""
