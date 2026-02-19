/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ia;
import a.O_;
import a.SE;
import a.Wi;
import a.i3;
import a.iz;
import java.awt.Point;

class i2
implements i3 {
    final Ia W;

    @Override
    public void M(Point point) {
    }

    @Override
    public void B(Point point, iz iz2) {
        block7: {
            try {
                if (iz2 != iz.LEFT_CLICK) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw i2.a(o_2);
            }
            Wi wi2 = this.W.n();
            try {
                try {
                    if (wi2.E() == null || !wi2.E().equals(this.W)) break block7;
                }
                catch (O_ o_3) {
                    throw i2.a(o_3);
                }
                SE.h.t().S().F();
            }
            catch (O_ o_4) {
                throw i2.a(o_4);
            }
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    i2(Ia ia2) {
        this.W = ia2;
    }
}

