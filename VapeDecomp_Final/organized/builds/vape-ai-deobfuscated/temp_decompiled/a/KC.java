/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.TF;

class kc {
    byte[] F;

    void M(int n2, int n3) throws Exception {
    }

    void d(int n2, int n3) throws Exception {
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    int W(int n2) throws Exception {
        return this.m(n2);
    }

    final void X() throws Exception {
        int n2 = this.F[0] & 0xFF;
        this.L(n2, 1);
    }

    int N(int n2, int n3, int n4) throws Exception {
        for (int i10 = 0; i10 < n4; ++i10) {
            n2 = this.z(n2);
        }
        return n2;
    }

    kc(byte[] byArray) {
        this.F = byArray;
    }

    final void K() throws Exception {
        this.Q(0);
    }

    final int z(int n2) throws Exception {
        int n3 = TF.M(this.F, n2);
        return this.t(n2 + 2, n3);
    }

    void L(int n2, int n3) throws Exception {
        for (int i10 = 0; i10 < n2; ++i10) {
            n3 = this.Q(n3);
        }
    }

    final int m(int n2) throws Exception {
        int n3 = TF.M(this.F, n2);
        int n4 = TF.M(this.F, n2 + 2);
        return this.N(n2 + 4, n3, n4);
    }

    void R(int n2, int n3, int n4) throws Exception {
    }

    final int L(int n2) throws Exception {
        int n3 = this.F[n2] & 0xFF;
        if (n3 == 101) {
            int n4 = TF.M(this.F, n2 + 1);
            int n5 = TF.M(this.F, n2 + 3);
            this.R(n2, n4, n5);
            return n2 + 5;
        }
        if (n3 == 99) {
            int n6 = TF.M(this.F, n2 + 1);
            this.d(n2, n6);
            return n2 + 3;
        }
        try {
            if (n3 == 64) {
                return this.W(n2 + 1);
            }
        }
        catch (Exception exception) {
            throw kc.a(exception);
        }
        if (n3 == 91) {
            int n7 = TF.M(this.F, n2 + 1);
            return this.m(n2 + 3, n7);
        }
        int n8 = TF.M(this.F, n2 + 1);
        this.M(n3, n8);
        return n2 + 3;
    }

    final int Q(int n2) throws Exception {
        int n3 = TF.M(this.F, n2);
        return this.j(n2 + 2, n3);
    }

    int t(int n2, int n3) throws Exception {
        return this.L(n2);
    }

    int m(int n2, int n3) throws Exception {
        for (int i10 = 0; i10 < n3; ++i10) {
            n2 = this.L(n2);
        }
        return n2;
    }

    int j(int n2, int n3) throws Exception {
        for (int i10 = 0; i10 < n3; ++i10) {
            n2 = this.m(n2);
        }
        return n2;
    }
}

