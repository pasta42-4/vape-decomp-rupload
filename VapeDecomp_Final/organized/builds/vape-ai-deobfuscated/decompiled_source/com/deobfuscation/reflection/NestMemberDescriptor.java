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

public class NestMemberDescriptor
extends ClassMetadataExtractor654 {
    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        byte[] byArray = this.p();
        byte[] byArray2 = new byte[byArray.length];
        BytecodeAnalyzer bytecodeAnalyzer2 = this.K();
        int n = ConfigurationManager2137.M(byArray, 0);
        ConfigurationManager2137.e(n, byArray2, 0);
        int n2 = 0;
        int n3 = 2;
        while (n2 < n) {
            int n4 = ConfigurationManager2137.M(byArray, n3);
            int n5 = bytecodeAnalyzer2.X(n4, bytecodeAnalyzer, map);
            ConfigurationManager2137.e(n5, byArray2, n3);
            ++n2;
            n3 += 2;
        }
        return new NestMemberDescriptor(bytecodeAnalyzer, byArray2);
    }

    private NestMemberDescriptor(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "NestMembers", byArray);
    }

    NestMemberDescriptor(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

