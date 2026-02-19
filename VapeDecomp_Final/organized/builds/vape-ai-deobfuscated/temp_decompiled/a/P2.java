/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;

@Deprecated
public class p2
extends KG {
    private static final Fm s = new Fm();

    @Override
    public Fm getListeners() {
        return s;
    }

    public static Fm getEventListeners() {
        return s;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

