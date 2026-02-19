/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.metadata;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.encryption.SecureDataEncryptionManager;
import com.state.management.StatefulEventToggle;
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

public class MetadataResolver
extends CryptoProtocolEngine {
    private HK U;
    private static final Map d;
    private static final long a;
    private static final String[] f;
    private static final long[] b;
    private HK H;
    private static final Integer[] c;
    private static final Object[] e;

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static String T(MetadataResolver metadataResolver, Object object) {
        return metadataResolver.b(object);
    }

    private static Field g(long l, long l2) {
        int n = MetadataResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = MetadataResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetadataResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetadataResolver.c(clazz3, string2, clazz2)) != null) {
                    MetadataResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetadataResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetadataResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetadataResolver.f(799902286305141L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method h(long l, long l2) {
        int n = MetadataResolver.e(l, l2);
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
                clazz3 = MetadataResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetadataResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetadataResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetadataResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetadataResolver.f(799902286305141L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetadataResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetadataResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetadataResolver.f(799902286305141L, 0L);
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

    static int V(MetadataResolver metadataResolver, Object object) {
        return metadataResolver.y(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = MetadataResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetadataResolver.d(classArray[i], string, clazz2);
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
                MetadataResolver.a = MultiContainerRegistry.a(5485740689926491761L, 1789349854474587866L, MethodHandles.lookup().lookupClass()).a(65507854413331L);
                MetadataResolver.e = new Object[16];
                MetadataResolver.f = new String[16];
                MetadataResolver.a();
                MetadataResolver.d = new HashMap<K, V>(13);
                var0 = MetadataResolver.a ^ 133947668000457L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u0003\u00d9\u009b=\u00f8F\u00a6\u00db\u0000\u00cf\u0018\u00163\u00c1\u00f7\u00aaL\u00eb\u0007\\\u008dt\u00d7\u00e7";
                var7_6 = "\u0003\u00d9\u009b=\u00f8F\u00a6\u00db\u0000\u00cf\u0018\u00163\u00c1\u00f7\u00aaL\u00eb\u0007\\\u008dt\u00d7\u00e7".length();
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
                    var6_5 = "\u007f#\u00f1\u00f0\u00a5#3\u0004\u009f%o\u000f*\u00c9o\u000e";
                    var7_6 = "\u007f#\u00f1\u00f0\u00a5#3\u0004\u009f%o\u000f*\u00c9o\u000e".length();
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
        MetadataResolver.b = var8_3;
        MetadataResolver.c = new Integer[5];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == '\u00d9' || c == 'g' || c == '\u00fe') {
                field = MetadataResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetadataResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'v' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 59;
                break;
            }
            case 2: {
                n3 = 35;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 13;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 9;
                break;
            }
            case 13: {
                n3 = 11;
                break;
            }
            case 14: {
                n3 = 39;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 29;
                break;
            }
            case 22: {
                n3 = 54;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 45;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 57;
                break;
            }
            case 27: {
                n3 = 7;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 30;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 4;
                break;
            }
            case 39: {
                n3 = 62;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 5;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 63;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 16;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 22;
                break;
            }
            case 61: {
                n3 = 55;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 58;
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
        MetadataResolver.f[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "rV.\u000b";
        objectArray[1] = "\u0002&D|,t\t)U3Ql\u001a.\\z";
        objectArray[2] = Boolean.TYPE;
        MetadataResolver.f[2] = "java/lang/Boolean";
        objectArray[3] = "Wv\u0007A+K\\y\u0016\u000eFK\\d\u0002";
        objectArray[4] = "&]\u0016\u0000!~S}\u001d\u000f01>}\u001d\u0012$$";
        objectArray[5] = "r&(k";
        objectArray[6] = "\rlM\u0014B@xLF\u001bS\u000f\u0015LF\u0006G\u001a";
        objectArray[7] = "2mU";
        objectArray[8] = Integer.TYPE;
        MetadataResolver.f[8] = "java/lang/Integer";
        objectArray[9] = "Zpd\u001b &/Po\u00141iBPo\t%|";
        objectArray[10] = "%Gwe";
        objectArray[11] = "[<('AZP39h T[8=2";
        objectArray[12] = "\u000ef\u001e\u0000LJG#\u0018gp:LlM_LGVyVg\u000eEU\"_ZTX[b&][[\u0005cB\u0000ET\\\u001d\u0018\u001b\b\u0002^pV\u001f]V5&DV^[S#K\u0006\u000e:";
        objectArray[13] = "+ls\u000e\rmb)ui;\u001d*{*Y\bywe%\u0000vda|s\u0012\u000b~tgKP\t}/nv\n\u0014so\u0017q\u0005\u0017-ns,\u001b\u0018t\u0010)7VNv}g3\u0003\u001a\u001d+uz\u0000\u0017{.z*Pv";
        objectArray[14] = "g)\u0016cgD3t\u0017g\u0019B!\u0011Tfc\u00181a\u000ebwBZh\u0018v!R'r\rm\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "\u000f>P\u0018\u0003\u0000F{V\u007f\u001apM4\u0003G\u0003\rW!\u0018\u007fB\u001cUu\u0016\u001b\u001f\u0002Z,hA\u0004O\f.\u0005\u000f\u0000\u001aXEW\u001f\u0012\u0019N*\u000b\u0000IO4";
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B01;
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
                throw new RuntimeException("a/Pp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataResolver.c[n2] = n3;
        }
        return c[n2];
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

    public MetadataResolver() {
        long l;
        block8: {
            block7: {
                String[] stringArray;
                block6: {
                    l = a ^ 0x599C9D5EB653L;
                    String[] stringArray2 = SecureDataEncryptionManager.x();
                    super(ReflectionMetadataResolver.Ey);
                    stringArray = stringArray2;
                    try {
                        try {
                            if (stringArray == null) break block6;
                            if (GeometryCalculator.C() < 50) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataResolver.a(customSystemException);
                        }
                        this.H = MetadataResolver.c("v", (Object)this, (Object)ReflectionMetadataResolver.tB, (Object)MetadataResolver.c("\u00f9", (int)MetadataResolver.b("j", (int)4127, (long)(0x20DCC6F9B7FFF2AFL ^ l)), (long)4157603699147911831L, (long)l), (boolean)true, String.class, (Object)new Class[0], (long)4157449122999793284L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataResolver.a(customSystemException);
                    }
                }
                try {
                    if (stringArray != null) break block8;
                    AbstractComputationKernel.I(new String[1]);
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataResolver.a(customSystemException);
                }
            }
            this.H = MetadataResolver.c("v", (Object)this, (Object)MetadataResolver.c("\u00f9", (int)MetadataResolver.b("j", (int)26550, (long)(0x5D48B0F42C0F0504L ^ l)), (long)4157603699147911831L, (long)l), (boolean)true, String.class, (Object)new Class[0], (long)4157484367946915210L, (long)l);
        }
        this.U = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)MetadataResolver.c("v", (Object)this, (Object)MetadataResolver.c("\u00f9", (int)MetadataResolver.b("j", (int)31408, (long)(0x1B2A2021A5BD9803L ^ l)), (long)4157603699147911831L, (long)l), Integer.TYPE, (Object)new Class[0], (long)4157537505409300921L, (long)l))).e(GameVersionEnumerator.MC_1_20_6.R(), (String)((Object)MetadataResolver.c("\u00f9", (int)MetadataResolver.b("j", (int)24215, (long)(0x16B771AD22783C26L ^ l)), (long)4157603699147911831L, (long)l)))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)MetadataResolver.c("\u00f9", (int)MetadataResolver.b("j", (int)30249, (long)(0x41FF1AAD44F9949DL ^ l)), (long)4157603699147911831L, (long)l)))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Vg)).M();
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetadataResolver.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                MetadataResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private int y(Object object) {
        return this.U.R(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetadataResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetadataResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private String b(Object object) {
        return (String)this.H.T(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetadataResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MetadataResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

