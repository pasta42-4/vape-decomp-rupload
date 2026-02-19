/*
 * Decompiled with CFR 0.152.
 */
package com.app.validation.input;

import com.deobfuscation.configuration.ConfigurationManager2137;

class InputValidator {
    byte[] F;

    void M(int n, int n2) throws Exception {
    }

    void d(int n, int n2) throws Exception {
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    int W(int n) throws Exception {
        return this.m(n);
    }

    final void X() throws Exception {
        int n = this.F[0] & 0xFF;
        this.L(n, 1);
    }

    int N(int n, int n2, int n3) throws Exception {
        for (int i = 0; i < n3; ++i) {
            n = this.z(n);
        }
        return n;
    }

    InputValidator(byte[] byArray) {
        this.F = byArray;
    }

    final void K() throws Exception {
        this.Q(0);
    }

    final int z(int n) throws Exception {
        int n2 = ConfigurationManager2137.M(this.F, n);
        return this.t(n + 2, n2);
    }

    void L(int n, int n2) throws Exception {
        for (int i = 0; i < n; ++i) {
            n2 = this.Q(n2);
        }
    }

    final int m(int n) throws Exception {
        int n2 = ConfigurationManager2137.M(this.F, n);
        int n3 = ConfigurationManager2137.M(this.F, n + 2);
        return this.N(n + 4, n2, n3);
    }

    void R(int n, int n2, int n3) throws Exception {
    }

    final int L(int n) throws Exception {
        int n2 = this.F[n] & 0xFF;
        if (n2 == 101) {
            int n3 = ConfigurationManager2137.M(this.F, n + 1);
            int n4 = ConfigurationManager2137.M(this.F, n + 3);
            this.R(n, n3, n4);
            return n + 5;
        }
        if (n2 == 99) {
            int n5 = ConfigurationManager2137.M(this.F, n + 1);
            this.d(n, n5);
            return n + 3;
        }
        try {
            if (n2 == 64) {
                return this.W(n + 1);
            }
        }
        catch (Exception exception) {
            throw InputValidator.a(exception);
        }
        if (n2 == 91) {
            int n6 = ConfigurationManager2137.M(this.F, n + 1);
            return this.m(n + 3, n6);
        }
        int n7 = ConfigurationManager2137.M(this.F, n + 1);
        this.M(n2, n7);
        return n + 3;
    }

    final int Q(int n) throws Exception {
        int n2 = ConfigurationManager2137.M(this.F, n);
        return this.j(n + 2, n2);
    }

    int t(int n, int n2) throws Exception {
        return this.L(n);
    }

    int m(int n, int n2) throws Exception {
        for (int i = 0; i < n2; ++i) {
            n = this.L(n);
        }
        return n;
    }

    int j(int n, int n2) throws Exception {
        for (int i = 0; i < n2; ++i) {
            n = this.m(n);
        }
        return n;
    }
}

