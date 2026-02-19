/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D;
import a.HK;
import a.JW;
import a.WW;
import a.XW;

class j
extends D {
    final XW v;
    final HK Q;
    final String J;

    @Override
    public void P(JW jW2) throws WW {
        block4: {
            try {
                try {
                    if (!jW2.g().equals(this.Q.B()) || !jW2.t().equals(this.Q.G())) break block4;
                }
                catch (WW wW2) {
                    throw j.a(wW2);
                }
                jW2.N(this.J);
            }
            catch (WW wW3) {
                throw j.a(wW3);
            }
        }
    }

    j(XW xW2, HK hK2, String string) {
        this.v = xW2;
        this.Q = hK2;
        this.J = string;
    }

    private static WW a(WW wW2) {
        return wW2;
    }
}

