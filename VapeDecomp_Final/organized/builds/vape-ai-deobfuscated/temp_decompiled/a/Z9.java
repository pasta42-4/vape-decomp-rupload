/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.O_;
import a.yy;

class z9
implements IG {
    final yy n;

    @Override
    public void R() {
        try {
            if (!this.n.P().booleanValue()) {
                yy.F(this.n);
            }
        }
        catch (O_ o_2) {
            throw z9.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    z9(yy yy2) {
        this.n = yy2;
    }
}

