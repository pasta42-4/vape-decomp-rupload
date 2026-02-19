/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.reflection;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationCoordinator;
import com.system.lifecycle.ObjectLifecycleTracker;
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

public class ReflectionContextResolver
extends CryptoProtocolEngine {
    private HK i;
    private final HK c;
    private HK q;
    private static final long[] b;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;
    private final HK p;
    private static final long a;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionContextResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field g(long l, long l2) {
        int n = ReflectionContextResolver.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionContextResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionContextResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionContextResolver.c(clazz3, string2, clazz2)) != null) {
                    ReflectionContextResolver.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionContextResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionContextResolver.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionContextResolver.f(617537874541240L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static Object f(ReflectionContextResolver reflectionContextResolver, Object object, int n) {
        return reflectionContextResolver.t(object, n);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n3 = 13;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 28;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 54;
                break;
            }
            case 9: {
                n3 = 39;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 55;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 5;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 43;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 51;
                break;
            }
            case 40: {
                n3 = 19;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 37;
                break;
            }
            case 45: {
                n3 = 24;
                break;
            }
            case 46: {
                n3 = 20;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 21;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 42;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 58;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 9;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 6;
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
        ReflectionContextResolver.g[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionContextResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionContextResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = ReflectionContextResolver.e(l, l2);
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
                clazz3 = ReflectionContextResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionContextResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionContextResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionContextResolver.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionContextResolver.f(617537874541240L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionContextResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionContextResolver.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionContextResolver.f(617537874541240L, 0L);
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

    private String u(Object object) {
        return this.q.T(object, new Object[0]).toString();
    }

    static String i(ReflectionContextResolver reflectionContextResolver, Object object) {
        return reflectionContextResolver.u(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'H' || c == '\u00aa' || c == '\u00cb') {
                field = ReflectionContextResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionContextResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionContextResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object t(Object object, int n) {
        return this.c.T(object, n);
    }

    static boolean V(ReflectionContextResolver reflectionContextResolver, Object object) {
        return reflectionContextResolver.q(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ReflectionContextResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionContextResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean q(Object object) {
        return this.i.V(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static int Y(ReflectionContextResolver reflectionContextResolver, Object object) {
        return reflectionContextResolver.M(object);
    }

    public ReflectionContextResolver() {
        block9: {
            CallSite callSite;
            ReflectionContextResolver reflectionContextResolver;
            long l;
            block12: {
                Object object;
                block10: {
                    block11: {
                        int[] nArray;
                        block8: {
                            l = a ^ 0x41583550B4AAL;
                            int[] nArray2 = ResourceAllocationCoordinator.k();
                            super(ReflectionMetadataResolver.Uw);
                            nArray = nArray2;
                            try {
                                try {
                                    this.p = ReflectionContextResolver.c("e", (Object)this, (Object)ReflectionContextResolver.c("\u00d2", (int)ReflectionContextResolver.b("b", (int)25000, (long)(0x33A1386BA8661D53L ^ l)), (long)4292673330420991800L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)4292615483840176322L, (long)l);
                                    this.c = ReflectionContextResolver.c("e", (Object)this, (Object)ReflectionContextResolver.c("\u00d2", (int)ReflectionContextResolver.b("b", (int)11476, (long)(0x3E012FFFF835D02EL ^ l)), (long)4292673330420991800L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{Integer.TYPE}, (long)4292615483840176322L, (long)l);
                                    if (nArray == null) break block8;
                                    if (GeometryCalculator.C() != 13) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectionContextResolver.a(customSystemException);
                                }
                                this.q = ReflectionContextResolver.c("e", (Object)this, (Object)ReflectionContextResolver.c("\u00d2", (int)ReflectionContextResolver.b("b", (int)22167, (long)(0x6BA23B427E5BAA6FL ^ l)), (long)4292673330420991800L, (long)l), (boolean)true, String.class, (Object)new Class[0], (long)4292615483840176322L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionContextResolver.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                ReflectionContextResolver reflectionContextResolver2 = this;
                                reflectionContextResolver = this;
                                object = ObjectLifecycleTracker.U.d();
                                if (nArray == null) break block10;
                                if (object == 0) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionContextResolver.a(customSystemException);
                            }
                            callSite = ReflectionContextResolver.c("\u00d2", (int)ReflectionContextResolver.b("b", (int)13301, (long)(0x1A8B4F69E3DECF0AL ^ l)), (long)4292673330420991800L, (long)l);
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionContextResolver.a(customSystemException);
                        }
                    }
                    object = ReflectionContextResolver.b("b", (int)1935, (long)(0x5722DF7E5EA0FB76L ^ l));
                }
                callSite = ReflectionContextResolver.c("\u00d2", (int)object, (long)4292673330420991800L, (long)l);
            }
            reflectionContextResolver2.i = ReflectionContextResolver.c("e", (Object)reflectionContextResolver, (Object)callSite, (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)4292615483840176322L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionContextResolver.a = MultiContainerRegistry.a(-689277716647467039L, -4730352431485004821L, MethodHandles.lookup().lookupClass()).a(173778343955909L);
                ReflectionContextResolver.f = new Object[11];
                ReflectionContextResolver.g = new String[11];
                ReflectionContextResolver.a();
                ReflectionContextResolver.e = new HashMap<K, V>(13);
                var0 = ReflectionContextResolver.a ^ 61555924818044L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00c0\u00f1*\u001c\u0018\u00a3B_H<\u00bf\u0092K\u0092\u0017\u008f\u0090+\u001a\u00da\u00907\u00117";
                var7_6 = "\u00c0\u00f1*\u001c\u0018\u00a3B_H<\u00bf\u0092K\u0092\u0017\u008f\u0090+\u001a\u00da\u00907\u00117".length();
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
                    var6_5 = ";\u0003\u00b9\u00f8\u0002}h\u00e1A\u00bb\u00b6\u0086\u00e9H\u00d6W";
                    var7_6 = ";\u0003\u00b9\u00f8\u0002}h\u00e1A\u00bb\u00b6\u0086\u00e9H\u00d6W".length();
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
        ReflectionContextResolver.b = var8_3;
        ReflectionContextResolver.d = new Integer[5];
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "k3\u001c\u0015";
        objectArray[1] = "\"~s\f\u0013\u001b)qbCn\u0003:vk\n";
        objectArray[2] = Boolean.TYPE;
        ReflectionContextResolver.g[2] = "java/lang/Boolean";
        objectArray[3] = "\u0015+X^\u001d\u001e\u001e$I\u0011p\u001e\u001e9]";
        objectArray[4] = "LE\u0018pR]9e\u0013\u007fC\u0012Te\u0013bW\u0007";
        objectArray[5] = "j\u0010gu";
        objectArray[6] = "=i5";
        objectArray[7] = Integer.TYPE;
        ReflectionContextResolver.g[7] = "java/lang/Integer";
        objectArray[8] = "@0\u0015mEBK?\u0004\"$L@4\u0000x";
        objectArray[9] = ";\u0011\n\u0002\rrc\u0018]~5\u001e(P\u0002\u0010\u0012n#\u0001\u0005~Kp!\u0019\u0019\u0004\u0003\"9^fDLz7\t\u0004\u001bI%0`\\\u0003Laf_\u001aD\n!Z[\u0004C\u0003lg]\n\u001a\u001c\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "Y\t&\u001e-\u000f\u001dHvVC\u0019\u001e6p\\2M\bL<[r\u001ceD}\u0003-\u0012\u0015O,\u0004C";
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x476B;
        if (d[n2] == null) {
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
                throw new RuntimeException("a/UX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionContextResolver.d[n2] = n3;
        }
        return d[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionContextResolver.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionContextResolver.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private int M(Object object) {
        return this.p.R(object, new Object[0]);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ReflectionContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

