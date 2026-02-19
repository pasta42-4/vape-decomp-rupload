/*
 * Decompiled with CFR 0.152.
 */
package com.analytics.processing;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AnalyticsDataProcessor {
    private static final double[] u;
    private static final double r;
    private static final long[] b;
    private static final float[] H;
    private static final double[] j;
    private static final Map d;
    private static final Integer[] c;
    private static final long a;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Deprecated
    public static double D(double d2) {
        double d3 = 0.5 * d2;
        long l = Double.doubleToRawLongBits(d2);
        l = 6910469410427058090L - (l >> 1);
        d2 = Double.longBitsToDouble(l);
        return d2 * (1.5 - d3 * d2 * d2);
    }

    public static boolean O(float f, float f2) {
        boolean bl;
        try {
            bl = Math.abs(f2 - f) < 1.0E-5f;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return bl;
    }

    public static int E(int n, int n2, int n3) {
        return Math.min(Math.max(n, n2), n3);
    }

    public static int y(int n) {
        return n * n;
    }

    public static float C(float f) {
        return f * f;
    }

    public static float z(float f) {
        long l = a ^ 0x51A9B5699160L;
        return H[(int)(f * 10430.378f) & AnalyticsDataProcessor.a("w", (int)5484, (long)(0x55A961DA8676B760L ^ l))];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(8302734028387718187L, -7479042896499473623L, MethodHandles.lookup().lookupClass()).a(70644451711125L);
        long l = a ^ 0x4F02C0D981CFL;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00b0\u00ffs\u00d7/\u0006\u0017g\u00d5e\u008d\u001f|\u009e6b\u00be\u00b5%D\u00be\\\u00e9H";
        int n2 = "\u00b0\u00ffs\u00d7/\u0006\u0017g\u00d5e\u008d\u001f|\u009e6b\u00be\u00b5%D\u00be\\\u00e9H".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
        H = AnalyticsDataProcessor.z(new float[AnalyticsDataProcessor.a("w", (int)7647, (long)(0x31D132B5FDAB2F7EL ^ l))], AnalyticsDataProcessor::lambda$static$0);
        r = Double.longBitsToDouble(4805340802404319232L);
        u = new double[257];
        j = new double[257];
    }

    public static long Y(long l, long l2, long l3) {
        return Math.min(Math.max(l, l2), l3);
    }

    public static double j(double d2, double d3) {
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
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        try {
            boolean bl4 = bl3 = d2 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        if (bl3) {
            d2 = -d2;
        }
        try {
            boolean bl5 = bl2 = d3 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        if (bl2) {
            d3 = -d3;
        }
        try {
            boolean bl6 = bl = d2 > d3;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        if (bl) {
            d4 = d3;
            d3 = d2;
            d2 = d4;
        }
        d4 = AnalyticsDataProcessor.D(d5);
        d3 *= d4;
        double d6 = r + (d2 *= d4);
        int n = (int)Double.doubleToRawLongBits(d6);
        double d7 = u[n];
        double d8 = j[n];
        double d9 = d6 - r;
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

    public static float g(float f) {
        return Math.abs(f);
    }

    public static long o(double d2) {
        long l;
        long l2 = (long)d2;
        try {
            l = d2 < (double)l2 ? l2 - 1L : l2;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return l;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16B4;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/cF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AnalyticsDataProcessor.c[n2] = n3;
        }
        return c[n2];
    }

    public static float w(float f) {
        return (float)Math.sqrt(f);
    }

    public static int X(float f) {
        int n;
        int n2 = (int)f;
        try {
            n = f < (float)n2 ? n2 - 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
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
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return n;
    }

    public static float s(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static long g(long l) {
        return l * l;
    }

    public static float z(float f, float f2, float f3) {
        float f4;
        try {
            f4 = f < f2 ? f2 : Math.min(f, f3);
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return f4;
    }

    private static void lambda$static$0(float[] fArray) {
        try {
            for (int i = 0; i < fArray.length; ++i) {
                fArray[i] = (float)Math.sin((double)i * Math.PI * 2.0 / 65536.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
    }

    public static double F(double d2, double d3, double d4) {
        double d5;
        try {
            d5 = d2 < d3 ? d3 : Math.min(d2, d4);
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return d5;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AnalyticsDataProcessor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static int H(double d2) {
        int n;
        int n2 = (int)d2;
        try {
            n = d2 > (double)n2 ? n2 + 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return n;
    }

    public static double S(double d2) {
        double d3 = d2 % 360.0;
        if (d3 >= 180.0) {
            d3 -= 360.0;
        }
        if (d3 < -180.0) {
            d3 += 360.0;
        }
        return d3;
    }

    public static int L(int n) {
        int n2 = n % 360;
        try {
            if (n2 >= 180) {
                n2 -= 360;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        try {
            if (n2 < -180) {
                n2 += 360;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return n2;
    }

    public static float O(float f) {
        long l = a ^ 0x49BB2F58575DL;
        return H[(int)(f * 10430.378f + 16384.0f) & AnalyticsDataProcessor.a("w", (int)8387, (long)(0x29A0A232C853C4F3L ^ l))];
    }

    public static <T> T z(T t, Consumer<? super T> consumer) {
        consumer.accept(t);
        return t;
    }

    public static int F(int n) {
        return Math.abs(n);
    }

    public static float k(long l) {
        float f = l % 360L;
        if (f >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static int j(float f) {
        int n;
        int n2 = (int)f;
        try {
            n = f > (float)n2 ? n2 + 1 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static double o(double d2) {
        return d2 * d2;
    }

    public static boolean z(double d2, double d3) {
        boolean bl;
        try {
            bl = Math.abs(d3 - d2) < (double)1.0E-5f;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsDataProcessor.a(customSystemException);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AnalyticsDataProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

