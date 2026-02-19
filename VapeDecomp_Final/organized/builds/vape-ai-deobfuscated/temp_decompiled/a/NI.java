/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.As;
import a.DT;
import a.EB;
import a.NA;
import a.O_;
import a.Qg;
import a._Y;
import a.oo;

class Ni
extends NA {
    final As t;
    final oo I;

    Ni(As as2, DT dT, oo oo2) {
        this.t = as2;
        this.I = oo2;
        super(dT);
    }

    @Override
    public void H(Qg qg2, EB eB2) {
        block10: {
            try {
                if (eB2.r()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw Ni.d(o_2);
            }
            try {
                if (As.A(this.t) == null) {
                    return;
                }
            }
            catch (O_ o_3) {
                throw Ni.d(o_3);
            }
            boolean bl2 = As.j(this.t, As.A(this.t)).u().s();
            try {
                try {
                    this.l();
                    this.x();
                    if (!_Y.u(this.I, As.w(this.t)) || bl2) break block10;
                }
                catch (O_ o_4) {
                    throw Ni.d(o_4);
                }
                this.q();
            }
            catch (O_ o_5) {
                throw Ni.d(o_5);
            }
        }
    }

    private static O_ d(O_ o_2) {
        return o_2;
    }
}

