/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometricCalculator1575;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class NetworkSecurityValidator
extends CryptoProtocolEngine {
    public HK G;
    public HK d;
    private static final String[] g;
    private static final Map e;
    private static final Object[] f;
    public ReflectionUtilityService J;
    private static final long a;
    private static final Integer[] c;
    private static final long[] b;

    private static void a() {
        Object[] objectArray = f;
        f[0] = ".Qf\u000b";
        objectArray[1] = "mYH\u0006sOfVYI\u000eWuQP\u0000";
        objectArray[2] = Boolean.TYPE;
        NetworkSecurityValidator.g[2] = "java/lang/Boolean";
        objectArray[3] = "CV\npN HY\u001b?# HD\u000f";
        objectArray[4] = "\b`\t\u000by\u0014}@\u0002\u0004h[\u0010@\u0002\u0019|N";
        objectArray[5] = "\u0001m8\u000e";
        objectArray[6] = "6^T|<fC~_s-).~_n9<";
        objectArray[7] = "f>:";
        objectArray[8] = Integer.TYPE;
        NetworkSecurityValidator.g[8] = "java/lang/Integer";
        objectArray[9] = ".ryx";
        objectArray[10] = "\u0018\u0017_ciE\u0013\u0018N,\bK\u0018\u0013Jv";
        objectArray[11] = "\u007fF &0\u0012#\u000e7B\u0018#v\u000e8=o\\)U)(_\u001a=N1\"1Q6\r:BeI\"Z8/8N0\rJ~#\u001f0\u0006q.fR~7v~5A>G5/4GO";
        objectArray[12] = "N!4m%^\u0012i#\t\u0007oD:3d8\u0002\u0019=!3JVG\"!95\t\u001c34\ts\u001d\u0007+>g8\u0016D ^3 \u0002\u0013\"3n'\u0010DPbuv\u0010Ok20;^~lbc(\u001e\u000e/3b.o";
        objectArray[13] = "/|%v;es42\u0012\u000fT&4=md+yo,xTmmt4r:&f7?\u0012n>r`=\u007f39`7O,,3'rwb14\u007f\r";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "+\u0000)(B\u000egRol2\tmjjo\\\u0004+Sla^\u0006\u0016Sm\"MRi\f63Xb";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkSecurityValidator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkSecurityValidator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkSecurityValidator.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkSecurityValidator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkSecurityValidator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkSecurityValidator.a = MultiContainerRegistry.a(4149836984585040629L, -6434316768130640881L, MethodHandles.lookup().lookupClass()).a(134609433941654L);
                NetworkSecurityValidator.f = new Object[15];
                NetworkSecurityValidator.g = new String[15];
                NetworkSecurityValidator.a();
                NetworkSecurityValidator.e = new HashMap<K, V>(13);
                var0 = NetworkSecurityValidator.a ^ 102135712383741L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00b7HV\u0097\u00a5-\u00eeu\u0096\"\u00b8q\u001a\u00cc\u009dg\u0082\u009c.\u00da\u0081L\u0006\u00ac\u00a99\u009b.\u00c5\u00a3\u00ff:\u0010\u0017\u00cfwB\u000f|8\u00ff\u00bdt\u008a(\u00ff\u008e\u00e1\u0013\u00f4o50p\u00d4\u00b5\u00b6S6\u0093\u0016r\u00e4:\u00a8\u00d4-&P\u00a9('\n\u0090\u00b5\u0010\u00da\u00e1W\u008c";
                var7_6 = "\u00b7HV\u0097\u00a5-\u00eeu\u0096\"\u00b8q\u001a\u00cc\u009dg\u0082\u009c.\u00da\u0081L\u0006\u00ac\u00a99\u009b.\u00c5\u00a3\u00ff:\u0010\u0017\u00cfwB\u000f|8\u00ff\u00bdt\u008a(\u00ff\u008e\u00e1\u0013\u00f4o50p\u00d4\u00b5\u00b6S6\u0093\u0016r\u00e4:\u00a8\u00d4-&P\u00a9('\n\u0090\u00b5\u0010\u00da\u00e1W\u008c".length();
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
                    var6_5 = "\u00db?.D-\u009d\u0095J\u00b9\u00e4\u00804[l\u00d1\u0093";
                    var7_6 = "\u00db?.D-\u009d\u0095J\u00b9\u00e4\u00804[l\u00d1\u0093".length();
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
        NetworkSecurityValidator.b = var8_3;
        NetworkSecurityValidator.c = new Integer[12];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 16;
                break;
            }
            case 6: {
                n3 = 50;
                break;
            }
            case 7: {
                n3 = 18;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 30;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 57;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 41;
                break;
            }
            case 22: {
                n3 = 59;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 51;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 17;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 62;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 2;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 24;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 44;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 14;
                break;
            }
            case 43: {
                n3 = 55;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 12;
                break;
            }
            case 49: {
                n3 = 8;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 21;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 19;
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
        NetworkSecurityValidator.g[n4] = new String(cArray);
        return n4;
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

    private static Field g(long l, long l2) {
        int n = NetworkSecurityValidator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkSecurityValidator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkSecurityValidator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkSecurityValidator.c(clazz3, string2, clazz2)) != null) {
                    NetworkSecurityValidator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkSecurityValidator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkSecurityValidator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkSecurityValidator.f(766958166360936L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x79A5;
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
                throw new RuntimeException("a/vs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkSecurityValidator.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object k(Object object) {
        return this.J.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkSecurityValidator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkSecurityValidator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkSecurityValidator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = NetworkSecurityValidator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkSecurityValidator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkSecurityValidator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkSecurityValidator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkSecurityValidator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkSecurityValidator.f(766958166360936L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkSecurityValidator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkSecurityValidator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkSecurityValidator.f(766958166360936L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == 'y' || c == 'I' || c == '\u00f1') {
                field = NetworkSecurityValidator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkSecurityValidator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     */
    public NetworkSecurityValidator() {
        block91: {
            block92: {
                block88: {
                    block90: {
                        block85: {
                            block86: {
                                block80: {
                                    block84: {
                                        block82: {
                                            block81: {
                                                var1_1 = NetworkSecurityValidator.a ^ 121093289193216L;
                                                v0 = GeometricCalculator1575.o();
                                                super(ReflectionMetadataResolver.VD);
                                                var3_2 = v0;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v1 = GeometryCalculator.C();
                                                                    if (var3_2 == null) break block80;
                                                                    if (v1 >= 15) {
                                                                    }
                                                                    ** GOTO lbl125
                                                                }
                                                                catch (CustomSystemException v2) {
                                                                    throw NetworkSecurityValidator.a(v2);
                                                                }
                                                                v3 = GeometryCalculator.C();
                                                                v4 = 35;
                                                                if (var3_2 == null) break block81;
                                                            }
                                                            catch (CustomSystemException v5) {
                                                                throw NetworkSecurityValidator.a(v5);
                                                            }
                                                            if (v3 >= v4) {
                                                            }
                                                            ** GOTO lbl67
                                                        }
                                                        catch (CustomSystemException v6) {
                                                            throw NetworkSecurityValidator.a(v6);
                                                        }
                                                        v3 = GeometryCalculator.C();
                                                        if (var3_2 == null) break block82;
                                                    }
                                                    catch (CustomSystemException v7) {
                                                        throw NetworkSecurityValidator.a(v7);
                                                    }
                                                    v4 = 50;
                                                }
                                                catch (CustomSystemException v8) {
                                                    throw NetworkSecurityValidator.a(v8);
                                                }
                                            }
                                            try {
                                                if (v3 >= v4) {
                                                    v3 = (int)GameVersionEnumerator.MC_1_21_0.H();
                                                }
                                                ** GOTO lbl62
                                            }
                                            catch (CustomSystemException v9) {
                                                throw NetworkSecurityValidator.a(v9);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    block83: {
                                                        try {
                                                            if (v3 == 0) break block83;
                                                            this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)14495, (long)(2362104751654414605L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F0, ReflectionMetadataResolver.YU}, (long)7508785539745307009L, (long)var1_1);
                                                            if (var3_2 != null) break block84;
                                                        }
                                                        catch (CustomSystemException v10) {
                                                            throw NetworkSecurityValidator.a(v10);
                                                        }
                                                    }
                                                    this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)11755, (long)(863005869715799152L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F0, Float.TYPE}, (long)7508785539745307009L, (long)var1_1);
                                                    if (var3_2 != null) break block84;
                                                }
                                                catch (CustomSystemException v11) {
                                                    throw NetworkSecurityValidator.a(v11);
                                                }
lbl62:
                                                // 2 sources

                                                this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)25071, (long)(796362682987573365L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Float.TYPE}, (long)7508785539745307009L, (long)var1_1);
                                                if (var3_2 != null) break block84;
                                            }
                                            catch (CustomSystemException v12) {
                                                throw NetworkSecurityValidator.a(v12);
                                            }
lbl67:
                                            // 2 sources

                                            this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)ReflectionMetadataResolver.VD, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)12121, (long)(1145964086202023630L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v13) {
                                            throw NetworkSecurityValidator.a(v13);
                                        }
                                    }
                                    try {
                                        try {
                                            block87: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v1 = (int)ObjectLifecycleTracker.z;
                                                                                if (var3_2 == null) break block85;
                                                                                if (v1 != 0) break block86;
                                                                            }
                                                                            catch (CustomSystemException v14) {
                                                                                throw NetworkSecurityValidator.a(v14);
                                                                            }
                                                                            v1 = (int)this.d.v();
                                                                            if (var3_2 == null) break block85;
                                                                        }
                                                                        catch (CustomSystemException v15) {
                                                                            throw NetworkSecurityValidator.a(v15);
                                                                        }
                                                                        if (v1 != 0) break block86;
                                                                    }
                                                                    catch (CustomSystemException v16) {
                                                                        throw NetworkSecurityValidator.a(v16);
                                                                    }
                                                                    v1 = (int)TemporalMetadataResolver.h.J();
                                                                    if (var3_2 == null) break block85;
                                                                }
                                                                catch (CustomSystemException v17) {
                                                                    throw NetworkSecurityValidator.a(v17);
                                                                }
                                                                if (v1 == 0) break block86;
                                                            }
                                                            catch (CustomSystemException v18) {
                                                                throw NetworkSecurityValidator.a(v18);
                                                            }
                                                            if (GeometryCalculator.C() < 35) break block87;
                                                        }
                                                        catch (CustomSystemException v19) {
                                                            throw NetworkSecurityValidator.a(v19);
                                                        }
                                                        if (ReflectionMetadataResolver.EW == null) break block86;
                                                    }
                                                    catch (CustomSystemException v20) {
                                                        throw NetworkSecurityValidator.a(v20);
                                                    }
                                                    this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)ReflectionMetadataResolver.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                                    if (var3_2 != null) break block86;
                                                }
                                                catch (CustomSystemException v21) {
                                                    throw NetworkSecurityValidator.a(v21);
                                                }
                                            }
                                            this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)ReflectionMetadataResolver.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                            if (var3_2 != null) break block86;
                                        }
                                        catch (CustomSystemException v22) {
                                            throw NetworkSecurityValidator.a(v22);
                                        }
