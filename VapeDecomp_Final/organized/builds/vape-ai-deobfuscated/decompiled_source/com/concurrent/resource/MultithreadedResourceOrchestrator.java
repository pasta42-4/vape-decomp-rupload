/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.resource;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.resource.SecureResourceManager;
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

public class MultithreadedResourceOrchestrator
extends CryptoProtocolEngine {
    private static final long a;
    private static final long[] b;
    private HK c;
    private static final Map e;
    private static final Object[] g;
    private HK F;
    private HK v;
    private HK J;
    private static final String[] i;
    private static final Integer[] d;
    private ReflectionUtilityService z;
    private final ReflectionUtilityService N;
    private ReflectionUtilityService Y;
    private HK h;
    private HK f;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = MultithreadedResourceOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultithreadedResourceOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public MultithreadedResourceOrchestrator() {
        block26: {
            block28: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                var1_1 = MultithreadedResourceOrchestrator.a ^ 53782060657499L;
                                v0 = SecureResourceManager.w();
                                super(ReflectionMetadataResolver.VE);
                                var3_2 = v0;
                                try {
                                    try {
                                        if (var3_2 != null) break block22;
                                        if (GeometryCalculator.C() >= 23) {
                                        }
                                        ** GOTO lbl20
                                    }
                                    catch (CustomSystemException v1) {
                                        throw MultithreadedResourceOrchestrator.a(v1);
                                    }
                                    this.N = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)20699, (long)(7063443672383767580L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VE, (long)-26147160780867004L, (long)var1_1);
                                }
                                catch (CustomSystemException v2) {
                                    throw MultithreadedResourceOrchestrator.a(v2);
                                }
                            }
                            try {
                                if (var3_2 == null) break block23;
lbl20:
                                // 2 sources

                                this.N = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)26951, (long)(1887682073100778881L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VE, (long)-26147160780867004L, (long)var1_1);
                            }
                            catch (CustomSystemException v3) {
                                throw MultithreadedResourceOrchestrator.a(v3);
                            }
                        }
                        try {
                            try {
                                v4 = GeometryCalculator.C();
                                if (var3_2 != null) break block24;
                                if (v4 > 13) {
                                }
                                ** GOTO lbl64
                            }
                            catch (CustomSystemException v5) {
                                throw MultithreadedResourceOrchestrator.a(v5);
                            }
                            v4 = (int)GameVersionEnumerator.MC_1_21_0.V().m();
                        }
                        catch (CustomSystemException v6) {
                            throw MultithreadedResourceOrchestrator.a(v6);
                        }
                    }
                    try {
                        if (var3_2 != null) break block25;
                        if (v4 == 0) break block26;
                    }
                    catch (CustomSystemException v7) {
                        throw MultithreadedResourceOrchestrator.a(v7);
                    }
                    v4 = GeometryCalculator.C();
                }
                try {
                    block27: {
                        try {
                            if (v4 < 35) break block27;
                            this.Y = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)15279, (long)(426067993299758948L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V7, (long)-26226187238664089L, (long)var1_1);
                            if (var3_2 == null) break block28;
                        }
                        catch (CustomSystemException v8) {
                            throw MultithreadedResourceOrchestrator.a(v8);
                        }
                    }
                    this.Y = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)14439, (long)(7608580298081938599L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V7, (long)-26226187238664089L, (long)var1_1);
                }
                catch (CustomSystemException v9) {
                    throw MultithreadedResourceOrchestrator.a(v9);
                }
            }
            try {
                this.J = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)13771, (long)(5262887807129526543L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                if (var3_2 == null) break block26;
lbl64:
                // 2 sources

                this.z = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)20423, (long)(4959958097960360710L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-26226187238664089L, (long)var1_1);
                this.F = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)23929, (long)(2677482352618588602L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.c = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)11132, (long)(1214008306666618806L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                this.v = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)15163, (long)(5124089796417990649L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.J = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)28456, (long)(981722984359263200L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                this.f = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)32058, (long)(5434234826187729407L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.h = MultithreadedResourceOrchestrator.c("T", (Object)this, (Object)MultithreadedResourceOrchestrator.c("\u00c4", (int)MultithreadedResourceOrchestrator.b("n", (int)8226, (long)(6227171893758211307L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, (long)-26300778506823047L, (long)var1_1);
            }
            catch (CustomSystemException v10) {
                throw MultithreadedResourceOrchestrator.a(v10);
            }
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 58;
                break;
            }
            case 2: {
                n3 = 41;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 63;
                break;
            }
            case 6: {
                n3 = 60;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 24;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 52;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 3;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 33;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 50;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 20;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 15;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 31;
                break;
            }
            case 37: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 54;
                break;
            }
            case 40: {
                n3 = 39;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 1;
                break;
            }
            case 44: {
                n3 = 30;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 32;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 10;
                break;
            }
            case 54: {
                n3 = 21;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 8;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 49;
                break;
            }
            case 61: {
                n3 = 46;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 47;
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
        MultithreadedResourceOrchestrator.i[n4] = new String(cArray);
        return n4;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultithreadedResourceOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void R(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object, int n) {
        multithreadedResourceOrchestrator.Y(object, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultithreadedResourceOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean k(Object object) {
        return this.z.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultithreadedResourceOrchestrator.a = MultiContainerRegistry.a(4107819225016060338L, -4708977809314085600L, MethodHandles.lookup().lookupClass()).a(25792114705023L);
                MultithreadedResourceOrchestrator.g = new Object[14];
                MultithreadedResourceOrchestrator.i = new String[14];
                MultithreadedResourceOrchestrator.a();
                MultithreadedResourceOrchestrator.e = new HashMap<K, V>(13);
                var0 = MultithreadedResourceOrchestrator.a ^ 104480969996542L;
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
                var6_5 = "U\u008b\u0004J\u0098\u00d8\u0006\u00b7\u0095$\u0006\u00a0t>\u000f\u00e8\u00be\u00b8\u000b\u008d\u00df_y\u00b1\u00be!]\u00e5<^l\u000e_\u00d6\u00ad\u00e6\u0094\u00a0@\u0091k\u00ee\u008b\u0099\u00a6^\"\u00bd\u008c\u008d\u0016\u00eb\u0086\u0014Y\u008e\u0007$\u00a1\u00f2\f\u00c4\u00fa4\u00dd\u00e1A\u009c\u0087\u00a4{q\u00dc\u00b0nG\u00b5\\\u0017\u00b1";
                var7_6 = "U\u008b\u0004J\u0098\u00d8\u0006\u00b7\u0095$\u0006\u00a0t>\u000f\u00e8\u00be\u00b8\u000b\u008d\u00df_y\u00b1\u00be!]\u00e5<^l\u000e_\u00d6\u00ad\u00e6\u0094\u00a0@\u0091k\u00ee\u008b\u0099\u00a6^\"\u00bd\u008c\u008d\u0016\u00eb\u0086\u0014Y\u008e\u0007$\u00a1\u00f2\f\u00c4\u00fa4\u00dd\u00e1A\u009c\u0087\u00a4{q\u00dc\u00b0nG\u00b5\\\u0017\u00b1".length();
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
                    var6_5 = "\u00f8\u008eo1~\u00a2\u00b3\u00fa\u0098\u00f7'\u009e\u00b4\u00c1V\u0007";
                    var7_6 = "\u00f8\u008eo1~\u00a2\u00b3\u00fa\u0098\u00f7'\u009e\u00b4\u00c1V\u0007".length();
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
        MultithreadedResourceOrchestrator.b = var8_3;
        MultithreadedResourceOrchestrator.d = new Integer[12];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B60;
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
                throw new RuntimeException("a/qx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultithreadedResourceOrchestrator.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == 'b' || c == '\u00de' || c == '\u00c0') {
                field = MultithreadedResourceOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultithreadedResourceOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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
        int n = MultithreadedResourceOrchestrator.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = MultithreadedResourceOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultithreadedResourceOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultithreadedResourceOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    MultithreadedResourceOrchestrator.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultithreadedResourceOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultithreadedResourceOrchestrator.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultithreadedResourceOrchestrator.f(691381479221515L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static void E(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object, double d2, double d3, double d4) {
        multithreadedResourceOrchestrator.D(object, d2, d3, d4);
    }

    private Object t() {
        return this.N.Z(null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultithreadedResourceOrchestrator.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                MultithreadedResourceOrchestrator.g[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object R(Object object) {
        return this.Y.Z(object);
    }

    private void d(Object object) {
        this.J.V(object);
    }

    static void z(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object) {
        multithreadedResourceOrchestrator.E(object);
    }

    static void E(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object) {
        multithreadedResourceOrchestrator.d(object);
    }

    private void E(Object object) {
        this.c.V(object);
    }

    private void D(Object object, double d2, double d3, double d4) {
        this.v.l(object, d2, d3, d4);
    }

    private void Y(Object object, int n) {
        this.f.l(object, n);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultithreadedResourceOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultithreadedResourceOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "(6We";
        objectArray[1] = "\u001e\u0003\u001dEL?\u0015\f\f\n1'\u0006\u000b\u0005C";
        objectArray[2] = Boolean.TYPE;
        MultithreadedResourceOrchestrator.i[2] = "java/lang/Boolean";
        objectArray[3] = "OF}TtqDIl\u001b\u0019qDTx";
        objectArray[4] = " Y$z2\u0012Uy/u#]8y/h7H";
        objectArray[5] = ":)|\u0003";
        objectArray[6] = ".U\u001c";
        objectArray[7] = Integer.TYPE;
        MultithreadedResourceOrchestrator.i[7] = "java/lang/Integer";
        objectArray[8] = "b\b0o";
        objectArray[9] = "o911\u0010\u001bd6 ~q\u0015o=$$";
        objectArray[10] = "\f>VYN'\u0014cJ!sBS=SCR$Z;ZJ4{\f5H\\Z}\u0001f\u0002!\u000e8ZzBOK~\u0000<3\u001bH0\u000b`\u0002KEs[\u0004\u000f\u0019Pz\u001at]@Y;j";
        objectArray[11] = "\nl];7P\u00121AC\u00165UoX!+S\\iQ(M\f\ngC>#\n\u00074\tCwO\\(I-2\t\u0006n8}pO\u0016j\u0006$<H\u0013V";
        objectArray[12] = "Pr#\u0012-UH/?j\u001a0\u000fq&\b1V\u0006w/\u0001W\tPy=\u00179\u000f]*wjmJ\u000667\u0004(\f\\pFTjJLtx\r&MIH";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ")Vx\u0001;[*KcS@[n9#\u0007xM{\u0001|\\8]\u0015\u0000'X\"Vs\t!Q+0";
    }

    private static Method h(long l, long l2) {
        int n = MultithreadedResourceOrchestrator.e(l, l2);
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
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultithreadedResourceOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultithreadedResourceOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultithreadedResourceOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultithreadedResourceOrchestrator.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultithreadedResourceOrchestrator.f(691381479221515L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultithreadedResourceOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultithreadedResourceOrchestrator.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultithreadedResourceOrchestrator.f(691381479221515L, 0L);
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

    static void c(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object, double d2, double d3, double d4, double d5, double d6) {
        multithreadedResourceOrchestrator.G(object, d2, d3, d4, d5, d6);
    }

    static Object d(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator, Object object) {
        return multithreadedResourceOrchestrator.R(object);
    }

    public void m(Object object, int n, int n2, int n3, int n4) {
        this.F.l(object, n, n2, n3, n4);
    }

    private void G(Object object, double d2, double d3, double d4, double d5, double d6) {
        this.h.l(object, d2, d3, d4, d5, d6);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object S(MultithreadedResourceOrchestrator multithreadedResourceOrchestrator) {
        return multithreadedResourceOrchestrator.t();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultithreadedResourceOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MultithreadedResourceOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

