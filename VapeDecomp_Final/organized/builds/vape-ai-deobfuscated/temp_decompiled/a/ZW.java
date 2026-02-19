/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.O_;
import a.fm;
import a.ht;
import a.yM;

class zw
implements IG {
    final fm M;

    @Override
    public void R() {
        this.M.V(true);
        for (ht ht2 : this.M.A()) {
            try {
                if (!(ht2 instanceof yM)) continue;
                ht2.N(true);
            }
            catch (O_ o_2) {
                throw zw.a(o_2);
            }
        }
        this.M.A();
        fm.a(this.M).N(true);
        fm.h(this.M).N(false);
    }

    zw(fm fm2) {
        this.M = fm2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

