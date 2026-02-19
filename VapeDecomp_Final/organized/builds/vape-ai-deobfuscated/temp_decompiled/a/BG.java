/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.JT;
import a.O_;
import a.Sz;
import a.b2;
import a.bM;
import a.bh;
import a.d8;
import a.ht;
import a.rf;
import a.zc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
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
public class bg
extends ht {
    private static final Map bb;
    private static final Object[] db;
    private Color Y;
    private static final Integer[] ab;
    private static final String[] eb;
    private ht B;
    private JT v;
    private b2 R;
    private boolean b;
    private bM E;
    private static final long F;
    private static final long[] V;
    private boolean L;

    public double C() {
        return this.v.c();
    }

    private static void a() {
        Object[] objectArray = db;
        db[0] = "]\rK";
        objectArray[1] = Integer.TYPE;
        bg.eb[1] = "java/lang/Integer";
        objectArray[2] = "?_\u0019\u001aue4P\bU\b}'W\u0001\u001c";
        objectArray[3] = "uX\u001a@ ^~W\u000b\u000fAPu\\\u000fU";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "wiN#EmlfMYR/\u00109\u001a#\u0000l\u007f:\u00195\u0000T)o\b>Ciu\u007fFh9";
    }

    public ht X() {
        return this.B;
    }

    @Override
    public void M(double d2) {
        super.M(d2);
    }

    public double i() {
        return this.v.v();
    }

    public void R(double d2) {
        this.v.C(d2);
    }

    public void v(double d2) {
        this.v.o(d2);
    }

    public void W(boolean bl2) {
        this.v.o(bl2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l10, long l11) {
        int n2 = bg.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bg.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bg.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bg.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bg.db[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bg.f(213364073617492L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bg.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bg.db[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bg.f(213364073617492L, 0L);
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

    public void V(double d2, double d3) {
        block20: {
            long l10;
            block18: {
                block19: {
                    block13: {
                        block17: {
                            G5 g5;
                            block16: {
                                G5 g52;
                                block15: {
                                    double d4;
                                    block14: {
                                        l10 = F ^ 0x52A9A1019768L;
                                        d4 = zc.L.v(this.v);
                                        try {
                                            try {
                                                if (!(d4 >= this.v.w())) break block13;
                                                if (!this.v.A()) break block14;
                                            }
                                            catch (O_ o_2) {
                                                throw bg.a(o_2);
                                            }
                                            g52 = this.t(d4);
                                            break block15;
                                        }
                                        catch (O_ o_3) {
                                            throw bg.a(o_3);
                                        }
                                    }
                                    g52 = this.L(d4);
                                }
                                g5 = g52;
                                try {
                                    if (!this.L) break block16;
                                    g5.Y(this.v.t(), d2, d3 - g5.B(this.v.t()) / 2.0, this.Y);
                                    break block17;
                                }
                                catch (O_ o_4) {
                                    throw bg.a(o_4);
                                }
                            }
                            g5.R(this.v.t(), d2, d3 - g5.B(this.v.t()) / 2.0, this.Y);
                        }
                        this.i((bh)null);
                        this.E = null;
                        break block20;
                    }
                    try {
                        try {
                            if (!this.b) break block18;
                            if (this.R != null) break block19;
                        }
                        catch (O_ o_5) {
                            throw bg.a(o_5);
                        }
                        this.R = new b2(this.v.t(), this.v.x(), this.v.w(), this.Y, null, this.I(), this.L);
                    }
                    catch (O_ o_6) {
                        throw bg.a(o_6);
                    }
                }
                this.B();
                this.R.y(d2, d3 - this.E() / 2.0);
                this.i(this.R.E());
                break block20;
            }
            try {
                if (this.E == null) {
                    this.E = new bM(this.v.t(), (String)((Object)bg.c("\u00f6", (int)bg.b("h", (int)27422, (long)(0x5F15920F30F2ABCDL ^ l10)), (long)5155910742943013220L, (long)l10)), this.v.x(), this.v.w(), this.Y, this.I(), this.L);
                }
            }
            catch (O_ o_7) {
                throw bg.a(o_7);
            }
            this.D();
            this.E.y(d2, d3 - this.E() / 2.0);
            this.i(this.E.E());
        }
    }

    public double K() {
        return this.v.x();
    }

    @Override
    public void Z(Sz sz2) {
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e7' || c10 == 'W' || c10 == '\u00db' || c10 == 'v') {
                field = bg.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bg.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public void V(String string) {
        this.v.U(string);
    }

    public Color e() {
        return this.Y;
    }

    private void D() {
        long l10 = F ^ 0x576E6E9EE030L;
        this.E.a(new rf(this.v.t(), (String)((Object)bg.c("\u00f6", (int)bg.b("h", (int)14744, (long)(0x1A5775F1A010E12L ^ l10)), (long)3518855328934555196L, (long)l10)), this.v.x(), this.v.w(), this.v.A()));
        this.E.S(this.e());
        this.E.B(this.D());
    }

    @Override
    public double z() {
        return this.E();
    }

    public void f(boolean bl2) {
        this.L = bl2;
    }

    public void i(JT jT2) {
        this.v = jT2;
    }

    @Override
    public void g() {
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bg.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bg.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void s(ht ht2) {
        this.B = ht2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        F = d8.a(107482110452485020L, -1460356134826893924L, MethodHandles.lookup().lookupClass()).a(193851286700117L);
        db = new Object[5];
        eb = new String[5];
        bg.a();
        bb = new HashMap(13);
        long l10 = F ^ 0x2048BF8F6F5FL;
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
        String string = "\u00ac\u0018\u00ad\u00a3\u00eaU\u00f2\u00f5Et\u00bbl\u00cb\u00cah\u00a4";
        int n3 = "\u00ac\u0018\u00ad\u00a3\u00eaU\u00f2\u00f5Et\u00bbl\u00cb\u00cah\u00a4".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        V = lArray;
        ab = new Integer[2];
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (eb[n5] != null) {
            return n5;
        }
        Object object = db[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 22;
                break;
            }
            case 1: {
                n4 = 41;
                break;
            }
            case 2: {
                n4 = 49;
                break;
            }
            case 3: {
                n4 = 50;
                break;
            }
            case 4: {
                n4 = 39;
                break;
            }
            case 5: {
                n4 = 1;
                break;
            }
            case 6: {
                n4 = 60;
                break;
            }
            case 7: {
                n4 = 42;
                break;
            }
            case 8: {
                n4 = 63;
                break;
            }
            case 9: {
                n4 = 29;
                break;
            }
            case 10: {
                n4 = 4;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 12;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 24;
                break;
            }
            case 15: {
                n4 = 13;
                break;
            }
            case 16: {
                n4 = 35;
                break;
            }
            case 17: {
                n4 = 20;
                break;
            }
            case 18: {
                n4 = 33;
                break;
            }
            case 19: {
                n4 = 26;
                break;
            }
            case 20: {
                n4 = 46;
                break;
            }
            case 21: {
                n4 = 37;
                break;
            }
            case 22: {
                n4 = 55;
                break;
            }
            case 23: {
                n4 = 11;
                break;
            }
            case 24: {
                n4 = 36;
                break;
            }
            case 25: {
                n4 = 45;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 2;
                break;
            }
            case 28: {
                n4 = 9;
                break;
            }
            case 29: {
                n4 = 3;
                break;
            }
            case 30: {
                n4 = 6;
                break;
            }
            case 31: {
                n4 = 53;
                break;
            }
            case 32: {
                n4 = 16;
                break;
            }
            case 33: {
                n4 = 32;
                break;
            }
            case 34: {
                n4 = 57;
                break;
            }
            case 35: {
                n4 = 54;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 14;
                break;
            }
            case 39: {
                n4 = 31;
                break;
            }
            case 40: {
                n4 = 8;
                break;
            }
            case 41: {
                n4 = 51;
                break;
            }
            case 42: {
                n4 = 19;
                break;
            }
            case 43: {
                n4 = 48;
                break;
            }
            case 44: {
                n4 = 30;
                break;
            }
            case 45: {
                n4 = 27;
                break;
            }
            case 46: {
                n4 = 21;
                break;
            }
            case 47: {
                n4 = 10;
                break;
            }
            case 48: {
                n4 = 34;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 47;
                break;
            }
            case 51: {
                n4 = 23;
                break;
            }
            case 52: {
                n4 = 25;
                break;
            }
            case 53: {
                n4 = 5;
                break;
            }
            case 54: {
                n4 = 62;
                break;
            }
            case 55: {
                n4 = 61;
                break;
            }
            case 56: {
                n4 = 15;
                break;
            }
            case 57: {
                n4 = 56;
                break;
            }
            case 58: {
                n4 = 59;
                break;
            }
            case 59: {
                n4 = 7;
                break;
            }
            case 60: {
                n4 = 17;
                break;
            }
            case 61: {
                n4 = 44;
                break;
            }
            case 62: {
                n4 = 40;
                break;
            }
            default: {
                n4 = 18;
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
        bg.eb[n5] = new String(cArray);
        return n5;
    }

    public double I() {
        double d2;
        try {
            if (this.E != null) {
                return this.E.u();
            }
        }
        catch (O_ o_2) {
            throw bg.a(o_2);
        }
        try {
            if (this.R != null) {
                return this.R.u();
            }
        }
        catch (O_ o_3) {
            throw bg.a(o_3);
        }
        double d3 = zc.L.v(this.v);
        try {
            d2 = this.v.A() ? this.t(d3).D(this.v.t()) : this.L(d3).D(this.v.t());
        }
        catch (O_ o_4) {
            throw bg.a(o_4);
        }
        return d2;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x75E;
        if (ab[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = V[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bg.ab[n3] = n4;
        }
        return ab[n3];
    }

    public bg(String string, double d2, double d3, double d4, double d5, boolean bl2, boolean bl3, Color color, ht ht2, boolean bl4) {
        this.v = new JT(string, d2, d3, d4, d5, bl2);
        this.Y = color;
        this.L = bl3;
        this.B = ht2;
        this.b = bl4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean I() {
        return this.v.A();
    }

    private void B() {
        this.R.a(new rf(this.v.t(), "", this.v.x(), this.v.w(), this.v.A()));
        this.R.S(this.e());
        this.R.B(this.D());
    }

    @Override
    public void d() {
    }

    public bg(String string, double d2, double d3, double d4, double d5, boolean bl2, boolean bl3, Color color, ht ht2) {
        this(string, d2, d3, d4, d5, bl2, bl3, color, ht2, false);
    }

    public String I() {
        return this.v.t();
    }

    public void a(double d2) {
        this.v.R(d2);
    }

    public void J(double d2) {
        this.v.b(d2);
    }

    @Override
    public void G() {
        this.V(this.G(), this.W() + this.z() / 2.0);
    }

    public boolean D() {
        return this.L;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void m(boolean bl2) {
        this.b = bl2;
    }

    @Override
    public void U() {
    }

    public void c(Color color) {
        this.Y = color;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bg.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public double E() {
        double d2;
        try {
            if (this.E != null) {
                return this.E.K();
            }
        }
        catch (O_ o_2) {
            throw bg.a(o_2);
        }
        try {
            if (this.R != null) {
                return this.R.K();
            }
        }
        catch (O_ o_3) {
            throw bg.a(o_3);
        }
        double d3 = zc.L.v(this.v);
        try {
            d2 = this.v.A() ? this.t(d3).B(this.v.t()) : this.L(d3).B(this.v.t());
        }
        catch (O_ o_4) {
            throw bg.a(o_4);
        }
        return d2;
    }

    public JT M() {
        return this.v;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bg.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bg.e(l10, l11);
            object = db[n2];
            try {
                if (!(object instanceof String)) break block2;
                bg.db[n2] = clazz = Class.forName(eb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean Q() {
        return this.b;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public bg(String string, double d2, double d3, double d4, double d5, boolean bl2, boolean bl3, Color color) {
        this(string, d2, d3, d4, d5, bl2, bl3, color, null);
    }

    @Override
    public double e() {
        return this.I();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bg.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bg.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void U(Color color) {
        try {
            if (this.R != null) {
                this.R.z(color);
            }
        }
        catch (O_ o_2) {
            throw bg.a(o_2);
        }
    }

    public double N() {
        return this.v.w();
    }

    private static Field g(long l10, long l11) {
        int n2 = bg.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            String string = eb[n2];
            int n3 = string.indexOf(8);
            Class clazz = bg.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bg.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bg.c(clazz3, string2, clazz2)) != null) {
                    bg.db[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bg.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bg.db[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bg.f(213364073617492L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

