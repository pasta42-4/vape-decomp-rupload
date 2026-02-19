/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B9;
import a.G5;
import a.Sz;
import a.h7;
import a.ht;
import a.jn;
import java.awt.Color;

public class ba
extends ht {
    private h7 D;
    private boolean V;
    private String R;

    public ba(String string, B9 b92, Color color) {
        this.R = string;
        this.D = new h7(b92, color);
        this.o(this.D);
    }

    @Override
    public void G() {
        this.S();
        G5 g5 = this.L(0.9);
        double d2 = g5.B(this.R);
        g5.R(this.R, this.G() + 5.0, this.W() + this.b() / 2.0 - d2 / 2.0, ba.M.n);
        this.D.V.a(this.w() - 12.5);
        this.D.b(this.G() + this.w() - 5.0 - this.D.w());
        this.D.M(this.W() + 5.0);
    }

    @Override
    public void U() {
    }

    @Override
    public double z() {
        return 20.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    public ba(jn jn2) {
        this(jn2.O(), (B9)jn2.J());
    }

    @Override
    public void Z(Sz sz2) {
    }

    @Override
    public void d() {
    }

    @Override
    public void g() {
    }

    public ba(String string, B9 b92) {
        this(string, b92, null);
    }

    public h7 I() {
        return this.D;
    }
}

