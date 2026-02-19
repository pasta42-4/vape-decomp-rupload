/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.SE;

public class p3
extends KG {
    private static final Fm v = new Fm();

    @Override
    public boolean fire() {
        try {
            if (!SE.h.V()) {
                this.setCanceled(true);
            }
        }
        catch (O_ o_2) {
            throw p3.a(o_2);
        }
        return super.fire();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public Fm getListeners() {
        return v;
    }

    public static Fm getEventListeners() {
        return v;
    }
}

