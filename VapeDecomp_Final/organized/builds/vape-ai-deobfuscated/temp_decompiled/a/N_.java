/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.zY;

abstract class N_ {
    final String V;
    final long g;
    final String k;
    final int c;
    final String i;
    int K;
    final int Z;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    N_(int n2, int n3, String string, String string2, String string3, long l10) {
        this.Z = n2;
        this.c = n3;
        this.k = string;
        this.V = string2;
        this.i = string3;
        this.g = l10;
    }

    int d() {
        try {
            if (this.K == 0) {
                this.K = zY.m(this.i);
            }
        }
        catch (O_ o_2) {
            throw N_.a(o_2);
        }
        return this.K;
    }
}

