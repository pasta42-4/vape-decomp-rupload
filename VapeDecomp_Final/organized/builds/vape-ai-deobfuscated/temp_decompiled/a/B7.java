/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.IG;
import a.OD;
import a.O_;
import a.Sz;
import a.bM;
import a.d8;
import a.ht;
import a.hy;
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

public class b7
extends ht {
    private String Y;
    private bM v;
    private int D;
    private static final String[] nb;
    private static final Integer[] eb;
    private OD E;
    private int b;
    private hy V;
    private Color F;
    private static final long bb;
    private static final Map fb;
    private String n;
    private static int R;
    private float L;
    private static final long[] db;
    private static final Object[] mb;
    private boolean B;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void A(Color color) {
        this.F = color;
    }

    public b7 R(IG iG2) {
        this.V.N(iG2);
        return this;
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

    public void f(String string) {
        this.Y = string;
        this.v.d(string);
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public static void v(int n2) {
        R = n2;
    }

    public static int T() {
        return R;
    }

    public hy r() {
        return this.V;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'T' || c10 == '\u00fa' || c10 == '\u00c5' || c10 == '\u00d5') {
                field = b7.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b7.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = d8.a(6412839142715705820L, 5713174114440183999L, MethodHandles.lookup().lookupClass()).a(700805270682L);
        mb = new Object[5];
        nb = new String[5];
        b7.a();
        fb = new HashMap(13);
        long l10 = bb ^ 0x27FF592B23C7L;
        b7.v(55);
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
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u0005\u0090\u00ad\u00f1\u0094\u00cf\u00f9V\u009f\r\u00cdM\u00faa\u00b4>\u009f\u00d1\u008c-\u0099 |w";
        int n3 = "\u0005\u0090\u00ad\u00f1\u0094\u00cf\u00f9V\u009f\r\u00cdM\u00faa\u00b4>\u009f\u00d1\u008c-\u0099 |w".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        db = lArray;
        eb = new Integer[3];
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static Method h(long l10, long l11) {
        int n2 = b7.e(l10, l11);
        Object object = mb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = nb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = b7.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = b7.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b7.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        b7.mb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b7.f(255830796810775L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = b7.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        b7.mb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b7.f(255830796810775L, 0L);
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

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = b7.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = b7.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = b7.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = b7.e(l10, l11);
            object = mb[n2];
            try {
                if (!(object instanceof String)) break block2;
                b7.mb[n2] = clazz = Class.forName(nb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void G() {
        Color color;
        double d2;
        block20: {
            block21: {
                block18: {
                    block19: {
                        Color color2;
                        block17: {
                            block15: {
                                block16: {
                                    G5 g5 = this.L(0.9);
                                    d2 = g5.B(this.w());
                                    try {
                                        try {
                                            if (!this.O()) break block15;
                                            if (!this.s()) break block16;
                                        }
                                        catch (O_ o_2) {
                                            throw b7.b(o_2);
                                        }
                                        color2 = b7.M.c;
                                        break block17;
                                    }
                                    catch (O_ o_3) {
                                        throw b7.b(o_3);
                                    }
                                }
                                color2 = b7.M.n;
                                break block17;
                            }
                            try {
                                color2 = this.s() ? b7.M.n : b7.M.w;
                            }
                            catch (O_ o_4) {
                                throw b7.b(o_4);
                            }
                        }
                        color = color2;
                        try {
                            F8.S(this.G() + this.D(), this.W() + 1.0, this.w() - this.D() * 2.0, this.b() - 2.0, b7.M.g);
                            if (this.s()) {
                                F8.S(this.G() + this.D() + 0.5, this.W() + 1.5, this.w() - this.D() * 2.0 - 1.0, this.b() - 3.0, b7.M.W);
                            }
                        }
                        catch (O_ o_5) {
                            throw b7.b(o_5);
                        }
                        try {
                            try {
                                if (!this.O()) break block18;
                                if (this.n == null) break block19;
                            }
                            catch (O_ o_6) {
                                throw b7.b(o_6);
                            }
                            F8.x(this.n, this.G() + this.D() + 5.0 + (double)(this.D / 2), this.W() + this.b() / 2.0 - (double)(this.D / 2) + (double)(this.D / 2), this.D, this.D, this.F);
                            break block20;
                        }
                        catch (O_ o_7) {
                            throw b7.b(o_7);
                        }
                    }
                    F8.T((double)((float)(this.G() + this.D() + 5.0)), (double)((float)(this.W() + this.b() / 2.0 - (double)(this.D / 2))), (double)this.D, 0.5, this.F);
                    break block20;
                }
                try {
                    if (this.n == null) break block21;
                    F8.x(this.n, this.G() + this.D() + 5.0 + (double)(this.D / 2), this.W() + this.b() / 2.0 - (double)(this.D / 2) + (double)(this.D / 2), this.D, this.D, b7.M.Z);
                    break block20;
                }
                catch (O_ o_8) {
                    throw b7.b(o_8);
                }
            }
            F8.r((float)(this.G() + this.D() + 5.0), (float)(this.W() + this.b() / 2.0 - (double)(this.D / 2)), this.D, 1.0f, 0.5f, b7.M.Z);
        }
        this.v.S(color);
        this.v.a(this.w() - 30.0);
        this.v.b(this.G() + this.D() + 15.0);
        this.v.M(this.W() + this.b() / 2.0 - d2 / 2.0);
        this.V.b(this.G() + this.w() - this.D() - 5.0 - 8.0);
        this.V.M(this.W());
        this.V.w(this.b());
    }

    public b7(Color color, String string, String string2) {
        this(color, string, -1);
        this.n = string2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b7.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = b7.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = mb;
        mb[0] = "N3(";
        objectArray[1] = Integer.TYPE;
        b7.nb[1] = "java/lang/Integer";
        objectArray[2] = "\u0017LH\u0002]Q\u001cCYM I\u000fDP\u0004";
        objectArray[3] = "\u0005L.\u000b`\u001d\u000eC?D\u0001\u0013\u0005H;\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "1TOH9R0AR&l\u0011T\u001c\b[a\u00050OS\u0017yjmAJAi\u00011W_C\u0007";
    }

    public b7(Color color, String string, int n2) {
        long l10 = bb ^ 0x11911433A880L;
        this.D = (int)b7.b("u", (int)28013, (long)(0x415C6E903FE7C41AL ^ l10));
        this.B = true;
        this.V = new hy((String)((Object)b7.d("h", (int)b7.b("u", (int)22486, (long)(0x3CFD89115B4DFEA2L ^ l10)), (long)6316881463939795872L, (long)l10)));
        this.L = 5.0f;
        this.F = color;
        this.Y = string;
        this.b = n2;
        this.v = new bM(this.w(), (String)((Object)b7.d("h", (int)b7.b("u", (int)20536, (long)(0x20BD05D877BBF94DL ^ l10)), (long)6316881463939795872L, (long)l10)), this.w() - 30.0, 0.9, b7.M.n, false);
        this.v.F(false);
        this.o(this.v, this.V);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public b7 d(OD oD2) {
        this.E = oD2;
        return this;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7EDE;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = db[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/b7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b7.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void Z(Sz sz2) {
        boolean bl2;
        try {
            b7 b72 = this;
            bl2 = !this.B;
        }
        catch (O_ o_2) {
            throw b7.b(o_2);
        }
        try {
            b72.B = bl2;
            if (this.E != null) {
                this.E.f();
            }
        }
        catch (O_ o_3) {
            throw b7.b(o_3);
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (nb[n5] != null) {
            return n5;
        }
        Object object = mb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 41;
                break;
            }
            case 1: {
                n4 = 39;
                break;
            }
            case 2: {
                n4 = 42;
                break;
            }
            case 3: {
                n4 = 61;
                break;
            }
            case 4: {
                n4 = 62;
                break;
            }
            case 5: {
                n4 = 3;
                break;
            }
            case 6: {
                n4 = 14;
                break;
            }
            case 7: {
                n4 = 44;
                break;
            }
            case 8: {
                n4 = 63;
                break;
            }
            case 9: {
                n4 = 7;
                break;
            }
            case 10: {
                n4 = 0;
                break;
            }
            case 11: {
                n4 = 33;
                break;
            }
            case 12: {
                n4 = 51;
                break;
            }
            case 13: {
                n4 = 59;
                break;
            }
            case 14: {
                n4 = 46;
                break;
            }
            case 15: {
                n4 = 35;
                break;
            }
            case 16: {
                n4 = 13;
                break;
            }
            case 17: {
                n4 = 30;
                break;
            }
            case 18: {
                n4 = 48;
                break;
            }
            case 19: {
                n4 = 24;
                break;
            }
            case 20: {
                n4 = 9;
                break;
            }
            case 21: {
                n4 = 55;
                break;
            }
            case 22: {
                n4 = 6;
                break;
            }
            case 23: {
                n4 = 49;
                break;
            }
            case 24: {
                n4 = 10;
                break;
            }
            case 25: {
                n4 = 40;
                break;
            }
            case 26: {
                n4 = 17;
                break;
            }
            case 27: {
                n4 = 22;
                break;
            }
            case 28: {
                n4 = 31;
                break;
            }
            case 29: {
                n4 = 18;
                break;
            }
            case 30: {
                n4 = 56;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 27;
                break;
            }
            case 33: {
                n4 = 50;
                break;
            }
            case 34: {
                n4 = 32;
                break;
            }
            case 35: {
                n4 = 2;
                break;
            }
            case 36: {
                n4 = 36;
                break;
            }
            case 37: {
                n4 = 21;
                break;
            }
            case 38: {
                n4 = 53;
                break;
            }
            case 39: {
                n4 = 47;
                break;
            }
            case 40: {
                n4 = 60;
                break;
            }
            case 41: {
                n4 = 26;
                break;
            }
            case 42: {
                n4 = 12;
                break;
            }
            case 43: {
                n4 = 25;
                break;
            }
            case 44: {
                n4 = 1;
                break;
            }
            case 45: {
                n4 = 4;
                break;
            }
            case 46: {
                n4 = 45;
                break;
            }
            case 47: {
                n4 = 28;
                break;
            }
            case 48: {
                n4 = 5;
                break;
            }
            case 49: {
                n4 = 23;
                break;
            }
            case 50: {
                n4 = 58;
                break;
            }
            case 51: {
                n4 = 37;
                break;
            }
            case 52: {
                n4 = 54;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 11;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 34;
                break;
            }
            case 57: {
                n4 = 29;
                break;
            }
            case 58: {
                n4 = 38;
                break;
            }
            case 59: {
                n4 = 20;
                break;
            }
            case 60: {
                n4 = 19;
                break;
            }
            case 61: {
                n4 = 57;
                break;
            }
            case 62: {
                n4 = 52;
                break;
            }
            default: {
                n4 = 43;
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
        b7.nb[n5] = new String(cArray);
        return n5;
    }

    public boolean Y() {
        return this.s();
    }

    public void m(String string) {
        this.n = string;
    }

    public static int q() {
        int n2 = b7.T();
        try {
            if (n2 == 0) {
                return 38;
            }
        }
        catch (O_ o_2) {
            throw b7.b(o_2);
        }
        return 0;
    }

    public void Z(float f10) {
        this.L = f10;
    }

    public b7(Color color, String string) {
        this(color, string, -1);
    }

    private double D() {
        return this.L;
    }

    public boolean O() {
        boolean bl2;
        try {
            bl2 = this.E != null ? this.E.t() : this.B;
        }
        catch (O_ o_2) {
            throw b7.b(o_2);
        }
        return bl2;
    }

    public String w() {
        return this.Y;
    }

    @Override
    public double z() {
        return 17.5;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = b7.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field g(long l10, long l11) {
        int n2 = b7.e(l10, l11);
        Object object = mb[n2];
        if (object instanceof String) {
            String string = nb[n2];
            int n3 = string.indexOf(8);
            Class clazz = b7.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = b7.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b7.c(clazz3, string2, clazz2)) != null) {
                    b7.mb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = b7.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        b7.mb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b7.f(255830796810775L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void m(boolean bl2) {
        this.B = bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

