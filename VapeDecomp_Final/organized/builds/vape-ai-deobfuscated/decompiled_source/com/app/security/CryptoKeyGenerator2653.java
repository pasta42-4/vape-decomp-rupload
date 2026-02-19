/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.security.config.CryptoConfigurationRegistry;

class CryptoKeyGenerator2653 {
    static final int[] p = new int[CryptoConfigurationRegistry.values().length];

    static {
        try {
            CryptoKeyGenerator2653.p[CryptoConfigurationRegistry.HAS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CryptoKeyGenerator2653.p[CryptoConfigurationRegistry.LEVEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CryptoKeyGenerator2653.p[CryptoConfigurationRegistry.DURATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

