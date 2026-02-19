/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.Hc;
import a.Na;
import a.O_;

public class Dq
extends Hc {
    public void r(boolean bl2) {
        try {
            if (Na.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), this.u(), this.g(), bl2);
                return;
            }
        }
        catch (O_ o_2) {
            throw Dq.a(o_2);
        }
        Dq.U.u().dq.g(this.H, bl2);
    }

    public boolean l() {
        return Dq.U.u().dq.d(this.H);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void u(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        Dq dq = new Dq(Dq.U.u().dq.k(bl2, bl3, bl4, bl5, bl6, bl7, bl8));
        this.H = dq.M();
        EP.U().W().C(dq);
    }

    public boolean J() {
        return Dq.U.u().dq.g(this.H);
    }

    public boolean z() {
        return Dq.U.u().dq.Q(this.H);
    }

    public void Y(boolean bl2) {
        try {
            if (Na.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), this.u(), bl2, this.l());
                return;
            }
        }
        catch (O_ o_2) {
            throw Dq.a(o_2);
        }
        Dq.U.u().dq.e(this.H, bl2);
    }

    public boolean g() {
        return Dq.U.u().dq.C(this.H);
    }

    public boolean u() {
        return Dq.U.u().dq.B(this.H);
    }

    public Dq(Object object) {
        super(object);
    }

    public boolean p() {
        return Dq.U.u().dq.k(this.H);
    }

    public boolean m() {
        return Dq.U.u().dq.H(this.H);
    }

    public void W(boolean bl2) {
        try {
            if (Na.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), bl2, this.g(), this.l());
                return;
            }
        }
        catch (O_ o_2) {
            throw Dq.a(o_2);
        }
        Dq.U.u().dq.n(this.H, bl2);
    }
}

