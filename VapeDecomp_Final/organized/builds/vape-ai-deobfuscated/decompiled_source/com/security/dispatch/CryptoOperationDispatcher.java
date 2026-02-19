/*
 * Decompiled with CFR 0.152.
 */
package com.security.dispatch;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.state.management.StatefulEventToggle;
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

public class CryptoOperationDispatcher
extends CryptoProtocolEngine {
    private static final String[] f;
    private final HK j;
    private static final Map d;
    private static final long a;
    private static final Integer[] c;
    private final HK J;
    private HK v;
    private final HK I;
    private static final Object[] e;
    private HK T;
    private static final long[] b;
    private HK L;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoOperationDispatcher.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoOperationDispatcher.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int V(Object object) {
        return this.v.R(object, new Object[0]);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == 'y' || c == '\u00e5' || c == '\u00d1') {
                field = CryptoOperationDispatcher.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoOperationDispatcher.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoOperationDispatcher.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoOperationDispatcher.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public int z(Object object) {
        return this.T.R(object, new Object[0]);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoOperationDispatcher.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoOperationDispatcher.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoOperationDispatcher.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Object q(double d2, double d3, double d4) {
        return this.J.T(null, d2, d3, d4);
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
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 27;
                break;
            }
            case 2: {
                n3 = 59;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 50;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 45;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 28;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 23;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 14;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 58;
                break;
            }
            case 24: {
                n3 = 20;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 21;
                break;
            }
            case 27: {
                n3 = 9;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 29;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 39;
                break;
            }
            case 32: {
                n3 = 47;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 36;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 53;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 5;
                break;
            }
            case 41: {
                n3 = 19;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 31;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 13;
                break;
            }
            case 51: {
                n3 = 4;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 41;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 61;
                break;
            }
            case 56: {
                n3 = 62;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 35;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 6;
                break;
            }
            default: {
                n3 = 17;
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
        CryptoOperationDispatcher.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoOperationDispatcher.a = MultiContainerRegistry.a(-1561119335101649735L, 7612813252269442400L, MethodHandles.lookup().lookupClass()).a(53757898413984L);
                CryptoOperationDispatcher.e = new Object[10];
                CryptoOperationDispatcher.f = new String[10];
                CryptoOperationDispatcher.a();
                CryptoOperationDispatcher.d = new HashMap<K, V>(13);
                var0 = CryptoOperationDispatcher.a ^ 129094193740236L;
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
                var6_5 = "m\u00c5^%{r\u0082\u008d\u00d4Y\u00af\u00fb\u00d1\u00d8\u001e0\u00c4\u00c7K\u00cc\u008f;\u00e2\u0007\u0097\n\u00e6\u00cd09u\u0099\u001dY\u0081\u0005!\u00cc\u008e\u00ea\u000e\u00e6Tsp\u00e6\u007f\u00e9?\u00d4 9\u0086\u009e P";
                var7_6 = "m\u00c5^%{r\u0082\u008d\u00d4Y\u00af\u00fb\u00d1\u00d8\u001e0\u00c4\u00c7K\u00cc\u008f;\u00e2\u0007\u0097\n\u00e6\u00cd09u\u0099\u001dY\u0081\u0005!\u00cc\u008e\u00ea\u000e\u00e6Tsp\u00e6\u007f\u00e9?\u00d4 9\u0086\u009e P".length();
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
                    var6_5 = "\u00ff\u00df\u00f1\u00e5<\u0099\u00e1\u00af\u00edzn\u00b2\u0098N\u0087Y";
                    var7_6 = "\u00ff\u00df\u00f1\u00e5<\u0099\u00e1\u00af\u00edzn\u00b2\u0098N\u0087Y".length();
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
        CryptoOperationDispatcher.b = var8_3;
        CryptoOperationDispatcher.c = new Integer[9];
    }

    private static Method h(long l, long l2) {
        int n = CryptoOperationDispatcher.e(l, l2);
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
                clazz3 = CryptoOperationDispatcher.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoOperationDispatcher.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoOperationDispatcher.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoOperationDispatcher.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoOperationDispatcher.f(536203442091712L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoOperationDispatcher.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoOperationDispatcher.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoOperationDispatcher.f(536203442091712L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0014XU";
        objectArray[1] = Integer.TYPE;
        CryptoOperationDispatcher.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0007Je^\u0013g\fEt\u0011n\u007f\u001fB}X";
        objectArray[3] = "s\tz_";
        objectArray[4] = "cMB\"ryhBSm\u001fyh_G";
        objectArray[5] = "x\"IFdt\r\u0002BIu;`\u0002BTa.";
        objectArray[6] = "N\u001e\u00109";
        objectArray[7] = "%Ba~iv.Mp1\bx%Ftk";
        objectArray[8] = "gIu1ZSf\u0011?C\u000bC\u0001\u0015),\u0002QxKx*\u000088J/!\u0006ZzR|,`";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "0\u0006Lit\u000eo\u0014F:\u0012U\nPCipQh\u0012[:}71X@qu[1\u0016Wz\u0012\foRB2~Wg\b\u0019\u0003.Kr\u000bHb#^s\u0010%";
    }

    private static Field g(long l, long l2) {
        int n = CryptoOperationDispatcher.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoOperationDispatcher.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoOperationDispatcher.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoOperationDispatcher.c(clazz3, string2, clazz2)) != null) {
                    CryptoOperationDispatcher.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoOperationDispatcher.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoOperationDispatcher.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoOperationDispatcher.f(536203442091712L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoOperationDispatcher.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public Object W(Object object) {
        return this.I.T(object, new Object[0]);
    }

    public int x(Object object) {
        return this.L.R(object, new Object[0]);
    }

    public Object U(Object object) {
        return this.j.T(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6761;
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
                throw new RuntimeException("a/P7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoOperationDispatcher.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public CryptoOperationDispatcher() {
        block5: {
            long l;
            block4: {
                l = a ^ 0x34E272F2C48FL;
                super(ReflectionMetadataResolver.rQ);
                this.J = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)17873, (long)(0x5E50C825C2CC2813L ^ l)), (long)-8457431373148710072L, (long)l), (Object)ReflectionMetadataResolver.rQ, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8457350692152156434L, (long)l))).L(true)).e(GameVersionEnumerator.MC_1_21_4.R(), (String)((Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)18943, (long)(0x62D3586B12D7A435L ^ l)), (long)-8457431373148710072L, (long)l)))).n(GameVersionEnumerator.MC_1_21_4.g(), ObjectLifecycleTracker.z)).M();
                this.j = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)20165, (long)(0x4645E8F619832301L ^ l)), (long)-8457431373148710072L, (long)l), (Object)ReflectionMetadataResolver.b1, (Object)new Class[0], (long)-8457350692152156434L, (long)l))).e(GameVersionEnumerator.MC_1_20_6.g(), (String)((Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)14879, (long)(0x2E39B8CCD654D7DEL ^ l)), (long)-8457431373148710072L, (long)l)))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).M();
                this.I = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)10352, (long)(0xFF8A0E71FCD45B6L ^ l)), (long)-8457431373148710072L, (long)l), (Object)ReflectionMetadataResolver.Yd, (Object)new Class[0], (long)-8457350692152156434L, (long)l))).e(GameVersionEnumerator.MC_1_20_6.g(), (String)((Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)22655, (long)(0x50719829A970B5BAL ^ l)), (long)-8457431373148710072L, (long)l)))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).M();
                String[] stringArray = N9.I();
                try {
                    try {
                        if (stringArray == null) break block4;
                        if (!GameVersionEnumerator.MC_1_21_4.H()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoOperationDispatcher.a(customSystemException);
                    }
                    this.L = ((StatefulEventToggle)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)11344, (long)(0x61C0F68E38E4C193L ^ l)), (long)-8457431373148710072L, (long)l), Integer.TYPE, (Object)new Class[0], (long)-8457350692152156434L, (long)l))).M();
                    this.T = ((StatefulEventToggle)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)3591, (long)(0x7815CD5E62CE63C0L ^ l)), (long)-8457431373148710072L, (long)l), Integer.TYPE, (Object)new Class[0], (long)-8457350692152156434L, (long)l))).M();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoOperationDispatcher.a(customSystemException);
                }
            }
            this.v = ((StatefulEventToggle)((Object)CryptoOperationDispatcher.c("G", (Object)this, (Object)CryptoOperationDispatcher.c("Z", (int)CryptoOperationDispatcher.b("m", (int)16305, (long)(0x59EA4C421F04D271L ^ l)), (long)-8457431373148710072L, (long)l), Integer.TYPE, (Object)new Class[0], (long)-8457350692152156434L, (long)l))).M();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoOperationDispatcher.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoOperationDispatcher.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

