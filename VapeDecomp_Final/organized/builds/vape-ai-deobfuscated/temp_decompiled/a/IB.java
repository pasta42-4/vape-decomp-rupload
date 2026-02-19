/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.i3;
import a.wA;
import java.awt.Point;

class ib
implements i3 {
    final wA P;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    ib(wA wA2) {
        this.P = wA2;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (wA.g(this.P).C().T(point) || wA.M(this.P).C().T(point)) break block4;
                }
                catch (O_ o_2) {
                    throw ib.a(o_2);
                }
                wA.Q(this.P);
                return true;
            }
            catch (O_ o_3) {
                throw ib.a(o_3);
            }
        }
        return i3.super.o(point);
    }
}

