/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ay;
import a.EB;
import a.NA;
import a.O_;
import a.Qg;
import a._Y;
import a.oo;
import a.sy;
import a.vT;

class N4
extends NA {
    boolean q;
    final int O;
    final double[] V;
    final Ay y;

    private static O_ d(O_ o_2) {
        return o_2;
    }

    @Override
    public void H(Qg qg2, EB eB2) {
        block7: {
            block8: {
                try {
                    if (eB2.r()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw N4.d(o_2);
                }
                this.l();
                this.x();
                oo oo2 = Ay.z(this.y, this.O);
                try {
                    try {
                        if (!_Y.u(oo2, new vT(sy.Q(this.V[0]), sy.Q(this.V[1]), sy.Q(this.V[2])))) break block7;
                        if (this.q) break block8;
                    }
                    catch (O_ o_3) {
                        throw N4.d(o_3);
                    }
                    this.L(this.y.J(this.O));
                    this.q = true;
                }
                catch (O_ o_4) {
                    throw N4.d(o_4);
                }
            }
            this.q();
        }
    }

    N4(Ay ay2, double d2, double d3, double d4, int n2, double[] dArray) {
        this.y = ay2;
        this.O = n2;
        this.V = dArray;
        super(d2, d3, d4);
        this.q = false;
    }
}

