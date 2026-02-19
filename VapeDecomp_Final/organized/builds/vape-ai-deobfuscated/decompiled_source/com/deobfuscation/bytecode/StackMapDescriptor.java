/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.bytecode;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.data.compression.AdaptiveCompressionEngine1681;
import com.document.processing.DocumentProcessingHandler;
import com.memory.management.BufferAllocationTracker;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class StackMapDescriptor
extends ClassMetadataExtractor654 {
    void H(int n, int n2) throws BytecodeProcessingException {
        new BufferAllocationTracker(this, n, n2).J();
    }

    StackMapDescriptor(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        DocumentProcessingHandler documentProcessingHandler = new DocumentProcessingHandler(this, bytecodeAnalyzer, map);
        documentProcessingHandler.J();
        return documentProcessingHandler.h();
    }

    StackMapDescriptor(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "StackMap", byArray);
    }

    void k(int n, int n2, boolean bl) throws BytecodeProcessingException {
        new AdaptiveCompressionEngine1681(this, n, n2, bl).J();
    }
}

