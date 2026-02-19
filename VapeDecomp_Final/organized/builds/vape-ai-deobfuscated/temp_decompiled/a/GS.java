/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Gi;
import a.IG;
import a.O_;
import a.SE;
import a._8;
import a._L;
import a._q;
import a.bz;

class Gs
implements IG {
    final _q Z;
    final bz A;

    Gs(bz bz2, _q _q2) {
        this.A = bz2;
        this.Z = _q2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void R() {
        block4: {
            block3: {
                try {
                    if (!(this.Z instanceof _8)) break block3;
                    SE.h.j().y((_8)this.Z);
                    break block4;
                }
                catch (O_ o_2) {
                    throw Gs.a(o_2);
                }
            }
            if (this.Z instanceof _L) {
                _L _L2 = (_L)this.Z;
                _L2.p().f(false);
            }
        }
        Gi.v();
    }
}

