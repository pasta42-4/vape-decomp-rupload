/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.security.config.CryptoAlgorithmConfiguration;

class CommunicationProtocolValidator {
    static final int[] J = new int[CryptoAlgorithmConfiguration.values().length];

    static {
        try {
            CommunicationProtocolValidator.J[CryptoAlgorithmConfiguration.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationProtocolValidator.J[CryptoAlgorithmConfiguration.TOO_MANY_INVITES.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationProtocolValidator.J[CryptoAlgorithmConfiguration.NOT_ONLINE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationProtocolValidator.J[CryptoAlgorithmConfiguration.ALREADY_INVITED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationProtocolValidator.J[CryptoAlgorithmConfiguration.FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

