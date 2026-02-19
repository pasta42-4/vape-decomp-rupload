/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CO;
import a.IG;
import a.O_;
import a.fW;
import a.fz;
import a.yQ;

class cm
implements IG {
    final CO I;

    cm(CO cO2) {
        this.I = cO2;
    }

    @Override
    public void R() {
        boolean bl2;
        fz fz2;
        fW fW2;
        fz fz3;
        block9: {
            fz3 = Ao.D(fz.class);
            fW2 = Ao.D(fW.class);
            try {
                try {
                    if (fz3 != null && fW2 != null) break block9;
                }
                catch (O_ o_2) {
                    throw cm.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw cm.a(o_3);
            }
        }
        try {
            fz2 = fz3;
            bl2 = !fz3.f();
        }
        catch (O_ o_4) {
            throw cm.a(o_4);
        }
        try {
            fz2.r(bl2, false);
            if (fz3.f()) {
                fz3.R();
            }
        }
        catch (O_ o_5) {
            throw cm.a(o_5);
        }
        fz3.b(fW2.G());
        fz3.M(fW2.W());
        fz3.A();
        ((yQ)fz3).d();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

