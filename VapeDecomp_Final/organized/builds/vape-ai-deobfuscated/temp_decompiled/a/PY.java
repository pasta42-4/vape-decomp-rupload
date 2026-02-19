/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.SE;
import a.jD;

public class py
extends KG {
    private static final Fm M = new Fm();

    @Override
    public boolean fire() {
        block4: {
            jD jD2 = SE.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (O_ o_2) {
                    throw py.a(o_2);
                }
                return false;
            }
            catch (O_ o_3) {
                throw py.a(o_3);
            }
        }
        this.setCanceled(true);
        return true;
    }

    public static Fm getEventListeners() {
        return M;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public Fm getListeners() {
        return M;
    }
}

