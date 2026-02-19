/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
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

public class CipherConfigurationResolver
extends CryptoProtocolEngine {
    private static final Map d;
    private static final long a;
    public HK J;
    private static final String[] f;
    private static final long[] b;
    public HK y;
    private ReflectionUtilityService V;
    private static final Integer[] c;
    public HK w;
    private static String g;
    private static final Object[] e;

    private static Field g(long l, long l2) {
        int n = CipherConfigurationResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherConfigurationResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherConfigurationResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherConfigurationResolver.c(clazz3, string2, clazz2)) != null) {
                    CipherConfigurationResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherConfigurationResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherConfigurationResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherConfigurationResolver.f(813563031023145L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String Z(Object object) {
        return (String)this.V.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherConfigurationResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherConfigurationResolver.a = MultiContainerRegistry.a(2840390233401702771L, 6704473905943563437L, MethodHandles.lookup().lookupClass()).a(212925014627977L);
                CipherConfigurationResolver.e = new Object[16];
                CipherConfigurationResolver.f = new String[16];
                CipherConfigurationResolver.a();
                CipherConfigurationResolver.d = new HashMap<K, V>(13);
                CipherConfigurationResolver.A(null);
                var0 = CipherConfigurationResolver.a ^ 129224530052542L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00b6\u00a6\u0014\u00be\u0087\u00b3\u009b[\u00b4\u00d0|_C\u00bb.v\u00e9\u00fcg\u00f3\u00be\u00b5\n\u00c4\u00be\u008ewo3\u00c8@\u00e2\u0097=\u00df\u00d5\u00baE\u00ba\u009a";
                var7_6 = "\u00b6\u00a6\u0014\u00be\u0087\u00b3\u009b[\u00b4\u00d0|_C\u00bb.v\u00e9\u00fcg\u00f3\u00be\u00b5\n\u00c4\u00be\u008ewo3\u00c8@\u00e2\u0097=\u00df\u00d5\u00baE\u00ba\u009a".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00d6\u0015\u00ac\u00d6\u008ez=A\u00ce\u00c4\t\u00c6@\u00f5\u00e6\u00a7";
                    var7_6 = "\u00d6\u0015\u00ac\u00d6\u008ez=A\u00ce\u00c4\t\u00c6@\u00f5\u00e6\u00a7".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        CipherConfigurationResolver.b = var8_3;
        CipherConfigurationResolver.c = new Integer[7];
    }

    public CipherConfigurationResolver() {
        block8: {
            long l;
            block6: {
                block7: {
                    l = a ^ 0x24BAB95B0D52L;
                    String string = CipherConfigurationResolver.I();
                    super(ReflectionMetadataResolver.P4);
                    String string2 = string;
                    try {
                        try {
                            try {
                                this.w = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CipherConfigurationResolver.c("S", (Object)this, (Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)14553, (long)(0x3E546FDDF58FDEC5L ^ l)), (long)-2267887284416789278L, (long)l), Void.TYPE, (Object)new Class[0], (long)-2267947488078649840L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)25754, (long)(0x24FB8172E8428284L ^ l)), (long)-2267887284416789278L, (long)l)))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rU)).M();
                                if (string2 != null) break block6;
                                if (GeometryCalculator.C() < 35) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherConfigurationResolver.a(customSystemException);
                            }
                            this.V = CipherConfigurationResolver.c("S", (Object)this, (Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)5061, (long)(0x18BD55EC21CC75DAL ^ l)), (long)-2267887284416789278L, (long)l), (boolean)true, String.class, (long)-2268117356632878883L, (long)l);
                            this.J = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CipherConfigurationResolver.c("S", (Object)this, (Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)26061, (long)(0x2C4BFF72487B03D4L ^ l)), (long)-2267887284416789278L, (long)l), Void.TYPE, (Object)new Class[]{String.class}, (long)-2267947488078649840L, (long)l))).F(ReflectionMetadataResolver.UZ)).n(GameVersionEnumerator.MC_1_21_4.g(), ObjectLifecycleTracker.z)).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)26644, (long)(0x6B46B3E4856E0E0FL ^ l)), (long)-2267887284416789278L, (long)l)))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rU)).M();
                            if (string2 == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherConfigurationResolver.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[4]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherConfigurationResolver.a(customSystemException);
                    }
                }
                this.J = CipherConfigurationResolver.c("S", (Object)this, (Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)12804, (long)(0x2AE5AEA15AD25419L ^ l)), (long)-2267887284416789278L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{String.class}, (long)-2268044746513221210L, (long)l);
            }
            this.V = CipherConfigurationResolver.c("S", (Object)this, (Object)CipherConfigurationResolver.c("\u00c0", (int)CipherConfigurationResolver.b("x", (int)2700, (long)(0x3ABF48D7B5846C94L ^ l)), (long)-2267887284416789278L, (long)l), (boolean)true, String.class, (long)-2268117356632878883L, (long)l);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'p' || c == 'M' || c == '\u00f0') {
                field = CipherConfigurationResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherConfigurationResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherConfigurationResolver.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherConfigurationResolver.e[n] = clazz = Class.forName(f[n]);
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
        MethodHandle methodHandle = CipherConfigurationResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CipherConfigurationResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherConfigurationResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CipherConfigurationResolver.e(l, l2);
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
                clazz3 = CipherConfigurationResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherConfigurationResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherConfigurationResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherConfigurationResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherConfigurationResolver.f(813563031023145L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherConfigurationResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherConfigurationResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherConfigurationResolver.f(813563031023145L, 0L);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherConfigurationResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherConfigurationResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String I() {
        return g;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x698;
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
                throw new RuntimeException("a/PA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherConfigurationResolver.c[n2] = n3;
        }
        return c[n2];
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
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 25;
                break;
            }
            case 4: {
                n3 = 45;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 36;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 42;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 6;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 1;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 15;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 56;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 63;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 44;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 33;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 39;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 40;
                break;
            }
            case 47: {
                n3 = 48;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 9;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 13;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 32;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 62;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 26;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 49;
                break;
            }
            default: {
                n3 = 27;
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
        CipherConfigurationResolver.f[n4] = new String(cArray);
        return n4;
    }

    public static void A(String string) {
        g = string;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u000b?a&";
        objectArray[1] = "?Ed@:,4Ju\u000fG4'M|F";
        objectArray[2] = Boolean.TYPE;
        CipherConfigurationResolver.f[2] = "java/lang/Boolean";
        objectArray[3] = "R{sT\u001e5Ytb\u001bs5Yiv";
        objectArray[4] = ">@\u0001\nf4K`\n\u0005w{&`\n\u0018cn";
        objectArray[5] = ".\u00047\u001d";
        objectArray[6] = "{`I";
        objectArray[7] = Integer.TYPE;
        CipherConfigurationResolver.f[7] = "java/lang/Integer";
        objectArray[8] = "T,@A";
        objectArray[9] = "\u0002K,*&\u0015wk'%7Z\u001ak'8#O";
        objectArray[10] = "W\u0017DM";
        objectArray[11] = "-QsF\b\u001f&^b\ti\u0011-UfS";
        objectArray[12] = "(4,0za%#z\u000bT\u00045''6av(}\"\u000b*ay.-f~=vxB1(|\"&~d*b;E|pl\u007f7*9ux;G~?bsi6?|h-\u0004";
        objectArray[13] = "\r55\u001dGs\u0000\"c&u\u0016\u0010&>\u001b\\d\r|;&\u0017s\\/4KC/Sy[\u001c\u0015n\u0007'gI\u0017p\u001eDfCB&\u000e|?CO*b";
        objectArray[14] = "\u0015*\u0015a8XB3Ct\u0005ORA\u0019&5F\u0016~VpfJ)3F~8V[.\u001c{\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "3\tR\u0010\f\u0018>\u001e\u0004+\u0007}.\u001aY\u0016\u0017\u000f3@\\+_F$\u001d_\u0017\nD:\u0004<\u0015\u001e\u0002'\bSP\u001b\u0016cx\u0002Z\bC @[\u0015^\u0019\\";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherConfigurationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CipherConfigurationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

