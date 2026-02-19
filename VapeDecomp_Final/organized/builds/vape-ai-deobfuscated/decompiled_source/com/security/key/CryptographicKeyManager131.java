/*
 * Decompiled with CFR 0.152.
 */
package com.security.key;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.crypto.signature.CryptoSignatureManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class CryptographicKeyManager131
extends CryptoProtocolEngine {
    private final HK D;
    private final HK z;
    private static final String[] g;
    private static final Map e;
    private final HK a;
    private static final Object[] f;
    private final HK W;
    private final HK R;
    private ReflectionUtilityService H;
    private final HK o;
    private static final Integer[] d;
    private final HK y;
    private static final long[] c;
    private static final long b;
    private final HK U;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicKeyManager131.b = MultiContainerRegistry.a(5173857581159922815L, -3665904227235053277L, MethodHandles.lookup().lookupClass()).a(104803268578300L);
                CryptographicKeyManager131.f = new Object[15];
                CryptographicKeyManager131.g = new String[15];
                CryptographicKeyManager131.a();
                CryptographicKeyManager131.e = new HashMap<K, V>(13);
                var0 = CryptographicKeyManager131.b ^ 91645016165453L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "A'\u00f2\u0003\u00a1\u009dKS\u00c2\u00eb/V\u0085\u000e\u00e5f\u001c\u000e\u00db\u008c\u00fb\u00ad\u00ec\t7\u00bd\u00b4p\u008e\u009e\u009by\u0015q\u00f7\u0080\u00ed\u00a6\u00fb\u0015|m\u0088\u00b1\u009dO\u001f@0\u0018\u00bcG\u00d3\u0084%\u00f2~\u00b6\u00b7\u00e8j\u00b2\u008a/\u0096]J\u00a4\u0011\u00dcG(\u00f2Wv\u00c3V\fFuB\u000e(j%U\u0090#\u00b2\u00c3\b\u00c4\u00d6z:\u008a\u00e5\u00d4aj\u00c7H\u00af\u001bL\u00c6\u008b%\u00ab\u008eI}\u0002#\u00fa}\u000f\u00a3=r\u00e4\u0083\u00b8g$\u00eb\u00e9\u00c4";
                var7_6 = "A'\u00f2\u0003\u00a1\u009dKS\u00c2\u00eb/V\u0085\u000e\u00e5f\u001c\u000e\u00db\u008c\u00fb\u00ad\u00ec\t7\u00bd\u00b4p\u008e\u009e\u009by\u0015q\u00f7\u0080\u00ed\u00a6\u00fb\u0015|m\u0088\u00b1\u009dO\u001f@0\u0018\u00bcG\u00d3\u0084%\u00f2~\u00b6\u00b7\u00e8j\u00b2\u008a/\u0096]J\u00a4\u0011\u00dcG(\u00f2Wv\u00c3V\fFuB\u000e(j%U\u0090#\u00b2\u00c3\b\u00c4\u00d6z:\u008a\u00e5\u00d4aj\u00c7H\u00af\u001bL\u00c6\u008b%\u00ab\u008eI}\u0002#\u00fa}\u000f\u00a3=r\u00e4\u0083\u00b8g$\u00eb\u00e9\u00c4".length();
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
                    var6_5 = "g\u008d\u00ba\u0091\u000fhDo \u008e\u00fb\u00b1\u00d1\u0012\u00aa\u00ff";
                    var7_6 = "g\u008d\u00ba\u0091\u000fhDo \u008e\u00fb\u00b1\u00d1\u0012\u00aa\u00ff".length();
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
        CryptographicKeyManager131.c = var8_3;
        CryptographicKeyManager131.d = new Integer[18];
    }

    private void p(Object object, int n, int n2, boolean bl) {
        try {
            if (this.a == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                this.a.l(object, n, n2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.a.l(object, n, n2, bl);
    }

    static void e(CryptographicKeyManager131 cryptographicKeyManager131, Object object) {
        cryptographicKeyManager131.f(object);
    }

    private void Z(Object object) {
        try {
            if (this.W == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.W.V(object);
    }

    private void f(Object object) {
        try {
            if (this.R == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.R.V(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicKeyManager131.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicKeyManager131.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = CryptographicKeyManager131.e(l, l2);
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
                clazz3 = CryptographicKeyManager131.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicKeyManager131.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicKeyManager131.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicKeyManager131.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicKeyManager131.f(767961682980192L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicKeyManager131.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicKeyManager131.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicKeyManager131.f(767961682980192L, 0L);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicKeyManager131.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicKeyManager131.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static int q(CryptographicKeyManager131 cryptographicKeyManager131, Object object) {
        return cryptographicKeyManager131.G(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x29F1;
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
                throw new RuntimeException("a/q3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicKeyManager131.d[n2] = n3;
        }
        return d[n2];
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static void S(CryptographicKeyManager131 cryptographicKeyManager131, Object object) {
        cryptographicKeyManager131.r(object);
    }

    private void k(Object object, boolean bl) {
        try {
            if (this.z == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.z.l(object, bl);
    }

    /*
     * Unable to fully structure code
     */
    public CryptographicKeyManager131() {
        block23: {
            block26: {
                block24: {
                    block21: {
                        block22: {
                            var1_1 = CryptographicKeyManager131.b ^ 2687662164229L;
                            v0 = CryptoSignatureManager.d();
                            super(ReflectionMetadataResolver.c);
                            var3_2 = v0;
                            try {
                                try {
                                    try {
                                        v1 = GameVersionEnumerator.MC_1_21_4.H();
                                        if (var3_2 == null) break block21;
                                        if (v1 == 0) break block22;
                                    }
                                    catch (CustomSystemException v2) {
                                        throw CryptographicKeyManager131.a(v2);
                                    }
                                    this.o = null;
                                    this.y = null;
                                    this.a = null;
                                    this.z = null;
                                    this.U = null;
                                    this.D = null;
                                    this.W = null;
                                    this.R = null;
                                    if (var3_2 != null) break block23;
                                }
                                catch (CustomSystemException v3) {
                                    throw CryptographicKeyManager131.a(v3);
                                }
                                AbstractComputationKernel.I(new String[1]);
                            }
                            catch (CustomSystemException v4) {
                                throw CryptographicKeyManager131.a(v4);
                            }
                        }
                        v1 = GeometryCalculator.C();
                    }
                    try {
                        try {
                            v5 = 35;
                            if (var3_2 == null) break block24;
                            if (v1 >= v5) {
                            }
                            ** GOTO lbl71
                        }
                        catch (CustomSystemException v6) {
                            throw CryptographicKeyManager131.a(v6);
                        }
                        v1 = GeometryCalculator.C();
                        v5 = 37;
                    }
                    catch (CustomSystemException v7) {
                        throw CryptographicKeyManager131.a(v7);
                    }
                }
                try {
                    block25: {
                        try {
                            if (v1 < v5) break block25;
                            this.o = CryptographicKeyManager131.c("z", (Object)this, (Object)ReflectionMetadataResolver.h, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)14538, (long)(2269453680305186725L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5291151267930065018L, (long)var1_1);
                            if (var3_2 != null) break block26;
                        }
                        catch (CustomSystemException v8) {
                            throw CryptographicKeyManager131.a(v8);
                        }
                    }
                    this.o = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)16337, (long)(2098475026170257595L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                }
                catch (CustomSystemException v9) {
                    throw CryptographicKeyManager131.a(v9);
                }
            }
            try {
                this.y = CryptographicKeyManager131.c("z", (Object)this, (Object)ReflectionMetadataResolver.FW, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)5339, (long)(5947813339235748790L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5291151267930065018L, (long)var1_1);
                this.a = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)31159, (long)(826345727851882192L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.z = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)30380, (long)(2508637738233129420L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.U = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)15310, (long)(6311687688828527786L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.D = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)29790, (long)(1329112181665426226L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.W = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)24804, (long)(6015366200943050644L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.R = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)7507, (long)(7684131056428220978L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                if (var3_2 != null) break block23;
lbl71:
                // 2 sources

                this.o = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)7731, (long)(2258522181827658065L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.y = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)15639, (long)(3711563225415197298L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.a = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)15331, (long)(1463196513775494280L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.z = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)11513, (long)(2644922159818093457L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.U = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)31071, (long)(2618883380324820526L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.D = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)1896, (long)(6642784708877555723L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.W = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)13833, (long)(735926402421926247L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.R = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)2797, (long)(805232269694309764L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
            }
            catch (CustomSystemException v10) {
                throw CryptographicKeyManager131.a(v10);
            }
        }
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                this.H = CryptographicKeyManager131.c("z", (Object)this, (Object)CryptographicKeyManager131.c("\u00fa", (int)CryptographicKeyManager131.b("n", (int)14028, (long)(2037893450913032618L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-5291036100954636891L, (long)var1_1);
            }
        }
        catch (CustomSystemException v11) {
            throw CryptographicKeyManager131.a(v11);
        }
    }

    private void r(Object object) {
        try {
            if (this.U == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.U.V(object);
    }

    private void r(Object object, int n, int n2) {
        try {
            if (this.y == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.y.l(object, n, n2);
    }

    static void a(CryptographicKeyManager131 cryptographicKeyManager131, Object object, int n) {
        cryptographicKeyManager131.i(object, n);
    }

    private int G(Object object) {
        return this.H.R(object);
    }

    private void A(Object object, int n, int n2) {
        try {
            if (this.a == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.a.l(object, n, n2);
    }

    static Object B(CryptographicKeyManager131 cryptographicKeyManager131, int n, int n2, boolean bl) {
        return cryptographicKeyManager131.p(n, n2, bl);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void y(CryptographicKeyManager131 cryptographicKeyManager131, Object object) {
        cryptographicKeyManager131.A(object);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "-8\\\u0003";
        objectArray[1] = "I|q*?QBs`eBIQti,";
        objectArray[2] = Boolean.TYPE;
        CryptographicKeyManager131.g[2] = "java/lang/Boolean";
        objectArray[3] = "w\u0011's;F|\u001e6<VF|\u0003\"";
        objectArray[4] = "o\u001cKLgz\u001a<@Cv5w<@^b ";
        objectArray[5] = "Nx4\u001b";
        objectArray[6] = "}\\\u001d\u001f\u000b\f\b|\u0016\u0010\u001aCe|\u0016\r\u000eV";
        objectArray[7] = "$\bc";
        objectArray[8] = Integer.TYPE;
        CryptographicKeyManager131.g[8] = "java/lang/Integer";
        objectArray[9] = "\u001cQ:,";
        objectArray[10] = "&/n!v2- \u007fn\u0017<&+{4";
        objectArray[11] = "Y'U>foY0Z\u0007DR\u0015qP:n4\u001eu\u0014\u0007:?[-Z~gi\u0000sk=oo\n-\u000f~x3\u0004KW8{ \u001c/\f{b5gwRxz9\u001c*\u000b}3R";
        objectArray[12] = "AWXK%hA@Wr\rUEW[\u001f&1\u0006@\u0007\u0011@'E\u0000[\u001f&,ADfK-i\u0019\n\u001f\u0016{2G;\\\u001e}8\u0019_\u001f\t!6\u007f\u0007Y\n2.\u001b\\\u001a\u0013'UC\u0002\u0019\u000b+.\u001e[\u001cB@";
        objectArray[13] = "\u000b\u001cU\u001d\u0017-\u000b\u000bZ$)\u0010GJP\u0019\u001fvLN\u0014$K}\t\u0016Z]\u0016+RHk\u001e\u001e-X\u0016\u000f]\tqVpUHBjM\u0015\u0006D\u001f`5";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "-7\u001cB.),m\u0011\u001eI'k\fN\u0018.wofMZv}\u0010~J\u001ft!vuN[I";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == 'H' || c == 'J' || c == 'g') {
                field = CryptographicKeyManager131.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicKeyManager131.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = CryptographicKeyManager131.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicKeyManager131.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicKeyManager131.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicKeyManager131.c(clazz3, string2, clazz2)) != null) {
                    CryptographicKeyManager131.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicKeyManager131.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicKeyManager131.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicKeyManager131.f(767961682980192L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicKeyManager131.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicKeyManager131.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void n(CryptographicKeyManager131 cryptographicKeyManager131, Object object, int n, int n2) {
        cryptographicKeyManager131.A(object, n, n2);
    }

    static void x(CryptographicKeyManager131 cryptographicKeyManager131, Object object, int n, int n2) {
        cryptographicKeyManager131.r(object, n, n2);
    }

    static void Q(CryptographicKeyManager131 cryptographicKeyManager131, Object object, boolean bl) {
        cryptographicKeyManager131.k(object, bl);
    }

    private void i(Object object, int n) {
        this.H.t(object, n);
    }

    private void A(Object object) {
        try {
            if (this.D == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        this.D.V(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicKeyManager131.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicKeyManager131.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void O(CryptographicKeyManager131 cryptographicKeyManager131, Object object) {
        cryptographicKeyManager131.Z(object);
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
                n3 = 31;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 63;
                break;
            }
            case 6: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 17;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 1;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 54;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 35;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 59;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 7;
                break;
            }
            case 31: {
                n3 = 4;
                break;
            }
            case 32: {
                n3 = 26;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 47;
                break;
            }
            case 35: {
                n3 = 18;
                break;
            }
            case 36: {
                n3 = 10;
                break;
            }
            case 37: {
                n3 = 60;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 53;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 30;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 48;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 61;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 11;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 0;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 46;
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
        CryptographicKeyManager131.g[n4] = new String(cArray);
        return n4;
    }

    static void v(CryptographicKeyManager131 cryptographicKeyManager131, Object object, int n, int n2, boolean bl) {
        cryptographicKeyManager131.p(object, n, n2, bl);
    }

    private Object p(int n, int n2, boolean bl) {
        try {
            if (this.o == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 37) {
                return this.o.A(n, n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.o.A(n, n2, bl, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager131.a(customSystemException);
        }
        return this.o.A(n, n2, bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicKeyManager131.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicKeyManager131.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

