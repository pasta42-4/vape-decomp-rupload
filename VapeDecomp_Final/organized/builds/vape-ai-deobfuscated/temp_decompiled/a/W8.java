/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.bQ;
import a.bt;
import a.yG;
import java.awt.Color;

public class w8
extends yG {
    private final bQ DE;
    private final bt D0;

    @Override
    public double z() {
        return 6.0;
    }

    @Override
    public void E() {
        F8.S(this.DE.G() - 2.0, this.DE.W() + 1.0, this.DE.w() + 4.0, this.DE.d() * 10.0, w8.M.m);
        super.E();
    }

    public void K(double d2) {
        this.D0.p(d2);
        this.DE.p(d2);
    }

    @Override
    public double e() {
        return this.DE.w();
    }

    @Override
    public void G() {
    }

    public w8(String string, String string2, double d2, double d3) {
        super(40.0, d2);
        this.i(false);
        this.Q(Color.RED);
        this.D0 = new bt(string, d3, w8.M.c);
        this.D0.T(this.D0.D() + 8.0);
        this.D0.q(true);
        this.D0.S(0.0f);
        this.DE = new bQ(string2, d3 * 0.9, w8.M.n);
        this.DE.T(this.DE.D() + 4.0);
        this.Y(this.D0.w() + this.DE.w() + 2.0);
        this.o(this.D0, this.DE);
    }
}

