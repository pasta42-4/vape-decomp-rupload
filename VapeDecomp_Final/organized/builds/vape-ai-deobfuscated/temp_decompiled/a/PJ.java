/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.QF;
import a.ps;

public class pj
extends ps {
    @Override
    public boolean fire() {
        try {
            if (P.Y()) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw pj.a(o_2);
        }
        boolean bl2 = super.fire();
        try {
            ps.access$302(P.o());
            if (pj.shouldAlwaysSend()) {
                P.T(new QF(null));
            }
        }
        catch (O_ o_3) {
            throw pj.a(o_3);
        }
        return bl2;
    }

    public pj(Object object) {
        super(new QF(object));
        g = false;
        ps.access$002(ps.P.q());
        ps.access$102(ps.P.S());
        ps.access$202(ps.P.j());
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

