/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.Tk;
import a.Tw;
import a.YC;
import a.Yl;
import a.ZA;
import a.d8;
import a.ry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s3
extends Enum<s3> {
    private static final long[] b;
    private final Map<ry, List<Class<? extends I4>>> V = new HashMap<ry, List<Class<? extends I4>>>();
    private static final Object[] e;
    private static final Map d;
    public static final /* enum */ s3 AUTHENTICATED;
    private static final Integer[] c;
    public static final /* enum */ s3 UNAUTHENTICATED;
    private static final s3[] M;
    private static final String[] f;
    private static final long a;

    s3(YC yC2) {
        this();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = s3.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = s3.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
                n4 = 46;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 27;
                break;
            }
            case 3: {
                n4 = 9;
                break;
            }
            case 4: {
                n4 = 13;
                break;
            }
            case 5: {
                n4 = 11;
                break;
            }
            case 6: {
                n4 = 39;
                break;
            }
            case 7: {
                n4 = 0;
                break;
            }
            case 8: {
                n4 = 59;
                break;
            }
            case 9: {
                n4 = 18;
                break;
            }
            case 10: {
                n4 = 42;
                break;
            }
            case 11: {
                n4 = 58;
                break;
            }
            case 12: {
                n4 = 34;
                break;
            }
            case 13: {
                n4 = 35;
                break;
            }
            case 14: {
                n4 = 20;
                break;
            }
            case 15: {
                n4 = 40;
                break;
            }
            case 16: {
                n4 = 49;
                break;
            }
            case 17: {
                n4 = 55;
                break;
            }
            case 18: {
                n4 = 32;
                break;
            }
            case 19: {
                n4 = 21;
                break;
            }
            case 20: {
                n4 = 33;
                break;
            }
            case 21: {
                n4 = 22;
                break;
            }
            case 22: {
                n4 = 5;
                break;
            }
            case 23: {
                n4 = 15;
                break;
            }
            case 24: {
                n4 = 41;
                break;
            }
            case 25: {
                n4 = 53;
                break;
            }
            case 26: {
                n4 = 51;
                break;
            }
            case 27: {
                n4 = 44;
                break;
            }
            case 28: {
                n4 = 54;
                break;
            }
            case 29: {
                n4 = 48;
                break;
            }
            case 30: {
                n4 = 37;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 25;
                break;
            }
            case 33: {
                n4 = 14;
                break;
            }
            case 34: {
                n4 = 43;
                break;
            }
            case 35: {
                n4 = 57;
                break;
            }
            case 36: {
                n4 = 28;
                break;
            }
            case 37: {
                n4 = 56;
                break;
            }
            case 38: {
                n4 = 29;
                break;
            }
            case 39: {
                n4 = 38;
                break;
            }
            case 40: {
                n4 = 2;
                break;
            }
            case 41: {
                n4 = 50;
                break;
            }
            case 42: {
                n4 = 24;
                break;
            }
            case 43: {
                n4 = 3;
                break;
            }
            case 44: {
                n4 = 19;
                break;
            }
            case 45: {
                n4 = 8;
                break;
            }
            case 46: {
                n4 = 60;
                break;
            }
            case 47: {
                n4 = 30;
                break;
            }
            case 48: {
                n4 = 6;
                break;
            }
            case 49: {
                n4 = 16;
                break;
            }
            case 50: {
                n4 = 31;
                break;
            }
            case 51: {
                n4 = 63;
                break;
            }
            case 52: {
                n4 = 17;
                break;
            }
            case 53: {
                n4 = 47;
                break;
            }
            case 54: {
                n4 = 12;
                break;
            }
            case 55: {
                n4 = 1;
                break;
            }
            case 56: {
                n4 = 7;
                break;
            }
            case 57: {
                n4 = 26;
                break;
            }
            case 58: {
                n4 = 4;
                break;
            }
            case 59: {
                n4 = 36;
                break;
            }
            case 60: {
                n4 = 10;
                break;
            }
            case 61: {
                n4 = 23;
                break;
            }
            case 62: {
                n4 = 61;
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
        s3.f[n5] = new String(cArray);
        return n5;
    }

    private static Field c(long l10, long l11) {
        int n2 = s3.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = s3.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = s3.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = s3.a(clazz3, string2, clazz2)) != null) {
                    s3.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = s3.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        s3.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = s3.b(273135098732854L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/s3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static s3[] values() {
        return (s3[])M.clone();
    }

    public static s3 valueOf(String string) {
        return Enum.valueOf(s3.class, string);
    }

    private static Method d(long l10, long l11) {
        int n2 = s3.a(l10, l11);
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
                clazz3 = s3.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = s3.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = s3.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        s3.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = s3.b(273135098732854L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = s3.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        s3.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = s3.b(273135098732854L, 0L);
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

    public I4 F(ry ry2, int n2) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List<Class<? extends I4>> list;
        long l10;
        block7: {
            l10 = a ^ 0x263C418DB623L;
            list = this.V.get((Object)ry2);
            try {
                try {
                    if (n2 >= 0 && n2 < list.size()) break block7;
                }
                catch (InstantiationException instantiationException) {
                    throw s3.a(instantiationException);
                }
                throw new RuntimeException((String)((Object)s3.b("\u00c8", (int)s3.a("l", (int)5577, (long)(0x23A2A41FA4ED7C1BL ^ l10)), (long)8788571737968450420L, (long)l10)) + n2 + (String)((Object)s3.b("\u00c8", (int)s3.a("l", (int)11518, (long)(0x6561785815D5C52AL ^ l10)), (long)8788571737968450420L, (long)l10)) + (Object)((Object)ry2) + (String)((Object)s3.b("\u00c8", (int)s3.a("l", (int)27961, (long)(0x494BA2EAA38104EEL ^ l10)), (long)8788571737968450420L, (long)l10)));
            }
            catch (InstantiationException instantiationException) {
                throw s3.a(instantiationException);
            }
        }
        Class<? extends I4> clazz = list.get(n2);
        try {
            if (clazz == null) {
                System.out.println((String)((Object)s3.b("\u00c8", (int)s3.a("l", (int)929, (long)(0x135F49082A1FEA74L ^ l10)), (long)8788571737968450420L, (long)l10)) + n2);
                return null;
            }
        }
        catch (InstantiationException instantiationException) {
            throw s3.a(instantiationException);
        }
        return clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    private s3() {
        for (ry ry2 : ry.values()) {
            this.V.put(ry2, new ArrayList());
        }
        this.Y(ry.CLIENT, Tk.class);
        this.Y(ry.SERVER, Tw.class);
        this.Y(ry.CLIENT, ZA.class);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "r0\u000e";
        objectArray[1] = Integer.TYPE;
        s3.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0014\u001d)027\u001f\u00128\u007fO/\f\u001516";
        objectArray[3] = ":\u0007q\u0006+\u00151\b`IJ\u001b:\u0003d\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "#\u001f25~+!\u000e)Hi4FOq$:&8\u0013*%gO|N.!l7%\u0011|w\u0002";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = s3.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = s3.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
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
                s3.a = d8.a(-6326800481511960618L, 989228236623666846L, MethodHandles.lookup().lookupClass()).a(79283048427484L);
                var11 = s3.a ^ 124656593461125L;
                s3.e = new Object[5];
                s3.f = new String[5];
                s3.a();
                s3.d = new HashMap<K, V>(13);
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
                var6_3 = new long[6];
                var3_4 = 0;
                var4_5 = "ZF\\\r\u009eD\u00a5w\u00c4\u00b4\u00c5$\u0087%\u0097Jz_\u00d1\u0015/\\\r\u00e3\u00c419\n\u00b1\u00e0\u00be\u0018";
                var5_6 = "ZF\\\r\u009eD\u00a5w\u00c4\u00b4\u00c5$\u0087%\u0097Jz_\u00d1\u0015/\\\r\u00e3\u00c419\n\u00b1\u00e0\u00be\u0018".length();
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
                    var4_5 = "\u00f11$\u0016\u0094R\u0003'\u0006\u008d\u0003L\u0000\u00eb\u009b\u001c";
                    var5_6 = "\u00f11$\u0016\u0094R\u0003'\u0006\u008d\u0003L\u0000\u00eb\u009b\u001c".length();
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
        s3.b = var6_3;
        s3.c = new Integer[6];
        s3.UNAUTHENTICATED = new YC();
        s3.AUTHENTICATED = new Yl();
        s3.M = new s3[]{s3.UNAUTHENTICATED, s3.AUTHENTICATED};
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = s3.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    protected void Y(ry ry2, Class<? extends I4> clazz) {
        List<Class<? extends I4>> list = this.V.get((Object)ry2);
        list.add(clazz);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/s3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'G' || c10 == 'c' || c10 == '\u00f3' || c10 == '\u00fb') {
                field = s3.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'G' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = s3.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = s3.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                s3.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public int m(ry ry2, I4 i42) {
        List<Class<? extends I4>> list = this.V.get((Object)ry2);
        return list.indexOf(i42.getClass());
    }

    private static InstantiationException a(InstantiationException instantiationException) {
        return instantiationException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = s3.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1020;
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
                throw new RuntimeException("a/s3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            s3.c[n3] = n4;
        }
        return c[n3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(s3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(s3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

