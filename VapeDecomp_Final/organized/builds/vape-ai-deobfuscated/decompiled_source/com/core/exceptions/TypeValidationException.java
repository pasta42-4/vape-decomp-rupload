/*
 * Decompiled with CFR 0.152.
 */
package com.core.exceptions;

import com.deobfuscation.configuration.ConfigurationManager2137;

class TypeValidationException {
    byte[] w;

    void S(int n, int n2) throws Exception {
    }

    void B(int n, int n2) throws Exception {
    }

    void u(int n, int n2, int n3, int n4) throws Exception {
    }

    int K(int n, int n2) throws Exception {
        for (int i = 0; i < n2; ++i) {
            int n3 = this.w[n] & 0xFF;
            int n4 = this.w[n + 1] & 0xFF;
            this.Y(n, n3, n4);
            n += 2;
        }
        return n;
    }

    void j(int n, int n2) throws Exception {
    }

    void Q(int n, int n2, int n3) throws Exception {
    }

    void z(int n, int n2, int n3) throws Exception {
    }

    TypeValidationException(byte[] byArray) {
        this.w = byArray;
    }

    void H(int n, int n2, int n3, int n4, int n5) throws Exception {
    }

    void Y(int n, int n2, int n3) throws Exception {
    }

    void m(int n, int n2) throws Exception {
    }

    void f(int n, int n2, int n3, int n4) throws Exception {
    }

    int k(int n, int n2, int n3) throws Exception {
        for (int i = 0; i < n3; ++i) {
            int n4 = ConfigurationManager2137.M(this.w, n);
            int n5 = ConfigurationManager2137.M(this.w, n + 2);
            int n6 = ConfigurationManager2137.M(this.w, n + 4);
            this.H(n, n2, n4, n5, n6);
            n += 6;
        }
        return n;
    }

    final int W(int n, int n2) throws Exception {
        switch (n2) {
            case 0: 
            case 1: {
                int n3 = this.w[n] & 0xFF;
                this.Q(n, n2, n3);
                return n + 1;
            }
            case 16: {
                int n4 = ConfigurationManager2137.M(this.w, n);
                this.S(n, n4);
                return n + 2;
            }
            case 17: 
            case 18: {
                int n5 = this.w[n] & 0xFF;
                int n6 = this.w[n + 1] & 0xFF;
                this.u(n, n2, n5, n6);
                return n + 2;
            }
            case 19: 
            case 20: 
            case 21: {
                this.c(n, n2);
                return n;
            }
            case 22: {
                int n7 = this.w[n] & 0xFF;
                this.j(n, n7);
                return n + 1;
            }
            case 23: {
                int n8 = ConfigurationManager2137.M(this.w, n);
                this.B(n, n8);
                return n + 2;
            }
            case 64: 
            case 65: {
                int n9 = ConfigurationManager2137.M(this.w, n);
                return this.k(n + 2, n2, n9);
            }
            case 66: {
                int n10 = ConfigurationManager2137.M(this.w, n);
                this.m(n, n10);
                return n + 2;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                int n11 = ConfigurationManager2137.M(this.w, n);
                this.z(n, n2, n11);
                return n + 2;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                int n12 = ConfigurationManager2137.M(this.w, n);
                int n13 = this.w[n + 2] & 0xFF;
                this.f(n, n2, n12, n13);
                return n + 3;
            }
        }
        throw new RuntimeException("invalid target type: " + n2);
    }

    final int L(int n) throws Exception {
        int n2 = this.w[n++] & 0xFF;
        return this.K(n, n2);
    }

    void c(int n, int n2) throws Exception {
    }
}

