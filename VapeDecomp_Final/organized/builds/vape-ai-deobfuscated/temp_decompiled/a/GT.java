/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ta;

class Gt {
    static final int[] j = new int[Ta.values().length];

    static {
        try {
            Gt.j[Ta.IS_IN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Gt.j[Ta.IS_NOT_IN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

