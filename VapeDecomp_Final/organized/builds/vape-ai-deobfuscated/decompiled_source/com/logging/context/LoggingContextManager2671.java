/*
 * Decompiled with CFR 0.152.
 */
package com.logging.context;

import com.security.protocols.CryptoAlgorithmSpecification;

class LoggingContextManager2671 {
    static final int[] g = new int[CryptoAlgorithmSpecification.values().length];

    static {
        try {
            LoggingContextManager2671.g[CryptoAlgorithmSpecification.MINIMUM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            LoggingContextManager2671.g[CryptoAlgorithmSpecification.MAXIMUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

