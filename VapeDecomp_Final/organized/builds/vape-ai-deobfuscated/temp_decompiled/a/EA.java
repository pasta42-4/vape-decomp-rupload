/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.X4;
import a.xi;

class ea {
    private boolean m;
    private float t;
    private X4 Q = null;
    private xi c;
    private boolean R;

    public float z() {
        return this.t;
    }

    static float f(ea ea2) {
        return ea2.t;
    }

    public void i(double d2, double d3, double d4, double d5) {
        try {
            if (this.Q == null) {
                this.Q = new X4(d2, d3, d4, d5);
            }
        }
        catch (O_ o_2) {
            throw ea.a(o_2);
        }
        this.Q.U(d2);
        this.Q.c(d3);
        this.Q.q(d4);
        this.Q.o(d5);
    }

    static boolean l(ea ea2) {
        return ea2.R;
    }

    public void d(boolean bl2) {
        this.m = bl2;
    }

    static X4 i(ea ea2, X4 x42) {
        ea2.Q = x42;
        return ea2.Q;
    }

    public boolean K() {
        return this.m;
    }

    static float a(ea ea2, float f10) {
        ea2.t = f10;
        return ea2.t;
    }

    static boolean V(ea ea2) {
        return ea2.m;
    }

    public void L(boolean bl2) {
        this.R = bl2;
    }

    public ea(xi xi2) {
        this.c = xi2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void H(float f10) {
        this.t = f10;
    }

    static X4 n(ea ea2) {
        return ea2.Q;
    }
}

