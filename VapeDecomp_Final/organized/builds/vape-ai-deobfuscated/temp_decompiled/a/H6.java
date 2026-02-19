/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.hY;
import a.ht;
import a.rn;
import java.awt.Color;

public class h6
extends hY {
    private Color HJ;
    private rn Hw;
    private float Ho;

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void G() {
        G5 g5;
        try {
            F8.U(this.G(), this.W(), this.w(), this.b(), this.Hw.k(), 2.0f, this.Ho, 1.0f);
            g5 = this.x() ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (O_ o_2) {
            throw h6.a(o_2);
        }
        G5 g52 = g5;
        double d2 = g52.B(this.OE);
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        g52.Q(this.OE, this.G() + this.w() / 2.0, d3, this.C());
    }

    public h6 R(Color color) {
        this.HJ = color;
        return this;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void d(float f10) {
        this.Ho = f10;
    }

    public h6(String string, Color color) {
        super(string);
        this.HJ = h6.M.n;
        this.Ho = 1.0f;
        this.Hw = new rn(0.15, color, color.brighter());
    }

    @Override
    public void l(boolean bl2) {
        try {
            if (this.s() != bl2) {
                this.Hw.c();
            }
        }
        catch (O_ o_2) {
            throw h6.a(o_2);
        }
        super.l(bl2);
    }

    public ht K(Color color, Color color2) {
        this.Hw = new rn(0.15, color, color2);
        return super.Q(color);
    }

    @Override
    public Color C() {
        return this.HJ;
    }

    @Override
    public double e() {
        return 0.0;
    }
}

