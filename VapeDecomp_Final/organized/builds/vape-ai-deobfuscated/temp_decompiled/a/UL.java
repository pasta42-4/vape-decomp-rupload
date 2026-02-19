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
import a.ht;
import a.kX;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Ul
extends v2 {
    private static final long a;
    private HK B;
    private static final Integer[] c;
    private static ht[] w;
    private final HK D;
    private static final long[] b;
    private static final String[] f;
    private static final Map d;
    private static final Object[] e;
    private final Ib z;

    private static Field g(long l10, long l11) {
        int n2 = Ul.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = Ul.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Ul.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Ul.c(clazz3, string2, clazz2)) != null) {
                    Ul.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Ul.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Ul.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Ul.f(656804628778118L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void R(Object object, int n2, int n3) {
        this.B.l(object, n2, n3);
    }

    private static Method h(long l10, long l11) {
        int n2 = Ul.e(l10, l11);
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
                clazz3 = Ul.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Ul.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Ul.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        Ul.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Ul.f(656804628778118L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Ul.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Ul.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Ul.f(656804628778118L, 0L);
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

    public List f(Object object) {
        return (List)this.z.Z(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = Ul.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Ul.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static ht[] d() {
        return w;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void o(ht[] htArray) {
        w = htArray;
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "sN1g";
        objectArray[1] = "80\"j,\n3?3%Q\u0012 8:l";
        objectArray[2] = Boolean.TYPE;
        Ul.f[2] = "java/lang/Boolean";
        objectArray[3] = "\r\u001a@z\u0017}\u0006\u0015Q5z}\u0006\bE";
        objectArray[4] = "\u0013Se\u001a\u0013Kfsn\u0015\u0002\u0004\u000bsn\b\u0016\u0011";
        objectArray[5] = "\u0002C\u0018C";
        objectArray[6] = "F\u0002f";
        objectArray[7] = Integer.TYPE;
        Ul.f[7] = "java/lang/Integer";
        objectArray[8] = "_\u0016\u0004;";
        objectArray[9] = "c@$TY\bhO5\u001b8\u0006cD1A";
        objectArray[10] = "ZE\u000f\u007f0\u000bK\u0010HFI4N\u0018\u00124~\bNWIF7IXU\u0007#t^Q\u0014u|w\rQ\u0016\u001c{sFX)N|0TWG\u0019)pO7\u0015L{iTTT\u001c!a4";
        objectArray[11] = "B\u00131]fcSFvd\u0003\\VN,\u0016(`V\u0001wda!@\u00039\u0001\"6IBK^!eI@\"Y%.@\u007fv\u0016'0JD+\u001f=!/";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "sK \u0013\u0003\u00060Y>\u001fg\n4!~\u0010\u0006\u0013.D;\\\u0018\u000eOXs\u0005\u0015\u0011sX<^g";
    }

    public Object m(Object object, Object object2, Object object3, Object object4) {
        try {
            if (this.D == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw Ul.a(o_2);
        }
        return this.D.A(object, object2, object3, object4);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ul" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'Y' || c10 == '\u00ca' || c10 == 'z' || c10 == '\u00c0') {
                field = Ul.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Ul.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Ul.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ul" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Ul.a = d8.a(1250024050354006113L, -3144295886636055010L, MethodHandles.lookup().lookupClass()).a(128422389744834L);
                Ul.e = new Object[13];
                Ul.f = new String[13];
                Ul.a();
                Ul.d = new HashMap<K, V>(13);
                var0 = Ul.a ^ 103211101096521L;
                Ul.o(new ht[5]);
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00c8$\u00dbH\u00bc\u001f\u00e4^\u00d2\u00fa\u00f6\u00ce;o\u0094\r";
                var7_6 = "\u00c8$\u00dbH\u00bc\u001f\u00e4^\u00d2\u00fa\u00f6\u00ce;o\u0094\r".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00b7\u0096e\nz\u0011\u009a&\u00f1\u0014\u001dm-\u0011\u001e*";
                    var7_6 = "\u00b7\u0096e\nz\u0011\u009a&\u00f1\u0014\u001dm-\u0011\u001e*".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        Ul.b = var8_3;
        Ul.c = new Integer[4];
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
                n4 = 24;
                break;
            }
            case 1: {
                n4 = 15;
                break;
            }
            case 2: {
                n4 = 7;
                break;
            }
            case 3: {
                n4 = 19;
                break;
            }
            case 4: {
                n4 = 41;
                break;
            }
            case 5: {
                n4 = 61;
                break;
            }
            case 6: {
                n4 = 14;
                break;
            }
            case 7: {
                n4 = 21;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 10;
                break;
            }
            case 10: {
                n4 = 0;
                break;
            }
            case 11: {
                n4 = 33;
                break;
            }
            case 12: {
                n4 = 54;
                break;
            }
            case 13: {
                n4 = 4;
                break;
            }
            case 14: {
                n4 = 25;
                break;
            }
            case 15: {
                n4 = 30;
                break;
            }
            case 16: {
                n4 = 26;
                break;
            }
            case 17: {
                n4 = 31;
                break;
            }
            case 18: {
                n4 = 57;
                break;
            }
            case 19: {
                n4 = 63;
                break;
            }
            case 20: {
                n4 = 59;
                break;
            }
            case 21: {
                n4 = 34;
                break;
            }
            case 22: {
                n4 = 39;
                break;
            }
            case 23: {
                n4 = 35;
                break;
            }
            case 24: {
                n4 = 17;
                break;
            }
            case 25: {
                n4 = 44;
                break;
            }
            case 26: {
                n4 = 37;
                break;
            }
            case 27: {
                n4 = 58;
                break;
            }
            case 28: {
                n4 = 38;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 12;
                break;
            }
            case 32: {
                n4 = 22;
                break;
            }
            case 33: {
                n4 = 62;
                break;
            }
            case 34: {
                n4 = 28;
                break;
            }
            case 35: {
                n4 = 60;
                break;
            }
            case 36: {
                n4 = 2;
                break;
            }
            case 37: {
                n4 = 42;
                break;
            }
            case 38: {
                n4 = 5;
                break;
            }
            case 39: {
                n4 = 3;
                break;
            }
            case 40: {
                n4 = 23;
                break;
            }
            case 41: {
                n4 = 55;
                break;
            }
            case 42: {
                n4 = 56;
                break;
            }
            case 43: {
                n4 = 29;
                break;
            }
            case 44: {
                n4 = 52;
                break;
            }
            case 45: {
                n4 = 13;
                break;
            }
            case 46: {
                n4 = 6;
                break;
            }
            case 47: {
                n4 = 18;
                break;
            }
            case 48: {
                n4 = 46;
                break;
            }
            case 49: {
                n4 = 45;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 8;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 9;
                break;
            }
            case 54: {
                n4 = 16;
                break;
            }
            case 55: {
                n4 = 48;
                break;
            }
            case 56: {
                n4 = 51;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 49;
                break;
            }
            case 60: {
                n4 = 32;
                break;
            }
            case 61: {
                n4 = 36;
                break;
            }
            case 62: {
                n4 = 11;
                break;
            }
            default: {
                n4 = 1;
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
        Ul.f[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Ul.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                Ul.e[n2] = clazz = Class.forName(f[n2]);
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
        int n3 = Ul.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x713F;
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
                throw new RuntimeException("a/Ul", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ul.c[n3] = n4;
        }
        return c[n3];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Ul.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Ul.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Ul() {
        long l10;
        block18: {
            int n2;
            ht[] htArray;
            block16: {
                l10 = a ^ 0x2194ECAF7FAAL;
                super(eM.FW);
                this.z = Ul.c("Q", (Object)this, (Object)Ul.c("\u00d3", (int)Ul.b("q", (int)23801, (long)(0x5BAE5F16609CF483L ^ l10)), (long)-2790431991443612869L, (long)l10), (boolean)true, List.class, (long)-2790107130067819715L, (long)l10);
                htArray = Ul.d();
                try {
                    block17: {
                        try {
                            try {
                                n2 = Na.MC_1_21_4.H();
                                if (htArray == null) break block16;
                                if (n2 == 0) break block17;
                            }
                            catch (O_ o_2) {
                                throw Ul.a(o_2);
                            }
                            this.D = null;
                            if (htArray != null) break block18;
                        }
                        catch (O_ o_3) {
                            throw Ul.a(o_3);
                        }
                    }
                    n2 = kX.C();
                }
                catch (O_ o_4) {
                    throw Ul.a(o_4);
                }
            }
            try {
                block19: {
                    try {
                        if (n2 < 50) break block19;
                        this.D = Ul.c("Q", (Object)this, (Object)Ul.c("\u00d3", (int)Ul.b("q", (int)1634, (long)(0x1586E1C08BC1AE19L ^ l10)), (long)-2790431991443612869L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{eM.Em, eM.U1, eM.c, eM.tS}, (long)-2790050154163151097L, (long)l10);
                        if (htArray != null) break block18;
                    }
                    catch (O_ o_5) {
                        throw Ul.a(o_5);
                    }
                }
                this.D = Ul.c("Q", (Object)this, (Object)Ul.c("\u00d3", (int)Ul.b("q", (int)31217, (long)(0x23F30AD256975188L ^ l10)), (long)-2790431991443612869L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{eM.Em, eM.PL, eM.c, eM.tS}, (long)-2790050154163151097L, (long)l10);
            }
            catch (O_ o_6) {
                throw Ul.a(o_6);
            }
        }
        try {
            if (!Na.MC_1_21_0.H()) {
                this.B = Ul.c("Q", (Object)this, (Object)Ul.c("\u00d3", (int)Ul.b("q", (int)19359, (long)(0x549BBFCC5A42E3E7L ^ l10)), (long)-2790431991443612869L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-2790050154163151097L, (long)l10);
            }
        }
        catch (O_ o_7) {
            throw Ul.a(o_7);
        }
        try {
            if (ht.J() != null) {
                Ul.o(new ht[4]);
            }
        }
        catch (O_ o_8) {
            throw Ul.a(o_8);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ul.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Ul.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

