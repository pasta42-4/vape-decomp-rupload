/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.hS;
import a.wz;
import java.awt.Color;

class hq
extends hS {
    final wz jv;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    hq(wz wz2, String string, double d2, double d3, double d4, Color color, double d5) {
        this.jv = wz2;
        super(string, d2, d3, d4, color, d5);
    }

    @Override
    public void l(boolean bl2) {
        try {
            if (wz.Z(this.jv)) {
                this.T = false;
                this.S().D();
                this.J().D();
                return;
            }
        }
        catch (O_ o_2) {
            throw hq.a(o_2);
        }
        super.l(bl2);
    }
}

