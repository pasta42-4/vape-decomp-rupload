/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Cb;
import a.O_;
import a.Rs;
import a.rk;
import java.awt.Color;

public abstract class bl
extends Cb {
    private rk Yd = new rk(0.15, 0.0, 100.0);
    protected boolean Y6;
    protected boolean YH;
    private double Yw = 0.0;

    public abstract void u();

    @Override
    public double e() {
        return this.I();
    }

    @Override
    public void g() {
        try {
            if (!this.YH) {
                this.YH = true;
                this.Yd.c();
            }
        }
        catch (O_ o_2) {
            throw bl.a(o_2);
        }
    }

    @Override
    public void d() {
        block14: {
            block13: {
                block12: {
                    try {
                        try {
                            if (this.s() || !this.YH) break block12;
                        }
                        catch (O_ o_2) {
                            throw bl.a(o_2);
                        }
                        this.YH = false;
                        this.Yd.c();
                    }
                    catch (O_ o_3) {
                        throw bl.a(o_3);
                    }
                }
                try {
                    try {
                        if (this.d() || !this.Y6) break block13;
                    }
                    catch (O_ o_4) {
                        throw bl.a(o_4);
                    }
                    this.Y6 = false;
                    this.O();
                }
                catch (O_ o_5) {
                    throw bl.a(o_5);
                }
            }
            try {
                try {
                    if (!this.d() || this.Y6) break block14;
                }
                catch (O_ o_6) {
                    throw bl.a(o_6);
                }
                this.Y6 = true;
                this.u();
            }
            catch (O_ o_7) {
                throw bl.a(o_7);
            }
        }
    }

    public bl() {
        super("");
    }

    public Color Z() {
        try {
            if (this.d()) {
                return Rs.y(bl.M.S, (int)this.Yd.p());
            }
        }
        catch (O_ o_2) {
            throw bl.a(o_2);
        }
        return Rs.y(bl.M.S, this.Yd.t().intValue());
    }

    @Override
    public double z() {
        return 6.0;
    }

    public boolean N() {
        return this.Y6;
    }

    @Override
    public double I() {
        return 15.0;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

