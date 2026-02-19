/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.fB;
import a.i3;
import a.wz;
import java.awt.Point;

class c1
implements i3 {
    final wz R;
    final fB F;

    c1(wz wz2, fB fB2) {
        this.R = wz2;
        this.F = fB2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.R.V().C().T(point) || this.F.C().T(point)) break block4;
                }
                catch (O_ o_2) {
                    throw c1.a(o_2);
                }
                return true;
            }
            catch (O_ o_3) {
                throw c1.a(o_3);
            }
        }
        return i3.super.o(point);
    }
}

