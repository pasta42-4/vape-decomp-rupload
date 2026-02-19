/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.Qh;
import a.eM;

public class pv
extends KG {
    private Qh j;
    private final Object z;
    private static final Fm i = new Fm();

    public static Fm getEventListeners() {
        return i;
    }

    public Qh getPlayer() {
        try {
            if (this.j == null) {
                this.j = new Qh(this.z);
            }
        }
        catch (O_ o_2) {
            throw pv.a(o_2);
        }
        return this.j;
    }

    @Override
    public boolean fire() {
        try {
            if (!eM.rl.isInstance(this.z)) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw pv.a(o_2);
        }
        return super.fire();
    }

    pv(Object object) {
        this.z = object;
    }

    @Override
    public Fm getListeners() {
        return i;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

