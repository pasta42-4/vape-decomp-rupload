/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.util.concurrent.GenericFutureListener
 */
package com.data.validation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import io.netty.channel.Channel;
import io.netty.util.concurrent.GenericFutureListener;
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
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class IntegratedDataValidator
extends CryptoProtocolEngine {
    public HK e;
    private static final Map d;
    private final HK m;
    private static final long a;
    private static int N;
    private static final String[] g;
    private final ReflectionUtilityService j;
    private static final Object[] f;
    private ReflectionUtilityService s;
    public HK X;
    private final ReflectionUtilityService B;
    private static final Integer[] c;
    private final HK H;
    private static final long[] b;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == 'n' || c == '\u00fe' || c == '\u00e1') {
                field = IntegratedDataValidator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = IntegratedDataValidator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void E(Object object, Object object2) {
        this.e.l(object, object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IntegratedDataValidator() {
        block55: {
            block54: {
                block50: {
                    block53: {
                        block51: {
                            block52: {
                                block48: {
                                    block44: {
                                        block45: {
                                            block41: {
                                                block42: {
                                                    block43: {
                                                        var1_1 = IntegratedDataValidator.a ^ 8872046132851L;
                                                        v0 = IntegratedDataValidator.k();
                                                        super(ReflectionMetadataResolver.PH);
                                                        var3_2 = v0;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            this.B = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)18155, (long)(8652592300904326772L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Channel.class, (long)-8303871911810216957L, (long)var1_1);
                                                                            this.j = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)31380, (long)(3129724771133233668L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Queue.class, (long)-8303871911810216957L, (long)var1_1);
                                                                            v1 = GeometryCalculator.C();
                                                                            v2 = 13;
                                                                            if (var3_2 == 0) break block41;
                                                                            if (v1 == v2) {
                                                                            }
                                                                            ** GOTO lbl44
                                                                        }
                                                                        catch (CustomSystemException v3) {
                                                                            throw IntegratedDataValidator.a(v3);
                                                                        }
                                                                        this.s = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)26988, (long)(3947046814517823985L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Queue.class, (long)-8303871911810216957L, (long)var1_1);
                                                                        if (var3_2 == 0) break block42;
                                                                    }
                                                                    catch (CustomSystemException v4) {
                                                                        throw IntegratedDataValidator.a(v4);
                                                                    }
                                                                    if (!ObjectLifecycleTracker.U.d()) break block43;
                                                                }
                                                                catch (CustomSystemException v5) {
                                                                    throw IntegratedDataValidator.a(v5);
                                                                }
                                                                this.e = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)12676, (long)(6276515623876088088L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu, GenericFutureListener[].class}, (long)-8303817974894544122L, (long)var1_1);
                                                                if (var3_2 != 0) break block44;
                                                            }
                                                            catch (CustomSystemException v6) {
                                                                throw IntegratedDataValidator.a(v6);
                                                            }
                                                            AbstractComputationKernel.I(new String[4]);
                                                        }
                                                        catch (CustomSystemException v7) {
                                                            throw IntegratedDataValidator.a(v7);
                                                        }
                                                    }
                                                    this.e = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)22688, (long)(3656919354640709694L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu, GenericFutureListener[].class}, (long)-8303817974894544122L, (long)var1_1);
                                                }
                                                try {
                                                    try {
                                                        if (var3_2 != 0) break block44;
lbl44:
                                                        // 2 sources

                                                        v1 = GeometryCalculator.C();
                                                        if (var3_2 == 0) break block45;
                                                    }
                                                    catch (CustomSystemException v8) {
                                                        throw IntegratedDataValidator.a(v8);
                                                    }
                                                    v2 = GeometryCalculator.x;
                                                }
                                                catch (CustomSystemException v9) {
                                                    throw IntegratedDataValidator.a(v9);
                                                }
                                            }
                                            try {
                                                block46: {
                                                    try {
                                                        if (v1 < v2) break block46;
                                                        this.e = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)18963, (long)(1828323136880224906L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu, ReflectionMetadataResolver.b0, Boolean.TYPE}, (long)-8303817974894544122L, (long)var1_1);
                                                        if (var3_2 != 0) break block44;
                                                    }
                                                    catch (CustomSystemException v10) {
                                                        throw IntegratedDataValidator.a(v10);
                                                    }
                                                }
                                                v1 = (int)TemporalMetadataResolver.h.d();
                                            }
                                            catch (CustomSystemException v11) {
                                                throw IntegratedDataValidator.a(v11);
                                            }
                                        }
                                        try {
                                            block47: {
                                                try {
                                                    if (v1 == 0) break block47;
                                                    this.e = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)13702, (long)(8115272320351753491L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu}, (long)-8303817974894544122L, (long)var1_1);
                                                    if (var3_2 != 0) break block44;
                                                }
                                                catch (CustomSystemException v12) {
                                                    throw IntegratedDataValidator.a(v12);
                                                }
                                            }
                                            this.e = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)14809, (long)(1253076168441289035L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu}, (long)-8303817974894544122L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v13) {
                                            throw IntegratedDataValidator.a(v13);
                                        }
                                    }
                                    try {
                                        block49: {
                                            try {
                                                try {
                                                    this.H = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)17637, (long)(3655415230250755185L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.br, (Object)new Class[0], (long)-8303817974894544122L, (long)var1_1);
                                                    this.m = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)1210, (long)(4979364441194783787L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8303817974894544122L, (long)var1_1);
                                                    if (var3_2 == 0) break block48;
                                                    if (TemporalMetadataResolver.h.d()) break block49;
                                                }
                                                catch (CustomSystemException v14) {
                                                    throw IntegratedDataValidator.a(v14);
                                                }
                                                if (TemporalMetadataResolver.h.q()) {
                                                }
                                                ** GOTO lbl107
                                            }
                                            catch (CustomSystemException v15) {
                                                throw IntegratedDataValidator.a(v15);
                                            }
                                        }
                                        this.X = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)1636, (long)(4803647448195327740L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ba, ReflectionMetadataResolver.Uu}, (long)-8303817974894544122L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v16) {
                                        throw IntegratedDataValidator.a(v16);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var3_2 != 0) break block50;
