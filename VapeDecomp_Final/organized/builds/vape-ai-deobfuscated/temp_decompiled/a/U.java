/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IN;
import a.O_;
import a.SE;
import a.Wi;
import a.i3;
import a.iz;
import java.awt.Point;

class u
implements i3 {
    final IN W;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void M(Point point) {
    }

    u(IN iN2) {
        this.W = iN2;
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
                throw u.a(o_2);
            }
            Wi wi2 = this.W.n();
            try {
                try {
                    if (wi2.E() == null || !wi2.E().equals(this.W)) break block7;
                }
                catch (O_ o_3) {
                    throw u.a(o_3);
                }
                SE.h.t().S().F();
            }
            catch (O_ o_4) {
                throw u.a(o_4);
            }
        }
    }
}

