/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ib;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.ln;
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

public class lw
extends v2 {
    private Ib i;
    private static final long[] b;
    private Ib u;
    private static final Integer[] c;
    private static final Map d;
    private Ib j;
    private static final long a;
    private Ib k;
    private static final Object[] e;
    private static final String[] f;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lw.a = d8.a(7649020131945303242L, 2917262676727726311L, MethodHandles.lookup().lookupClass()).a(224425481434963L);
                lw.e = new Object[10];
                lw.f = new String[10];
                lw.a();
                lw.d = new HashMap<K, V>(13);
                var0 = lw.a ^ 97632289137598L;
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
                var6_5 = "\u00d3$\u009e\u00e4|\u00a2\u00f81Pt\u00bd\u0002M]\u00c1M\u009b\u00a0\u001f\u0013\u009c\u00fc\u0093J\u00bfG\u00de\u00ae\u00e7(G\u00c0\u00b1 \u00f7\u008f\u00f7=Z\u0015";
                var7_6 = "\u00d3$\u009e\u00e4|\u00a2\u00f81Pt\u00bd\u0002M]\u00c1M\u009b\u00a0\u001f\u0013\u009c\u00fc\u0093J\u00bfG\u00de\u00ae\u00e7(G\u00c0\u00b1 \u00f7\u008f\u00f7=Z\u0015".length();
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
                    var6_5 = "fN\u00c6&\u0093c\u008e\f.\u00ef\u00ddk\u0001\u00e1\u009cq";
                    var7_6 = "fN\u00c6&\u0093c\u008e\f.\u00ef\u00ddk\u0001\u00e1\u009cq".length();
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
        lw.b = var8_3;
        lw.c = new Integer[7];
    }

    private static Field g(long l10, long l11) {
        int n2 = lw.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = lw.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = lw.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = lw.c(clazz3, string2, clazz2)) != null) {
                    lw.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = lw.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        lw.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = lw.f(553685297905098L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x15C1;
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
                throw new RuntimeException("a/lw", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lw.c[n3] = n4;
        }
        return c[n3];
    }

    private static Method h(long l10, long l11) {
        int n2 = lw.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = lw.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = lw.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = lw.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        lw.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = lw.f(553685297905098L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = lw.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        lw.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = lw.f(553685297905098L, 0L);
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

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 23;
                break;
            }
            case 1: {
                n4 = 57;
                break;
            }
            case 2: {
                n4 = 27;
                break;
            }
            case 3: {
                n4 = 42;
                break;
            }
            case 4: {
                n4 = 17;
                break;
            }
            case 5: {
                n4 = 33;
                break;
            }
            case 6: {
                n4 = 15;
                break;
            }
            case 7: {
                n4 = 5;
                break;
            }
            case 8: {
                n4 = 1;
                break;
            }
            case 9: {
                n4 = 40;
                break;
            }
            case 10: {
                n4 = 2;
                break;
            }
            case 11: {
                n4 = 3;
                break;
            }
            case 12: {
                n4 = 60;
                break;
            }
            case 13: {
                n4 = 24;
                break;
            }
            case 14: {
                n4 = 35;
                break;
            }
            case 15: {
                n4 = 61;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 6;
                break;
            }
            case 18: {
                n4 = 22;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 53;
                break;
            }
            case 22: {
                n4 = 47;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 44;
                break;
            }
            case 25: {
                n4 = 31;
                break;
            }
            case 26: {
                n4 = 0;
                break;
            }
            case 27: {
                n4 = 7;
                break;
            }
            case 28: {
                n4 = 59;
                break;
            }
            case 29: {
                n4 = 29;
                break;
            }
            case 30: {
                n4 = 20;
                break;
            }
            case 31: {
                n4 = 10;
                break;
            }
            case 32: {
                n4 = 8;
                break;
            }
            case 33: {
                n4 = 63;
                break;
            }
            case 34: {
                n4 = 9;
                break;
            }
            case 35: {
                n4 = 32;
                break;
            }
            case 36: {
                n4 = 55;
                break;
            }
            case 37: {
                n4 = 12;
                break;
            }
            case 38: {
                n4 = 13;
                break;
            }
            case 39: {
                n4 = 38;
                break;
            }
            case 40: {
                n4 = 18;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 25;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 4;
                break;
            }
            case 46: {
                n4 = 62;
                break;
            }
            case 47: {
                n4 = 11;
                break;
            }
            case 48: {
                n4 = 56;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 51;
                break;
            }
            case 51: {
                n4 = 28;
                break;
            }
            case 52: {
                n4 = 41;
                break;
            }
            case 53: {
                n4 = 39;
                break;
            }
            case 54: {
                n4 = 34;
                break;
            }
            case 55: {
                n4 = 16;
                break;
            }
            case 56: {
                n4 = 30;
                break;
            }
            case 57: {
                n4 = 49;
                break;
            }
            case 58: {
                n4 = 46;
                break;
            }
            case 59: {
                n4 = 54;
                break;
            }
            case 60: {
                n4 = 19;
                break;
            }
            case 61: {
                n4 = 52;
                break;
            }
            case 62: {
                n4 = 14;
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
        lw.f[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = lw.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                lw.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = lw.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = lw.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public lw() {
        block11: {
            CallSite callSite;
            block9: {
                long l10 = a ^ 0x5E93D2DFF5E0L;
                ht[] htArray = ln.U();
                super(eM.UU);
                ht[] htArray2 = htArray;
                try {
                    lw lw2;
                    block10: {
                        try {
                            try {
                                lw2 = this;
                                callSite = lw.c("y", (Object)this, (Object)lw.c("\u00c6", (int)lw.b("e", (int)6412, (long)(0x3E0A9C4EB12AC34BL ^ l10)), (long)-3493028759377308511L, (long)l10), (boolean)true, Integer.TYPE, (long)-3493067759726200994L, (long)l10);
                                if (htArray2 == null) break block9;
                                lw2.k = callSite;
                                if (!Na.MC_1_21_11.H()) break block10;
                            }
                            catch (O_ o_2) {
                                throw lw.a(o_2);
                            }
                            this.j = lw.c("y", (Object)this, (Object)lw.c("\u00c6", (int)lw.b("e", (int)28297, (long)(0x385A69EC7FAB34CCL ^ l10)), (long)-3493028759377308511L, (long)l10), (boolean)true, Integer.TYPE, (long)-3493067759726200994L, (long)l10);
                            this.u = lw.c("y", (Object)this, (Object)lw.c("\u00c6", (int)lw.b("e", (int)24324, (long)(0x3D8981527C150547L ^ l10)), (long)-3493028759377308511L, (long)l10), (boolean)true, Integer.TYPE, (long)-3493067759726200994L, (long)l10);
                            this.i = lw.c("y", (Object)this, (Object)lw.c("\u00c6", (int)lw.b("e", (int)15766, (long)(0x71BDCEF4F0F67D2L ^ l10)), (long)-3493028759377308511L, (long)l10), (boolean)true, (Object)eM.YI, (long)-3493067759726200994L, (long)l10);
                            if (htArray2 != null) break block11;
                        }
                        catch (O_ o_3) {
                            throw lw.a(o_3);
                        }
                    }
                    lw2 = this;
                    callSite = lw.c("y", (Object)this, (Object)lw.c("\u00c6", (int)lw.b("e", (int)20434, (long)(0x669900C1F3DA9593L ^ l10)), (long)-3493028759377308511L, (long)l10), (boolean)true, (Object)eM.YI, (long)-3493067759726200994L, (long)l10);
                }
                catch (O_ o_4) {
                    throw lw.a(o_4);
                }
            }
            lw2.i = callSite;
        }
        try {
            if (ht.J() != null) {
                ln.d(new ht[5]);
            }
        }
        catch (O_ o_5) {
            throw lw.a(o_5);
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = lw.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = lw.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = lw.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c9' || c10 == '\u00e8' || c10 == 'Q' || c10 == '\u00cd') {
                field = lw.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = lw.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Loose catch block
     */
    public int z(Object object, int n2) {
        long l10 = a ^ 0x11502B537716L;
        try {
            block9: {
                block10: {
                    Method method;
                    Object object2;
                    int n3;
                    Object object3;
                    block11: {
                        int n4;
                        if (!Na.MC_1_21_11.H()) break block9;
                        try {
                            block12: {
                                if (this.j == null) break block10;
                                break block12;
                                catch (Exception exception) {
                                    throw lw.a(exception);
                                }
                            }
                            if (this.u == null) break block10;
                        }
                        catch (Exception exception) {
                            throw lw.a(exception);
                        }
                        int n5 = this.u.R(object);
                        if (n5 != n2 || (n4 = this.j.R(object)) == -1) break block11;
                        return n4;
                    }
                    if (this.i != null && (object3 = this.i.Z(object)) != null && (n3 = ((Integer)(object2 = (method = object3.getClass().getMethod((String)((Object)lw.c("\u00c6", (int)lw.b("e", (int)17074, (long)(0x4DC7EE24D9929A04L ^ l10)), (long)5579972146196321879L, (long)l10)), Integer.TYPE)).invoke(object3, n2))).intValue()) != 0) {
                        return n3;
                    }
                }
                return -1;
            }
            if (this.i == null) {
                return -1;
            }
            Object object4 = this.i.Z(object);
            if (object4 == null) {
                return -1;
            }
            Method method = object4.getClass().getMethod((String)((Object)lw.c("\u00c6", (int)lw.b("e", (int)10236, (long)(0x7FD4350999A3FF4CL ^ l10)), (long)5579972146196321879L, (long)l10)), Integer.TYPE);
            Object object5 = method.invoke(object4, n2);
            return (Integer)object5;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "[\u001fQ";
        objectArray[1] = Integer.TYPE;
        lw.f[1] = "java/lang/Integer";
        objectArray[2] = "Q?#+`\\Z02d\u001dDI7;-";
        objectArray[3] = "\u001f?k\u007f";
        objectArray[4] = Boolean.TYPE;
        lw.f[4] = "java/lang/Boolean";
        objectArray[5] = "ST\u0007LBCX[\u0016\u0003/CXF\u0002";
        objectArray[6] = "8T~(";
        objectArray[7] = "T\u001bq+iz_\u0014`d\btT\u001fd>";
        objectArray[8] = "JzxOo{\n?8KQ\u0011p|c\u000e4#\u000e#i\n-JK/<U5z\u0001.>\\Qq\u000b5?U.;@t~2m+L%kR(4\r'\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u001d\"8\u001aa\u000e\u0002s!`j\u000br:/\u0010{\u001eJv9\f\u0001I\u0015t%\t\u007f\u0016\u001fp<`";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int l(Object object) {
        return this.k.R(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = lw.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lw.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(lw.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

