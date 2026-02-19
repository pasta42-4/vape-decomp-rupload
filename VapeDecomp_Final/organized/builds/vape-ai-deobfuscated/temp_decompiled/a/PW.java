/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.SE;
import a.jD;
import a.th;

public class pw
extends KG {
    private static final Fm y = new Fm();

    @Override
    public Fm getListeners() {
        return y;
    }

    public static Object getVisibility() {
        th th2 = new th(SE.h.u().dR.B.A(new Object[0]));
        th2.E(true);
        return th2.M();
    }

    public pw(Object object) {
    }

    public static Fm getEventListeners() {
        return y;
    }

    public pw() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean fire() {
        block4: {
            jD jD2 = SE.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (O_ o_2) {
                    throw pw.a(o_2);
                }
                return false;
            }
            catch (O_ o_3) {
                throw pw.a(o_3);
            }
        }
        this.setCanceled(true);
        return true;
    }
}

