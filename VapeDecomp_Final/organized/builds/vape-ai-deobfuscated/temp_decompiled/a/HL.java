/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.fE;
import a.ht;
import a.i3;
import a.iz;
import java.awt.Point;

class hl
implements i3 {
    final fE y;
    final ht F;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    hl(fE fE2, ht ht2) {
        this.y = fE2;
        this.F = ht2;
    }

    @Override
    public void B(Point point, iz iz2) {
        block5: {
            try {
                if (this.y.s() || this.F.s()) break block5;
            }
            catch (O_ o_2) {
                throw hl.a(o_2);
            }
            Ao.z(this.y);
            Runnable runnable = fE.d(this.y);
            try {
                if (runnable != null) {
                    runnable.run();
                }
            }
            catch (O_ o_3) {
                throw hl.a(o_3);
            }
        }
    }
}

