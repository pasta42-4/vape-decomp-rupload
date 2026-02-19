/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.Qh;
import a.ob;

public class pl
extends KG {
    private ob I;
    private static final Fm t = new Fm();
    private final Qh E;

    @Override
    public boolean fire() {
        return super.fire();
    }

    public void setDisplayName(ob ob2) {
        this.I = ob2;
    }

    public ob getDisplayName() {
        return this.I;
    }

    @Override
    public Fm getListeners() {
        return t;
    }

    public pl(Qh qh2, ob ob2) {
        this.E = qh2;
        this.I = ob2;
    }

    public Qh getPlayer() {
        return this.E;
    }

    public static Fm getEventListeners() {
        return t;
    }
}

