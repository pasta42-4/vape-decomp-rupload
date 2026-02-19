/*
 * Decompiled with CFR 0.152.
 */
package com.configuration.serialization;

import com.security.config.CryptoAlgorithmConfiguration;

class ConfigurationSerializer {
    static final int[] d = new int[CryptoAlgorithmConfiguration.values().length];

    static {
        try {
            ConfigurationSerializer.d[CryptoAlgorithmConfiguration.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationSerializer.d[CryptoAlgorithmConfiguration.TOO_MANY_INVITES.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationSerializer.d[CryptoAlgorithmConfiguration.NOT_ONLINE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationSerializer.d[CryptoAlgorithmConfiguration.ALREADY_INVITED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationSerializer.d[CryptoAlgorithmConfiguration.FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

