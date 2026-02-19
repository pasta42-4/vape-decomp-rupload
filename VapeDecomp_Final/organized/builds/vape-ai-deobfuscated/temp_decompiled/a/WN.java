/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dl;
import a.Hc;
import a.Iv;
import a.Na;
import a.O_;
import a.QX;
import a.V4;
import a.XH;
import a.Xu;
import a.d8;
import a.eM;
import a.fe;
import a.hQ;
import a.kX;
import a.os;
import a.wd;
import a.yK;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wn
extends wd {
    private static final Integer[] fb;
    private static final long ab;
    private static final String[] rb;
    private static final Object[] qb;
    public static final List<V4> jj;
    private static final long[] eb;
    private static final Map lb;
    private fe jr;

    @Override
    public void i() {
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = wn.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wn.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void E() {
        super.E();
        this.i(this.b());
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x425D;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wn", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wn.fb[n3] = n4;
        }
        return fb[n3];
    }

    @Override
    public double b() {
        return 110.0;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    static fe S(wn wn2) {
        return wn2.jr;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wn.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wn.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method p(long l10, long l11) {
        int n2 = wn.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wn.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wn.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wn.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        wn.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wn.n(277134569152244L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wn.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wn.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wn.n(277134569152244L, 0L);
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

    private static Field o(long l10, long l11) {
        int n2 = wn.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wn.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wn.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wn.g(clazz3, string2, clazz2)) != null) {
                    wn.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wn.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wn.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wn.n(277134569152244L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public wn(fe fe2) {
        this.jr = fe2;
        this.Ol = false;
        this.d().m(false);
        this.d().i(false);
        this.d().v(false);
        this.N(true);
        this.I();
    }

    public List<V4> p() {
        ArrayList<V4> arrayList = new ArrayList<V4>();
        for (V4 v42 : Xu.K()) {
            try {
                if (!v42.g().toLowerCase(Locale.ROOT).contains(this.jr.s().toLowerCase(Locale.ROOT))) continue;
                arrayList.add(v42);
            }
            catch (O_ o_2) {
                throw wn.a(o_2);
            }
        }
        return arrayList;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 9;
                break;
            }
            case 1: {
                n4 = 18;
                break;
            }
            case 2: {
                n4 = 45;
                break;
            }
            case 3: {
                n4 = 60;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 23;
                break;
            }
            case 6: {
                n4 = 62;
                break;
            }
            case 7: {
                n4 = 51;
                break;
            }
            case 8: {
                n4 = 28;
                break;
            }
            case 9: {
                n4 = 30;
                break;
            }
            case 10: {
                n4 = 48;
                break;
            }
            case 11: {
                n4 = 10;
                break;
            }
            case 12: {
                n4 = 57;
                break;
            }
            case 13: {
                n4 = 32;
                break;
            }
            case 14: {
                n4 = 14;
                break;
            }
            case 15: {
                n4 = 0;
                break;
            }
            case 16: {
                n4 = 33;
                break;
            }
            case 17: {
                n4 = 12;
                break;
            }
            case 18: {
                n4 = 13;
                break;
            }
            case 19: {
                n4 = 42;
                break;
            }
            case 20: {
                n4 = 56;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 35;
                break;
            }
            case 23: {
                n4 = 52;
                break;
            }
            case 24: {
                n4 = 54;
                break;
            }
            case 25: {
                n4 = 29;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 22;
                break;
            }
            case 28: {
                n4 = 5;
                break;
            }
            case 29: {
                n4 = 16;
                break;
            }
            case 30: {
                n4 = 15;
                break;
            }
            case 31: {
                n4 = 47;
                break;
            }
            case 32: {
                n4 = 34;
                break;
            }
            case 33: {
                n4 = 38;
                break;
            }
            case 34: {
                n4 = 58;
                break;
            }
            case 35: {
                n4 = 7;
                break;
            }
            case 36: {
                n4 = 1;
                break;
            }
            case 37: {
                n4 = 37;
                break;
            }
            case 38: {
                n4 = 19;
                break;
            }
            case 39: {
                n4 = 53;
                break;
            }
            case 40: {
                n4 = 8;
                break;
            }
            case 41: {
                n4 = 17;
                break;
            }
            case 42: {
                n4 = 27;
                break;
            }
            case 43: {
                n4 = 11;
                break;
            }
            case 44: {
                n4 = 25;
                break;
            }
            case 45: {
                n4 = 20;
                break;
            }
            case 46: {
                n4 = 36;
                break;
            }
            case 47: {
                n4 = 21;
                break;
            }
            case 48: {
                n4 = 41;
                break;
            }
            case 49: {
                n4 = 61;
                break;
            }
            case 50: {
                n4 = 4;
                break;
            }
            case 51: {
                n4 = 55;
                break;
            }
            case 52: {
                n4 = 63;
                break;
            }
            case 53: {
                n4 = 24;
                break;
            }
            case 54: {
                n4 = 39;
                break;
            }
            case 55: {
                n4 = 3;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 44;
                break;
            }
            case 58: {
                n4 = 46;
                break;
            }
            case 59: {
                n4 = 40;
                break;
            }
            case 60: {
                n4 = 31;
                break;
            }
            case 61: {
                n4 = 26;
                break;
            }
            case 62: {
                n4 = 43;
                break;
            }
            default: {
                n4 = 49;
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
        wn.rb[n5] = new String(cArray);
        return n5;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d9' || c10 == 'c' || c10 == '\u00d8' || c10 == 'w') {
                field = wn.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wn.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double w() {
        return super.w();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wn.ab = d8.a(191739385918542179L, 4937381949490451872L, MethodHandles.lookup().lookupClass()).a(202405280887721L);
                wn.qb = new Object[5];
                wn.rb = new String[5];
                wn.T();
                wn.lb = new HashMap<K, V>(13);
                var0 = wn.ab ^ 32668740846159L;
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
                var6_5 = "\u00f7'\u00f4\u00a4[\u00a1\u009a!\u00f9\u00ff\u0015\u0018v\u0093\u00db*!\u0080\u0095;\u009e\u0090\u00fa\u00af\u00e9#N<\u0001\u0097\u00d7C\u009f1\u0017\u0091\u00fbn\u00e8\u000e\u001b\u00cd\u00fa\u00a8\u00d6\u00a4\u00f8\u00e0";
                var7_6 = "\u00f7'\u00f4\u00a4[\u00a1\u009a!\u00f9\u00ff\u0015\u0018v\u0093\u00db*!\u0080\u0095;\u009e\u0090\u00fa\u00af\u00e9#N<\u0001\u0097\u00d7C\u009f1\u0017\u0091\u00fbn\u00e8\u000e\u001b\u00cd\u00fa\u00a8\u00d6\u00a4\u00f8\u00e0".length();
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
                    var6_5 = "\u0011n\u00ec\u008a\u00abU\u00fb\u0015xb\u0007\u009a\u00eec\u00e3K";
                    var7_6 = "\u0011n\u00ec\u008a\u00abU\u00fb\u0015xb\u0007\u009a\u00eec\u00e3K".length();
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
        wn.eb = var8_3;
        wn.fb = new Integer[8];
        wn.jj = new ArrayList<V4>();
        wn.P();
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wn.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wn.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void X() {
        long l10 = ab ^ 0x6D4A33E15369L;
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(wn.e("\u00cc", (int)wn.d("d", (int)27099, (long)(0x30F475E9A4693E28L ^ l10)), (long)1561456565105875105L, (long)l10), wn.e("\u00cc", (int)wn.d("d", (int)18874, (long)(0x657238E9C7AC1E4AL ^ l10)), (long)1561456565105875105L, (long)l10), wn.e("\u00cc", (int)wn.d("d", (int)6866, (long)(0xFDE24A6EE8ECD24L ^ l10)), (long)1561456565105875105L, (long)l10), wn.e("\u00cc", (int)wn.d("d", (int)1703, (long)(0x1E5E896000E6D150L ^ l10)), (long)1561456565105875105L, (long)l10), wn.e("\u00cc", (int)wn.d("d", (int)19362, (long)(0x2778CE696BCA1C53L ^ l10)), (long)1561456565105875105L, (long)l10)));
        for (Object e10 : QX.e().K()) {
            Hc hc2;
            Object object;
            if (kX.C() == 13) {
                object = QX.e().D(e10);
            } else {
                hc2 = new Dl(e10);
                object = QX.e().D(hc2.M());
            }
            if (!eM.VP.isInstance(object)) continue;
            hc2 = new QX(object);
            List list = new ArrayList();
            if (kX.C() >= 23) {
                list = (List)os.x().M();
            }
            ((QX)hc2).l((QX)hc2, list);
            block7: for (Object e11 : list) {
                V4 v42 = new V4(e11);
                try {
                    if (v42.C().O() == 62) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw wn.a(o_2);
                }
                String string = v42.g().toLowerCase(Locale.ROOT);
                try {
                    if (!string.contains((CharSequence)((Object)wn.e("\u00cc", (int)wn.d("d", (int)16817, (long)(0x1F1BE8F4876E1643L ^ l10)), (long)1561456565105875105L, (long)l10)))) {
                        continue;
                    }
                }
                catch (O_ o_3) {
                    throw wn.a(o_3);
                }
                for (String string2 : arrayList) {
                    try {
                        if (!string.contains(string2)) continue;
                        jj.add(v42);
                        arrayList.remove(string2);
                        continue block7;
                    }
                    catch (O_ o_4) {
                        throw wn.a(o_4);
                    }
                }
            }
        }
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "\u0013\u0002c";
        objectArray[1] = Integer.TYPE;
        wn.rb[1] = "java/lang/Integer";
        objectArray[2] = "uJ\u0016GYm~E\u0007\b$umB\u000eA";
        objectArray[3] = ":D]`\"/1KL/C!:@Hu";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\ncjp5<\u0004l+\u001d=<;`k\"7>[mlqV~Xs2,'#\u0003p2\u001d";
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void I() {
        List<V4> list;
        long l10;
        block10: {
            block7: {
                l10 = ab ^ 0x4A230D7FD31DL;
                try {
                    this.k();
                    if (this.jr.s() == null || this.jr.s().length() <= 0) break block7;
                }
                catch (O_ o_2) {
                    throw wn.a(o_2);
                }
                list = this.p();
                break block10;
            }
            list = jj;
        }
        for (int i10 = 0; i10 < list.size(); ++i10) {
            Object object;
            Object[] objectArray;
            hQ hQ2;
            wn wn2;
            block9: {
                block8: {
                    int n2 = i10;
                    try {
                        try {
                            wn2 = this;
                            hQ2 = new yK(wn.M.g, wn.M.S, list.get(i10)).N(new XH(this, list, n2));
                            Object[] objectArray2 = new Object[1];
                            Object[] objectArray3 = objectArray2;
                            objectArray = objectArray2;
                            int n3 = 0;
                            if (i10 <= 0 || (i10 + 1) % 9 != 0) break block8;
                        }
                        catch (O_ o_3) {
                            throw wn.a(o_3);
                        }
                        object = wn.e("\u00cc", (int)wn.d("d", (int)25896, (long)(0x4A1586FDFEA9B2A9L ^ l10)), (long)-7647306711412713259L, (long)l10);
                        break block9;
                    }
                    catch (O_ o_4) {
                        throw wn.a(o_4);
                    }
                }
                object = "";
            }
            objectArray3[n3] = object;
            wn2.n(hQ2, objectArray);
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wn.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x3E1E5B470552L;
        return wn.e("\u00cc", (int)wn.d("d", (int)25588, (long)(0xDA5C6295B30E23BL ^ l10)), (long)4868456263793512090L, (long)l10);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void u() {
    }

    private static void P() {
        block7: {
            block10: {
                block9: {
                    block8: {
                        block6: {
                            try {
                                if (!Na.MC_1_21_4.H()) break block6;
                                jj.add(new Iv(869).J());
                                jj.add(new Iv(871).J());
                                jj.add(new Iv(872).J());
                                jj.add(new Iv(832).J());
                                jj.add(new Iv(1038).J());
                                jj.add(new Iv(1042).J());
                                jj.add(new Iv(945).J());
                                jj.add(new Iv(960).J());
                                jj.add(new Iv(980).J());
                                jj.add(new Iv(915).J());
                                jj.add(new Iv(916).J());
                                jj.add(new Iv(880).J());
                                jj.add(new Iv(662).J());
                                wn.X();
                                jj.add(new Iv(615).J());
                                jj.add(new Iv(1).J());
                                break block7;
                            }
                            catch (O_ o_2) {
                                throw wn.a(o_2);
                            }
                        }
                        try {
                            if (kX.C() < 35) break block8;
                            jj.add(new Iv(603).J());
                            jj.add(new Iv(605).J());
                            jj.add(new Iv(606).J());
                            jj.add(new Iv(574).J());
                            jj.add(new Iv(740).J());
                            jj.add(new Iv(744).J());
                            jj.add(new Iv(666).J());
                            jj.add(new Iv(682).J());
                            jj.add(new Iv(684).J());
                            jj.add(new Iv(650).J());
                            jj.add(new Iv(651).J());
                            jj.add(new Iv(661).J());
                            jj.add(new Iv(662).J());
                            wn.X();
                            jj.add(new Iv(615).J());
                            jj.add(new Iv(1).J());
                            break block7;
                        }
                        catch (O_ o_3) {
                            throw wn.a(o_3);
                        }
                    }
                    try {
                        jj.add(new Iv(276).J());
                        jj.add(new Iv(278).J());
                        jj.add(new Iv(279).J());
                        jj.add(new Iv(261).J());
                        jj.add(new Iv(364).J());
                        jj.add(new Iv(368).J());
                        jj.add(new Iv(332).J());
                        jj.add(new Iv(344).J());
                        jj.add(new Iv(346).J());
                        jj.add(new Iv(322).J());
                        jj.add(new Iv(322).T(1).J());
                        jj.add(new Iv(326).J());
                        jj.add(new Iv(327).J());
                        if (kX.C() < 23) break block9;
                        wn.X();
                        break block10;
                    }
                    catch (O_ o_4) {
                        throw wn.a(o_4);
                    }
                }
                jj.add(new Iv(373).T(8259).J());
                jj.add(new Iv(373).T(8258).J());
                jj.add(new Iv(373).T(16421).J());
                jj.add(new Iv(373).T(16388).J());
                jj.add(new Iv(373).T(16449).J());
            }
            jj.add(new Iv(282).J());
            jj.add(new Iv(1).J());
        }
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wn.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wn.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(wn.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

