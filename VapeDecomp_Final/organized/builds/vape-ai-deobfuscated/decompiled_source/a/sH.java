/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.system.config.ConfigurationEnumerator;

class sH {
    static final int[] w = new int[ConfigurationEnumerator.values().length];

    static {
        try {
            sH.w[ConfigurationEnumerator.EQUALS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.DOES_NOT_EQUAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.MATCH_REGEX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.DOES_NOT_MATCH_REGEX.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.CONTAINS.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.IS_IN.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.DOES_NOT_CONTAIN.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sH.w[ConfigurationEnumerator.IS_NOT_IN.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

