/*
 * Decompiled with CFR 0.152.
 */
package com.app.diagnostics;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ExceptionLogger
extends ClassMetadataExtractor654 {
    private ExceptionLogger(BytecodeAnalyzer bytecodeAnalyzer, ExceptionLogger exceptionLogger, Map<String, String> map) {
        super(bytecodeAnalyzer, "Exceptions");
        this.k(exceptionLogger, map);
    }

    private void k(ExceptionLogger exceptionLogger, Map<String, String> map) {
        BytecodeAnalyzer bytecodeAnalyzer = exceptionLogger.D;
        BytecodeAnalyzer bytecodeAnalyzer2 = this.D;
        byte[] byArray = exceptionLogger.b;
        int n = byArray.length;
        byte[] byArray2 = new byte[n];
        byArray2[0] = byArray[0];
        byArray2[1] = byArray[1];
        for (int i = 2; i < n; i += 2) {
            int n2 = ConfigurationManager2137.M(byArray, i);
            ConfigurationManager2137.e(bytecodeAnalyzer.X(n2, bytecodeAnalyzer2, map), byArray2, i);
        }
        this.b = byArray2;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new ExceptionLogger(bytecodeAnalyzer, this, map);
    }

    ExceptionLogger(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

