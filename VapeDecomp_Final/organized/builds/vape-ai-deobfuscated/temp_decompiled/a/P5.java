/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dn;
import a.Fm;
import a.pz;

public class p5
extends pz {
    private static final Fm j = new Fm();

    @Override
    public Fm getListeners() {
        return j;
    }

    public p5(Dn dn, float f10) {
        super(dn, f10);
    }

    public static Fm getEventListeners() {
        return j;
    }
}

