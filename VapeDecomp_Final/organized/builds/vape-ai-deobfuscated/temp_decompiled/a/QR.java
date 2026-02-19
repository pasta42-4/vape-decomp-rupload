/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Ib;
import a.Na;
import a.O_;
import a.SE;
import a.d8;
import a.eM;
import a.kX;
import a.qB;
import a.v2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class qr
extends v2 {
    private static final long[] d;
    private static final Integer[] g;
    private static final String[] j;
    private static final Map h;
    private Ib b;
    public HK e;
    private Ib f;
    private HK H;
    public HK c;
    private HK s;
    private Ib t;
    private Ib P;
    private static final Object[] i;
    private static final long a;
    public HK R;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qr.e(l10, l11);
            object = i[n2];
            try {
                if (!(object instanceof String)) break block2;
                qr.i[n2] = clazz = Class.forName(j[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qr.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void i(Object object, Object object2) {
        this.b.L(object, object2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qr.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method h(long l10, long l11) {
        int n2 = qr.e(l10, l11);
        Object object = i[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n2];
                int n4 = string2.indexOf(8);
                clazz3 = qr.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qr.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qr.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qr.i[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qr.f(756516105302189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qr.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qr.i[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qr.f(756516105302189L, 0L);
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

    static Object l(qr qr2, Object object) {
        return qr2.t(object);
    }

    static void R(qr qr2, Object object, Object object2) {
        qr2.i(object, object2);
    }

    boolean H(Object object, Object object2, float f10, boolean bl2) {
        return this.e.V(object, object2, Float.valueOf(f10), bl2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qr.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qr.d(classArray[i10], string, clazz2);
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
                qr.a = d8.a(-2152499858018229175L, 8117750998225230880L, MethodHandles.lookup().lookupClass()).a(136245817048815L);
                qr.i = new Object[15];
                qr.j = new String[15];
                qr.a();
                qr.h = new HashMap<K, V>(13);
                var0 = qr.a ^ 71880240705713L;
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
                var6_5 = "X\u001bR%\u0017\u00f9[\u00a7j\u00c5\u00cfC#\u008fU\u00f1y\u00cc\u00c9\u000e\u0004x\u00c9\u0000\u0080,\u0083\u00ae-\u0085\u00cc\u00d1\u009d\u001b\f\u008a\u00a6\u008e\u00f6M\f\f^i}\u00b7\r\u00d3I0\u0005\u00d4}l\u0002\u00ac\u00e3\u00b0\u00d0\u008d*G&\u009fz\u0010\u0085\u00fe\u00e4\u009e.\u00fba7a\u00e0\\\u00adc\u008d";
                var7_6 = "X\u001bR%\u0017\u00f9[\u00a7j\u00c5\u00cfC#\u008fU\u00f1y\u00cc\u00c9\u000e\u0004x\u00c9\u0000\u0080,\u0083\u00ae-\u0085\u00cc\u00d1\u009d\u001b\f\u008a\u00a6\u008e\u00f6M\f\f^i}\u00b7\r\u00d3I0\u0005\u00d4}l\u0002\u00ac\u00e3\u00b0\u00d0\u008d*G&\u009fz\u0010\u0085\u00fe\u00e4\u009e.\u00fba7a\u00e0\\\u00adc\u008d".length();
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
                    var6_5 = "\u00ea*97&U\u0012!\u00caw\u00ad\u00f0\u00b3\u00d7\u00cfO";
                    var7_6 = "\u00ea*97&U\u0012!\u00caw\u00ad\u00f0\u00b3\u00d7\u00cfO".length();
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
        qr.d = var8_3;
        qr.g = new Integer[12];
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (j[n5] != null) {
            return n5;
        }
        Object object = i[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 12;
                break;
            }
            case 1: {
                n4 = 34;
                break;
            }
            case 2: {
                n4 = 36;
                break;
            }
            case 3: {
                n4 = 11;
                break;
            }
            case 4: {
                n4 = 60;
                break;
            }
            case 5: {
                n4 = 33;
                break;
            }
            case 6: {
                n4 = 20;
                break;
            }
            case 7: {
                n4 = 54;
                break;
            }
            case 8: {
                n4 = 6;
                break;
            }
            case 9: {
                n4 = 61;
                break;
            }
            case 10: {
                n4 = 43;
                break;
            }
            case 11: {
                n4 = 13;
                break;
            }
            case 12: {
                n4 = 18;
                break;
            }
            case 13: {
                n4 = 41;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 39;
                break;
            }
            case 16: {
                n4 = 14;
                break;
            }
            case 17: {
                n4 = 2;
                break;
            }
            case 18: {
                n4 = 51;
                break;
            }
            case 19: {
                n4 = 40;
                break;
            }
            case 20: {
                n4 = 25;
                break;
            }
            case 21: {
                n4 = 56;
                break;
            }
            case 22: {
                n4 = 22;
                break;
            }
            case 23: {
                n4 = 28;
                break;
            }
            case 24: {
                n4 = 44;
                break;
            }
            case 25: {
                n4 = 46;
                break;
            }
            case 26: {
                n4 = 49;
                break;
            }
            case 27: {
                n4 = 63;
                break;
            }
            case 28: {
                n4 = 8;
                break;
            }
            case 29: {
                n4 = 19;
                break;
            }
            case 30: {
                n4 = 58;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 7;
                break;
            }
            case 33: {
                n4 = 59;
                break;
            }
            case 34: {
                n4 = 47;
                break;
            }
            case 35: {
                n4 = 3;
                break;
            }
            case 36: {
                n4 = 21;
                break;
            }
            case 37: {
                n4 = 31;
                break;
            }
            case 38: {
                n4 = 9;
                break;
            }
            case 39: {
                n4 = 62;
                break;
            }
            case 40: {
                n4 = 52;
                break;
            }
            case 41: {
                n4 = 57;
                break;
            }
            case 42: {
                n4 = 48;
                break;
            }
            case 43: {
                n4 = 1;
                break;
            }
            case 44: {
                n4 = 50;
                break;
            }
            case 45: {
                n4 = 55;
                break;
            }
            case 46: {
                n4 = 27;
                break;
            }
            case 47: {
                n4 = 35;
                break;
            }
            case 48: {
                n4 = 26;
                break;
            }
            case 49: {
                n4 = 38;
                break;
            }
            case 50: {
                n4 = 4;
                break;
            }
            case 51: {
                n4 = 5;
                break;
            }
            case 52: {
                n4 = 29;
                break;
            }
            case 53: {
                n4 = 10;
                break;
            }
            case 54: {
                n4 = 42;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 16;
                break;
            }
            case 57: {
                n4 = 30;
                break;
            }
            case 58: {
                n4 = 23;
                break;
            }
            case 59: {
                n4 = 17;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 45;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 32;
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
        qr.j[n5] = new String(cArray);
        return n5;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public qr() {
        block24: {
            long l10;
            block30: {
                int n2;
                int[] nArray;
                block27: {
                    int n3;
                    block25: {
                        block22: {
                            l10 = a ^ 0xCFCA9F48E39L;
                            int[] nArray2 = qB.s();
                            super(eM.PZ);
                            nArray = nArray2;
                            try {
                                block23: {
                                    try {
                                        try {
                                            n2 = Na.MC_1_21_10.H();
                                            if (nArray != null) break block22;
                                            if (n2 == 0) break block23;
                                        }
                                        catch (O_ o_2) {
                                            throw qr.a(o_2);
                                        }
                                        this.R = null;
                                        this.f = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)1171, (long)(0x2EB51762C0F2FFC6L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, (Object)eM.bV, (long)752148570308551489L, (long)l10);
                                        if (nArray == null) break block24;
                                    }
                                    catch (O_ o_3) {
                                        throw qr.a(o_3);
                                    }
                                }
                                n2 = kX.C();
                            }
                            catch (O_ o_4) {
                                throw qr.a(o_4);
                            }
                        }
                        try {
                            try {
                                block26: {
                                    try {
                                        try {
                                            n3 = 35;
                                            if (nArray != null) break block25;
                                            if (n2 < n3) break block26;
                                        }
                                        catch (O_ o_5) {
                                            throw qr.a(o_5);
                                        }
                                        this.R = qr.c("y", (Object)this, (Object)eM.Eg, (Object)qr.c("\u00f1", (int)qr.b("r", (int)24948, (long)(0x6BE19DED1B101A28L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.PE, Float.TYPE, Float.TYPE, eM.YH, eM.Ej, Integer.TYPE}, (long)752227577016587223L, (long)l10);
                                        this.f = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)7068, (long)(0x3BFCB3FE8E61E0CDL ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, (Object)eM.bV, (long)752148570308551489L, (long)l10);
                                        if (nArray == null) break block24;
                                    }
                                    catch (O_ o_6) {
                                        throw qr.a(o_6);
                                    }
                                }
                                n2 = kX.C();
                                if (nArray != null) break block27;
                            }
                            catch (O_ o_7) {
                                throw qr.a(o_7);
                            }
                            n3 = 13;
                        }
                        catch (O_ o_8) {
                            throw qr.a(o_8);
                        }
                    }
                    try {
                        block28: {
                            try {
                                if (n2 != n3) break block28;
                                this.t = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)4400, (long)(0x106BEB5A8E3A6A64L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, (Object)eM.UI, (long)752148570308551489L, (long)l10);
                                this.c = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)23257, (long)(0x39F1C60C3C90A18BL ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.Ut, Double.TYPE, Double.TYPE, Double.TYPE}, (long)752533742549665645L, (long)l10);
                                if (nArray == null) break block24;
                            }
                            catch (O_ o_9) {
                                throw qr.a(o_9);
                            }
                        }
                        n2 = SE.h.d() ? 1 : 0;
                    }
                    catch (O_ o_10) {
                        throw qr.a(o_10);
                    }
                }
                try {
                    block29: {
                        try {
                            if (n2 == 0) break block29;
                            this.b = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)3433, (long)(0x2849CC29FD5C7636L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, List.class, (long)752148570308551489L, (long)l10);
                            if (nArray == null) break block30;
                        }
                        catch (O_ o_11) {
                            throw qr.a(o_11);
                        }
                    }
                    this.b = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)26590, (long)(0x5774FEA823C99C83L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)Hc.z, List.class, (long)752148570308551489L, (long)l10);
                }
                catch (O_ o_12) {
                    throw qr.a(o_12);
                }
            }
            this.P = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)15992, (long)(0x1926C6ED65B5C52EL ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, FloatBuffer.class, (long)752148570308551489L, (long)l10);
            this.s = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)16119, (long)(0x252458A771A8C5A9L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, (Object)eM.UI, (Object)new Class[0], (long)752533742549665645L, (long)l10);
            this.R = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)14476, (long)(0x6DD757DDF61FC3DFL ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.Ut, Double.TYPE, Double.TYPE, Double.TYPE}, (long)752533742549665645L, (long)l10);
            this.H = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)5857, (long)(0x5A86CD7D5BF66DB6L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[0], (long)752533742549665645L, (long)l10);
            this.e = qr.c("y", (Object)this, (Object)qr.c("\u00f1", (int)qr.b("r", (int)551, (long)(0x6B93387624CC7977L ^ l10)), (long)752317498731321366L, (long)l10), (boolean)true, Boolean.TYPE, (Object)new Class[]{eM.Ut, Float.TYPE, Boolean.TYPE}, (long)752533742549665645L, (long)l10);
        }
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "WO\u0014\u001e";
        objectArray[1] = "Z*\u000fQ\u0015\u0014Q%\u001e\u001eh\fB\"\u0017W";
        objectArray[2] = Boolean.TYPE;
        qr.j[2] = "java/lang/Boolean";
        objectArray[3] = "\rj/x\u000ee\u0006e>7ce\u0006x*";
        objectArray[4] = "\u0017\u0012|3X\u0018b2w<IW\u000f2w!]B";
        objectArray[5] = ">'b/";
        objectArray[6] = "F%fZ\u000213\u0005mU\u0013~^\u0005mH\u0007k";
        objectArray[7] = "3\u0007%";
        objectArray[8] = Integer.TYPE;
        qr.j[8] = "java/lang/Integer";
        objectArray[9] = ".\u0014=\u001f";
        objectArray[10] = "%q-S\u0001\u0017.~<\u001c`\u0019%u8F";
        objectArray[11] = "Y7&BM\u0019T7u$5v\u000bkp]MN\\y,KrOVdt\u0019\u0003\u001a\rm*$H\u001b@uq\u001d\u000e\u001d@{O\u0018\tH\u000en&E\u001e\u000eT\u0007tGHI\u00038.\u001d\u001e\u00102";
        objectArray[12] = "jacb&ega0\u0004T\n;<xv'3}:xx\u00193mns;!d\u007f2e\u0004 nbj7uu5k4\n>txso3xrx}Q6\u007f'6h8khal\u0001ji>&;>03h\u007f\n";
        objectArray[13] = "\u0017*o.\u0001q\u001a*<He\u001eEv91\u0001&\u0012de'>'\u0018y=uOrCpcH\u0004s\u000eh8qBu\u000ef\u0006v]f\u0000%~x\\&\u0018\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\u000fXXI\u0004\u0005KQ\u0002HzPI8\u0003IFFSI\u0002D\u0018P2\u0001QF\u0003\u0004\nVC\u001a\u0015;";
    }

    static Object b(qr qr2, Object object) {
        return qr2.O(object);
    }

    private FloatBuffer b(Object object) {
        return (FloatBuffer)this.P.Z(object);
    }

    private Object t(Object object) {
        try {
            if (kX.C() >= 35) {
                return this.f.Z(object);
            }
        }
        catch (O_ o_2) {
            throw qr.a(o_2);
        }
        try {
            if (kX.C() == 13) {
                return this.t.Z(object);
            }
        }
        catch (O_ o_3) {
            throw qr.a(o_3);
        }
        return this.s.T(object, new Object[0]);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'Z' || c10 == '\u00ef' || c10 == 'w' || c10 == 'I') {
                field = qr.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qr.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qr.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qr.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static FloatBuffer C(qr qr2, Object object) {
        return qr2.b(object);
    }

    private static Field g(long l10, long l11) {
        int n2 = qr.e(l10, l11);
        Object object = i[n2];
        if (object instanceof String) {
            String string = j[n2];
            int n3 = string.indexOf(8);
            Class clazz = qr.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qr.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qr.c(clazz3, string2, clazz2)) != null) {
                    qr.i[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qr.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qr.i[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qr.f(756516105302189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private void t(Object object) {
        this.H.V(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7125;
        if (g[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qr", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qr.g[n3] = n4;
        }
        return g[n3];
    }

    private Object O(Object object) {
        return this.b.Z(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

