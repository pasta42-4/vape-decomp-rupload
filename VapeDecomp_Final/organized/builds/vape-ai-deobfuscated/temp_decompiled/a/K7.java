/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.cg;

class k7 {
    static final int[] Y = new int[cg.values().length];

    static {
        try {
            k7.Y[cg.RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[cg.LEFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[cg.VERTICAL_CENTRE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[cg.BOTTOM.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[cg.TOP.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[cg.HORIZONTAL_CENTRE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

