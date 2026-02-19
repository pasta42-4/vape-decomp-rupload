/*
 * Decompiled with CFR 0.152.
 */
package com.security.registry;

import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class SecureParameterRegistry
extends CryptoProtocolEngine {
    private ReflectionUtilityService M;
    private static final Integer[] c;
    private ReflectionUtilityService Z;
    private static final String[] f;
    private static final long a;
    private static final Object[] e;
    private ReflectionUtilityService s;
    private ReflectionUtilityService K;
    private static final Map d;
    private ReflectionUtilityService w;
    private ReflectionUtilityService T;
    private static final long[] b;

    private void F(Object object, double d2) {
        this.w.A(object, d2);
    }

    static void i(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.Y(object, d2);
    }

    private double B(Object object) {
        return this.w.C(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureParameterRegistry.a = MultiContainerRegistry.a(-8050850801468767859L, 5780025450934763725L, MethodHandles.lookup().lookupClass()).a(62186733328796L);
                SecureParameterRegistry.e = new Object[10];
                SecureParameterRegistry.f = new String[10];
                SecureParameterRegistry.a();
                SecureParameterRegistry.d = new HashMap<K, V>(13);
                var0 = SecureParameterRegistry.a ^ 44333960226098L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "I\u00df\u00d1\u0093\u00beE\n\u00fe\u00b6\u0018k\u00ff\u0091z8\u0002\u00bb\u00c7\u00cfi7\u00eb\u00cf\u00fe2n\u00a5\u009c\u00f0\u00f8+\u001f";
                var7_6 = "I\u00df\u00d1\u0093\u00beE\n\u00fe\u00b6\u0018k\u00ff\u0091z8\u0002\u00bb\u00c7\u00cfi7\u00eb\u00cf\u00fe2n\u00a5\u009c\u00f0\u00f8+\u001f".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00d0\u00bd\u00a74mk-\u0094f\u00f9\u00cfg\u000eu\u00e4P";
                    var7_6 = "\u00d0\u00bd\u00a74mk-\u0094f\u00f9\u00cfg\u000eu\u00e4P".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        SecureParameterRegistry.b = var8_3;
        SecureParameterRegistry.c = new Integer[6];
    }

    static double A(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.d(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static double q(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.B(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureParameterRegistry.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static void m(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.F(object, d2);
    }

    private double d(Object object) {
        return this.M.C(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x33ED;
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
                throw new RuntimeException("a/vJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureParameterRegistry.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field g(long l, long l2) {
        int n = SecureParameterRegistry.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureParameterRegistry.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureParameterRegistry.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureParameterRegistry.c(clazz3, string2, clazz2)) != null) {
                    SecureParameterRegistry.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureParameterRegistry.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureParameterRegistry.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureParameterRegistry.f(559911439014755L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureParameterRegistry.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureParameterRegistry.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private double m(Object object) {
        return this.T.C(object);
    }

    static void k(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.P(object, d2);
    }

    static void L(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.p(object, d2);
    }

    private void Y(Object object, double d2) {
        this.M.A(object, d2);
    }

    static double j(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.A(object);
    }

    static void w(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.o(object, d2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureParameterRegistry.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureParameterRegistry.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void o(Object object, double d2) {
        this.T.A(object, d2);
    }

    private void w(Object object, double d2) {
        this.s.A(object, d2);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 62;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 22;
                break;
            }
            case 6: {
                n3 = 42;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 54;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 2;
                break;
            }
            case 17: {
                n3 = 51;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 50;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 9;
                break;
            }
            case 25: {
                n3 = 3;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 58;
                break;
            }
            case 28: {
                n3 = 63;
                break;
            }
            case 29: {
                n3 = 26;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 45;
                break;
            }
            case 38: {
                n3 = 7;
                break;
            }
            case 39: {
                n3 = 55;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 13;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 46;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 56;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 17;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 0;
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
        SecureParameterRegistry.f[n4] = new String(cArray);
        return n4;
    }

    private double D(Object object) {
        return this.s.C(object);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public SecureParameterRegistry() {
        long l = a ^ 0x51B5E968542DL;
        super(ReflectionMetadataResolver.E7);
        this.M = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)29227, (long)(0xD191FF306DC85FBL ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
        this.K = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)18256, (long)(0x10F1B0DDED6FB081L ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
        this.Z = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)2682, (long)(0x6A4D99E7C562FDAFL ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
        this.T = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)8345, (long)(0x7F6A680540BA574BL ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
        this.s = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)25487, (long)(0x663DAE3D87EB945BL ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
        this.w = SecureParameterRegistry.c("\u00c2", (Object)this, (Object)SecureParameterRegistry.c("\u00a4", (int)SecureParameterRegistry.b("n", (int)2093, (long)(0xEFA914247D3FFFEL ^ l)), (long)-4305710132175157939L, (long)l), (boolean)true, Double.TYPE, (long)-4305614705185491532L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureParameterRegistry.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static double G(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.m(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureParameterRegistry.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureParameterRegistry.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static double n(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.g(object);
    }

    private static Method h(long l, long l2) {
        int n = SecureParameterRegistry.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureParameterRegistry.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureParameterRegistry.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureParameterRegistry.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureParameterRegistry.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureParameterRegistry.f(559911439014755L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureParameterRegistry.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureParameterRegistry.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureParameterRegistry.f(559911439014755L, 0L);
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

    private void p(Object object, double d2) {
        this.Z.A(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private double g(Object object) {
        return this.Z.C(object);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "?\"#";
        objectArray[1] = Integer.TYPE;
        SecureParameterRegistry.f[1] = "java/lang/Integer";
        objectArray[2] = "I\u007fd0\u007f\u0003Bpu\u007f\u0002\u001bQw|6";
        objectArray[3] = "w=X'";
        objectArray[4] = Boolean.TYPE;
        SecureParameterRegistry.f[4] = "java/lang/Boolean";
        objectArray[5] = "YP?\u0010?CR_._RCRB:";
        objectArray[6] = "Q%\u001f\f";
        objectArray[7] = "M)%W\u0018\u000fF&4\u0018y\u0001M-0B";
        objectArray[8] = "\u0019wnc.aRz~jUP#.}{67M)};,\u000b\u0019fud'v[s:=U0Fzzm6iLew\u0004im^)n<%s\u0012q\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0000>OU)[\u0011lI?,Nm<GT7TS~\u000e^-5T}\t\\{[S}IFG";
    }

    static double D(SecureParameterRegistry secureParameterRegistry, Object object) {
        return secureParameterRegistry.D(object);
    }

    private void P(Object object, double d2) {
        this.K.A(object, d2);
    }

    static void I(SecureParameterRegistry secureParameterRegistry, Object object, double d2) {
        secureParameterRegistry.w(object, d2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == 'o' || c == '\u00e4' || c == '\u00e1') {
                field = SecureParameterRegistry.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureParameterRegistry.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private double A(Object object) {
        return this.K.C(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureParameterRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureParameterRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

