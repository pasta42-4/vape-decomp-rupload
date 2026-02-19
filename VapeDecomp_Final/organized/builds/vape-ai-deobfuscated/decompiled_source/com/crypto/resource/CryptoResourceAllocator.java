/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.resource;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometricCalculator1575;
import com.reflection.metadata.ReflectionMetadataResolver;
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

public class CryptoResourceAllocator
extends CryptoProtocolEngine {
    private HK H;
    private HK L;
    private static final String[] g;
    private ReflectionUtilityService w;
    public HK D;
    private ReflectionUtilityService O;
    private static final Integer[] d;
    private static final long a;
    private static final long[] c;
    private HK C;
    private HK b;
    private static final Object[] f;
    private static final Map e;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CryptoResourceAllocator.e(l, l2);
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
                clazz3 = CryptoResourceAllocator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoResourceAllocator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoResourceAllocator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoResourceAllocator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoResourceAllocator.f(777530758168496L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoResourceAllocator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoResourceAllocator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoResourceAllocator.f(777530758168496L, 0L);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoResourceAllocator.a = MultiContainerRegistry.a(-2037945238575841751L, -2666133150602787538L, MethodHandles.lookup().lookupClass()).a(52933895768489L);
                CryptoResourceAllocator.f = new Object[17];
                CryptoResourceAllocator.g = new String[17];
                CryptoResourceAllocator.a();
                CryptoResourceAllocator.e = new HashMap<K, V>(13);
                var0 = CryptoResourceAllocator.a ^ 131358285823710L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00d1&\u0005\u00c0r\u001a\u00b1\u00a7\u00b7\u00e2\u0098l\u00d2Dwa\u00f9\u00b5\u0092\u0015\u00c7\u0006\u00a6\u00925f'\u00c9mN\u00dd\u00e1\u00bbo\u00ea\u00c0`=]#\u00eej\u0010\u00d4\u00e8\u00e0s\u0082\u007f\u009a\u0092\u00c7\u0004\u00fe\u001f\u0013";
                var7_6 = "\u00d1&\u0005\u00c0r\u001a\u00b1\u00a7\u00b7\u00e2\u0098l\u00d2Dwa\u00f9\u00b5\u0092\u0015\u00c7\u0006\u00a6\u00925f'\u00c9mN\u00dd\u00e1\u00bbo\u00ea\u00c0`=]#\u00eej\u0010\u00d4\u00e8\u00e0s\u0082\u007f\u009a\u0092\u00c7\u0004\u00fe\u001f\u0013".length();
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
                    var6_5 = "a\u0017Id\u0002$\u009f\u00bfbE\u0094\u0088\u0088\u0012\u00aen";
                    var7_6 = "a\u0017Id\u0002$\u009f\u00bfbE\u0094\u0088\u0088\u0012\u00aen".length();
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
        CryptoResourceAllocator.c = var8_3;
        CryptoResourceAllocator.d = new Integer[9];
    }

    static void b(CryptoResourceAllocator cryptoResourceAllocator, Object object, Object object2, int n, int n2, int n3, int n4, int n5, Object object3) {
        cryptoResourceAllocator.R(object, object2, n, n2, n3, n4, n5, object3);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x82B;
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
                throw new RuntimeException("a/vw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoResourceAllocator.d[n2] = n3;
        }
        return d[n2];
    }

    public void K(Object object) {
        this.D.V(object);
    }

    static void e(CryptoResourceAllocator cryptoResourceAllocator, Object object, Object object2, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, float f4) {
        cryptoResourceAllocator.f(object, object2, n, n2, n3, n4, n5, f, f2, f3, f4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CryptoResourceAllocator() {
        block31: {
            block24: {
                block30: {
                    block28: {
                        block27: {
                            block25: {
                                block26: {
                                    var1_1 = CryptoResourceAllocator.a ^ 26901676826091L;
                                    v0 = GeometricCalculator1575.o();
                                    super(ReflectionMetadataResolver.F0);
                                    var3_2 = v0;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 == null) break block24;
                                                    if (GameVersionEnumerator.MC_1_20_6.H()) {
                                                    }
                                                    ** GOTO lbl87
                                                }
                                                catch (CustomSystemException v1) {
                                                    throw CryptoResourceAllocator.a(v1);
                                                }
                                                v2 = GameVersionEnumerator.MC_1_21_0.Q();
                                                if (var3_2 == null) break block25;
                                            }
                                            catch (CustomSystemException v3) {
                                                throw CryptoResourceAllocator.a(v3);
                                            }
                                            if (!v2) break block26;
                                        }
                                        catch (CustomSystemException v4) {
                                            throw CryptoResourceAllocator.a(v4);
                                        }
                                        this.H = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)15659, (long)(5036589432017870761L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.tS, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)7687371650095983599L, (long)var1_1);
                                        this.L = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)14662, (long)(8270222518826523585L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.Yg}, (long)7687371650095983599L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v5) {
                                        throw CryptoResourceAllocator.a(v5);
                                    }
                                }
                                v2 = GameVersionEnumerator.MC_1_21_6.H();
                            }
                            try {
                                try {
                                    try {
                                        if (var3_2 == null) break block27;
                                        if (v2) {
                                        }
                                        ** GOTO lbl81
                                    }
                                    catch (CustomSystemException v6) {
                                        throw CryptoResourceAllocator.a(v6);
                                    }
                                    v7 = this;
                                    v8 = this;
                                    v9 /* !! */  = (int)CryptoResourceAllocator.b("h", (int)10013, (long)(693017061669488027L ^ var1_1));
                                    if (var3_2 == null) break block28;
                                }
                                catch (CustomSystemException v10) {
                                    throw CryptoResourceAllocator.a(v10);
                                }
                                v7.O = CryptoResourceAllocator.c("t", (Object)v8, (Object)CryptoResourceAllocator.c("v", (int)v9 /* !! */ , (long)7687586983288601418L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ex, (long)7687446667936084639L, (long)var1_1);
                                v2 = GameVersionEnumerator.MC_1_21_11.H();
                            }
                            catch (CustomSystemException v11) {
                                throw CryptoResourceAllocator.a(v11);
                            }
                        }
                        try {
                            block29: {
                                try {
                                    if (!v2) break block29;
                                    this.C = CryptoResourceAllocator.c("t", (Object)this, (Object)new Class[]{ReflectionMetadataResolver.FF, ReflectionMetadataResolver.rq, ReflectionMetadataResolver.Ex, Integer.TYPE, Integer.TYPE}, (long)7685418362852001378L, (long)var1_1);
                                    if (var3_2 != null) break block30;
                                }
                                catch (CustomSystemException v12) {
                                    throw CryptoResourceAllocator.a(v12);
                                }
                            }
                            v7 = this;
                            v8 = this;
                            v9 /* !! */  = 3;
                        }
                        catch (CustomSystemException v13) {
                            throw CryptoResourceAllocator.a(v13);
                        }
                    }
                    v14 = new Class[v9 /* !! */ ];
                    v14[0] = ReflectionMetadataResolver.FF;
                    v14[1] = ReflectionMetadataResolver.rq;
                    v14[2] = ReflectionMetadataResolver.Ex;
                    v7.C = CryptoResourceAllocator.c("t", (Object)v8, (Object)v14, (long)7685418362852001378L, (long)var1_1);
                }
                try {
                    try {
                        this.w = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)10346, (long)(8135769897740716782L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rq, (long)7687446667936084639L, (long)var1_1);
                        this.b = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)2538, (long)(4737551308215905125L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)7687371650095983599L, (long)var1_1);
                        if (var3_2 != null) break block31;
