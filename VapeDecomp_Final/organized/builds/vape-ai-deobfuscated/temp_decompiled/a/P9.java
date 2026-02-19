/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;

public class p9
extends KG {
    public final float H;
    public final float K;
    private static final Fm M = new Fm();

    @Override
    public Fm getListeners() {
        return M;
    }

    public p9(float f10, float f11) {
        this.K = f10;
        this.H = f11;
    }

    public static Fm getEventListeners() {
        return M;
    }
}

