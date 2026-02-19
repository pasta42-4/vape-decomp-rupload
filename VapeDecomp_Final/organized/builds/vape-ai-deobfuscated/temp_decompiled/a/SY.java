/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dv;
import a.O_;
import a.d8;
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

public class sy {
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

    public static final float l(float f10) {
        return (float)Math.sqrt(f10);
    }

    public static int s(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    public static double l(double d2) {
        double d3;
        try {
            d3 = d2 >= 0.0 ? d2 : -d2;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return d3;
    }

    public static boolean U() {
        boolean bl2 = sy.O();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return false;
    }

    public static final float S(float f10) {
        long l10 = a ^ 0x3EF1126074C3L;
        return d[(int)(f10 * 10430.378f + 16384.0f) & sy.a("n", (int)5200, (long)(0xE791966E759D27EL ^ l10))];
    }

    public static boolean O() {
        return y;
    }

    public static int S(Random random, int n2, int n3) {
        int n4;
        try {
            n4 = n2 >= n3 ? n2 : random.nextInt(n3 - n2 + 1) + n2;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n4;
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
                catch (O_ o_2) {
                    throw sy.a(o_2);
                }
            }
            try {
                d5 = d2 > d4 ? d4 : d2;
            }
            catch (O_ o_3) {
                throw sy.a(o_3);
            }
        }
        return d5;
    }

    public static int U(int n2, int n3) {
        int n4 = n2;
        n4 = n4 > 0 ? (n4 += Math.abs(n3)) : (n4 -= Math.abs(n3));
        return n4;
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
        long l10 = Double.doubleToRawLongBits(d2);
        l10 = 6910469410427058090L - (l10 >> 1);
        d2 = Double.longBitsToDouble(l10);
        d2 *= 1.5 - d3 * d2 * d2;
        return d2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = sy.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static float g(float f10, float f11, float f12) {
        float f13;
        block5: {
            block4: {
                try {
                    if (!(f10 < f11)) break block4;
                    f13 = f11;
                    break block5;
                }
                catch (O_ o_2) {
                    throw sy.a(o_2);
                }
            }
            try {
                f13 = f10 > f12 ? f12 : f10;
            }
            catch (O_ o_3) {
                throw sy.a(o_3);
            }
        }
        return f13;
    }

    public static int Z(float f10) {
        int n2;
        int n3 = (int)f10;
        try {
            n2 = f10 > (float)n3 ? n3 + 1 : n3;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n2;
    }

    public static int S(String string, int n2) {
        int n3 = n2;
        try {
            n3 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n3;
    }

    public static int L(double d2) {
        return (int)(d2 + 1024.0) - 1024;
    }

    public static double W(double d2, int n2) {
        try {
            if (n2 < 0) {
                return d2;
            }
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(n2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static int s(double d2) {
        double d3;
        try {
            d3 = d2 >= 0.0 ? d2 : -d2 + 1.0;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return (int)d3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                sy.a = d8.a(-7038473184842932751L, -1362806350736338243L, MethodHandles.lookup().lookupClass()).a(212856935258474L);
                var11 = sy.a ^ 114983661414868L;
                sy.e = new HashMap<K, V>(13);
                sy.i(true);
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
        sy.b = var6_3;
        sy.c = new Integer[5];
        sy.l = Double.longBitsToDouble(4805340802404319232L);
        sy.A = new double[257];
        sy.C = new double[257];
        sy.d = new float[sy.a("n", (int)2955, (long)(2536056326626676915L ^ var11))];
        try {
            for (var13_11 = 0; var13_11 < sy.a("n", (int)6778, (long)(3465192300186763584L ^ var11)); ++var13_11) {
                sy.d[var13_11] = (float)Math.sin((double)var13_11 * 3.141592653589793 * 2.0 / 65536.0);
            }
        }
        catch (O_ v8) {
            throw sy.a(v8);
        }
        sy.M = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
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
                catch (O_ o_2) {
                    throw sy.a(o_2);
                }
            }
            try {
                d5 = d4 > 1.0 ? d3 : d2 + (d3 - d2) * d4;
            }
            catch (O_ o_3) {
                throw sy.a(o_3);
            }
        }
        return d5;
    }

    private static int N(int n2) {
        int n3;
        try {
            n3 = sy.G(n2) ? n2 : sy.s(n2);
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        n2 = n3;
        return M[(int)((long)n2 * 125613361L >> 27) & 0x1F];
    }

    public static final float C(double d2) {
        return (float)Math.sqrt(d2);
    }

    public static int j(float f10) {
        int n2;
        int n3 = (int)f10;
        try {
            n2 = f10 < (float)n3 ? n3 - 1 : n3;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n2;
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
                catch (O_ o_2) {
                    throw sy.a(o_2);
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
        long l10;
        long l11 = (long)d2;
        try {
            l10 = d2 < (double)l11 ? l11 - 1L : l11;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return l10;
    }

    public static double s(Random random, double d2, double d3) {
        double d4;
        try {
            d4 = d2 >= d3 ? d2 : random.nextDouble() * (d3 - d2) + d2;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return d4;
    }

    public static final float D(float f10) {
        long l10 = a ^ 0x69E82200BCFDL;
        return d[(int)(f10 * 10430.378f) & sy.a("n", (int)4420, (long)(0x1859D502FADF1F56L ^ l10))];
    }

    public static int G(int n2, int n3) {
        int n4;
        try {
            n4 = n2 < 0 ? -((-n2 - 1) / n3) - 1 : n2 / n3;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n4;
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

    public static int z(String string, int n2, int n3) {
        int n4 = n2;
        try {
            n4 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n4 < n3) {
            n4 = n3;
        }
        return n4;
    }

    public static int Q(int n2) {
        int n3;
        int n4;
        try {
            n4 = sy.N(n2);
            n3 = sy.G(n2) ? 0 : 1;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n4 - n3;
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
        boolean bl2;
        boolean bl3;
        boolean bl4;
        double d5 = d3 * d3 + d2 * d2;
        try {
            if (Double.isNaN(d5)) {
                return Double.NaN;
            }
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        try {
            boolean bl5 = bl4 = d2 < 0.0;
        }
        catch (O_ o_3) {
            throw sy.a(o_3);
        }
        if (bl4) {
            d2 = -d2;
        }
        try {
            boolean bl6 = bl3 = d3 < 0.0;
        }
        catch (O_ o_4) {
            throw sy.a(o_4);
        }
        if (bl3) {
            d3 = -d3;
        }
        try {
            boolean bl7 = bl2 = d2 > d3;
        }
        catch (O_ o_5) {
            throw sy.a(o_5);
        }
        if (bl2) {
            d4 = d3;
            d3 = d2;
            d2 = d4;
        }
        d4 = sy.E(d5);
        d3 *= d4;
        double d6 = l + (d2 *= d4);
        int n2 = (int)Double.doubleToRawLongBits(d6);
        double d7 = A[n2];
        double d9 = C[n2];
        double d10 = d6 - l;
        double d11 = d2 * d9 - d3 * d10;
        double d12 = (6.0 + d11 * d11) * d11 * 0.16666666666666666;
        double d13 = d7 + d12;
        if (bl2) {
            d13 = 1.5707963267948966 - d13;
        }
        if (bl3) {
            d13 = Math.PI - d13;
        }
        if (bl4) {
            d13 = -d13;
        }
        return d13;
    }

    public static double m(long[] lArray) {
        long l10 = 0L;
        long[] lArray2 = lArray;
        int n2 = lArray.length;
        for (int i10 = 0; i10 < n2; ++i10) {
            long l11 = lArray2[i10];
            l10 += l11;
        }
        return (double)l10 / (double)lArray.length;
    }

    public static int X(int n2, int n3, int n4) {
        int n5;
        block5: {
            block4: {
                try {
                    if (n2 >= n3) break block4;
                    n5 = n3;
                    break block5;
                }
                catch (O_ o_2) {
                    throw sy.a(o_2);
                }
            }
            try {
                n5 = n2 > n4 ? n4 : n2;
            }
            catch (O_ o_3) {
                throw sy.a(o_3);
            }
        }
        return n5;
    }

    public static int E(int n2, int n3) {
        int n4;
        try {
            if (n3 == 0) {
                return 0;
            }
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        if (n2 < 0) {
            n3 *= -1;
        }
        int n5 = n2 % n3;
        try {
            n4 = n5 == 0 ? n2 : n2 + n3 - n5;
        }
        catch (O_ o_3) {
            throw sy.a(o_3);
        }
        return n4;
    }

    public static void i(boolean bl2) {
        y = bl2;
    }

    public static int L(int n2) {
        int n3;
        try {
            n3 = n2 >= 0 ? n2 : -n2;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n3;
    }

    public static float I(float f10, float f11) {
        int n2 = (int)Math.floor(f10 / f11);
        return f10 - (float)n2 * f11;
    }

    public static boolean l(String string) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (string != null && string.length() != 0) break block4;
                    }
                    catch (O_ o_2) {
                        throw sy.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw sy.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean o(double d2, double d3, double d4, double d5, double d6) {
        boolean bl2;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d5 >= d2 - d4) || !(d5 <= d2 + d4)) break block8;
                            }
                            catch (O_ o_2) {
                                throw sy.a(o_2);
                            }
                            if (!(d6 >= d3 - d4)) break block8;
                        }
                        catch (O_ o_3) {
                            throw sy.a(o_3);
                        }
                        if (!(d6 <= d3 + d4)) break block8;
                    }
                    catch (O_ o_4) {
                        throw sy.a(o_4);
                    }
                    bl2 = true;
                    break block9;
                }
                catch (O_ o_5) {
                    throw sy.a(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static double v(double d2, double d3) {
        int n2 = (int)Math.floor(d2 / d3);
        return d2 - (double)n2 * d3;
    }

    public static long Q(Dv dv) {
        return sy.A(dv.o(), dv.q(), dv.j());
    }

    public static double O(double ... dArray) {
        double d2 = 0.0;
        for (double d3 : dArray) {
            d2 += Math.pow(d3, 2.0);
        }
        return Math.sqrt(d2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static float v(float f10, float f11, float f12) {
        return f11 + f10 * (f12 - f11);
    }

    public static double F(Random random, double d2, double d3) {
        return d2 + (d3 - d2) * random.nextDouble();
    }

    public static float O(float f10) {
        float f11;
        try {
            f11 = f10 >= 0.0f ? f10 : -f10;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return f11;
    }

    public static boolean e(double d2, double d3, double d4, double d5, double d6) {
        boolean bl2;
        double d7 = d2 - d5;
        double d9 = d3 - d6;
        d7 *= d7;
        d9 *= d9;
        double d10 = d7 + d9;
        double d11 = d4 * d4;
        try {
            bl2 = d10 <= d11;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return bl2;
    }

    public static int B(Random random, int n2, int n3) {
        return random.nextInt(n3 - n2) + n2;
    }

    public static int j(double d2) {
        int n2;
        int n3 = (int)d2;
        try {
            n2 = d2 > (double)n3 ? n3 + 1 : n3;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n2;
    }

    public static int Q(double d2) {
        int n2;
        int n3 = (int)d2;
        try {
            n2 = d2 < (double)n3 ? n3 - 1 : n3;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return n2;
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
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return d4;
    }

    private static boolean G(int n2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (n2 == 0 || (n2 & n2 - 1) != 0) break block4;
                    }
                    catch (O_ o_2) {
                        throw sy.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw sy.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x160F;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
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
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sy.c[n3] = n4;
        }
        return c[n3];
    }

    public static long A(int n2, int n3, int n4) {
        long l10 = a ^ 0x692CE8A2F272L;
        long l11 = (long)(n2 * sy.a("n", (int)5236, (long)(0x3775D71F2B7154EFL ^ l10))) ^ (long)n4 * 116129781L ^ (long)n3;
        l11 = l11 * l11 * 42317861L + l11 * 11L;
        return l11;
    }

    public static float v(float f10) {
        if ((f10 %= 360.0f) >= 180.0f) {
            f10 -= 360.0f;
        }
        if (f10 < -180.0f) {
            f10 += 360.0f;
        }
        return f10;
    }

    public static float z(Random random, float f10, float f11) {
        float f12;
        try {
            f12 = f10 >= f11 ? f10 : random.nextFloat() * (f11 - f10) + f10;
        }
        catch (O_ o_2) {
            throw sy.a(o_2);
        }
        return f12;
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
            return MethodHandles.lookup().findStatic(sy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