lbl107:
                                            // 2 sources

                                            v17 = this;
                                            v18 = this;
                                            v19 /* !! */  = ObjectLifecycleTracker.z;
                                            if (var3_2 == 0) break block51;
                                        }
                                        catch (CustomSystemException v20) {
                                            throw IntegratedDataValidator.a(v20);
                                        }
                                        if (v19 /* !! */  == 0) break block52;
                                    }
                                    catch (CustomSystemException v21) {
                                        throw IntegratedDataValidator.a(v21);
                                    }
                                    v22 = IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)10282, (long)(2356149714945362108L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1);
                                    break block53;
                                }
                                catch (CustomSystemException v23) {
                                    throw IntegratedDataValidator.a(v23);
                                }
                            }
                            v19 /* !! */  = (int)IntegratedDataValidator.b("o", (int)2509, (long)(3299981739594312026L ^ var1_1));
                        }
                        v22 = IntegratedDataValidator.c("k", (int)v19 /* !! */ , (long)-8303663250079883462L, (long)var1_1);
                    }
                    v17.X = IntegratedDataValidator.c("t", (Object)v18, (Object)v22, (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ba, ReflectionMetadataResolver.Uu}, (long)-8303817974894544122L, (long)var1_1);
                }
                try {
                    v24 = this.X.v();
                    if (var3_2 == 0) break block54;
                    if (!v24) break block55;
                }
                catch (CustomSystemException v25) {
                    throw IntegratedDataValidator.a(v25);
                }
                v24 = ObjectLifecycleTracker.z;
            }
            try {
                if (v24) {
                    this.X = IntegratedDataValidator.c("t", (Object)this, (Object)IntegratedDataValidator.c("k", (int)IntegratedDataValidator.b("o", (int)30746, (long)(7873724266595391625L ^ var1_1)), (long)-8303663250079883462L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ba, ReflectionMetadataResolver.Uu}, (long)-8303817974894544122L, (long)var1_1);
                }
            }
            catch (CustomSystemException v26) {
                throw IntegratedDataValidator.a(v26);
            }
        }
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C55;
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
                throw new RuntimeException("a/mt", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IntegratedDataValidator.c[n2] = n3;
        }
        return c[n2];
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "c<\u0002#";
        objectArray[1] = "\u001dR@8n\\\u0016]Qw\u0013D\u0005ZX>";
        objectArray[2] = Boolean.TYPE;
        IntegratedDataValidator.g[2] = "java/lang/Boolean";
        objectArray[3] = "$l'mI\u0019/c6\"$\u0019/~\"";
        objectArray[4] = "&bZ(&{SBQ'74>BQ:#!";
        objectArray[5] = "C\t\u0002S";
        objectArray[6] = "#ur";
        objectArray[7] = Integer.TYPE;
        IntegratedDataValidator.g[7] = "java/lang/Integer";
        objectArray[8] = "&'\bw";
        objectArray[9] = "N\u000fs\u001e,GE\u0000bQMIN\u000bf\u000b";
        objectArray[10] = "A\u0003(v\u0000!BC&F$J\r\n\u007f:\u0001$\u001a\u0007(FYs\r\n=6\u0006/G\u001cC|\u0019/\u0014\u0004(?\u0005/\u001e{x+^,\u0000\u0017zv\u001c#\u007fGx%\u001b4C\t2x\u001dJ";
        objectArray[11] = "\u0004&e,\u0005S\u0007fk\u001c=8H/2`\u0004V_\"e\u001c\\\u0001H/pl\u0003]\u00029\u000e&\u001c]Q!ee\u0000][^0%\u0001\tZ2mn\u0019\u0007:";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "M\u001513,\u0012\n\u0014=n\u0016\u0012\nyfn}F\u0013\u001e19(\u0004q\u000b*hj\u001b\u001f\u001c'?\u0016";
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IntegratedDataValidator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void Z(int n) {
        N = n;
    }

    public static int k() {
        int n = IntegratedDataValidator.Y();
        try {
            if (n == 0) {
                return 106;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw IntegratedDataValidator.a(customSystemException);
        }
        return 0;
    }

    static void R(IntegratedDataValidator integratedDataValidator, Object object, Object object2, Object object3, boolean bl) {
        integratedDataValidator.V(object, object2, object3, bl);
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
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 38;
                break;
            }
            case 2: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 4: {
                n3 = 36;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 12: {
                n3 = 42;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 46;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 35;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 14;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 58;
                break;
            }
            case 26: {
                n3 = 15;
                break;
            }
            case 27: {
                n3 = 45;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 63;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 51;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 61;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 1;
                break;
            }
            case 41: {
                n3 = 11;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 4;
                break;
            }
            case 45: {
                n3 = 32;
                break;
            }
            case 46: {
                n3 = 62;
                break;
            }
            case 47: {
                n3 = 27;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 24;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 12;
                break;
            }
            case 54: {
                n3 = 40;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 21;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 37;
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
        IntegratedDataValidator.g[n4] = new String(cArray);
        return n4;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IntegratedDataValidator.a = MultiContainerRegistry.a(-7522538737338098878L, 7628838907446039552L, MethodHandles.lookup().lookupClass()).a(67426534721920L);
                IntegratedDataValidator.f = new Object[13];
                IntegratedDataValidator.g = new String[13];
                IntegratedDataValidator.a();
                IntegratedDataValidator.d = new HashMap<K, V>(13);
                var0 = IntegratedDataValidator.a ^ 8861436480102L;
                IntegratedDataValidator.Z(0);
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u00f3\u0001\u00ddq\u00bc|\u00d3q\u00d7/~\u0000\u009a\u0018p\u00ad\u00ca\u00b2\u0096\u008a\u0000\u00fb\u00cf}\f\u0083\u00b3\u00c7\u00181V\u00e7\u00f1\u0017|<\u00e32\"\u0004\"\u00f9`\u0013s\u00f2e\u00c7l6$\u00a0\u0086\u0013\u0094\u001d\u008d\r\u00e9\u00fc\u00b3\u0080\u00f2\u00884[\u008f\u00c6\u00d8/\u00a1\u0003_\u00b7S\u00b0\u00ef\u00aeC\u0085H_\u001b\u0084\u0018\u00df\u00b5\u001f\u00ff\u00cd\u00eaW\u0087\u007f\u00e2W";
                var7_6 = "\u00f3\u0001\u00ddq\u00bc|\u00d3q\u00d7/~\u0000\u009a\u0018p\u00ad\u00ca\u00b2\u0096\u008a\u0000\u00fb\u00cf}\f\u0083\u00b3\u00c7\u00181V\u00e7\u00f1\u0017|<\u00e32\"\u0004\"\u00f9`\u0013s\u00f2e\u00c7l6$\u00a0\u0086\u0013\u0094\u001d\u008d\r\u00e9\u00fc\u00b3\u0080\u00f2\u00884[\u008f\u00c6\u00d8/\u00a1\u0003_\u00b7S\u00b0\u00ef\u00aeC\u0085H_\u001b\u0084\u0018\u00df\u00b5\u001f\u00ff\u00cd\u00eaW\u0087\u007f\u00e2W".length();
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
                    var6_5 = "\u00a9%\u00d1\u00117#)\u0006n\u009b=r\u00ae\u000etA";
                    var7_6 = "\u00a9%\u00d1\u00117#)\u0006n\u009b=r\u00ae\u000etA".length();
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
        IntegratedDataValidator.b = var8_3;
        IntegratedDataValidator.c = new Integer[14];
    }

    public static int Y() {
        return N;
    }

    private Queue w(Object object) {
        return (Queue)this.s.Z(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = IntegratedDataValidator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = IntegratedDataValidator.d(classArray2[i], string, clazz2, n, classArray);
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
        MethodHandle methodHandle = IntegratedDataValidator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object h(Object object) {
        return this.B.Z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static Object E(IntegratedDataValidator integratedDataValidator, Object object) {
        return integratedDataValidator.h(object);
    }

    private Queue y(Object object) {
        return (Queue)this.j.Z(object);
    }

    private static Method h(long l, long l2) {
        int n = IntegratedDataValidator.e(l, l2);
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
                clazz3 = IntegratedDataValidator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = IntegratedDataValidator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = IntegratedDataValidator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        IntegratedDataValidator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = IntegratedDataValidator.f(640853539134690L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = IntegratedDataValidator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        IntegratedDataValidator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = IntegratedDataValidator.f(640853539134690L, 0L);
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

    private Object C(Object object) {
        return this.H.T(object, new Object[0]);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = IntegratedDataValidator.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                IntegratedDataValidator.f[n] = clazz = Class.forName(g[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void V(Object object, Object object2, Object object3, boolean bl) {
        this.e.l(object, object2, object3, bl);
    }

    private void g(Object object) {
        this.m.V(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = IntegratedDataValidator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = IntegratedDataValidator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Object Z(IntegratedDataValidator integratedDataValidator, Object object) {
        return integratedDataValidator.C(object);
    }

    static void i(IntegratedDataValidator integratedDataValidator, Object object, Object object2) {
        integratedDataValidator.E(object, object2);
    }

    private static Field g(long l, long l2) {
        int n = IntegratedDataValidator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = IntegratedDataValidator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = IntegratedDataValidator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = IntegratedDataValidator.c(clazz3, string2, clazz2)) != null) {
                    IntegratedDataValidator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = IntegratedDataValidator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        IntegratedDataValidator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = IntegratedDataValidator.f(640853539134690L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IntegratedDataValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IntegratedDataValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

