/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CP;
import a.IG;
import a.O_;
import a.ey;
import a.fq;
import a.fx;
import a.jv;

class _t
implements IG {
    final fq S;
    final CP M;

    _t(CP cP2, fq fq2) {
        this.M = cP2;
        this.S = fq2;
    }

    @Override
    public void R() {
        boolean bl2;
        jv jv2;
        jv jv3 = this.S.k();
        try {
            jv2 = jv3;
            bl2 = !jv3.g();
        }
        catch (O_ o_2) {
            throw _t.a(o_2);
        }
        try {
            jv2.p(bl2);
            if (Ao.D(fx.class).j() == ey.R) {
                Ao.D(fx.class).R().O();
            }
        }
        catch (O_ o_3) {
            throw _t.a(o_3);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

