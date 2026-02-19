/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.reflection;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class NestHostResolver
extends ClassMetadataExtractor654 {
    private NestHostResolver(BytecodeAnalyzer bytecodeAnalyzer, int n) {
        super(bytecodeAnalyzer, "NestHost", new byte[2]);
        ConfigurationManager2137.e(n, this.p(), 0);
    }

    NestHostResolver(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        int n = ConfigurationManager2137.M(this.p(), 0);
        int n2 = this.K().X(n, bytecodeAnalyzer, map);
        return new NestHostResolver(bytecodeAnalyzer, n2);
    }
}

