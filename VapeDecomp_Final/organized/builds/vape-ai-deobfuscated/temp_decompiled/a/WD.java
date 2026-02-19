/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.X4;
import a.w6;

public abstract class wd
extends w6 {
    @Override
    public X4 C() {
        try {
            if (this.Gt) {
                return new X4(this.G() - 5.0, this.W(), this.w() + 10.0, this.Q());
            }
        }
        catch (O_ o_2) {
            throw wd.c(o_2);
        }
        return new X4(this.G() - 5.0, this.W(), this.w() + 10.0, this.b());
    }

    @Override
    public void o(boolean bl2) {
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G() - 5.0;
            d4 = this.W();
            d3 = this.w() + 10.0;
            d2 = bl2 ? this.G5 + 2.0 : this.b() + 2.0;
        }
        catch (O_ o_2) {
            throw wd.c(o_2);
        }
        F8.S(d5, d4, d3, d2, this.l());
    }

    @Override
    public void T(double d2) {
        super.T(d2 - 10.0);
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    @Override
    public void a() {
        this.GH = new X4(this.GH.K() + 5.0, this.GH.q(), this.GH.t(), this.GH.V());
        super.a();
    }

    @Override
    public void b(double d2) {
        super.b(d2 + 5.0);
    }
}

