/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.CQ;
import a.F8;
import a.Iv;
import a.N6;
import a.RA;
import a.Rl;
import a.b3;
import a.bI;
import a.d8;
import a.n;
import a.w6;
import a.wn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fe
extends w6 {
    private wn D_;
    private Rl Dc;
    private static final long[] eb;
    private int Du;
    private static final long ab;
    private b3 DW;
    private static final Object[] qb;
    private String Ds;
    private static final String[] rb;
    private static final Integer[] fb;
    private List<Iv> D1;
    private bI Da;
    private RA D0;
    private static final Map lb;

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "Qgk";
        objectArray[1] = Integer.TYPE;
        fe.rb[1] = "java/lang/Integer";
        objectArray[2] = "\\LV\bR\u001fWCGG/\u0007DDN\u000e";
        objectArray[3] = "t\u0007B\rvn\u007f\bSB\u0017`t\u0003W\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001aG\tE\u001a\u0013\bS\b{\u0013VzCEB\u0018\u0014\u0010@O\u001cx\u0014\nW\u000e\u0019B\u0014\b\u0007\u0013{";
    }

    public void N(String string) {
        this.Ds = string;
        this.D_.I();
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fe.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                fe.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double w() {
        return 332.0;
    }

    public void I() {
    }

    @Override
    public void E() {
        this.S(true);
        this.D0.b(this.G());
        this.D0.M(this.W() + this.Q().b());
        this.DW.b(this.G() + this.D0.w());
        this.DW.M(this.W() + this.Q().b());
        this.D_.m(this.G() + this.D0.w(), this.W() + this.Q().b() + this.DW.b());
        this.Dc.b(this.G() + this.D0.w());
        this.Dc.M(this.D_.W() + this.D_.b());
        super.E();
        F8.A(this.G(), this.Q().W() + this.Q().b(), this.w(), 0.5, fe.M.S);
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fe.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fe.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x1EF316D0E1ACL;
        return fe.e("O", (int)fe.d("j", (int)19514, (long)(0x7C72E2BD2A292151L ^ l10)), (long)4868392736305025480L, (long)l10);
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2EFA;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fe", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fe.fb[n3] = n4;
        }
        return fb[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(1411511802083957338L, -7142844786352159890L, MethodHandles.lookup().lookupClass()).a(254621238985316L);
        qb = new Object[5];
        rb = new String[5];
        fe.T();
        lb = new HashMap(13);
        long l10 = ab ^ 0xF3F9DB2FD9DL;
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
        String string = "\u00fc\u00fc\u00a4X\u00b9m\u00dc\u0000\u00c89\u00da\u0006_\u00c7o#";
        int n3 = "\u00fc\u00fc\u00a4X\u00b9m\u00dc\u0000\u00c89\u00da\u0006_\u00c7o#".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        eb = lArray;
        fb = new Integer[2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fe" + " : " + string + " : " + methodType.toString(), exception);
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

    public void P(int n2) {
        this.Du = n2;
    }

    public fe() {
        long l10 = ab ^ 0x39D5392DF6AFL;
        this.Ds = "";
        this.D0 = new RA(this);
        this.DW = new b3(this);
        this.D_ = new wn(this);
        this.Dc = new Rl(this);
        this.b(200.0);
        this.M(200.0);
        n n2 = this.d();
        n2.o(false);
        n2.m(false);
        n2.y(false);
        n2.i(false);
        n2.v(false);
        this.a(new CQ(this, this, null, (String)((Object)fe.e("O", (int)fe.d("j", (int)25371, (long)(0x3A36CEF4ADC71972L ^ l10)), (long)6094256779052484299L, (long)l10))).Y(new N6(this)));
        this.o(this.D0);
        this.n(this.DW, new Object[0]);
        this.n(this.Dc, new Object[0]);
        this.N(true);
        this.L(true);
    }

    private static Field o(long l10, long l11) {
        int n2 = fe.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fe.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fe.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fe.g(clazz3, string2, clazz2)) != null) {
                    fe.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fe.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fe.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fe.n(234847352141334L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public int n() {
        return this.Du;
    }

    @Override
    public void R() {
        super.R();
        this.D_.R();
    }

    @Override
    public void i() {
    }

    @Override
    public void u() {
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fe.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String s() {
        return this.Ds;
    }

    @Override
    public double b() {
        return 215.0;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fe.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fe.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public bI m() {
        return this.Da;
    }

    public void G(bI bI2) {
        this.Da = bI2;
        this.D1 = new ArrayList<Iv>(bI2.J());
    }

    private static Method p(long l10, long l11) {
        int n2 = fe.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fe.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fe.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fe.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        fe.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fe.n(234847352141334L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fe.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fe.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fe.n(234847352141334L, 0L);
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

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == '\u00d1' || c10 == '\u00c8' || c10 == '\u00cc') {
                field = fe.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fe.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public wn L() {
        return this.D_;
    }

    @Override
    public void r(boolean bl2, boolean bl3) {
        super.r(bl2, bl3);
        this.D_.N(bl2);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fe.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 58;
                break;
            }
            case 1: {
                n4 = 8;
                break;
            }
            case 2: {
                n4 = 6;
                break;
            }
            case 3: {
                n4 = 46;
                break;
            }
            case 4: {
                n4 = 1;
                break;
            }
            case 5: {
                n4 = 45;
                break;
            }
            case 6: {
                n4 = 51;
                break;
            }
            case 7: {
                n4 = 28;
                break;
            }
            case 8: {
                n4 = 63;
                break;
            }
            case 9: {
                n4 = 37;
                break;
            }
            case 10: {
                n4 = 55;
                break;
            }
            case 11: {
                n4 = 14;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 52;
                break;
            }
            case 14: {
                n4 = 36;
                break;
            }
            case 15: {
                n4 = 62;
                break;
            }
            case 16: {
                n4 = 48;
                break;
            }
            case 17: {
                n4 = 60;
                break;
            }
            case 18: {
                n4 = 9;
                break;
            }
            case 19: {
                n4 = 39;
                break;
            }
            case 20: {
                n4 = 18;
                break;
            }
            case 21: {
                n4 = 29;
                break;
            }
            case 22: {
                n4 = 0;
                break;
            }
            case 23: {
                n4 = 12;
                break;
            }
            case 24: {
                n4 = 30;
                break;
            }
            case 25: {
                n4 = 25;
                break;
            }
            case 26: {
                n4 = 32;
                break;
            }
            case 27: {
                n4 = 43;
                break;
            }
            case 28: {
                n4 = 33;
                break;
            }
            case 29: {
                n4 = 44;
                break;
            }
            case 30: {
                n4 = 61;
                break;
            }
            case 31: {
                n4 = 42;
                break;
            }
            case 32: {
                n4 = 38;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 3;
                break;
            }
            case 35: {
                n4 = 11;
                break;
            }
            case 36: {
                n4 = 26;
                break;
            }
            case 37: {
                n4 = 35;
                break;
            }
            case 38: {
                n4 = 19;
                break;
            }
            case 39: {
                n4 = 49;
                break;
            }
            case 40: {
                n4 = 41;
                break;
            }
            case 41: {
                n4 = 2;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 24;
                break;
            }
            case 44: {
                n4 = 17;
                break;
            }
            case 45: {
                n4 = 23;
                break;
            }
            case 46: {
                n4 = 56;
                break;
            }
            case 47: {
                n4 = 16;
                break;
            }
            case 48: {
                n4 = 27;
                break;
            }
            case 49: {
                n4 = 34;
                break;
            }
            case 50: {
                n4 = 59;
                break;
            }
            case 51: {
                n4 = 31;
                break;
            }
            case 52: {
                n4 = 5;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 21;
                break;
            }
            case 55: {
                n4 = 57;
                break;
            }
            case 56: {
                n4 = 50;
                break;
            }
            case 57: {
                n4 = 13;
                break;
            }
            case 58: {
                n4 = 40;
                break;
            }
            case 59: {
                n4 = 4;
                break;
            }
            case 60: {
                n4 = 7;
                break;
            }
            case 61: {
                n4 = 53;
                break;
            }
            case 62: {
                n4 = 54;
                break;
            }
            default: {
                n4 = 47;
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
        fe.rb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fe.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fe.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

