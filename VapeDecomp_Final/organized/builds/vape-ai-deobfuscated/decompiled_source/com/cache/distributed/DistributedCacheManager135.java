/*
 * Decompiled with CFR 0.152.
 */
package com.cache.distributed;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
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
public class DistributedCacheManager135
extends CryptoProtocolEngine {
    private static final Integer[] d;
    private ReflectionUtilityService w;
    private ReflectionUtilityService M;
    public HK Q;
    private static final long[] c;
    private ReflectionUtilityService p;
    private ReflectionUtilityService v;
    private ReflectionUtilityService E;
    private static int[] Y;
    private final HK i;
    private static final long a;
    private ReflectionUtilityService P;
    private static final Map e;
    public HK n;
    public HK Z;
    private static final String[] g;
    public HK R;
    private ReflectionUtilityService b;
    private ReflectionUtilityService t;
    private static final Object[] f;

    static double l(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.l(object);
    }

    private Object Q(Object object) {
        return this.P.Z(object);
    }

    static Object c(DistributedCacheManager135 distributedCacheManager135) {
        return distributedCacheManager135.Y();
    }

    public static int[] s() {
        return Y;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedCacheManager135.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedCacheManager135.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object g(DistributedCacheManager135 distributedCacheManager135, Object object, Object object2) {
        return distributedCacheManager135.W(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedCacheManager135.a = MultiContainerRegistry.a(598616801995398304L, 6409564608263848735L, MethodHandles.lookup().lookupClass()).a(74619103916763L);
                DistributedCacheManager135.f = new Object[14];
                DistributedCacheManager135.g = new String[14];
                DistributedCacheManager135.a();
                DistributedCacheManager135.e = new HashMap<K, V>(13);
                var0 = DistributedCacheManager135.a ^ 137402113091781L;
                DistributedCacheManager135.n(null);
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "\u001b9\u00059aZ\u00dd\u00d9S\u0080\u00e8y\u0088\u0086WO\u00c9\u008f\u001cF\u00bbs\u00fc\u00d1\u00d0M\u0096\u00c1\u0082F.k\u0011\u0099z5\u00b2\u00cf]\u00d1\u00c1\u00aa\u0000MM\u00ee\u0004S}b\u001b\u0016\u001d\u0015\u00f0p\u00ff\u00a9\u009dc\u00db\u0082Ip\u0090\u009a}\u00cd\u009e@\u0016\u00fe\u00fb\u0087\u00e8\u00ac\u0002a\u00ddr\u0007\u0082\u00bf\u0093\u0082\u00d4\u00a2\u00d7^\u0089\u00e0pEs\u00ba\u00ba?\u0094\u00fd\u00b4\u0086q4\u000e\u00f5\u00d4q\u00a7A\u0001n\u00cfX\u008b\u00fa?Kk\u0094\u00c4";
                var7_6 = "\u001b9\u00059aZ\u00dd\u00d9S\u0080\u00e8y\u0088\u0086WO\u00c9\u008f\u001cF\u00bbs\u00fc\u00d1\u00d0M\u0096\u00c1\u0082F.k\u0011\u0099z5\u00b2\u00cf]\u00d1\u00c1\u00aa\u0000MM\u00ee\u0004S}b\u001b\u0016\u001d\u0015\u00f0p\u00ff\u00a9\u009dc\u00db\u0082Ip\u0090\u009a}\u00cd\u009e@\u0016\u00fe\u00fb\u0087\u00e8\u00ac\u0002a\u00ddr\u0007\u0082\u00bf\u0093\u0082\u00d4\u00a2\u00d7^\u0089\u00e0pEs\u00ba\u00ba?\u0094\u00fd\u00b4\u0086q4\u000e\u00f5\u00d4q\u00a7A\u0001n\u00cfX\u008b\u00fa?Kk\u0094\u00c4".length();
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
                    var6_5 = "\u0005\u00e7\u00a7\u001c-\u0087\b\u00b6E\u00a2\u00db\u0007\u00b0<&\u001d";
                    var7_6 = "\u0005\u00e7\u00a7\u001c-\u0087\b\u00b6E\u00a2\u00db\u0007\u00b0<&\u001d".length();
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
        DistributedCacheManager135.c = var8_3;
        DistributedCacheManager135.d = new Integer[17];
    }

    static float p(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.n(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == '\u00cb' || c == 'b' || c == '\u00cd') {
                field = DistributedCacheManager135.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedCacheManager135.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object N(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.Q(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 21;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 39;
                break;
            }
            case 11: {
                n3 = 36;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 45;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 59;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 18;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 16;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 55;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 58;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 50;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 25;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 62;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 7;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 27;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 19;
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
        DistributedCacheManager135.g[n4] = new String(cArray);
        return n4;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x42A2;
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
                throw new RuntimeException("a/qB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedCacheManager135.d[n2] = n3;
        }
        return d[n2];
    }

    static double b(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.D(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedCacheManager135.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void n(int[] nArray) {
        Y = nArray;
    }

    private double D(Object object) {
        return this.b.C(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private float n(Object object) {
        return this.E.x(object);
    }

    private static Field g(long l, long l2) {
        int n = DistributedCacheManager135.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedCacheManager135.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedCacheManager135.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedCacheManager135.c(clazz3, string2, clazz2)) != null) {
                    DistributedCacheManager135.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedCacheManager135.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedCacheManager135.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedCacheManager135.f(687625753267331L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0007\"\u0007B";
        objectArray[1] = "2O8P\u0012x9@)\u001fo`*G V";
        objectArray[2] = Boolean.TYPE;
        DistributedCacheManager135.g[2] = "java/lang/Boolean";
        objectArray[3] = "p\u0013_dE\u0014{\u001cN+(\u0014{\u0001Z";
        objectArray[4] = "(H&&g<]h-)vs0h-4bf";
        objectArray[5] = ":,yG";
        objectArray[6] = "RO\u0018";
        objectArray[7] = Integer.TYPE;
        DistributedCacheManager135.g[7] = "java/lang/Integer";
        objectArray[8] = "\u001cXKK";
        objectArray[9] = "pRB\u001b)\u001d{]STH\u0013pVW\u000e";
        objectArray[10] = "z\u001a\u001a\u0002~$yH_8GZ-J\u001eBy6d\u0017]R\u0000cj\u001fK\u0004y:s\u001b[8:?*\u0016J\u0002p&,J!\u0003l;w\b\u001aVo4+q\u001a^;1y\u0013\u0018\u0000|e\u0014";
        objectArray[11] = "\r\u0018;\u001b\u0019\b\u000eJ~!<vZH?[\u001e\u001a\u0013\u0015|KgO\u001d\u001dj\u001d\u001e\u0016\u0004\u0019z!]\u0013]\u0014k\u001b\u0017\n[H\u0000\u001fZ\b\u0007Oz\u001cWG\u000es";
        objectArray[12] = "3 T\u001a1\u00110r\u0011 \u0002odpPZ6\u0003--\u0013JOV#%\u0005\u001c6\u000f:!\u0015 u\nc,\u0004\u001a?\u0013epo\u001er\u00119w\u0015\u001d\u007f^0K";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u0002J\r\u0013eMNX\u0012J\u0014\u0019E*N\u001cnJLV\u0002Yy\u0014>\u0013H\u001cn\u000bRZ\u0015_~r";
    }

    private Object w(Object object) {
        return this.M.Z(object);
    }

    static double Q(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.S(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedCacheManager135.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedCacheManager135.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private double l(Object object) {
        return this.w.C(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static float f(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.o(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DistributedCacheManager135.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedCacheManager135.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = DistributedCacheManager135.e(l, l2);
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
                clazz3 = DistributedCacheManager135.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedCacheManager135.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedCacheManager135.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedCacheManager135.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedCacheManager135.f(687625753267331L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedCacheManager135.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedCacheManager135.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedCacheManager135.f(687625753267331L, 0L);
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

    /*
     * Unable to fully structure code
     */
    public DistributedCacheManager135() {
        block53: {
            block52: {
                block51: {
                    block48: {
                        block49: {
                            block46: {
                                block47: {
                                    block42: {
                                        block43: {
                                            block44: {
                                                var1_1 = DistributedCacheManager135.a ^ 86530606480897L;
                                                v0 = DistributedCacheManager135.s();
                                                super(ReflectionMetadataResolver.Yj);
                                                var3_2 = v0;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v1 = GameVersionEnumerator.MC_1_21_0.H();
                                                                if (var3_2 != null) break block42;
                                                                if (v1 == 0) break block43;
                                                            }
                                                            catch (CustomSystemException v2) {
                                                                throw DistributedCacheManager135.a(v2);
                                                            }
                                                            v3 = GameVersionEnumerator.MC_1_21_4.H();
                                                            if (var3_2 != null) break block44;
                                                        }
                                                        catch (CustomSystemException v4) {
                                                            throw DistributedCacheManager135.a(v4);
                                                        }
                                                        if (v3) {
                                                        }
                                                        ** GOTO lbl46
                                                    }
                                                    catch (CustomSystemException v5) {
                                                        throw DistributedCacheManager135.a(v5);
                                                    }
                                                    v3 = GameVersionEnumerator.MC_1_21_10.H();
                                                }
                                                catch (CustomSystemException v6) {
                                                    throw DistributedCacheManager135.a(v6);
                                                }
                                            }
                                            try {
                                                try {
                                                    block45: {
                                                        try {
                                                            if (!v3) break block45;
                                                            this.Q = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)1507, (long)(5899559169154453089L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.S, Double.TYPE, Double.TYPE, Double.TYPE}, (long)-3950810469766247299L, (long)var1_1);
                                                            if (var3_2 == null) break block43;
                                                        }
                                                        catch (CustomSystemException v7) {
                                                            throw DistributedCacheManager135.a(v7);
                                                        }
                                                    }
                                                    this.n = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)19178, (long)(5003929476110467428L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE, ReflectionMetadataResolver.Eg}, (long)-3950810469766247299L, (long)var1_1);
                                                    this.R = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)28639, (long)(4436099775448376411L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.UO, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE, ReflectionMetadataResolver.Eg}, (long)-3950810469766247299L, (long)var1_1);
                                                    if (var3_2 == null) break block43;
                                                }
                                                catch (CustomSystemException v8) {
                                                    throw DistributedCacheManager135.a(v8);
                                                }
lbl46:
                                                // 2 sources

                                                this.n = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)400, (long)(1002190306665662987L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE}, (long)-3950810469766247299L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v9) {
                                                throw DistributedCacheManager135.a(v9);
                                            }
                                        }
                                        v1 = GeometryCalculator.C();
                                    }
                                    try {
                                        try {
                                            v10 = 13;
                                            if (var3_2 != null) break block46;
                                            if (v1 != v10) break block47;
                                        }
                                        catch (CustomSystemException v11) {
                                            throw DistributedCacheManager135.a(v11);
                                        }
                                        this.v = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)19342, (long)(8642856552393654275L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Yj, (long)-3951246534658887494L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v12) {
                                        throw DistributedCacheManager135.a(v12);
                                    }
                                }
                                v1 = GeometryCalculator.C();
                                v10 = 15;
                            }
                            try {
                                block50: {
                                    try {
                                        try {
                                            try {
                                                if (var3_2 != null) break block48;
                                                if (v1 != v10) break block49;
                                            }
                                            catch (CustomSystemException v13) {
                                                throw DistributedCacheManager135.a(v13);
                                            }
                                            if (!TemporalMetadataResolver.h.d()) break block50;
                                        }
                                        catch (CustomSystemException v14) {
                                            throw DistributedCacheManager135.a(v14);
                                        }
                                        this.Z = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)9747, (long)(7604926709562584464L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, (long)-3950810469766247299L, (long)var1_1);
                                        if (var3_2 == null) break block49;
                                    }
                                    catch (CustomSystemException v15) {
                                        throw DistributedCacheManager135.a(v15);
                                    }
                                }
                                this.Z = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)31305, (long)(264710471993749952L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, (long)-3950810469766247299L, (long)var1_1);
                            }
                            catch (CustomSystemException v16) {
                                throw DistributedCacheManager135.a(v16);
                            }
                        }
                        try {
                            v1 = GeometryCalculator.C();
                            if (var3_2 != null) break block51;
                            v10 = 35;
                        }
                        catch (CustomSystemException v17) {
                            throw DistributedCacheManager135.a(v17);
                        }
                    }
                    try {
                        try {
                            if (v1 >= v10) {
                                this.P = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)31599, (long)(5560813114728837353L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bf, (long)-3950868320402338883L, (long)var1_1);
                                this.i = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)15057, (long)(2400469275752608084L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Eg, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-3950810469766247299L, (long)var1_1);
                                if (var3_2 != null) break block52;
                            }
                            ** GOTO lbl126
                        }
                        catch (CustomSystemException v18) {
                            throw DistributedCacheManager135.a(v18);
                        }
                        v1 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                    }
                    catch (CustomSystemException v19) {
                        throw DistributedCacheManager135.a(v19);
                    }
                }
                try {
                    if (v1 == 0) break block53;
                    this.M = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)31534, (long)(758868886143430830L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.r0, (long)-3950868320402338883L, (long)var1_1);
                    this.Z = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)10599, (long)(5114410020887929581L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE}, (long)-3950810469766247299L, (long)var1_1);
                }
                catch (CustomSystemException v20) {
                    throw DistributedCacheManager135.a(v20);
                }
            }
            try {
                if (var3_2 == null) break block53;
lbl126:
                // 2 sources

                this.E = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)29488, (long)(559173806425012411L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Float.TYPE, (long)-3950868320402338883L, (long)var1_1);
                this.t = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)2408, (long)(8829907363044033257L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Float.TYPE, (long)-3950868320402338883L, (long)var1_1);
                this.b = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)9946, (long)(653483574931205461L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3950868320402338883L, (long)var1_1);
                this.p = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)25719, (long)(2523150312283336699L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3950868320402338883L, (long)var1_1);
                this.w = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)13597, (long)(2489569326381219477L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, Double.TYPE, (long)-3950868320402338883L, (long)var1_1);
                this.i = DistributedCacheManager135.c("\u00d1", (Object)this, (Object)DistributedCacheManager135.c("\u00c8", (int)DistributedCacheManager135.b("g", (int)14782, (long)(5885998501100565049L ^ var1_1)), (long)-3951283449917155906L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Eg, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-3950810469766247299L, (long)var1_1);
            }
            catch (CustomSystemException v21) {
                throw DistributedCacheManager135.a(v21);
            }
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                DistributedCacheManager135.n(new int[5]);
            }
        }
        catch (CustomSystemException v22) {
            throw DistributedCacheManager135.a(v22);
        }
    }

    private Object W(Object object, Object object2) {
        return this.i.T(object, object2);
    }

    private double S(Object object) {
        return this.p.C(object);
    }

    private float o(Object object) {
        return this.t.x(object);
    }

    static Object f(DistributedCacheManager135 distributedCacheManager135, Object object) {
        return distributedCacheManager135.w(object);
    }

    private Object Y() {
        return this.v.Z(null);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedCacheManager135.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedCacheManager135.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DistributedCacheManager135.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

