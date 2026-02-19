/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.O_;
import a.lp;

public class Dv
extends Hc {
    private static boolean a;

    public int j() {
        return Dv.U.u().G7.i(this.H);
    }

    public static boolean J() {
        boolean bl2 = Dv.k();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw Dv.b(o_2);
        }
        return false;
    }

    static {
        if (Dv.J()) {
            Dv.s(true);
        }
    }

    public Dv(Object object) {
        super(object);
    }

    public int q() {
        return Dv.U.u().G7.n(this.H);
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public static void s(boolean bl2) {
        a = bl2;
    }

    public int o() {
        return Dv.U.u().G7.N(this.H);
    }

    public static boolean k() {
        return a;
    }

    public static Dv q(int n2, int n3, int n4) {
        return new Dv(lp.H(Dv.U.u().G7).A(n2, n3, n4));
    }
}

