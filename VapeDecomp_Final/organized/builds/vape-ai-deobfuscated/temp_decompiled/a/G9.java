/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.f0;
import a.i3;
import java.awt.Point;

class G9
implements i3 {
    final f0 W;

    G9(f0 f02) {
        this.W = f02;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (this.W.W() || !f0.G(this.W).s()) break block4;
                }
                catch (O_ o_2) {
                    throw G9.a(o_2);
                }
                f0.G(this.W).L();
                return true;
            }
            catch (O_ o_3) {
                throw G9.a(o_3);
            }
        }
        return false;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

