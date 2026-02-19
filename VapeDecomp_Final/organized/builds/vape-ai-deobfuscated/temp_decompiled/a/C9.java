/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.BZ;
import a.IG;
import a.O_;
import a.SE;
import a.yM;

class c9
implements IG {
    final BZ Q;
    final yM k;

    @Override
    public void R() {
        try {
            if (SE.h.o().W().equals(this.Q)) {
                this.Q.y();
            }
        }
        catch (O_ o_2) {
            throw c9.a(o_2);
        }
        this.k.R();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    c9(yM yM2, BZ bZ2) {
        this.k = yM2;
        this.Q = bZ2;
    }
}

