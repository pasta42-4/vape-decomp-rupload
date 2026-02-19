/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class DeprecatedResourceHandler
extends ClassMetadataExtractor654 {
    DeprecatedResourceHandler(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new DeprecatedResourceHandler(bytecodeAnalyzer);
    }

    public DeprecatedResourceHandler(BytecodeAnalyzer bytecodeAnalyzer) {
        super(bytecodeAnalyzer, "Deprecated", new byte[0]);
    }
}

