/*
 * Decompiled with CFR 0.152.
 */
package com.vape.math;

import a.kg;

public class VapeGeometryCalculator {
    public static final double o = 2.6;

    public static double G(kg kg2, double d2, kg kg3, double d3, double d4, double d5, double d6, double d7, double d8) {
        return VapeGeometryCalculator.L(kg2.R(), kg2.L() + d2, kg2.U(), kg3.R(), kg3.L(), kg3.U(), d3, d4, d5, d6, d7, d8);
    }

    public static double L(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
        if (d14 == 0.0) {
            d14 = 1.0;
        }
        double d15 = d8 - d2;
        double d16 = d9 - d3;
        double d17 = d10 - d4;
        double d18 = Math.sqrt(d15 * d15 + d16 * d16 + d17 * d17);
        double d19 = d18 * d5 / d14;
        double d20 = d18 * d6 / d14;
        double d21 = d18 * d7 / d14;
        double d22 = 0.0;
        d22 += Math.max(Math.abs(d15 - d19) - (d11 / 2.0 + d13), 0.0);
        d22 += Math.max(Math.abs(d17 - d21) - (d11 / 2.0 + d13), 0.0);
        if ((d22 += Math.max(Math.abs(d16 - d20) - (d12 / 2.0 + d13), 0.0)) > 1.0) {
            d22 = Math.sqrt(d22);
        }
        return d22;
    }
}

