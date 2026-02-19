/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DN;
import a.Hc;
import a.O_;
import a.SE;
import a.kX;
import a.qN;
import a.tJ;
import a.tU;
import a.ts;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t1
extends Hc {
    private static boolean d;

    public int A() {
        return DN.o();
    }

    public tU h() {
        return new tU(qN.L(t1.U.u().Z, this.M()));
    }

    static {
        if (!t1.T()) {
            t1.W(true);
        }
    }

    public boolean s() {
        try {
            if (kX.C() >= 35) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw t1.a(o_2);
        }
        return qN.T(t1.U.u().Z, this.H);
    }

    public void A(boolean bl2) {
        qN.Z(t1.U.u().Z, this.H, bl2);
    }

    public tU s() {
        return new tU(qN.J(t1.U.u().Z, this.M()));
    }

    public tU K() {
        return new tU(qN.g(t1.U.u().Z, this.H));
    }

    public float W() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.k(t1.U.u().Z, this.H));
            return (float)((Double)ts2.C()).doubleValue();
        }
        return qN.B(t1.U.u().Z, this.H);
    }

    public float Q() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.K(t1.U.u().Z, this.H));
            return (float)((Double)ts2.C()).doubleValue();
        }
        return qN.Z(t1.U.u().Z, this.H);
    }

    public t1(Object object) {
        super(object);
    }

    public static boolean T() {
        return d;
    }

    public int p() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.M(t1.U.u().Z, this.M()));
            return (Integer)ts2.C();
        }
        return qN.U(t1.U.u().Z, this.M());
    }

    public boolean C() {
        return qN.o(t1.U.u().Z, this.H);
    }

    public tU r() {
        return new tU(qN.W(t1.U.u().Z, this.M()));
    }

    public void e(boolean bl2) {
        qN.U(t1.U.u().Z, this.H, bl2);
    }

    public tU w() {
        return new tU(qN.Q(t1.U.u().Z, this.M()));
    }

    public void v(boolean bl2) {
        qN.z(t1.U.u().Z, this.H, bl2);
    }

    public tU N() {
        return new tU(qN.n(t1.U.u().Z, this.H));
    }

    public static void W(boolean bl2) {
        d = bl2;
    }

    public float D() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.T(t1.U.u().Z, this.H));
            return (float)((Double)ts2.C()).doubleValue();
        }
        return qN.u(t1.U.u().Z, this.H);
    }

    public tU e() {
        return new tU(qN.f(t1.U.u().Z, this.M()));
    }

    public void C(boolean bl2) {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.b(t1.U.u().Z, this.H));
            ts2.z(bl2);
            return;
        }
        qN.f(t1.U.u().Z, this.H, bl2);
    }

    public boolean S() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.b(t1.U.u().Z, this.H));
            return (Boolean)ts2.C();
        }
        return qN.E(t1.U.u().Z, this.H);
    }

    public tU f() {
        return new tU(qN.G(t1.U.u().Z, this.M()));
    }

    public float K() {
        return qN.O(t1.U.u().Z, this.H);
    }

    public tU G() {
        return new tU(qN.h(SE.h.u().Z, this.M()));
    }

    public tU y() {
        return new tU(qN.C(t1.U.u().Z, this.M()));
    }

    public tU D() {
        return new tU(qN.j(SE.h.u().Z, this.M()));
    }

    public boolean n() {
        return qN.U(t1.U.u().Z, this.H);
    }

    public void L(float f10) {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.T(t1.U.u().Z, this.H));
            ts2.k(f10);
            return;
        }
        qN.t(t1.U.u().Z, this.H, f10);
    }

    public void n(int n2) {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.M(t1.U.u().Z, this.M()));
            ts2.z(n2);
            return;
        }
        qN.p(t1.U.u().Z, this.H, n2);
    }

    public void s(int n2) {
        if (kX.C() >= 35) {
            tJ tJ2 = tJ.S()[n2];
            qN.V(t1.U.u().Z, this.H, tJ2.M());
            return;
        }
        qN.b(t1.U.u().Z, this.H, n2);
    }

    public int e() {
        if (kX.C() >= 50) {
            ts ts2 = new ts(qN.o(t1.U.u().Z, this.H));
            return (Integer)ts2.C();
        }
        return qN.G(t1.U.u().Z, this.H);
    }

    public int V() {
        if (kX.C() >= 35) {
            Object object = qN.U(t1.U.u().Z, this.H);
            int n2 = 0;
            for (tJ tJ2 : tJ.S()) {
                try {
                    if (tJ2.M() == object) {
                        return n2;
                    }
                }
                catch (O_ o_2) {
                    throw t1.a(o_2);
                }
                ++n2;
            }
            return 0;
        }
        return qN.T(t1.U.u().Z, this.H);
    }

    public tU R() {
        return new tU(qN.r(t1.U.u().Z, this.M()));
    }

    public void R(float f10) {
        qN.W(t1.U.u().Z, this.H, f10);
    }

    public static boolean A() {
        boolean bl2 = t1.T();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw t1.a(o_2);
        }
        return false;
    }

    public boolean U() {
        return qN.d(t1.U.u().Z, this.H);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

