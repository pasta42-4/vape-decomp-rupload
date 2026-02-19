/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.M;
import a.O_;
import a.Sz;
import a.d8;
import a.ht;
import a.yQ;
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

public class yh
extends yQ {
    private static final long ab = d8.a(8542080704415269657L, 653525904155936052L, MethodHandles.lookup().lookupClass()).a(248455649349154L);
    private final M UK;
    private static final long fb;
    private static final String[] tb;
    private static final Object[] sb;

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = yh.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yh.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public yh(double d2) {
        long l10 = ab ^ 0x14CB43493F7FL;
        this.UK = new M(this);
        this.UK.A(d2);
        this.q(this.UK);
        this.d().f((String)((Object)yh.e("c", (int)((int)fb), (long)1363799398791796577L, (long)l10)));
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (tb[n5] != null) {
            return n5;
        }
        Object object = sb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 35;
                break;
            }
            case 1: {
                n4 = 63;
                break;
            }
            case 2: {
                n4 = 9;
                break;
            }
            case 3: {
                n4 = 53;
                break;
            }
            case 4: {
                n4 = 14;
                break;
            }
            case 5: {
                n4 = 29;
                break;
            }
            case 6: {
                n4 = 43;
                break;
            }
            case 7: {
                n4 = 23;
                break;
            }
            case 8: {
                n4 = 61;
                break;
            }
            case 9: {
                n4 = 25;
                break;
            }
            case 10: {
                n4 = 48;
                break;
            }
            case 11: {
                n4 = 42;
                break;
            }
            case 12: {
                n4 = 45;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 8;
                break;
            }
            case 15: {
                n4 = 33;
                break;
            }
            case 16: {
                n4 = 47;
                break;
            }
            case 17: {
                n4 = 30;
                break;
            }
            case 18: {
                n4 = 10;
                break;
            }
            case 19: {
                n4 = 27;
                break;
            }
            case 20: {
                n4 = 6;
                break;
            }
            case 21: {
                n4 = 36;
                break;
            }
            case 22: {
                n4 = 12;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 15;
                break;
            }
            case 25: {
                n4 = 20;
                break;
            }
            case 26: {
                n4 = 32;
                break;
            }
            case 27: {
                n4 = 1;
                break;
            }
            case 28: {
                n4 = 51;
                break;
            }
            case 29: {
                n4 = 37;
                break;
            }
            case 30: {
                n4 = 0;
                break;
            }
            case 31: {
                n4 = 38;
                break;
            }
            case 32: {
                n4 = 40;
                break;
            }
            case 33: {
                n4 = 5;
                break;
            }
            case 34: {
                n4 = 31;
                break;
            }
            case 35: {
                n4 = 54;
                break;
            }
            case 36: {
                n4 = 24;
                break;
            }
            case 37: {
                n4 = 22;
                break;
            }
            case 38: {
                n4 = 39;
                break;
            }
            case 39: {
                n4 = 26;
                break;
            }
            case 40: {
                n4 = 28;
                break;
            }
            case 41: {
                n4 = 49;
                break;
            }
            case 42: {
                n4 = 3;
                break;
            }
            case 43: {
                n4 = 50;
                break;
            }
            case 44: {
                n4 = 58;
                break;
            }
            case 45: {
                n4 = 2;
                break;
            }
            case 46: {
                n4 = 62;
                break;
            }
            case 47: {
                n4 = 56;
                break;
            }
            case 48: {
                n4 = 59;
                break;
            }
            case 49: {
                n4 = 11;
                break;
            }
            case 50: {
                n4 = 16;
                break;
            }
            case 51: {
                n4 = 52;
                break;
            }
            case 52: {
                n4 = 21;
                break;
            }
            case 53: {
                n4 = 46;
                break;
            }
            case 54: {
                n4 = 41;
                break;
            }
            case 55: {
                n4 = 34;
                break;
            }
            case 56: {
                n4 = 4;
                break;
            }
            case 57: {
                n4 = 57;
                break;
            }
            case 58: {
                n4 = 18;
                break;
            }
            case 59: {
                n4 = 19;
                break;
            }
            case 60: {
                n4 = 7;
                break;
            }
            case 61: {
                n4 = 55;
                break;
            }
            case 62: {
                n4 = 17;
                break;
            }
            default: {
                n4 = 13;
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
        yh.tb[n5] = new String(cArray);
        return n5;
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    public void T() {
    }

    private static Field k(long l10, long l11) {
        int n2 = yh.i(l10, l11);
        Object object = sb[n2];
        if (object instanceof String) {
            String string = tb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yh.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yh.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yh.e(clazz3, string2, clazz2)) != null) {
                    yh.sb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yh.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yh.sb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yh.j(216851983608990L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yh.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yh.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yh.i(l10, l11);
            object = sb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yh.sb[n2] = clazz = Class.forName(tb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void Z(Sz sz2) {
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        sb = new Object[5];
        tb = new String[5];
        yh.x();
        long l10 = ab ^ 0x10DD96E23998L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 4582331369471812905L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                fb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yh.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void u() {
    }

    @Override
    public double e() {
        return this.d().C();
    }

    @Override
    public void C() {
    }

    public double q() {
        double d2 = 0.0;
        try {
            if (!this.f()) {
                return d2;
            }
        }
        catch (O_ o_2) {
            throw yh.c(o_2);
        }
        for (ht ht2 : this.A()) {
            if (!ht2.f()) continue;
            d2 += ht2.w();
        }
        return d2;
    }

    public void C(double d2) {
        this.UK.A(d2);
    }

    @Override
    public double z() {
        return this.d().R();
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'O' || c10 == 'o' || c10 == 'f' || c10 == '\u00de') {
                field = yh.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yh.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void i() {
    }

    private static Method l(long l10, long l11) {
        int n2 = yh.i(l10, l11);
        Object object = sb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = tb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yh.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yh.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yh.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        yh.sb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yh.j(216851983608990L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yh.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yh.sb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yh.j(216851983608990L, 0L);
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

    private static void x() {
        Object[] objectArray = sb;
        sb[0] = "kRk";
        objectArray[1] = Integer.TYPE;
        yh.tb[1] = "java/lang/Integer";
        objectArray[2] = "5sQ1V`>|@~+x-{I7";
        objectArray[3] = "vp6\"`\u007f}\u007f'm\u0001qvt#7";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0016\u0000vT!:\u001bRum8.\u007f\u0001t\u0010)e\u0018\b$\u0006kUFY6\u00175,\u000eY \bS";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yh.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

