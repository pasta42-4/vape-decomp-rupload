/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.processing;

import com.app.config.ConfigurationManager1786;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.cache.management.CacheConsistencyManager;
import com.data.streaming.StreamTransformationAgent;
import com.networking.exception.NetworkConfigurationException;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.resource.management.ResourceAllocationStrategy;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

public class BytecodeExceptionHandler
extends ClassMetadataExtractor654 {
    void X(int n, int n2, boolean bl) throws BytecodeProcessingException {
        new StreamTransformationAgent(this, n, n2).c();
        new ResourceAllocationStrategy(this, n, n2, bl).s();
    }

    void f(DataOutputStream dataOutputStream) throws IOException {
        super.f(dataOutputStream);
    }

    BytecodeExceptionHandler(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) throws NetworkConfigurationException {
        try {
            return new BytecodeExceptionHandler(bytecodeAnalyzer, new ConfigurationManager1786(this.D, this.b, bytecodeAnalyzer, map).b());
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new NetworkConfigurationException("bad bytecode. fatal?");
        }
    }

    void n(int n, int n2) throws BytecodeProcessingException {
        new CacheConsistencyManager(this, n, n2).s();
    }

    BytecodeExceptionHandler(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "StackMapTable", byArray);
    }
}

