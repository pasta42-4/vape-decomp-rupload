/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.CT;
import a.Ca;
import a.Cb;
import a.Cj;
import a.O_;
import a.d8;
import a.he;
import a.hy;
import a.ks;
import a.yh;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ym
extends yh {
    private static final String[] mb;
    private static final long eb;
    private hy XS;
    private final Cj XE;
    private final Consumer<CT> X2;
    private static final Object[] lb;
    private static final long bb;
    private static int[] Xn;
    private final List<CT> Xj;

    @Override
    public double e() {
        return super.e();
    }

    public static void I(int[] nArray) {
        Xn = nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = d8.a(8290181752500479922L, -3147581690595243921L, MethodHandles.lookup().lookupClass()).a(144462088263223L);
        lb = new Object[5];
        mb = new String[5];
        ym.D();
        long l10 = bb ^ 0x447F12C103AAL;
        ym.I(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 2755313213623519422L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                eb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ym" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    public List<CT> i() {
        return this.Xj;
    }

    public boolean B(String string) {
        for (CT cT2 : this.Xj) {
            try {
                if (!cT2.R().equalsIgnoreCase(string)) continue;
                return true;
            }
            catch (O_ o_2) {
                throw ym.a(o_2);
            }
        }
        return false;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d1' || c10 == 'Y' || c10 == '\u00c1' || c10 == 'y') {
                field = ym.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ym.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ym.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void P() {
        block4: {
            try {
                try {
                    if (this.XE.a().isEmpty() && this.Xj.isEmpty()) break block4;
                }
                catch (O_ o_2) {
                    throw ym.a(o_2);
                }
                this.XE.y("");
                this.Xj.clear();
            }
            catch (O_ o_3) {
                throw ym.a(o_3);
            }
        }
    }

    private static Method p(long l10, long l11) {
        int n2 = ym.m(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = ym.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ym.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ym.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        ym.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ym.n(277651027941209L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ym.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ym.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ym.n(277651027941209L, 0L);
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

    public Cb J() {
        return this.XE;
    }

    static List B(ym ym2) {
        return ym2.Xj;
    }

    @Override
    public void G() {
        super.G();
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 48;
                break;
            }
            case 1: {
                n4 = 14;
                break;
            }
            case 2: {
                n4 = 50;
                break;
            }
            case 3: {
                n4 = 21;
                break;
            }
            case 4: {
                n4 = 55;
                break;
            }
            case 5: {
                n4 = 36;
                break;
            }
            case 6: {
                n4 = 53;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 8: {
                n4 = 33;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 39;
                break;
            }
            case 11: {
                n4 = 12;
                break;
            }
            case 12: {
                n4 = 51;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 59;
                break;
            }
            case 16: {
                n4 = 32;
                break;
            }
            case 17: {
                n4 = 44;
                break;
            }
            case 18: {
                n4 = 1;
                break;
            }
            case 19: {
                n4 = 61;
                break;
            }
            case 20: {
                n4 = 57;
                break;
            }
            case 21: {
                n4 = 0;
                break;
            }
            case 22: {
                n4 = 45;
                break;
            }
            case 23: {
                n4 = 9;
                break;
            }
            case 24: {
                n4 = 52;
                break;
            }
            case 25: {
                n4 = 5;
                break;
            }
            case 26: {
                n4 = 3;
                break;
            }
            case 27: {
                n4 = 18;
                break;
            }
            case 28: {
                n4 = 20;
                break;
            }
            case 29: {
                n4 = 54;
                break;
            }
            case 30: {
                n4 = 19;
                break;
            }
            case 31: {
                n4 = 16;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 37;
                break;
            }
            case 34: {
                n4 = 42;
                break;
            }
            case 35: {
                n4 = 28;
                break;
            }
            case 36: {
                n4 = 29;
                break;
            }
            case 37: {
                n4 = 40;
                break;
            }
            case 38: {
                n4 = 11;
                break;
            }
            case 39: {
                n4 = 41;
                break;
            }
            case 40: {
                n4 = 43;
                break;
            }
            case 41: {
                n4 = 25;
                break;
            }
            case 42: {
                n4 = 13;
                break;
            }
            case 43: {
                n4 = 22;
                break;
            }
            case 44: {
                n4 = 26;
                break;
            }
            case 45: {
                n4 = 58;
                break;
            }
            case 46: {
                n4 = 49;
                break;
            }
            case 47: {
                n4 = 15;
                break;
            }
            case 48: {
                n4 = 63;
                break;
            }
            case 49: {
                n4 = 7;
                break;
            }
            case 50: {
                n4 = 46;
                break;
            }
            case 51: {
                n4 = 47;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 24;
                break;
            }
            case 54: {
                n4 = 17;
                break;
            }
            case 55: {
                n4 = 38;
                break;
            }
            case 56: {
                n4 = 30;
                break;
            }
            case 57: {
                n4 = 2;
                break;
            }
            case 58: {
                n4 = 35;
                break;
            }
            case 59: {
                n4 = 8;
                break;
            }
            case 60: {
                n4 = 10;
                break;
            }
            case 61: {
                n4 = 23;
                break;
            }
            case 62: {
                n4 = 56;
                break;
            }
            default: {
                n4 = 27;
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
        ym.mb[n5] = new String(cArray);
        return n5;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ym.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ym.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "WAv";
        objectArray[1] = Integer.TYPE;
        ym.mb[1] = "java/lang/Integer";
        objectArray[2] = "\u0007u\u000b+Ow\fz\u001ad2o\u001f}\u0013-";
        objectArray[3] = "\u001f^J\u0017=R\u0014Q[X\\\\\u001fZ_\u0002";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "*~MpwSy|\u0016\u0017gP\u0017`\u0016vk\u0017g#\u0018t\f\u0011/!F,2Pzs@\u0017";
    }

    public void Z() {
        if (!this.Xj.isEmpty()) {
            CT cT2 = this.Xj.remove(this.Xj.size() - 1);
            try {
                if (cT2 != null) {
                    this.X2.accept(cT2);
                }
            }
            catch (O_ o_2) {
                throw ym.a(o_2);
            }
        }
    }

    public List<String> S() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (CT cT2 : this.Xj) {
            arrayList.add(cT2.R());
        }
        return arrayList;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ym.m(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                ym.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int[] N() {
        return Xn;
    }

    private static Field o(long l10, long l11) {
        int n2 = ym.m(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = ym.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ym.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ym.g(clazz3, string2, clazz2)) != null) {
                    ym.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ym.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ym.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ym.n(277651027941209L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ym.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ym.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public hy F() {
        return this.XS;
    }

    public void p(CT cT2) {
        this.Xj.add(cT2);
    }

    @Override
    public double z() {
        return super.z();
    }

    public void i(CT cT2) {
        this.Xj.remove(cT2);
    }

    public ym(String string, Consumer<CT> consumer, double d2, double d3, boolean bl2, boolean bl3) {
        long l10 = bb ^ 0x71189C0E334DL;
        super(d2);
        this.Xj = new ArrayList<CT>();
        this.X2 = consumer;
        ks ks2 = new ks();
        ks2.b(null);
        this.XE = new Ca(this, string, bl2, bl3);
        this.XE.M(ks2);
        this.XE.A().N(false);
        this.XS = new hy((String)((Object)ym.c("\u00f3", (int)((int)eb), (long)-2811611868679601233L, (long)l10)), 1.0);
        this.XS.N(false);
        this.XS.T(10.0);
        this.XS.w(10.0);
        this.XE.T(d2);
        this.XE.w(d3);
        this.XE.i(false);
        this.XE.I(false);
        this.XE.Z(0.0);
        this.XE.R(0.0f);
        this.XE.H(0.0f);
        this.XE.i(false);
        this.XE.I(false);
        this.XE.Q(Color.RED);
        this.XE.J(Color.BLUE);
        this.i(false);
        this.XE.O().N(false);
        this.XE.g(ym.M.w);
        this.n(this.XE, new Object[0]);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.XE.l(new he(this, atomicBoolean, consumer));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ym.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

