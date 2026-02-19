/*
 * Decompiled with CFR 0.152.
 */
package com.document.processing;

import com.algorithm.processing.ComplexAlgorithmOrchestrator;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;
import java.util.Map;

class DocumentProcessingHandler
extends ComplexAlgorithmOrchestrator {
    BytecodeAnalyzer S;
    Map<String, String> o;
    byte[] M;
    BytecodeAnalyzer q;

    @Override
    public void H(int n, int n2) {
        this.M[n] = 8;
        ConfigurationManager2137.e(n2, this.M, n + 1);
    }

    @Override
    public int R(int n, int n2, int n3) {
        ConfigurationManager2137.e(n2, this.M, n - 4);
        return super.R(n, n2, n3);
    }

    @Override
    public int q(int n, int n2, int n3, boolean bl) {
        ConfigurationManager2137.e(n3, this.M, n - 2);
        return super.q(n, n2, n3, bl);
    }

    public StackMapDescriptor h() {
        return new StackMapDescriptor(this.S, this.M);
    }

    DocumentProcessingHandler(StackMapDescriptor stackMapDescriptor, BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        super(stackMapDescriptor);
        this.q = stackMapDescriptor.K();
        this.M = new byte[this.I.length];
        this.S = bytecodeAnalyzer;
        this.o = map;
    }

    @Override
    public void G(int n, byte by) {
        this.M[n] = by;
    }

    @Override
    public void c(int n, int n2) {
        this.M[n] = 7;
        int n3 = this.q.X(n2, this.S, this.o);
        ConfigurationManager2137.e(n3, this.M, n + 1);
    }

    @Override
    public void J() {
        int n = ConfigurationManager2137.M(this.I, 0);
        ConfigurationManager2137.e(n, this.M, 0);
        super.J();
    }
}

