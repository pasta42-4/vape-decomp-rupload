/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.game.configuration.GameVersionEnumerator;

@Deprecated
public class GeometryCalculator {
    public static final int Y;
    public static final int a;
    public static final int C;
    public static final int z;
    public static final int x;
    private static String f;
    public static final int W;

    static {
        W = GameVersionEnumerator.MC_1_7_10.B();
        z = GameVersionEnumerator.MC_1_8_9.B();
        a = GameVersionEnumerator.MC_1_12_2.B();
        C = GameVersionEnumerator.MC_1_16_5.B();
        x = GameVersionEnumerator.MC_1_20_6.B();
        GeometryCalculator.g(null);
        Y = GameVersionEnumerator.MC_1_21_4.B();
    }

    public static void g(String string) {
        f = string;
    }

    public static String F() {
        return f;
    }

    public static int C() {
        return GameVersionEnumerator.u();
    }
}

