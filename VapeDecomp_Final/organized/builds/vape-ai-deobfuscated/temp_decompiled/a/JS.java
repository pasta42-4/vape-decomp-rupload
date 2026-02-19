/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.SE;
import a.d8;
import a.jE;
import a.jk;
import a.sy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class js
extends jE<Double, js> {
    private static String g;
    private double a;
    private final String X;
    private final double x;
    private final String h;
    private final double S;
    private static final String[] y;
    private static final long[] e;
    private double m;
    private static final Object[] t;
    private static final Integer[] n;
    private final DecimalFormat k;
    private final DecimalFormat o;
    private static final long d;
    private static final Map s;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'J' || c10 == '\u00ed' || c10 == '\u00e0' || c10 == '\u00ff') {
                field = js.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = js.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private DecimalFormat Y() {
        DecimalFormat decimalFormat;
        long l10 = d ^ 0x3DB9F5C35795L;
        try {
            decimalFormat = new DecimalFormat(this.h);
        }
        catch (Exception exception) {
            SE.W(exception);
            decimalFormat = new DecimalFormat((String)((Object)js.d("\u00c4", (int)js.b("e", (int)22021, (long)(0x568001A26D9A8C2CL ^ l10)), (long)213739302250235819L, (long)l10)));
        }
        decimalFormat.setMinimumIntegerDigits(1);
        return decimalFormat;
    }

    public double p() {
        return this.x;
    }

    public void r(Double d2) {
        if (d2 > this.a) {
            d2 = this.a;
        } else if (d2 < -this.a) {
            d2 = -this.a;
        }
        try {
            super.H(sy.j(d2, this.m));
            this.M();
            if (this.U() instanceof jk) {
                ((jk)this.U()).J();
            }
        }
        catch (O_ o_2) {
            throw js.a(o_2);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = js.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public double q() {
        return this.S;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x58DF;
        if (n[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])s.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/js", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            js.n[n3] = n4;
        }
        return n[n3];
    }

    public static js b(Object object, String string, String string2, String string3, double d2, double d3, double d4, String string4) {
        return (js)new js(object, string, d3, d2, d4, string2, string3).R(string4);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = js.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method h(long l10, long l11) {
        int n2 = js.e(l10, l11);
        Object object = t[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = y[n2];
                int n4 = string2.indexOf(8);
                clazz3 = js.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = js.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = js.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        js.t[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = js.f(235926927840484L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = js.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        js.t[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = js.f(235926927840484L, 0L);
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

    public String I() {
        return this.X;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = js.e(l10, l11);
            object = t[n2];
            try {
                if (!(object instanceof String)) break block2;
                js.t[n2] = clazz = Class.forName(y[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static js D(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, String string4) {
        js js2 = new js(object, string, d3, d2, d4, string2, string3);
        js2.R(string4);
        js2.m = d5;
        return js2;
    }

    public static js N(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5) {
        js js2 = new js(object, string, d3, d2, d4, string2, string3);
        js2.m = d5;
        return js2;
    }

    @Override
    public String p() {
        String string = String.valueOf(this.J());
        string = this.k.format(this.J());
        return string;
    }

    public static js h(Object object, String string, String string2, String string3, String string4, double d2, double d3, double d4) {
        return new js(object, string, d3, d2, d4, string3, string4);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/js" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public js(Object object, String string, double d2, double d3, double d4, String string2, String string3) {
        long l10 = d ^ 0x8FB99B531E1L;
        super(object, string, d2);
        this.a = 999999.0;
        this.m = 0.01;
        this.S = d3;
        this.x = d4;
        if (!string3.isEmpty()) {
            string3 = (String)((Object)js.d("\u00c4", (int)js.b("e", (int)4867, (long)(0x2E1DCE60C4722F5FL ^ l10)), (long)7242755226612802015L, (long)l10)) + string3;
        }
        this.X = string3;
        this.h = string2;
        this.o = this.Y();
        this.k = this.Y();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = d8.a(-9128533860366410426L, 2943304703072060521L, MethodHandles.lookup().lookupClass()).a(267447196732920L);
        t = new Object[5];
        y = new String[5];
        js.a();
        s = new HashMap(13);
        js.S(null);
        long l10 = d ^ 0x76C68EFEC910L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "\u00caxG\u00cb1N\u00c0\u0082\u001c\u0080\u00d1!E\u0097vG";
        int n3 = "\u00caxG\u00cb1N\u00c0\u0082\u001c\u0080\u00d1!E\u0097vG".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        e = lArray;
        n = new Integer[2];
    }

    public void M(Double d2) {
        double d3 = (double)Math.round(d2 * 100.0) / 100.0;
        super.t(d3);
    }

    public void c(double d2) {
        this.a = d2;
    }

    public js C() {
        return new js(null, this.O(), (Double)this.J(), this.S, this.x, this.h, this.X);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = js.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = js.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void e(Double d2) {
        super.H(d2);
        this.M();
    }

    public static js t(Object object, String string, String string2, String string3, double d2, double d3, double d4) {
        return new js(object, string, d3, d2, d4, string2, string3);
    }

    private static O_ a(O_ o_2) {
        return o_2;
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

    public double o() {
        return this.m;
    }

    public static String t() {
        return g;
    }

    private static void a() {
        Object[] objectArray = t;
        t[0] = "mzA";
        objectArray[1] = Integer.TYPE;
        js.y[1] = "java/lang/Integer";
        objectArray[2] = "\u007f.)M\u001d>t!8\u0002`&g&1K";
        objectArray[3] = ",Eo=34'J~rR:,Az(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">drR\u0012@>g=0\u0006K[vy\r\u0014_jhr\nm\t*bp\u0000\u0001S8\u007f}0";
    }

    public static void S(String string) {
        g = string;
    }

    public js L(int n2) {
        this.k.setMaximumFractionDigits(n2);
        return this;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = js.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = js.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field g(long l10, long l11) {
        int n2 = js.e(l10, l11);
        Object object = t[n2];
        if (object instanceof String) {
            String string = y[n2];
            int n3 = string.indexOf(8);
            Class clazz = js.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = js.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = js.c(clazz3, string2, clazz2)) != null) {
                    js.t[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = js.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        js.t[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = js.f(235926927840484L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public DecimalFormat J() {
        return this.o;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (y[n5] != null) {
            return n5;
        }
        Object object = t[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 43;
                break;
            }
            case 1: {
                n4 = 8;
                break;
            }
            case 2: {
                n4 = 51;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 15;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 61;
                break;
            }
            case 7: {
                n4 = 5;
                break;
            }
            case 8: {
                n4 = 37;
                break;
            }
            case 9: {
                n4 = 26;
                break;
            }
            case 10: {
                n4 = 11;
                break;
            }
            case 11: {
                n4 = 49;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 42;
                break;
            }
            case 14: {
                n4 = 50;
                break;
            }
            case 15: {
                n4 = 32;
                break;
            }
            case 16: {
                n4 = 10;
                break;
            }
            case 17: {
                n4 = 54;
                break;
            }
            case 18: {
                n4 = 29;
                break;
            }
            case 19: {
                n4 = 44;
                break;
            }
            case 20: {
                n4 = 60;
                break;
            }
            case 21: {
                n4 = 27;
                break;
            }
            case 22: {
                n4 = 0;
                break;
            }
            case 23: {
                n4 = 23;
                break;
            }
            case 24: {
                n4 = 53;
                break;
            }
            case 25: {
                n4 = 36;
                break;
            }
            case 26: {
                n4 = 45;
                break;
            }
            case 27: {
                n4 = 2;
                break;
            }
            case 28: {
                n4 = 7;
                break;
            }
            case 29: {
                n4 = 28;
                break;
            }
            case 30: {
                n4 = 62;
                break;
            }
            case 31: {
                n4 = 21;
                break;
            }
            case 32: {
                n4 = 63;
                break;
            }
            case 33: {
                n4 = 13;
                break;
            }
            case 34: {
                n4 = 9;
                break;
            }
            case 35: {
                n4 = 33;
                break;
            }
            case 36: {
                n4 = 1;
                break;
            }
            case 37: {
                n4 = 30;
                break;
            }
            case 38: {
                n4 = 3;
                break;
            }
            case 39: {
                n4 = 59;
                break;
            }
            case 40: {
                n4 = 52;
                break;
            }
            case 41: {
                n4 = 17;
                break;
            }
            case 42: {
                n4 = 41;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 46;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 19;
                break;
            }
            case 47: {
                n4 = 55;
                break;
            }
            case 48: {
                n4 = 6;
                break;
            }
            case 49: {
                n4 = 25;
                break;
            }
            case 50: {
                n4 = 58;
                break;
            }
            case 51: {
                n4 = 14;
                break;
            }
            case 52: {
                n4 = 57;
                break;
            }
            case 53: {
                n4 = 12;
                break;
            }
            case 54: {
                n4 = 24;
                break;
            }
            case 55: {
                n4 = 56;
                break;
            }
            case 56: {
                n4 = 34;
                break;
            }
            case 57: {
                n4 = 35;
                break;
            }
            case 58: {
                n4 = 4;
                break;
            }
            case 59: {
                n4 = 20;
                break;
            }
            case 60: {
                n4 = 31;
                break;
            }
            case 61: {
                n4 = 40;
                break;
            }
            case 62: {
                n4 = 48;
                break;
            }
            default: {
                n4 = 16;
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
        js.y[n5] = new String(cArray);
        return n5;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/js" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void i(String string) {
        try {
            if (string.isEmpty()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw js.a(o_2);
        }
        this.e(Double.parseDouble(string));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(js.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(js.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

