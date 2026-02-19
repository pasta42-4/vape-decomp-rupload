/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import com.data.encoding.NumericEncodingSpecification;
import com.security.protocols.CryptoProtocolEnum;

class ConfigurationUtility {
    static final int[] u;
    static final int[] r;

    static {
        r = new int[CryptoProtocolEnum.values().length];
        try {
            ConfigurationUtility.r[CryptoProtocolEnum.TOP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationUtility.r[CryptoProtocolEnum.BOTTOM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationUtility.r[CryptoProtocolEnum.LEFT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationUtility.r[CryptoProtocolEnum.RIGHT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        u = new int[NumericEncodingSpecification.values().length];
        try {
            ConfigurationUtility.u[NumericEncodingSpecification.BOTTOM_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationUtility.u[NumericEncodingSpecification.TOP_LEFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ConfigurationUtility.u[NumericEncodingSpecification.OFFSET.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

