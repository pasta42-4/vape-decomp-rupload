/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.V4;

public class pe
extends KG {
    private final V4 D;
    private static final Fm g = new Fm();

    public pe(Object object) {
        this.D = new V4(object);
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public Fm getListeners() {
        return g;
    }

    public static Fm getEventListeners() {
        return g;
    }

    public V4 getItemStack() {
        return this.D;
    }
}

