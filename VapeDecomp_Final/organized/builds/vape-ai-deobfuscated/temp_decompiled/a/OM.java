/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.Hc;
import a.O_;
import a.Pu;
import a.Qh;
import a.kX;

public class om
extends Hc {
    public static om G(Qh qh2) {
        try {
            if (kX.C() >= 50) {
                return new om(Pu.X(om.U.u().LS, EP.c().r(), qh2.M()));
            }
        }
        catch (O_ o_2) {
            throw om.a(o_2);
        }
        return new om(Pu.X(om.U.u().LS, null, qh2.M()));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static om s() {
        return new om(Pu.K(om.U.u().LS));
    }

    public om(Object object) {
        super(object);
    }
}

