/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CW;
import a.IG;
import a.O_;

class m
implements IG {
    final CW e;

    @Override
    public void R() {
        boolean bl2;
        try {
            bl2 = !Ao.e;
        }
        catch (O_ o_2) {
            throw m.a(o_2);
        }
        Ao.e = bl2;
        Ao.j();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    m(CW cW2) {
        this.e = cW2;
    }
}

