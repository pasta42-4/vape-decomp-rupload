/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.v2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mm
extends v2 {
    private static String y;
    private static final Object[] d;
    private static final long b;
    private static final long a;
    private static final String[] e;
    public HK c;
    public HK t;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = mm.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = mm.e(l10, l11);
            object = d[n2];
            try {
                if (!(object instanceof String)) break block2;
                mm.d[n2] = clazz = Class.forName(e[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public Object o(Object object, Object object2) {
        return this.c.T(object, object2);
    }

    public static String S() {
        return y;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e1' || c10 == '\u00e2' || c10 == '\u00d0' || c10 == '\u00fc') {
                field = mm.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = mm.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c6' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "2Kn:";
        objectArray[1] = "\b|mgpN\u0003s|(\rV\u0010tua";
        objectArray[2] = Boolean.TYPE;
        mm.e[2] = "java/lang/Boolean";
        objectArray[3] = "A-gK\u0001_J\"v\u0004l_J?b";
        objectArray[4] = "\u0012GP05Egg[?$\n\ng[\"0\u001f";
        objectArray[5] = "\u000f:\u0016\u0011";
        objectArray[6] = "w\u0003\u007f";
        objectArray[7] = Integer.TYPE;
        mm.e[7] = "java/lang/Integer";
        objectArray[8] = "\u001b\u007f[\u001f\u000b$n_P\u0010\u001ak\u0003_P\r\u000e~";
        objectArray[9] = "YU8eChRZ)*\"fYQ-p";
        objectArray[10] = "3\\xW1`#^i'\u001c\r'Xt\u0019425_!'bc=\fs\\\"j0^\u0018\u001djp%\u001axZcf9f&\u001b'17\u0003 \u001e&`^]yL!b1\r Db\r";
        objectArray[11] = "BGw\u000fE\u000f@Gp\u0000.\t\u0005!.\u001fJ\f\u0004\u001fr\u0000_\u0004~X,\r\u0010\rAJ+X.";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "\u001f\b4paj\u000f\n%\u0000L\u0007L\u000e(<bbJ\u000b)m\u000b<\u0013Y.odlJQm\u0000";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = mm.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = mm.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(-4972686425827948710L, -6958418775244714160L, MethodHandles.lookup().lookupClass()).a(104941208460877L);
        d = new Object[13];
        e = new String[13];
        mm.a();
        long l10 = a ^ 0x2511C57E76EFL;
        mm.t(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 4450575592937760485L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public Object W(Object object, List list, Object object2) {
        return this.t.A(object, list, object2);
    }

    private static Method h(long l10, long l11) {
        int n2 = mm.e(l10, l11);
        Object object = d[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n2];
                int n4 = string2.indexOf(8);
                clazz3 = mm.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = mm.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = mm.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        mm.d[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = mm.f(675325560602647L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = mm.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        mm.d[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = mm.f(675325560602647L, 0L);
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

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (e[n5] != null) {
            return n5;
        }
        Object object = d[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 0;
                break;
            }
            case 1: {
                n4 = 58;
                break;
            }
            case 2: {
                n4 = 38;
                break;
            }
            case 3: {
                n4 = 57;
                break;
            }
            case 4: {
                n4 = 9;
                break;
            }
            case 5: {
                n4 = 11;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 30;
                break;
            }
            case 8: {
                n4 = 60;
                break;
            }
            case 9: {
                n4 = 48;
                break;
            }
            case 10: {
                n4 = 34;
                break;
            }
            case 11: {
                n4 = 8;
                break;
            }
            case 12: {
                n4 = 23;
                break;
            }
            case 13: {
                n4 = 17;
                break;
            }
            case 14: {
                n4 = 1;
                break;
            }
            case 15: {
                n4 = 6;
                break;
            }
            case 16: {
                n4 = 3;
                break;
            }
            case 17: {
                n4 = 24;
                break;
            }
            case 18: {
                n4 = 16;
                break;
            }
            case 19: {
                n4 = 42;
                break;
            }
            case 20: {
                n4 = 32;
                break;
            }
            case 21: {
                n4 = 13;
                break;
            }
            case 22: {
                n4 = 25;
                break;
            }
            case 23: {
                n4 = 53;
                break;
            }
            case 24: {
                n4 = 47;
                break;
            }
            case 25: {
                n4 = 19;
                break;
            }
            case 26: {
                n4 = 49;
                break;
            }
            case 27: {
                n4 = 2;
                break;
            }
            case 28: {
                n4 = 20;
                break;
            }
            case 29: {
                n4 = 50;
                break;
            }
            case 30: {
                n4 = 35;
                break;
            }
            case 31: {
                n4 = 41;
                break;
            }
            case 32: {
                n4 = 40;
                break;
            }
            case 33: {
                n4 = 33;
                break;
            }
            case 34: {
                n4 = 10;
                break;
            }
            case 35: {
                n4 = 43;
                break;
            }
            case 36: {
                n4 = 46;
                break;
            }
            case 37: {
                n4 = 26;
                break;
            }
            case 38: {
                n4 = 28;
                break;
            }
            case 39: {
                n4 = 54;
                break;
            }
            case 40: {
                n4 = 36;
                break;
            }
            case 41: {
                n4 = 51;
                break;
            }
            case 42: {
                n4 = 4;
                break;
            }
            case 43: {
                n4 = 44;
                break;
            }
            case 44: {
                n4 = 14;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 55;
                break;
            }
            case 47: {
                n4 = 31;
                break;
            }
            case 48: {
                n4 = 45;
                break;
            }
            case 49: {
                n4 = 39;
                break;
            }
            case 50: {
                n4 = 12;
                break;
            }
            case 51: {
                n4 = 59;
                break;
            }
            case 52: {
                n4 = 21;
                break;
            }
            case 53: {
                n4 = 56;
                break;
            }
            case 54: {
                n4 = 61;
                break;
            }
            case 55: {
                n4 = 27;
                break;
            }
            case 56: {
                n4 = 37;
                break;
            }
            case 57: {
                n4 = 22;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 63;
                break;
            }
            case 60: {
                n4 = 62;
                break;
            }
            case 61: {
                n4 = 52;
                break;
            }
            case 62: {
                n4 = 29;
                break;
            }
            default: {
                n4 = 7;
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
        mm.e[n5] = new String(cArray);
        return n5;
    }

    public mm() {
        String string;
        block8: {
            long l10;
            block7: {
                l10 = a ^ 0x3FF50B7BB71DL;
                String string2 = mm.S();
                super(eM.Vi);
                string = string2;
                try {
                    try {
                        if (string != null) break block7;
                        if (!Na.MC_1_20_6.H()) break block8;
                    }
                    catch (O_ o_2) {
                        throw mm.a(o_2);
                    }
                    this.c = mm.b("\u00c6", (Object)this, (Object)mm.b("F", (int)((int)b), (long)2554071481419269884L, (long)l10), (boolean)true, eM.Vi, (Object)new Class[]{eM.Vw}, (long)2553990923965093074L, (long)l10);
                }
                catch (O_ o_3) {
                    throw mm.a(o_3);
                }
            }
            this.t = mm.b("\u00c6", (Object)this, (Object)new Class[]{eM.F5, List.class, eM.Vw}, (long)2553557726770789691L, (long)l10);
        }
        try {
            if (string != null) {
                ht.I(new String[4]);
            }
        }
        catch (O_ o_4) {
            throw mm.a(o_4);
        }
    }

    public static void t(String string) {
        y = string;
    }

    private static Field g(long l10, long l11) {
        int n2 = mm.e(l10, l11);
        Object object = d[n2];
        if (object instanceof String) {
            String string = e[n2];
            int n3 = string.indexOf(8);
            Class clazz = mm.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = mm.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = mm.c(clazz3, string2, clazz2)) != null) {
                    mm.d[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = mm.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        mm.d[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = mm.f(675325560602647L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = mm.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = mm.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mm.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

