/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Dg;
import a.Fm;
import a.KG;
import org.jetbrains.annotations.Nullable;

public class p6
extends KG {
    private static final Fm a = new Fm();
    @Nullable
    private final Dg s;
    @Nullable
    private final Dg m;

    @Override
    public Fm getListeners() {
        return a;
    }

    public static Fm getEventListeners() {
        return a;
    }

    @Nullable
    public Dg getPreviousWorld() {
        return this.s;
    }

    public p6(@Nullable Dg dg, @Nullable Dg dg2) {
        this.s = dg;
        this.m = dg2;
    }

    @Nullable
    public Dg getNewWorld() {
        return this.m;
    }
}

