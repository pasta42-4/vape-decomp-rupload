/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Na;
import a.O_;
import a.SE;
import a._J;
import a.eM;
import a.pF;
import a.pR;
import a.zf;

public class zs
extends zf {
    public zs() {
        super(eM.rl);
    }

    @Override
    public void y() {
        this.P();
    }

    private void P() {
        try {
            if (Na.MC_1_21_10.Q()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw zs.a(o_2);
        }
        HK hK2 = SE.h.u().gw.M;
        this.P(hK2, pF.class, new _J(0).s(Object.class));
        this.l(hK2, pR.class, new _J(0).s(Object.class));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

