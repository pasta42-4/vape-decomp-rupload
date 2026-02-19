/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.token;

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

public class CryptoTokenExchangeManager
extends CryptoProtocolEngine {
    private static final String[] g;
    private HK h;
    private static final long b;
    public HK a;
    private static final Integer[] d;
    private static final Object[] f;
    private static final long[] c;
    public HK M;
    private static final Map e;
    private ReflectionUtilityService I;
    private ReflectionUtilityService C;
    public HK Y;

    /*
     * Unable to fully structure code
     */
    public CryptoTokenExchangeManager() {
        block36: {
            block39: {
                block37: {
                    block30: {
                        block34: {
                            block32: {
                                block31: {
                                    var1_1 = CryptoTokenExchangeManager.b ^ 85548315963285L;
                                    v0 = DistributedCacheManager135.s();
                                    super(ReflectionMetadataResolver.Ee);
                                    var3_2 = v0;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v1 = GeometryCalculator.C();
                                                    if (var3_2 != null) break block30;
                                                    if (v1 > 13) {
                                                    }
                                                    ** GOTO lbl75
                                                }
                                                catch (CustomSystemException v2) {
                                                    throw CryptoTokenExchangeManager.a(v2);
                                                }
                                                v3 = GeometryCalculator.C();
                                                if (var3_2 != null) break block31;
                                            }
                                            catch (CustomSystemException v4) {
                                                throw CryptoTokenExchangeManager.a(v4);
                                            }
                                            if (v3 >= 35) {
                                            }
                                            ** GOTO lbl69
                                        }
                                        catch (CustomSystemException v5) {
                                            throw CryptoTokenExchangeManager.a(v5);
                                        }
                                        v3 = (int)GameVersionEnumerator.MC_1_21_10.H();
                                    }
                                    catch (CustomSystemException v6) {
                                        throw CryptoTokenExchangeManager.a(v6);
                                    }
                                }
                                try {
                                    block33: {
                                        try {
                                            try {
                                                if (var3_2 != null) break block32;
                                                if (v3 == 0) break block33;
                                            }
                                            catch (CustomSystemException v7) {
                                                throw CryptoTokenExchangeManager.a(v7);
                                            }
                                            this.a = null;
                                            if (var3_2 == null) break block34;
                                        }
                                        catch (CustomSystemException v8) {
                                            throw CryptoTokenExchangeManager.a(v8);
                                        }
                                    }
                                    v3 = (int)GameVersionEnumerator.MC_1_21_4.H();
                                }
                                catch (CustomSystemException v9) {
                                    throw CryptoTokenExchangeManager.a(v9);
                                }
                            }
                            try {
                                block35: {
                                    try {
                                        if (v3 == 0) break block35;
                                        this.a = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)ReflectionMetadataResolver.PZ, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)1889, (long)(6123946744135182808L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rC, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE}, (long)-4306727306965617628L, (long)var1_1);
                                        if (var3_2 == null) break block34;
                                    }
                                    catch (CustomSystemException v10) {
                                        throw CryptoTokenExchangeManager.a(v10);
                                    }
                                }
                                this.a = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)12380, (long)(6330446327604436712L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bj, Float.TYPE, Float.TYPE, ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ej, Integer.TYPE}, (long)-4306988524899490225L, (long)var1_1);
                            }
                            catch (CustomSystemException v11) {
                                throw CryptoTokenExchangeManager.a(v11);
                            }
                        }
                        try {
                            try {
                                try {
                                    this.C = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)ReflectionMetadataResolver.PZ, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)17188, (long)(5905761548653276572L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bV, (long)-4306696734215353373L, (long)var1_1);
                                    if (var3_2 == null) break block36;
lbl69:
                                    // 2 sources

                                    this.a = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)29614, (long)(8562001483896462623L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bj, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, (long)-4306988524899490225L, (long)var1_1);
                                    this.h = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)15599, (long)(6141253830670340701L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Eh, (Object)new Class[0], (long)-4306988524899490225L, (long)var1_1);
                                    if (var3_2 == null) break block36;
                                }
                                catch (CustomSystemException v12) {
                                    throw CryptoTokenExchangeManager.a(v12);
                                }
