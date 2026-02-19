/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.Sc;
import a.fN;
import a.fX;
import a.ff;
import a.rn;
import a.vM;
import java.awt.Color;

class fy
extends fX {
    private final ff B;
    private final vM R;
    private final rn Y;
    final fN L;
    private final rn b;
    private final Sc V;

    @Override
    public void I() {
        Color color;
        rn rn2;
        Color color2;
        rn rn3;
        try {
            rn3 = this.Y;
            color2 = this.R.A().T() ? fy.M.E : fy.M.S;
        }
        catch (O_ o_2) {
            throw fy.a(o_2);
        }
        try {
            rn3.B(color2);
            rn2 = this.Y;
            color = this.R.A().T() ? fy.M.S : fy.M.k;
        }
        catch (O_ o_3) {
            throw fy.a(o_3);
        }
        rn2.O(color);
    }

    fy(fN fN2, Sc sc2, vM vM2) {
        this.L = fN2;
        this.Y = new rn(0.15, new Color(0, 0, 0, 0), fy.M.S);
        this.b = new rn(0.15, new Color(0, 0, 0, 0), fy.M.K);
        this.V = sc2;
        this.R = vM2;
        this.B = new ff(vM2);
        this.B.h(true);
        this.I();
        this.n(true);
        this.o(this.B);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void j() {
        this.Y.c();
        this.b.c();
    }

    @Override
    public double z() {
        return 32.0;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.Y.c();
                this.b.c();
            }
        }
        catch (O_ o_2) {
            throw fy.a(o_2);
        }
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        boolean bl2 = this.R.A().T();
        try {
            d5 = this.G() + 1.0;
            d4 = this.W() + 1.0;
            d3 = this.w() - 2.0;
            d2 = this.b() - 2.0;
            color = bl2 ? new Color(0, 0, 0, 127) : fy.M.g;
        }
        catch (O_ o_2) {
            throw fy.a(o_2);
        }
        F8.C(d5, d4, d3, d2, color, 2.0f);
        F8.U(this.G(), this.W(), this.w(), this.b(), this.Y.k(), 4.0f, 1.0f, 1.0f);
        this.B.b(this.G());
        this.B.M(this.W());
        this.B.T(this.w());
        this.B.w(this.b());
        if (!bl2) {
            double d6 = 1.5;
            F8.T(this.G() + this.w() / 2.0 - 0.75, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
            F8.T(this.G() + this.w() / 2.0 - 0.75 - 3.0, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
            F8.T(this.G() + this.w() / 2.0 - 0.75 + 3.0, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
        }
    }

    @Override
    public double e() {
        return 32.0;
    }
}

