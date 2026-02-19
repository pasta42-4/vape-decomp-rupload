/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.O_;
import a.SE;
import a.d8;
import a.ht;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class a {
    private static boolean Z;
    private static final String[] c;
    private static final Object[] b;
    private static final long a;

    public static boolean ib() {
        return SE.r;
    }

    public static native String[] gcf(Class var0);

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        a = d8.a(-6647740149158063288L, -3798536772642005955L, MethodHandles.lookup().lookupClass()).a(165591978782398L);
        b = new Object[7];
        c = new String[7];
        a.a.a();
        if (a.a.f()) {
            a.a.i(true);
        }
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

    public static native int ss_2(String var0);

    public static native long smpm(boolean var0, long var1, int var3, long var4, long var6);

    public static native double[] trn(double var0, double var2, double var4);

    public static native int dsv2(int var0, String var1, double var2, double var4, int var6, float var7);

    public static native Class gcj(String var0);

    public static native int scb(Class var0, byte[] var1);

    public static native boolean gtcf(Object var0, int var1, int var2);

    public static native void scm(String var0, String var1);

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = a.a.a(l10, l11);
            object = b[n2];
            try {
                if (!(object instanceof String)) break block2;
                a.a.b[n2] = clazz = Class.forName(c[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static native int gts();

    public static native void rs(int var0, double var1, double var3);

    public static native void cpy(String var0);

    public static native String[] gcm(Class var0);

    /*
     * Loose catch block
     */
    public static void reload() {
        long l10;
        block12: {
            l10 = a ^ 0x756BB562CDB0L;
            boolean bl2 = a.a.n();
            try {
                if (!EP.U().Y()) {
                    EP.r(null);
                    EP.Y();
                }
            }
            catch (InterruptedException interruptedException) {
                throw a.a.a(interruptedException);
            }
            for (xi xi2 : SE.h.U().q()) {
                block13: {
                    xi xi3;
                    block14: {
                        block15: {
                            if (!bl2) break block12;
                            xi3 = xi2;
                            if (!bl2) break block14;
                            break block15;
                            catch (InterruptedException interruptedException) {
                                throw a.a.a(interruptedException);
                            }
                        }
                        try {
                            block16: {
                                if (!xi3.Z()) break block13;
                                break block16;
                                catch (InterruptedException interruptedException) {
                                    throw a.a.a(interruptedException);
                                }
                            }
                            xi3 = xi2;
                        }
                        catch (InterruptedException interruptedException) {
                            throw a.a.a(interruptedException);
                        }
                    }
                    xi3.T(false);
                }
                if (bl2) continue;
                ht.I(new String[5]);
                break;
            }
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        SE.h.Q = true;
        a.a.a("\u00cd", (long)1471938314544113681L, (long)l10);
    }

    /*
     * Loose catch block
     */
    public static void start() {
        block6: {
            long l10 = a ^ 0x27D8CEDDCD4CL;
            boolean bl2 = a.a.n();
            try {
                SE sE2;
                block7: {
                    Thread.sleep(1000L);
                    SE sE3 = new SE();
                    sE2 = sE3;
                    if (!bl2) break block7;
                    try {
                        block8: {
                            if (!sE2.H()) break block6;
                            break block8;
                            catch (Throwable throwable) {
                                throw a.a.a(throwable);
                            }
                        }
                        a.a.a("\u00fe", (Object)sE3, (long)1482075715275394583L, (long)l10);
                        a.a.a("\u00fe", (Object)sE3, (long)1482246243401999943L, (long)l10);
                        sE2 = sE3;
                    }
                    catch (Throwable throwable) {
                        throw a.a.a(throwable);
                    }
                }
                sE2.B(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    public static native void updc(String var0, String var1);

    public static native Class gc(String var0);

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c0' || c10 == '\u00e6' || c10 == 'U' || c10 == '\u00d4') {
                field = a.a.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a.a.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static native void trs(int var0);

    public static native short gks(int var0);

    public static native void fs();

    public static native String cs(int var0);

    public static native byte[] gt(String var0);

    public static native double gshv2(int var0, String var1);

    public static native int ds(int var0, String var1, double var2, double var4, int var6);

    public static native boolean[] gls();

    public static void i(boolean bl2) {
        Z = bl2;
    }

    public static native byte[] gfb(String var0);

    public static native void sce(String var0);

    public static native int gk();

    public static native Object[] gco(Class var0);

    public static native int mf(int var0, int var1, String var2);

    @Deprecated
    public static native void ss(String var0);

    public static native String gp(String var0);

    public static native Class gvc(String var0);

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a.a.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = a.a.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = a.a.a(l10, l11);
        Object object = b[n2];
        if (object instanceof String) {
            String string = c[n2];
            int n3 = string.indexOf(8);
            Class clazz = a.a.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = a.a.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a.a.a(clazz3, string2, clazz2)) != null) {
                    a.a.b[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = a.a.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        a.a.b[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a.a.b(239994543677849L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (c[n5] != null) {
            return n5;
        }
        Object object = b[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 19;
                break;
            }
            case 1: {
                n4 = 38;
                break;
            }
            case 2: {
                n4 = 33;
                break;
            }
            case 3: {
                n4 = 14;
                break;
            }
            case 4: {
                n4 = 9;
                break;
            }
            case 5: {
                n4 = 60;
                break;
            }
            case 6: {
                n4 = 61;
                break;
            }
            case 7: {
                n4 = 55;
                break;
            }
            case 8: {
                n4 = 10;
                break;
            }
            case 9: {
                n4 = 49;
                break;
            }
            case 10: {
                n4 = 63;
                break;
            }
            case 11: {
                n4 = 42;
                break;
            }
            case 12: {
                n4 = 17;
                break;
            }
            case 13: {
                n4 = 21;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 5;
                break;
            }
            case 16: {
                n4 = 31;
                break;
            }
            case 17: {
                n4 = 24;
                break;
            }
            case 18: {
                n4 = 47;
                break;
            }
            case 19: {
                n4 = 29;
                break;
            }
            case 20: {
                n4 = 11;
                break;
            }
            case 21: {
                n4 = 2;
                break;
            }
            case 22: {
                n4 = 56;
                break;
            }
            case 23: {
                n4 = 8;
                break;
            }
            case 24: {
                n4 = 1;
                break;
            }
            case 25: {
                n4 = 54;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 39;
                break;
            }
            case 28: {
                n4 = 20;
                break;
            }
            case 29: {
                n4 = 45;
                break;
            }
            case 30: {
                n4 = 32;
                break;
            }
            case 31: {
                n4 = 46;
                break;
            }
            case 32: {
                n4 = 25;
                break;
            }
            case 33: {
                n4 = 6;
                break;
            }
            case 34: {
                n4 = 27;
                break;
            }
            case 35: {
                n4 = 37;
                break;
            }
            case 36: {
                n4 = 44;
                break;
            }
            case 37: {
                n4 = 13;
                break;
            }
            case 38: {
                n4 = 51;
                break;
            }
            case 39: {
                n4 = 52;
                break;
            }
            case 40: {
                n4 = 18;
                break;
            }
            case 41: {
                n4 = 4;
                break;
            }
            case 42: {
                n4 = 59;
                break;
            }
            case 43: {
                n4 = 26;
                break;
            }
            case 44: {
                n4 = 12;
                break;
            }
            case 45: {
                n4 = 30;
                break;
            }
            case 46: {
                n4 = 41;
                break;
            }
            case 47: {
                n4 = 16;
                break;
            }
            case 48: {
                n4 = 0;
                break;
            }
            case 49: {
                n4 = 34;
                break;
            }
            case 50: {
                n4 = 43;
                break;
            }
            case 51: {
                n4 = 62;
                break;
            }
            case 52: {
                n4 = 40;
                break;
            }
            case 53: {
                n4 = 50;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 48;
                break;
            }
            case 56: {
                n4 = 22;
                break;
            }
            case 57: {
                n4 = 53;
                break;
            }
            case 58: {
                n4 = 36;
                break;
            }
            case 59: {
                n4 = 3;
                break;
            }
            case 60: {
                n4 = 35;
                break;
            }
            case 61: {
                n4 = 15;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 23;
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
        a.a.c[n5] = new String(cArray);
        return n5;
    }

    public static native int sts();

    public static native boolean iv();

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = a.a.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static native double gswv2(int var0, String var1);

    public static native void dc();

    public static void sb() {
        long l10 = a ^ 0x39CAA64E97F3L;
        try {
            if (!SE.r) {
                SE.h.W();
            }
        }
        catch (O_ o_2) {
            throw a.a.a(o_2);
        }
    }

    public static native int mfv2(int var0, int var1, String var2);

    public static native Object grh();

    public static native String gat();

    public static native void mb(int var0);

    public static native double gsw(int var0, String var1);

    public static native byte[] gcb(Class var0);

    public static native double gsh(int var0, String var1);

    public static native void rl();

    public static native int mvk(int var0, int var1);

    public static native void exit(boolean var0);

    public static native void smd(int var0, int var1);

    public static native String gkn(long var0);

    public static native int ss_3(String var0);

    public static native int gmv();

    private static Method d(long l10, long l11) {
        int n2 = a.a.a(l10, l11);
        Object object = b[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n2];
                int n4 = string2.indexOf(8);
                clazz3 = a.a.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = a.a.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a.a.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        a.a.b[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a.a.b(239994543677849L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = a.a.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        a.a.b[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a.a.b(239994543677849L, 0L);
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

    public static native void smdp(int var0, int var1);

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = a.a.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = a.a.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0010k\f";
        objectArray[1] = Void.TYPE;
        a.a.c[1] = "java/lang/Void";
        objectArray[2] = "?G\u0004#";
        objectArray[3] = "F$f\u001d\t\u0011M+wRh\u001fF s\b";
        objectArray[4] = "8?!\fN\u0015c$6\\,\u001c\u00019<\u0019\u0012\u001bg}(\\,";
        objectArray[5] = "qsY\u0000'+uc\u0007g0+\u0011o^\u001dt*w+JXJ";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u000fR;2@\u007fTI,b\"m6T&'\u001cqP\u00102b\"";
    }

    public static native void rsc();

    public static boolean f() {
        boolean bl2 = a.a.n();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw a.a.a(o_2);
        }
        return false;
    }

    public static native String gcs(Class var0);

    public static native void p(String var0);

    public static void test() {
        System.out.println("test");
    }

    public static String sp(String string, String string2) {
        return null;
    }

    public static native String gs();

    public static boolean n() {
        return Z;
    }

    public static native void su(String var0);

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

