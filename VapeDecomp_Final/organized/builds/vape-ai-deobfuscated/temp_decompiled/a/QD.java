/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.kX;
import a.qZ;
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

public class qd
extends v2 {
    private Ib N;
    private Ib g;
    private static final long a;
    private Ib Z;
    private Ib e;
    private static final Object[] h;
    private static final Map d;
    private Ib K;
    private Ib P;
    private static final long[] b;
    private static final Integer[] c;
    private Ib B;
    private static final String[] i;
    private Ib f;

    private void I(Object object, float f10) {
        this.B.H(object, f10);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void q(qd qd2, Object object, float f10) {
        qd2.y(object, f10);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qd.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static void c(qd qd2, Object object, int n2) {
        qd2.s(object, n2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (i[n5] != null) {
            return n5;
        }
        Object object = h[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 35;
                break;
            }
            case 1: {
                n4 = 17;
                break;
            }
            case 2: {
                n4 = 19;
                break;
            }
            case 3: {
                n4 = 28;
                break;
            }
            case 4: {
                n4 = 58;
                break;
            }
            case 5: {
                n4 = 59;
                break;
            }
            case 6: {
                n4 = 34;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 61;
                break;
            }
            case 11: {
                n4 = 48;
                break;
            }
            case 12: {
                n4 = 7;
                break;
            }
            case 13: {
                n4 = 10;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 11;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 39;
                break;
            }
            case 18: {
                n4 = 9;
                break;
            }
            case 19: {
                n4 = 54;
                break;
            }
            case 20: {
                n4 = 15;
                break;
            }
            case 21: {
                n4 = 52;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 53;
                break;
            }
            case 24: {
                n4 = 26;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 5;
                break;
            }
            case 27: {
                n4 = 21;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 55;
                break;
            }
            case 30: {
                n4 = 43;
                break;
            }
            case 31: {
                n4 = 51;
                break;
            }
            case 32: {
                n4 = 22;
                break;
            }
            case 33: {
                n4 = 56;
                break;
            }
            case 34: {
                n4 = 27;
                break;
            }
            case 35: {
                n4 = 49;
                break;
            }
            case 36: {
                n4 = 31;
                break;
            }
            case 37: {
                n4 = 62;
                break;
            }
            case 38: {
                n4 = 13;
                break;
            }
            case 39: {
                n4 = 42;
                break;
            }
            case 40: {
                n4 = 37;
                break;
            }
            case 41: {
                n4 = 40;
                break;
            }
            case 42: {
                n4 = 8;
                break;
            }
            case 43: {
                n4 = 63;
                break;
            }
            case 44: {
                n4 = 46;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 4;
                break;
            }
            case 47: {
                n4 = 20;
                break;
            }
            case 48: {
                n4 = 45;
                break;
            }
            case 49: {
                n4 = 44;
                break;
            }
            case 50: {
                n4 = 30;
                break;
            }
            case 51: {
                n4 = 16;
                break;
            }
            case 52: {
                n4 = 38;
                break;
            }
            case 53: {
                n4 = 36;
                break;
            }
            case 54: {
                n4 = 3;
                break;
            }
            case 55: {
                n4 = 60;
                break;
            }
            case 56: {
                n4 = 14;
                break;
            }
            case 57: {
                n4 = 25;
                break;
            }
            case 58: {
                n4 = 23;
                break;
            }
            case 59: {
                n4 = 12;
                break;
            }
            case 60: {
                n4 = 47;
                break;
            }
            case 61: {
                n4 = 33;
                break;
            }
            case 62: {
                n4 = 32;
                break;
            }
            default: {
                n4 = 50;
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
        qd.i[n5] = new String(cArray);
        return n5;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6779;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qd", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qd.c[n3] = n4;
        }
        return c[n3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qd.a = d8.a(-4550431209551726592L, -4828925037634514801L, MethodHandles.lookup().lookupClass()).a(30422419969293L);
                qd.h = new Object[10];
                qd.i = new String[10];
                qd.a();
                qd.d = new HashMap<K, V>(13);
                var0 = qd.a ^ 117537443164859L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "C\u00f8nI_ifI\u00e9\u0095\u00f7\u00b2\u00cc-cw\u00db,\u00f0\u00dfWS\u00d1\u001aQ\u008eB\u00d6\u0015\u0088\u00be\u00b5\u0087s\u009d\u00d1\u00fe(\u00d0\u00db\u00b3 \u00c7s-\u00a0f\u0092\u00e5\u0083\u001f\u00bc[y\u00db\u0014\u00cao\u00a4\u00b3N>6!H\u00fd{\u009f\u00ddt\u00fcf";
                var7_6 = "C\u00f8nI_ifI\u00e9\u0095\u00f7\u00b2\u00cc-cw\u00db,\u00f0\u00dfWS\u00d1\u001aQ\u008eB\u00d6\u0015\u0088\u00be\u00b5\u0087s\u009d\u00d1\u00fe(\u00d0\u00db\u00b3 \u00c7s-\u00a0f\u0092\u00e5\u0083\u001f\u00bc[y\u00db\u0014\u00cao\u00a4\u00b3N>6!H\u00fd{\u009f\u00ddt\u00fcf".length();
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
                    var6_5 = "\fPT\u00c0\u00d3\u00a1\u00e1\u0010\u00a0q\u001e\u00d7Mp\u00d2\\";
                    var7_6 = "\fPT\u00c0\u00d3\u00a1\u00e1\u0010\u00a0q\u001e\u00d7Mp\u00d2\\".length();
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
        qd.b = var8_3;
        qd.c = new Integer[11];
    }

    public qd() {
        block8: {
            long l10;
            block6: {
                block7: {
                    l10 = a ^ 0x64BE2EE965AEL;
                    super(eM.Yg);
                    this.g = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)21857, (long)(0x307884FAB7CD2810L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l10);
                    this.K = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)25919, (long)(0x1A5D6EFA197D9844L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l10);
                    this.Z = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)5193, (long)(0x7AC69A47E881E93AL ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l10);
                    this.B = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)4110, (long)(0x20FE92F9A7046D77L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l10);
                    String string = qZ.j();
                    try {
                        try {
                            try {
                                if (string == null) break block6;
                                if (kX.C() < 50) break block7;
                            }
                            catch (O_ o_2) {
                                throw qd.a(o_2);
                            }
                            this.P = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)25317, (long)(0x24707A147A909F92L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l10);
                            this.f = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)24717, (long)(0x27AE0EF8B97E1DF9L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l10);
                            this.N = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)5498, (long)(0x157B3E06675FE80FL ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, (Object)eM.r_, (long)1875795059132369510L, (long)l10);
                            this.e = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)28478, (long)(0x48AEB8E48A7E924CL ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, (Object)eM.tS, (long)1875795059132369510L, (long)l10);
                            if (string != null) break block8;
                        }
                        catch (O_ o_3) {
                            throw qd.a(o_3);
                        }
                        ht.I(new String[3]);
                    }
                    catch (O_ o_4) {
                        throw qd.a(o_4);
                    }
                }
                this.P = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)18700, (long)(0x1CFD4A19F994B47CL ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l10);
                this.f = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)10666, (long)(0x5766CE0731C6D4D0L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l10);
            }
            this.N = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)11399, (long)(0x7C403F0CE67951F1L ^ l10)), (long)1875886975024447439L, (long)l10), (boolean)true, (Object)eM.VW, (long)1875795059132369510L, (long)l10);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void J(Object object, float f10) {
        this.K.H(object, f10);
    }

    private Object k(Object object) {
        return this.N.Z(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == '\u00f1' || c10 == 'f' || c10 == 'e') {
                field = qd.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qd.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(long l10, long l11) {
        int n2 = qd.e(l10, l11);
        Object object = h[n2];
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
                clazz3 = qd.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qd.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qd.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qd.h[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qd.f(534380572375396L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qd.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qd.h[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qd.f(534380572375396L, 0L);
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

    static float[] K(qd qd2, Object object) {
        return qd2.b(object);
    }

    static Object V(qd qd2, Object object) {
        return qd2.I(object);
    }

    private void s(Object object, int n2) {
        this.f.t(object, n2);
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

    private void Y(Object object, float f10) {
        this.Z.H(object, f10);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void y(Object object, float f10) {
        this.g.H(object, f10);
    }

    private static Field g(long l10, long l11) {
        int n2 = qd.e(l10, l11);
        Object object = h[n2];
        if (object instanceof String) {
            String string = i[n2];
            int n3 = string.indexOf(8);
            Class clazz = qd.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qd.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qd.c(clazz3, string2, clazz2)) != null) {
                    qd.h[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qd.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qd.h[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qd.f(534380572375396L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "3=\u007f";
        objectArray[1] = Integer.TYPE;
        qd.i[1] = "java/lang/Integer";
        objectArray[2] = "D'\n,a`O(\u001bc\u001cx\\/\u0012*";
        objectArray[3] = "XG)\u0012";
        objectArray[4] = Boolean.TYPE;
        qd.i[4] = "java/lang/Boolean";
        objectArray[5] = "P\r\u0016Dp<[\u0002\u0007\u000b\u001d<[\u001f\u0013";
        objectArray[6] = "EJ\rY";
        objectArray[7] = "MH>Kw'FG/\u0004\u0016)ML+^";
        objectArray[8] = "\u0011a\u0000\u0017u8R8FF\u0007\b+g\\Ge1Rb\u0007\raS\u0010aG\u0007~!\u001b&_\r\u0007o\u00160\\\u001bz?\u0016%\u0003};>M?J\u0007>6N38";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "~\u000eua]Gl\nkY_E\u0012\u0013j0IA/\u0005c64\u0007vTh;M\u0002-\u001elY";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qd.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static void z(qd qd2, Object object, float f10) {
        qd2.J(object, f10);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qd.e(l10, l11);
            object = h[n2];
            try {
                if (!(object instanceof String)) break block2;
                qd.h[n2] = clazz = Class.forName(i[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void k(qd qd2, Object object, int n2) {
        qd2.Q(object, n2);
    }

    static void E(qd qd2, Object object, float f10) {
        qd2.Y(object, f10);
    }

    private float[] b(Object object) {
        float[] fArray = new float[]{this.g.x(object), this.K.x(object), this.Z.x(object), this.B.x(object)};
        return fArray;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qd.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qd.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Object Y(qd qd2, Object object) {
        return qd2.k(object);
    }

    private void Q(Object object, int n2) {
        this.P.t(object, n2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qd.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qd.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private Object I(Object object) {
        return this.e.Z(object);
    }

    static void N(qd qd2, Object object, float f10) {
        qd2.I(object, f10);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

