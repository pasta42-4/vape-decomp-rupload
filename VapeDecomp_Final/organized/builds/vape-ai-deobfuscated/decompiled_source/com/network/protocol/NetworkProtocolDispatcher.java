/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.fe;
import a.hQ;
import a.yK;
import com.app.io.stream.OutputStreamHandler;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.NetworkConnectionManager1945;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.SecurityTokenValidator2093;
import com.security.crypto.CryptographicKeyGenerator1474;
import com.system.configuration.AdaptiveConfigEngine;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.RuntimeResourceTracker;
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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NetworkProtocolDispatcher
extends CryptographicKeyGenerator1474 {
    private static final Integer[] fb;
    private static final long ab;
    private static final String[] rb;
    private static final Object[] qb;
    public static final List<LightweightExecutionContext> jj;
    private static final long[] eb;
    private static final Map lb;
    private fe jr;

    @Override
    public void i() {
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolDispatcher.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolDispatcher.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void E() {
        super.E();
        this.i(this.b());
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x425D;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wn", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolDispatcher.fb[n2] = n3;
        }
        return fb[n2];
    }

    @Override
    public double b() {
        return 110.0;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    static fe S(NetworkProtocolDispatcher networkProtocolDispatcher) {
        return networkProtocolDispatcher.jr;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolDispatcher.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolDispatcher.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method p(long l, long l2) {
        int n = NetworkProtocolDispatcher.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkProtocolDispatcher.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolDispatcher.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolDispatcher.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolDispatcher.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolDispatcher.n(277134569152244L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolDispatcher.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolDispatcher.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolDispatcher.n(277134569152244L, 0L);
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

    private static Field o(long l, long l2) {
        int n = NetworkProtocolDispatcher.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolDispatcher.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolDispatcher.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolDispatcher.g(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolDispatcher.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolDispatcher.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolDispatcher.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolDispatcher.n(277134569152244L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public NetworkProtocolDispatcher(fe fe2) {
        this.jr = fe2;
        this.Ol = false;
        this.d().m(false);
        this.d().i(false);
        this.d().v(false);
        this.N(true);
        this.I();
    }

    public List<LightweightExecutionContext> p() {
        ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
        for (LightweightExecutionContext lightweightExecutionContext : RuntimeResourceTracker.K()) {
            try {
                if (!lightweightExecutionContext.g().toLowerCase(Locale.ROOT).contains(this.jr.s().toLowerCase(Locale.ROOT))) continue;
                arrayList.add(lightweightExecutionContext);
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDispatcher.a(customSystemException);
            }
        }
        return arrayList;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 60;
                break;
            }
            case 4: {
                n3 = 2;
                break;
            }
            case 5: {
                n3 = 23;
                break;
            }
            case 6: {
                n3 = 62;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 28;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 48;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 57;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 33;
                break;
            }
            case 17: {
                n3 = 12;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 56;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 52;
                break;
            }
            case 24: {
                n3 = 54;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 47;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 53;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 17;
                break;
            }
            case 42: {
                n3 = 27;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 25;
                break;
            }
            case 45: {
                n3 = 20;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 61;
                break;
            }
            case 50: {
                n3 = 4;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 39;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 49;
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
        NetworkProtocolDispatcher.rb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == 'c' || c == '\u00d8' || c == 'w') {
                field = NetworkProtocolDispatcher.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolDispatcher.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double w() {
        return super.w();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkProtocolDispatcher.ab = MultiContainerRegistry.a(191739385918542179L, 4937381949490451872L, MethodHandles.lookup().lookupClass()).a(202405280887721L);
                NetworkProtocolDispatcher.qb = new Object[5];
                NetworkProtocolDispatcher.rb = new String[5];
                NetworkProtocolDispatcher.T();
                NetworkProtocolDispatcher.lb = new HashMap<K, V>(13);
                var0 = NetworkProtocolDispatcher.ab ^ 32668740846159L;
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
                var6_5 = "\u00f7'\u00f4\u00a4[\u00a1\u009a!\u00f9\u00ff\u0015\u0018v\u0093\u00db*!\u0080\u0095;\u009e\u0090\u00fa\u00af\u00e9#N<\u0001\u0097\u00d7C\u009f1\u0017\u0091\u00fbn\u00e8\u000e\u001b\u00cd\u00fa\u00a8\u00d6\u00a4\u00f8\u00e0";
                var7_6 = "\u00f7'\u00f4\u00a4[\u00a1\u009a!\u00f9\u00ff\u0015\u0018v\u0093\u00db*!\u0080\u0095;\u009e\u0090\u00fa\u00af\u00e9#N<\u0001\u0097\u00d7C\u009f1\u0017\u0091\u00fbn\u00e8\u000e\u001b\u00cd\u00fa\u00a8\u00d6\u00a4\u00f8\u00e0".length();
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
                    var6_5 = "\u0011n\u00ec\u008a\u00abU\u00fb\u0015xb\u0007\u009a\u00eec\u00e3K";
                    var7_6 = "\u0011n\u00ec\u008a\u00abU\u00fb\u0015xb\u0007\u009a\u00eec\u00e3K".length();
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
        NetworkProtocolDispatcher.eb = var8_3;
        NetworkProtocolDispatcher.fb = new Integer[8];
        NetworkProtocolDispatcher.jj = new ArrayList<LightweightExecutionContext>();
        NetworkProtocolDispatcher.P();
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolDispatcher.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolDispatcher.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void X() {
        long l = ab ^ 0x6D4A33E15369L;
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)27099, (long)(0x30F475E9A4693E28L ^ l)), (long)1561456565105875105L, (long)l), NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)18874, (long)(0x657238E9C7AC1E4AL ^ l)), (long)1561456565105875105L, (long)l), NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)6866, (long)(0xFDE24A6EE8ECD24L ^ l)), (long)1561456565105875105L, (long)l), NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)1703, (long)(0x1E5E896000E6D150L ^ l)), (long)1561456565105875105L, (long)l), NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)19362, (long)(0x2778CE696BCA1C53L ^ l)), (long)1561456565105875105L, (long)l)));
        for (Object e : ProtocolInteractionController.e().K()) {
            ObjectLifecycleTracker objectLifecycleTracker;
            Object object;
            if (GeometryCalculator.C() == 13) {
                object = ProtocolInteractionController.e().D(e);
            } else {
                objectLifecycleTracker = new NetworkConnectionManager1945(e);
                object = ProtocolInteractionController.e().D(objectLifecycleTracker.M());
            }
            if (!ReflectionMetadataResolver.VP.isInstance(object)) continue;
            objectLifecycleTracker = new ProtocolInteractionController(object);
            List list = new ArrayList();
            if (GeometryCalculator.C() >= 23) {
                list = (List)OutputStreamHandler.x().M();
            }
            ((ProtocolInteractionController)objectLifecycleTracker).l((ProtocolInteractionController)objectLifecycleTracker, list);
            block7: for (Object e2 : list) {
                LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(e2);
                try {
                    if (lightweightExecutionContext.C().O() == 62) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDispatcher.a(customSystemException);
                }
                String string = lightweightExecutionContext.g().toLowerCase(Locale.ROOT);
                try {
                    if (!string.contains((CharSequence)((Object)NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)16817, (long)(0x1F1BE8F4876E1643L ^ l)), (long)1561456565105875105L, (long)l)))) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDispatcher.a(customSystemException);
                }
                for (String string2 : arrayList) {
                    try {
                        if (!string.contains(string2)) continue;
                        jj.add(lightweightExecutionContext);
                        arrayList.remove(string2);
                        continue block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDispatcher.a(customSystemException);
                    }
                }
            }
        }
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "\u0013\u0002c";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolDispatcher.rb[1] = "java/lang/Integer";
        objectArray[2] = "uJ\u0016GYm~E\u0007\b$umB\u000eA";
        objectArray[3] = ":D]`\"/1KL/C!:@Hu";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\ncjp5<\u0004l+\u001d=<;`k\"7>[mlqV~Xs2,'#\u0003p2\u001d";
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void I() {
        List<LightweightExecutionContext> list;
        long l;
        block10: {
            block7: {
                l = ab ^ 0x4A230D7FD31DL;
                try {
                    this.k();
                    if (this.jr.s() == null || this.jr.s().length() <= 0) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDispatcher.a(customSystemException);
                }
                list = this.p();
                break block10;
            }
            list = jj;
        }
        for (int i = 0; i < list.size(); ++i) {
            Object object;
            Object[] objectArray;
            hQ hQ2;
            NetworkProtocolDispatcher networkProtocolDispatcher;
            block9: {
                block8: {
                    int n = i;
                    try {
                        try {
                            networkProtocolDispatcher = this;
                            hQ2 = new yK(NetworkProtocolDispatcher.M.g, NetworkProtocolDispatcher.M.S, list.get(i)).N(new SecurityTokenValidator2093(this, list, n));
                            Object[] objectArray2 = new Object[1];
                            Object[] objectArray3 = objectArray2;
                            objectArray = objectArray2;
                            int n2 = 0;
                            if (i <= 0 || (i + 1) % 9 != 0) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDispatcher.a(customSystemException);
                        }
                        object = NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)25896, (long)(0x4A1586FDFEA9B2A9L ^ l)), (long)-7647306711412713259L, (long)l);
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDispatcher.a(customSystemException);
                    }
                }
                object = "";
            }
            objectArray3[n2] = object;
            networkProtocolDispatcher.n(hQ2, objectArray);
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolDispatcher.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public String A() {
        long l = ab ^ 0x3E1E5B470552L;
        return NetworkProtocolDispatcher.e("\u00cc", (int)NetworkProtocolDispatcher.d("d", (int)25588, (long)(0xDA5C6295B30E23BL ^ l)), (long)4868456263793512090L, (long)l);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void u() {
    }

    private static void P() {
        block7: {
            block10: {
                block9: {
                    block8: {
                        block6: {
                            try {
                                if (!GameVersionEnumerator.MC_1_21_4.H()) break block6;
                                jj.add(new AdaptiveConfigEngine(869).J());
                                jj.add(new AdaptiveConfigEngine(871).J());
                                jj.add(new AdaptiveConfigEngine(872).J());
                                jj.add(new AdaptiveConfigEngine(832).J());
                                jj.add(new AdaptiveConfigEngine(1038).J());
                                jj.add(new AdaptiveConfigEngine(1042).J());
                                jj.add(new AdaptiveConfigEngine(945).J());
                                jj.add(new AdaptiveConfigEngine(960).J());
                                jj.add(new AdaptiveConfigEngine(980).J());
                                jj.add(new AdaptiveConfigEngine(915).J());
                                jj.add(new AdaptiveConfigEngine(916).J());
                                jj.add(new AdaptiveConfigEngine(880).J());
                                jj.add(new AdaptiveConfigEngine(662).J());
                                NetworkProtocolDispatcher.X();
                                jj.add(new AdaptiveConfigEngine(615).J());
                                jj.add(new AdaptiveConfigEngine(1).J());
                                break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDispatcher.a(customSystemException);
                            }
                        }
                        try {
                            if (GeometryCalculator.C() < 35) break block8;
                            jj.add(new AdaptiveConfigEngine(603).J());
                            jj.add(new AdaptiveConfigEngine(605).J());
                            jj.add(new AdaptiveConfigEngine(606).J());
                            jj.add(new AdaptiveConfigEngine(574).J());
                            jj.add(new AdaptiveConfigEngine(740).J());
                            jj.add(new AdaptiveConfigEngine(744).J());
                            jj.add(new AdaptiveConfigEngine(666).J());
                            jj.add(new AdaptiveConfigEngine(682).J());
                            jj.add(new AdaptiveConfigEngine(684).J());
                            jj.add(new AdaptiveConfigEngine(650).J());
                            jj.add(new AdaptiveConfigEngine(651).J());
                            jj.add(new AdaptiveConfigEngine(661).J());
                            jj.add(new AdaptiveConfigEngine(662).J());
                            NetworkProtocolDispatcher.X();
                            jj.add(new AdaptiveConfigEngine(615).J());
                            jj.add(new AdaptiveConfigEngine(1).J());
                            break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDispatcher.a(customSystemException);
                        }
                    }
                    try {
                        jj.add(new AdaptiveConfigEngine(276).J());
                        jj.add(new AdaptiveConfigEngine(278).J());
                        jj.add(new AdaptiveConfigEngine(279).J());
                        jj.add(new AdaptiveConfigEngine(261).J());
                        jj.add(new AdaptiveConfigEngine(364).J());
                        jj.add(new AdaptiveConfigEngine(368).J());
                        jj.add(new AdaptiveConfigEngine(332).J());
                        jj.add(new AdaptiveConfigEngine(344).J());
                        jj.add(new AdaptiveConfigEngine(346).J());
                        jj.add(new AdaptiveConfigEngine(322).J());
                        jj.add(new AdaptiveConfigEngine(322).T(1).J());
                        jj.add(new AdaptiveConfigEngine(326).J());
                        jj.add(new AdaptiveConfigEngine(327).J());
                        if (GeometryCalculator.C() < 23) break block9;
                        NetworkProtocolDispatcher.X();
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDispatcher.a(customSystemException);
                    }
                }
                jj.add(new AdaptiveConfigEngine(373).T(8259).J());
                jj.add(new AdaptiveConfigEngine(373).T(8258).J());
                jj.add(new AdaptiveConfigEngine(373).T(16421).J());
                jj.add(new AdaptiveConfigEngine(373).T(16388).J());
                jj.add(new AdaptiveConfigEngine(373).T(16449).J());
            }
            jj.add(new AdaptiveConfigEngine(282).J());
            jj.add(new AdaptiveConfigEngine(1).J());
        }
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolDispatcher.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolDispatcher.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolDispatcher.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

