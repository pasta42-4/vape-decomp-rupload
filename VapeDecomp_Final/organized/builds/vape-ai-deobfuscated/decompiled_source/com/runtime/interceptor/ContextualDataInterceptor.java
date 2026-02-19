/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.interceptor;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.invocation.InvocationContextResolver;
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

public class ContextualDataInterceptor
extends CryptoProtocolEngine {
    private static final long[] c;
    private static final Object[] g;
    private final HK f;
    private static final String[] h;
    private ReflectionUtilityService E;
    private HK T;
    private static final Map e;
    private static final Integer[] d;
    private ReflectionUtilityService X;
    private HK N;
    private HK a;
    private static final long b;
    private ReflectionUtilityService Z;

    private static void a() {
        Object[] objectArray = g;
        g[0] = "5k\u0006^";
        objectArray[1] = "[,Q>\u0014_P#@qiGC$I8";
        objectArray[2] = Boolean.TYPE;
        ContextualDataInterceptor.h[2] = "java/lang/Boolean";
        objectArray[3] = "V3:y[c]<+66c]!?";
        objectArray[4] = "+jv$!\u0004^J}+0K3J}6$^";
        objectArray[5] = "|\u001bXO";
        objectArray[6] = "\f1\u0014";
        objectArray[7] = Integer.TYPE;
        ContextualDataInterceptor.h[7] = "java/lang/Integer";
        objectArray[8] = "o3%E";
        objectArray[9] = ".\u0001\u0007o5\u001d%\u000e\u0016 T\u0013.\u0005\u0012z";
        objectArray[10] = "g\u0004'F|\u001agA6)\\q9\u0016=\u0016i\u000b;\u001d>R\u001bK:\u0014#U'\u001bcA-)!\u001ed\u0016:S{\u001eg\u0006_\u0012!\u000b=A XxL>zdK\"\u000en@6J$\t\u0000";
        objectArray[11] = "\u0000_\\[1O\u0000\u001aM4\r$^MF\u000b$^\\FEOV\u001e]OXHjN\u0004\u001aV4lK\u0003MAN6K\u0000]$\nlA\u0004\u001b\u0015SnD\u001e!";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "5\b\nm\rX2\u001aVhkUrd\u00061\u0011S5\u0001I>\u0000T\t]WmTLs_\\n\u0010>";
    }

    /*
     * Unable to fully structure code
     */
    public ContextualDataInterceptor() {
        block23: {
            block21: {
                block20: {
                    block18: {
                        var1_1 = ContextualDataInterceptor.b ^ 24331559638973L;
                        v0 = InvocationContextResolver.u();
                        super(ReflectionMetadataResolver.b);
                        var3_2 = v0;
                        try {
                            v1 = TemporalMetadataResolver.h.d();
                            if (var3_2 == 0) break block18;
                            if (v1 != 0) {
                            }
                            ** GOTO lbl23
                        }
                        catch (CustomSystemException v2) {
                            throw ContextualDataInterceptor.a(v2);
                        }
                        v1 = GeometryCalculator.C();
                    }
                    try {
                        block19: {
                            try {
                                if (v1 <= 13) break block19;
                                this.f = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)25077, (long)(2202543567186178524L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (Object)new Class[]{ReflectionMetadataResolver.EV}, (long)5795803874149048047L, (long)var1_1);
                                if (var3_2 != 0) break block20;
                            }
                            catch (CustomSystemException v3) {
                                throw ContextualDataInterceptor.a(v3);
                            }
                        }
                        this.f = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)19164, (long)(5219508666510318326L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.PE, (Object)new Class[]{ReflectionMetadataResolver.EV}, (long)5795803874149048047L, (long)var1_1);
                    }
                    catch (CustomSystemException v4) {
                        throw ContextualDataInterceptor.a(v4);
                    }
                }
                try {
                    try {
                        v5 = GeometryCalculator.C();
                        v6 = 23;
                        if (var3_2 == 0) break block21;
                        if (v5 >= v6) {
                        }
                        ** GOTO lbl64
                    }
                    catch (CustomSystemException v7) {
                        throw ContextualDataInterceptor.a(v7);
                    }
                    v5 = GeometryCalculator.C();
                    v6 = 35;
                }
                catch (CustomSystemException v8) {
                    throw ContextualDataInterceptor.a(v8);
                }
            }
            try {
                try {
                    block22: {
                        try {
                            if (v5 < v6) break block22;
                            this.Z = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)30666, (long)(8783313673849481185L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Short.TYPE, (long)5795769003042135050L, (long)var1_1);
                            this.E = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)4389, (long)(963737005683818762L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Short.TYPE, (long)5795769003042135050L, (long)var1_1);
                            this.X = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)25610, (long)(5953893768520021031L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Short.TYPE, (long)5795769003042135050L, (long)var1_1);
                            if (var3_2 != 0) break block23;
                        }
                        catch (CustomSystemException v9) {
                            throw ContextualDataInterceptor.a(v9);
                        }
                    }
                    this.T = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)4777, (long)(4549549785609814663L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
                    this.N = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)13762, (long)(283244239609095651L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
                    this.a = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)29083, (long)(8435525529542140347L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
                    if (var3_2 != 0) break block23;
                }
                catch (CustomSystemException v10) {
                    throw ContextualDataInterceptor.a(v10);
                }
