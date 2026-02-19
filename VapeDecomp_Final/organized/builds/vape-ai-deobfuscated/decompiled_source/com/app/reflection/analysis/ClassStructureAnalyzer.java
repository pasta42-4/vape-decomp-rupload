/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection.analysis;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ClassStructureAnalyzer
extends ClassMetadataExtractor654 {
    public int S(int n) {
        return ConfigurationManager2137.M(this.p(), n * 8 + 2);
    }

    public int Q(int n) {
        return ConfigurationManager2137.M(this.p(), n * 8 + 4);
    }

    public String r(int n) {
        int n2 = this.S(n);
        try {
            if (n2 == 0) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassStructureAnalyzer.a(customSystemException);
        }
        return this.D.u(n2);
    }

    public String H(int n) {
        int n2 = this.Q(n);
        try {
            if (n2 == 0) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassStructureAnalyzer.a(customSystemException);
        }
        return this.D.u(n2);
    }

    public int H() {
        return ConfigurationManager2137.M(this.p(), 0);
    }

    ClassStructureAnalyzer(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    public int q(int n) {
        return ConfigurationManager2137.M(this.p(), n * 8 + 8);
    }

    private ClassStructureAnalyzer(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "InnerClasses", byArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        byte[] byArray = this.p();
        byte[] byArray2 = new byte[byArray.length];
        BytecodeAnalyzer bytecodeAnalyzer2 = this.K();
        ClassStructureAnalyzer classStructureAnalyzer = new ClassStructureAnalyzer(bytecodeAnalyzer, byArray2);
        int n = ConfigurationManager2137.M(byArray, 0);
        ConfigurationManager2137.e(n, byArray2, 0);
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            int n3 = ConfigurationManager2137.M(byArray, n2);
            int n4 = ConfigurationManager2137.M(byArray, n2 + 2);
            int n5 = ConfigurationManager2137.M(byArray, n2 + 4);
            int n6 = ConfigurationManager2137.M(byArray, n2 + 6);
            if (n3 != 0) {
                n3 = bytecodeAnalyzer2.X(n3, bytecodeAnalyzer, map);
            }
            ConfigurationManager2137.e(n3, byArray2, n2);
            if (n4 != 0) {
                n4 = bytecodeAnalyzer2.X(n4, bytecodeAnalyzer, map);
            }
            ConfigurationManager2137.e(n4, byArray2, n2 + 2);
            if (n5 != 0) {
                n5 = bytecodeAnalyzer2.X(n5, bytecodeAnalyzer, map);
            }
            ConfigurationManager2137.e(n5, byArray2, n2 + 4);
            ConfigurationManager2137.e(n6, byArray2, n2 + 6);
            n2 += 8;
        }
        return classStructureAnalyzer;
    }
}

