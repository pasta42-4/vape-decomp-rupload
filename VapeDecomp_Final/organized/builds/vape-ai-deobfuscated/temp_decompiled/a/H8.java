/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.O_;
import a.hG;
import a.rn;
import java.awt.Color;

public class h8
extends hG {
    protected String Jl;
    protected rn L;
    protected boolean V;
    protected double J_;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public rn x() {
        return this.L;
    }

    @Override
    public void l(boolean bl2) {
        try {
            if (this.T != bl2) {
                this.L.c();
            }
        }
        catch (O_ o_2) {
            throw h8.a(o_2);
        }
        super.l(bl2);
    }

    public void C(rn rn2) {
        this.L = rn2;
    }

    public h8(String string, double d2, boolean bl2, double d3, double d4, Color color, double d5) {
        super(d3, d4, color, d5);
        this.L = new rn(0.15, h8.M.Z, h8.M.q);
        this.Jl = string;
        this.J_ = d2;
        this.V = bl2;
    }

    public h8(String string, double d2, boolean bl2, double d3, double d4, Color color) {
        super(d3, d4, color);
        this.L = new rn(0.15, h8.M.Z, h8.M.q);
        this.Jl = string;
        this.J_ = d2;
        this.V = bl2;
    }

    @Override
    public void G() {
        G5 g5;
        try {
            super.G();
            g5 = this.V ? this.t(this.J_) : this.L(this.J_);
        }
        catch (O_ o_2) {
            throw h8.a(o_2);
        }
        G5 g52 = g5;
        g52.R(this.Jl, this.G() + this.w() / 2.0 - g52.D(this.Jl) / 2.0, this.W() + this.b() / 2.0 - g52.B(this.Jl) / 2.0, this.L.k());
    }
}

