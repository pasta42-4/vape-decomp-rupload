/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D;
import a.GM;
import a.JH;
import a.JW;
import a.SE;
import a.WW;
import a.XJ;
import a.d8;
import a.kX;
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

class k
extends D {
    private static final long a;
    private static final String[] f;
    final GM F;
    private static final Integer[] c;
    private static final long[] b;
    private static final Map d;
    final boolean S;
    private static final Object[] e;
    final XJ i;
    final String I;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l10, long l11) {
        int n2 = k.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = k.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = k.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = k.a(clazz3, string2, clazz2)) != null) {
                    k.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = k.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        k.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = k.b(236199924398107L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = k.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = k.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Method d(long l10, long l11) {
        int n2 = k.a(l10, l11);
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
                clazz3 = k.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = k.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = k.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        k.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = k.b(236199924398107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = k.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        k.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = k.b(236199924398107L, 0L);
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

    private static int a(long l10, long l11) {
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
                n4 = 17;
                break;
            }
            case 1: {
                n4 = 11;
                break;
            }
            case 2: {
                n4 = 52;
                break;
            }
            case 3: {
                n4 = 14;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 31;
                break;
            }
            case 6: {
                n4 = 49;
                break;
            }
            case 7: {
                n4 = 7;
                break;
            }
            case 8: {
                n4 = 1;
                break;
            }
            case 9: {
                n4 = 43;
                break;
            }
            case 10: {
                n4 = 50;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 27;
                break;
            }
            case 13: {
                n4 = 4;
                break;
            }
            case 14: {
                n4 = 18;
                break;
            }
            case 15: {
                n4 = 22;
                break;
            }
            case 16: {
                n4 = 54;
                break;
            }
            case 17: {
                n4 = 15;
                break;
            }
            case 18: {
                n4 = 63;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 46;
                break;
            }
            case 21: {
                n4 = 16;
                break;
            }
            case 22: {
                n4 = 28;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 20;
                break;
            }
            case 25: {
                n4 = 41;
                break;
            }
            case 26: {
                n4 = 6;
                break;
            }
            case 27: {
                n4 = 21;
                break;
            }
            case 28: {
                n4 = 19;
                break;
            }
            case 29: {
                n4 = 35;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 51;
                break;
            }
            case 32: {
                n4 = 24;
                break;
            }
            case 33: {
                n4 = 13;
                break;
            }
            case 34: {
                n4 = 36;
                break;
            }
            case 35: {
                n4 = 5;
                break;
            }
            case 36: {
                n4 = 55;
                break;
            }
            case 37: {
                n4 = 33;
                break;
            }
            case 38: {
                n4 = 58;
                break;
            }
            case 39: {
                n4 = 34;
                break;
            }
            case 40: {
                n4 = 12;
                break;
            }
            case 41: {
                n4 = 42;
                break;
            }
            case 42: {
                n4 = 8;
                break;
            }
            case 43: {
                n4 = 0;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 44;
                break;
            }
            case 46: {
                n4 = 26;
                break;
            }
            case 47: {
                n4 = 38;
                break;
            }
            case 48: {
                n4 = 60;
                break;
            }
            case 49: {
                n4 = 30;
                break;
            }
            case 50: {
                n4 = 10;
                break;
            }
            case 51: {
                n4 = 25;
                break;
            }
            case 52: {
                n4 = 57;
                break;
            }
            case 53: {
                n4 = 62;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 9;
                break;
            }
            case 56: {
                n4 = 56;
                break;
            }
            case 57: {
                n4 = 3;
                break;
            }
            case 58: {
                n4 = 59;
                break;
            }
            case 59: {
                n4 = 45;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 47;
                break;
            }
            case 62: {
                n4 = 32;
                break;
            }
            default: {
                n4 = 39;
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
        k.f[n5] = new String(cArray);
        return n5;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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
                k.a = d8.a(5200311896105159029L, 8680454723413951008L, MethodHandles.lookup().lookupClass()).a(173165292163876L);
                k.e = new Object[5];
                k.f = new String[5];
                k.a();
                k.d = new HashMap<K, V>(13);
                var0 = k.a ^ 59600106217324L;
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
                var6_5 = "ay\u00d4\u0082\u00d1\u008d\u007fuqb\u009d-\u008a1P\u00e1\u00d2\u00ad\u00ce\u00e2\u0082\u00a6\u0088\u00ae\u00da\u00ce\u00aeU\b\u00fa\u00de\"\u00f6\u00ae\u0088\u0083Ti-\u00076\u00bc\u00d4\u00c8\u0089#jAb\u0097\u009ej\u00f6c\u00ad\t\u00a7\u00af\u0082\u00b0.\u00cf\u0018:\u008c\u0092\u0013!^Hd\u00ab\u009eu\u001b\u000469\u00d7Z\u0098CO\u008e\u00c0@\u00b7\u0091\u00fe\u000bM\u0080\u0098O\u00ef\u0016wF@\u009f\u00d3UIq#\u009b\t\u00f6\u0097\u008a\u00ea\u0015\u00ba\u0097MQ\u00dfh\u00da.\u00af\u00f5\u00e6\u00af0y~\u0017";
                var7_6 = "ay\u00d4\u0082\u00d1\u008d\u007fuqb\u009d-\u008a1P\u00e1\u00d2\u00ad\u00ce\u00e2\u0082\u00a6\u0088\u00ae\u00da\u00ce\u00aeU\b\u00fa\u00de\"\u00f6\u00ae\u0088\u0083Ti-\u00076\u00bc\u00d4\u00c8\u0089#jAb\u0097\u009ej\u00f6c\u00ad\t\u00a7\u00af\u0082\u00b0.\u00cf\u0018:\u008c\u0092\u0013!^Hd\u00ab\u009eu\u001b\u000469\u00d7Z\u0098CO\u008e\u00c0@\u00b7\u0091\u00fe\u000bM\u0080\u0098O\u00ef\u0016wF@\u009f\u00d3UIq#\u009b\t\u00f6\u0097\u008a\u00ea\u0015\u00ba\u0097MQ\u00dfh\u00da.\u00af\u00f5\u00e6\u00af0y~\u0017".length();
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
                    var6_5 = "\u00b6\u009e\u00d6F\u000b\u00e5\u00b5/Lu_p\u00b2\u0098}\u0096";
                    var7_6 = "\u00b6\u009e\u00d6F\u000b\u00e5\u00b5/Lu_p\u00b2\u0098}\u0096".length();
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
        k.b = var8_3;
        k.c = new Integer[18];
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5BB0;
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
                throw new RuntimeException("a/k", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            k.c[n3] = n4;
        }
        return c[n3];
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = k.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                k.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'S' || c10 == '\u00b5' || c10 == '\u00fb' || c10 == 'm') {
                field = k.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = k.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    @Override
    public void P(JW jW2) throws WW {
        block19: {
            long l10 = a ^ 0x646BD72121A3L;
            try {
                if (kX.C() < 50) {
                    return;
                }
            }
            catch (Exception exception) {
                throw k.a(exception);
            }
            try {
                block18: {
                    block17: {
                        if (!jW2.g().equals(XJ.x(this.i))) break block17;
                        try {
                            block20: {
                                if (!jW2.t().equals(k.b("\u00d3", (int)k.a("e", (int)2473, (long)(0x156AB9716A5F1CF6L ^ l10)), (long)-3539157038885306006L, (long)l10))) break block17;
                                break block20;
                                catch (Exception exception) {
                                    throw k.a(exception);
                                }
                            }
                            if (!jW2.n().E().equals(this.F)) break block17;
                        }
                        catch (Exception exception) {
                            throw k.a(exception);
                        }
                        String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)25753, (long)(0x62CAF8A8CB42F1DAL ^ l10)), (long)-3539157038885306006L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)1080, (long)(0x12B54BD49250116CL ^ l10)), (long)-3539157038885306006L, (long)l10));
                        jW2.N(string);
                        return;
                    }
                    if (!jW2.g().equals(XJ.H(this.i))) break block18;
                    try {
                        block21: {
                            if (!jW2.t().equals(k.b("\u00d3", (int)k.a("e", (int)7360, (long)(0x29899A50F17A0982L ^ l10)), (long)-3539157038885306006L, (long)l10))) break block18;
                            break block21;
                            catch (Exception exception) {
                                throw k.a(exception);
                            }
                        }
                        if (!jW2.n().E().equals(this.F)) break block18;
                    }
                    catch (Exception exception) {
                        throw k.a(exception);
                    }
                    String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)12823, (long)(0x14E4EF021BD5A74BL ^ l10)), (long)-3539157038885306006L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)11138, (long)(0x62463DBB24633ED2L ^ l10)), (long)-3539157038885306006L, (long)l10));
                    jW2.N(string);
                    return;
                }
                if (!jW2.g().equals(XJ.y(this.i))) break block19;
                try {
                    block22: {
                        if (!jW2.t().equals(k.b("\u00d3", (int)k.a("e", (int)27286, (long)(0x2B2B9FAFB1D77FC4L ^ l10)), (long)-3539157038885306006L, (long)l10))) break block19;
                        break block22;
                        catch (Exception exception) {
                            throw k.a(exception);
                        }
                    }
                    if (!jW2.n().E().equals(this.F)) break block19;
                }
                catch (Exception exception) {
                    throw k.a(exception);
                }
                String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)15514, (long)(0x3423B7E45ACEA9CFL ^ l10)), (long)-3539157038885306006L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)24036, (long)(0x752A081C9588C8BDL ^ l10)), (long)-3539157038885306006L, (long)l10));
                jW2.N(string);
                return;
            }
            catch (Exception exception) {
                SE.W(exception);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = k.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0017p.";
        objectArray[1] = Integer.TYPE;
        k.f[1] = "java/lang/Integer";
        objectArray[2] = "A\f9\u0014@`J\u0003([=xY\u0004!\u0012";
        objectArray[3] = "v\n\u0010|\u001c1}\u0005\u00013}?v\u000e\u0005i";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Z|V\u000bn2\u00006Yh{q;v\u0000\u001a!3IfV\u0019\u00103VtVW+3\n6Vh";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = k.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    k(XJ xJ2, GM gM, String string, boolean bl2) {
        this.i = xJ2;
        this.F = gM;
        this.I = string;
        this.S = bl2;
    }

    /*
     * Loose catch block
     */
    @Override
    public void K(JH jH2) throws WW {
        block25: {
            long l10 = a ^ 0x380E179BFCC1L;
            try {
                block26: {
                    block31: {
                        block23: {
                            block24: {
                                block29: {
                                    block21: {
                                        block22: {
                                            block27: {
                                                if (kX.C() >= 50) {
                                                    return;
                                                }
                                                if (!jH2.c().equals(XJ.e(this.i))) break block21;
                                                if (!jH2.C().equals(k.b("\u00d3", (int)k.a("e", (int)30915, (long)(0xAC9B2B5FC1530F7L ^ l10)), (long)1405192393309936648L, (long)l10))) break block21;
                                                break block27;
                                                catch (Exception exception) {
                                                    throw k.a(exception);
                                                }
                                            }
                                            try {
                                                block28: {
                                                    if (!this.S) break block22;
                                                    break block28;
                                                    catch (Exception exception) {
                                                        throw k.a(exception);
                                                    }
                                                }
                                                if (!jH2.a().E().equals(this.F)) break block21;
                                            }
                                            catch (Exception exception) {
                                                throw k.a(exception);
                                            }
                                        }
                                        String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)9649, (long)(0x2DCEA5EF609E6D8EL ^ l10)), (long)1405192393309936648L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)21278, (long)(0x4BA7C6EA514F1B27L ^ l10)), (long)1405192393309936648L, (long)l10));
                                        jH2.N(string);
                                        return;
                                    }
                                    if (!jH2.c().equals(XJ.L(this.i))) break block23;
                                    if (!jH2.C().equals(k.b("\u00d3", (int)k.a("e", (int)16289, (long)(0x6E6E78F7C606F79DL ^ l10)), (long)1405192393309936648L, (long)l10))) break block23;
                                    break block29;
                                    catch (Exception exception) {
                                        throw k.a(exception);
                                    }
                                }
                                try {
                                    block30: {
                                        if (!this.S) break block24;
                                        break block30;
                                        catch (Exception exception) {
                                            throw k.a(exception);
                                        }
                                    }
                                    if (!jH2.a().E().equals(this.F)) break block23;
                                }
                                catch (Exception exception) {
                                    throw k.a(exception);
                                }
                            }
                            String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)19632, (long)(0x1D070A0A5B100481L ^ l10)), (long)1405192393309936648L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)31382, (long)(0x13AC06E7235932A3L ^ l10)), (long)1405192393309936648L, (long)l10));
                            jH2.N(string);
                            return;
                        }
                        if (!jH2.c().equals(XJ.T(this.i))) break block25;
                        if (!jH2.C().equals(k.b("\u00d3", (int)k.a("e", (int)3157, (long)(0x682547E77E7446FL ^ l10)), (long)1405192393309936648L, (long)l10))) break block25;
                        break block31;
                        catch (Exception exception) {
                            throw k.a(exception);
                        }
                    }
                    try {
                        block32: {
                            if (!this.S) break block26;
                            break block32;
                            catch (Exception exception) {
                                throw k.a(exception);
                            }
                        }
                        if (!jH2.a().E().equals(this.F)) break block25;
                    }
                    catch (Exception exception) {
                        throw k.a(exception);
                    }
                }
                String string = (String)((Object)k.b("\u00d3", (int)k.a("e", (int)28816, (long)(0x571EFFA5C19638A3L ^ l10)), (long)1405192393309936648L, (long)l10)) + this.I + (String)((Object)k.b("\u00d3", (int)k.a("e", (int)10058, (long)(0x42FB77FD5CE1EF72L ^ l10)), (long)1405192393309936648L, (long)l10));
                jH2.N(string);
                return;
            }
            catch (Exception exception) {
                SE.W(exception);
            }
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = k.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = k.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

