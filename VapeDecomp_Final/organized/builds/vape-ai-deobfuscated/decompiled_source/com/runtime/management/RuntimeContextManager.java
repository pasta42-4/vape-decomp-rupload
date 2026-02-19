/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.management;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.type.registry.DynamicTypeRegistry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RuntimeContextManager
extends CryptoProtocolEngine {
    private static final long[] b;
    private static final String[] f;
    private static final long a;
    private final HK p;
    private static final Map d;
    private HK I;
    private static final Object[] e;
    private static final Integer[] c;

    static Object J(RuntimeContextManager runtimeContextManager, Object object, Object object2) {
        return runtimeContextManager.M(object, object2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = RuntimeContextManager.e(l, l2);
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
                clazz3 = RuntimeContextManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RuntimeContextManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RuntimeContextManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        RuntimeContextManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RuntimeContextManager.f(738325227972950L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RuntimeContextManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RuntimeContextManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RuntimeContextManager.f(738325227972950L, 0L);
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

    private static Field g(long l, long l2) {
        int n = RuntimeContextManager.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = RuntimeContextManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RuntimeContextManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RuntimeContextManager.c(clazz3, string2, clazz2)) != null) {
                    RuntimeContextManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RuntimeContextManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RuntimeContextManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RuntimeContextManager.f(738325227972950L, 0L);
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
            int n = RuntimeContextManager.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                RuntimeContextManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ")c\t\u0005";
        objectArray[1] = ",\u0002d=b<'\rur\u001f$4\n|;";
        objectArray[2] = Boolean.TYPE;
        RuntimeContextManager.f[2] = "java/lang/Boolean";
        objectArray[3] = "8\u001cM{0a3\u0013\\4]a3\u000eH";
        objectArray[4] = "\u00183b)Z\u0006m\u0013i&KI\u0000\u0013i;_\\";
        objectArray[5] = "Z\nz0";
        objectArray[6] = "Cd\u0011fX\u00046D\u001aiIK[D\u001at]^";
        objectArray[7] = "+FIu\u0000K^fBz\u0011\u00043fBg\u0005\u0011";
        objectArray[8] = "\u0010\u001a\r";
        objectArray[9] = Integer.TYPE;
        RuntimeContextManager.f[9] = "java/lang/Integer";
        objectArray[10] = "?\u0011:H\u0019W4\u001e+\u0007xY?\u0015/]";
        objectArray[11] = "^4I8g>\u001aaQ\t\\_\u001eeJwu&[0A\t\"9\u001e2Bmc4\u0018d+3c \u001f0@vu4[\n\u00161|a\u0010cTqc8a1R1r-\u0019j[h'_";
        objectArray[12] = "E\u0007\t\u001cpu\u0001R\u0011-A\u0014@A\u0014S6\u007f\u0005W\u0000\u0017\fk\u0015X\u0015Cu.@Sk\u0014jkBP\u000fUgm\u00149QUsj@R\u0014Cg.z\u0004SJ2e\u0013F\u0013Uk\u0014A@SD~l\u001aI\n\u0011\f";
        objectArray[13] = "_,{\u00109Q\u001byc!!0Zjf_\u007f[\u001f|r\u001bEO\u000fsgO<\nZx\u0019\u0018#OX{}Y.I\u000e\u0012#Y:NZyfO.\n`/!F{A\tmaY\"0[k!H7H\u0000bx\u001dE";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "k\u00154gO\u0003*V=`/\r..rxN[jK>=\u0017\tUQ#cQ\b,\u0014vh/";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xEA3;
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
                throw new RuntimeException("a/mi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RuntimeContextManager.c[n2] = n3;
        }
        return c[n2];
    }

    private String Y(Object object, Object object2) {
        return (String)this.p.T(object, object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RuntimeContextManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RuntimeContextManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RuntimeContextManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static List E(RuntimeContextManager runtimeContextManager, Object object, Object object2) {
        return runtimeContextManager.K(object, object2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = RuntimeContextManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RuntimeContextManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ff' || c == '\u00b5' || c == '\u00da' || c == 'F') {
                field = RuntimeContextManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RuntimeContextManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 40;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 36;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 11;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 38;
                break;
            }
            case 14: {
                n3 = 41;
                break;
            }
            case 15: {
                n3 = 3;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 31;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 62;
                break;
            }
            case 24: {
                n3 = 48;
                break;
            }
            case 25: {
                n3 = 60;
                break;
            }
            case 26: {
                n3 = 57;
                break;
            }
            case 27: {
                n3 = 25;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 56;
                break;
            }
            case 32: {
                n3 = 61;
                break;
            }
            case 33: {
                n3 = 8;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 30;
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
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 43;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 16;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 39;
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
        RuntimeContextManager.f[n4] = new String(cArray);
        return n4;
    }

    static String N(RuntimeContextManager runtimeContextManager, Object object, Object object2) {
        return runtimeContextManager.Y(object, object2);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RuntimeContextManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private List K(Object object, Object object2) {
        return (List)this.I.T(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RuntimeContextManager.a = MultiContainerRegistry.a(-8369777742709142709L, 4573103586566394054L, MethodHandles.lookup().lookupClass()).a(121619843147454L);
                RuntimeContextManager.e = new Object[15];
                RuntimeContextManager.f = new String[15];
                RuntimeContextManager.a();
                RuntimeContextManager.d = new HashMap<K, V>(13);
                var0 = RuntimeContextManager.a ^ 114565893269912L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00de/\u00b3_\u00e5\u00af\u0085c\u001c\u00bc\u00f6\u00b8\u008eF\u0001\u00e6";
                var7_6 = "\u00de/\u00b3_\u00e5\u00af\u0085c\u001c\u00bc\u00f6\u00b8\u008eF\u0001\u00e6".length();
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
                    var6_5 = "\u00839w\u0005\u0016\u00ca\u00fb\u0081\u008a\u00ef\u00d6qMB44";
                    var7_6 = "\u00839w\u0005\u0016\u00ca\u00fb\u0081\u008a\u00ef\u00d6qMB44".length();
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
        RuntimeContextManager.b = var8_3;
        RuntimeContextManager.c = new Integer[4];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    public RuntimeContextManager() {
        block19: {
            block16: {
                block17: {
                    block15: {
                        var1_1 = RuntimeContextManager.a ^ 45434051116130L;
                        v0 = DynamicTypeRegistry.B();
                        super(ReflectionMetadataResolver.Fl);
                        var3_2 = v0;
                        try {
                            try {
                                v1 = GeometryCalculator.C();
                                v2 = 23;
                                if (var3_2 != null) break block15;
                                if (v1 >= v2) {
                                }
                                ** GOTO lbl34
                            }
                            catch (CustomSystemException v3) {
                                throw RuntimeContextManager.a(v3);
                            }
                            v1 = GeometryCalculator.C();
                            v2 = 50;
                        }
                        catch (CustomSystemException v4) {
                            throw RuntimeContextManager.a(v4);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var3_2 != null) break block16;
                                if (v1 >= v2) break block17;
                            }
                            catch (CustomSystemException v5) {
                                throw RuntimeContextManager.a(v5);
                            }
                            this.I = RuntimeContextManager.c("\u00d3", (Object)this, (Object)ReflectionMetadataResolver.tT, (Object)RuntimeContextManager.c("t", (int)RuntimeContextManager.b("m", (int)11708, (long)(1349258496713756224L ^ var1_1)), (long)3269021747481087446L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)3268793869163179825L, (long)var1_1);
                            if (var3_2 == null) break block17;
                        }
                        catch (CustomSystemException v6) {
                            throw RuntimeContextManager.a(v6);
                        }
lbl34:
                        // 2 sources

                        this.I = RuntimeContextManager.c("\u00d3", (Object)this, (Object)RuntimeContextManager.c("t", (int)RuntimeContextManager.b("m", (int)14633, (long)(8656328697351609044L ^ var1_1)), (long)3269021747481087446L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)3268678197919513785L, (long)var1_1);
                    }
                    catch (CustomSystemException v7) {
                        throw RuntimeContextManager.a(v7);
                    }
                }
                v1 = GeometryCalculator.C();
                v2 = 35;
            }
            try {
                block18: {
                    try {
                        if (v1 < v2) break block18;
                        this.p = RuntimeContextManager.c("\u00d3", (Object)this, (Object)ReflectionMetadataResolver.VP, (Object)RuntimeContextManager.c("t", (int)RuntimeContextManager.b("m", (int)18007, (long)(11391512970487208L ^ var1_1)), (long)3269021747481087446L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)3268842900055585812L, (long)var1_1);
                        if (var3_2 == null) break block19;
                    }
                    catch (CustomSystemException v8) {
                        throw RuntimeContextManager.a(v8);
                    }
                }
                this.p = RuntimeContextManager.c("\u00d3", (Object)this, (Object)RuntimeContextManager.c("t", (int)RuntimeContextManager.b("m", (int)26985, (long)(8712010762552658583L ^ var1_1)), (long)3269021747481087446L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)3268678197919513785L, (long)var1_1);
            }
            catch (CustomSystemException v9) {
                throw RuntimeContextManager.a(v9);
            }
        }
    }

    private Object M(Object object, Object object2) {
        return this.p.T(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RuntimeContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(RuntimeContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

