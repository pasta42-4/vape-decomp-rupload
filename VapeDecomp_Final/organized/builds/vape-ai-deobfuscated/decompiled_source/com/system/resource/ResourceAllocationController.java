/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.invocation.InvocationContextResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class ResourceAllocationController
extends CryptoProtocolEngine {
    private ReflectionUtilityService X;
    private static final Object[] e;
    private final ReflectionUtilityService k;
    private static final Integer[] c;
    private static final Map d;
    private static final String[] f;
    private static final long a;
    private final ReflectionUtilityService R;
    private final ReflectionUtilityService A;
    private ReflectionUtilityService L;
    private static final long[] b;

    private static Field g(long l, long l2) {
        int n = ResourceAllocationController.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationController.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationController.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationController.c(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationController.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationController.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationController.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationController.f(549355785680290L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationController.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationController.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationController.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationController.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object h(Object object) {
        return this.L.Z(object);
    }

    static double Q(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.R(object);
    }

    private double u(Object object) {
        return this.k.C(object);
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
                n3 = 25;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 7;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 53;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 22;
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
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 36;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 63;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 61;
                break;
            }
            case 28: {
                n3 = 21;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 35;
                break;
            }
            case 32: {
                n3 = 47;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 56;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 50;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 60;
                break;
            }
            case 44: {
                n3 = 17;
                break;
            }
            case 45: {
                n3 = 40;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 30;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 26;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 9;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 38;
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
        ResourceAllocationController.f[n4] = new String(cArray);
        return n4;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationController.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0017,\u000e";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationController.f[1] = "java/lang/Integer";
        objectArray[2] = "_g#&&1Th2i[)Go; ";
        objectArray[3] = "\u0003#w$";
        objectArray[4] = Boolean.TYPE;
        ResourceAllocationController.f[4] = "java/lang/Boolean";
        objectArray[5] = "B\u0001N|fVI\u000e_3\u000bVI\u0013K";
        objectArray[6] = "F\"\u000ff";
        objectArray[7] = "\u0019M\u00147DM\u0012B\u0005x%C\u0019I\u0001\"";
        objectArray[8] = "#M\u0003|\nZwTX|h~\u0019\u001d\u0017hVWx\u001d\r8R%\"H\u001dg\u0010H&OWhh\u001edK[?\u0001Ex[\u001f\u0007TKgY\u0004dYXeMg";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "wdNDIGueuQ\t6p8J_\t\f(?\b_r\u000f9lKH\u0013\u000f#<O:";
    }

    private String c(Object object) {
        return (String)this.X.Z(object);
    }

    private float j(Object object) {
        return this.A.x(object);
    }

    public ResourceAllocationController() {
        block12: {
            int n;
            int n2;
            int n3;
            long l;
            block10: {
                l = a ^ 0x1CD22AA56BD1L;
                int n4 = InvocationContextResolver.L();
                super(ReflectionMetadataResolver.bv);
                n3 = n4;
                try {
                    block11: {
                        try {
                            try {
                                n2 = GeometryCalculator.C();
                                n = 35;
                                if (n3 != 0) break block10;
                                if (n2 < n) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationController.a(customSystemException);
                            }
                            this.L = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)24049, (long)(0x10148597A5C5F6A9L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rA, (long)-415433863007090294L, (long)l);
                            this.A = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)28623, (long)(0x38FE2EB3ECC74491L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Double.TYPE, (long)-415433863007090294L, (long)l);
                            this.R = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)11569, (long)(0x3728316BE3920660L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Double.TYPE, (long)-415433863007090294L, (long)l);
                            this.k = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)32214, (long)(0x4CF06DBB26A7568FL ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Double.TYPE, (long)-415433863007090294L, (long)l);
                            if (n3 == 0) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationController.a(customSystemException);
                        }
                    }
                    n2 = GeometryCalculator.C();
                    n = 15;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationController.a(customSystemException);
                }
            }
            try {
                block13: {
                    try {
                        if (n2 < n) break block13;
                        this.L = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)24589, (long)(0x16D86D257028CB50L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Ur, (long)-415433863007090294L, (long)l);
                        this.A = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)4648, (long)(0x2B8985025450B973L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Float.TYPE, (long)-415433863007090294L, (long)l);
                        this.R = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)22607, (long)(0x8B4EAB9B17E7315L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Float.TYPE, (long)-415433863007090294L, (long)l);
                        this.k = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)21128, (long)(0x1C460352D02B79D8L ^ l)), (long)-415352358179065625L, (long)l), (boolean)true, Float.TYPE, (long)-415433863007090294L, (long)l);
                        if (n3 == 0) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationController.a(customSystemException);
                    }
                }
                this.X = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)16141, (long)(0xA96ECE68185945FL ^ l)), (long)-415352358179065625L, (long)l), (boolean)ObjectLifecycleTracker.z, String.class, (long)-415433863007090294L, (long)l);
                this.A = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)17196, (long)(0x65655141ABDEE87FL ^ l)), (long)-415352358179065625L, (long)l), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-415433863007090294L, (long)l);
                this.R = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)5171, (long)(0x14DC30B0A119BF6FL ^ l)), (long)-415352358179065625L, (long)l), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-415433863007090294L, (long)l);
                this.k = ResourceAllocationController.c("b", (Object)this, (Object)ResourceAllocationController.c("\u00f8", (int)ResourceAllocationController.b("l", (int)23974, (long)(0x18C9142C053876F9L ^ l)), (long)-415352358179065625L, (long)l), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-415433863007090294L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationController.a(customSystemException);
            }
        }
    }

    static String U(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.c(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationController.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static double x(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.u(object);
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

    static double d(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.p(object);
    }

    static float e(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.J(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == 'P' || c == '\u00ec' || c == '\u00ce') {
                field = ResourceAllocationController.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationController.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private double p(Object object) {
        return this.A.C(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationController.a = MultiContainerRegistry.a(-5129179491835976273L, -2800901033304238866L, MethodHandles.lookup().lookupClass()).a(72370832582680L);
                ResourceAllocationController.e = new Object[10];
                ResourceAllocationController.f = new String[10];
                ResourceAllocationController.a();
                ResourceAllocationController.d = new HashMap<K, V>(13);
                var0 = ResourceAllocationController.a ^ 13212086333464L;
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
                var6_5 = "+\u00c6]5\u0004\\N`\u00f6C}\u00cbZ\u00e9\u00d0\u00a4ES\u0083\u0099\u00c0\u0001\u00d3\u00e4\u0097P\u00af#\u008f\u00cbi4\u001b1t\u0083\u00cd7(H\u00dd\u0012z\u00efm\u000bh\u0007\u00c4\u00f2\u00cf|zY\u00f1\u00fa\u00fd\u00c3\u008dq\u0088y1\u00b7\u00ac\u00fb\u00da\u001aI\u0001\u0012{R`\u00c4\u001d\u00c75\u00f3\u0097";
                var7_6 = "+\u00c6]5\u0004\\N`\u00f6C}\u00cbZ\u00e9\u00d0\u00a4ES\u0083\u0099\u00c0\u0001\u00d3\u00e4\u0097P\u00af#\u008f\u00cbi4\u001b1t\u0083\u00cd7(H\u00dd\u0012z\u00efm\u000bh\u0007\u00c4\u00f2\u00cf|zY\u00f1\u00fa\u00fd\u00c3\u008dq\u0088y1\u00b7\u00ac\u00fb\u00da\u001aI\u0001\u0012{R`\u00c4\u001d\u00c75\u00f3\u0097".length();
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
                    var6_5 = "\u00d5\u001e\u0095\u0088\u008e \u00da\u0088\u00c5xW\u00a2\u00ec\u00b0\u00ec5";
                    var7_6 = "\u00d5\u001e\u0095\u0088\u008e \u00da\u0088\u00c5xW\u00a2\u00ec\u00b0\u00ec5".length();
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
        ResourceAllocationController.b = var8_3;
        ResourceAllocationController.c = new Integer[12];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5165;
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
                throw new RuntimeException("a/mX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationController.c[n2] = n3;
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationController.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationController.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private float q(Object object) {
        return this.k.x(object);
    }

    static float Z(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.j(object);
    }

    private double R(Object object) {
        return this.R.C(object);
    }

    private static Method h(long l, long l2) {
        int n = ResourceAllocationController.e(l, l2);
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
                clazz3 = ResourceAllocationController.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationController.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationController.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationController.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationController.f(549355785680290L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationController.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationController.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationController.f(549355785680290L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float J(Object object) {
        return this.R.x(object);
    }

    static float g(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.q(object);
    }

    static Object r(ResourceAllocationController resourceAllocationController, Object object) {
        return resourceAllocationController.h(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

