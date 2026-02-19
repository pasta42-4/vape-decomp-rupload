#!/bin/bash

echo "╔════════════════════════════════════════════════════════════╗"
echo "║     Setting up AI Deobfuscator Tools                      ║"
echo "╚════════════════════════════════════════════════════════════╝"
echo ""

# Create tools directory
mkdir -p tools
cd tools

echo "📦 Downloading decompilers..."
echo ""

# Download CFR (primary decompiler for analysis)
if [ ! -f "cfr.jar" ]; then
    echo "⬇️  Downloading CFR..."
    wget -q --show-progress https://github.com/leibnitz27/cfr/releases/download/0.152/cfr-0.152.jar -O cfr.jar
    if [ $? -eq 0 ]; then
        echo "✅ CFR downloaded"
    else
        echo "❌ Failed to download CFR"
    fi
else
    echo "✅ CFR already exists"
fi

# Download Procyon (fallback + final readable output)
if [ ! -f "procyon.jar" ]; then
    echo "⬇️  Downloading Procyon..."
    wget -q --show-progress https://github.com/mstrobel/procyon/releases/download/v0.6.0/procyon-decompiler-0.6.0.jar -O procyon.jar
    if [ $? -eq 0 ]; then
        echo "✅ Procyon downloaded"
    else
        echo "❌ Failed to download Procyon"
    fi
else
    echo "✅ Procyon already exists"
fi

# Download Tiny Remapper (for bytecode renaming)
if [ ! -f "jar-remapper.jar" ]; then
    echo "⬇️  Downloading Tiny Remapper..."
    wget -q --show-progress https://github.com/FabricMC/tiny-remapper/releases/download/v0.8.11/tiny-remapper-0.8.11-fat.jar -O jar-remapper.jar
    if [ $? -eq 0 ]; then
        echo "✅ Tiny Remapper downloaded"
    else
        echo "❌ Failed to download Tiny Remapper"
    fi
else
    echo "✅ Tiny Remapper already exists"
fi

cd ..

echo ""
echo "╔════════════════════════════════════════════════════════════╗"
echo "║     Setup Complete!                                        ║"
echo "╚════════════════════════════════════════════════════════════╝"
echo ""
echo "📋 Installed tools:"
ls -lh tools/*.jar 2>/dev/null | awk '{print "   •", $9, "(" $5 ")"}'
echo ""
echo "✨ You can now run: ./run_deobf.sh"
