/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.Sz;
import a.WE;
import a.h1;
import a.hE;
import a.hr;
import a.rk;
import a.yG;
import a.z9;
import java.awt.Color;

public class yy
extends yG {
    private rk Ou;
    private hr O8 = new hE(this, "", 0.7, new Color(255, 255, 255, 102), new Color(255, 255, 255));
    private boolean Om;
    private boolean Ot;
    private static boolean Og;
    private hr Ol = new h1(this, "", 0.7, new Color(255, 255, 255, 102), new Color(255, 255, 255));

    static void F(yy yy2) {
        yy2.X();
    }

    @Override
    public void d() {
    }

    @Override
    public double z() {
        return 12.0;
    }

    @Override
    public void C() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public double e() {
        return 100.0;
    }

    public static boolean m() {
        boolean bl2 = yy.M();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw yy.a(o_2);
        }
        return false;
    }

    public yy(String string, String string2, boolean bl2) {
        super(100.0, 12.0);
        this.Ou = new rk(0.1, 0.0, 49.0);
        this.O8.z(string);
        this.Ol.z(string2);
        this.Om = bl2;
        this.Ot = bl2;
        this.i(false);
        if (!bl2) {
            this.Ou.q();
        }
        this.O8.Y(this.w() / 2.0);
        this.O8.w(12.0);
        this.Ol.Y(this.w() / 2.0);
        this.Ol.w(12.0);
        this.O8.N(new z9(this));
        this.Ol.N(new WE(this));
        this.o(this.O8, this.Ol);
    }

    public static void x(boolean bl2) {
        Og = bl2;
    }

    public Boolean P() {
        return this.Om;
    }

    public static boolean M() {
        return Og;
    }

    private void X() {
        boolean bl2;
        yy yy2;
        try {
            yy2 = this;
            bl2 = this.P() == false;
        }
        catch (O_ o_2) {
            throw yy.a(o_2);
        }
        yy2.S((Boolean)bl2);
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        String string;
        G5 g5;
        Color color2;
        double d4;
        double d5;
        String string2;
        G5 g52;
        F8.S(this.G(), this.W(), this.w(), this.b(), new Color(54, 53, 54, 128));
        F8.c(this.G() + this.Ou.t(), this.W() + 0.5, this.w() / 2.0 + 1.0, this.b() - 1.0, yy.M.k, true, 1.0f, 1.0f, 8.0f, new Color(0, 0, 0, 70));
        boolean bl2 = this.P();
        G5 g53 = this.L(0.6);
        double d6 = (this.O8.b() - g53.B(this.O8.O())) / 2.0;
        try {
            g52 = g53;
            string2 = this.O8.O();
            d5 = this.G() + this.w() * 0.25;
            d4 = this.O8.W() + d6;
            color2 = !bl2 ? this.O8.a().k() : yy.M.c;
        }
        catch (O_ o_2) {
            throw yy.a(o_2);
        }
        try {
            g52.Q(string2, d5, d4, color2);
            g5 = g53;
            string = this.Ol.O();
            d3 = this.G() + this.w() * 0.75;
            d2 = this.Ol.W() + d6;
            color = bl2 ? this.Ol.a().k() : yy.M.c;
        }
        catch (O_ o_3) {
            throw yy.a(o_3);
        }
        g5.Q(string, d3, d2, color);
    }

    public void P(String string, String string2) {
        this.O8.g(string);
        this.Ol.g(string2);
    }

    @Override
    public void U() {
    }

    @Override
    public void T(double d2) {
        super.T(d2);
        try {
            this.O8.Y(d2 / 2.0);
            this.Ol.Y(d2 / 2.0);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void u() {
    }

    @Override
    public void i() {
    }

    @Override
    public void g() {
    }

    public void S(Boolean bl2) {
        block17: {
            boolean bl3;
            block15: {
                block16: {
                    block13: {
                        block14: {
                            boolean bl4;
                            try {
                                bl4 = this.Om != bl2;
                            }
                            catch (O_ o_2) {
                                throw yy.a(o_2);
                            }
                            boolean bl5 = bl4;
                            this.Om = bl2;
                            if (!bl5) break block17;
                            bl3 = false;
                            try {
                                try {
                                    if (!this.Ot) break block13;
                                    if (!bl2.booleanValue()) break block14;
                                }
                                catch (O_ o_3) {
                                    throw yy.a(o_3);
                                }
                                if (this.Ou.t().doubleValue() != this.Ou.p()) break block15;
                            }
                            catch (O_ o_4) {
                                throw yy.a(o_4);
                            }
                            bl3 = true;
                            break block15;
                        }
                        if (this.Ou.t() == 0.0) {
                            bl3 = true;
                        }
                        break block15;
                    }
                    try {
                        if (!bl2.booleanValue()) break block16;
                        if (this.Ou.t() != 0.0) break block15;
                    }
                    catch (O_ o_5) {
                        throw yy.a(o_5);
                    }
                    bl3 = true;
                    break block15;
                }
                if (this.Ou.t().doubleValue() == this.Ou.p()) {
                    bl3 = true;
                }
            }
            try {
                if (bl3) {
                    this.Ou.c();
                }
            }
            catch (O_ o_6) {
                throw yy.a(o_6);
            }
        }
    }

    @Override
    public void Z(Sz sz2) {
    }

    static {
        if (yy.M()) {
            yy.x(true);
        }
    }
}

