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
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.runtime.conversion.TypeConvertor;
import com.runtime.reflection.ReflectionUtilityService;
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

public class CipherProcessor
extends CryptoProtocolEngine {
    private final ReflectionUtilityService V;
    private static final Object[] e;
    private final ReflectionUtilityService k;
    private static final Map d;
    private static final long[] b;
    private static final String[] f;
    private static final long a;
    private HK X;
    private static final Integer[] c;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CipherProcessor.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherProcessor.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = CipherProcessor.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherProcessor.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherProcessor.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherProcessor.c(clazz3, string2, clazz2)) != null) {
                    CipherProcessor.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherProcessor.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherProcessor.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherProcessor.f(701595367105371L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherProcessor.a = MultiContainerRegistry.a(2182879770024552589L, -655996629635840846L, MethodHandles.lookup().lookupClass()).a(2887616368053L);
                CipherProcessor.e = new Object[14];
                CipherProcessor.f = new String[14];
                CipherProcessor.a();
                CipherProcessor.d = new HashMap<K, V>(13);
                var0 = CipherProcessor.a ^ 87972141570654L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u0007\u00ba#\u00d8N\u009b\u00c2\u00dc\u0096\u00cak\u00150\u00f6l\u0094\u000e*\u00a3\u00db\rE\u00c1\u00fc7<H\u00a0g\u00c1F\u00ec\u00ac\u00dd\u00b6\u00dc\u00bcq\u001d\u00fe";
                var7_6 = "\u0007\u00ba#\u00d8N\u009b\u00c2\u00dc\u0096\u00cak\u00150\u00f6l\u0094\u000e*\u00a3\u00db\rE\u00c1\u00fc7<H\u00a0g\u00c1F\u00ec\u00ac\u00dd\u00b6\u00dc\u00bcq\u001d\u00fe".length();
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
                    var6_5 = "Z\u008f|\u00f9\u0007k\u00e1\u00a0\u00c45\u00cc\u00f6e3p\u00e4";
                    var7_6 = "Z\u008f|\u00f9\u0007k\u00e1\u00a0\u00c45\u00cc\u00f6e3p\u00e4".length();
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
        CipherProcessor.b = var8_3;
        CipherProcessor.c = new Integer[7];
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
                n3 = 5;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 33;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 12: {
                n3 = 53;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 23;
                break;
            }
            case 18: {
                n3 = 18;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 30;
                break;
            }
            case 23: {
                n3 = 21;
                break;
            }
            case 24: {
                n3 = 27;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 29;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 43;
                break;
            }
            case 32: {
                n3 = 17;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 46;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 56;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 0;
                break;
            }
            case 46: {
                n3 = 49;
                break;
            }
            case 47: {
                n3 = 63;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 40;
                break;
            }
            case 56: {
                n3 = 39;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 45;
                break;
            }
            case 59: {
                n3 = 59;
                break;
            }
            case 60: {
                n3 = 41;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 20;
                break;
            }
            default: {
                n3 = 44;
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
        CipherProcessor.f[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ":\u001d.";
        objectArray[1] = Integer.TYPE;
        CipherProcessor.f[1] = "java/lang/Integer";
        objectArray[2] = "`==\u001fYEk2,P$]x5%\u0019";
        objectArray[3] = "-\t:u";
        objectArray[4] = Boolean.TYPE;
        CipherProcessor.f[4] = "java/lang/Boolean";
        objectArray[5] = "3;\u001bO[|84\n\u00006|8)\u001e";
        objectArray[6] = ":+\u00117";
        objectArray[7] = "\u007fh2J~J\nH9Eo\u0005gH9X{\u0010";
        objectArray[8] = "QS#0";
        objectArray[9] = "r\u0002|=5\\y\rmrTRr\u0006i(";
        objectArray[10] = "s1j]C7wnwF)UIglD@\u007fr&*\u0005I\u000er5s\u0007Ml/\"#_)54;)AGq(3p9\u0015n1gi\bOev2\u0012";
        objectArray[11] = "wkXU\u0000{phHe\u0011|\u001b*B\u0006\u00169`rMT\u0013\u0007\"mU\f\u000b<c+\u0014\u0005z";
        objectArray[12] = "*\u0016O\u0003\u001e\u0013.IR\u0018tH\u0010@I\u001a\u001d[+\u0001\u000f[\u0014*+\u0004R\\\fDo\u0018Z\u0005t\u0017!\u0015I\\EMy\u001c\\gIO!\u0001\n\u0001\u001aK!G7";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u0002\u000fzZ@X\u0006PgA*08[\u007f[\u0011\u0019V\u001fcSHa\u0001\u001e\u007fW[Z@X>^*ZS\u0001<ZH\u0007DQd>\u0011\u001c][zPU\u0000U\u0002\u0002\u0002J\u0019\u0001\u001b3XA^T`";
    }

    public float j(Object object) {
        return this.k.x(object);
    }

    public float J(Object object, float f) {
        return this.X.p(object, Float.valueOf(f));
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherProcessor.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x604F;
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
                throw new RuntimeException("a/PF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherProcessor.c[n2] = n3;
        }
        return c[n2];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherProcessor.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherProcessor.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int f(Object object) {
        return this.V.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CipherProcessor.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CipherProcessor() {
        block19: {
            block25: {
                block23: {
                    block24: {
                        block22: {
                            block20: {
                                block21: {
                                    block18: {
                                        var1_1 = CipherProcessor.a ^ 54450632076948L;
                                        v0 = TypeConvertor.A();
                                        super(ReflectionMetadataResolver.Ys);
                                        var3_2 = v0;
                                        try {
                                            try {
                                                if (var3_2 == null) break block18;
                                                if (GeometryCalculator.C() >= 37) {
                                                }
                                                ** GOTO lbl24
                                            }
                                            catch (CustomSystemException v1) {
                                                throw CipherProcessor.a(v1);
                                            }
                                            this.k = CipherProcessor.c("\u00ba", (Object)this, (Object)ReflectionMetadataResolver.ER, (Object)CipherProcessor.c("u", (int)CipherProcessor.b("h", (int)15339, (long)(8016219310574314562L ^ var1_1)), (long)9215711207756464381L, (long)var1_1), (boolean)true, Float.TYPE, (long)9215857736782736265L, (long)var1_1);
                                            this.V = CipherProcessor.c("\u00ba", (Object)this, (Object)ReflectionMetadataResolver.PC, (Object)CipherProcessor.c("u", (int)CipherProcessor.b("h", (int)4809, (long)(3435375283048680805L ^ var1_1)), (long)9215711207756464381L, (long)var1_1), (boolean)true, Integer.TYPE, (long)9215857736782736265L, (long)var1_1);
                                            this.X = ((StatefulEventToggle)CipherProcessor.c("\u00ba", (Object)this, (Object)CipherProcessor.c("u", (int)CipherProcessor.b("h", (int)29457, (long)(7128230940598791354L ^ var1_1)), (long)9215711207756464381L, (long)var1_1), Float.TYPE, (Object)new Class[]{Float.TYPE}, (long)9215816884558741571L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.FS)).M();
                                        }
                                        catch (CustomSystemException v2) {
                                            throw CipherProcessor.a(v2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var3_2 != null) break block19;
lbl24:
                                                // 2 sources

                                                v3 = this;
                                                v4 = this;
                                                v5 /* !! */  = DynamicContextBroker.e;
                                                if (var3_2 == null) break block20;
                                            }
                                            catch (CustomSystemException v6) {
                                                throw CipherProcessor.a(v6);
                                            }
                                            if (v5 /* !! */  == 0) break block21;
                                        }
                                        catch (CustomSystemException v7) {
                                            throw CipherProcessor.a(v7);
                                        }
                                        v8 = CipherProcessor.c("u", (int)CipherProcessor.b("h", (int)2055, (long)(7580196171922053039L ^ var1_1)), (long)9215711207756464381L, (long)var1_1);
                                        break block22;
                                    }
                                    catch (CustomSystemException v9) {
                                        throw CipherProcessor.a(v9);
                                    }
                                }
                                v5 /* !! */  = (int)CipherProcessor.b("h", (int)27054, (long)(4509386512517330436L ^ var1_1));
                            }
                            v8 = CipherProcessor.c("u", (int)v5 /* !! */ , (long)9215711207756464381L, (long)var1_1);
                        }
                        try {
                            try {
                                v3.k = CipherProcessor.c("\u00ba", (Object)v4, (Object)v8, (boolean)true, Float.TYPE, (long)9215644185775624357L, (long)var1_1);
                                v10 = this;
                                v11 = this;
                                v12 /* !! */  = DynamicContextBroker.e;
                                if (var3_2 == null) break block23;
                                if (v12 /* !! */  == 0) break block24;
                            }
                            catch (CustomSystemException v13) {
                                throw CipherProcessor.a(v13);
                            }
                            v14 = CipherProcessor.c("u", (int)CipherProcessor.b("h", (int)21338, (long)(1295413238733622519L ^ var1_1)), (long)9215711207756464381L, (long)var1_1);
                            break block25;
                        }
                        catch (CustomSystemException v15) {
                            throw CipherProcessor.a(v15);
                        }
                    }
                    v12 /* !! */  = (int)CipherProcessor.b("h", (int)19045, (long)(1607396181228410314L ^ var1_1));
                }
                v14 = CipherProcessor.c("u", (int)v12 /* !! */ , (long)9215711207756464381L, (long)var1_1);
            }
            v10.V = CipherProcessor.c("\u00ba", (Object)v11, (Object)v14, (boolean)true, Integer.TYPE, (long)9215644185775624357L, (long)var1_1);
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                TypeConvertor.V("cwJM8b");
            }
        }
        catch (CustomSystemException v16) {
            throw CipherProcessor.a(v16);
        }
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherProcessor.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherProcessor.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(long l, long l2) {
        int n = CipherProcessor.e(l, l2);
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
                clazz3 = CipherProcessor.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherProcessor.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherProcessor.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherProcessor.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherProcessor.f(701595367105371L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherProcessor.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherProcessor.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherProcessor.f(701595367105371L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == 't' || c == 'J' || c == '\u00e3') {
                field = CipherProcessor.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherProcessor.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherProcessor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CipherProcessor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

