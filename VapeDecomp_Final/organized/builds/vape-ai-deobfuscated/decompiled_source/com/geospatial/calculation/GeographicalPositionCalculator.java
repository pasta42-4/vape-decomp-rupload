/*
 * Decompiled with CFR 0.152.
 */
package com.geospatial.calculation;

import com.analytics.computation.MetricsCalculationEngine;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.spatial.mapping.CoordinateMapper;

public abstract class GeographicalPositionCalculator
extends AbstractComputationKernel {
    protected CoordinateMapper L;
    private boolean R;
    private static String[] B;
    protected final double v = 1.0;
    protected boolean Y;
    private String n;

    public static void a(String[] stringArray) {
        B = stringArray;
    }

    public GeographicalPositionCalculator(String string) {
        this.n = string;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String[] Y() {
        return B;
    }

    public String O() {
        return this.n;
    }

    public MetricsCalculationEngine K(double d2, double d3, double d4) {
        return new MetricsCalculationEngine(d2 - d4, d3 - d4, d4 * 2.0, d4 * 2.0);
    }

    public double f() {
        return GraphicsBufferAllocator.b().X - this.L.X;
    }

    public double f(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = (d3 - d2) / d6;
        double d9 = (d5 - d4) / d8;
        double d10 = d7 / d9;
        double d11 = d10 * d6;
        return Math.min(Math.max(d11 + d2, d2), d3);
    }

    static {
        if (GeographicalPositionCalculator.Y() != null) {
            GeographicalPositionCalculator.a(new String[3]);
        }
    }

    public double N() {
        return GraphicsBufferAllocator.b().I - this.L.I;
    }

    public void M(String string) {
        this.n = string;
    }

    public double G(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d7 / d4 * 100.0;
        try {
            if (d8 <= 0.0) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeographicalPositionCalculator.b(customSystemException);
        }
        try {
            if (d8 >= 100.0) {
                return d3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeographicalPositionCalculator.b(customSystemException);
        }
        d8 = Math.min(d8, 100.0);
        d8 = Math.max(d8, 0.0);
        double d9 = d6 * d8 + d6;
        double d10 = d9 % d5;
        double d11 = d9 - d10;
        return d11 + d2;
    }
}

