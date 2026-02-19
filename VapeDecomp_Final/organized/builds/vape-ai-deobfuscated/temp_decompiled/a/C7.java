/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.O_;
import a.ey;
import a.fx;

class c7
implements IG {
    final fx K;
    final ey f;

    @Override
    public void R() {
        try {
            if (fx.J(this.K) == this.f) {
                return;
            }
        }
        catch (O_ o_2) {
            throw c7.a(o_2);
        }
        fx.E(this.K, this.f);
        fx.Jr.O();
        this.K.V();
    }

    c7(fx fx2, ey ey2) {
        this.K = fx2;
        this.f = ey2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

