/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.reflection;

import a.Dv;
import a.N9;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.analytics.processing.AnalyticsDataProcessor;
import com.cluster.management.ClusterNodeRegistry;
import com.collections.management.MultiContainerRegistry;
import com.data.compression.CompressionUtility;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.system.config.AdaptiveConfigurationManager;
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
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ReflectionUtilityBroker
extends Dv {
    private static final Map e;
    private static final String[] h;
    private static final Object[] g;
    private static final long[] c;
    private static final Integer[] d;
    private static final long b;

    private static Method h(long l, long l2) {
        int n = ReflectionUtilityBroker.e(l, l2);
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
                clazz3 = ReflectionUtilityBroker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtilityBroker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtilityBroker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtilityBroker.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtilityBroker.f(269651318768041L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtilityBroker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtilityBroker.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtilityBroker.f(269651318768041L, 0L);
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

    public ReflectionUtilityBroker s(int n) {
        long l = b ^ 0x5B3CE3C60ADAL;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)8168, (long)(0x279027BAE0C584F2L ^ l)), (long)5635796013845938279L, (long)l))), n);
    }

    public static long U(ReflectionUtilityBroker reflectionUtilityBroker) {
        return ReflectionUtilityBroker.c(reflectionUtilityBroker.o(), reflectionUtilityBroker.q(), reflectionUtilityBroker.j());
    }

    public static long p(double d2, double d3, double d4) {
        return ReflectionUtilityBroker.c(AdaptiveComputationEngine.Q(d2), AdaptiveComputationEngine.Q(d3), AdaptiveComputationEngine.Q(d4));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionUtilityBroker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ReflectionUtilityBroker v(int n) {
        long l = b ^ 0x672B3CAF83D2L;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)28478, (long)(0xBEE7A2BFA38FD2EL ^ l)), (long)-4089723063662278289L, (long)l))), n);
    }

    public ReflectionUtilityBroker E() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.L(ReflectionUtilityBroker.U.u().Gy, this.H));
    }

    private static Field g(long l, long l2) {
        int n = ReflectionUtilityBroker.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtilityBroker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtilityBroker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtilityBroker.c(clazz3, string2, clazz2)) != null) {
                    ReflectionUtilityBroker.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtilityBroker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtilityBroker.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtilityBroker.f(269651318768041L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtilityBroker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtilityBroker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtilityBroker.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtilityBroker.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public ReflectionUtilityBroker H(int n) {
        long l = b ^ 0x6248C926433DL;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)21450, (long)(0x4C70ECA0E1B98134L ^ l)), (long)563345680118696320L, (long)l))), n);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String toString() {
        long l = b ^ 0x42F20F4FEDC8L;
        return this.o() + (String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)20193, (long)(0x105D2565655832ECL ^ l)), (long)-6258799157992986763L, (long)l)) + this.q() + (String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)5454, (long)(0x6B4BB2A76021E942L ^ l)), (long)-6258799157992986763L, (long)l)) + this.j();
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ReflectionUtilityBroker b(int n) {
        long l = b ^ 0x507806505DB5L;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)613, (long)(0xE66F6C9B63B4E11L ^ l)), (long)1826585516557981448L, (long)l))), n);
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0011\u0011;";
        objectArray[1] = Integer.TYPE;
        ReflectionUtilityBroker.h[1] = "java/lang/Integer";
        objectArray[2] = "}L\u0006\u000f\u0002\u0018vC\u0017@\u007f\u0000eD\u001e\t";
        objectArray[3] = "b3oFJfi<~\t+hb7zS";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ")6< \u0015Pq4(\u001f\u000fS\u0012.>{[N}5(md\u0011|*{aYF/+&\u001f";
    }

    public ReflectionUtilityBroker n() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.J(ReflectionUtilityBroker.U.u().Gy, this.H));
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x552D;
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
                throw new RuntimeException("a/DK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionUtilityBroker.d[n2] = n3;
        }
        return d[n2];
    }

    public static ReflectionUtilityBroker E(ContextualEventDispatcher contextualEventDispatcher) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return ReflectionUtilityBroker.t(AnalyticsDataProcessor.Q(contextualEventDispatcher.X()), AnalyticsDataProcessor.Q(contextualEventDispatcher.F()), AnalyticsDataProcessor.Q(contextualEventDispatcher.f()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtilityBroker.a(customSystemException);
        }
        return new ReflectionUtilityBroker(ReflectionUtilityBroker.U.u().Gy.w(contextualEventDispatcher.M()));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/DK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean equals(Object object) {
        block14: {
            boolean bl;
            block16: {
                block15: {
                    try {
                        if (object == this) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtilityBroker.a(customSystemException);
                    }
                    try {
                        if (object instanceof N9) {
                            return ((N9)object).C(this);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtilityBroker.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (!(object instanceof ReflectionUtilityBroker)) break block14;
                                    if (((ReflectionUtilityBroker)object).o() != this.o()) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectionUtilityBroker.a(customSystemException);
                                }
                                if (((ReflectionUtilityBroker)object).q() != this.q()) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionUtilityBroker.a(customSystemException);
                            }
                            if (((ReflectionUtilityBroker)object).j() != this.j()) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtilityBroker.a(customSystemException);
                        }
                        bl = true;
                        break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtilityBroker.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public CompressionUtility K() {
        return new CompressionUtility(this.o(), this.q(), this.j());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionUtilityBroker.b = MultiContainerRegistry.a(-6175845616737725125L, -388843473483316491L, MethodHandles.lookup().lookupClass()).a(256570871035320L);
                ReflectionUtilityBroker.g = new Object[5];
                ReflectionUtilityBroker.h = new String[5];
                ReflectionUtilityBroker.a();
                ReflectionUtilityBroker.e = new HashMap<K, V>(13);
                var0 = ReflectionUtilityBroker.b ^ 83707655911640L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u000fb\u0098l\u00b9%\u00bd\u00bd\u00ab\u00e1\u008b\r0\u00f1\u0095\u00f3K|8\u00d7\u00bbE\u0099/K\u0019\u00f2@\u00d0\u000e\u00fe\u00e2\u00ae\u00e9\u00eaR-\u00c8\u0094\u00bc\u00da\u00bb\u00e5 \u00dc\u000e\u009b/";
                var7_6 = "\u000fb\u0098l\u00b9%\u00bd\u00bd\u00ab\u00e1\u008b\r0\u00f1\u0095\u00f3K|8\u00d7\u00bbE\u0099/K\u0019\u00f2@\u00d0\u000e\u00fe\u00e2\u00ae\u00e9\u00eaR-\u00c8\u0094\u00bc\u00da\u00bb\u00e5 \u00dc\u000e\u009b/".length();
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
                    var6_5 = "u\u00f8\u00bb3\u0007]\u00e7\u00f6\u00fb\u000e'WT\u00bc\u009cw";
                    var7_6 = "u\u00f8\u00bb3\u0007]\u00e7\u00f6\u00fb\u000e'WT\u00bc\u009cw".length();
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
        ReflectionUtilityBroker.c = var8_3;
        ReflectionUtilityBroker.d = new Integer[8];
    }

    public ReflectionUtilityBroker A(int n) {
        long l = b ^ 0x115254E13626L;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)26507, (long)(0x633A360CA208C06BL ^ l)), (long)8271446703035301019L, (long)l))), n);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'y' || c == 'R' || c == 'T') {
                field = ReflectionUtilityBroker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtilityBroker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                n3 = 34;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 26;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 8: {
                n3 = 33;
                break;
            }
            case 9: {
                n3 = 57;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 5;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 43;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 38;
                break;
            }
            case 31: {
                n3 = 59;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 3;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 62;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 35;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 21;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 63;
                break;
            }
            case 52: {
                n3 = 14;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 18;
                break;
            }
            case 55: {
                n3 = 54;
                break;
            }
            case 56: {
                n3 = 12;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 31;
                break;
            }
            case 62: {
                n3 = 45;
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
        ReflectionUtilityBroker.h[n4] = new String(cArray);
        return n4;
    }

    public static ReflectionUtilityBroker Y(N9 n9) {
        return ReflectionUtilityBroker.t(n9.x(), n9.J(), n9.b());
    }

    public static ReflectionUtilityBroker L(double d2, double d3, double d4) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return ReflectionUtilityBroker.t(AnalyticsDataProcessor.Q(d2), AnalyticsDataProcessor.Q(d3), AnalyticsDataProcessor.Q(d4));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtilityBroker.a(customSystemException);
        }
        return new ReflectionUtilityBroker(ReflectionUtilityBroker.U.u().Gy.M(d2, d3, d4));
    }

    public ReflectionUtilityBroker V(int n) {
        long l = b ^ 0x117F672E6AF6L;
        return this.f(AdaptiveConfigurationManager.k((String)((Object)ReflectionUtilityBroker.b("r", (int)ReflectionUtilityBroker.a("o", (int)16739, (long)(0x67D556D5CB4CBA52L ^ l)), (long)3321990622666154059L, (long)l))), n);
    }

    public ReflectionUtilityBroker I(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        return this.f(adaptiveConfigurationManager, 1);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtilityBroker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public ReflectionUtilityBroker f(AdaptiveConfigurationManager adaptiveConfigurationManager, int n) {
        return new ReflectionUtilityBroker(ReflectionUtilityBroker.U.u().Gy.U(this.H, adaptiveConfigurationManager.M(), n));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/DK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int hashCode() {
        return Objects.hash(this.o(), this.q(), this.j());
    }

    public static ReflectionUtilityBroker t(int n, int n2, int n3) {
        return new ReflectionUtilityBroker(ReflectionUtilityBroker.U.u().Gy.M(n, n2, n3));
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtilityBroker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtilityBroker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public ReflectionUtilityBroker J() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.G(ReflectionUtilityBroker.U.u().Gy, this.H));
    }

    public ReflectionUtilityBroker b() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.F(ReflectionUtilityBroker.U.u().Gy, this.H));
    }

    public static long c(int n, int n2, int n3) {
        long l = 3241L;
        l = 3457689L * l + (long)n;
        l = 8734625L * l + (long)n2;
        l = 2873465L * l + (long)n3;
        return l;
    }

    public ReflectionUtilityBroker(Object object) {
        super(object);
    }

    public ReflectionUtilityBroker i() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.p(ReflectionUtilityBroker.U.u().Gy, this.H));
    }

    public ReflectionUtilityBroker Z() {
        return new ReflectionUtilityBroker(ClusterNodeRegistry.j(ReflectionUtilityBroker.U.u().Gy, this.H));
    }

    public ReflectionUtilityBroker L(int n, int n2, int n3) {
        return ReflectionUtilityBroker.t(this.o() + n, this.q() + n2, this.j() + n3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionUtilityBroker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ReflectionUtilityBroker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

