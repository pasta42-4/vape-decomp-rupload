/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.O_;
import a.Sy;
import a.d8;
import a.hK;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public final class Nd
extends Enum<Nd>
implements Sy,
hK {
    private final String o;
    private static final Object[] a;
    public static final /* enum */ Nd VALUE;
    private final String A;
    private static final String[] b;
    public static final /* enum */ Nd PERCENTAGE;
    private static final Nd[] O;
    public static final @UnmodifiableView List<Nd> VALUES;

    private static Method d(long l10, long l11) {
        int n2 = Nd.a(l10, l11);
        Object object = a[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Nd.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Nd.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Nd.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Nd.a[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Nd.b(243959526213173L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Nd.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Nd.a[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Nd.b(243959526213173L, 0L);
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

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public String e() {
        return this.o;
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

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Nd.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Nd.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Nd A(String string, Nd nd) {
        Nd nd2;
        Nd nd3 = Nd.k(string);
        try {
            nd2 = nd3 == null ? nd : nd3;
        }
        catch (O_ o_2) {
            throw Nd.a(o_2);
        }
        return nd2;
    }

    public static Nd a(String string) {
        return Nd.A(string, PERCENTAGE);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Nd.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Nd(String string2, String string3) {
        this.A = string2;
        this.o = string3;
    }

    @Override
    public String O() {
        return this.A;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "x^d";
        objectArray[1] = Integer.TYPE;
        Nd.b[1] = "java/lang/Integer";
        objectArray[2] = "Fu\u0014\u001d\u001a.Mz\u0005Rg6^}\f\u001b";
        objectArray[3] = "d\u0007/\npko\b>E\u0011ed\u0003:\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "&kw\u00154\u0019t~:\u007f?\u0018Lk;\u0003:\u00020w9\u000eTZ*oj\u0018$[+a9\u007f";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = d8.a(-1815982395009442307L, -8521228052269360430L, MethodHandles.lookup().lookupClass()).a(190835159521995L) ^ 90970451520788L;
                Nd.a = new Object[5];
                Nd.b = new String[5];
                Nd.a();
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
                var0_3 = new long[6];
                var4_4 = 0;
                var5_5 = "m-7g\u0089\u0006\u00b9?\u00bd63\u008cH\u001eT\u00a8!n\u00de\by\u0086\u00fa\u00a6\u00c0\u00f3\u0085X\u00da\u001e9\u009b";
                var6_6 = "m-7g\u0089\u0006\u00b9?\u00bd63\u008cH\u001eT\u00a8!n\u00de\by\u0086\u00fa\u00a6\u00c0\u00f3\u0085X\u00da\u001e9\u009b".length();
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
                    var5_5 = "\u00ce\u00d6\u00ec.gQ_\u00d1\u009c\u00b8\u0082 \u00803e}";
                    var6_6 = "\u00ce\u00d6\u00ec.gQ_\u00d1\u009c\u00b8\u0082 \u00803e}".length();
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
        Nd.PERCENTAGE = new Nd((String)Nd.a("\u00ff", (int)((int)var0_3[1]), (long)7595342253578281417L, (long)var11), (String)Nd.a("\u00ff", (int)((int)var0_3[4]), (long)7595342253578281417L, (long)var11));
        Nd.VALUE = new Nd((String)Nd.a("\u00ff", (int)((int)var0_3[0]), (long)7595342253578281417L, (long)var11), (String)Nd.a("\u00ff", (int)((int)var0_3[3]), (long)7595342253578281417L, (long)var11));
        Nd.O = new Nd[]{Nd.PERCENTAGE, Nd.VALUE};
        Nd.VALUES = Arrays.asList(Nd.values());
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Nd.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Nd.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f4' || c10 == 'd' || c10 == '\u00d8' || c10 == 'a') {
                field = Nd.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Nd.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Nd valueOf(String string) {
        return Enum.valueOf(Nd.class, string);
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Nd.a(l10, l11);
            object = a[n2];
            try {
                if (!(object instanceof String)) break block2;
                Nd.a[n2] = clazz = Class.forName(b[n2]);
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
            throw new RuntimeException("a/Nd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public static Nd k(String string) {
        for (Nd nd : VALUES) {
            try {
                if (!nd.O().equalsIgnoreCase(string)) continue;
                return nd;
            }
            catch (O_ o_2) {
                throw Nd.a(o_2);
            }
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = Nd.a(l10, l11);
        Object object = a[n2];
        if (object instanceof String) {
            String string = b[n2];
            int n3 = string.indexOf(8);
            Class clazz = Nd.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Nd.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Nd.a(clazz3, string2, clazz2)) != null) {
                    Nd.a[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Nd.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Nd.a[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Nd.b(243959526213173L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Nd[] values() {
        return (Nd[])O.clone();
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (b[n5] != null) {
            return n5;
        }
        Object object = a[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 37;
                break;
            }
            case 1: {
                n4 = 9;
                break;
            }
            case 2: {
                n4 = 16;
                break;
            }
            case 3: {
                n4 = 60;
                break;
            }
            case 4: {
                n4 = 59;
                break;
            }
            case 5: {
                n4 = 44;
                break;
            }
            case 6: {
                n4 = 49;
                break;
            }
            case 7: {
                n4 = 48;
                break;
            }
            case 8: {
                n4 = 3;
                break;
            }
            case 9: {
                n4 = 61;
                break;
            }
            case 10: {
                n4 = 21;
                break;
            }
            case 11: {
                n4 = 55;
                break;
            }
            case 12: {
                n4 = 53;
                break;
            }
            case 13: {
                n4 = 54;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 11;
                break;
            }
            case 16: {
                n4 = 25;
                break;
            }
            case 17: {
                n4 = 19;
                break;
            }
            case 18: {
                n4 = 45;
                break;
            }
            case 19: {
                n4 = 29;
                break;
            }
            case 20: {
                n4 = 26;
                break;
            }
            case 21: {
                n4 = 51;
                break;
            }
            case 22: {
                n4 = 35;
                break;
            }
            case 23: {
                n4 = 62;
                break;
            }
            case 24: {
                n4 = 15;
                break;
            }
            case 25: {
                n4 = 5;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 27;
                break;
            }
            case 28: {
                n4 = 63;
                break;
            }
            case 29: {
                n4 = 20;
                break;
            }
            case 30: {
                n4 = 41;
                break;
            }
            case 31: {
                n4 = 23;
                break;
            }
            case 32: {
                n4 = 28;
                break;
            }
            case 33: {
                n4 = 34;
                break;
            }
            case 34: {
                n4 = 39;
                break;
            }
            case 35: {
                n4 = 1;
                break;
            }
            case 36: {
                n4 = 30;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 10;
                break;
            }
            case 39: {
                n4 = 2;
                break;
            }
            case 40: {
                n4 = 32;
                break;
            }
            case 41: {
                n4 = 56;
                break;
            }
            case 42: {
                n4 = 12;
                break;
            }
            case 43: {
                n4 = 22;
                break;
            }
            case 44: {
                n4 = 4;
                break;
            }
            case 45: {
                n4 = 8;
                break;
            }
            case 46: {
                n4 = 50;
                break;
            }
            case 47: {
                n4 = 33;
                break;
            }
            case 48: {
                n4 = 17;
                break;
            }
            case 49: {
                n4 = 40;
                break;
            }
            case 50: {
                n4 = 31;
                break;
            }
            case 51: {
                n4 = 52;
                break;
            }
            case 52: {
                n4 = 7;
                break;
            }
            case 53: {
                n4 = 13;
                break;
            }
            case 54: {
                n4 = 43;
                break;
            }
            case 55: {
                n4 = 46;
                break;
            }
            case 56: {
                n4 = 24;
                break;
            }
            case 57: {
                n4 = 58;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 14;
                break;
            }
            case 60: {
                n4 = 18;
                break;
            }
            case 61: {
                n4 = 36;
                break;
            }
            case 62: {
                n4 = 42;
                break;
            }
            default: {
                n4 = 6;
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
        Nd.b[n5] = new String(cArray);
        return n5;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Nd.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

