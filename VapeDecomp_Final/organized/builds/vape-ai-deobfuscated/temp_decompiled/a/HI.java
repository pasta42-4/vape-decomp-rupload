/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ir;
import a.O_;
import a.W8;
import a.YP;
import a.Yo;
import a.Z1;
import a.Zi;
import a.an;
import a.aw;
import a.d8;
import a.eM;
import a.h4;
import a.zp;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Comparator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hi {
    public static final YP e;
    private static final String[] b;
    public static final Yo o;
    private static final Object[] a;

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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int lambda$static$0(aw aw2, Ir ir2, Ir ir3) {
        String string = ir2.q().Z();
        String string2 = ir3.q().Z();
        int n2 = -1;
        int n3 = -1;
        int n4 = aw2.k().size();
        for (Map.Entry<String, zp> entry : aw2.k().entrySet()) {
            String string3 = entry.getKey();
            zp zp2 = entry.getValue();
            if (zp2.c().test(string, string3)) {
                n2 = n4;
            }
            if (zp2.c().test(string2, string3)) {
                n3 = n4;
            }
            try {
                try {
                    --n4;
                    if (n2 == -1 || n3 == -1) continue;
                    break;
                }
                catch (O_ o_2) {
                    throw hi.a(o_2);
                }
            }
            catch (O_ o_3) {
                throw hi.a(o_3);
            }
        }
        return Integer.compare(n2, n3);
    }

    private static Method d(long l10, long l11) {
        int n2 = hi.a(l10, l11);
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
                clazz3 = hi.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = hi.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = hi.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        hi.a[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = hi.b(274129388823320L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = hi.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        hi.a[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = hi.b(274129388823320L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = hi.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l10, long l11) {
        int n2 = hi.a(l10, l11);
        Object object = a[n2];
        if (object instanceof String) {
            String string = b[n2];
            int n3 = string.indexOf(8);
            Class clazz = hi.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = hi.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = hi.a(clazz3, string2, clazz2)) != null) {
                    hi.a[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = hi.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        hi.a[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = hi.b(274129388823320L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = hi.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = hi.b(classArray[i10], string, clazz2);
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
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 46;
                break;
            }
            case 2: {
                n4 = 54;
                break;
            }
            case 3: {
                n4 = 16;
                break;
            }
            case 4: {
                n4 = 40;
                break;
            }
            case 5: {
                n4 = 20;
                break;
            }
            case 6: {
                n4 = 3;
                break;
            }
            case 7: {
                n4 = 61;
                break;
            }
            case 8: {
                n4 = 11;
                break;
            }
            case 9: {
                n4 = 63;
                break;
            }
            case 10: {
                n4 = 38;
                break;
            }
            case 11: {
                n4 = 24;
                break;
            }
            case 12: {
                n4 = 58;
                break;
            }
            case 13: {
                n4 = 42;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 27;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 55;
                break;
            }
            case 18: {
                n4 = 33;
                break;
            }
            case 19: {
                n4 = 62;
                break;
            }
            case 20: {
                n4 = 59;
                break;
            }
            case 21: {
                n4 = 43;
                break;
            }
            case 22: {
                n4 = 45;
                break;
            }
            case 23: {
                n4 = 36;
                break;
            }
            case 24: {
                n4 = 18;
                break;
            }
            case 25: {
                n4 = 21;
                break;
            }
            case 26: {
                n4 = 56;
                break;
            }
            case 27: {
                n4 = 32;
                break;
            }
            case 28: {
                n4 = 28;
                break;
            }
            case 29: {
                n4 = 5;
                break;
            }
            case 30: {
                n4 = 13;
                break;
            }
            case 31: {
                n4 = 2;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 57;
                break;
            }
            case 34: {
                n4 = 26;
                break;
            }
            case 35: {
                n4 = 48;
                break;
            }
            case 36: {
                n4 = 10;
                break;
            }
            case 37: {
                n4 = 23;
                break;
            }
            case 38: {
                n4 = 37;
                break;
            }
            case 39: {
                n4 = 44;
                break;
            }
            case 40: {
                n4 = 35;
                break;
            }
            case 41: {
                n4 = 9;
                break;
            }
            case 42: {
                n4 = 41;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 7;
                break;
            }
            case 45: {
                n4 = 50;
                break;
            }
            case 46: {
                n4 = 29;
                break;
            }
            case 47: {
                n4 = 0;
                break;
            }
            case 48: {
                n4 = 30;
                break;
            }
            case 49: {
                n4 = 52;
                break;
            }
            case 50: {
                n4 = 60;
                break;
            }
            case 51: {
                n4 = 6;
                break;
            }
            case 52: {
                n4 = 15;
                break;
            }
            case 53: {
                n4 = 34;
                break;
            }
            case 54: {
                n4 = 51;
                break;
            }
            case 55: {
                n4 = 47;
                break;
            }
            case 56: {
                n4 = 53;
                break;
            }
            case 57: {
                n4 = 49;
                break;
            }
            case 58: {
                n4 = 17;
                break;
            }
            case 59: {
                n4 = 8;
                break;
            }
            case 60: {
                n4 = 1;
                break;
            }
            case 61: {
                n4 = 25;
                break;
            }
            case 62: {
                n4 = 14;
                break;
            }
            default: {
                n4 = 12;
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
        hi.b[n5] = new String(cArray);
        return n5;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00cc' || c10 == '\u00c4' || c10 == '\u00cb' || c10 == 'a') {
                field = hi.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = hi.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static void t() {
        Zi.Z(o);
        Zi.Z(e);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "\u0019LE";
        objectArray[1] = Integer.TYPE;
        hi.b[1] = "java/lang/Integer";
        objectArray[2] = "\rqz,G#\u0006~kc:;\u0015yb*";
        objectArray[3] = "vlN0\u0016f}c_\u007fwhvh[%";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000f\u0001>IUr\u0003\u00109yRwb\u00002\t@r\u000bCe\u000395\u001d\u0018*\u0003Xp\u0005\u00130y";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = hi.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = hi.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = hi.a(l10, l11);
            object = a[n2];
            try {
                if (!(object instanceof String)) break block2;
                hi.a[n2] = clazz = Class.forName(b[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = d8.a(-7039962144082878852L, 8033405841110059218L, MethodHandles.lookup().lookupClass()).a(103907957608580L) ^ 132672585284453L;
                hi.a = new Object[5];
                hi.b = new String[5];
                hi.a();
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
                var0_3 = new long[14];
                var4_4 = 0;
                var5_5 = "\u009f\u00afq\u00c1=\u00a9\u009dNtV\u00b4\u00ec\u00a9\u00ac\u00fa7\u00fe\u0082\u00a0\u0019\u008f\u00a2y\u00b9\u009b\u000bXj\u00c0NW\u008e\u00e2^\u00152o.~8\u00c692v\u00fd\u00ae\u0097\u001a\u00e1]\u0007\u00970\u00c4Da\u0097\u00ae\u00e1J\u00f5\u0090\u00ef\u00c7\u00a7\u008ad7A\u00c7A(\u0086\f\u00a8\u008b\u00fc\u0000\u00a2?\u00d5\u00c1e]u\u00b4H\u00a3\u009c\u0017\u008e\u0014\u0003\u009f\u00a0s";
                var6_6 = "\u009f\u00afq\u00c1=\u00a9\u009dNtV\u00b4\u00ec\u00a9\u00ac\u00fa7\u00fe\u0082\u00a0\u0019\u008f\u00a2y\u00b9\u009b\u000bXj\u00c0NW\u008e\u00e2^\u00152o.~8\u00c692v\u00fd\u00ae\u0097\u001a\u00e1]\u0007\u00970\u00c4Da\u0097\u00ae\u00e1J\u00f5\u0090\u00ef\u00c7\u00a7\u008ad7A\u00c7A(\u0086\f\u00a8\u008b\u00fc\u0000\u00a2?\u00d5\u00c1e]u\u00b4H\u00a3\u009c\u0017\u008e\u0014\u0003\u009f\u00a0s".length();
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
                    var5_5 = "&i\u0095a\u0001\u00f8\u00b2T\u0081OF\u008d\u00819V\u0007";
                    var6_6 = "&i\u0095a\u0001\u00f8\u00b2T\u0081OF\u008d\u00819V\u0007".length();
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
        hi.o = ((an)((an)((an)((an)h4.Y().k().c((String)hi.a("\u00b5", (int)((int)var0_3[8]), (long)-4312147507350995862L, (long)var11))).t((String)hi.a("\u00b5", (int)((int)var0_3[11]), (long)-4312147507350995862L, (long)var11))).p((String)hi.a("\u00b5", (int)((int)var0_3[10]), (long)-4312147507350995862L, (long)var11))).n(W8.BLOCKS)).C(eM.YX).W(Z1.WHITELIST).V();
        var13_11 = ((aw)((aw)((aw)((aw)((aw)h4.Y().x().c((String)hi.a("\u00b5", (int)((int)var0_3[1]), (long)-4312147507350995862L, (long)var11))).t((String)hi.a("\u00b5", (int)((int)var0_3[9]), (long)-4312147507350995862L, (long)var11))).R((String)hi.a("\u00b5", (int)((int)var0_3[6]), (long)-4312147507350995862L, (long)var11))).p((String)hi.a("\u00b5", (int)((int)var0_3[3]), (long)-4312147507350995862L, (long)var11))).n(W8.BLOCKS)).o((String)hi.a("\u00b5", (int)((int)var0_3[5]), (long)-4312147507350995862L, (long)var11), zp.ENDS).o((String)hi.a("\u00b5", (int)((int)var0_3[13]), (long)-4312147507350995862L, (long)var11), zp.EQUALS).o((String)hi.a("\u00b5", (int)((int)var0_3[4]), (long)-4312147507350995862L, (long)var11), zp.ENDS).o((String)hi.a("\u00b5", (int)((int)var0_3[7]), (long)-4312147507350995862L, (long)var11), zp.EQUALS).o((String)hi.a("\u00b5", (int)((int)var0_3[12]), (long)-4312147507350995862L, (long)var11), zp.ENDS).o((String)hi.a("\u00b5", (int)((int)var0_3[2]), (long)-4312147507350995862L, (long)var11), zp.EQUALS).o((String)hi.a("\u00b5", (int)((int)var0_3[0]), (long)-4312147507350995862L, (long)var11), zp.EQUALS);
        var13_11.b((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lambda$static$0(a.aw a.Ir a.Ir ), (La/Ir;La/Ir;)I)((aw)var13_11));
        hi.e = var13_11.U();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hi.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

