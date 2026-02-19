/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Ne;
import a.O_;

public class tp
extends Hc {
    public void m(boolean bl2) {
        block4: {
            block5: {
                boolean bl3 = tp.U.u().k3.w(this.H);
                try {
                    try {
                        if (bl2 == bl3) break block4;
                        tp.U.u().k3.U(this.H, bl2);
                        if (!bl2) break block5;
                    }
                    catch (O_ o_2) {
                        throw tp.a(o_2);
                    }
                    Ne.h.y(tp.U.u().k3.h(this.H));
                    break block4;
                }
                catch (O_ o_3) {
                    throw tp.a(o_3);
                }
            }
            Ne.h.z(tp.U.u().k3.h(this.H));
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void Y() {
        this.m(true);
    }

    public tp(Object object) {
        super(object);
    }

    public void p() {
        this.m(false);
    }
}

