/*
 * Decompiled with CFR 0.152.
 */
package com.data.temporal;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ChronoDataSynchronizer {
    private static final Integer[] c;
    private static final long a;
    private static final DateFormat t;
    private static final DateFormat q;
    private static final long[] b;
    private static final Object[] e;
    private static final String[] f;
    private static final Map d;

    private static Field c(long l, long l2) {
        int n = ChronoDataSynchronizer.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ChronoDataSynchronizer.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ChronoDataSynchronizer.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ChronoDataSynchronizer.a(clazz3, string2, clazz2)) != null) {
                    ChronoDataSynchronizer.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ChronoDataSynchronizer.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ChronoDataSynchronizer.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ChronoDataSynchronizer.b(242548294827160L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static String H(Date date) {
        return t.format(date);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ChronoDataSynchronizer.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ChronoDataSynchronizer.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ChronoDataSynchronizer.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ChronoDataSynchronizer.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ChronoDataSynchronizer.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ChronoDataSynchronizer.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/r3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = ChronoDataSynchronizer.a(l, l2);
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
                clazz3 = ChronoDataSynchronizer.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ChronoDataSynchronizer.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ChronoDataSynchronizer.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ChronoDataSynchronizer.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ChronoDataSynchronizer.b(242548294827160L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ChronoDataSynchronizer.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ChronoDataSynchronizer.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ChronoDataSynchronizer.b(242548294827160L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static String T(Date date) {
        return q.format(date);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ff' || c == 'L' || c == '\u00ea' || c == '\u00d5') {
                field = ChronoDataSynchronizer.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ChronoDataSynchronizer.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
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
                n3 = 40;
                break;
            }
            case 2: {
                n3 = 21;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 17;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 48;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 29;
                break;
            }
            case 13: {
                n3 = 58;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 62;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 27;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 35;
                break;
            }
            case 24: {
                n3 = 54;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 1;
                break;
            }
            case 27: {
                n3 = 61;
                break;
            }
            case 28: {
                n3 = 49;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 18;
                break;
            }
            case 32: {
                n3 = 16;
                break;
            }
            case 33: {
                n3 = 24;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 35: {
                n3 = 32;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 39;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 0;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 4;
                break;
            }
            case 47: {
                n3 = 10;
                break;
            }
            case 48: {
                n3 = 8;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 13;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 30;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 57;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 11;
                break;
            }
            case 62: {
                n3 = 47;
                break;
            }
            default: {
                n3 = 23;
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
        ChronoDataSynchronizer.f[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/r3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ChronoDataSynchronizer.a = MultiContainerRegistry.a(616500511008164884L, -139052682381391562L, MethodHandles.lookup().lookupClass()).a(40670552322329L);
                var11 = ChronoDataSynchronizer.a ^ 52706437157201L;
                ChronoDataSynchronizer.e = new Object[5];
                ChronoDataSynchronizer.f = new String[5];
                ChronoDataSynchronizer.a();
                ChronoDataSynchronizer.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[15];
                var3_4 = 0;
                var4_5 = "Z#\u008f\u009d\u00b5\u00baO\u0005}\u00e3\u00f4\u00f4\u00babg\u00f3\u00f0B\u001e\u00c3J\u000b!\u00a5T_h\u00e7\u0083\u00b0s\u00cc\u00e0\u008c\u009d\u009e\u0097<A\u008ad\u009ba\u00e3\u0092\u00eb\u001f\u001a6[\u00f8\u008c\u00fa\r\u00a7[\u0081\u008a\u0016\u00f64yG\u00cf\u00a1\u00eaj\u00d8\u00ee\u008f7\u00a1\u0091\u00dd;cHq]\u009d\u00fb\u00bd\u00f7\u00cb#\u00b1\u000f[\u00b9C\u0006S\u00a1_\u00adki\u00cbc\u00fd\u0004\u0095\u0085^";
                var5_6 = "Z#\u008f\u009d\u00b5\u00baO\u0005}\u00e3\u00f4\u00f4\u00babg\u00f3\u00f0B\u001e\u00c3J\u000b!\u00a5T_h\u00e7\u0083\u00b0s\u00cc\u00e0\u008c\u009d\u009e\u0097<A\u008ad\u009ba\u00e3\u0092\u00eb\u001f\u001a6[\u00f8\u008c\u00fa\r\u00a7[\u0081\u008a\u0016\u00f64yG\u00cf\u00a1\u00eaj\u00d8\u00ee\u008f7\u00a1\u0091\u00dd;cHq]\u009d\u00fb\u00bd\u00f7\u00cb#\u00b1\u000f[\u00b9C\u0006S\u00a1_\u00adki\u00cbc\u00fd\u0004\u0095\u0085^".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "!q\u0004\u00b2\u00ff\u00a1\u00af\u0016/\u00d6\u00bc\u00cd\u001a}x\u00d0";
                    var5_6 = "!q\u0004\u00b2\u00ff\u00a1\u00af\u0016/\u00d6\u00bc\u00cd\u001a}x\u00d0".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        ChronoDataSynchronizer.b = var6_3;
        ChronoDataSynchronizer.c = new Integer[15];
        ChronoDataSynchronizer.t = new SimpleDateFormat((String)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)21906, (long)(3104120914328661565L ^ var11)), (long)3494869849898005167L, (long)var11));
        ChronoDataSynchronizer.q = new SimpleDateFormat((String)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)18173, (long)(5780327093610134877L ^ var11)), (long)3494869849898005167L, (long)var11));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B2A;
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
                throw new RuntimeException("a/r3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ChronoDataSynchronizer.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "2V7";
        objectArray[1] = Integer.TYPE;
        ChronoDataSynchronizer.f[1] = "java/lang/Integer";
        objectArray[2] = "_\t\\g\u0004|T\u0006M(ydG\u0001Da";
        objectArray[3] = "m\u001f-%C`f\u0010<j\"nm\u001b80";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "[{9eHwEy6\u0003\u0012h50oy\tpS|w{y*O)9~CpV:p\u0003";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ChronoDataSynchronizer.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ChronoDataSynchronizer.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String A(Date date) {
        Object object;
        StringBuilder stringBuilder;
        long l = a ^ 0x7DA5E9AD2FBCL;
        long l2 = System.currentTimeMillis() - date.getTime();
        try {
            if (l2 < 1000L) {
                return ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)3744, (long)(0x56D794885C1A8BE0L ^ l)), (long)-3572172717673198526L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ChronoDataSynchronizer.a(customSystemException);
        }
        if (l2 < 60000L) {
            Object object2;
            StringBuilder stringBuilder2;
            long l3 = l2 / 1000L;
            try {
                stringBuilder2 = new StringBuilder().append(l3).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)13612, (long)(0x18388953ECEA3062L ^ l)), (long)-3572172717673198526L, (long)l)));
                object2 = l3 == 1L ? "" : ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)15528, (long)(0x712F6521064E39E3L ^ l)), (long)-3572172717673198526L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ChronoDataSynchronizer.a(customSystemException);
            }
            return stringBuilder2.append((String)object2).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)12497, (long)(0x68C3EB9728823595L ^ l)), (long)-3572172717673198526L, (long)l))).toString();
        }
        if (l2 < 3600000L) {
            Object object3;
            StringBuilder stringBuilder3;
            long l4 = l2 / 60000L;
            try {
                stringBuilder3 = new StringBuilder().append(l4).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)20785, (long)(0x35F6B10D06A6547DL ^ l)), (long)-3572172717673198526L, (long)l)));
                object3 = l4 == 1L ? "" : ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)3993, (long)(0x77B949DA495B0AD8L ^ l)), (long)-3572172717673198526L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ChronoDataSynchronizer.a(customSystemException);
            }
            return stringBuilder3.append((String)object3).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)32221, (long)(0x1703DF92D2C7898L ^ l)), (long)-3572172717673198526L, (long)l))).toString();
        }
        if (l2 < 86400000L) {
            Object object4;
            StringBuilder stringBuilder4;
            long l5 = l2 / 3600000L;
            try {
                stringBuilder4 = new StringBuilder().append(l5).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)14160, (long)(0xD30530812A8B218L ^ l)), (long)-3572172717673198526L, (long)l)));
                object4 = l5 == 1L ? "" : ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)29181, (long)(0x22976D1581CFF4B7L ^ l)), (long)-3572172717673198526L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ChronoDataSynchronizer.a(customSystemException);
            }
            return stringBuilder4.append((String)object4).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)21454, (long)(0xC45B8D1C2AD5681L ^ l)), (long)-3572172717673198526L, (long)l))).toString();
        }
        long l6 = l2 / 86400000L;
        try {
            stringBuilder = new StringBuilder().append(l6).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)27304, (long)(0x7EE4E3FC4425EFEFL ^ l)), (long)-3572172717673198526L, (long)l)));
            object = l6 == 1L ? "" : ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)12009, (long)(0xAE518BF59682BAAL ^ l)), (long)-3572172717673198526L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw ChronoDataSynchronizer.a(customSystemException);
        }
        return stringBuilder.append((String)object).append((String)((Object)ChronoDataSynchronizer.b("\u00d4", (int)ChronoDataSynchronizer.a("p", (int)32541, (long)(0x5BE2459B1B75FA5BL ^ l)), (long)-3572172717673198526L, (long)l))).toString();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ChronoDataSynchronizer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ChronoDataSynchronizer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

