/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationEngine351;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Random;

public class EventDispatchCoordinator1159 {
    private static final HashMap<Integer, Color> s = new LinkedHashMap<Integer, Color>();

    public static int H(Color color) {
        double d2 = (double)(color.getRed() * color.getRed()) * 0.241;
        double d3 = (double)(color.getGreen() * color.getGreen()) * 0.691;
        double d4 = (double)(color.getBlue() * color.getBlue()) * 0.068;
        double d5 = Math.sqrt(d2 + d3 + d4);
        return (int)d5;
    }

    public static Color r(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        if (f2 == 0.0f) {
            f5 = f6 = f3;
            f4 = f6;
        } else {
            float f7;
            try {
                f7 = (double)f3 < 0.5 ? f3 * (1.0f + f2) : f3 + f2 - f3 * f2;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1159.a(customSystemException);
            }
            float f8 = f7;
            float f9 = 2.0f * f3 - f8;
            f4 = EventDispatchCoordinator1159.a(f9, f8, f + 0.33333334f);
            f5 = EventDispatchCoordinator1159.a(f9, f8, f);
            f6 = EventDispatchCoordinator1159.a(f9, f8, f - 0.33333334f);
        }
        return new Color(Math.round(f4 * 255.0f), Math.round(f5 * 255.0f), Math.round(f6 * 255.0f));
    }

    public static int c(int n) {
        return EventDispatchCoordinator1159.S(n, n, n, 255);
    }

    public static int t(Color color) {
        return EventDispatchCoordinator1159.S(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static Color b(float f, float f2, float f3) {
        return EventDispatchCoordinator1159.f(f, f2, f3, 4);
    }

    public static int R(int n, int n2, boolean bl, double d2) {
        int n3;
        int n4;
        int n5;
        try {
            n5 = bl ? n : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        int n6 = n5;
        try {
            n4 = bl ? n2 : n;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        int n7 = n4;
        try {
            if (NumericComputationEngine351.o(n6, n7) >= d2) {
                return n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        double[] dArray = new double[3];
        try {
            n3 = bl ? n6 : n7;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        NumericComputationEngine351.c(n3, dArray);
        double d3 = 0.0;
        double d4 = dArray[0];
        double d5 = dArray[1];
        double d6 = dArray[2];
        int n8 = 0;
        while (true) {
            try {
                if (n8 >= 15 || !(d4 - d3 > 1.0E-5)) break;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1159.a(customSystemException);
            }
            double d7 = (d3 + d4) / 2.0;
            if (bl) {
                n6 = NumericComputationEngine351.v(d7, d5, d6);
            } else {
                n7 = NumericComputationEngine351.v(d7, d5, d6);
            }
            if (NumericComputationEngine351.o(n6, n7) > d2) {
                d3 = d7;
            } else {
                d4 = d7;
            }
            ++n8;
        }
        return NumericComputationEngine351.v(d3, d5, d6);
    }

    public static Color I(Color color, int n, int n2, boolean bl) {
        double d2;
        int n3;
        block8: {
            block7: {
                n3 = EventDispatchCoordinator1159.H(color);
                try {
                    try {
                        if (bl || !TemporalMetadataResolver.h.a().q.j()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator1159.a(customSystemException);
                    }
                    d2 = 0.0;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1159.a(customSystemException);
                }
            }
            d2 = 130.0;
        }
        double d3 = d2;
        try {
            if ((double)n3 > d3) {
                return new Color(n, n, n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        return new Color(n2, n2, n2);
    }

    public static int T(int n, int n2, boolean bl, double d2) {
        int n3;
        int n4;
        int n5;
        int n6;
        try {
            n6 = bl ? n : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        int n7 = n6;
        try {
            n5 = bl ? n2 : n;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        int n8 = n5;
        try {
            if (NumericComputationEngine351.o(n7, n8) >= d2) {
                return n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        float[] fArray = new float[3];
        try {
            n4 = bl ? n7 : n8;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        NumericComputationEngine351.C(n4, fArray);
        float f = fArray[2];
        float f2 = 1.0f;
        int n9 = 0;
        while (true) {
            float f3;
            try {
                if (n9 >= 15 || !((double)(f2 - f) > 1.0E-5)) break;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1159.a(customSystemException);
            }
            fArray[2] = f3 = (f + f2) / 2.0f;
            if (bl) {
                n7 = NumericComputationEngine351.x(fArray);
            } else {
                n8 = NumericComputationEngine351.x(fArray);
            }
            if (NumericComputationEngine351.o(n7, n8) > d2) {
                f2 = f3;
            } else {
                f = f3;
            }
            ++n9;
        }
        try {
            n3 = bl ? n7 : n8;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        return n3;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static float a(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        try {
            if (6.0f * f3 < 1.0f) {
                return f + (f2 - f) * 6.0f * f3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        try {
            if (2.0f * f3 < 1.0f) {
                return f2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        try {
            if (3.0f * f3 < 2.0f) {
                return f + (f2 - f) * 6.0f * (0.6666667f - f3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        return f;
    }

    public static int Z(int n, int n2, int n3) {
        return EventDispatchCoordinator1159.S(n, n2, n3, 255);
    }

    public static Color y(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public static int c(int n, int n2) {
        return EventDispatchCoordinator1159.S(n, n, n, n2);
    }

    public static Color u() {
        return EventDispatchCoordinator1159.b(AdaptiveComputationEngine.z(new Random(), 0.0f, 1.0f), 0.9f, 0.9f);
    }

    public static boolean Q(Color color) {
        boolean bl;
        int n = EventDispatchCoordinator1159.H(color);
        double d2 = 130.0;
        try {
            bl = !((double)n > d2);
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        return bl;
    }

    public static Color V() {
        return EventDispatchCoordinator1159.Q(TemporalMetadataResolver.h.a().q.L(), 45, 240);
    }

    public static Color f(float f, float f2, float f3, int n) {
        int n2 = Objects.hash(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), n);
        Color color = s.get(n2);
        try {
            if (color != null) {
                return color;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1159.a(customSystemException);
        }
        Color color2 = Color.getHSBColor(f, f2, f3);
        Color color3 = new Color(EventDispatchCoordinator1159.T(color2.getRGB(), new Color(45, 45, 45).getRGB(), true, n));
        s.put(n2, color3);
        return color3;
    }

    public static Color Q(Color color, int n, int n2) {
        return EventDispatchCoordinator1159.I(color, n, n2, false);
    }

    public static int S(int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 |= AdaptiveComputationEngine.X(n4, 0, 255) << 24;
        n5 |= AdaptiveComputationEngine.X(n, 0, 255) << 16;
        n5 |= AdaptiveComputationEngine.X(n2, 0, 255) << 8;
        return n5 |= AdaptiveComputationEngine.X(n3, 0, 255);
    }

    public static Color P(Color color, double d2) {
        double d3 = Math.max(0.0, Math.min(255.0, (double)color.getRed() + d2));
        double d4 = Math.max(0.0, Math.min(255.0, (double)color.getGreen() + d2));
        double d5 = Math.max(0.0, Math.min(255.0, (double)color.getBlue() + d2));
        return new Color((int)d3, (int)d4, (int)d5, color.getAlpha());
    }
}

