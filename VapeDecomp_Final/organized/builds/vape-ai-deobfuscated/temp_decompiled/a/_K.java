/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.fE;
import a.i3;
import a.iz;
import java.awt.Point;

class _k
implements i3 {
    final fE s;

    _k(fE fE2) {
        this.s = fE2;
    }

    @Override
    public void B(Point point, iz iz2) {
        Ao.z(this.s);
        Runnable runnable = fE.d(this.s);
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (O_ o_2) {
            throw _k.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

