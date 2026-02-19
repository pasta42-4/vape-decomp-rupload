/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Cb;
import a.F8;
import a.O_;
import a.bM;
import a.yC;
import a.yG;
import a.yM;

class wq
extends yG {
    final yC ZR;
    final yM Zg;
    final yC Z_;
    final Cb ZO;
    final bM Zb;

    wq(yM yM2, double d2, double d3, bM bM2, yC yC2, Cb cb2, yC yC3) {
        this.Zg = yM2;
        this.Zb = bM2;
        this.ZR = yC2;
        this.ZO = cb2;
        this.Z_ = yC3;
        super(d2, d3);
    }

    @Override
    public void E() {
        block15: {
            boolean bl2;
            yC yC2;
            block17: {
                block16: {
                    boolean bl3;
                    yC yC3;
                    block14: {
                        block13: {
                            boolean bl4;
                            bM bM2;
                            try {
                                this.Zb.b(this.G() + this.w() / 2.0 - this.Zb.u() / 2.0);
                                this.Zb.M(this.W() + 18.0);
                                this.ZR.b(this.Zb.G() - 8.0);
                                this.ZR.M(this.Zb.W() + 1.0);
                                this.ZO.b(this.G() + this.w() / 2.0 - this.ZO.w() / 2.0);
                                this.ZO.M(this.Zb.W() - 8.0);
                                bM2 = this.Zb;
                                bl4 = !this.ZO.f();
                            }
                            catch (O_ o_2) {
                                throw wq.a(o_2);
                            }
                            try {
                                try {
                                    bM2.N(bl4);
                                    yC3 = this.ZR;
                                    if (this.ZO.f() || !this.s()) break block13;
                                }
                                catch (O_ o_3) {
                                    throw wq.a(o_3);
                                }
                                bl3 = true;
                                break block14;
                            }
                            catch (O_ o_4) {
                                throw wq.a(o_4);
                            }
                        }
                        bl3 = false;
                    }
                    try {
                        try {
                            yC3.N(bl3);
                            if (this.Z_ == null) break block15;
                            this.Z_.b(this.Zb.G() + this.Zb.w() + 3.0);
                            this.Z_.M(this.Zb.W() + 1.0);
                            yC2 = this.Z_;
                            if (this.ZO.f()) break block16;
                        }
                        catch (O_ o_5) {
                            throw wq.a(o_5);
                        }
                        bl2 = true;
                        break block17;
                    }
                    catch (O_ o_6) {
                        throw wq.a(o_6);
                    }
                }
                bl2 = false;
            }
            yC2.N(bl2);
        }
        try {
            super.E();
            if (this.ZO.f()) {
                F8.r(this.ZO.G() + 10.0, this.ZO.W() + 17.0, this.ZO.w() - 31.0, 1.0f, wq.M.k);
            }
        }
        catch (O_ o_7) {
            throw wq.a(o_7);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

