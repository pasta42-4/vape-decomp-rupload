/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.kT;

class rj {
    static final int[] z = new int[kT.values().length];

    static {
        try {
            rj.z[kT.PROXIMA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rj.z[kT.ARIAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rj.z[kT.NOTO.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

