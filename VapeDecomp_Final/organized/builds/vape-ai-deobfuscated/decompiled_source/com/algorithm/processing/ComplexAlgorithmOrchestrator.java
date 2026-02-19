/*
 * Decompiled with CFR 0.152.
 */
package com.algorithm.processing;

import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;

public class ComplexAlgorithmOrchestrator {
    byte[] I;

    public void c(int n, int n2) {
    }

    public int q(int n, int n2, int n3, boolean bl) {
        for (int i = 0; i < n3; ++i) {
            n = this.Z(i, n);
        }
        return n;
    }

    public void J() {
        int n = ConfigurationManager2137.M(this.I, 0);
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            int n3 = ConfigurationManager2137.M(this.I, n2);
            int n4 = ConfigurationManager2137.M(this.I, n2 + 2);
            n2 = this.R(n2 + 4, n3, n4);
            int n5 = ConfigurationManager2137.M(this.I, n2);
            n2 = this.l(n2 + 2, n3, n5);
        }
    }

    public void G(int n, byte by) {
    }

    public ComplexAlgorithmOrchestrator(StackMapDescriptor stackMapDescriptor) {
        this.I = stackMapDescriptor.p();
    }

    int Z(int n, int n2) {
        byte by = this.I[n2];
        if (by == 7) {
            int n3 = ConfigurationManager2137.M(this.I, n2 + 1);
            this.c(n2, n3);
            n2 += 3;
        } else if (by == 8) {
            int n4 = ConfigurationManager2137.M(this.I, n2 + 1);
            this.H(n2, n4);
            n2 += 3;
        } else {
            this.G(n2, by);
            ++n2;
        }
        return n2;
    }

    public void H(int n, int n2) {
    }

    public int R(int n, int n2, int n3) {
        return this.q(n, n2, n3, true);
    }

    public int l(int n, int n2, int n3) {
        return this.q(n, n2, n3, false);
    }
}

