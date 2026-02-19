/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DK;
import a.DT;
import a.EP;
import a.Eh;
import a.Hc;
import a.O_;
import a.Pd;
import a.QF;
import a.eM;
import a.kX;
import a.oV;
import a.oo;

public class on
extends Hc {
    private static int[] x;

    public on(Object object) {
        super(object);
    }

    public boolean S() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r() || !this.q().equals(oV.B())) break block4;
                    }
                    catch (O_ o_2) {
                        throw on.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw on.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public int m() {
        try {
            if (kX.C() == 13) {
                return on.U.u().dV.N(this.H);
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        DK dK = this.f();
        return dK.j();
    }

    public int p() {
        try {
            if (kX.C() == 13) {
                return on.U.u().dV.m(this.H);
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        DK dK = this.f();
        return dK.o();
    }

    public QF l() {
        try {
            if (kX.C() >= 35) {
                return this.g();
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        return new QF(on.U.u().dV.Y(this.H));
    }

    public DT i() {
        return new DT(on.U.u().dV.f(this.H));
    }

    public boolean h() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r() || !this.q().equals(oV.Y())) break block4;
                    }
                    catch (O_ o_2) {
                        throw on.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw on.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public int j() {
        int n2;
        try {
            if (kX.C() == 13) {
                return on.U.u().dV.w(this.H);
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        oo oo2 = this.K();
        try {
            n2 = oo2.r() ? oo2.p() : 0;
        }
        catch (O_ o_3) {
            throw on.a(o_3);
        }
        return n2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static on k(QF qF2, DT dT) {
        if (kX.C() >= 35) {
            Object object = on.U.u().dV.U(qF2.M(), dT.M());
            return new on(object);
        }
        return new on(on.U.u().dV.T(qF2.M(), dT.M()));
    }

    public int b() {
        try {
            if (kX.C() == 13) {
                return on.U.u().dV.K(this.H);
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        DK dK = this.f();
        return dK.q();
    }

    @Override
    public Eh M() {
        return EP.c().N(this.p(), this.b(), this.m());
    }

    public oo K() {
        try {
            if (kX.C() == 13) {
                return oo.d(on.U.u().dV.w(this.H));
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        return new oo(on.U.u().dV.x(this.H));
    }

    static {
        if (on.y() != null) {
            on.j(new int[2]);
        }
    }

    private QF g() {
        try {
            if (eM.PV.isInstance(this.H)) {
                return new QF(on.U.u().dV.Y(this.H));
            }
        }
        catch (O_ o_2) {
            throw on.a(o_2);
        }
        return new QF(null);
    }

    public void s(QF qF2) {
        on.U.u().dV.Z(this.H, qF2.M());
    }

    public static on Q(oV oV2, DT dT, oo oo2, DK dK) {
        if (kX.C() >= 35) {
            Object object = on.U.u().dV.d(dT.M(), oo2.M(), dK.M(), false);
            return new on(object);
        }
        return new on(on.U.u().dV.S(oV2.M(), dT.M(), oo2.M(), dK.M()));
    }

    public static void j(int[] nArray) {
        x = nArray;
    }

    public DK f() {
        block4: {
            block5: {
                try {
                    try {
                        if (kX.C() < 35) break block4;
                        if (!eM.d.isInstance(this.H)) break block5;
                    }
                    catch (O_ o_2) {
                        throw on.a(o_2);
                    }
                    return new DK(on.U.u().dV.Z(this.H));
                }
                catch (O_ o_3) {
                    throw on.a(o_3);
                }
            }
            return null;
        }
        return new DK(on.U.u().dV.Z(this.H));
    }

    public oV q() {
        return new oV(Pd.a(on.U.u().dV, this.H));
    }

    public static int[] y() {
        return x;
    }
}

