/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.bytecode.analysis.BytecodeAnalyzer;
import java.io.DataInputStream;
import java.io.IOException;

public class BytecodeMetadataExtractor2397
extends BytecodeMetadataExtractor {
    private BytecodeMetadataExtractor2397(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "LocalVariableTypeTable", byArray);
    }

    BytecodeMetadataExtractor2397(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    BytecodeMetadataExtractor f(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        return new BytecodeMetadataExtractor2397(bytecodeAnalyzer, byArray);
    }
}

