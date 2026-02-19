/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dn;
import a.Fm;
import a.pz;

public class po
extends pz {
    private static final Fm D = new Fm();

    @Override
    public Fm getListeners() {
        return D;
    }

    public po(Dn dn, float f10) {
        super(dn, f10);
    }

    public static Fm getEventListeners() {
        return D;
    }
}

