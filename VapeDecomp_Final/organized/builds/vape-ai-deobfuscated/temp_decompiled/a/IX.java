/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.i3;
import a.iz;
import a.wa;
import java.awt.Point;

class ix
implements i3 {
    final wa S;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void B(Point point, iz iz2) {
        try {
            if (iz2 != iz.LEFT_CLICK) {
                return;
            }
        }
        catch (O_ o_2) {
            throw ix.a(o_2);
        }
        wa.o(this.S).T();
    }

    ix(wa wa2) {
        this.S = wa2;
    }
}

