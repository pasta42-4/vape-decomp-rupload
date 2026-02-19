/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Na;
import a.O_;
import a.qx;
import a.t2;

public class te
extends Hc {
    public void G() {
        try {
            if (Na.MC_1_21_0.H()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw te.a(o_2);
        }
        qx.E(te.U.u().dy, this.H);
    }

    public static te g() {
        return new te(qx.S(te.U.u().dy));
    }

    public void n() {
        qx.z(te.U.u().dy, this.H);
    }

    public void p(int n2) {
        qx.R(te.U.u().dy, this.H, n2);
    }

    public te(Object object) {
        super(object);
    }

    public void x(int n2, int n3, int n4, int n5) {
        te.U.u().dy.m(this.H, n2, n3, n4, n5);
    }

    public t2 D() {
        return new t2(qx.d(te.U.u().dy, this.H));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void m(double d2, double d3, double d4, double d5, double d6) {
        qx.c(te.U.u().dy, this.H, d2, d3, d4, d5, d6);
    }

    public boolean F() {
        return te.U.u().dy.k(this.H);
    }

    public void L(double d2, double d3, double d4) {
        qx.E(te.U.u().dy, this.H, d2, d3, d4);
    }
}

