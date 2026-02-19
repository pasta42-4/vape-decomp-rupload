/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.kX;
import a.qt;
import a.v2;
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

public class qx
extends v2 {
    private static final long a;
    private static final long[] b;
    private HK c;
    private static final Map e;
    private static final Object[] g;
    private HK F;
    private HK v;
    private HK J;
    private static final String[] i;
    private static final Integer[] d;
    private Ib z;
    private final Ib N;
    private Ib Y;
    private HK h;
    private HK f;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qx.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qx.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public qx() {
        block26: {
            block28: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                var1_1 = qx.a ^ 53782060657499L;
                                v0 = qt.w();
                                super(eM.VE);
                                var3_2 = v0;
                                try {
                                    try {
                                        if (var3_2 != null) break block22;
                                        if (kX.C() >= 23) {
                                        }
                                        ** GOTO lbl20
                                    }
                                    catch (O_ v1) {
                                        throw qx.a(v1);
                                    }
                                    this.N = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)20699, (long)(7063443672383767580L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)eM.VE, (long)-26147160780867004L, (long)var1_1);
                                }
                                catch (O_ v2) {
                                    throw qx.a(v2);
                                }
                            }
                            try {
                                if (var3_2 == null) break block23;
lbl20:
                                // 2 sources

                                this.N = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)26951, (long)(1887682073100778881L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)eM.VE, (long)-26147160780867004L, (long)var1_1);
                            }
                            catch (O_ v3) {
                                throw qx.a(v3);
                            }
                        }
                        try {
                            try {
                                v4 = kX.C();
                                if (var3_2 != null) break block24;
                                if (v4 > 13) {
                                }
                                ** GOTO lbl64
                            }
                            catch (O_ v5) {
                                throw qx.a(v5);
                            }
                            v4 = (int)Na.MC_1_21_0.V().m();
                        }
                        catch (O_ v6) {
                            throw qx.a(v6);
                        }
                    }
                    try {
                        if (var3_2 != null) break block25;
                        if (v4 == 0) break block26;
                    }
                    catch (O_ v7) {
                        throw qx.a(v7);
                    }
                    v4 = kX.C();
                }
                try {
                    block27: {
                        try {
                            if (v4 < 35) break block27;
                            this.Y = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)15279, (long)(426067993299758948L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)eM.V7, (long)-26226187238664089L, (long)var1_1);
                            if (var3_2 == null) break block28;
                        }
                        catch (O_ v8) {
                            throw qx.a(v8);
                        }
                    }
                    this.Y = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)14439, (long)(7608580298081938599L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, (Object)eM.V7, (long)-26226187238664089L, (long)var1_1);
                }
                catch (O_ v9) {
                    throw qx.a(v9);
                }
            }
            try {
                this.J = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)13771, (long)(5262887807129526543L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                if (var3_2 == null) break block26;
lbl64:
                // 2 sources

                this.z = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)20423, (long)(4959958097960360710L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-26226187238664089L, (long)var1_1);
                this.F = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)23929, (long)(2677482352618588602L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.c = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)11132, (long)(1214008306666618806L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                this.v = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)15163, (long)(5124089796417990649L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.J = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)28456, (long)(981722984359263200L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-26300778506823047L, (long)var1_1);
                this.f = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)32058, (long)(5434234826187729407L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-26300778506823047L, (long)var1_1);
                this.h = qx.c("T", (Object)this, (Object)qx.c("\u00c4", (int)qx.b("n", (int)8226, (long)(6227171893758211307L ^ var1_1)), (long)-26087841991026657L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, (long)-26300778506823047L, (long)var1_1);
            }
            catch (O_ v10) {
                throw qx.a(v10);
            }
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (i[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 0;
                break;
            }
            case 1: {
                n4 = 58;
                break;
            }
            case 2: {
                n4 = 41;
                break;
            }
            case 3: {
                n4 = 13;
                break;
            }
            case 4: {
                n4 = 12;
                break;
            }
            case 5: {
                n4 = 63;
                break;
            }
            case 6: {
                n4 = 60;
                break;
            }
            case 7: {
                n4 = 44;
                break;
            }
            case 8: {
                n4 = 24;
                break;
            }
            case 9: {
                n4 = 25;
                break;
            }
            case 10: {
                n4 = 18;
                break;
            }
            case 11: {
                n4 = 61;
                break;
            }
            case 12: {
                n4 = 5;
                break;
            }
            case 13: {
                n4 = 52;
                break;
            }
            case 14: {
                n4 = 29;
                break;
            }
            case 15: {
                n4 = 6;
                break;
            }
            case 16: {
                n4 = 3;
                break;
            }
            case 17: {
                n4 = 35;
                break;
            }
            case 18: {
                n4 = 14;
                break;
            }
            case 19: {
                n4 = 33;
                break;
            }
            case 20: {
                n4 = 57;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 62;
                break;
            }
            case 23: {
                n4 = 9;
                break;
            }
            case 24: {
                n4 = 17;
                break;
            }
            case 25: {
                n4 = 48;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 50;
                break;
            }
            case 28: {
                n4 = 4;
                break;
            }
            case 29: {
                n4 = 20;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 19;
                break;
            }
            case 33: {
                n4 = 23;
                break;
            }
            case 34: {
                n4 = 15;
                break;
            }
            case 35: {
                n4 = 51;
                break;
            }
            case 36: {
                n4 = 31;
                break;
            }
            case 37: {
                n4 = 27;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 54;
                break;
            }
            case 40: {
                n4 = 39;
                break;
            }
            case 41: {
                n4 = 45;
                break;
            }
            case 42: {
                n4 = 53;
                break;
            }
            case 43: {
                n4 = 1;
                break;
            }
            case 44: {
                n4 = 30;
                break;
            }
            case 45: {
                n4 = 28;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 34;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 32;
                break;
            }
            case 50: {
                n4 = 36;
                break;
            }
            case 51: {
                n4 = 2;
                break;
            }
            case 52: {
                n4 = 26;
                break;
            }
            case 53: {
                n4 = 10;
                break;
            }
            case 54: {
                n4 = 21;
                break;
            }
            case 55: {
                n4 = 42;
                break;
            }
            case 56: {
                n4 = 8;
                break;
            }
            case 57: {
                n4 = 59;
                break;
            }
            case 58: {
                n4 = 56;
                break;
            }
            case 59: {
                n4 = 55;
                break;
            }
            case 60: {
                n4 = 49;
                break;
            }
            case 61: {
                n4 = 46;
                break;
            }
            case 62: {
                n4 = 11;
                break;
            }
            default: {
                n4 = 47;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        qx.i[n5] = new String(cArray);
        return n5;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qx.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static void R(qx qx2, Object object, int n2) {
        qx2.Y(object, n2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qx.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean k(Object object) {
        return this.z.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qx.a = d8.a(4107819225016060338L, -4708977809314085600L, MethodHandles.lookup().lookupClass()).a(25792114705023L);
                qx.g = new Object[14];
                qx.i = new String[14];
                qx.a();
                qx.e = new HashMap<K, V>(13);
                var0 = qx.a ^ 104480969996542L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "U\u008b\u0004J\u0098\u00d8\u0006\u00b7\u0095$\u0006\u00a0t>\u000f\u00e8\u00be\u00b8\u000b\u008d\u00df_y\u00b1\u00be!]\u00e5<^l\u000e_\u00d6\u00ad\u00e6\u0094\u00a0@\u0091k\u00ee\u008b\u0099\u00a6^\"\u00bd\u008c\u008d\u0016\u00eb\u0086\u0014Y\u008e\u0007$\u00a1\u00f2\f\u00c4\u00fa4\u00dd\u00e1A\u009c\u0087\u00a4{q\u00dc\u00b0nG\u00b5\\\u0017\u00b1";
                var7_6 = "U\u008b\u0004J\u0098\u00d8\u0006\u00b7\u0095$\u0006\u00a0t>\u000f\u00e8\u00be\u00b8\u000b\u008d\u00df_y\u00b1\u00be!]\u00e5<^l\u000e_\u00d6\u00ad\u00e6\u0094\u00a0@\u0091k\u00ee\u008b\u0099\u00a6^\"\u00bd\u008c\u008d\u0016\u00eb\u0086\u0014Y\u008e\u0007$\u00a1\u00f2\f\u00c4\u00fa4\u00dd\u00e1A\u009c\u0087\u00a4{q\u00dc\u00b0nG\u00b5\\\u0017\u00b1".length();
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
                    var6_5 = "\u00f8\u008eo1~\u00a2\u00b3\u00fa\u0098\u00f7'\u009e\u00b4\u00c1V\u0007";
                    var7_6 = "\u00f8\u008eo1~\u00a2\u00b3\u00fa\u0098\u00f7'\u009e\u00b4\u00c1V\u0007".length();
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
        qx.b = var8_3;
        qx.d = new Integer[12];
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6B60;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qx.d[n3] = n4;
        }
        return d[n3];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00da' || c10 == 'b' || c10 == '\u00de' || c10 == '\u00c0') {
                field = qx.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qx.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Field g(long l10, long l11) {
        int n2 = qx.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = i[n2];
            int n3 = string.indexOf(8);
            Class clazz = qx.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qx.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qx.c(clazz3, string2, clazz2)) != null) {
                    qx.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qx.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qx.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qx.f(691381479221515L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static void E(qx qx2, Object object, double d2, double d3, double d4) {
        qx2.D(object, d2, d3, d4);
    }

    private Object t() {
        return this.N.Z(null);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qx.e(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                qx.g[n2] = clazz = Class.forName(i[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object R(Object object) {
        return this.Y.Z(object);
    }

    private void d(Object object) {
        this.J.V(object);
    }

    static void z(qx qx2, Object object) {
        qx2.E(object);
    }

    static void E(qx qx2, Object object) {
        qx2.d(object);
    }

    private void E(Object object) {
        this.c.V(object);
    }

    private void D(Object object, double d2, double d3, double d4) {
        this.v.l(object, d2, d3, d4);
    }

    private void Y(Object object, int n2) {
        this.f.l(object, n2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qx.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qx.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "(6We";
        objectArray[1] = "\u001e\u0003\u001dEL?\u0015\f\f\n1'\u0006\u000b\u0005C";
        objectArray[2] = Boolean.TYPE;
        qx.i[2] = "java/lang/Boolean";
        objectArray[3] = "OF}TtqDIl\u001b\u0019qDTx";
        objectArray[4] = " Y$z2\u0012Uy/u#]8y/h7H";
        objectArray[5] = ":)|\u0003";
        objectArray[6] = ".U\u001c";
        objectArray[7] = Integer.TYPE;
        qx.i[7] = "java/lang/Integer";
        objectArray[8] = "b\b0o";
        objectArray[9] = "o911\u0010\u001bd6 ~q\u0015o=$$";
        objectArray[10] = "\f>VYN'\u0014cJ!sBS=SCR$Z;ZJ4{\f5H\\Z}\u0001f\u0002!\u000e8ZzBOK~\u0000<3\u001bH0\u000b`\u0002KEs[\u0004\u000f\u0019Pz\u001at]@Y;j";
        objectArray[11] = "\nl];7P\u00121AC\u00165UoX!+S\\iQ(M\f\ngC>#\n\u00074\tCwO\\(I-2\t\u0006n8}pO\u0016j\u0006$<H\u0013V";
        objectArray[12] = "Pr#\u0012-UH/?j\u001a0\u000fq&\b1V\u0006w/\u0001W\tPy=\u00179\u000f]*wjmJ\u000667\u0004(\f\\pFTjJLtx\r&MIH";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ")Vx\u0001;[*KcS@[n9#\u0007xM{\u0001|\\8]\u0015\u0000'X\"Vs\t!Q+0";
    }

    private static Method h(long l10, long l11) {
        int n2 = qx.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n2];
                int n4 = string2.indexOf(8);
                clazz3 = qx.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = qx.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qx.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qx.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qx.f(691381479221515L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qx.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qx.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qx.f(691381479221515L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    static void c(qx qx2, Object object, double d2, double d3, double d4, double d5, double d6) {
        qx2.G(object, d2, d3, d4, d5, d6);
    }

    static Object d(qx qx2, Object object) {
        return qx2.R(object);
    }

    public void m(Object object, int n2, int n3, int n4, int n5) {
        this.F.l(object, n2, n3, n4, n5);
    }

    private void G(Object object, double d2, double d3, double d4, double d5, double d6) {
        this.h.l(object, d2, d3, d4, d5, d6);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object S(qx qx2) {
        return qx2.t();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

