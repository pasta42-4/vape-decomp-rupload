/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dl;
import a.Hc;
import a.Na;
import a.O_;
import a.qZ;
import a.tz;

public class tx
extends Hc {
    public tx(Object object) {
        super(object);
    }

    public void q(Dl dl2) {
        try {
            if (Na.MC_1_21_0.H()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw tx.a(o_2);
        }
        qZ.g(tx.U.u().gk, this.H, dl2.M());
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public tz h(Dl dl2) {
        return new tz(qZ.m(tx.U.u().gk, this.H, dl2.M()));
    }
}

