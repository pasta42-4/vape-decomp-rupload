/*
 * Decompiled with CFR 0.152.
 */
package com.security.policy;

import com.collections.management.MultiContainerRegistry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class SecurityPolicyValidator
extends Enum<SecurityPolicyValidator> {
    private static final SecurityPolicyValidator[] K;
    public static final /* enum */ SecurityPolicyValidator LOGGED_IN_FROM_ANOTHER_LOCATION;
    private final boolean V;
    private static final Object[] a;
    public static final /* enum */ SecurityPolicyValidator UNKNOWN;
    public static final /* enum */ SecurityPolicyValidator AUTH_FAILED;
    private final boolean E;
    private static final String[] b;
    public static final /* enum */ SecurityPolicyValidator BANNED;

    private static void a() {
        Object[] objectArray = a;
        a[0] = "\u001ad)";
        objectArray[1] = Integer.TYPE;
        SecurityPolicyValidator.b[1] = "java/lang/Integer";
        objectArray[2] = "Y\u00170\u001bW R\u0018!T*8A\u001f(\u001d";
        objectArray[3] = "M\u0003\u000b\u0015HZF\f\u001aZ)TM\u0007\u001e\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "[\u0017G#.5PK\u0003Ft1k\u0006L9\"t\f\u0003\u001c:\u001fs\u0005CM;qsT\u0011\u001aF";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecurityPolicyValidator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecurityPolicyValidator.a(l, l2);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                SecurityPolicyValidator.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/HO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean H() {
        return this.E;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = MultiContainerRegistry.a(-6223722511030856162L, -4033207979769065035L, MethodHandles.lookup().lookupClass()).a(168294256313847L) ^ 43108121341846L;
                SecurityPolicyValidator.a = new Object[5];
                SecurityPolicyValidator.b = new String[5];
                SecurityPolicyValidator.a();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[4];
                var4_4 = 0;
                var5_5 = "\u008d\u00b1\u009a\u00deO\u00edoC\u00b3\u008a\u0007\u00fd\u008c\u00e2J8";
                var6_6 = "\u008d\u00b1\u009a\u00deO\u00edoC\u00b3\u008a\u0007\u00fd\u008c\u00e2J8".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u001ae\u00d1\u008cy\u00bd!\u0012\u00a7\u00c7\u00cb}\u00c5]V\u00d4";
                    var6_6 = "\u001ae\u00d1\u008cy\u00bd!\u0012\u00a7\u00c7\u00cb}\u00c5]V\u00d4".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        SecurityPolicyValidator.UNKNOWN = new SecurityPolicyValidator(true, true);
        SecurityPolicyValidator.LOGGED_IN_FROM_ANOTHER_LOCATION = new SecurityPolicyValidator(false, true);
        SecurityPolicyValidator.BANNED = new SecurityPolicyValidator(false, false);
        SecurityPolicyValidator.AUTH_FAILED = new SecurityPolicyValidator(false, false);
        SecurityPolicyValidator.K = new SecurityPolicyValidator[]{SecurityPolicyValidator.UNKNOWN, SecurityPolicyValidator.LOGGED_IN_FROM_ANOTHER_LOCATION, SecurityPolicyValidator.BANNED, SecurityPolicyValidator.AUTH_FAILED};
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecurityPolicyValidator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecurityPolicyValidator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (b[n4] != null) {
            return n4;
        }
        Object object = a[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 54;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 50;
                break;
            }
            case 7: {
                n3 = 13;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 15;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 25;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 52;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 39;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 11;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 59;
                break;
            }
            case 31: {
                n3 = 33;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 6;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 38;
                break;
            }
            case 38: {
                n3 = 57;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 5;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 27;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 18;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 32;
                break;
            }
            case 58: {
                n3 = 41;
                break;
            }
            case 59: {
                n3 = 62;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 34;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 26;
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
        SecurityPolicyValidator.b[n4] = new String(cArray);
        return n4;
    }

    private SecurityPolicyValidator(boolean bl, boolean bl2) {
        this.V = bl;
        this.E = bl2;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecurityPolicyValidator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecurityPolicyValidator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static SecurityPolicyValidator[] values() {
        return (SecurityPolicyValidator[])K.clone();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 'Q' || c == 'z' || c == '\u00dc') {
                field = SecurityPolicyValidator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecurityPolicyValidator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l, long l2) {
        int n = SecurityPolicyValidator.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = SecurityPolicyValidator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecurityPolicyValidator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecurityPolicyValidator.a(clazz3, string2, clazz2)) != null) {
                    SecurityPolicyValidator.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecurityPolicyValidator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecurityPolicyValidator.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecurityPolicyValidator.b(240904299090290L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static SecurityPolicyValidator valueOf(String string) {
        return Enum.valueOf(SecurityPolicyValidator.class, string);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = SecurityPolicyValidator.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecurityPolicyValidator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecurityPolicyValidator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecurityPolicyValidator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecurityPolicyValidator.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecurityPolicyValidator.b(240904299090290L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecurityPolicyValidator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecurityPolicyValidator.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecurityPolicyValidator.b(240904299090290L, 0L);
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

    public boolean Y() {
        return this.V;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecurityPolicyValidator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