lbl64:
                // 2 sources

                this.T = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)8118, (long)(7084625691396820894L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
                this.N = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)10605, (long)(9038724996219763009L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
                this.a = ContextualDataInterceptor.c("L", (Object)this, (Object)ContextualDataInterceptor.c("\u00fa", (int)ContextualDataInterceptor.b("b", (int)29311, (long)(8791707765051892316L ^ var1_1)), (long)5795967198899966394L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (Object)new Class[0], (long)5795803874149048047L, (long)var1_1);
            }
            catch (CustomSystemException v11) {
                throw ContextualDataInterceptor.a(v11);
            }
        }
    }

    static int Y(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.D(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualDataInterceptor.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualDataInterceptor.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ContextualDataInterceptor.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualDataInterceptor.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private int h(Object object) {
        return this.E.x(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00ed' || c == '\u00e7' || c == 'T') {
                field = ContextualDataInterceptor.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualDataInterceptor.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = ContextualDataInterceptor.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualDataInterceptor.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualDataInterceptor.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualDataInterceptor.c(clazz3, string2, clazz2)) != null) {
                    ContextualDataInterceptor.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualDataInterceptor.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualDataInterceptor.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualDataInterceptor.f(684959797484171L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static int g(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.N(object);
    }

    static int p(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.c(object);
    }

    private int c(Object object) {
        return this.T.P(object, new Object[0]);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualDataInterceptor.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualDataInterceptor.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l, long l2) {
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
                n3 = 47;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 11;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 23;
                break;
            }
            case 11: {
                n3 = 57;
                break;
            }
            case 12: {
                n3 = 16;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 35;
                break;
            }
            case 15: {
                n3 = 38;
                break;
            }
            case 16: {
                n3 = 12;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 0;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 45;
                break;
            }
            case 30: {
                n3 = 61;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 20;
                break;
            }
            case 33: {
                n3 = 55;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 3;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 15;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 4;
                break;
            }
            case 47: {
                n3 = 18;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 5;
                break;
            }
            case 54: {
                n3 = 13;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 58;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 52;
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
        ContextualDataInterceptor.h[n4] = new String(cArray);
        return n4;
    }

    static int s(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.Z(object);
    }

    static int J(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.h(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x45;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/mJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualDataInterceptor.d[n2] = n3;
        }
        return d[n2];
    }

    static int k(ContextualDataInterceptor contextualDataInterceptor, Object object) {
        return contextualDataInterceptor.S(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualDataInterceptor.b = MultiContainerRegistry.a(-7900083034826035891L, -4945595599571122585L, MethodHandles.lookup().lookupClass()).a(262377585010598L);
                ContextualDataInterceptor.g = new Object[13];
                ContextualDataInterceptor.h = new String[13];
                ContextualDataInterceptor.a();
                ContextualDataInterceptor.e = new HashMap<K, V>(13);
                var0 = ContextualDataInterceptor.b ^ 39848779364616L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00ddZ;\u0089\u00b9\u00c4S2\u0004\u008b\u009e|\u00c0\u00be\u00b2P\u001e+\u009bZ\u00f1*\u008be\u00a4\n*t`cMq\u009bi4\u0013\u0082$o.\u008c&\u00d9j%\u001a\u0082$?\u00bf-\u00a0\u00d7L\u00c8\u009f\u00f1\u00c6\u00a8\u00d0\u00f0\u0001\u00a3k\u0014ai\u00eat1\u0006?";
                var7_6 = "\u00ddZ;\u0089\u00b9\u00c4S2\u0004\u008b\u009e|\u00c0\u00be\u00b2P\u001e+\u009bZ\u00f1*\u008be\u00a4\n*t`cMq\u009bi4\u0013\u0082$o.\u008c&\u00d9j%\u001a\u0082$?\u00bf-\u00a0\u00d7L\u00c8\u009f\u00f1\u00c6\u00a8\u00d0\u00f0\u0001\u00a3k\u0014ai\u00eat1\u0006?".length();
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
                    var6_5 = "\u0081\u00812.\u00bd\u00ca/\u00ff\u00aa\u00de\u00b6\u008eNg\u0016\u0095";
                    var7_6 = "\u0081\u00812.\u00bd\u00ca/\u00ff\u00aa\u00de\u00b6\u008eNg\u0016\u0095".length();
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
        ContextualDataInterceptor.c = var8_3;
        ContextualDataInterceptor.d = new Integer[11];
    }

    private static Method h(long l, long l2) {
        int n = ContextualDataInterceptor.e(l, l2);
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
                clazz3 = ContextualDataInterceptor.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualDataInterceptor.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualDataInterceptor.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualDataInterceptor.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualDataInterceptor.f(684959797484171L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualDataInterceptor.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualDataInterceptor.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualDataInterceptor.f(684959797484171L, 0L);
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

    private Object G(Object object, Object object2) {
        return this.f.T(object, object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualDataInterceptor.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualDataInterceptor.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int N(Object object) {
        return this.Z.x(object);
    }

    private int Z(Object object) {
        return this.N.P(object, new Object[0]);
    }

    private int S(Object object) {
        return this.X.x(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object u(ContextualDataInterceptor contextualDataInterceptor, Object object, Object object2) {
        return contextualDataInterceptor.G(object, object2);
    }

    private int D(Object object) {
        return this.a.P(object, new Object[0]);
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
            return MethodHandles.lookup().findStatic(ContextualDataInterceptor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ContextualDataInterceptor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