lbl81:
                        // 2 sources

                        this.C = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)9485, (long)(682982631143688076L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FF, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ux}, (long)7687371650095983599L, (long)var1_1);
                        this.D = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)2353, (long)(8218513885823069108L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)7687371650095983599L, (long)var1_1);
                        if (var3_2 != null) break block31;
                    }
                    catch (CustomSystemException v15) {
                        throw CryptoResourceAllocator.a(v15);
                    }
lbl87:
                    // 2 sources

                    this.L = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)9965, (long)(673705454577075310L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.Yg}, (long)7687507338656225245L, (long)var1_1);
                }
                catch (CustomSystemException v16) {
                    throw CryptoResourceAllocator.a(v16);
                }
            }
            this.H = CryptoResourceAllocator.c("t", (Object)this, (Object)CryptoResourceAllocator.c("v", (int)CryptoResourceAllocator.b("h", (int)15841, (long)(1049269873223819105L ^ var1_1)), (long)7687586983288601418L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rr, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)7687507338656225245L, (long)var1_1);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void R(Object object, Object object2, int n, int n2, int n3, int n4, int n5, Object object3) {
        this.L.l(object, object2, n, n2, n3, n4, n5, object3);
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
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 59;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 13;
                break;
            }
            case 12: {
                n3 = 58;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 36;
                break;
            }
            case 16: {
                n3 = 4;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 56;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 19;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 34;
                break;
            }
            case 32: {
                n3 = 49;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 46;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 20;
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
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 42;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 38;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 63;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 40;
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
        CryptoResourceAllocator.g[n4] = new String(cArray);
        return n4;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoResourceAllocator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoResourceAllocator.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoResourceAllocator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "[x%<";
        objectArray[1] = "MQj`3CF^{/N[UYrf";
        objectArray[2] = Boolean.TYPE;
        CryptoResourceAllocator.g[2] = "java/lang/Boolean";
        objectArray[3] = "2+~jv\\9$o%\u001b\\99{";
        objectArray[4] = "iF^+\u0011w\u001cfU$\u00008qfU9\u0014-";
        objectArray[5] = "!N\u0004\u0001";
        objectArray[6] = "-_&";
        objectArray[7] = Integer.TYPE;
        CryptoResourceAllocator.g[7] = "java/lang/Integer";
        objectArray[8] = "\u0019ToE";
        objectArray[9] = "P\u001c-sz5%<&|kzH<&a\u007fo";
        objectArray[10] = "\u000fib,X\\zIi#I\u0013\u0017Ii>]\u0006";
        objectArray[11] = "\u000fn\u0013pQ\\\u0004a\u0002?0R\u000fj\u0006e";
        objectArray[12] = "\u0017\u001eO@<1AOWq\t\u000f\u001e\u0013\u0004J>d\u0017\u0011X\u001dN6H\u0003\f\u0010!wA\u0010Qqt`Z\u001d\u000e\u0018qdV\u00124Nvc\u001a\u0000K\u0016p1W\u007f\bL'hE\u001dU\u001aw}'";
        objectArray[13] = "l4.\u0016\bC:e6'!}e9e\u001c\n\u0016l;9KzD3)mF\u0015\u0005::0'@\u0012!7oNE\u0016-8U\u001a\u001e\u001alk?\u0017\u0015A'U";
        objectArray[14] = "\u007fg\u0003}7r)6\u001bL\u0018LvjHw5'\u007fh\u0014 Eu z@-*4)i\u001dL\u007f#2dB%z'>kxs} ry\u0007+{r?\u0006Dq,+-d\u0019'|>O";
        objectArray[15] = "qat*u.0c|3\n&6\u00078:z?+gd17sM>h{1=&7j'fM";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "y\u00022ie\"/S*XP\u001cv[%ehc.]w(\u0017 t\n.:u}\"Z;X";
    }

    public Object d(Object object) {
        return this.w.Z(object);
    }

    public void C(Object object, Object object2, String string, int n, int n2, int n3, boolean bl) {
        this.b.l(object, object2, string, n, n2, n3, bl);
    }

    private void f(Object object, Object object2, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, float f4) {
        this.H.l(object, object2, n, n2, n3, n4, n5, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object K(Object object, Object object2, Object object3, Object ... objectArray) {
        try {
            if (GameVersionEnumerator.MC_1_21_11.H()) {
                return this.C.A(object, object2, object3, (Integer)objectArray[0], (Integer)objectArray[1]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoResourceAllocator.a(customSystemException);
        }
        return this.C.A(object, object2, object3);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoResourceAllocator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoResourceAllocator.d(classArray[i], string, clazz2);
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
            if (c == 'A' || c == 'B' || c == '\u00da' || c == '\u00ff') {
                field = CryptoResourceAllocator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoResourceAllocator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object K(CryptoResourceAllocator cryptoResourceAllocator, Object object, Object object2, Object object3, Object[] objectArray) {
        return cryptoResourceAllocator.K(object, object2, object3, objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoResourceAllocator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoResourceAllocator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = CryptoResourceAllocator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoResourceAllocator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoResourceAllocator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoResourceAllocator.c(clazz3, string2, clazz2)) != null) {
                    CryptoResourceAllocator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoResourceAllocator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoResourceAllocator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoResourceAllocator.f(777530758168496L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Object C(Object object) {
        return this.O.Z(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoResourceAllocator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

