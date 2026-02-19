/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DV;
import a.Hc;
import a.O_;

public class Df
extends Hc {
    public Df(Object object) {
        super(object);
    }

    public DV k() {
        return new DV(Df.U.u().kr.f(this.H));
    }

    public int H() {
        DV dV = this.m();
        try {
            if (dV.Y()) {
                return -1;
            }
        }
        catch (O_ o_2) {
            throw Df.a(o_2);
        }
        return dV.i();
    }

    public DV m() {
        return new DV(Df.U.u().kr.S(this.H));
    }

    public int t() {
        DV dV = this.k();
        try {
            if (dV.Y()) {
                return -1;
            }
        }
        catch (O_ o_2) {
            throw Df.a(o_2);
        }
        return dV.i();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

