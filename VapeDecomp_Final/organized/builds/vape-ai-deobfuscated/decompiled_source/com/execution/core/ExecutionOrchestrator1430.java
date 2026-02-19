/*
 * Decompiled with CFR 0.152.
 */
package com.execution.core;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.network.io.NetworkStreamWriter;
import java.io.IOException;
import java.io.OutputStream;

public class ExecutionOrchestrator1430
extends NetworkStreamWriter {
    public void e(int n, int n2) throws IOException {
        this.k.write(n);
        this.w(n2);
    }

    public void b(int n, int n2, int n3) throws IOException {
        this.k.write(n);
        this.k.write(n2);
        this.k.write(n3);
    }

    public void h(int n) throws IOException {
        this.k.write(16);
        this.w(n);
    }

    public void A(int n) throws IOException {
        this.k.write(23);
        this.w(n);
    }

    public void A(int n, int n2, int n3) throws IOException {
        this.w(n);
        this.w(n2);
        this.w(n3);
    }

    public void Z(int n, int n2, int n3) throws IOException {
        this.k.write(n);
        this.w(n2);
        this.k.write(n3);
    }

    public void N(int n) throws IOException {
        this.k.write(22);
        this.k.write(n);
    }

    public void m(int n, int n2) throws IOException {
        this.k.write(n);
        this.w(n2);
    }

    public void R(int n) throws IOException {
        this.k.write(66);
        this.w(n);
    }

    public void x(int n, int n2) throws IOException {
        this.k.write(n);
        this.k.write(n2);
    }

    public void x(int n) throws IOException {
        this.k.write(n);
    }

    public ExecutionOrchestrator1430(OutputStream outputStream, BytecodeAnalyzer bytecodeAnalyzer) {
        super(outputStream, bytecodeAnalyzer);
    }

    public void W(int n) throws IOException {
        this.k.write(n);
    }

    public void h(int n, int n2) throws IOException {
        this.k.write(n);
        this.k.write(n2);
    }

    @Override
    public void U(int n) throws IOException {
        super.U(n);
    }
}

