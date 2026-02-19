/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.bn;
import a.hs;
import java.awt.Color;

class hc
extends hs {
    final bn Ap;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void G() {
        try {
            if (this.s()) {
                F8.T(this.G() + 1.5, this.W() + 4.0, 11.0, 1.0, new Color(255, 255, 255, 15));
            }
        }
        catch (O_ o_2) {
            throw hc.a(o_2);
        }
        super.G();
    }

    hc(bn bn2, String string, double d2) {
        this.Ap = bn2;
        super(string, d2);
    }
}

