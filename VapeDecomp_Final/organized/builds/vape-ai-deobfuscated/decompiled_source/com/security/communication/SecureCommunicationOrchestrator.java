/*
 * Decompiled with CFR 0.152.
 */
package com.security.communication;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SecureCommunicationOrchestrator
extends CryptoProtocolEngine {
    private ReflectionUtilityService n;
    public ReflectionUtilityService V;
    private static final String[] g;
    public ReflectionUtilityService c;
    public ReflectionUtilityService Q;
    private static final Object[] f;
    public ReflectionUtilityService L;
    private static final Map e;
    private static final long a;
    private static final long[] b;
    private static final Integer[] d;
    public ReflectionUtilityService t;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureCommunicationOrchestrator.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureCommunicationOrchestrator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3FE1;
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
                throw new RuntimeException("a/mE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureCommunicationOrchestrator.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureCommunicationOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int U(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return (int)this.t.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureCommunicationOrchestrator.a(customSystemException);
        }
        return this.t.R(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureCommunicationOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == '\u00fb' || c == '\u00ef' || c == 'Y') {
                field = SecureCommunicationOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureCommunicationOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = SecureCommunicationOrchestrator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureCommunicationOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureCommunicationOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureCommunicationOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    SecureCommunicationOrchestrator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureCommunicationOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureCommunicationOrchestrator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureCommunicationOrchestrator.f(553159435150450L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureCommunicationOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureCommunicationOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "?+~";
        objectArray[1] = Integer.TYPE;
        SecureCommunicationOrchestrator.g[1] = "java/lang/Integer";
        objectArray[2] = "LF\u0010^|0GI\u0001\u0011\u0001(TN\bX";
        objectArray[3] = "C8\u0011\u000e";
        objectArray[4] = Boolean.TYPE;
        SecureCommunicationOrchestrator.g[4] = "java/lang/Boolean";
        objectArray[5] = "? 6$\u0018\u00054/'ku\u0005423";
        objectArray[6] = "DZVT";
        objectArray[7] = "\"\rT\u0011\u0003;)\u0002E^b5\"\tA\u0004";
        objectArray[8] = "fs\u0015:!!:*D2J\u001c\\,C8u>./\u001fm7Gfg\u001a(*\u007fd*\u0006-J{ftC82}?g\u0010Wv:cv\u001b,q#'py";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0013\rxM\u0001>\u0016\u000f$pW:wVp\u0002Z<FQ+\n\\AMU&OE3N\ts\r<";
    }

    public int M(Object object) {
        return this.n.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureCommunicationOrchestrator.a = MultiContainerRegistry.a(714909567902792793L, -2146398993236180114L, MethodHandles.lookup().lookupClass()).a(108887005586446L);
                SecureCommunicationOrchestrator.f = new Object[10];
                SecureCommunicationOrchestrator.g = new String[10];
                SecureCommunicationOrchestrator.a();
                SecureCommunicationOrchestrator.e = new HashMap<K, V>(13);
                var0 = SecureCommunicationOrchestrator.a ^ 73977885320900L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "knF\u009c\u00c2\u0092V\u0085\u00cf\u00f6\u00b4\u009fq3\u00d5\u0013\u0006?\u008b+_\u00f3\u0085\u008e\u00f9\u00f7\u00ad\u008c^}\u00dfj^oY{\u0091\u0086/.GcFb \u0015L\u0087\u00f8\u0003\u0082\u00ea\u00a7\u00f4\u008e\u00d4\u00a4S\u00e5\u00e1H\u0093\u00f7\u00ed\u008f\u00acW\u00aav\u007fR\u00d6\u00b8i\u0006\u00d2\u00d3\u00d9^$\u0082\u0082\u00e7\u0005\u0085V\u001df\u0084\u008dgY\u0006\u00ca\u0010\u00f9\u00f0\u001d\u0019\u00bd\u0019&\u0094\u00c3\u0018$\u00ecu\u001c\u00c6Xm\u0000\u009c\u00da=}\u00ff\u00ecp\u00c5\u00fd[\u00b5\u008b\u009d\u00c5x\u0098I\u0090>\u00d9\u00e5\u00b5^D\u0018\u00c9F\u0012\u0094 \f\u00dbjT\u00d3-,~`";
                var7_6 = "knF\u009c\u00c2\u0092V\u0085\u00cf\u00f6\u00b4\u009fq3\u00d5\u0013\u0006?\u008b+_\u00f3\u0085\u008e\u00f9\u00f7\u00ad\u008c^}\u00dfj^oY{\u0091\u0086/.GcFb \u0015L\u0087\u00f8\u0003\u0082\u00ea\u00a7\u00f4\u008e\u00d4\u00a4S\u00e5\u00e1H\u0093\u00f7\u00ed\u008f\u00acW\u00aav\u007fR\u00d6\u00b8i\u0006\u00d2\u00d3\u00d9^$\u0082\u0082\u00e7\u0005\u0085V\u001df\u0084\u008dgY\u0006\u00ca\u0010\u00f9\u00f0\u001d\u0019\u00bd\u0019&\u0094\u00c3\u0018$\u00ecu\u001c\u00c6Xm\u0000\u009c\u00da=}\u00ff\u00ecp\u00c5\u00fd[\u00b5\u008b\u009d\u00c5x\u0098I\u0090>\u00d9\u00e5\u00b5^D\u0018\u00c9F\u0012\u0094 \f\u00dbjT\u00d3-,~`".length();
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
                    var6_5 = "\u00be0y\r\u008d:\u0001M\u00e3\u0007N\u0080\u0084\u00f5\u00baM";
                    var7_6 = "\u00be0y\r\u008d:\u0001M\u00e3\u0007N\u0080\u0084\u00f5\u00baM".length();
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
        SecureCommunicationOrchestrator.b = var8_3;
        SecureCommunicationOrchestrator.d = new Integer[21];
    }

    public int n(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return (int)this.Q.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureCommunicationOrchestrator.a(customSystemException);
        }
        return this.Q.R(object);
    }

    public int z(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return (int)this.V.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureCommunicationOrchestrator.a(customSystemException);
        }
        return this.V.R(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = SecureCommunicationOrchestrator.e(l, l2);
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
                clazz3 = SecureCommunicationOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureCommunicationOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureCommunicationOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureCommunicationOrchestrator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureCommunicationOrchestrator.f(553159435150450L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureCommunicationOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureCommunicationOrchestrator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureCommunicationOrchestrator.f(553159435150450L, 0L);
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
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 20;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 22;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 19;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 9;
                break;
            }
            case 17: {
                n3 = 38;
                break;
            }
            case 18: {
                n3 = 12;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 44;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 51;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 7;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 50;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 29;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 35;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 60;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 58;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 3;
                break;
            }
            case 50: {
                n3 = 16;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 4;
                break;
            }
            case 54: {
                n3 = 62;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 61;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 34;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 59;
                break;
            }
            default: {
                n3 = 36;
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
        SecureCommunicationOrchestrator.g[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureCommunicationOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureCommunicationOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public SecureCommunicationOrchestrator() {
        block22: {
            block26: {
                block24: {
                    block23: {
                        block20: {
                            block21: {
                                var1_1 = SecureCommunicationOrchestrator.a ^ 27401580642622L;
                                v0 = InvocationContextResolver.u();
                                super(ReflectionMetadataResolver.bm);
                                var3_2 = v0;
                                try {
                                    try {
                                        try {
                                            v1 = GeometryCalculator.C();
                                            v2 = 13;
                                            if (var3_2 == 0) break block20;
                                            if (v1 != v2) break block21;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw SecureCommunicationOrchestrator.a(v3);
                                        }
                                        this.n = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)2552, (long)(6315529628460220257L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        this.Q = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)7881, (long)(2712226655364474966L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        this.t = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)9836, (long)(8220031194935415024L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        this.V = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)20333, (long)(6856390554587412985L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        this.L = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)6487, (long)(7630993454416818117L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        this.c = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)31661, (long)(7955410683918748974L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                        if (var3_2 != 0) break block22;
                                    }
                                    catch (CustomSystemException v4) {
                                        throw SecureCommunicationOrchestrator.a(v4);
                                    }
                                    AbstractComputationKernel.I(new String[1]);
                                }
                                catch (CustomSystemException v5) {
                                    throw SecureCommunicationOrchestrator.a(v5);
                                }
                            }
                            v1 = GeometryCalculator.C();
                            v2 = 35;
                        }
                        try {
                            try {
                                try {
                                    if (var3_2 == 0) break block23;
                                    if (v1 >= v2) {
                                    }
                                    ** GOTO lbl76
                                }
                                catch (CustomSystemException v6) {
                                    throw SecureCommunicationOrchestrator.a(v6);
                                }
                                this.n = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)22503, (long)(3482440820064199039L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                if (var3_2 == 0) break block24;
                            }
                            catch (CustomSystemException v7) {
                                throw SecureCommunicationOrchestrator.a(v7);
                            }
                            v1 = GeometryCalculator.C();
                            v2 = 37;
                        }
                        catch (CustomSystemException v8) {
                            throw SecureCommunicationOrchestrator.a(v8);
                        }
                    }
                    try {
                        block25: {
                            try {
                                if (v1 < v2) break block25;
                                this.Q = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)24387, (long)(9150535332069616094L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                this.t = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)31851, (long)(219701490743053048L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                this.V = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)16164, (long)(3184259489495468465L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
                                if (var3_2 != 0) break block26;
                            }
                            catch (CustomSystemException v9) {
                                throw SecureCommunicationOrchestrator.a(v9);
                            }
                        }
                        this.Q = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)870, (long)(2124839281131681254L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
                        this.t = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)13067, (long)(5461321157654398346L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
                    }
                    catch (CustomSystemException v10) {
                        throw SecureCommunicationOrchestrator.a(v10);
                    }
                }
                this.V = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)15130, (long)(4746696626028268929L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3931606403784875120L, (long)var1_1);
            }
            try {
                this.L = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)10171, (long)(4092961924896280892L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.c = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)8570, (long)(3029163475078371307L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
                if (var3_2 != 0) break block22;
lbl76:
                // 2 sources

                this.n = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)13685, (long)(2547099389900440559L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.Q = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)22175, (long)(3905987991394852873L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.t = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)13532, (long)(1231824773014110795L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.V = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)31575, (long)(1735818474290023879L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.L = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)4730, (long)(2587688210479506660L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
                this.c = SecureCommunicationOrchestrator.c("\u00fc", (Object)this, (Object)SecureCommunicationOrchestrator.c("a", (int)SecureCommunicationOrchestrator.b("d", (int)9325, (long)(512468451717731055L ^ var1_1)), (long)-3931511139105592408L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-3931606403784875120L, (long)var1_1);
            }
            catch (CustomSystemException v11) {
                throw SecureCommunicationOrchestrator.a(v11);
            }
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public byte J(Object object) {
        return (byte)this.L.R(object);
    }

    public byte z(Object object) {
        return (byte)this.c.R(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureCommunicationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureCommunicationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

