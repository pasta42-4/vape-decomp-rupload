/*
 * Decompiled with CFR 0.152.
 */
package com.routing.interceptor;

import a.HK;
import a.vP;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.configuration.ConfigurationManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class InterceptorRoutingEngine
extends CryptoProtocolEngine {
    private static final Object[] f;
    private HK a;
    private static final long[] c;
    private static final Integer[] d;
    private static final long b;
    private static final String[] g;
    private HK I;
    public HK m;
    private HK q;
    private static final Map e;

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

    private static void a() {
        Object[] objectArray = f;
        f[0] = "R;\u007f";
        objectArray[1] = Integer.TYPE;
        InterceptorRoutingEngine.g[1] = "java/lang/Integer";
        objectArray[2] = "_\u001cB&\n\u0002T\u0013Siw\u001aG\u0014Z ";
        objectArray[3] = " D@\n";
        objectArray[4] = Boolean.TYPE;
        InterceptorRoutingEngine.g[4] = "java/lang/Boolean";
        objectArray[5] = "~L//<IuC>`QIu^*";
        objectArray[6] = "\u0002v@dh\nwVKkyE\u001aVKvmP";
        objectArray[7] = "8+B\u0012";
        objectArray[8] = "5Y>*\u000eJ>V/eoD5]+?";
        objectArray[9] = "ZxeZGh\u0001uz\u0012v_`-g\u0000\u000e|\u000el,\u0001L\u0002ZffX\u0016`\u0019vu\nv9\u0006}p\\\u001d8\u0019kwcJa\u001b){[\fa\t/\u001c^\u001be\u0010*u_\u0015h\u0010\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "<(P}\n6/z\u0019BQ&PzA-F-j \u0011-J]i8K:D3(sJx:";
    }

    static void o(InterceptorRoutingEngine interceptorRoutingEngine, int n, FloatBuffer floatBuffer) {
        interceptorRoutingEngine.u(n, floatBuffer);
    }

    static void b(InterceptorRoutingEngine interceptorRoutingEngine, int n, int n2, int n3, FloatBuffer floatBuffer) {
        interceptorRoutingEngine.p(n, n2, n3, floatBuffer);
    }

    private void w(FloatBuffer floatBuffer) {
        this.q.l(null, floatBuffer);
    }

    public InterceptorRoutingEngine() {
        block8: {
            long l;
            block6: {
                block7: {
                    l = b ^ 0x757F09C7FF1BL;
                    int[] nArray = vP.y();
                    super(ReflectionMetadataResolver.EB);
                    int[] nArray2 = nArray;
                    try {
                        try {
                            try {
                                if (nArray2 != null) break block6;
                                if (ConfigurationManager.p()) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw InterceptorRoutingEngine.a(customSystemException);
                            }
                            this.a = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)28633, (long)(0x7C31D70AF7A63AB8L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, IntBuffer.class}, (long)-9167071582825144829L, (long)l);
                            this.m = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)17462, (long)(0x68EB0F7FBE219150L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
                            this.q = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)32662, (long)(0x28A9F0D3668BAAF3L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
                            this.I = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)21589, (long)(0x1EC58B1BEC360131L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
                            if (nArray2 == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw InterceptorRoutingEngine.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[5]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw InterceptorRoutingEngine.a(customSystemException);
                    }
                }
                this.a = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)8476, (long)(0x1842207B34C7F47FL ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, IntBuffer.class}, (long)-9167071582825144829L, (long)l);
                this.m = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)31706, (long)(0x7D69685475E8AEBDL ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
                this.q = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)17530, (long)(0x7DE6A70DB9C91118L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
            }
            this.I = InterceptorRoutingEngine.c("X", (Object)this, (Object)InterceptorRoutingEngine.c("\u00da", (int)InterceptorRoutingEngine.b("a", (int)24934, (long)(0x2E0347CDBE99B406L ^ l)), (long)-9166832136578947935L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void O(InterceptorRoutingEngine interceptorRoutingEngine, int n, IntBuffer intBuffer) {
        interceptorRoutingEngine.F(n, intBuffer);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InterceptorRoutingEngine.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = InterceptorRoutingEngine.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                InterceptorRoutingEngine.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55AD;
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
                throw new RuntimeException("a/vo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InterceptorRoutingEngine.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = InterceptorRoutingEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void p(int n, int n2, int n3, FloatBuffer floatBuffer) {
        block3: {
            block2: {
                try {
                    if (ConfigurationManager.p()) break block2;
                    this.m.l(null, n, n3, floatBuffer);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw InterceptorRoutingEngine.a(customSystemException);
                }
            }
            this.m.l(null, n, n2, n3, floatBuffer);
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
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 2;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 55;
                break;
            }
            case 7: {
                n3 = 23;
                break;
            }
            case 8: {
                n3 = 21;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 31;
                break;
            }
            case 14: {
                n3 = 41;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 59;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 19;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 7;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 36;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 46;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 16;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 22;
                break;
            }
            case 40: {
                n3 = 47;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 53;
                break;
            }
            case 48: {
                n3 = 39;
                break;
            }
            case 49: {
                n3 = 17;
                break;
            }
            case 50: {
                n3 = 42;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 49;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 54;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 25;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 37;
                break;
            }
            case 62: {
                n3 = 5;
                break;
            }
            default: {
                n3 = 35;
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
        InterceptorRoutingEngine.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                InterceptorRoutingEngine.b = MultiContainerRegistry.a(-7581316558747608762L, 7160694067695339614L, MethodHandles.lookup().lookupClass()).a(194420523633450L);
                InterceptorRoutingEngine.f = new Object[11];
                InterceptorRoutingEngine.g = new String[11];
                InterceptorRoutingEngine.a();
                InterceptorRoutingEngine.e = new HashMap<K, V>(13);
                var0 = InterceptorRoutingEngine.b ^ 100616944651932L;
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
                var6_5 = "N(\u008e\u001f\u0015\u008e\u00f8\u00c8f\u00cb\u00f9\u00aa\u0081\t\u00f5\u00b4\u00aas\u00cc\u00fezbK\u00c4i\u008eD\u008e\u00e8\u0019\\\u00e3Xw\u0002\u0014a\u00cc\u00c5h{\u0015s\u00a6A\u0093\u009f[";
                var7_6 = "N(\u008e\u001f\u0015\u008e\u00f8\u00c8f\u00cb\u00f9\u00aa\u0081\t\u00f5\u00b4\u00aas\u00cc\u00fezbK\u00c4i\u008eD\u008e\u00e8\u0019\\\u00e3Xw\u0002\u0014a\u00cc\u00c5h{\u0015s\u00a6A\u0093\u009f[".length();
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
                    var6_5 = "a\u000e~@\u007f\u00f5M\u00f6\u00b6\u00ad\u001d\u008coa\u00b2\u00d4";
                    var7_6 = "a\u000e~@\u007f\u00f5M\u00f6\u00b6\u00ad\u001d\u008coa\u00b2\u00d4".length();
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
        InterceptorRoutingEngine.c = var8_3;
        InterceptorRoutingEngine.d = new Integer[8];
    }

    private static Field g(long l, long l2) {
        int n = InterceptorRoutingEngine.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = InterceptorRoutingEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = InterceptorRoutingEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = InterceptorRoutingEngine.c(clazz3, string2, clazz2)) != null) {
                    InterceptorRoutingEngine.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = InterceptorRoutingEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        InterceptorRoutingEngine.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = InterceptorRoutingEngine.f(624477456736197L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void u(int n, FloatBuffer floatBuffer) {
        this.I.l(null, n, floatBuffer);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == '\u00de' || c == 'o' || c == '\u00f8') {
                field = InterceptorRoutingEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = InterceptorRoutingEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Field field = InterceptorRoutingEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = InterceptorRoutingEngine.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void r(InterceptorRoutingEngine interceptorRoutingEngine, FloatBuffer floatBuffer) {
        interceptorRoutingEngine.w(floatBuffer);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = InterceptorRoutingEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = InterceptorRoutingEngine.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void F(int n, IntBuffer intBuffer) {
        this.a.l(null, n, intBuffer);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = InterceptorRoutingEngine.e(l, l2);
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
                clazz3 = InterceptorRoutingEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = InterceptorRoutingEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = InterceptorRoutingEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        InterceptorRoutingEngine.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = InterceptorRoutingEngine.f(624477456736197L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = InterceptorRoutingEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        InterceptorRoutingEngine.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = InterceptorRoutingEngine.f(624477456736197L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InterceptorRoutingEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(InterceptorRoutingEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

