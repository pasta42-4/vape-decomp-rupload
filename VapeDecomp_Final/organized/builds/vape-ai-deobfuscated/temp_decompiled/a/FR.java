/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.fY;
import a.ht;
import java.awt.Color;

public class fr
extends fY {
    private static O_ c(O_ o_2) {
        return o_2;
    }

    public fr(ht ht2, ht ht3) {
        super(ht2, ht3);
    }

    @Override
    public void E() {
        int n2;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.P().G();
            d4 = this.P().W();
            d3 = this.P().w();
            d2 = this.P().b();
            n2 = this.C() ? 2 : 0;
        }
        catch (O_ o_2) {
            throw fr.c(o_2);
        }
        F8.S(d5, d4, d3, d2 + (double)n2, new Color(0, 0, 0, 100));
        super.E();
    }
}

