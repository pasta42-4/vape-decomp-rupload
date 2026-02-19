/*
 * Decompiled with CFR 0.152.
 */
package com.core.abstraction;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.core.exceptions.TypeValidationException;
import com.execution.core.ExecutionOrchestrator1430;
import java.util.Map;

class AbstractDataWrapper
extends TypeValidationException {
    BytecodeAnalyzer D;
    BytecodeAnalyzer i;
    Map<String, String> n;
    ExecutionOrchestrator1430 u;

    void Q(int n, int n2, int n3) throws Exception {
        this.u.h(n2, n3);
    }

    AbstractDataWrapper(byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map, ExecutionOrchestrator1430 executionOrchestrator1430) {
        super(byArray);
        this.i = bytecodeAnalyzer;
        this.D = bytecodeAnalyzer2;
        this.n = map;
        this.u = executionOrchestrator1430;
    }

    void m(int n, int n2) throws Exception {
        this.u.R(n2);
    }

    void H(int n, int n2, int n3, int n4, int n5) throws Exception {
        this.u.A(n3, n4, n5);
    }

    void j(int n, int n2) throws Exception {
        this.u.N(n2);
    }

    void S(int n, int n2) throws Exception {
        this.u.h(n2);
    }

    void B(int n, int n2) throws Exception {
        this.u.A(n2);
    }

    void f(int n, int n2, int n3, int n4) throws Exception {
        this.u.Z(n2, n3, n4);
    }

    void u(int n, int n2, int n3, int n4) throws Exception {
        this.u.b(n2, n3, n4);
    }

    void c(int n, int n2) throws Exception {
        this.u.W(n2);
    }

    void Y(int n, int n2, int n3) throws Exception {
        this.u.x(n2, n3);
    }

    int k(int n, int n2, int n3) throws Exception {
        this.u.e(n2, n3);
        return super.k(n, n2, n3);
    }

    int K(int n, int n2) throws Exception {
        this.u.x(n2);
        return super.K(n, n2);
    }

    void z(int n, int n2, int n3) throws Exception {
        this.u.m(n2, n3);
    }
}

