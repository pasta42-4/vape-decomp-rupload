/*
 * Decompiled with CFR 0.152.
 */
package com.network.io;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import java.io.IOException;
import java.io.OutputStream;

public class NetworkStreamWriter {
    private BytecodeAnalyzer y;
    protected OutputStream k;

    public void P(int n, int n2) throws IOException {
        this.w(n);
        this.w(n2);
    }

    public void z(int n) throws IOException {
        this.k.write(n);
    }

    public void v(int n) throws IOException {
        this.w(n);
    }

    public NetworkStreamWriter(OutputStream outputStream, BytecodeAnalyzer bytecodeAnalyzer) {
        this.k = outputStream;
        this.y = bytecodeAnalyzer;
    }

    public void s(int n, int n2) throws IOException {
        this.k.write(n);
        this.w(n2);
    }

    public void U(int n) throws IOException {
        this.w(n);
    }

    public void X(int n, int n2) throws IOException {
        this.k.write(101);
        this.w(n);
        this.w(n2);
    }

    public void c(int n) throws IOException {
        this.k.write(91);
        this.w(n);
    }

    public void R() throws IOException {
        this.k.write(64);
    }

    public void N() throws IOException {
        this.k.close();
    }

    protected void w(int n) throws IOException {
        byte[] byArray = new byte[2];
        ConfigurationManager2137.e(n, byArray, 0);
        this.k.write(byArray);
    }

    public void Z(int n) throws IOException {
        this.k.write(99);
        this.w(n);
    }
}

