/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ts;

class kt {
    static final int[] p = new int[Ts.values().length];

    static {
        try {
            kt.p[Ts.HAS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kt.p[Ts.LEVEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kt.p[Ts.DURATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

