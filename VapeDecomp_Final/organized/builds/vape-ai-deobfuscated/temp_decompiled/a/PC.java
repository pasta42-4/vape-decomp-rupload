/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.QF;

public class pc
extends KG {
    private final boolean M;
    private final QF j;
    private static final Fm g = new Fm();

    @Override
    public Fm getListeners() {
        return g;
    }

    public pc(Object object, boolean bl2) {
        this.j = new QF(object);
        this.M = bl2;
    }

    public boolean isNewStateSprinting() {
        return this.M;
    }

    public QF getEntity() {
        return this.j;
    }

    public static Fm getEventListeners() {
        return g;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

