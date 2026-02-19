/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.QX;
import a.Qh;
import a.Qj;
import a.V4;
import a.Xu;
import a.d8;
import a.kX;
import a.zT;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z2 {
    private static final Map d;
    private static final long[] b;
    private static final Integer[] c;
    private static final String[] f;
    private static final long a;
    private static final long V = -7046029254386353131L;
    private static final Object[] e;

    public static int Q(int n2, int n3) {
        long l10;
        block9: {
            block8: {
                l10 = a ^ 0x7F194BA8A12AL;
                try {
                    try {
                        if (n2 >= 0 && n2 < z2.a("n", (int)2754, (long)(0x2A8FD17B3C3F4B00L ^ l10))) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw z2.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)z2.b("\u00f4", (int)z2.a("n", (int)32279, (long)(0x7C49F24B5609BFD7L ^ l10)), (long)7318374810452290796L, (long)l10)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw z2.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (n3 >= 0 && n3 < z2.a("n", (int)18496, (long)(0x1B7B6511F7308989L ^ l10))) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw z2.a(illegalArgumentException);
                }
                throw new IllegalArgumentException((String)((Object)z2.b("\u00f4", (int)z2.a("n", (int)4294, (long)(0x42071999D108D101L ^ l10)), (long)7318374810452290796L, (long)l10)));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw z2.a(illegalArgumentException);
            }
        }
        return (n2 & z2.a("n", (int)10774, (long)(0x330689467613EBD2L ^ l10))) << 16 | n3 & z2.a("n", (int)24648, (long)(0x16F07A3595E3218BL ^ l10));
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2450;
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
                throw new RuntimeException("a/z2", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z2.c[n3] = n4;
        }
        return c[n3];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = z2.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = z2.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static long b(Qh qh2) {
        return z2.J(z2.l(qh2));
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "6\u0012\u007f";
        objectArray[1] = Integer.TYPE;
        z2.f[1] = "java/lang/Integer";
        objectArray[2] = "];&`/:V47/R\"E3>f";
        objectArray[3] = "]\u0001L;a$V\u000e]t\u0000*]\u0005Y.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\b\u001a#+a\"\u001c\u0003pY63l\u00030=&xQ\u001bs!]q\u0012\u000eub,\"\u001c\u0016#Y";
    }

    private static Field c(long l10, long l11) {
        int n2 = z2.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = z2.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = z2.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = z2.a(clazz3, string2, clazz2)) != null) {
                    z2.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = z2.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        z2.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = z2.b(266352553799640L, 0L);
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
            throw new RuntimeException("a/z2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static long J(V4[] v4Array) {
        long l10 = -7046029254386353131L;
        for (V4 v42 : v4Array) {
            try {
                if (v42 == null) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw z2.a(illegalArgumentException);
            }
            long l11 = z2.G(v42);
            l10 ^= l11 + -7046029254386353131L + (l10 << 6) + (l10 >> 2);
        }
        return l10;
    }

    private static Method d(long l10, long l11) {
        int n2 = z2.a(l10, l11);
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
                clazz3 = z2.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = z2.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = z2.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        z2.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = z2.b(266352553799640L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = z2.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        z2.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = z2.b(266352553799640L, 0L);
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

    public static int t(int n2, int n3) {
        long l10;
        block9: {
            block8: {
                l10 = a ^ 0x77C7395C5582L;
                try {
                    try {
                        if (n2 >= 0 && n2 < z2.a("n", (int)18496, (long)(0x1B7B6DCF85C47D21L ^ l10))) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw z2.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)z2.b("\u00f4", (int)z2.a("n", (int)29228, (long)(0x4BF9DA800CE0C745L ^ l10)), (long)-7982595413161535420L, (long)l10)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw z2.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (n3 >= 0 && n3 < z2.a("n", (int)18496, (long)(0x1B7B6DCF85C47D21L ^ l10))) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw z2.a(illegalArgumentException);
                }
                throw new IllegalArgumentException((String)((Object)z2.b("\u00f4", (int)z2.a("n", (int)25234, (long)(0x7382596B90C257FCL ^ l10)), (long)-7982595413161535420L, (long)l10)));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw z2.a(illegalArgumentException);
            }
        }
        return (n2 & z2.a("n", (int)24648, (long)(0x16F072EBE717D523L ^ l10))) << 16 | n3 & z2.a("n", (int)24648, (long)(0x16F072EBE717D523L ^ l10));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = z2.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e7' || c10 == '\u00f8' || c10 == 'Q' || c10 == 'e') {
                field = z2.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = z2.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = z2.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static int X(int[] nArray) {
        int n2;
        long l10 = a ^ 0x4B8CFC57F829L;
        try {
            if (nArray == null) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw z2.a(illegalArgumentException);
        }
        try {
            if (nArray.length % 2 != 0) {
                throw new IllegalArgumentException((String)((Object)z2.b("\u00f4", (int)z2.a("n", (int)21081, (long)(0x7DB4AE22C4934A9FL ^ l10)), (long)4364871531576407535L, (long)l10)) + nArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw z2.a(illegalArgumentException);
        }
        int n3 = nArray.length / 2;
        int[] nArray2 = new int[n3];
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                nArray2[n2] = z2.t(nArray[2 * n2], nArray[2 * n2 + 1]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw z2.a(illegalArgumentException);
        }
        Arrays.sort(nArray2);
        n2 = 1;
        for (int n4 : nArray2) {
            n2 = 31 * n2 + n4;
        }
        return n2;
    }

    public static long J(int n2, int n3, int[] nArray) {
        int n4 = z2.Q(n2, n3);
        int n5 = z2.X(nArray);
        return ((long)n5 & 0xFFFFFFFFL) << 32 | (long)n4 & 0xFFFFFFFFL;
    }

    public static V4[] l(Qh qh2) {
        V4[] v4Array = new V4[5];
        V4 v42 = qh2.a();
        try {
            if (v42.r()) {
                v4Array[0] = v42;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw z2.a(illegalArgumentException);
        }
        Object[] objectArray = qh2.l().G();
        int n2 = objectArray.length;
        for (int i10 = 0; i10 < n2; ++i10) {
            V4 v43 = new V4(objectArray[n2 - 1 - i10]);
            try {
                if (v43.Y()) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw z2.a(illegalArgumentException);
            }
            v4Array[i10 + 1] = v43;
        }
        return v4Array;
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
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 44;
                break;
            }
            case 2: {
                n4 = 42;
                break;
            }
            case 3: {
                n4 = 31;
                break;
            }
            case 4: {
                n4 = 9;
                break;
            }
            case 5: {
                n4 = 45;
                break;
            }
            case 6: {
                n4 = 20;
                break;
            }
            case 7: {
                n4 = 37;
                break;
            }
            case 8: {
                n4 = 41;
                break;
            }
            case 9: {
                n4 = 29;
                break;
            }
            case 10: {
                n4 = 6;
                break;
            }
            case 11: {
                n4 = 61;
                break;
            }
            case 12: {
                n4 = 55;
                break;
            }
            case 13: {
                n4 = 26;
                break;
            }
            case 14: {
                n4 = 10;
                break;
            }
            case 15: {
                n4 = 7;
                break;
            }
            case 16: {
                n4 = 3;
                break;
            }
            case 17: {
                n4 = 49;
                break;
            }
            case 18: {
                n4 = 23;
                break;
            }
            case 19: {
                n4 = 18;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 2;
                break;
            }
            case 22: {
                n4 = 43;
                break;
            }
            case 23: {
                n4 = 53;
                break;
            }
            case 24: {
                n4 = 32;
                break;
            }
            case 25: {
                n4 = 25;
                break;
            }
            case 26: {
                n4 = 63;
                break;
            }
            case 27: {
                n4 = 47;
                break;
            }
            case 28: {
                n4 = 19;
                break;
            }
            case 29: {
                n4 = 50;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 30;
                break;
            }
            case 32: {
                n4 = 35;
                break;
            }
            case 33: {
                n4 = 11;
                break;
            }
            case 34: {
                n4 = 62;
                break;
            }
            case 35: {
                n4 = 13;
                break;
            }
            case 36: {
                n4 = 38;
                break;
            }
            case 37: {
                n4 = 12;
                break;
            }
            case 38: {
                n4 = 39;
                break;
            }
            case 39: {
                n4 = 24;
                break;
            }
            case 40: {
                n4 = 0;
                break;
            }
            case 41: {
                n4 = 5;
                break;
            }
            case 42: {
                n4 = 36;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 48;
                break;
            }
            case 45: {
                n4 = 27;
                break;
            }
            case 46: {
                n4 = 59;
                break;
            }
            case 47: {
                n4 = 51;
                break;
            }
            case 48: {
                n4 = 15;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 46;
                break;
            }
            case 51: {
                n4 = 22;
                break;
            }
            case 52: {
                n4 = 52;
                break;
            }
            case 53: {
                n4 = 17;
                break;
            }
            case 54: {
                n4 = 8;
                break;
            }
            case 55: {
                n4 = 14;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 58;
                break;
            }
            case 58: {
                n4 = 60;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 16;
                break;
            }
            case 61: {
                n4 = 56;
                break;
            }
            case 62: {
                n4 = 4;
                break;
            }
            default: {
                n4 = 40;
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
        z2.f[n5] = new String(cArray);
        return n5;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = z2.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                z2.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    public static long G(V4 v42) {
        int n2;
        long l10;
        boolean bl2;
        long l11;
        block11: {
            boolean bl3;
            QX qX2;
            block10: {
                block9: {
                    qX2 = v42.C();
                    int n3 = qX2.O();
                    int n4 = v42.b();
                    int[] nArray = zT.Y(v42);
                    l11 = z2.J(n3, n4, nArray);
                    int n5 = qX2.v();
                    try {
                        try {
                            if (n5 <= 0 || n4 <= 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw z2.a(illegalArgumentException);
                        }
                        bl3 = true;
                        break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw z2.a(illegalArgumentException);
                    }
                }
                bl3 = false;
            }
            bl2 = bl3;
            try {
                if (!Xu.l(qX2) || kX.C() > 15) break block11;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw z2.a(illegalArgumentException);
            }
            Qj qj2 = new Qj(qX2);
            int n6 = qj2.I(v42);
            if (n6 != -1) {
                l11 = l11 * 31L + (long)n6;
            }
        }
        try {
            l10 = l11 * 31L;
            n2 = bl2 ? 1 : 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw z2.a(illegalArgumentException);
        }
        return l10 + (long)n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                z2.a = d8.a(-5480566231080905942L, 1299968603453801046L, MethodHandles.lookup().lookupClass()).a(171264511577250L);
                z2.e = new Object[5];
                z2.f = new String[5];
                z2.a();
                z2.d = new HashMap<K, V>(13);
                var0 = z2.a ^ 72741968538607L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "1>\u008a/\u00fb?\u00ea\u0003G\u00a7\u009a\u00f0r\u008a\u00b6\u0086\u0004Fb\u009bi$\u0015\u00f2SB\u00d8\u00c2\u0094A\u00f1\u00ea\u00d2\u00aa\u00f0%\u009c\u0094\u00027\t\u0098\u00dc\u0001\u0016\u00f2\u0081dH\u0019\u00a6\u0013\u00fb\r\u0006X";
                var7_6 = "1>\u008a/\u00fb?\u00ea\u0003G\u00a7\u009a\u00f0r\u008a\u00b6\u0086\u0004Fb\u009bi$\u0015\u00f2SB\u00d8\u00c2\u0094A\u00f1\u00ea\u00d2\u00aa\u00f0%\u009c\u0094\u00027\t\u0098\u00dc\u0001\u0016\u00f2\u0081dH\u0019\u00a6\u0013\u00fb\r\u0006X".length();
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
                    var6_5 = "x\u009ck\u00ad\u0082\u0010D\u00de\u00e8\u00e3[\u0012\u0088\f\u009d\u000b";
                    var7_6 = "x\u009ck\u00ad\u0082\u0010D\u00de\u00e8\u00e3[\u0012\u0088\f\u009d\u000b".length();
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
        z2.b = var8_3;
        z2.c = new Integer[9];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = z2.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = z2.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(z2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

