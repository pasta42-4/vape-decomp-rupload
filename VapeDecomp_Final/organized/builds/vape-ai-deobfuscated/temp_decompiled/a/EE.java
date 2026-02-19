/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._H;
import a.a4;
import a.eF;
import a.eR;

public class ee
extends eF {
    private static final long serialVersionUID = 1L;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.J(this);
    }

    public ee(eR eR2) {
        super(eR2);
    }

    public int S() {
        int n2;
        block4: {
            n2 = this.U();
            try {
                try {
                    if (n2 != 1 || this.l() != null) break block4;
                }
                catch (O_ o_2) {
                    throw ee.a(o_2);
                }
                return 0;
            }
            catch (O_ o_3) {
                throw ee.a(o_3);
            }
        }
        return n2;
    }

    @Override
    public String v() {
        return "array";
    }
}

