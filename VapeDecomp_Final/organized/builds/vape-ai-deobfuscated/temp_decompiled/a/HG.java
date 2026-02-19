/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.F8;
import a.G5;
import a.N1;
import a.O_;
import a.SE;
import a.WL;
import a.X_;
import a.d8;
import a.fK;
import a.hh;
import a.zz;
import java.awt.Color;
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

public class hg
extends hh {
    private static final Map eb;
    private static final long ab;
    private static final Integer[] db;
    private fK fB;
    private static final Object[] fb;
    N1 D;
    private String Y;
    private static final long[] bb;
    private static final String[] jb;

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

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = hg.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                hg.fb[n2] = clazz = Class.forName(jb[n2]);
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

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "B:_";
        objectArray[1] = Integer.TYPE;
        hg.jb[1] = "java/lang/Integer";
        objectArray[2] = "&~\u0016p\t -q\u0007?t8>v\u000ev";
        objectArray[3] = "B&Vd}\u0014I)G+\u001c\u001aB\"Cq";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "O\u0001qY\"OD^4()_&\u0000z\u00133H\u001eR,G:$\u001fK0\u00190\u001a\u0018Z%\u0013B";
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1A83;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hg.db[n3] = n4;
        }
        return db[n3];
    }

    private String b(G5 g5, double d2) {
        long l10 = ab ^ 0x6EDAF973BE3CL;
        StringBuilder stringBuilder = new StringBuilder();
        for (zz zz2 : this.D.c()) {
            try {
                if (!zz2.o()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw hg.b(o_2);
            }
            try {
                if (stringBuilder.toString().length() < 1) {
                    stringBuilder.append(zz2.U());
                    continue;
                }
            }
            catch (O_ o_3) {
                throw hg.b(o_3);
            }
            String string = (String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)12091, (long)(0x3C022B9F7ED93CCAL ^ l10)), (long)680152398021947556L, (long)l10)) + zz2.U();
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (g5.D(stringBuilder2.append((Object)stringBuilder).append(string).toString()) < d2) {
                    stringBuilder.append(string);
                    continue;
                }
            }
            catch (O_ o_4) {
                throw hg.b(o_4);
            }
            stringBuilder.append((String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)13326, (long)(0x1AE6157BD41427FEL ^ l10)), (long)680152398021947556L, (long)l10)));
            break;
        }
        try {
            if (stringBuilder.length() < 1) {
                stringBuilder.append((String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)28323, (long)(0xC30246631D7D51L ^ l10)), (long)680152398021947556L, (long)l10)));
            }
        }
        catch (O_ o_5) {
            throw hg.b(o_5);
        }
        return stringBuilder.toString();
    }

    public hg() {
        long l10 = ab ^ 0x5AAB0DBC2C43L;
        this.D = SE.h.m();
        this.N(new WL(this));
        this.Y = hg.c("\u00e4", (int)hg.b("s", (int)25549, (long)(0x27F8A8BE3F5C6241L ^ l10)), (long)-7273498728559418661L, (long)l10);
        this.fB = new fK(this);
        Ao.K.S().B(this.fB);
    }

    private static Field g(long l10, long l11) {
        int n2 = hg.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = hg.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = hg.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = hg.c(clazz3, string2, clazz2)) != null) {
                    hg.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = hg.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        hg.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = hg.f(256999667609863L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static fK q(hg hg2) {
        return hg2.fB;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'W' || c10 == '\u00f9' || c10 == 'F' || c10 == 'T') {
                field = hg.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = hg.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 59;
                break;
            }
            case 1: {
                n4 = 61;
                break;
            }
            case 2: {
                n4 = 41;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 6;
                break;
            }
            case 5: {
                n4 = 46;
                break;
            }
            case 6: {
                n4 = 18;
                break;
            }
            case 7: {
                n4 = 42;
                break;
            }
            case 8: {
                n4 = 14;
                break;
            }
            case 9: {
                n4 = 48;
                break;
            }
            case 10: {
                n4 = 56;
                break;
            }
            case 11: {
                n4 = 53;
                break;
            }
            case 12: {
                n4 = 2;
                break;
            }
            case 13: {
                n4 = 58;
                break;
            }
            case 14: {
                n4 = 13;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 29;
                break;
            }
            case 18: {
                n4 = 63;
                break;
            }
            case 19: {
                n4 = 16;
                break;
            }
            case 20: {
                n4 = 30;
                break;
            }
            case 21: {
                n4 = 37;
                break;
            }
            case 22: {
                n4 = 3;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 38;
                break;
            }
            case 25: {
                n4 = 62;
                break;
            }
            case 26: {
                n4 = 20;
                break;
            }
            case 27: {
                n4 = 33;
                break;
            }
            case 28: {
                n4 = 35;
                break;
            }
            case 29: {
                n4 = 54;
                break;
            }
            case 30: {
                n4 = 49;
                break;
            }
            case 31: {
                n4 = 23;
                break;
            }
            case 32: {
                n4 = 32;
                break;
            }
            case 33: {
                n4 = 12;
                break;
            }
            case 34: {
                n4 = 36;
                break;
            }
            case 35: {
                n4 = 22;
                break;
            }
            case 36: {
                n4 = 50;
                break;
            }
            case 37: {
                n4 = 17;
                break;
            }
            case 38: {
                n4 = 1;
                break;
            }
            case 39: {
                n4 = 0;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 7;
                break;
            }
            case 42: {
                n4 = 10;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 11;
                break;
            }
            case 45: {
                n4 = 31;
                break;
            }
            case 46: {
                n4 = 55;
                break;
            }
            case 47: {
                n4 = 5;
                break;
            }
            case 48: {
                n4 = 60;
                break;
            }
            case 49: {
                n4 = 27;
                break;
            }
            case 50: {
                n4 = 9;
                break;
            }
            case 51: {
                n4 = 45;
                break;
            }
            case 52: {
                n4 = 34;
                break;
            }
            case 53: {
                n4 = 28;
                break;
            }
            case 54: {
                n4 = 44;
                break;
            }
            case 55: {
                n4 = 24;
                break;
            }
            case 56: {
                n4 = 43;
                break;
            }
            case 57: {
                n4 = 25;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 19;
                break;
            }
            case 60: {
                n4 = 57;
                break;
            }
            case 61: {
                n4 = 8;
                break;
            }
            case 62: {
                n4 = 4;
                break;
            }
            default: {
                n4 = 52;
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
        hg.jb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                hg.ab = d8.a(4531028661322023421L, 4256220933485090692L, MethodHandles.lookup().lookupClass()).a(53937455241640L);
                hg.fb = new Object[5];
                hg.jb = new String[5];
                hg.i();
                hg.eb = new HashMap<K, V>(13);
                var0 = hg.ab ^ 52195324433099L;
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
                var6_5 = "\u000e\u00bb-kq\u00e6\u0082\u00dd6\u00b8\u00dd\u00fc<\u00de\\b\u00f26|\u00b3\u000bf\u0011\u00cc\u00b0\u008a;\u001b\u009f\u0089e+\u001e\u009d\u00c0P\u009f:x\u0098";
                var7_6 = "\u000e\u00bb-kq\u00e6\u0082\u00dd6\u00b8\u00dd\u00fc<\u00de\\b\u00f26|\u00b3\u000bf\u0011\u00cc\u00b0\u008a;\u001b\u009f\u0089e+\u001e\u009d\u00c0P\u009f:x\u0098".length();
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
                    var6_5 = "tH6\u0088\u00de\u00ba\u0018\u0083\u00d1\u00f3\u00a5\u008a\u000b\u008d:\u00f4";
                    var7_6 = "tH6\u0088\u00de\u00ba\u0018\u0083\u00d1\u00f3\u00a5\u008a\u000b\u008d:\u00f4".length();
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
        hg.bb = var8_3;
        hg.db = new Integer[7];
    }

    private int e() {
        int n2 = 0;
        for (zz zz2 : this.D.c()) {
            try {
                if (!zz2.o()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw hg.b(o_2);
            }
            ++n2;
        }
        return n2;
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        Color color2;
        Color color3;
        G5 g5;
        G5 g52;
        long l10;
        block7: {
            block6: {
                l10 = ab ^ 0x518901D9CB47L;
                this.S();
                this.fB.T();
                g52 = this.L(0.9);
                g5 = this.L(0.75);
                color3 = hg.M.W;
                try {
                    if (!this.V()) break block6;
                    color2 = hg.M.c;
                    break block7;
                }
                catch (O_ o_2) {
                    throw hg.b(o_2);
                }
            }
            try {
                color2 = this.h() ? hg.M.c : hg.M.n;
            }
            catch (O_ o_3) {
                throw hg.b(o_3);
            }
        }
        Color color4 = color2;
        Color color5 = hg.M.w;
        float f10 = (float)(this.W() + this.b() / 2.0) - 3.0f;
        double d6 = g52.B(this.Y);
        double d7 = this.W() + this.b() / 2.0 - d6 / 2.0 - 2.5;
        double d9 = d7 + 7.5;
        try {
            d5 = this.G() + 5.0;
            d4 = this.W() + 2.5;
            d3 = this.w() - 10.0;
            d2 = this.b() - 5.0;
            color = this.h() ? M.j() : this.z().k();
        }
        catch (O_ o_4) {
            throw hg.b(o_4);
        }
        F8.S(d5, d4, d3, d2, color);
        F8.S(this.G() + 5.0 + 0.5, this.W() + 2.5 + 0.5, this.w() - 10.0 - 1.0, this.b() - 5.0 - 1.0, color3);
        g52.R(this.Y, this.G() + 15.0 + 8.0, d7, color4);
        g52.R("" + this.e(), this.G() + this.w() - 10.0 - g52.D((String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)5344, (long)(0x7141F982C3FD726FL ^ l10)), (long)8938339398702859743L, (long)l10))), d7, color4);
        g5.R(this.b(g5, this.w() - 35.0), this.G() + 15.0 + 8.0, d9, color5);
        X_.B(color4, (float)this.G() + 10.0f + 0.5f, f10, (String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)17739, (long)(0x585B2F871CA323C7L ^ l10)), (long)8938339398702859743L, (long)l10)), 6.0f, 6.0f, false);
        X_.B(hg.M.Y, (float)this.G() + 10.0f + 0.5f, f10, (String)((Object)hg.c("\u00e4", (int)hg.b("s", (int)3292, (long)(0x2E7DBC7982966A51L ^ l10)), (long)8938339398702859743L, (long)l10)), 6.0f, 6.0f, false);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = hg.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = hg.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = hg.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = hg.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = hg.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = hg.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method h(long l10, long l11) {
        int n2 = hg.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = hg.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = hg.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = hg.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        hg.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = hg.f(256999667609863L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = hg.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        hg.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = hg.f(256999667609863L, 0L);
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

    public String J() {
        return this.Y;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(hg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

