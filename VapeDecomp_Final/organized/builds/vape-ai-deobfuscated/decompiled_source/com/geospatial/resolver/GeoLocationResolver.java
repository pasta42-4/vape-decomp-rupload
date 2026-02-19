/*
 * Decompiled with CFR 0.152.
 */
package com.geospatial.resolver;

import a.GB;
import com.app.core.cache.CacheInvalidationPolicy;
import com.app.security.crypto.CryptographicKeyManager2325;
import com.graphics.rendering.RenderingCalibrationEngine;

public class GeoLocationResolver {
    private static CacheInvalidationPolicy M;
    private static GB l;
    private static String[] H;

    static {
        l = new RenderingCalibrationEngine();
        M = new CryptographicKeyManager2325();
        GeoLocationResolver.A(new String[2]);
    }

    public static GB Y() {
        return l;
    }

    public static void A(String[] stringArray) {
        H = stringArray;
    }

    public static String[] s() {
        return H;
    }
}

