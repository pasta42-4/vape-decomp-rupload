/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.O_;
import a.fu;
import a.hx;

class Gg
implements IG {
    final hx M;
    final fu e;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    Gg(hx hx2, fu fu2) {
        this.M = hx2;
        this.e = fu2;
    }

    @Override
    public void O() {
        this.R();
    }

    @Override
    public void R() {
        block5: {
            block4: {
                boolean bl2;
                hx hx2;
                try {
                    hx2 = this.M;
                    bl2 = !hx.w(this.M);
                }
                catch (O_ o_2) {
                    throw Gg.a(o_2);
                }
                try {
                    hx.W(hx2, bl2);
                    if (!hx.w(this.M)) break block4;
                    this.e.E(this.M.D());
                    this.M.o();
                    break block5;
                }
                catch (O_ o_3) {
                    throw Gg.a(o_3);
                }
            }
            this.e.E(null);
            this.M.M();
        }
        this.e.A();
    }
}

