/*
 * Decompiled with CFR 0.152.
 */
package com.integration.interop;

import a.HK;
import com.cache.distributed.DistributedCacheManager135;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
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
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CrossPlatformInteroperabilityManager
extends CryptoProtocolEngine {
    private static final long[] d;
    private static final Integer[] g;
    private static final String[] j;
    private static final Map h;
    private ReflectionUtilityService b;
    public HK e;
    private ReflectionUtilityService f;
    private HK H;
    public HK c;
    private HK s;
    private ReflectionUtilityService t;
    private ReflectionUtilityService P;
    private static final Object[] i;
    private static final long a;
    public HK R;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CrossPlatformInteroperabilityManager.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                CrossPlatformInteroperabilityManager.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CrossPlatformInteroperabilityManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void i(Object object, Object object2) {
        this.b.L(object, object2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CrossPlatformInteroperabilityManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method h(long l, long l2) {
        int n = CrossPlatformInteroperabilityManager.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = CrossPlatformInteroperabilityManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CrossPlatformInteroperabilityManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CrossPlatformInteroperabilityManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CrossPlatformInteroperabilityManager.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CrossPlatformInteroperabilityManager.f(756516105302189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CrossPlatformInteroperabilityManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CrossPlatformInteroperabilityManager.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CrossPlatformInteroperabilityManager.f(756516105302189L, 0L);
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

    static Object l(CrossPlatformInteroperabilityManager crossPlatformInteroperabilityManager, Object object) {
        return crossPlatformInteroperabilityManager.t(object);
    }

    static void R(CrossPlatformInteroperabilityManager crossPlatformInteroperabilityManager, Object object, Object object2) {
        crossPlatformInteroperabilityManager.i(object, object2);
    }

    boolean H(Object object, Object object2, float f, boolean bl) {
        return this.e.V(object, object2, Float.valueOf(f), bl);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CrossPlatformInteroperabilityManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CrossPlatformInteroperabilityManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CrossPlatformInteroperabilityManager.a = MultiContainerRegistry.a(-2152499858018229175L, 8117750998225230880L, MethodHandles.lookup().lookupClass()).a(136245817048815L);
                CrossPlatformInteroperabilityManager.i = new Object[15];
                CrossPlatformInteroperabilityManager.j = new String[15];
                CrossPlatformInteroperabilityManager.a();
                CrossPlatformInteroperabilityManager.h = new HashMap<K, V>(13);
                var0 = CrossPlatformInteroperabilityManager.a ^ 71880240705713L;
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
                var6_5 = "X\u001bR%\u0017\u00f9[\u00a7j\u00c5\u00cfC#\u008fU\u00f1y\u00cc\u00c9\u000e\u0004x\u00c9\u0000\u0080,\u0083\u00ae-\u0085\u00cc\u00d1\u009d\u001b\f\u008a\u00a6\u008e\u00f6M\f\f^i}\u00b7\r\u00d3I0\u0005\u00d4}l\u0002\u00ac\u00e3\u00b0\u00d0\u008d*G&\u009fz\u0010\u0085\u00fe\u00e4\u009e.\u00fba7a\u00e0\\\u00adc\u008d";
                var7_6 = "X\u001bR%\u0017\u00f9[\u00a7j\u00c5\u00cfC#\u008fU\u00f1y\u00cc\u00c9\u000e\u0004x\u00c9\u0000\u0080,\u0083\u00ae-\u0085\u00cc\u00d1\u009d\u001b\f\u008a\u00a6\u008e\u00f6M\f\f^i}\u00b7\r\u00d3I0\u0005\u00d4}l\u0002\u00ac\u00e3\u00b0\u00d0\u008d*G&\u009fz\u0010\u0085\u00fe\u00e4\u009e.\u00fba7a\u00e0\\\u00adc\u008d".length();
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
                    var6_5 = "\u00ea*97&U\u0012!\u00caw\u00ad\u00f0\u00b3\u00d7\u00cfO";
                    var7_6 = "\u00ea*97&U\u0012!\u00caw\u00ad\u00f0\u00b3\u00d7\u00cfO".length();
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
        CrossPlatformInteroperabilityManager.d = var8_3;
        CrossPlatformInteroperabilityManager.g = new Integer[12];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 36;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 33;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 13;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 2;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 40;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 63;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 19;
                break;
            }
            case 30: {
                n3 = 58;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 47;
                break;
            }
            case 35: {
                n3 = 3;
                break;
            }
            case 36: {
                n3 = 21;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 62;
                break;
            }
            case 40: {
                n3 = 52;
                break;
            }
            case 41: {
                n3 = 57;
                break;
            }
            case 42: {
                n3 = 48;
                break;
            }
            case 43: {
                n3 = 1;
                break;
            }
            case 44: {
                n3 = 50;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 38;
                break;
            }
            case 50: {
                n3 = 4;
                break;
            }
            case 51: {
                n3 = 5;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 10;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 16;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 45;
                break;
            }
            case 62: {
                n3 = 15;
                break;
            }
            default: {
                n3 = 32;
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
        CrossPlatformInteroperabilityManager.j[n4] = new String(cArray);
        return n4;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CrossPlatformInteroperabilityManager() {
        block24: {
            long l;
            block30: {
                int n;
                int[] nArray;
                block27: {
                    int n2;
                    block25: {
                        block22: {
                            l = a ^ 0xCFCA9F48E39L;
                            int[] nArray2 = DistributedCacheManager135.s();
                            super(ReflectionMetadataResolver.PZ);
                            nArray = nArray2;
                            try {
                                block23: {
                                    try {
                                        try {
                                            n = GameVersionEnumerator.MC_1_21_10.H();
                                            if (nArray != null) break block22;
                                            if (n == 0) break block23;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CrossPlatformInteroperabilityManager.a(customSystemException);
                                        }
                                        this.R = null;
                                        this.f = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)1171, (long)(0x2EB51762C0F2FFC6L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.bV, (long)752148570308551489L, (long)l);
                                        if (nArray == null) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CrossPlatformInteroperabilityManager.a(customSystemException);
                                    }
                                }
                                n = GeometryCalculator.C();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformInteroperabilityManager.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                block26: {
                                    try {
                                        try {
                                            n2 = 35;
                                            if (nArray != null) break block25;
                                            if (n < n2) break block26;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CrossPlatformInteroperabilityManager.a(customSystemException);
                                        }
                                        this.R = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)ReflectionMetadataResolver.Eg, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)24948, (long)(0x6BE19DED1B101A28L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Float.TYPE, Float.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE}, (long)752227577016587223L, (long)l);
                                        this.f = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)7068, (long)(0x3BFCB3FE8E61E0CDL ^ l)), (long)752317498731321366L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.bV, (long)752148570308551489L, (long)l);
                                        if (nArray == null) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CrossPlatformInteroperabilityManager.a(customSystemException);
                                    }
                                }
                                n = GeometryCalculator.C();
                                if (nArray != null) break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformInteroperabilityManager.a(customSystemException);
                            }
                            n2 = 13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformInteroperabilityManager.a(customSystemException);
                        }
                    }
                    try {
                        block28: {
                            try {
                                if (n != n2) break block28;
                                this.t = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)4400, (long)(0x106BEB5A8E3A6A64L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.UI, (long)752148570308551489L, (long)l);
                                this.c = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)23257, (long)(0x39F1C60C3C90A18BL ^ l)), (long)752317498731321366L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, Double.TYPE, Double.TYPE, Double.TYPE}, (long)752533742549665645L, (long)l);
                                if (nArray == null) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformInteroperabilityManager.a(customSystemException);
                            }
                        }
                        n = TemporalMetadataResolver.h.d() ? 1 : 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformInteroperabilityManager.a(customSystemException);
                    }
                }
                try {
                    block29: {
                        try {
                            if (n == 0) break block29;
                            this.b = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)3433, (long)(0x2849CC29FD5C7636L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, List.class, (long)752148570308551489L, (long)l);
                            if (nArray == null) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformInteroperabilityManager.a(customSystemException);
                        }
                    }
                    this.b = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)26590, (long)(0x5774FEA823C99C83L ^ l)), (long)752317498731321366L, (long)l), (boolean)ObjectLifecycleTracker.z, List.class, (long)752148570308551489L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformInteroperabilityManager.a(customSystemException);
                }
            }
            this.P = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)15992, (long)(0x1926C6ED65B5C52EL ^ l)), (long)752317498731321366L, (long)l), (boolean)true, FloatBuffer.class, (long)752148570308551489L, (long)l);
            this.s = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)16119, (long)(0x252458A771A8C5A9L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.UI, (Object)new Class[0], (long)752533742549665645L, (long)l);
            this.R = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)14476, (long)(0x6DD757DDF61FC3DFL ^ l)), (long)752317498731321366L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, Double.TYPE, Double.TYPE, Double.TYPE}, (long)752533742549665645L, (long)l);
            this.H = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)5857, (long)(0x5A86CD7D5BF66DB6L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[0], (long)752533742549665645L, (long)l);
            this.e = CrossPlatformInteroperabilityManager.c("y", (Object)this, (Object)CrossPlatformInteroperabilityManager.c("\u00f1", (int)CrossPlatformInteroperabilityManager.b("r", (int)551, (long)(0x6B93387624CC7977L ^ l)), (long)752317498731321366L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, Float.TYPE, Boolean.TYPE}, (long)752533742549665645L, (long)l);
        }
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "WO\u0014\u001e";
        objectArray[1] = "Z*\u000fQ\u0015\u0014Q%\u001e\u001eh\fB\"\u0017W";
        objectArray[2] = Boolean.TYPE;
        CrossPlatformInteroperabilityManager.j[2] = "java/lang/Boolean";
        objectArray[3] = "\rj/x\u000ee\u0006e>7ce\u0006x*";
        objectArray[4] = "\u0017\u0012|3X\u0018b2w<IW\u000f2w!]B";
        objectArray[5] = ">'b/";
        objectArray[6] = "F%fZ\u000213\u0005mU\u0013~^\u0005mH\u0007k";
        objectArray[7] = "3\u0007%";
        objectArray[8] = Integer.TYPE;
        CrossPlatformInteroperabilityManager.j[8] = "java/lang/Integer";
        objectArray[9] = ".\u0014=\u001f";
        objectArray[10] = "%q-S\u0001\u0017.~<\u001c`\u0019%u8F";
        objectArray[11] = "Y7&BM\u0019T7u$5v\u000bkp]MN\\y,KrOVdt\u0019\u0003\u001a\rm*$H\u001b@uq\u001d\u000e\u001d@{O\u0018\tH\u000en&E\u001e\u000eT\u0007tGHI\u00038.\u001d\u001e\u00102";
        objectArray[12] = "jacb&ega0\u0004T\n;<xv'3}:xx\u00193mns;!d\u007f2e\u0004 nbj7uu5k4\n>txso3xrx}Q6\u007f'6h8khal\u0001ji>&;>03h\u007f\n";
        objectArray[13] = "\u0017*o.\u0001q\u001a*<He\u001eEv91\u0001&\u0012de'>'\u0018y=uOrCpcH\u0004s\u000eh8qBu\u000ef\u0006v]f\u0000%~x\\&\u0018\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\u000fXXI\u0004\u0005KQ\u0002HzPI8\u0003IFFSI\u0002D\u0018P2\u0001QF\u0003\u0004\nVC\u001a\u0015;";
    }

    static Object b(CrossPlatformInteroperabilityManager crossPlatformInteroperabilityManager, Object object) {
        return crossPlatformInteroperabilityManager.O(object);
    }

    private FloatBuffer b(Object object) {
        return (FloatBuffer)this.P.Z(object);
    }

    private Object t(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.f.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformInteroperabilityManager.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() == 13) {
                return this.t.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformInteroperabilityManager.a(customSystemException);
        }
        return this.s.T(object, new Object[0]);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00ef' || c == 'w' || c == 'I') {
                field = CrossPlatformInteroperabilityManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CrossPlatformInteroperabilityManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CrossPlatformInteroperabilityManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CrossPlatformInteroperabilityManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static FloatBuffer C(CrossPlatformInteroperabilityManager crossPlatformInteroperabilityManager, Object object) {
        return crossPlatformInteroperabilityManager.b(object);
    }

    private static Field g(long l, long l2) {
        int n = CrossPlatformInteroperabilityManager.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = CrossPlatformInteroperabilityManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CrossPlatformInteroperabilityManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CrossPlatformInteroperabilityManager.c(clazz3, string2, clazz2)) != null) {
                    CrossPlatformInteroperabilityManager.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CrossPlatformInteroperabilityManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CrossPlatformInteroperabilityManager.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CrossPlatformInteroperabilityManager.f(756516105302189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private void t(Object object) {
        this.H.V(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7125;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CrossPlatformInteroperabilityManager.g[n2] = n3;
        }
        return g[n2];
    }

    private Object O(Object object) {
        return this.b.Z(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CrossPlatformInteroperabilityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CrossPlatformInteroperabilityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

