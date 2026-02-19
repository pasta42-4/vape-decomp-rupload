/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.bE;
import a.ht;
import a.wW;
import a.yh;

class y0
extends yh {
    final wW YA;

    y0(wW wW2, double d2) {
        this.YA = wW2;
        super(d2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public double q() {
        double d2 = 0.0;
        try {
            if (!wW.C(this.YA).f()) {
                return d2;
            }
        }
        catch (O_ o_2) {
            throw y0.a(o_2);
        }
        for (ht ht2 : wW.C(this.YA).A()) {
            if (ht2 instanceof bE) continue;
            try {
                if (!ht2.f()) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw y0.a(o_3);
            }
            d2 += ht2.w();
        }
        return d2 + 2.0;
    }
}

