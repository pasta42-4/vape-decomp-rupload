/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ay;
import a.Bg;
import a.EP;
import a.OY;
import a.O_;
import a.Oq;
import a.Qg;
import a.SE;
import a.a;
import a.d8;
import a.jU;
import a.js;
import a.pZ;
import a.p_;
import a.pc;
import a.pn;
import a.sy;
import a.xi;
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

public class xf
extends xi {
    private double N;
    private final js h;
    private static final Object[] l;
    private static final Map j;
    private Ay V;
    private static final Integer[] e;
    private static final long[] d;
    private double K;
    private boolean L;
    private final jU x;
    private static final long b;
    private Bg Y;
    private static final String[] n;
    private boolean m;

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c8' || c10 == '\u00e4' || c10 == 'B' || c10 == 'p') {
                field = xf.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xf.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xf.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
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

    @OY
    public void v(p_ p_2) {
        try {
            if (this.m) {
                p_2.getThePlayer().h(false);
                this.L = true;
                this.m = false;
            }
        }
        catch (O_ o_2) {
            throw xf.a(o_2);
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xf.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                xf.l[n2] = clazz = Class.forName(n[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l10, long l11) {
        int n2 = xf.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = n[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xf.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xf.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xf.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xf.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xf.b(227909952778493L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xf.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xf.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xf.b(227909952778493L, 0L);
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

    public xf() {
        long l10 = b ^ 0x1ED9EA556F38L;
        super(a.cs((int)xf.a("f", (int)11268, (long)(0x33F261573723CDF1L ^ l10))), (int)xf.a("f", (int)7936, (long)(0x29171C2E94CDFEF2L ^ l10)), Oq.G, a.cs((int)xf.a("f", (int)27680, (long)(0x1787BAE7AABF8DD4L ^ l10))));
        this.h = new js(this, (String)((Object)xf.c("Q", (int)xf.a("f", (int)21598, (long)(0x4EF13FE7D146B5ADL ^ l10)), (long)-8582451870858906639L, (long)l10)), 0.95, 0.6, 1.0, (String)((Object)xf.c("Q", (int)xf.a("f", (int)24622, (long)(0x28344B9DD19901DFL ^ l10)), (long)-8582451870858906639L, (long)l10)), "");
        this.x = new jU((Object)this, (String)((Object)xf.c("Q", (int)xf.a("f", (int)8089, (long)(0x4FD63CE432E37E69L ^ l10)), (long)-8582451870858906639L, (long)l10)), false);
        this.Y = new Bg();
        this.N(this.h, this.x);
    }

    private boolean r(Qg qg2) {
        float f10 = qg2.u();
        if (f10 > 0.0f) {
            boolean bl2;
            float f11 = qg2.q();
            float f12 = -sy.D(f11 * (float)Math.PI / 180.0f);
            float f13 = sy.S(f11 * (float)Math.PI / 180.0f);
            double d2 = qg2.G();
            double d3 = qg2.o();
            double d4 = d2 * (double)f12 + d3 * (double)f13;
            try {
                bl2 = d4 > 0.0;
            }
            catch (O_ o_2) {
                throw xf.a(o_2);
            }
            return bl2;
        }
        return false;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xf.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xf.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "7\"[";
        objectArray[1] = Integer.TYPE;
        xf.n[1] = "java/lang/Integer";
        objectArray[2] = "i+?\u001bg~b$.T\u001afq#'\u001d";
        objectArray[3] = "\b\u001e!rt\u001a\u0003\u00110=\u0015\u0014\b\u001a4g";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0012(;\u0019U-S9|kY*( #\u0006^hEc>\r2hH3<RL?F&>k";
    }

    private static Field c(long l10, long l11) {
        int n2 = xf.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = n[n2];
            int n3 = string.indexOf(8);
            Class clazz = xf.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xf.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xf.a(clazz3, string2, clazz2)) != null) {
                    xf.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xf.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xf.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xf.b(227909952778493L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean j() {
        return true;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @OY
    public void w(pZ pZ2) {
        block22: {
            Qg qg2;
            block23: {
                block21: {
                    qg2 = EP.U();
                    try {
                        if (this.V == null) {
                            this.V = SE.h.U().K(Ay.class);
                        }
                    }
                    catch (O_ o_2) {
                        throw xf.a(o_2);
                    }
                    try {
                        if (this.V.E()) {
                            return;
                        }
                    }
                    catch (O_ o_3) {
                        throw xf.a(o_3);
                    }
                    try {
                        if (pZ2.getThePlayer().u() <= 0.0f) {
                            return;
                        }
                    }
                    catch (O_ o_4) {
                        throw xf.a(o_4);
                    }
                    try {
                        try {
                            if (qg2.j() || this.r(qg2)) break block21;
                        }
                        catch (O_ o_5) {
                            throw xf.a(o_5);
                        }
                        return;
                    }
                    catch (O_ o_6) {
                        throw xf.a(o_6);
                    }
                }
                double d2 = 0.6;
                try {
                    try {
                        if (qg2.G() != this.N * d2 || qg2.o() != this.K * d2) break block22;
                    }
                    catch (O_ o_7) {
                        throw xf.a(o_7);
                    }
                    if (qg2.P()) break block22;
                }
                catch (O_ o_8) {
                    throw xf.a(o_8);
                }
                double d3 = (Double)this.h.J();
                double d4 = qg2.G() / d2;
                double d5 = qg2.o() / d2;
                double d6 = d4 * d3;
                double d7 = d5 * d3;
                try {
                    try {
                        qg2.t(d6);
                        qg2.s(d7);
                        if (!this.x.s().booleanValue()) break block23;
                        if (!this.Y.m(500L)) break block22;
                    }
                    catch (O_ o_9) {
                        throw xf.a(o_9);
                    }
                    this.m = true;
                    this.Y.m();
                    break block22;
                }
                catch (O_ o_10) {
                    throw xf.a(o_10);
                }
            }
            qg2.h(true);
        }
    }

    private boolean H(Qg qg2) {
        boolean bl2;
        block14: {
            block13: {
                try {
                    if (qg2.Y()) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw xf.a(o_2);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (this.V.E() || !(qg2.u() > 0.0f)) break block13;
                                }
                                catch (O_ o_3) {
                                    throw xf.a(o_3);
                                }
                                if (qg2.H()) break block13;
                            }
                            catch (O_ o_4) {
                                throw xf.a(o_4);
                            }
                            if (qg2.K().u() <= 6) break block13;
                        }
                        catch (O_ o_5) {
                            throw xf.a(o_5);
                        }
                        if (qg2.P()) break block13;
                    }
                    catch (O_ o_6) {
                        throw xf.a(o_6);
                    }
                    bl2 = true;
                    break block14;
                }
                catch (O_ o_7) {
                    throw xf.a(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (n[n5] != null) {
            return n5;
        }
        Object object = l[n5];
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
                n4 = 27;
                break;
            }
            case 2: {
                n4 = 35;
                break;
            }
            case 3: {
                n4 = 29;
                break;
            }
            case 4: {
                n4 = 14;
                break;
            }
            case 5: {
                n4 = 51;
                break;
            }
            case 6: {
                n4 = 49;
                break;
            }
            case 7: {
                n4 = 61;
                break;
            }
            case 8: {
                n4 = 24;
                break;
            }
            case 9: {
                n4 = 15;
                break;
            }
            case 10: {
                n4 = 13;
                break;
            }
            case 11: {
                n4 = 8;
                break;
            }
            case 12: {
                n4 = 62;
                break;
            }
            case 13: {
                n4 = 0;
                break;
            }
            case 14: {
                n4 = 9;
                break;
            }
            case 15: {
                n4 = 60;
                break;
            }
            case 16: {
                n4 = 43;
                break;
            }
            case 17: {
                n4 = 44;
                break;
            }
            case 18: {
                n4 = 57;
                break;
            }
            case 19: {
                n4 = 26;
                break;
            }
            case 20: {
                n4 = 1;
                break;
            }
            case 21: {
                n4 = 12;
                break;
            }
            case 22: {
                n4 = 18;
                break;
            }
            case 23: {
                n4 = 33;
                break;
            }
            case 24: {
                n4 = 40;
                break;
            }
            case 25: {
                n4 = 55;
                break;
            }
            case 26: {
                n4 = 48;
                break;
            }
            case 27: {
                n4 = 56;
                break;
            }
            case 28: {
                n4 = 39;
                break;
            }
            case 29: {
                n4 = 22;
                break;
            }
            case 30: {
                n4 = 42;
                break;
            }
            case 31: {
                n4 = 4;
                break;
            }
            case 32: {
                n4 = 31;
                break;
            }
            case 33: {
                n4 = 10;
                break;
            }
            case 34: {
                n4 = 25;
                break;
            }
            case 35: {
                n4 = 3;
                break;
            }
            case 36: {
                n4 = 38;
                break;
            }
            case 37: {
                n4 = 45;
                break;
            }
            case 38: {
                n4 = 36;
                break;
            }
            case 39: {
                n4 = 54;
                break;
            }
            case 40: {
                n4 = 2;
                break;
            }
            case 41: {
                n4 = 23;
                break;
            }
            case 42: {
                n4 = 47;
                break;
            }
            case 43: {
                n4 = 37;
                break;
            }
            case 44: {
                n4 = 30;
                break;
            }
            case 45: {
                n4 = 52;
                break;
            }
            case 46: {
                n4 = 17;
                break;
            }
            case 47: {
                n4 = 58;
                break;
            }
            case 48: {
                n4 = 59;
                break;
            }
            case 49: {
                n4 = 63;
                break;
            }
            case 50: {
                n4 = 21;
                break;
            }
            case 51: {
                n4 = 7;
                break;
            }
            case 52: {
                n4 = 6;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 11;
                break;
            }
            case 55: {
                n4 = 34;
                break;
            }
            case 56: {
                n4 = 5;
                break;
            }
            case 57: {
                n4 = 46;
                break;
            }
            case 58: {
                n4 = 28;
                break;
            }
            case 59: {
                n4 = 53;
                break;
            }
            case 60: {
                n4 = 50;
                break;
            }
            case 61: {
                n4 = 32;
                break;
            }
            case 62: {
                n4 = 16;
                break;
            }
            default: {
                n4 = 41;
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
        xf.n[n5] = new String(cArray);
        return n5;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xf.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6914;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xf", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xf.e[n3] = n4;
        }
        return e[n3];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xf.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xf.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @OY
    public void o(pc pc2) {
        block4: {
            try {
                try {
                    if (!this.L || !pc2.isNewStateSprinting()) break block4;
                }
                catch (O_ o_2) {
                    throw xf.a(o_2);
                }
                pc2.setCanceled(true);
                this.L = false;
            }
            catch (O_ o_3) {
                throw xf.a(o_3);
            }
        }
    }

    @OY
    public void f(pn pn2) {
        Qg qg2 = EP.U();
        try {
            if (this.V == null) {
                this.V = SE.h.U().K(Ay.class);
            }
        }
        catch (O_ o_2) {
            throw xf.a(o_2);
        }
        try {
            if (this.V.E()) {
                return;
            }
        }
        catch (O_ o_3) {
            throw xf.a(o_3);
        }
        this.N = qg2.G();
        this.K = qg2.o();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xf.b = d8.a(3686777503697157240L, 6630277030021252446L, MethodHandles.lookup().lookupClass()).a(276588539604152L);
                xf.l = new Object[5];
                xf.n = new String[5];
                xf.a();
                xf.j = new HashMap<K, V>(13);
                var0 = xf.b ^ 29900494418598L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "`T\u00bb\u00190\u00de\u008f\u00a4v\u00b3\n\u000f\u00a6\u00d3\u008ajY\u00bc\u009d#\u00a2\u00ca|\u000b\u0094\u00ae\u00cbi\u00d26\u00f6b";
                var7_6 = "`T\u00bb\u00190\u00de\u008f\u00a4v\u00b3\n\u000f\u00a6\u00d3\u008ajY\u00bc\u009d#\u00a2\u00ca|\u000b\u0094\u00ae\u00cbi\u00d26\u00f6b".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "!\u00b5\u0094\u00a4\u00e3\f!\u0003\u0088K\u0081\u000b\u0094\u00e9\u00ae!";
                    var7_6 = "!\u00b5\u0094\u00a4\u00e3\f!\u0003\u0088K\u0081\u000b\u0094\u00e9\u00ae!".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        xf.d = var8_3;
        xf.e = new Integer[6];
    }

    @Override
    public String t() {
        return this.h.p();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

