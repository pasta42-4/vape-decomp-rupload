/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.O_;
import a.kX;
import a.q3;

public class t6
extends Hc {
    public void L() {
        q3.e(t6.U.u().d0, this.H);
    }

    public void e(boolean bl2) {
        q3.Q(t6.U.u().d0, this.H, bl2);
    }

    public void q() {
        q3.O(t6.U.u().d0, this.H);
    }

    public void p() {
        q3.S(t6.U.u().d0, this.H);
    }

    public void j(int n2) {
        q3.a(t6.U.u().d0, this.H, n2);
    }

    public void B() {
        q3.y(t6.U.u().d0, this.H);
    }

    public void p(int n2, int n3) {
        try {
            if (kX.C() >= 35) {
                q3.v(t6.U.u().d0, this.H, n2, n3, false);
                return;
            }
        }
        catch (O_ o_2) {
            throw t6.a(o_2);
        }
        q3.n(t6.U.u().d0, this.H, n2, n3);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void C(int n2, int n3) {
        q3.x(t6.U.u().d0, this.H, n2, n3);
    }

    public t6(Object object) {
        super(object);
    }

    public int D() {
        return q3.q(t6.U.u().d0, this.H);
    }

    public static t6 t(int n2, int n3, boolean bl2) {
        try {
            if (kX.C() >= 37) {
                return new t6(q3.B(t6.U.u().d0, n2, n3, true));
            }
        }
        catch (O_ o_2) {
            throw t6.a(o_2);
        }
        return new t6(q3.B(t6.U.u().d0, n2, n3, bl2));
    }
}

