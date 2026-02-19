/*
 * Decompiled with CFR 0.152.
 */
package com.math.computation;

import com.collections.management.MultiContainerRegistry;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NumericComputationEngine351 {
    private static final double k = 108.883;
    private static final ThreadLocal<double[]> M;
    private static final Integer[] e;
    private static final Map f;
    private static final String[] h;
    private static final double F = 95.047;
    private static final Object[] g;
    private static final int a;
    private static final long[] d;
    private static final double c = 0.008856;
    private static final double p = 100.0;
    private static final double O = 903.3;
    private static final long b;
    private static final int l = 1;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/T3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static double L(int n) {
        double[] dArray = NumericComputationEngine351.x();
        NumericComputationEngine351.b(n, dArray);
        return dArray[1] / 100.0;
    }

    private static double H(double d2) {
        double d3;
        try {
            d3 = d2 > 0.008856 ? Math.pow(d2, 0.3333333333333333) : (903.3 * d2 + 16.0) / 116.0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        return d3;
    }

    public static void Q(double d2, double d3, double d4, double[] dArray) {
        double d5;
        double d6;
        double d7;
        double d8 = (d2 + 16.0) / 116.0;
        double d9 = d3 / 500.0 + d8;
        double d10 = d8 - d4 / 200.0;
        double d11 = Math.pow(d9, 3.0);
        try {
            d7 = d11 > 0.008856 ? d11 : (116.0 * d9 - 16.0) / 903.3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        double d12 = d7;
        try {
            d6 = d2 > 7.9996247999999985 ? Math.pow(d8, 3.0) : d2 / 903.3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        double d13 = d6;
        d11 = Math.pow(d10, 3.0);
        try {
            d5 = d11 > 0.008856 ? d11 : (116.0 * d10 - 16.0) / 903.3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        double d14 = d5;
        dArray[0] = d12 * 95.047;
        dArray[1] = d13 * 100.0;
        dArray[2] = d14 * 108.883;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericComputationEngine351.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericComputationEngine351.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int F(int n, int n2) {
        int n3 = 255;
        int n4 = 255;
        int n5 = NumericComputationEngine351.V(n4, n3);
        Color color = new Color(n);
        Color color2 = new Color(n2);
        int n6 = NumericComputationEngine351.b(color.getRed(), n4, color2.getRed(), n3, n5);
        int n7 = NumericComputationEngine351.b(color.getGreen(), n4, color2.getGreen(), n3, n5);
        int n8 = NumericComputationEngine351.b(color.getBlue(), n4, color2.getBlue(), n3, n5);
        return new Color(n6, n7, n8).getRGB();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'j' || c == '\u00a3' || c == 'S') {
                field = NumericComputationEngine351.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericComputationEngine351.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericComputationEngine351.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericComputationEngine351.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = NumericComputationEngine351.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericComputationEngine351.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericComputationEngine351.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericComputationEngine351.a(clazz3, string2, clazz2)) != null) {
                    NumericComputationEngine351.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericComputationEngine351.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericComputationEngine351.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericComputationEngine351.b(235715216155158L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n, int n2, int n3, int n4, int n5) {
        try {
            if (n5 == 0) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        return (255 * n * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericComputationEngine351.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericComputationEngine351.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/T3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6043;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/T3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericComputationEngine351.e[n2] = n3;
        }
        return e[n2];
    }

    private static int V(int n, int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }

    public static void c(int n, double[] dArray) {
        Color color = new Color(n);
        NumericComputationEngine351.V(color.getRed(), color.getGreen(), color.getBlue(), dArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(-1855586073164689813L, -4512513993995171773L, MethodHandles.lookup().lookupClass()).a(252348143951935L);
        g = new Object[5];
        h = new String[5];
        NumericComputationEngine351.a();
        f = new HashMap(13);
        long l = b ^ 0x572A79435A0EL;
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
        String string = "k\u00fb\u00ac\u00b3+\u00923\b\r\u0006^_DGK|;\u00d7\u001f\u00a0\u00d3X\u00a3\u00b5";
        int n2 = "k\u00fb\u00ac\u00b3+\u00923\b\r\u0006^_DGK|;\u00d7\u001f\u00a0\u00d3X\u00a3\u00b5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
        a = (int)NumericComputationEngine351.a("h", (int)24826, (long)(l ^ 0x2DDDCDCB750FA46BL));
        M = new ThreadLocal();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericComputationEngine351.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void U(int n, int n2, int n3, float[] fArray) {
        float f;
        float f2;
        float f3 = (float)n / 255.0f;
        float f4 = (float)n2 / 255.0f;
        float f5 = (float)n3 / 255.0f;
        float f6 = Math.max(f3, Math.max(f4, f5));
        float f7 = Math.min(f3, Math.min(f4, f5));
        float f8 = f6 - f7;
        float f9 = (f6 + f7) / 2.0f;
        if (f6 == f7) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = f6 == f3 ? (f4 - f5) / f8 % 6.0f : (f6 == f4 ? (f5 - f3) / f8 + 2.0f : (f3 - f4) / f8 + 4.0f);
            f2 = f8 / (1.0f - Math.abs(2.0f * f9 - 1.0f));
        }
        f = f * 60.0f % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        fArray[0] = NumericComputationEngine351.t(f, 0.0f, 360.0f);
        fArray[1] = NumericComputationEngine351.t(f2, 0.0f, 1.0f);
        fArray[2] = NumericComputationEngine351.t(f9, 0.0f, 1.0f);
    }

    private static int R(int n, int n2, int n3) {
        int n4;
        block5: {
            block4: {
                try {
                    if (n >= n2) break block4;
                    n4 = n2;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationEngine351.a(illegalArgumentException);
                }
            }
            try {
                n4 = n > n3 ? n3 : n;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw NumericComputationEngine351.a(illegalArgumentException);
            }
        }
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = NumericComputationEngine351.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericComputationEngine351.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = NumericComputationEngine351.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericComputationEngine351.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericComputationEngine351.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericComputationEngine351.b(235715216155158L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericComputationEngine351.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericComputationEngine351.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericComputationEngine351.b(235715216155158L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static double[] x() {
        double[] dArray = M.get();
        if (dArray == null) {
            dArray = new double[3];
            M.set(dArray);
        }
        return dArray;
    }

    private static float t(float f, float f2, float f3) {
        float f4;
        block5: {
            block4: {
                try {
                    if (!(f < f2)) break block4;
                    f4 = f2;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationEngine351.a(illegalArgumentException);
                }
            }
            try {
                f4 = f > f3 ? f3 : f;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw NumericComputationEngine351.a(illegalArgumentException);
            }
        }
        return f4;
    }

    public static int v(double d2, double d3, double d4) {
        double[] dArray = NumericComputationEngine351.x();
        NumericComputationEngine351.Q(d2, d3, d4, dArray);
        return NumericComputationEngine351.r(dArray[0], dArray[1], dArray[2]);
    }

    public static void c(int n, int n2, int n3, double[] dArray) {
        double d2;
        double d3;
        double d4;
        long l = b ^ 0xCA3B7224DEL;
        try {
            if (dArray.length != 3) {
                throw new IllegalArgumentException((String)((Object)NumericComputationEngine351.b("\u00b5", (int)NumericComputationEngine351.a("h", (int)25918, (long)(0x4AA31ED64C92DF7EL ^ l)), (long)6486042356951495592L, (long)l)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        double d5 = (double)n / 255.0;
        try {
            d4 = d5 < 0.04045 ? d5 / 12.92 : Math.pow((d5 + 0.055) / 1.055, 2.4);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d5 = d4;
        double d6 = (double)n2 / 255.0;
        try {
            d3 = d6 < 0.04045 ? d6 / 12.92 : Math.pow((d6 + 0.055) / 1.055, 2.4);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d6 = d3;
        double d7 = (double)n3 / 255.0;
        try {
            d2 = d7 < 0.04045 ? d7 / 12.92 : Math.pow((d7 + 0.055) / 1.055, 2.4);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d7 = d2;
        dArray[0] = 100.0 * (d5 * 0.4124 + d6 * 0.3576 + d7 * 0.1805);
        dArray[1] = 100.0 * (d5 * 0.2126 + d6 * 0.7152 + d7 * 0.0722);
        dArray[2] = 100.0 * (d5 * 0.0193 + d6 * 0.1192 + d7 * 0.9505);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 7;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 60;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 18;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 25;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 39;
                break;
            }
            case 23: {
                n3 = 4;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 9;
                break;
            }
            case 26: {
                n3 = 26;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 17;
                break;
            }
            case 34: {
                n3 = 16;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 33;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 22;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 38;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 58;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 55;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 46;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 13;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 41;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 30;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 40;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 27;
                break;
            }
            default: {
                n3 = 11;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        NumericComputationEngine351.h[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\bz\u001e";
        objectArray[1] = Integer.TYPE;
        NumericComputationEngine351.h[1] = "java/lang/Integer";
        objectArray[2] = ":D7YA;1K&\u0016<#\"L/_";
        objectArray[3] = "I\u0013R^5\u0001B\u001cC\u0011T\u000fI\u0017GK";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Z\u0000llo\u0016\u0016@wUt\u001dj\b/;n\u0001WW,0dfSP):g\u0019\u0003Vm/\u001f";
    }

    public static int x(float[] fArray) {
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        float f4 = (1.0f - Math.abs(2.0f * f3 - 1.0f)) * f2;
        float f5 = f3 - 0.5f * f4;
        float f6 = f4 * (1.0f - Math.abs(f / 60.0f % 2.0f - 1.0f));
        int n = (int)f / 60;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        switch (n) {
            case 0: {
                n2 = Math.round(255.0f * (f4 + f5));
                n3 = Math.round(255.0f * (f6 + f5));
                n4 = Math.round(255.0f * f5);
                break;
            }
            case 1: {
                n2 = Math.round(255.0f * (f6 + f5));
                n3 = Math.round(255.0f * (f4 + f5));
                n4 = Math.round(255.0f * f5);
                break;
            }
            case 2: {
                n2 = Math.round(255.0f * f5);
                n3 = Math.round(255.0f * (f4 + f5));
                n4 = Math.round(255.0f * (f6 + f5));
                break;
            }
            case 3: {
                n2 = Math.round(255.0f * f5);
                n3 = Math.round(255.0f * (f6 + f5));
                n4 = Math.round(255.0f * (f4 + f5));
                break;
            }
            case 4: {
                n2 = Math.round(255.0f * (f6 + f5));
                n3 = Math.round(255.0f * f5);
                n4 = Math.round(255.0f * (f4 + f5));
                break;
            }
            case 5: 
            case 6: {
                n2 = Math.round(255.0f * (f4 + f5));
                n3 = Math.round(255.0f * f5);
                n4 = Math.round(255.0f * (f6 + f5));
            }
        }
        n2 = NumericComputationEngine351.R(n2, 0, 255);
        n3 = NumericComputationEngine351.R(n3, 0, 255);
        n4 = NumericComputationEngine351.R(n4, 0, 255);
        return new Color(n2, n3, n4).getRGB();
    }

    public static void b(int n, double[] dArray) {
        Color color = new Color(n);
        NumericComputationEngine351.c(color.getRed(), color.getGreen(), color.getBlue(), dArray);
    }

    public static void V(int n, int n2, int n3, double[] dArray) {
        NumericComputationEngine351.c(n, n2, n3, dArray);
        NumericComputationEngine351.f(dArray[0], dArray[1], dArray[2], dArray);
    }

    private NumericComputationEngine351() {
    }

    public static void f(double d2, double d3, double d4, double[] dArray) {
        long l = b ^ 0x4E4E313E9843L;
        try {
            if (dArray.length != 3) {
                throw new IllegalArgumentException((String)((Object)NumericComputationEngine351.b("\u00b5", (int)NumericComputationEngine351.a("h", (int)29834, (long)(0x1476D521BBBDF254L ^ l)), (long)-1828949989591118027L, (long)l)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d2 = NumericComputationEngine351.H(d2 / 95.047);
        d3 = NumericComputationEngine351.H(d3 / 100.0);
        d4 = NumericComputationEngine351.H(d4 / 108.883);
        dArray[0] = Math.max(0.0, 116.0 * d3 - 16.0);
        dArray[1] = 500.0 * (d2 - d3);
        dArray[2] = 200.0 * (d3 - d4);
    }

    public static int r(double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8 = (d2 * 3.2406 + d3 * -1.5372 + d4 * -0.4986) / 100.0;
        double d9 = (d2 * -0.9689 + d3 * 1.8758 + d4 * 0.0415) / 100.0;
        double d10 = (d2 * 0.0557 + d3 * -0.204 + d4 * 1.057) / 100.0;
        try {
            d7 = d8 > 0.0031308 ? 1.055 * Math.pow(d8, 0.4166666666666667) - 0.055 : 12.92 * d8;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d8 = d7;
        try {
            d6 = d9 > 0.0031308 ? 1.055 * Math.pow(d9, 0.4166666666666667) - 0.055 : 12.92 * d9;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d9 = d6;
        try {
            d5 = d10 > 0.0031308 ? 1.055 * Math.pow(d10, 0.4166666666666667) - 0.055 : 12.92 * d10;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationEngine351.a(illegalArgumentException);
        }
        d10 = d5;
        return new Color(NumericComputationEngine351.R((int)Math.round(d8 * 255.0), 0, 255), NumericComputationEngine351.R((int)Math.round(d9 * 255.0), 0, 255), NumericComputationEngine351.R((int)Math.round(d10 * 255.0), 0, 255)).getRGB();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void C(int n, float[] fArray) {
        Color color = new Color(n);
        NumericComputationEngine351.U(color.getRed(), color.getGreen(), color.getBlue(), fArray);
    }

    public static double o(int n, int n2) {
        n = NumericComputationEngine351.F(n, n2);
        double d2 = NumericComputationEngine351.L(n) + 0.05;
        double d3 = NumericComputationEngine351.L(n2) + 0.05;
        return Math.max(d2, d3) / Math.min(d2, d3);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericComputationEngine351.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericComputationEngine351.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(NumericComputationEngine351.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

