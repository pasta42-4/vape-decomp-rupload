/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D;
import a.HK;
import a.JW;
import a.WW;
import a.XW;
import java.util.concurrent.atomic.AtomicInteger;

class x
extends D {
    final AtomicInteger n;
    final XW Z;
    final HK Q;

    private static WW a(WW wW2) {
        return wW2;
    }

    x(XW xW2, HK hK2, AtomicInteger atomicInteger) {
        this.Z = xW2;
        this.Q = hK2;
        this.n = atomicInteger;
    }

    @Override
    public void P(JW jW2) throws WW {
        block4: {
            try {
                try {
                    if (!jW2.g().equals(this.Q.B()) || !jW2.t().equals(this.Q.G())) break block4;
                }
                catch (WW wW2) {
                    throw x.a(wW2);
                }
                this.n.set(jW2.H());
            }
            catch (WW wW3) {
                throw x.a(wW3);
            }
        }
    }
}