lbl75:
                                // 2 sources

                                this.a = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)13727, (long)(879401867149663023L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bj, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, (long)-4306988524899490225L, (long)var1_1);
                                v13 = this;
                                v14 = this;
                                v15 = CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)30037, (long)(2491062967567621094L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1);
                                v16 = true;
                                v17 = ReflectionMetadataResolver.V;
                                if (var3_2 != null) break block37;
                            }
                            catch (CustomSystemException v18) {
                                throw CryptoTokenExchangeManager.a(v18);
                            }
                            v13.I = CryptoTokenExchangeManager.c("\u00cc", (Object)v14, (Object)v15, (boolean)v16, (Object)v17, (long)-4306831859055782010L, (long)var1_1);
                            v1 = (int)ObjectLifecycleTracker.z;
                        }
                        catch (CustomSystemException v19) {
                            throw CryptoTokenExchangeManager.a(v19);
                        }
                    }
                    try {
                        block38: {
                            try {
                                if (v1 == 0) break block38;
                                this.M = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)20081, (long)(1130427078778069191L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, Float.TYPE}, (long)-4306988524899490225L, (long)var1_1);
                                if (var3_2 == null) break block39;
                            }
                            catch (CustomSystemException v20) {
                                throw CryptoTokenExchangeManager.a(v20);
                            }
                        }
                        v13 = this;
                        v14 = this;
                        v15 = CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)11994, (long)(2730153416813101167L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1);
                        v16 = true;
                        v17 = Void.TYPE;
                    }
                    catch (CustomSystemException v21) {
                        throw CryptoTokenExchangeManager.a(v21);
                    }
                }
                v13.M = CryptoTokenExchangeManager.c("\u00cc", (Object)v14, (Object)v15, (boolean)v16, v17, (Object)new Class[]{ReflectionMetadataResolver.bj, Float.TYPE}, (long)-4306988524899490225L, (long)var1_1);
            }
            this.Y = CryptoTokenExchangeManager.c("\u00cc", (Object)this, (Object)CryptoTokenExchangeManager.c("c", (int)CryptoTokenExchangeManager.b("t", (int)1633, (long)(2416158918856435926L ^ var1_1)), (long)-4306625975603103101L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bj, Integer.TYPE, Float.TYPE}, (long)-4306988524899490225L, (long)var1_1);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoTokenExchangeManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoTokenExchangeManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "C\u0016s(";
        objectArray[1] = "O\u001aG\"\")D\u0015Vm_1W\u0012_$";
        objectArray[2] = Boolean.TYPE;
        CryptoTokenExchangeManager.g[2] = "java/lang/Boolean";
        objectArray[3] = "mW\"nQBfX3!<BfE'";
        objectArray[4] = "\fl<\u0004\u0015\u0015yL7\u000b\u0004Z\u0014L7\u0016\u0010O";
        objectArray[5] = "9JC\u0019";
        objectArray[6] = "\u0019lGJn}lLLE\u007f2\u0001LLXk'";
        objectArray[7] = "~\u001a2";
        objectArray[8] = Integer.TYPE;
        CryptoTokenExchangeManager.g[8] = "java/lang/Integer";
        objectArray[9] = "8@&\u0010";
        objectArray[10] = "NTZxi%E[K7\b+NPOm";
        objectArray[11] = "Lph\u001bJ\u001bO\u007f|%wc\u0015,f\u001e\u000e\u0006G$2\\0Y\u0015ncI@\u001cGor%\n\b\\~y\u001b@\u001eC/\u0003\u0019H\u0000Lh9\u001bA\u001cW\u00148Y_\u0007VexL\r\u0005,";
        objectArray[12] = "9<Pq={:3DO\n\u0003c3K%==)%TtG:a=\u0000q\"hiiBO}:#8W?8h\");u,s3\"\u0005?:lbX\u00077$c%b\u0005>8xYcG #y(#Rr!\u0003";
        objectArray[13] = ")(\n?k@*'\u001e\u0001J8pt\u0004:/]\"|Px\u0011\u0002p6\u0001maG\"7\u0010\u0001+S9&\u001b?aE&wa?l\\x%\bp/I'L";
        objectArray[14] = "Q\u007fS)IM\n?H5r[\u0017F\u0011;\u001fY\u0005#\u00175IQl\u007f\u0014 I\u000e\t-\u001ct\u000b0";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "Y&:y\u0016PZ).G=(\u0003)!-\u0016\u0016I?>|l\u0011\u0001'jy\tC\ts(GV\u0011C\"=7\u0013CB3Q}\u0007XS8o7\u0011G\u0002Bo:\b\u0019P+ y\u001dF9";
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoTokenExchangeManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A89;
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
                throw new RuntimeException("a/qY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoTokenExchangeManager.d[n2] = n3;
        }
        return d[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoTokenExchangeManager.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoTokenExchangeManager.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = CryptoTokenExchangeManager.e(l, l2);
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
                clazz3 = CryptoTokenExchangeManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoTokenExchangeManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoTokenExchangeManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoTokenExchangeManager.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoTokenExchangeManager.f(763117595112038L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoTokenExchangeManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoTokenExchangeManager.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoTokenExchangeManager.f(763117595112038L, 0L);
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
        MethodHandle methodHandle = CryptoTokenExchangeManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoTokenExchangeManager.b = MultiContainerRegistry.a(5381415409721143185L, -3695715567822421253L, MethodHandles.lookup().lookupClass()).a(230608512995461L);
                CryptoTokenExchangeManager.f = new Object[16];
                CryptoTokenExchangeManager.g = new String[16];
                CryptoTokenExchangeManager.a();
                CryptoTokenExchangeManager.e = new HashMap<K, V>(13);
                var0 = CryptoTokenExchangeManager.b ^ 7338656052971L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = ":[|\u008e\u0085Y\u00b1\u00a6\u0016h \u00fe\\\u00a9\u00c7\u00e8x\u00b5\u00cf\u0096B\u00ee\u00f3\u00df\u0007\u00ca\u00ef7\u00947\u00f5,\r\u00ad\u00d6\u00d3\u000f\u00c3\u00db\u008c\u00b0\u00c6{\t\u00f2\u00bfJ \u008d\u00cb\u0019\u001d\u00f4k\u008b\u00e4\u00c3@\u00d8$m\u00e2\u0088\u00d0";
                var7_6 = ":[|\u008e\u0085Y\u00b1\u00a6\u0016h \u00fe\\\u00a9\u00c7\u00e8x\u00b5\u00cf\u0096B\u00ee\u00f3\u00df\u0007\u00ca\u00ef7\u00947\u00f5,\r\u00ad\u00d6\u00d3\u000f\u00c3\u00db\u008c\u00b0\u00c6{\t\u00f2\u00bfJ \u008d\u00cb\u0019\u001d\u00f4k\u008b\u00e4\u00c3@\u00d8$m\u00e2\u0088\u00d0".length();
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
                    var6_5 = "E\u001b1\u00c5\u00e3\u00b2H\t\u0094\"\u00ea\u009b\u008bTV\u009d";
                    var7_6 = "E\u001b1\u00c5\u00e3\u00b2H\t\u0094\"\u00ea\u009b\u008bTV\u009d".length();
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
        CryptoTokenExchangeManager.c = var8_3;
        CryptoTokenExchangeManager.d = new Integer[10];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoTokenExchangeManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoTokenExchangeManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = CryptoTokenExchangeManager.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoTokenExchangeManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoTokenExchangeManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoTokenExchangeManager.c(clazz3, string2, clazz2)) != null) {
                    CryptoTokenExchangeManager.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoTokenExchangeManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoTokenExchangeManager.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoTokenExchangeManager.f(763117595112038L, 0L);
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

    private Object J(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.C.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoTokenExchangeManager.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() > 13) {
                return this.h.T(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoTokenExchangeManager.a(customSystemException);
        }
        return this.I.Z(object);
    }

    static Object b(CryptoTokenExchangeManager cryptoTokenExchangeManager, Object object) {
        return cryptoTokenExchangeManager.J(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == 'f' || c == '\u00e1' || c == '\u00c6') {
                field = CryptoTokenExchangeManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoTokenExchangeManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 36;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 43;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 17;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 34;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 45;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 9;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 61;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 5;
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
                n3 = 46;
                break;
            }
            case 38: {
                n3 = 26;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 15;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 56;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 55;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 42;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 33;
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
        CryptoTokenExchangeManager.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoTokenExchangeManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoTokenExchangeManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

