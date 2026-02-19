/*
 * Decompiled with CFR 0.152.
 */
package com.security.streaming;

import a.Qh;
import a.Ya;
import a._Y;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.DynamicContextBroker;
import com.security.transform.CryptographicTransformer;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoStreamProcessor {
    private static final Map d;
    private static final long a;
    private static final String[] f;
    private static final Integer[] c;
    private static final long[] b;
    private static final Object[] e;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoStreamProcessor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5643;
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
                throw new RuntimeException("a/Fp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoStreamProcessor.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(long l, long l2) {
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
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 3: {
                n3 = 17;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 20;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 61;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 36;
                break;
            }
            case 16: {
                n3 = 34;
                break;
            }
            case 17: {
                n3 = 0;
                break;
            }
            case 18: {
                n3 = 8;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 60;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 40;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 53;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 51;
                break;
            }
            case 33: {
                n3 = 42;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 59;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 22;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 1;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 5;
                break;
            }
            case 56: {
                n3 = 21;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 62;
                break;
            }
            case 62: {
                n3 = 23;
                break;
            }
            default: {
                n3 = 24;
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
        CryptoStreamProcessor.f[n4] = new String(cArray);
        return n4;
    }

    public static void N() {
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = ApplicationLifecycleManager.N().h();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = ApplicationLifecycleManager.N().s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = ApplicationLifecycleManager.N().w();
        CryptoStreamProcessor.d(connectionPoolOrchestrator1192, false);
        CryptoStreamProcessor.d(connectionPoolOrchestrator11922, false);
        CryptoStreamProcessor.d(connectionPoolOrchestrator11923, false);
        CryptoStreamProcessor.d(connectionPoolOrchestrator11924, false);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoStreamProcessor.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoStreamProcessor.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoStreamProcessor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoStreamProcessor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void y(boolean bl) {
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = ApplicationLifecycleManager.N().h();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = ApplicationLifecycleManager.N().s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = ApplicationLifecycleManager.N().w();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11925 = ApplicationLifecycleManager.N().N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11926 = ApplicationLifecycleManager.N().f();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11927 = ApplicationLifecycleManager.N().r();
        boolean bl2 = DynamicContextBroker.s(connectionPoolOrchestrator1192);
        boolean bl3 = DynamicContextBroker.s(connectionPoolOrchestrator11922);
        boolean bl4 = DynamicContextBroker.s(connectionPoolOrchestrator11923);
        boolean bl5 = DynamicContextBroker.s(connectionPoolOrchestrator11924);
        boolean bl6 = DynamicContextBroker.s(connectionPoolOrchestrator11925);
        boolean bl7 = DynamicContextBroker.s(connectionPoolOrchestrator11926);
        boolean bl8 = DynamicContextBroker.s(connectionPoolOrchestrator11927);
        try {
            CryptoStreamProcessor.d(connectionPoolOrchestrator1192, bl2);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11922, bl3);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11923, bl4);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11924, bl5);
            if (bl) {
                CryptoStreamProcessor.d(connectionPoolOrchestrator11925, bl6);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor.a(customSystemException);
        }
        CryptoStreamProcessor.d(connectionPoolOrchestrator11926, bl7);
        CryptoStreamProcessor.d(connectionPoolOrchestrator11927, bl8);
    }

    public static void A() {
        CryptoStreamProcessor.y(true);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoStreamProcessor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoStreamProcessor.b(classArray[i], string, clazz2);
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
                CryptoStreamProcessor.a = MultiContainerRegistry.a(-2094156484137580045L, -8950477894780123560L, MethodHandles.lookup().lookupClass()).a(7359879722226L);
                CryptoStreamProcessor.e = new Object[5];
                CryptoStreamProcessor.f = new String[5];
                CryptoStreamProcessor.a();
                CryptoStreamProcessor.d = new HashMap<K, V>(13);
                var0 = CryptoStreamProcessor.a ^ 140591615457043L;
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
                var6_5 = "TA\u00a0_6W y\f\u00cf\u00c9\u00d6\u00ef\u00c4\u00dcI\u00a7\u00d6\u00a3\u0006\u008b\u00c3\u00d1\u00e7\u0099)\u000b\u00c6\u00d5l\u00de\u00b4\u009a\u00f3W%\u008be\u0086\u00ab\t\u00cc\u00a9Db}a\b \u00a8#\"\u00b7\u0006\u0006\u00e1";
                var7_6 = "TA\u00a0_6W y\f\u00cf\u00c9\u00d6\u00ef\u00c4\u00dcI\u00a7\u00d6\u00a3\u0006\u008b\u00c3\u00d1\u00e7\u0099)\u000b\u00c6\u00d5l\u00de\u00b4\u009a\u00f3W%\u008be\u0086\u00ab\t\u00cc\u00a9Db}a\b \u00a8#\"\u00b7\u0006\u0006\u00e1".length();
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
                    var6_5 = "\u0011\u00a7x\u00d0cp\u0099z\u00ef\u00fe=\u00f4\u0011\u00b0\u008a\u00dc";
                    var7_6 = "\u0011\u00a7x\u00d0cp\u0099z\u00ef\u00fe=\u00f4\u0011\u00b0\u008a\u00dc".length();
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
        CryptoStreamProcessor.b = var8_3;
        CryptoStreamProcessor.c = new Integer[9];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == '\u00e0' || c == 'M' || c == 'R') {
                field = CryptoStreamProcessor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoStreamProcessor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void j(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = executionStateTracker.s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = executionStateTracker.w();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = executionStateTracker.y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = executionStateTracker.h();
        ArrayList<ConnectionPoolOrchestrator1192> arrayList = new ArrayList<ConnectionPoolOrchestrator1192>(Arrays.asList(connectionPoolOrchestrator1192, connectionPoolOrchestrator11922, connectionPoolOrchestrator11923, connectionPoolOrchestrator11924));
        ArrayList<Boolean> arrayList2 = new ArrayList<Boolean>();
        arrayList2.add(bl);
        arrayList2.add(bl2);
        arrayList2.add(bl3);
        arrayList2.add(bl4);
        try {
            for (int i = 0; i < arrayList2.size(); ++i) {
                CryptoStreamProcessor.s(arrayList.get(i), (Boolean)arrayList2.get(i));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor.a(customSystemException);
        }
    }

    public static float f(Qh qh) {
        double d2;
        block2: {
            double d3 = qh.G();
            double d4 = qh.o();
            d2 = Math.toDegrees(Math.atan2(d4, d3));
            try {
                if (d3 == 0.0 && d4 == 0.0) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoStreamProcessor.a(customSystemException);
            }
            d2 = AdaptiveComputationEngine.a(d2 - 90.0);
        }
        double d5 = d2 - 180.0;
        return (float)d5;
    }

    private static Method d(long l, long l2) {
        int n = CryptoStreamProcessor.a(l, l2);
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
                clazz3 = CryptoStreamProcessor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoStreamProcessor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoStreamProcessor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoStreamProcessor.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoStreamProcessor.b(220209860061764L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoStreamProcessor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoStreamProcessor.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoStreamProcessor.b(220209860061764L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoStreamProcessor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static double V(CryptographicTransformer cryptographicTransformer, double[] dArray, double[] dArray2, double d2, double d3) {
        double[] dArray3 = new double[]{cryptographicTransformer.F() + d2, cryptographicTransformer.B() + d3};
        double[] dArray4 = new double[]{dArray[0] + dArray2[0], dArray[1] + dArray2[1]};
        double d4 = _Y.V(dArray3[0], 0.0, dArray3[1], dArray4[0], 0.0, dArray4[1]);
        return d4;
    }

    public static void s(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        block9: {
            block8: {
                try {
                    try {
                        if (!bl) break block8;
                        if (connectionPoolOrchestrator1192.X()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoStreamProcessor.a(customSystemException);
                    }
                    CryptoStreamProcessor.d(connectionPoolOrchestrator1192, true);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
            }
            try {
                try {
                    if (!connectionPoolOrchestrator1192.X() && connectionPoolOrchestrator1192.K() <= 0) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
                CryptoStreamProcessor.d(connectionPoolOrchestrator1192, false);
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoStreamProcessor.a(customSystemException);
            }
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
        e[0] = "\u0017RS";
        objectArray[1] = Integer.TYPE;
        CryptoStreamProcessor.f[1] = "java/lang/Integer";
        objectArray[2] = "F{fy]\u0015Mtw6 \r^s~\u007f";
        objectArray[3] = "$^oW4f/Q~\u0018Uh$ZzB";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~XOso\u000b \u0006M\u0016d\u001a@@Iz?\u000b1_\u000fd\u000f[xYNolP1DN\u0016";
    }

    public static void g(boolean bl) {
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = ApplicationLifecycleManager.N().h();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = ApplicationLifecycleManager.N().s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = ApplicationLifecycleManager.N().w();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11925 = ApplicationLifecycleManager.N().N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11926 = ApplicationLifecycleManager.N().f();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11927 = ApplicationLifecycleManager.N().r();
        try {
            CryptoStreamProcessor.d(connectionPoolOrchestrator1192, false);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11922, false);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11923, false);
            CryptoStreamProcessor.d(connectionPoolOrchestrator11924, false);
            if (bl) {
                CryptoStreamProcessor.d(connectionPoolOrchestrator11925, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor.a(customSystemException);
        }
        CryptoStreamProcessor.d(connectionPoolOrchestrator11926, false);
        CryptoStreamProcessor.d(connectionPoolOrchestrator11927, false);
    }

    public static double[] a(SystemConfigurationOrchestrator systemConfigurationOrchestrator, double d2, ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        double d3 = CryptoStreamProcessor.c(systemConfigurationOrchestrator, connectionPoolOrchestrator1192);
        double d4 = Math.toRadians(d2);
        double[] dArray = new double[]{d3 * -Math.sin(d4), d3 * Math.cos(d4)};
        return dArray;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        block10: {
            block8: {
                block9: {
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block8;
                            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, bl);
                            connectionPoolOrchestrator1192.X(1);
                            if (!bl) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoStreamProcessor.a(customSystemException);
                        }
                        ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator1192);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoStreamProcessor.a(customSystemException);
                    }
                }
                try {
                    if (!connectionPoolOrchestrator1192.equals(ApplicationLifecycleManager.N().y())) return;
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
            }
            try {
                if (!bl) break block10;
                ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, true);
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator1192);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoStreamProcessor.a(customSystemException);
            }
        }
        connectionPoolOrchestrator1192.B();
    }

    public static void d(double d2, double d3, ArrayList<ConnectionPoolOrchestrator1192> arrayList) {
        block52: {
            boolean bl;
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
            block56: {
                block55: {
                    boolean bl2;
                    ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922;
                    ExecutionStateTracker executionStateTracker;
                    boolean bl3;
                    block54: {
                        block53: {
                            double d4;
                            double d5;
                            double[] dArray;
                            double[] dArray2;
                            double d6;
                            double d7;
                            float f;
                            float f2;
                            double d8;
                            double d9;
                            boolean bl4;
                            float f3;
                            float f4;
                            float f5;
                            float f6;
                            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                            long l;
                            block47: {
                                boolean bl5;
                                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923;
                                block51: {
                                    block50: {
                                        boolean bl6;
                                        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924;
                                        boolean bl7;
                                        block49: {
                                            block48: {
                                                double d10;
                                                double d11;
                                                boolean bl8;
                                                block46: {
                                                    block45: {
                                                        double d12;
                                                        block44: {
                                                            block43: {
                                                                block42: {
                                                                    block41: {
                                                                        boolean bl9;
                                                                        boolean bl10;
                                                                        boolean bl11;
                                                                        boolean bl12;
                                                                        l = a ^ 0x3C37CDECADBFL;
                                                                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                                        Ya ya = (Ya)ConfigurationCalibrator.b.N();
                                                                        float f7 = _Y.T();
                                                                        f6 = (float)Math.toDegrees(Math.atan2(d3, d2)) - 90.0f;
                                                                        f5 = AdaptiveComputationEngine.v(AdaptiveComputationEngine.v(f6) - f7);
                                                                        float f8 = f5 * ((float)Math.PI / 180);
                                                                        f4 = (float)Math.cos(f8);
                                                                        f3 = (float)Math.sin(f8);
                                                                        try {
                                                                            bl12 = f4 >= 0.0f;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                                        }
                                                                        bl8 = bl12;
                                                                        try {
                                                                            bl11 = f3 >= 0.0f;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                                        }
                                                                        bl3 = bl11;
                                                                        try {
                                                                            bl10 = f3 <= 0.0f;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                                        }
                                                                        bl4 = bl10;
                                                                        try {
                                                                            bl9 = f4 <= 0.0f;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                                        }
                                                                        bl7 = bl9;
                                                                        executionStateTracker = ApplicationLifecycleManager.N();
                                                                        d9 = 0.2;
                                                                        try {
                                                                            if (!systemConfigurationOrchestrator.H() || !systemConfigurationOrchestrator.j()) break block41;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                                        }
                                                                        d9 = 0.06;
                                                                        break block42;
                                                                    }
                                                                    try {
                                                                        if (!systemConfigurationOrchestrator.o() || !bl8) break block42;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CryptoStreamProcessor.a(customSystemException);
                                                                    }
                                                                    d9 = 0.3;
                                                                }
                                                                if (!systemConfigurationOrchestrator.j()) {
                                                                    d9 *= 0.02;
                                                                }
                                                                try {
                                                                    if (!bl8) break block43;
                                                                    d12 = 1.0;
                                                                    break block44;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptoStreamProcessor.a(customSystemException);
                                                                }
                                                            }
                                                            try {
                                                                d12 = bl7 ? -1.0 : 0.0;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptoStreamProcessor.a(customSystemException);
                                                            }
                                                        }
                                                        d11 = d12;
                                                        try {
                                                            if (!bl3) break block45;
                                                            d10 = -1.0;
                                                            break block46;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        d10 = bl4 ? 1.0 : 0.0;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptoStreamProcessor.a(customSystemException);
                                                    }
                                                }
                                                d8 = d10;
                                                double d13 = d9;
                                                f2 = AdaptiveComputationEngine.D(f6 * (float)Math.PI / 180.0f);
                                                f = AdaptiveComputationEngine.S(f6 * (float)Math.PI / 180.0f);
                                                d7 = -((double)f4 * d11 * d9) * (double)f2;
                                                d6 = (double)f4 * d11 * d9 * (double)f;
                                                dArray2 = new double[]{d7, d6};
                                                dArray = new double[]{systemConfigurationOrchestrator.F() + systemConfigurationOrchestrator.G(), systemConfigurationOrchestrator.B() + systemConfigurationOrchestrator.o()};
                                                d5 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, dArray, new double[]{0.0, 0.0}, d2, d3);
                                                d4 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, dArray, dArray2, d2, d3);
                                                try {
                                                    try {
                                                        try {
                                                            if (!(d4 < d5)) break block47;
                                                            connectionPoolOrchestrator11924 = executionStateTracker.s();
                                                            if (!bl8) break block48;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptoStreamProcessor.a(customSystemException);
                                                        }
                                                        if (arrayList.contains(executionStateTracker.s())) break block48;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptoStreamProcessor.a(customSystemException);
                                                    }
                                                    bl6 = true;
                                                    break block49;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptoStreamProcessor.a(customSystemException);
                                                }
                                            }
                                            bl6 = false;
                                        }
                                        try {
                                            try {
                                                connectionPoolOrchestrator11924.p(bl6);
                                                connectionPoolOrchestrator11923 = executionStateTracker.w();
                                                if (!bl7 || arrayList.contains(executionStateTracker.w())) break block50;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoStreamProcessor.a(customSystemException);
                                            }
                                            bl5 = true;
                                            break block51;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoStreamProcessor.a(customSystemException);
                                        }
                                    }
                                    bl5 = false;
                                }
                                connectionPoolOrchestrator11923.p(bl5);
                            }
                            f2 = AdaptiveComputationEngine.D((f6 + 90.0f) * (float)Math.PI / 180.0f);
                            f = AdaptiveComputationEngine.S((f6 + 90.0f) * (float)Math.PI / 180.0f);
                            d7 = (double)f3 * d8 * d9 * (double)f;
                            d6 = -((double)f3 * d8 * d9) * (double)f2;
                            dArray2 = new double[]{d7, d6};
                            dArray = new double[]{systemConfigurationOrchestrator.F() + systemConfigurationOrchestrator.G(), systemConfigurationOrchestrator.B() + systemConfigurationOrchestrator.o()};
                            d5 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, dArray, new double[]{0.0, 0.0}, d2, d3);
                            d4 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, dArray, dArray2, d2, d3);
                            try {
                                try {
                                    try {
                                        TemporalMetadataResolver.x((String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)3072, (long)(0x15F640E583066B82L ^ l)), (long)-5637639700914331327L, (long)l)) + dArray2[0] + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)26454, (long)(0x7B26EED2707780D5L ^ l)), (long)-5637639700914331327L, (long)l)) + dArray2[1] + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)5924, (long)(0x74124E673CD8F0A0L ^ l)), (long)-5637639700914331327L, (long)l)) + d4 + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)24980, (long)(0x6EF31297BA76061DL ^ l)), (long)-5637639700914331327L, (long)l)) + d5 + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)10082, (long)(0x1E5B0FDFCB48C0E4L ^ l)), (long)-5637639700914331327L, (long)l)) + f5 + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)2773, (long)(0x5A92B5561F2FED55L ^ l)), (long)-5637639700914331327L, (long)l)) + f6 + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)27014, (long)(0x1F27D1A859D38E03L ^ l)), (long)-5637639700914331327L, (long)l)) + AdaptiveConfigurationManager.s(f6) + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)19272, (long)(0x6377BFD5EEAB2CC9L ^ l)), (long)-5637639700914331327L, (long)l)) + f4 + (String)((Object)CryptoStreamProcessor.b("x", (int)CryptoStreamProcessor.a("o", (int)10344, (long)(0x5686F1A79C2ECFEFL ^ l)), (long)-5637639700914331327L, (long)l)) + f3);
                                        if (!(d4 < d5)) break block52;
                                        connectionPoolOrchestrator11922 = executionStateTracker.y();
                                        if (!bl4) break block53;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoStreamProcessor.a(customSystemException);
                                    }
                                    if (arrayList.contains(executionStateTracker.y())) break block53;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoStreamProcessor.a(customSystemException);
                                }
                                bl2 = true;
                                break block54;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoStreamProcessor.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    try {
                        try {
                            connectionPoolOrchestrator11922.p(bl2);
                            connectionPoolOrchestrator1192 = executionStateTracker.h();
                            if (!bl3 || arrayList.contains(executionStateTracker.h())) break block55;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoStreamProcessor.a(customSystemException);
                        }
                        bl = true;
                        break block56;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoStreamProcessor.a(customSystemException);
                    }
                }
                bl = false;
            }
            connectionPoolOrchestrator1192.p(bl);
        }
    }

    public static void r(boolean bl) {
        CryptoStreamProcessor.s(ApplicationLifecycleManager.N().r(), bl);
    }

    public static boolean B() {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (DynamicContextBroker.s(ApplicationLifecycleManager.N().y()) || DynamicContextBroker.s(ApplicationLifecycleManager.N().h())) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoStreamProcessor.a(customSystemException);
                                }
                                if (DynamicContextBroker.s(ApplicationLifecycleManager.N().s())) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoStreamProcessor.a(customSystemException);
                            }
                            if (!DynamicContextBroker.s(ApplicationLifecycleManager.N().w())) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoStreamProcessor.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = CryptoStreamProcessor.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoStreamProcessor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoStreamProcessor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoStreamProcessor.a(clazz3, string2, clazz2)) != null) {
                    CryptoStreamProcessor.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoStreamProcessor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoStreamProcessor.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoStreamProcessor.b(220209860061764L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void B(double d2, double d3, ArrayList<ConnectionPoolOrchestrator1192> arrayList, boolean bl) {
        double d4;
        int n;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        Ya ya = (Ya)ConfigurationCalibrator.b.N();
        double d5 = _Y.T();
        ArrayList<Double> arrayList2 = new ArrayList<Double>(Arrays.asList(d5, (d5 + 90.0) % 360.0, (d5 + 180.0) % 360.0, (d5 + 270.0) % 360.0));
        ArrayList<ConnectionPoolOrchestrator1192> arrayList3 = new ArrayList<ConnectionPoolOrchestrator1192>(Arrays.asList(ApplicationLifecycleManager.N().s(), ApplicationLifecycleManager.N().h(), ApplicationLifecycleManager.N().w(), ApplicationLifecycleManager.N().y()));
        ArrayList<Boolean> arrayList4 = new ArrayList<Boolean>();
        for (ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 : arrayList) {
            arrayList2.remove(arrayList3.indexOf(connectionPoolOrchestrator1192));
            arrayList3.remove(connectionPoolOrchestrator1192);
        }
        Object object = new double[]{systemConfigurationOrchestrator.F() + systemConfigurationOrchestrator.G(), systemConfigurationOrchestrator.B() + systemConfigurationOrchestrator.o()};
        double d6 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, (double[])object, new double[]{0.0, 0.0}, d2, d3);
        for (n = 0; n < arrayList2.size(); ++n) {
            double[] dArray = CryptoStreamProcessor.a(systemConfigurationOrchestrator, arrayList2.get(n), arrayList3.get(n));
            d4 = CryptoStreamProcessor.V(systemConfigurationOrchestrator, (double[])object, dArray, d2, d3);
            if (d4 < d6) {
                arrayList4.add(true);
                object = new double[]{(double)(object[0] + dArray[0]), (double)(object[1] + dArray[1])};
                d6 = d4;
                continue;
            }
            arrayList4.add(false);
        }
        if (bl) {
            double d7;
            Object object2;
            double d8 = systemConfigurationOrchestrator.F();
            d4 = systemConfigurationOrchestrator.B();
            systemConfigurationOrchestrator.B((double)object[0]);
            systemConfigurationOrchestrator.A((double)object[1]);
            if (GeometryCalculator.C() >= 15) {
                object2 = systemConfigurationOrchestrator.L();
            } else {
                Object object3 = systemConfigurationOrchestrator.L();
                object2 = ((oQ)object3).h();
            }
            double d9 = systemConfigurationOrchestrator.G();
            try {
                d7 = GeometryCalculator.C() >= 50 ? 1.0 : -1.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoStreamProcessor.a(customSystemException);
            }
            double d10 = d7;
            double d11 = systemConfigurationOrchestrator.o();
            oQ oQ2 = ((oQ)object2).B(-0.15, 0.0, -0.15).s(d9, d10, d11);
            int n2 = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2).size();
            if (n2 == 0) {
                try {
                    for (int i = 0; i < arrayList4.size(); ++i) {
                        arrayList4.set(i, false);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
            }
            systemConfigurationOrchestrator.B(d8);
            systemConfigurationOrchestrator.A(d4);
        }
        n = 0;
        while (true) {
            block23: {
                block22: {
                    try {
                        try {
                            try {
                                if (n >= arrayList4.size()) break;
                                if (!((Boolean)arrayList4.get(n)).booleanValue()) break block22;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoStreamProcessor.a(customSystemException);
                            }
                            if (arrayList3.get(n).X()) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoStreamProcessor.a(customSystemException);
                        }
                        CryptoStreamProcessor.d(arrayList3.get(n), true);
                        break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoStreamProcessor.a(customSystemException);
                    }
                }
                try {
                    if (arrayList3.get(n).X()) {
                        CryptoStreamProcessor.d(arrayList3.get(n), false);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
            }
            ++n;
        }
    }

    private static double c(CryptographicTransformer cryptographicTransformer, ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        double d2;
        block6: {
            block5: {
                d2 = 0.2;
                try {
                    if (!cryptographicTransformer.H() || !cryptographicTransformer.j()) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoStreamProcessor.a(customSystemException);
                }
                d2 = 0.06;
                break block6;
            }
            try {
                if (!cryptographicTransformer.o() || !connectionPoolOrchestrator1192.equals(ApplicationLifecycleManager.N().s())) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoStreamProcessor.a(customSystemException);
            }
            d2 = 0.3;
        }
        if (!cryptographicTransformer.j()) {
            d2 *= 0.02;
        }
        return d2;
    }

    public static void D() {
        CryptoStreamProcessor.g(true);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoStreamProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoStreamProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

