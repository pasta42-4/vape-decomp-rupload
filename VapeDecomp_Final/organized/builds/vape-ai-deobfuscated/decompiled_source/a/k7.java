/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.security.crypto.CryptographicEnumRegistry;

class k7 {
    static final int[] Y = new int[CryptographicEnumRegistry.values().length];

    static {
        try {
            k7.Y[CryptographicEnumRegistry.RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[CryptographicEnumRegistry.LEFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[CryptographicEnumRegistry.VERTICAL_CENTRE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[CryptographicEnumRegistry.BOTTOM.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[CryptographicEnumRegistry.TOP.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k7.Y[CryptographicEnumRegistry.HORIZONTAL_CENTRE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

