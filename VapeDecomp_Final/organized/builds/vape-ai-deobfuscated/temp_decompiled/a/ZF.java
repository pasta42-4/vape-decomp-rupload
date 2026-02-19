/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.O_;
import a.SE;
import a.VT;
import a.WG;
import a.WO;
import a.Xi;
import a.YB;
import a.YY;
import a.d8;
import a.kX;
import a.s4;
import a.sj;
import a.zO;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class zf
implements s4 {
    protected YY n;
    protected byte[] C;
    private static final Object[] g;
    private static String[] c;
    private boolean o;
    protected byte[] P;
    private boolean j;
    private static final long a;
    private static final String[] h;
    protected Class X;

    public void P(HK hK2, Class clazz, sj ... sjArray) {
        WG wG2 = new WG(0, clazz, this.n, new zO(hK2.B(), hK2.G()), hK2.N(), sjArray);
        wG2.P();
        wG2.O();
    }

    public static String[] D() {
        return c;
    }

    @Override
    public void i() {
        this.P = Xi.Q(this.X, true);
        this.C = new byte[this.P.length];
        System.arraycopy(this.P, 0, this.C, 0, this.P.length);
        WO wO2 = new WO(this.P);
        this.n = new YY();
        wO2.A(this.n, 0);
    }

    public void l(HK hK2, Class clazz, sj ... sjArray) {
        WG wG2 = new WG(-1, clazz, this.n, new zO(hK2.B(), hK2.G()), hK2.N(), sjArray);
        wG2.P();
        wG2.O();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = zf.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = zf.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = zf.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static {
        a = d8.a(-8829218376023225282L, -2895064071857209161L, MethodHandles.lookup().lookupClass()).a(45289957817224L);
        g = new Object[6];
        h = new String[6];
        zf.a();
        if (zf.D() == null) {
            zf.V(new String[5]);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void h() {
        int n2 = 3;
        if (kX.C() >= 23) {
            n2 = 2;
        }
        YB yB2 = new YB(n2);
        this.n.a(yB2);
        this.C = yB2.V();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = zf.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = zf.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void V(String[] stringArray) {
        c = stringArray;
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

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = zf.a(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                zf.g[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l10, long l11) {
        int n2 = zf.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = zf.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = zf.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = zf.a(clazz3, string2, clazz2)) != null) {
                    zf.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = zf.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        zf.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = zf.b(329626215364529L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public zf(Class clazz) {
        if (!SE.h.r()) {
            VT.J().B().put(clazz.getName(), clazz);
        }
        this.X = clazz;
    }

    @Override
    public void d() {
        long l10 = a ^ 0x2117D4F4E5D6L;
        zf.b("w", (Object)this.X, (Object)this.P, (long)8708680696730795935L, (long)l10);
    }

    private static Method d(long l10, long l11) {
        int n2 = zf.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = zf.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = zf.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = zf.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        zf.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = zf.b(329626215364529L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = zf.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        zf.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = zf.b(329626215364529L, 0L);
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

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0004CwU";
        objectArray[1] = "n\u0001!\u0003\u0013Ae\u000e0L~Ae\u0013$";
        objectArray[2] = "e\u000e";
        objectArray[3] = Integer.TYPE;
        zf.h[3] = "java/lang/Integer";
        objectArray[4] = "\u000f|a3uq\u0004sp|\u0014\u007f\u000fxt&";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "\u0016I\u0019\u001dfkI\u0004\u0000y\u0007\u000fM\u0007\u0018A3~KZX\u0013X6\u000eGZ\u0017&t\u0004R\nybn\u0019I\u0019Bhr\u0004\u0000f";
    }

    /*
     * Loose catch block
     */
    public void Q(String string, byte[] byArray) {
        long l10 = a ^ 0x2E69B98C8C6BL;
        String[] stringArray = zf.D();
        try {
            File file;
            block6: {
                file = new File(string);
                boolean bl2 = file.getParentFile().exists();
                if (stringArray == null) break block6;
                try {
                    block7: {
                        if (bl2) break block6;
                        break block7;
                        catch (Exception exception) {
                            throw zf.a(exception);
                        }
                    }
                    bl2 = file.getParentFile().mkdirs();
                }
                catch (Exception exception) {
                    throw zf.a(exception);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byArray);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    @Override
    public boolean P() {
        return this.o;
    }

    @Override
    public abstract void y();

    @Override
    public Class l() {
        return this.X;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'H' || c10 == '\u00aa' || c10 == 'v' || c10 == '\u00d5') {
                field = zf.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = zf.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void v() {
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = g[n5];
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
                n4 = 40;
                break;
            }
            case 2: {
                n4 = 46;
                break;
            }
            case 3: {
                n4 = 0;
                break;
            }
            case 4: {
                n4 = 18;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            case 6: {
                n4 = 10;
                break;
            }
            case 7: {
                n4 = 34;
                break;
            }
            case 8: {
                n4 = 19;
                break;
            }
            case 9: {
                n4 = 31;
                break;
            }
            case 10: {
                n4 = 20;
                break;
            }
            case 11: {
                n4 = 5;
                break;
            }
            case 12: {
                n4 = 4;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 61;
                break;
            }
            case 16: {
                n4 = 29;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 8;
                break;
            }
            case 19: {
                n4 = 47;
                break;
            }
            case 20: {
                n4 = 25;
                break;
            }
            case 21: {
                n4 = 42;
                break;
            }
            case 22: {
                n4 = 62;
                break;
            }
            case 23: {
                n4 = 45;
                break;
            }
            case 24: {
                n4 = 51;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 22;
                break;
            }
            case 27: {
                n4 = 38;
                break;
            }
            case 28: {
                n4 = 36;
                break;
            }
            case 29: {
                n4 = 30;
                break;
            }
            case 30: {
                n4 = 49;
                break;
            }
            case 31: {
                n4 = 52;
                break;
            }
            case 32: {
                n4 = 21;
                break;
            }
            case 33: {
                n4 = 44;
                break;
            }
            case 34: {
                n4 = 58;
                break;
            }
            case 35: {
                n4 = 37;
                break;
            }
            case 36: {
                n4 = 12;
                break;
            }
            case 37: {
                n4 = 59;
                break;
            }
            case 38: {
                n4 = 6;
                break;
            }
            case 39: {
                n4 = 48;
                break;
            }
            case 40: {
                n4 = 57;
                break;
            }
            case 41: {
                n4 = 56;
                break;
            }
            case 42: {
                n4 = 17;
                break;
            }
            case 43: {
                n4 = 43;
                break;
            }
            case 44: {
                n4 = 1;
                break;
            }
            case 45: {
                n4 = 35;
                break;
            }
            case 46: {
                n4 = 14;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 23;
                break;
            }
            case 51: {
                n4 = 55;
                break;
            }
            case 52: {
                n4 = 15;
                break;
            }
            case 53: {
                n4 = 27;
                break;
            }
            case 54: {
                n4 = 63;
                break;
            }
            case 55: {
                n4 = 53;
                break;
            }
            case 56: {
                n4 = 3;
                break;
            }
            case 57: {
                n4 = 41;
                break;
            }
            case 58: {
                n4 = 9;
                break;
            }
            case 59: {
                n4 = 11;
                break;
            }
            case 60: {
                n4 = 54;
                break;
            }
            case 61: {
                n4 = 39;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 28;
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
        zf.h[n5] = new String(cArray);
        return n5;
    }

    @Override
    public int s() {
        long l10 = a ^ 0x3596B818029EL;
        try {
            if (this.j) {
                return -3;
            }
        }
        catch (O_ o_2) {
            throw zf.a(o_2);
        }
        this.h();
        CallSite callSite = zf.b("w", (Object)this.X, (Object)this.C, (long)-6948097157838907177L, (long)l10);
        return (int)callSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

