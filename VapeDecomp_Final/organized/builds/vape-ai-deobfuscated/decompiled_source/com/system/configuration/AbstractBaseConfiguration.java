/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import com.app.validation.input.InputValidator;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.network.io.NetworkStreamWriter;
import com.reflection.metadata.ReflectionMetadataResolver933;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

class AbstractBaseConfiguration
extends InputValidator {
    Map<String, String> V;
    BytecodeAnalyzer A;
    NetworkStreamWriter t;
    ByteArrayOutputStream d = new ByteArrayOutputStream();
    BytecodeAnalyzer z;

    void M(int n, int n2) throws Exception {
        this.t.s(n, this.s(n2));
        super.M(n, n2);
    }

    AbstractBaseConfiguration(byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map, boolean bl) {
        super(byArray);
        if (bl) {
            this.t = new NetworkStreamWriter(this.d, bytecodeAnalyzer2);
        }
        this.z = bytecodeAnalyzer;
        this.A = bytecodeAnalyzer2;
        this.V = map;
    }

    byte[] S() throws IOException {
        this.t.N();
        return this.d.toByteArray();
    }

    int t(int n, int n2) throws Exception {
        this.t.v(this.s(n2));
        return super.t(n, n2);
    }

    void L(int n, int n2) throws Exception {
        this.t.z(n);
        super.L(n, n2);
    }

    void R(int n, int n2, int n3) throws Exception {
        this.t.X(this.R(n2), this.s(n3));
        super.R(n, n2, n3);
    }

    int m(int n, int n2) throws Exception {
        this.t.c(n2);
        return super.m(n, n2);
    }

    int j(int n, int n2) throws Exception {
        this.t.U(n2);
        return super.j(n, n2);
    }

    int N(int n, int n2, int n3) throws Exception {
        this.t.P(this.R(n2), n3);
        return super.N(n, n2, n3);
    }

    AbstractBaseConfiguration(byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        this(byArray, bytecodeAnalyzer, bytecodeAnalyzer2, map, true);
    }

    int s(int n) {
        return this.z.X(n, this.A, this.V);
    }

    int R(int n) {
        String string = this.z.Z(n);
        String string2 = ReflectionMetadataResolver933.z(string, this.V);
        return this.A.D(string2);
    }

    void d(int n, int n2) throws Exception {
        this.t.Z(this.R(n2));
        super.d(n, n2);
    }

    int W(int n) throws Exception {
        this.t.R();
        return super.W(n);
    }
}

