/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.security.crypto.CryptographicEnumRegistry;
import java.util.EnumMap;
import java.util.Map;

class GeometricCalculator1649 {
    private Map<CryptographicEnumRegistry, Double> L = new EnumMap<CryptographicEnumRegistry, Double>(CryptographicEnumRegistry.class);
    private CryptographicEnumRegistry f;
    private double A;
    private CryptographicEnumRegistry q;

    public double L() {
        return this.L.get((Object)CryptographicEnumRegistry.RIGHT) - this.L.get((Object)CryptographicEnumRegistry.LEFT);
    }

    public CryptographicEnumRegistry N() {
        return this.q;
    }

    public Map<CryptographicEnumRegistry, Double> F() {
        return this.L;
    }

    public double p() {
        return this.L.get((Object)CryptographicEnumRegistry.BOTTOM) - this.L.get((Object)CryptographicEnumRegistry.TOP);
    }

    public GeometricCalculator1649(double d2, double d3, double d4, double d5, CryptographicEnumRegistry cryptographicEnumRegistry, CryptographicEnumRegistry cryptographicEnumRegistry2, double d6) {
        this.L.put(CryptographicEnumRegistry.LEFT, d2);
        this.L.put(CryptographicEnumRegistry.TOP, d3);
        this.L.put(CryptographicEnumRegistry.RIGHT, d4);
        this.L.put(CryptographicEnumRegistry.BOTTOM, d5);
        this.f = cryptographicEnumRegistry;
        this.q = cryptographicEnumRegistry2;
        this.A = d6;
    }

    public double P() {
        return this.A;
    }

    public CryptographicEnumRegistry b() {
        return this.f;
    }
}

