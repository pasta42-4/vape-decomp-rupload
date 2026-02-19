/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.jU;
import a.yE;
import a.yH;

class yn
extends yE {
    final yH XP;
    final jU[] XA;

    @Override
    public void d() {
        block12: {
            int n2;
            block11: {
                super.d();
                n2 = 0;
                for (jU jU2 : this.XA) {
                    try {
                        if (!jU2.s().booleanValue()) continue;
                        ++n2;
                    }
                    catch (O_ o_2) {
                        throw yn.b(o_2);
                    }
                }
                try {
                    try {
                        if (n2 <= 0 || !this.j()) break block11;
                    }
                    catch (O_ o_3) {
                        throw yn.b(o_3);
                    }
                    this.c(false);
                    break block12;
                }
                catch (O_ o_4) {
                    throw yn.b(o_4);
                }
            }
            try {
                try {
                    if (n2 != 0 || this.j()) break block12;
                }
                catch (O_ o_5) {
                    throw yn.b(o_5);
                }
                this.c(true);
            }
            catch (O_ o_6) {
                throw yn.b(o_6);
            }
        }
    }

    @Override
    public void Z() {
        boolean bl2;
        boolean bl3 = this.j();
        try {
            bl2 = !bl3;
        }
        catch (O_ o_2) {
            throw yn.b(o_2);
        }
        boolean bl4 = bl2;
        super.Z();
        for (jU jU2 : this.XA) {
            boolean bl5;
            jU jU3;
            try {
                jU3 = jU2;
                bl5 = !bl4;
            }
            catch (O_ o_3) {
                throw yn.b(o_3);
            }
            jU3.H(bl5);
        }
    }

    yn(yH yH2, String string, double d2, jU jU2, jU[] jUArray) {
        this.XP = yH2;
        this.XA = jUArray;
        super(string, d2, jU2);
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }
}

