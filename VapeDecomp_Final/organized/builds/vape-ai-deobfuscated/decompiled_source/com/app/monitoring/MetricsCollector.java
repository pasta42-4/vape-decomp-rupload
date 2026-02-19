/*
 * Decompiled with CFR 0.152.
 */
package com.app.monitoring;

import com.text.normalization.CharsetNormalizationEnum;

class MetricsCollector {
    static final int[] g = new int[CharsetNormalizationEnum.values().length];

    static {
        try {
            MetricsCollector.g[CharsetNormalizationEnum.IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            MetricsCollector.g[CharsetNormalizationEnum.EQUIPPING_ITEM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            MetricsCollector.g[CharsetNormalizationEnum.AIMING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            MetricsCollector.g[CharsetNormalizationEnum.CONSERVING_WATER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

