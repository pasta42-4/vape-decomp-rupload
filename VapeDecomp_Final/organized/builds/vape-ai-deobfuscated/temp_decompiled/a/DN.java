/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dw;
import a.Hc;
import a.O_;
import a.eM;
import a.lZ;
import a.o6;
import a.oJ;
import a.oj;

public class Dn
extends Hc {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void s(float f10, float f11, float f12) {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).x(f10, f11, f12);
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.C(Dn.U.u().Lk, this.H, f10, f11, f12);
    }

    public void T(oj oj2) {
        lZ.N(Dn.U.u().Lk, this.H, oj2.M());
    }

    public Dn(Object object) {
        super(object);
    }

    public void C(oJ oJ2) {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).t(oJ2);
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.F(Dn.U.u().Lk, this.H, oJ2.M());
    }

    public void g() {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).K();
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.O(Dn.U.u().Lk, this.H);
    }

    public Dw p() {
        return new Dw(lZ.w(Dn.U.u().Lk, this.H));
    }

    public void T(double d2, double d3, double d4) {
        this.s((float)d2, (float)d3, (float)d4);
    }

    public void v() {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).W();
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.L(Dn.U.u().Lk, this.H);
    }

    public void B() {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).a();
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.S(Dn.U.u().Lk, this.H);
    }

    public static Dn i() {
        return new Dn(lZ.R(Dn.U.u().Lk));
    }

    public void m(double d2, double d3, double d4) {
        try {
            if (this.B(eM.U2)) {
                new o6(this.H).X((float)d2, (float)d3, (float)d4);
                return;
            }
        }
        catch (O_ o_2) {
            throw Dn.a(o_2);
        }
        lZ.y(Dn.U.u().Lk, this.H, d2, d3, d4);
    }
}

