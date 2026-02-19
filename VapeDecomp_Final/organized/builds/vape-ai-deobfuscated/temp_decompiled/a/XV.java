/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ap;
import a.EP;
import a.Hv;
import a.OY;
import a.O_;
import a.Qg;
import a.pf;
import a.x4;
import a.xi;

public class xv
extends x4<Ap> {
    private final Ap O = (Ap)this.n();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void R(pf pf2) {
        Qg qg2;
        block8: {
            qg2 = EP.U();
            try {
                if (qg2.F()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw xv.a(o_2);
            }
            try {
                try {
                    if (qg2.u() == 0.0f && qg2.w() == 0.0f) break block8;
                }
                catch (O_ o_3) {
                    throw xv.a(o_3);
                }
                if (!qg2.D()) break block8;
            }
            catch (O_ o_4) {
                throw xv.a(o_4);
            }
            double d2 = 0.42f;
            if (qg2.e(Hv.T)) {
                d2 += (double)((float)(qg2.W(Hv.T).y() + 1) * 0.1f);
            }
            pf2.setY(d2);
            qg2.z(d2);
        }
        this.O.e(pf2, 0.4199999976158142, qg2);
    }

    public xv(xi xi2, String string) {
        super(xi2, string);
    }
}

