/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.validation.core.ObjectReferenceValidator;

class DataEncryptor {
    static final int[] j = new int[ObjectReferenceValidator.values().length];

    static {
        try {
            DataEncryptor.j[ObjectReferenceValidator.WELCOME.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DataEncryptor.j[ObjectReferenceValidator.COMPLETED_ALL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DataEncryptor.j[ObjectReferenceValidator.COMPLETED_TUTORIAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

