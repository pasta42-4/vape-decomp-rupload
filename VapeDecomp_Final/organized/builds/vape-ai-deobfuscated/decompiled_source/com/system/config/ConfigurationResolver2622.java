/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import com.security.config.CryptoAlgorithmConfiguration;

class ConfigurationResolver2622 {
    static final int[] c = new int[CryptoAlgorithmConfiguration.values().length];

    static {
        try {
            ConfigurationResolver2622.c[CryptoAlgorithmConfiguration.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationResolver2622.c[CryptoAlgorithmConfiguration.TOO_MANY_INVITES.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationResolver2622.c[CryptoAlgorithmConfiguration.NOT_ONLINE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationResolver2622.c[CryptoAlgorithmConfiguration.ALREADY_INVITED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationResolver2622.c[CryptoAlgorithmConfiguration.FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

