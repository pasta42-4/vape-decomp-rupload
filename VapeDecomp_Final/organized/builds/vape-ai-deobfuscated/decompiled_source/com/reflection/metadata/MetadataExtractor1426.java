/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class MetadataExtractor1426
extends ClassMetadataExtractor654 {
    MetadataExtractor1426(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        int n = this.z();
        BytecodeAnalyzer bytecodeAnalyzer2 = this.K();
        String[] stringArray = new String[n];
        int[] nArray = new int[n];
        try {
            for (int i = 0; i < n; ++i) {
                stringArray[i] = bytecodeAnalyzer2.Z(this.W(i));
                nArray[i] = this.p(i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataExtractor1426.a(customSystemException);
        }
        return new MetadataExtractor1426(bytecodeAnalyzer, stringArray, nArray);
    }

    public int z() {
        return this.b[0] & 0xFF;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public MetadataExtractor1426(BytecodeAnalyzer bytecodeAnalyzer, String[] stringArray, int[] nArray) {
        super(bytecodeAnalyzer, "MethodParameters");
        byte[] byArray = new byte[stringArray.length * 4 + 1];
        byArray[0] = (byte)stringArray.length;
        try {
            for (int i = 0; i < stringArray.length; ++i) {
                ConfigurationManager2137.e(bytecodeAnalyzer.D(stringArray[i]), byArray, i * 4 + 1);
                ConfigurationManager2137.e(nArray[i], byArray, i * 4 + 3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataExtractor1426.a(customSystemException);
        }
        this.p(byArray);
    }

    public int W(int n) {
        return ConfigurationManager2137.M(this.b, n * 4 + 1);
    }

    public int p(int n) {
        return ConfigurationManager2137.M(this.b, n * 4 + 3);
    }
}