lbl125:
                                        // 2 sources

                                        this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)ReflectionMetadataResolver.VD, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)30208, (long)(9003485105339525017L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                        v1 = (int)ObjectLifecycleTracker.z;
                                    }
                                    catch (CustomSystemException v23) {
                                        throw NetworkSecurityValidator.a(v23);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_2 == null) break block85;
                                                        if (v1 != 0) break block86;
                                                    }
                                                    catch (CustomSystemException v24) {
                                                        throw NetworkSecurityValidator.a(v24);
                                                    }
                                                    v1 = (int)this.d.v();
                                                    if (var3_2 == null) break block85;
                                                }
                                                catch (CustomSystemException v25) {
                                                    throw NetworkSecurityValidator.a(v25);
                                                }
                                                if (v1 != 0) break block86;
                                            }
                                            catch (CustomSystemException v26) {
                                                throw NetworkSecurityValidator.a(v26);
                                            }
                                            v1 = (int)TemporalMetadataResolver.h.J();
                                            if (var3_2 == null) break block85;
                                        }
                                        catch (CustomSystemException v27) {
                                            throw NetworkSecurityValidator.a(v27);
                                        }
                                        if (v1 == 0) break block86;
                                    }
                                    catch (CustomSystemException v28) {
                                        throw NetworkSecurityValidator.a(v28);
                                    }
                                    this.d = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)ReflectionMetadataResolver.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{Float.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                }
                                catch (CustomSystemException v29) {
                                    throw NetworkSecurityValidator.a(v29);
                                }
                            }
                            v1 = GeometryCalculator.C();
                        }
                        try {
                            block89: {
                                try {
                                    try {
                                        try {
                                            v30 = 35;
                                            if (var3_2 == null) break block88;
                                            if (v1 >= v30) {
                                            }
                                            ** GOTO lbl197
                                        }
                                        catch (CustomSystemException v31) {
                                            throw NetworkSecurityValidator.a(v31);
                                        }
                                        if (GeometryCalculator.C() < 50) break block89;
                                    }
                                    catch (CustomSystemException v32) {
                                        throw NetworkSecurityValidator.a(v32);
                                    }
                                    this.G = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)26813, (long)(5425653873198594345L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F0, ReflectionMetadataResolver.C}, (long)7508785539745307009L, (long)var1_1);
                                    if (var3_2 != null) break block90;
                                }
                                catch (CustomSystemException v33) {
                                    throw NetworkSecurityValidator.a(v33);
                                }
                            }
                            this.G = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)15187, (long)(1973698866337163973L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, ReflectionMetadataResolver.C}, (long)7508785539745307009L, (long)var1_1);
                        }
                        catch (CustomSystemException v34) {
                            throw NetworkSecurityValidator.a(v34);
                        }
                    }
                    try {
                        try {
                            this.J = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)19992, (long)(2324571742116306816L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (long)7508934469772668220L, (long)var1_1);
                            if (var3_2 != null) break block91;
lbl197:
                            // 2 sources

                            v1 = GeometryCalculator.C();
                            if (var3_2 == null) break block92;
                        }
                        catch (CustomSystemException v35) {
                            throw NetworkSecurityValidator.a(v35);
                        }
                        v30 = 13;
                    }
                    catch (CustomSystemException v36) {
                        throw NetworkSecurityValidator.a(v36);
                    }
                }
                try {
                    if (v1 == v30) {
                        v1 = (int)ObjectLifecycleTracker.U.d();
                    }
                    ** GOTO lbl230
                }
                catch (CustomSystemException v37) {
                    throw NetworkSecurityValidator.a(v37);
                }
            }
            try {
                try {
                    block93: {
                        try {
                            if (v1 == 0) break block93;
                            this.G = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)6939, (long)(8643122022900042378L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.C, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.ts}, (long)7508785539745307009L, (long)var1_1);
                            if (var3_2 != null) break block91;
                        }
                        catch (CustomSystemException v38) {
                            throw NetworkSecurityValidator.a(v38);
                        }
                    }
                    this.G = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)9350, (long)(9135678326925407507L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.C, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.ts}, (long)7508785539745307009L, (long)var1_1);
                    if (var3_2 != null) break block91;
                }
                catch (CustomSystemException v39) {
                    throw NetworkSecurityValidator.a(v39);
                }
lbl230:
                // 2 sources

                this.G = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)9337, (long)(583605686680335849L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.C, ReflectionMetadataResolver.U8}, (long)7508785539745307009L, (long)var1_1);
                this.J = NetworkSecurityValidator.c("\u00c8", (Object)this, (Object)NetworkSecurityValidator.c("\u00c0", (int)NetworkSecurityValidator.b("n", (int)25571, (long)(6897024801735668336L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, String.class, (long)7508934469772668220L, (long)var1_1);
            }
            catch (CustomSystemException v40) {
                throw NetworkSecurityValidator.a(v40);
            }
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                GeometricCalculator1575.G(new int[1]);
            }
        }
        catch (CustomSystemException v41) {
            throw NetworkSecurityValidator.a(v41);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkSecurityValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NetworkSecurityValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

