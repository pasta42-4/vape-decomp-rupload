/*
 * Decompiled with CFR 0.152.
 */
package com.performance.caching;

import com.system.parameters.SystemParameterConfiguration;

class CacheManagementService {
    static final int[] z = new int[SystemParameterConfiguration.values().length];

    static {
        try {
            CacheManagementService.z[SystemParameterConfiguration.PROXIMA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CacheManagementService.z[SystemParameterConfiguration.ARIAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CacheManagementService.z[SystemParameterConfiguration.NOTO.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

