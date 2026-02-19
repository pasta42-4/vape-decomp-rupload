/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.i3;
import a.iz;
import a.yB;
import a.yE;
import java.awt.Point;

class e6
implements i3 {
    final yB D;

    @Override
    public void B(Point point, iz iz2) {
        boolean bl2;
        yE yE2;
        try {
            yE2 = yB.b(this.D);
            bl2 = !yB.b(this.D).f();
        }
        catch (O_ o_2) {
            throw e6.a(o_2);
        }
        yE2.N(bl2);
    }

    e6(yB yB2) {
        this.D = yB2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

