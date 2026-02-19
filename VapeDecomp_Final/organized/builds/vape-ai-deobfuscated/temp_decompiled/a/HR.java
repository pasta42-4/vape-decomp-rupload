/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.Rs;
import a.hY;
import a.ht;
import a.rn;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hr
extends hY {
    public static final float yl = 2.0f;
    private rn y2;
    private Color yG;
    private float yY;
    private float yp;
    private Color yk;
    private float yf;
    private Color yX;
    @Nullable
    private String yJ;
    public static final float yN = 1.0f;
    private rn y4;
    private boolean yC;
    private boolean ys;

    public hr Q(Color color, Color color2) {
        this.yX = color;
        this.y2 = new rn(0.0375, color2, this.y2.Q());
        return this;
    }

    public rn a() {
        return this.y2;
    }

    @Override
    public Color C() {
        Color color;
        try {
            color = this.yC ? this.y4.k() : this.yk;
        }
        catch (O_ o_2) {
            throw hr.a(o_2);
        }
        return color;
    }

    @Override
    public void G() {
        Color color;
        float f10;
        double d2;
        G5 g5;
        block16: {
            block15: {
                try {
                    if (!this.H()) break block15;
                    F8.C(this.G(), this.W(), this.w(), this.b(), this.y2.k(), this.yp);
                    break block16;
                }
                catch (O_ o_2) {
                    throw hr.a(o_2);
                }
            }
            try {
                if (this.s()) {
                    F8.C(this.G(), this.W(), this.w(), this.b(), new Color(100, 100, 100, 10), this.yp);
                }
            }
            catch (O_ o_3) {
                throw hr.a(o_3);
            }
        }
        try {
            if (this.yX != null) {
                F8.U(this.G(), this.W(), this.w(), this.b(), this.yX, this.yp, this.yY, 1.0f);
            }
        }
        catch (O_ o_4) {
            throw hr.a(o_4);
        }
        try {
            g5 = this.x() ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (O_ o_5) {
            throw hr.a(o_5);
        }
        G5 g52 = g5;
        double d3 = g52.B(this.OE);
        try {
            d2 = this.G() + this.w() / 2.0;
            f10 = this.yJ != null ? this.yf / 2.0f : 0.0f;
        }
        catch (O_ o_6) {
            throw hr.a(o_6);
        }
        double d4 = d2 + (double)f10;
        double d5 = this.W() + this.b() / 2.0 - d3 / 2.0 + 0.5;
        try {
            color = this.ys ? Rs.Q(this.y2.k(), 70, 240) : this.C();
        }
        catch (O_ o_7) {
            throw hr.a(o_7);
        }
        Color color2 = color;
        g52.Q(this.OE, d4, d5, color2);
        if (this.yJ != null) {
            float f11 = this.yf;
            double d6 = this.G() + this.w() / 2.0 - g52.D(this.OE) / 2.0 - (double)(f11 / 2.0f);
            F8.x(this.yJ, d6, this.W() + this.b() / 2.0, f11, f11, color2);
        }
    }

    public void P(Color color) {
        this.yG = color;
        this.y4 = new rn(0.0375, this.yk, color);
    }

    @Override
    public void l(boolean bl2) {
        try {
            if (this.s() != bl2) {
                this.y2.c();
                this.y4.c();
            }
        }
        catch (O_ o_2) {
            throw hr.a(o_2);
        }
        super.l(bl2);
    }

    public hr I(Color color) {
        this.yX = color;
        this.y2 = new rn(0.0375, new Color(0, 0, 0, 0), this.y2.Q());
        return this;
    }

    public void q(boolean bl2) {
        this.ys = bl2;
    }

    public hr(String string, double d2, Color color, Color color2) {
        this(string, d2, color, color2, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public hr(String string, Color color) {
        this(string, 0.9, null, color, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    @Override
    public double z() {
        return 0.0;
    }

    public hr(String string, double d2, Color color, Color color2, Color color3, float f10, float f11) {
        this(string, d2, color, color2, color3, f10, f11, 0.0, 0.0);
    }

    public void u(float f10) {
        this.yp = f10;
    }

    public void G(boolean bl2) {
        this.yC = bl2;
    }

    public void G(float f10) {
        this.yY = f10;
    }

    public ht Q(Color color, Color color2) {
        this.y2 = new rn(0.0375, color, color2);
        return super.Q(color);
    }

    public void N(String string) {
        this.yJ = string;
    }

    public hr A(Color color) {
        this.yk = color;
        this.y4 = new rn(0.0375, color, this.yG);
        return this;
    }

    public hr(String string, double d2, Color color, Color color2, double d3, double d4) {
        this(string, d2, color, color2, null, 2.0f, 1.0f, d3, d4);
    }

    public hr(String string, Color color, Color color2) {
        this(string, 0.9, color, color2, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public hr(String string, double d2, Color color) {
        this(string, d2, null, color, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    public void W(float f10) {
        this.yf = f10;
    }

    public hr(String string, double d2, Color color, Color color2, Color color3, float f10, float f11, double d3, double d4) {
        block11: {
            super(string, d2);
            this.yk = hr.M.n;
            this.yG = hr.M.n;
            this.yX = null;
            this.yY = 1.0f;
            this.yp = 2.0f;
            this.ys = true;
            this.yf = 8.0f;
            this.yC = false;
            if (color != null) {
                this.Q(color);
            }
            try {
                try {
                    this.y2 = new rn(0.0375, this.l(), color2);
                    this.y4 = new rn(0.0375, this.yk, this.yG);
                    if (color3 == null || color == null) break block11;
                }
                catch (O_ o_2) {
                    throw hr.a(o_2);
                }
                this.Q(color3, color);
            }
            catch (O_ o_3) {
                throw hr.a(o_3);
            }
        }
        try {
            this.yp = f10;
            this.yY = f11;
            if (d3 != 0.0) {
                this.T(d3);
            }
        }
        catch (O_ o_4) {
            throw hr.a(o_4);
        }
        try {
            if (d4 != 0.0) {
                this.w(d4);
            }
        }
        catch (O_ o_5) {
            throw hr.a(o_5);
        }
    }
}

