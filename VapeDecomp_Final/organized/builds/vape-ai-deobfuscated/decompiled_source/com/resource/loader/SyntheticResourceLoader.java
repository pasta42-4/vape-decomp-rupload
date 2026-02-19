/*
 * Decompiled with CFR 0.152.
 */
package com.resource.loader;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class SyntheticResourceLoader
extends ClassMetadataExtractor654 {
    public SyntheticResourceLoader(BytecodeAnalyzer bytecodeAnalyzer) {
        super(bytecodeAnalyzer, "Synthetic", new byte[0]);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new SyntheticResourceLoader(bytecodeAnalyzer);
    }

    SyntheticResourceLoader(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

