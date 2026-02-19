/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.debugging.errors.DecompilationErrorEnum;

class C {
    static final int[] k = new int[DecompilationErrorEnum.values().length];

    static {
        try {
            C.k[DecompilationErrorEnum.EQUALS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C.k[DecompilationErrorEnum.NOT_EQUAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C.k[DecompilationErrorEnum.GREATER_THAN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C.k[DecompilationErrorEnum.GREATHER_THAN_OR_EQUAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C.k[DecompilationErrorEnum.LESS_THAN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C.k[DecompilationErrorEnum.LESS_THAN_OR_EQUAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

