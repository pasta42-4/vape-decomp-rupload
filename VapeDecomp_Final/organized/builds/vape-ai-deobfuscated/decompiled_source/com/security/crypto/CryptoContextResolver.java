/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.keyexchange.CryptoKeyExchangeManager;
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

public class CryptoContextResolver
extends CryptoProtocolEngine {
    private final HK c;
    private final HK a;
    private static final String[] i;
    private final HK E;
    private final ReflectionUtilityService d;
    private static final Integer[] f;
    private static final long[] e;
    private static final Object[] h;
    private static final Map g;
    private final HK N;
    private static final long b;

    static Object V(CryptoContextResolver cryptoContextResolver, Object object, String string) {
        return cryptoContextResolver.d(object, string);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoContextResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoContextResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private Map u(Object object) {
        return (Map)this.d.Z(object);
    }

    static Object c(CryptoContextResolver cryptoContextResolver, Object object, String string, int n) {
        return cryptoContextResolver.i(object, string, n);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoContextResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object d(Object object, String string) {
        return this.a.T(object, string);
    }

    private static Field g(long l, long l2) {
        int n = CryptoContextResolver.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoContextResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoContextResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoContextResolver.c(clazz3, string2, clazz2)) != null) {
                    CryptoContextResolver.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoContextResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoContextResolver.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoContextResolver.f(826932432425822L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static boolean q(CryptoContextResolver cryptoContextResolver, Object object, String string, int n) {
        return cryptoContextResolver.X(object, string, n);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xAB;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/mM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextResolver.f[n2] = n3;
        }
        return f[n2];
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "`\u007f?\u0001";
        objectArray[1] = "wmmK\u0014K|b|\u0004iSoeuM";
        objectArray[2] = Boolean.TYPE;
        CryptoContextResolver.i[2] = "java/lang/Boolean";
        objectArray[3] = "XM_.3dSBNa^dS_Z";
        objectArray[4] = "\u0006X>M\u0000dsx5B\u0011+\u001ex5_\u0005>";
        objectArray[5] = "J\u0016n\u0013";
        objectArray[6] = "\u00128\\";
        objectArray[7] = Integer.TYPE;
        CryptoContextResolver.i[7] = "java/lang/Integer";
        objectArray[8] = "[\u0016qp";
        objectArray[9] = "*mE{\u007fe_MNtn*2MNiz?";
        objectArray[10] = ".ij\u000b";
        objectArray[11] = "7/|\t/U< mFN[7+i\u001c";
        objectArray[12] = "LzmCNnY j{c_SbbJTaF!\u007f{\u001d?\\`lA[<_v\u0010AG&\u001dtz\u0007F'\\\u001f.\u0015\u0018-H'sD\u001d \"$a\u0000YoO%)E]_";
        objectArray[13] = "N)\u001cL3[[s\u001bt\u0002jQ1\u0013E)TDr\u000et`\n^3\u001dN&\t]%aN:\u0013\u001f'\u000b\b;\u0012^L\\\f<\u000bJ|\u000f\u00153U ";
        objectArray[14] = "\ta,\u001c|\tI/:\bG\fN^y\u000b:\u000eVa~\u0016w\\5/8\u0007v\u0017\u000b:{\u001aG";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "?9>\u0001Q\u0002*c99Y3 !1\bK\r5b,9\u0001P(c(SGQ)\"C\u0007U\u000f#6{Z\u0004\n.\\|WCT.g:I\u0000]Q";
    }

    private Object i(Object object, String string, int n) {
        block4: {
            try {
                try {
                    if (this.c != null && !GameVersionEnumerator.MC_1_21_6.H()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver.a(customSystemException);
            }
        }
        return this.c.T(object, string, n);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoContextResolver.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoContextResolver.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static short o(CryptoContextResolver cryptoContextResolver, Object object, String string) {
        return cryptoContextResolver.y(object, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoContextResolver.b = MultiContainerRegistry.a(4227619529783598223L, 7117108794348077570L, MethodHandles.lookup().lookupClass()).a(187768900956215L);
                CryptoContextResolver.h = new Object[16];
                CryptoContextResolver.i = new String[16];
                CryptoContextResolver.a();
                CryptoContextResolver.g = new HashMap<K, V>(13);
                var0 = CryptoContextResolver.b ^ 27741690501468L;
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
                var6_5 = "\u00e5\u00aa\u0082\u00c8f\u001c\u00ad%\u00f6\u00a2\u00cc\u0084\u001ap\u00c2\u008b\u001ef\u00b9\u00d4&\u00b8i\u0002\t\u00a2\u0084Sy0E\u000eW\u00ab,\u009a\u00de\u00fd\u0018\u0086\u00a4\u00fdL\u00c6\u00f6/\u0094\u00db\u00d6\u00c4|\u00ea_\u0000mL";
                var7_6 = "\u00e5\u00aa\u0082\u00c8f\u001c\u00ad%\u00f6\u00a2\u00cc\u0084\u001ap\u00c2\u008b\u001ef\u00b9\u00d4&\u00b8i\u0002\t\u00a2\u0084Sy0E\u000eW\u00ab,\u009a\u00de\u00fd\u0018\u0086\u00a4\u00fdL\u00c6\u00f6/\u0094\u00db\u00d6\u00c4|\u00ea_\u0000mL".length();
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
                    var6_5 = "\u00c7\u0099u\u00a2Y\u00b8\u000e\u0006\u00cc\u00e2\"\u00c7\u00b5\u00934\u00ac";
                    var7_6 = "\u00c7\u0099u\u00a2Y\u00b8\u000e\u0006\u00cc\u00e2\"\u00c7\u00b5\u00934\u00ac".length();
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
        CryptoContextResolver.e = var8_3;
        CryptoContextResolver.f = new Integer[9];
    }

    private boolean X(Object object, String string, int n) {
        if (this.N == null) {
            boolean bl;
            block6: {
                block5: {
                    Map map = this.u(object);
                    try {
                        try {
                            if (map == null || !map.containsKey(string)) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextResolver.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return this.N.V(object, string, n);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 31;
                break;
            }
            case 3: {
                n3 = 56;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 47;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 36;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 32;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 10;
                break;
            }
            case 40: {
                n3 = 19;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 41;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 6;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 62;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 37;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 35;
                break;
            }
            default: {
                n3 = 52;
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
        CryptoContextResolver.i[n4] = new String(cArray);
        return n4;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoContextResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00f5' || c == 's' || c == 'r') {
                field = CryptoContextResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoContextResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ec' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Method method = CryptoContextResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoContextResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public CryptoContextResolver() {
        long l = b ^ 0x50A634A85151L;
        super(ReflectionMetadataResolver.Ec);
        this.d = CryptoContextResolver.c("f", (Object)this, (Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)22727, (long)(0x234569580DD17CE0L ^ l)), (long)-6589393616987220342L, (long)l), (boolean)true, Map.class, (long)-6589552661894632273L, (long)l);
        this.E = CryptoContextResolver.c("f", (Object)this, (Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)23627, (long)(0x3DAB15D9CA1A786AL ^ l)), (long)-6589393616987220342L, (long)l), (boolean)true, Short.TYPE, (Object)new Class[]{String.class}, (long)-6589491067743154019L, (long)l);
        this.a = ((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoContextResolver.c("f", (Object)this, (Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)5575, (long)(0x2CAC7FAC4439B1EAL ^ l)), (long)-6589393616987220342L, (long)l), (Object)ReflectionMetadataResolver.EA, (Object)new Class[]{String.class}, (long)-6589438321508006841L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)24388, (long)(0x1427FF103EB5FB67L ^ l)), (long)-6589393616987220342L, (long)l)))).M();
        this.c = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoContextResolver.c("f", (Object)this, (Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)18363, (long)(0x7A2F39A2735A639BL ^ l)), (long)-6589393616987220342L, (long)l), (Object)ReflectionMetadataResolver.Yw, (Object)new Class[]{String.class, Integer.TYPE}, (long)-6589438321508006841L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)3362, (long)(0x3B1FBE5A7A35A900L ^ l)), (long)-6589393616987220342L, (long)l)))).g(GameVersionEnumerator.MC_1_21_6.R())).M();
        this.N = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)CryptoContextResolver.c("f", (Object)this, (Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)1118, (long)(0x3B7DC59BDA7A2078L ^ l)), (long)-6589393616987220342L, (long)l), Boolean.TYPE, (Object)new Class[]{String.class, Integer.TYPE}, (long)-6589438321508006841L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)22608, (long)(0x413B4AD195E8FC74L ^ l)), (long)-6589393616987220342L, (long)l)))).e(GameVersionEnumerator.MC_1_7_10.Q(), (String)((Object)CryptoContextResolver.c("\u00ec", (int)CryptoContextResolver.b("r", (int)9611, (long)(0x51E290695EF01AEL ^ l)), (long)-6589393616987220342L, (long)l)))).n(GameVersionEnumerator.MC_1_7_10.Q(), ObjectLifecycleTracker.z)).g(GameVersionEnumerator.MC_1_21_6.R())).M();
        boolean bl = CryptoKeyExchangeManager.Z();
        try {
            if (bl) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver.a(customSystemException);
        }
    }

    static Map A(CryptoContextResolver cryptoContextResolver, Object object) {
        return cryptoContextResolver.u(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = CryptoContextResolver.e(l, l2);
        Object object = h[n];
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
                clazz3 = CryptoContextResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoContextResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoContextResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoContextResolver.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoContextResolver.f(826932432425822L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoContextResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoContextResolver.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoContextResolver.f(826932432425822L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private short y(Object object, String string) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                return this.E.I(object, string, -1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver.a(customSystemException);
        }
        return this.E.I(object, string);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

