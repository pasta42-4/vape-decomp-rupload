/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.Hc;
import a.O_;
import a.P_;
import a.QF;
import a.kX;

public class o_
extends Hc {
    public o_(Object object) {
        super(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String a() {
        block7: {
            Object object;
            Object object2;
            P_ p_2;
            QF qF2;
            QF qF3;
            block9: {
                block8: {
                    try {
                        try {
                            QF qF4;
                            if (kX.C() < 23) break block7;
                            qF3 = qF4;
                            qF2 = qF4;
                            p_2 = o_.U.u().ke;
                            object2 = this.H;
                            if (kX.C() < 37) break block8;
                        }
                        catch (O_ o_2) {
                            throw o_.a(o_2);
                        }
                        object = EP.c().M();
                        break block9;
                    }
                    catch (O_ o_3) {
                        throw o_.a(o_3);
                    }
                }
                object = null;
            }
            qF3(P_.l(p_2, object2, object));
            QF qF5 = qF2;
            try {
                if (qF5.r()) {
                    return qF5.e();
                }
            }
            catch (O_ o_4) {
                throw o_.a(o_4);
            }
            return "";
        }
        return P_.N(o_.U.u().ke, this.H);
    }
}

