/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.hs;
import a.rn;
import java.awt.Color;

public class ha
extends hs {
    private final rn zo;

    public ha(String string, Color color, double d2, double d3, double d4) {
        super(string, d2, d3, d4);
        this.zo = new rn(0.1, color, color.brighter());
    }

    @Override
    public void j() {
        this.zo.c();
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    @Override
    public void G() {
        super.G();
        float f10 = (float)this.w();
        F8.r((float)(this.G() + this.w() / 2.0 - (double)(f10 / 2.0f)), (float)(this.W() + this.b() / 2.0 - (double)(f10 / 2.0f)), f10, 1.5f, 1.0f, this.zo.k());
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.zo.c();
            }
        }
        catch (O_ o_2) {
            throw ha.c(o_2);
        }
        super.g();
    }
}

