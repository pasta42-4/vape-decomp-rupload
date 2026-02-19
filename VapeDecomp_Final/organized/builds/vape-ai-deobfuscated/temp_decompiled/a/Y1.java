/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.F8;
import a.G5;
import a.O_;
import a.ht;
import a.ik;
import a.yE;

public class y1
extends yE {
    private String yp;
    private int yK;
    private Class yE;

    public void E(Class clazz) {
        this.yE = clazz;
        this.l(new ik(this, clazz));
    }

    @Override
    protected void V() {
        block6: {
            try {
                try {
                    try {
                        if (this.yE == null || ((ht)Ao.D(this.yE)).f() == this.j()) break block6;
                    }
                    catch (O_ o_2) {
                        throw y1.b(o_2);
                    }
                    if (this.T()) break block6;
                }
                catch (O_ o_3) {
                    throw y1.b(o_3);
                }
                this.X();
            }
            catch (O_ o_4) {
                throw y1.b(o_4);
            }
        }
        super.V();
    }

    @Override
    protected void I() {
        G5 g5 = this.L(this.b5);
        double d2 = g5.B(this.be);
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        F8.x(this.yp, this.G() + 5.0 + 4.0, this.W() + this.b() / 2.0, this.yK, this.yK, this.bj);
        g5.R(this.be, this.G() + (double)this.yK + 10.0, d3, this.bj);
    }

    @Override
    public double z() {
        return 20.0;
    }

    public y1(String string, String string2, double d2, int n2) {
        super(string, d2);
        this.yp = string2;
        this.yK = n2;
        this.m(true);
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }
}

