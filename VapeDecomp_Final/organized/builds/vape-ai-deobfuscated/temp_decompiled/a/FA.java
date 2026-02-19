/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.Sc;
import a.fX;
import a.ff;
import a.fj;
import a.rn;
import a.v_;
import java.awt.Color;

class fa
extends fX {
    final fj V;
    private final rn b;
    private final ff D;
    private final rn F;

    @Override
    public void G() {
        F8.C(this.G(), this.W(), this.w(), this.b(), this.b.k(), (float)(this.w() / 2.0));
        F8.C(this.G() + 1.0, this.W() + 1.0, this.w() - 2.0, this.b() - 2.0, this.F.k(), (float)(this.w() / 2.0) - 2.0f);
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.T(this.w());
        this.D.w(this.b());
    }

    @Override
    public void j() {
        this.b.c();
        this.F.c();
    }

    @Override
    public void I() {
        this.b.B(fa.M.S);
        this.b.O(fa.M.S.brighter());
        this.F.B(fa.M.a);
        this.F.O(fa.M.L);
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.b.c();
                this.F.c();
            }
        }
        catch (O_ o_2) {
            throw fa.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public double e() {
        return 32.0;
    }

    @Override
    public double z() {
        return 32.0;
    }

    public fa(fj fj2, Sc sc2, v_ v_2) {
        this.V = fj2;
        this.b = new rn(0.15, new Color(0, 0, 0, 0), fa.M.S);
        this.F = new rn(0.15, new Color(0, 0, 0, 0), fa.M.S);
        this.D = new ff(v_2);
        this.I();
        this.n(true);
        this.o(this.D);
    }
}

