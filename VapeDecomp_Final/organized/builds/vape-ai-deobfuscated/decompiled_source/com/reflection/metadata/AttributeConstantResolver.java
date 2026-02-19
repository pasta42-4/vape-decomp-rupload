/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class AttributeConstantResolver
extends ClassMetadataExtractor654 {
    AttributeConstantResolver(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        int n = this.K().X(this.X(), bytecodeAnalyzer, map);
        return new AttributeConstantResolver(bytecodeAnalyzer, n);
    }

    public AttributeConstantResolver(BytecodeAnalyzer bytecodeAnalyzer, int n) {
        super(bytecodeAnalyzer, "ConstantValue");
        byte[] byArray = new byte[]{(byte)(n >>> 8), (byte)n};
        this.p(byArray);
    }

    public int X() {
        return ConfigurationManager2137.M(this.p(), 0);
    }
}

