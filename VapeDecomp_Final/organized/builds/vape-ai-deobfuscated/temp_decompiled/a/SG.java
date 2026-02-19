/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.f5;
import a.fB;
import a.i3;
import java.awt.Point;

class sg
implements i3 {
    final f5 w;
    final fB n;

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.w.V().C().T(point) || this.n.C().T(point)) break block4;
                }
                catch (O_ o_2) {
                    throw sg.a(o_2);
                }
                return true;
            }
            catch (O_ o_3) {
                throw sg.a(o_3);
            }
        }
        return i3.super.o(point);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    sg(f5 f52, fB fB2) {
        this.w = f52;
        this.n = fB2;
    }
}

