/*
 * Decompiled with CFR 0.152.
 */
package com.utils.reflection;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
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

public class ReflectionUtilityManager
extends CryptoProtocolEngine {
    private static final long[] b;
    private static final Object[] e;
    private static AbstractComputationKernel[] N;
    private final ReflectionUtilityService F;
    private final HK V;
    private static final long a;
    private static final String[] f;
    private final HK i;
    private static final Integer[] c;
    private static final Map d;
    private final HK s;

    private static Method h(long l, long l2) {
        int n = ReflectionUtilityManager.e(l, l2);
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
                clazz3 = ReflectionUtilityManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtilityManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtilityManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtilityManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtilityManager.f(818009961827703L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtilityManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtilityManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtilityManager.f(818009961827703L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object M(ReflectionUtilityManager reflectionUtilityManager, Object object) {
        return reflectionUtilityManager.p(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00a5' || c == '\u00e9' || c == 'F') {
                field = ReflectionUtilityManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtilityManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l, long l2) {
        int n = ReflectionUtilityManager.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtilityManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtilityManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtilityManager.c(clazz3, string2, clazz2)) != null) {
                    ReflectionUtilityManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtilityManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtilityManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtilityManager.f(818009961827703L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtilityManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtilityManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void E(AbstractComputationKernel[] abstractComputationKernelArray) {
        N = abstractComputationKernelArray;
    }

    public static AbstractComputationKernel[] A() {
        return N;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private Object p(Object object) {
        return this.F.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int q(Object object) {
        return this.V.R(object, new Object[0]);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB9C;
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
                throw new RuntimeException("a/qM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionUtilityManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ReflectionUtilityManager() {
        long l = a ^ 0x66D8B43A0D1CL;
        AbstractComputationKernel[] abstractComputationKernelArray = ReflectionUtilityManager.A();
        super(ReflectionMetadataResolver.rV);
        this.s = ReflectionUtilityManager.c("\u00ca", (Object)this, (Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)4080, (long)(0x1682DBA72DA8FD0EL ^ l)), (long)-476559500210860301L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.j, (Object)new Class[0], (long)-476706472726055610L, (long)l);
        this.V = ReflectionUtilityManager.c("\u00ca", (Object)this, (Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)2764, (long)(0xDAEC2ED39BD7835L ^ l)), (long)-476559500210860301L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-476706472726055610L, (long)l);
        this.i = ((StatefulEventToggle)((NetworkProtocolManager)((Object)ReflectionUtilityManager.c("\u00ca", (Object)this, (Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)1412, (long)(0x3D1BF6696193777CL ^ l)), (long)-476559500210860301L, (long)l), (Object)ReflectionMetadataResolver.EP, (Object)new Class[0], (long)-476642027332420862L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)20216, (long)(0x2A45956E78D03C04L ^ l)), (long)-476559500210860301L, (long)l)))).M();
        this.F = ((ThreadPoolCoordinator)((NetworkProtocolManager)((Object)ReflectionUtilityManager.c("\u00ca", (Object)this, (Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)637, (long)(0x21A254189B66F082L ^ l)), (long)-476559500210860301L, (long)l), (Object)ReflectionMetadataResolver.V_, (long)-476770165858557516L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)ReflectionUtilityManager.c("G", (int)ReflectionUtilityManager.b("c", (int)9993, (long)(0x26B5F2815A2C55F4L ^ l)), (long)-476559500210860301L, (long)l)))).p();
        AbstractComputationKernel[] abstractComputationKernelArray2 = abstractComputationKernelArray;
        try {
            if (abstractComputationKernelArray2 != null) {
                AbstractComputationKernel.I(new String[1]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtilityManager.a(customSystemException);
        }
    }

    static int t(ReflectionUtilityManager reflectionUtilityManager, Object object) {
        return reflectionUtilityManager.q(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtilityManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtilityManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 20;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 26;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 33;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 60;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 11;
                break;
            }
            case 15: {
                n3 = 63;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 12;
                break;
            }
            case 18: {
                n3 = 22;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 23;
                break;
            }
            case 22: {
                n3 = 43;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 15;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 48;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 2;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 29;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 57;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 61;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 53;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 24;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 41;
                break;
            }
            case 53: {
                n3 = 21;
                break;
            }
            case 54: {
                n3 = 16;
                break;
            }
            case 55: {
                n3 = 1;
                break;
            }
            case 56: {
                n3 = 51;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 25;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 27;
                break;
            }
            default: {
                n3 = 50;
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
        ReflectionUtilityManager.f[n4] = new String(cArray);
        return n4;
    }

    private Object z(Object object) {
        return this.s.T(object, new Object[0]);
    }

    static Object c(ReflectionUtilityManager reflectionUtilityManager, Object object) {
        return reflectionUtilityManager.I(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionUtilityManager.a = MultiContainerRegistry.a(-3295904557155169696L, 3984530913765658669L, MethodHandles.lookup().lookupClass()).a(195721063879540L);
                ReflectionUtilityManager.e = new Object[16];
                ReflectionUtilityManager.f = new String[16];
                ReflectionUtilityManager.a();
                ReflectionUtilityManager.d = new HashMap<K, V>(13);
                var0 = ReflectionUtilityManager.a ^ 119558857126061L;
                ReflectionUtilityManager.E(null);
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
                var6_5 = "\r2tM\u00bc\u00ee'yv,q(f+bH\u0013\u00a0\u0000\u008f\u00bc\u00af\u00c4V\u0017\u0096\u00fd\u00b4\u00b1KS2";
                var7_6 = "\r2tM\u00bc\u00ee'yv,q(f+bH\u0013\u00a0\u0000\u008f\u00bc\u00af\u00c4V\u0017\u0096\u00fd\u00b4\u00b1KS2".length();
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
                    var6_5 = "g\u00c8\u00df\u0014\u00fcI`\u00f1I=\u00d1\u009c\u00f0\u001a\u00c1\u001d";
                    var7_6 = "g\u00c8\u00df\u0014\u00fcI`\u00f1I=\u00d1\u009c\u00f0\u001a\u00c1\u001d".length();
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
        ReflectionUtilityManager.b = var8_3;
        ReflectionUtilityManager.c = new Integer[6];
    }

    static Object b(ReflectionUtilityManager reflectionUtilityManager, Object object) {
        return reflectionUtilityManager.z(object);
    }

    private Object I(Object object) {
        return this.i.T(object, new Object[0]);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionUtilityManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtilityManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "N\u001d\u000f\u001b";
        objectArray[1] = ">=r6)452cyT,&5j0";
        objectArray[2] = Boolean.TYPE;
        ReflectionUtilityManager.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0017m!U+@\u001cb0\u001aF@\u001c\u007f$";
        objectArray[4] = "AY\f A\u00044y\u0007/PKYy\u00072D^";
        objectArray[5] = "\u001azA{";
        objectArray[6] = "Dcd";
        objectArray[7] = Integer.TYPE;
        ReflectionUtilityManager.f[7] = "java/lang/Integer";
        objectArray[8] = "'Z`\t";
        objectArray[9] = "b$tj[%\u0017\u0004\u007feJjz\u0004\u007fx^\u007f";
        objectArray[10] = "TJVL";
        objectArray[11] = "!\tcwH/*\u0006r8)!!\rvb";
        objectArray[12] = "7[|6;Zl@&\r\u0013csNy0;\u0004zQ%\rnZi\u001aauoS:R\u001d7d\\0]gmn\u0011p##v0\u0019`@`t%\u0006\n\u001f%71\u000f;\u0019~`%c";
        objectArray[13] = "DA2#Ew\u001fZh\u0018rN\u0000T7%E)\tKk\u0018\u0010~F\u0003-bJt\u000bCS%Xp@[<vZ?\t9";
        objectArray[14] = "~v?1sXsth3M\u000b9\u0019>0!\u0006~ky86\u0000B`n5p\u000f%iqiM";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "L`7)\f{\u0017{m\u0012\u0001B\bu2/\f%\u0001jn\u0012YrN\"(h\u0003x\u0003bV,\u0018&\u000br5o\u001a3\u0014\u0018i#S \f''`\u0005!q";
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtilityManager.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtilityManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
            return MethodHandles.lookup().findStatic(ReflectionUtilityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectionUtilityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

