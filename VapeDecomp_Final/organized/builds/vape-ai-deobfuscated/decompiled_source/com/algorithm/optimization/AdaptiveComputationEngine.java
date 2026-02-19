/*
 * Decompiled with CFR 0.152.
 */
package com.algorithm.optimization;

import a.Dv;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AdaptiveComputationEngine {
    private static final Map e;
    private static final double l;
    private static final int[] M;
    private static final float[] d;
    private static final Integer[] c;
    private static final long[] b;
    private static final double[] C;
    private static final long a;
    private static final double[] A;
    private static boolean y;

    public static double T(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.sqrt(Math.pow(d2 - d5, 2.0) + Math.pow(d3 - d6, 2.0) + Math.pow(d4 - d7, 2.0));
    }

    public static double u(String string, double d2, double d3) {
        double d4 = d2;
        try {
            d4 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d4 < d3) {
            d4 = d3;
        }
        return d4;
    }

    public static final float l(float f) {
        return (float)Math.sqrt(f);
    }

    public static int s(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static double l(double d2) {
        double d3;
        try {
            d3 = d2 >= 0.0 ? d2 : -d2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return d3;
    }

    public static boolean U() {
        boolean bl = AdaptiveComputationEngine.O();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return false;
    }

    public static final float S(float f) {
        long l = a ^ 0x3EF1126074C3L;
        return d[(int)(f * 10430.378f + 16384.0f) & AdaptiveComputationEngine.a("n", (int)5200, (long)(0xE791966E759D27EL ^ l))];
    }

    public static boolean O() {
        return y;
    }

    public static int S(Random random, int n, int n2) {
        int n3;
        try {
            n3 = n >= n2 ? n : random.nextInt(n2 - n + 1) + n;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n3;
    }

    public static double Z(double d2, double d3, double d4) {
        double d5;
        block5: {
            block4: {
                try {
                    if (!(d2 < d3)) break block4;
                    d5 = d3;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            try {
                d5 = d2 > d4 ? d4 : d2;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveComputationEngine.a(customSystemException);
            }
        }
        return d5;
    }

    public static int U(int n, int n2) {
        int n3 = n;
        n3 = n3 > 0 ? (n3 += Math.abs(n2)) : (n3 -= Math.abs(n2));
        return n3;
    }

    public static double a(double d2) {
        if ((d2 %= 360.0) >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static double E(double d2) {
        double d3 = 0.5 * d2;
        long l = Double.doubleToRawLongBits(d2);
        l = 6910469410427058090L - (l >> 1);
        d2 = Double.longBitsToDouble(l);
        d2 *= 1.5 - d3 * d2 * d2;
        return d2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveComputationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static float g(float f, float f2, float f3) {
        float f4;
        block5: {
            block4: {
                try {
                    if (!(f < f2)) break block4;
                    f4 = f2;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            try {
                f4 = f > f3 ? f3 : f;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveComputationEngine.a(customSystemException);
            }
        }
        return f4;
    }

    public static int Z(float f) {
        int n;
        int n2 = (int)f;
        try {
            n = f > (float)n2 ? n2 + 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n;
    }

    public static int S(String string, int n) {
        int n2 = n;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n2;
    }

    public static int L(double d2) {
        return (int)(d2 + 1024.0) - 1024;
    }

    public static double W(double d2, int n) {
        try {
            if (n < 0) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static int s(double d2) {
        double d3;
        try {
            d3 = d2 >= 0.0 ? d2 : -d2 + 1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return (int)d3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                AdaptiveComputationEngine.a = MultiContainerRegistry.a(-7038473184842932751L, -1362806350736338243L, MethodHandles.lookup().lookupClass()).a(212856935258474L);
                var11 = AdaptiveComputationEngine.a ^ 114983661414868L;
                AdaptiveComputationEngine.e = new HashMap<K, V>(13);
                AdaptiveComputationEngine.i(true);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[5];
                var3_4 = 0;
                var4_5 = "7\u00d1\u00fd\u00fb\u0015y3\u00e5[\u00a1\u000b_;J\u0003X\u00e9\u0082\u009a\u001d\u00ac\u009b\u00f3\u00d9";
                var5_6 = "7\u00d1\u00fd\u00fb\u0015y3\u00e5[\u00a1\u000b_;J\u0003X\u00e9\u0082\u009a\u001d\u00ac\u009b\u00f3\u00d9".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block11;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00b0\u00c1\u00d7\u00c1\u0098\u00ec\u0087\u00f7\u00f2\u00f1\u00d1\u008c\u00c1\u0019\u00d6*";
                    var5_6 = "\u00b0\u00c1\u00d7\u00c1\u0098\u00ec\u0087\u00f7\u00f2\u00f1\u00d1\u008c\u00c1\u0019\u00d6*".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block12;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        AdaptiveComputationEngine.b = var6_3;
        AdaptiveComputationEngine.c = new Integer[5];
        AdaptiveComputationEngine.l = Double.longBitsToDouble(4805340802404319232L);
        AdaptiveComputationEngine.A = new double[257];
        AdaptiveComputationEngine.C = new double[257];
        AdaptiveComputationEngine.d = new float[AdaptiveComputationEngine.a("n", (int)2955, (long)(2536056326626676915L ^ var11))];
        try {
            for (var13_11 = 0; var13_11 < AdaptiveComputationEngine.a("n", (int)6778, (long)(3465192300186763584L ^ var11)); ++var13_11) {
                AdaptiveComputationEngine.d[var13_11] = (float)Math.sin((double)var13_11 * 3.141592653589793 * 2.0 / 65536.0);
            }
        }
        catch (CustomSystemException v8) {
            throw AdaptiveComputationEngine.a(v8);
        }
        AdaptiveComputationEngine.M = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    }

    public static double O(double d2, double d3, double d4) {
        double d5;
        block5: {
            block4: {
                try {
                    if (!(d4 < 0.0)) break block4;
                    d5 = d2;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            try {
                d5 = d4 > 1.0 ? d3 : d2 + (d3 - d2) * d4;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveComputationEngine.a(customSystemException);
            }
        }
        return d5;
    }

    private static int N(int n) {
        int n2;
        try {
            n2 = AdaptiveComputationEngine.G(n) ? n : AdaptiveComputationEngine.s(n);
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        n = n2;
        return M[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static final float C(double d2) {
        return (float)Math.sqrt(d2);
    }

    public static int j(float f) {
        int n;
        int n2 = (int)f;
        try {
            n = f < (float)n2 ? n2 - 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n;
    }

    public static double K(double d2, double d3) {
        double d4 = d2;
        d4 = d4 > 0.0 ? (d4 += Math.abs(d3)) : (d4 -= Math.abs(d3));
        return d4;
    }

    public static double m(double d2, double d3) {
        double d4;
        block4: {
            block3: {
                d4 = d2;
                try {
                    if (!(d4 > 0.0)) break block3;
                    if (!(d4 < d3)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
                d4 += d3;
                break block4;
            }
            if (d4 > -d3) {
                d4 -= d3;
            }
        }
        return d4;
    }

    public static long x(double d2) {
        long l;
        long l2 = (long)d2;
        try {
            l = d2 < (double)l2 ? l2 - 1L : l2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return l;
    }

    public static double s(Random random, double d2, double d3) {
        double d4;
        try {
            d4 = d2 >= d3 ? d2 : random.nextDouble() * (d3 - d2) + d2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return d4;
    }

    public static final float D(float f) {
        long l = a ^ 0x69E82200BCFDL;
        return d[(int)(f * 10430.378f) & AdaptiveComputationEngine.a("n", (int)4420, (long)(0x1859D502FADF1F56L ^ l))];
    }

    public static int G(int n, int n2) {
        int n3;
        try {
            n3 = n < 0 ? -((-n - 1) / n2) - 1 : n / n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/sy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int z(String string, int n, int n2) {
        int n3 = n;
        try {
            n3 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n3 < n2) {
            n3 = n2;
        }
        return n3;
    }

    public static int Q(int n) {
        int n2;
        int n3;
        try {
            n3 = AdaptiveComputationEngine.N(n);
            n2 = AdaptiveComputationEngine.G(n) ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n3 - n2;
    }

    public static double g(String string, double d2) {
        double d3 = d2;
        try {
            d3 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d3;
    }

    public static double X(double d2, double d3) {
        double d4;
        boolean bl;
        boolean bl2;
        boolean bl3;
        double d5 = d3 * d3 + d2 * d2;
        try {
            if (Double.isNaN(d5)) {
                return Double.NaN;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        try {
            boolean bl4 = bl3 = d2 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        if (bl3) {
            d2 = -d2;
        }
        try {
            boolean bl5 = bl2 = d3 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        if (bl2) {
            d3 = -d3;
        }
        try {
            boolean bl6 = bl = d2 > d3;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        if (bl) {
            d4 = d3;
            d3 = d2;
            d2 = d4;
        }
        d4 = AdaptiveComputationEngine.E(d5);
        d3 *= d4;
        double d6 = l + (d2 *= d4);
        int n = (int)Double.doubleToRawLongBits(d6);
        double d7 = A[n];
        double d8 = C[n];
        double d9 = d6 - l;
        double d10 = d2 * d8 - d3 * d9;
        double d11 = (6.0 + d10 * d10) * d10 * 0.16666666666666666;
        double d12 = d7 + d11;
        if (bl) {
            d12 = 1.5707963267948966 - d12;
        }
        if (bl2) {
            d12 = Math.PI - d12;
        }
        if (bl3) {
            d12 = -d12;
        }
        return d12;
    }

    public static double m(long[] lArray) {
        long l = 0L;
        long[] lArray2 = lArray;
        int n = lArray.length;
        for (int i = 0; i < n; ++i) {
            long l2 = lArray2[i];
            l += l2;
        }
        return (double)l / (double)lArray.length;
    }

    public static int X(int n, int n2, int n3) {
        int n4;
        block5: {
            block4: {
                try {
                    if (n >= n2) break block4;
                    n4 = n2;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            try {
                n4 = n > n3 ? n3 : n;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveComputationEngine.a(customSystemException);
            }
        }
        return n4;
    }

    public static int E(int n, int n2) {
        int n3;
        try {
            if (n2 == 0) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        if (n < 0) {
            n2 *= -1;
        }
        int n4 = n % n2;
        try {
            n3 = n4 == 0 ? n : n + n2 - n4;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n3;
    }

    public static void i(boolean bl) {
        y = bl;
    }

    public static int L(int n) {
        int n2;
        try {
            n2 = n >= 0 ? n : -n;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n2;
    }

    public static float I(float f, float f2) {
        int n = (int)Math.floor(f / f2);
        return f - (float)n * f2;
    }

    public static boolean l(String string) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (string != null && string.length() != 0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean o(double d2, double d3, double d4, double d5, double d6) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d5 >= d2 - d4) || !(d5 <= d2 + d4)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveComputationEngine.a(customSystemException);
                            }
                            if (!(d6 >= d3 - d4)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveComputationEngine.a(customSystemException);
                        }
                        if (!(d6 <= d3 + d4)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static double v(double d2, double d3) {
        int n = (int)Math.floor(d2 / d3);
        return d2 - (double)n * d3;
    }

    public static long Q(Dv dv) {
        return AdaptiveComputationEngine.A(dv.o(), dv.q(), dv.j());
    }

    public static double O(double ... dArray) {
        double d2 = 0.0;
        for (double d3 : dArray) {
            d2 += Math.pow(d3, 2.0);
        }
        return Math.sqrt(d2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static float v(float f, float f2, float f3) {
        return f2 + f * (f3 - f2);
    }

    public static double F(Random random, double d2, double d3) {
        return d2 + (d3 - d2) * random.nextDouble();
    }

    public static float O(float f) {
        float f2;
        try {
            f2 = f >= 0.0f ? f : -f;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return f2;
    }

    public static boolean e(double d2, double d3, double d4, double d5, double d6) {
        boolean bl;
        double d7 = d2 - d5;
        double d8 = d3 - d6;
        d7 *= d7;
        d8 *= d8;
        double d9 = d7 + d8;
        double d10 = d4 * d4;
        try {
            bl = d9 <= d10;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return bl;
    }

    public static int B(Random random, int n, int n2) {
        return random.nextInt(n2 - n) + n;
    }

    public static int j(double d2) {
        int n;
        int n2 = (int)d2;
        try {
            n = d2 > (double)n2 ? n2 + 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n;
    }

    public static int Q(double d2) {
        int n;
        int n2 = (int)d2;
        try {
            n = d2 < (double)n2 ? n2 - 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return n;
    }

    public static double F(double d2, double d3) {
        double d4;
        if (d2 < 0.0) {
            d2 = -d2;
        }
        if (d3 < 0.0) {
            d3 = -d3;
        }
        try {
            d4 = d2 > d3 ? d2 : d3;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return d4;
    }

    private static boolean G(int n) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (n == 0 || (n & n - 1) != 0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x160F;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/sy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveComputationEngine.c[n2] = n3;
        }
        return c[n2];
    }

    public static long A(int n, int n2, int n3) {
        long l = a ^ 0x692CE8A2F272L;
        long l2 = (long)(n * AdaptiveComputationEngine.a("n", (int)5236, (long)(0x3775D71F2B7154EFL ^ l))) ^ (long)n3 * 116129781L ^ (long)n2;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        return l2;
    }

    public static float v(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static float z(Random random, float f, float f2) {
        float f3;
        try {
            f3 = f >= f2 ? f : random.nextFloat() * (f2 - f) + f;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveComputationEngine.a(customSystemException);
        }
        return f3;
    }

    public static double j(double d2, double d3) {
        double d4 = 1.0 / d3;
        return (double)Math.round(d2 * d4) / d4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

