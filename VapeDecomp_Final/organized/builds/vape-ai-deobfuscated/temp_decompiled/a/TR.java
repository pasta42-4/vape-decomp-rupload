/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.O_;
import a.eM;
import a.kX;
import a.qs;

public class tr
extends Hc {
    public boolean d() {
        block4: {
            try {
                try {
                    if (kX.C() < 35 || eM.rP.isInstance(this.M())) break block4;
                }
                catch (O_ o_2) {
                    throw tr.a(o_2);
                }
                return false;
            }
            catch (O_ o_3) {
                throw tr.a(o_3);
            }
        }
        return qs.H(tr.U.u().k5, this.H);
    }

    public tr(Object object) {
        super(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

