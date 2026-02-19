/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.O_;
import a.Qg;
import a.aH;

public class au
extends aH {
    public double T;
    public double f;

    @Override
    public boolean C() {
        boolean bl2;
        block18: {
            block17: {
                block14: {
                    boolean bl3;
                    block16: {
                        block15: {
                            double d2;
                            double d3;
                            Qg qg2 = EP.U();
                            double[] dArray = new double[]{qg2.F(), qg2.V(), qg2.B()};
                            try {
                                au au2 = this;
                                d3 = this.B() ? 0.0 : this.f - dArray[0];
                            }
                            catch (O_ o_2) {
                                throw au.b(o_2);
                            }
                            try {
                                au2.r = d3;
                                au au3 = this;
                                d2 = this.H() ? 0.0 : this.T - dArray[2];
                            }
                            catch (O_ o_3) {
                                throw au.b(o_3);
                            }
                            try {
                                try {
                                    try {
                                        au3.t = d2;
                                        if (!this.N()) break block14;
                                        if (!(Math.abs(this.r) <= 0.1)) break block15;
                                    }
                                    catch (O_ o_4) {
                                        throw au.b(o_4);
                                    }
                                    if (!(Math.abs(this.t) <= 0.1)) break block15;
                                }
                                catch (O_ o_5) {
                                    throw au.b(o_5);
                                }
                                bl3 = true;
                                break block16;
                            }
                            catch (O_ o_6) {
                                throw au.b(o_6);
                            }
                        }
                        bl3 = false;
                    }
                    return bl3;
                }
                try {
                    try {
                        if (!(Math.abs(this.r) <= this.I()) || !(Math.abs(this.t) <= this.I())) break block17;
                    }
                    catch (O_ o_7) {
                        throw au.b(o_7);
                    }
                    bl2 = true;
                    break block18;
                }
                catch (O_ o_8) {
                    throw au.b(o_8);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public void j(double d2, double d3) {
        this.f = d2;
        this.T = d3;
    }

    public au(double d2, double d3) {
        this.f = d2;
        this.T = d3;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }
}

