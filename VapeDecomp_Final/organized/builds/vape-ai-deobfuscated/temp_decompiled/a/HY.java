/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.hs;
import a.rn;
import java.awt.Color;

public class hy
extends hs {
    private final rn II;

    public hy(String string, double d2, Color color, Color color2, double d3, double d4) {
        super(string, d2, d3, d4);
        this.II = new rn(0.1, color, color2);
    }

    public hy(String string, double d2) {
        this(string, d2, new Color(0, 0, 0, 0), hy.M.w, 8.0, 8.0);
    }

    @Override
    public void G() {
        float f10 = (float)(this.w() * (double)((float)this.D));
        F8.T(this.G() + this.w() / 2.0 - (double)(f10 / 2.0f), this.W() + this.b() / 2.0 - (double)(f10 / 2.0f), (double)f10, 1.0, this.II.k());
        super.G();
    }

    @Override
    public void j() {
        this.II.c();
        super.j();
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.II.c();
            }
        }
        catch (O_ o_2) {
            throw hy.a(o_2);
        }
        super.g();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public hy(String string) {
        this(string, 1.0);
    }
}

