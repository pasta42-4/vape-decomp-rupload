/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bg;
import a.Dg;
import a.Dy;
import a.EL;
import a.EP;
import a.Eb;
import a.F7;
import a.F8;
import a.FG;
import a.FL;
import a.IB;
import a.Je;
import a.NY;
import a.Na;
import a.OY;
import a.O_;
import a.Oq;
import a.QF;
import a.QX;
import a.Qg;
import a.Qt;
import a.SE;
import a.V4;
import a.ZZ;
import a._Y;
import a.a;
import a.cp;
import a.d8;
import a.eM;
import a.j3;
import a.jE;
import a.jU;
import a.jd;
import a.jj;
import a.jk;
import a.jr;
import a.js;
import a.kX;
import a.oQ;
import a.p5;
import a.p_;
import a.rT;
import a.sW;
import a.sy;
import a.tO;
import a.tU;
import a.xi;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xs
extends xi {
    public final jr R;
    private static final Object[] bb;
    public final js A;
    public final jr o;
    private static final Integer[] P;
    public final jr F;
    public final js T;
    private static final String[] fb;
    private final jk e;
    public Bg K;
    public final jU G;
    public final cp Z;
    public final jU v;
    private final jk X;
    public int d;
    public final j3 l;
    public final jr b;
    public final jU B;
    public final jU j;
    private static final long r;
    public List<Qt> N;
    private static final Map V;
    public jd n;
    private static final long[] w;
    public final js z;
    public int L;
    private boolean O;
    public final jU m;
    private final jr x;
    public final jU Y;
    public final js t;
    public final jj h;

    public boolean q() {
        boolean bl2;
        block8: {
            block6: {
                block7: {
                    Qg qg2 = EP.U();
                    try {
                        try {
                            try {
                                if (kX.C() <= 15 || !this.j.s().booleanValue()) break block6;
                            }
                            catch (O_ o_2) {
                                throw xs.a(o_2);
                            }
                            if (qg2.X(0.5f) != 1.0f) break block7;
                        }
                        catch (O_ o_3) {
                            throw xs.a(o_3);
                        }
                        bl2 = true;
                        break block8;
                    }
                    catch (O_ o_4) {
                        throw xs.a(o_4);
                    }
                }
                bl2 = false;
                break block8;
            }
            bl2 = this.h.J();
        }
        boolean bl3 = bl2;
        return bl3;
    }

    @OY(b=F7.HIGH)
    public void w(p_ p_2) {
        block8: {
            try {
                try {
                    block9: {
                        try {
                            try {
                                if (!this.m.s().booleanValue()) break block8;
                                if (p_2.getPlayer().O()) break block9;
                            }
                            catch (O_ o_2) {
                                throw xs.a(o_2);
                            }
                            if (!(p_2.getPlayer().e() <= 0.0f)) break block8;
                        }
                        catch (O_ o_3) {
                            throw xs.a(o_3);
                        }
                    }
                    if (!this.Z()) break block8;
                }
                catch (O_ o_4) {
                    throw xs.a(o_4);
                }
                this.m();
                return;
            }
            catch (O_ o_5) {
                throw xs.a(o_5);
            }
        }
    }

    public float i(double d2, double d3, float f10) {
        double d4;
        block6: {
            double d5;
            double d6;
            block5: {
                block4: {
                    Qg qg2 = EP.U();
                    d6 = d2 - qg2.F();
                    d5 = d3 - qg2.B();
                    try {
                        if (!(d5 < 0.0) || !(d6 < 0.0)) break block4;
                    }
                    catch (O_ o_2) {
                        throw xs.a(o_2);
                    }
                    d4 = 90.0 + Math.toDegrees(Math.atan(d5 / d6));
                    break block6;
                }
                try {
                    if (!(d5 < 0.0) || !(d6 > 0.0)) break block5;
                }
                catch (O_ o_3) {
                    throw xs.a(o_3);
                }
                d4 = -90.0 + Math.toDegrees(Math.atan(d5 / d6));
                break block6;
            }
            d4 = Math.toDegrees(-Math.atan(d6 / d5));
        }
        return sy.v(-(f10 - (float)d4));
    }

    private static Field c(long l10, long l11) {
        int n2 = xs.a(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            String string = fb[n2];
            int n3 = string.indexOf(8);
            Class clazz = xs.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xs.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xs.a(clazz3, string2, clazz2)) != null) {
                    xs.bb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xs.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xs.bb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xs.b(224916889671190L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e0' || c10 == '\u00c3' || c10 == '\u00da' || c10 == '\u00c6') {
                field = xs.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xs.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Qt C() {
        block4: {
            try {
                try {
                    if (!this.N.isEmpty() && this.N.size() - 1 >= this.L) break block4;
                }
                catch (O_ o_2) {
                    throw xs.a(o_2);
                }
                return null;
            }
            catch (O_ o_3) {
                throw xs.a(o_3);
            }
        }
        return this.N.get(this.L);
    }

    private static void a() {
        Object[] objectArray = bb;
        bb[0] = "9z\u0013";
        objectArray[1] = Integer.TYPE;
        xs.fb[1] = "java/lang/Integer";
        objectArray[2] = "\bB\u0003?dG\u0003M\u0012p\u0019_\u0010J\u001b9";
        objectArray[3] = "\u0016\u00023J9m\u001d\r\"\u0005Xc\u0016\u0006&_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "8\u0019\u0011Nj%<\u0001D2k$Q^\u0011\n?>5\tOBi_h\u0006TMxcn\u001f\u0013V\u0000";
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

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (fb[n5] != null) {
            return n5;
        }
        Object object = bb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 40;
                break;
            }
            case 1: {
                n4 = 54;
                break;
            }
            case 2: {
                n4 = 25;
                break;
            }
            case 3: {
                n4 = 42;
                break;
            }
            case 4: {
                n4 = 44;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 35;
                break;
            }
            case 7: {
                n4 = 9;
                break;
            }
            case 8: {
                n4 = 48;
                break;
            }
            case 9: {
                n4 = 50;
                break;
            }
            case 10: {
                n4 = 14;
                break;
            }
            case 11: {
                n4 = 30;
                break;
            }
            case 12: {
                n4 = 17;
                break;
            }
            case 13: {
                n4 = 10;
                break;
            }
            case 14: {
                n4 = 15;
                break;
            }
            case 15: {
                n4 = 16;
                break;
            }
            case 16: {
                n4 = 59;
                break;
            }
            case 17: {
                n4 = 45;
                break;
            }
            case 18: {
                n4 = 34;
                break;
            }
            case 19: {
                n4 = 47;
                break;
            }
            case 20: {
                n4 = 28;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 11;
                break;
            }
            case 23: {
                n4 = 26;
                break;
            }
            case 24: {
                n4 = 32;
                break;
            }
            case 25: {
                n4 = 20;
                break;
            }
            case 26: {
                n4 = 62;
                break;
            }
            case 27: {
                n4 = 57;
                break;
            }
            case 28: {
                n4 = 53;
                break;
            }
            case 29: {
                n4 = 22;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 8;
                break;
            }
            case 32: {
                n4 = 6;
                break;
            }
            case 33: {
                n4 = 56;
                break;
            }
            case 34: {
                n4 = 27;
                break;
            }
            case 35: {
                n4 = 58;
                break;
            }
            case 36: {
                n4 = 12;
                break;
            }
            case 37: {
                n4 = 4;
                break;
            }
            case 38: {
                n4 = 36;
                break;
            }
            case 39: {
                n4 = 39;
                break;
            }
            case 40: {
                n4 = 18;
                break;
            }
            case 41: {
                n4 = 5;
                break;
            }
            case 42: {
                n4 = 41;
                break;
            }
            case 43: {
                n4 = 49;
                break;
            }
            case 44: {
                n4 = 23;
                break;
            }
            case 45: {
                n4 = 31;
                break;
            }
            case 46: {
                n4 = 61;
                break;
            }
            case 47: {
                n4 = 46;
                break;
            }
            case 48: {
                n4 = 33;
                break;
            }
            case 49: {
                n4 = 24;
                break;
            }
            case 50: {
                n4 = 63;
                break;
            }
            case 51: {
                n4 = 21;
                break;
            }
            case 52: {
                n4 = 60;
                break;
            }
            case 53: {
                n4 = 19;
                break;
            }
            case 54: {
                n4 = 2;
                break;
            }
            case 55: {
                n4 = 3;
                break;
            }
            case 56: {
                n4 = 37;
                break;
            }
            case 57: {
                n4 = 51;
                break;
            }
            case 58: {
                n4 = 43;
                break;
            }
            case 59: {
                n4 = 52;
                break;
            }
            case 60: {
                n4 = 13;
                break;
            }
            case 61: {
                n4 = 1;
                break;
            }
            case 62: {
                n4 = 0;
                break;
            }
            default: {
                n4 = 29;
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
        xs.fb[n5] = new String(cArray);
        return n5;
    }

    private boolean B(Qt qt2) {
        if (this.Y.s().booleanValue()) {
            boolean bl2;
            block12: {
                block11: {
                    V4 v42 = EP.U().K();
                    try {
                        if (v42.Y()) {
                            return false;
                        }
                    }
                    catch (O_ o_2) {
                        throw xs.a(o_2);
                    }
                    QX qX2 = v42.C();
                    try {
                        if (qX2.Y()) {
                            return false;
                        }
                    }
                    catch (O_ o_3) {
                        throw xs.a(o_3);
                    }
                    try {
                        try {
                            if (!this.Z.b(v42, false) || !this.l.u(qt2)) break block11;
                        }
                        catch (O_ o_4) {
                            throw xs.a(o_4);
                        }
                        bl2 = true;
                        break block12;
                    }
                    catch (O_ o_5) {
                        throw xs.a(o_5);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return this.l.u(qt2);
    }

    @OY(b=F7.LOW)
    public void O(p5 p52) {
        block6: {
            try {
                FG.V();
                if (!this.G.s().booleanValue() || this.N.isEmpty()) break block6;
            }
            catch (O_ o_2) {
                throw xs.a(o_2);
            }
            Qg qg2 = p52.getThePlayer();
            for (Qt qt2 : this.N) {
                try {
                    if ((double)qg2.y(qt2) <= (Double)this.t.J()) {
                        NY.G(qt2, 0.0, null, this.X.L(), p52.getTicks());
                        continue;
                    }
                }
                catch (O_ o_3) {
                    throw xs.a(o_3);
                }
                NY.G(qt2, 0.0, null, this.e.L(), p52.getTicks());
            }
        }
        FG.E();
    }

    private float[] S(double d2, double d3, double d4) {
        Qg qg2 = EP.U();
        double d5 = d2 - qg2.F();
        double d6 = d3 - qg2.B();
        double d7 = d4 - ((oQ)qg2.L()).c() - 1.2;
        double d9 = sy.C(d5 * d5 + d6 * d6);
        float f10 = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
        float f11 = (float)(-(Math.atan2(d7, d9) * 180.0 / Math.PI));
        return new float[]{f10, f11};
    }

    public float[] Q(Qt qt2) {
        double d2 = qt2.F();
        double d3 = qt2.B();
        double d4 = ((oQ)qt2.L()).c() + (double)(qt2.E() / 2.0f);
        return this.S(d2, d3, d4);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3CD3;
        if (P[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = w[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xs", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xs.P[n3] = n4;
        }
        return P[n3];
    }

    @OY(b=F7.LOW)
    public void g(p_ p_2) {
        block82: {
            tU tU2;
            boolean bl2;
            boolean bl3;
            Qg qg2;
            boolean bl4;
            block78: {
                block77: {
                    block71: {
                        EL eL2;
                        long l10;
                        block73: {
                            boolean bl5;
                            block70: {
                                l10 = r ^ 0x19B3908D55F9L;
                                try {
                                    if ((Double)this.T.J() < (Double)this.t.J()) {
                                        this.T.r((Double)this.t.J() + 0.1);
                                    }
                                }
                                catch (O_ o_2) {
                                    throw xs.a(o_2);
                                }
                                try {
                                    if (this.d > 0) {
                                        --this.d;
                                        return;
                                    }
                                }
                                catch (O_ o_3) {
                                    throw xs.a(o_3);
                                }
                                try {
                                    try {
                                        if (!this.v.s().booleanValue() || !EP.X().r()) break block70;
                                    }
                                    catch (O_ o_4) {
                                        throw xs.a(o_4);
                                    }
                                    this.d = 1;
                                    return;
                                }
                                catch (O_ o_5) {
                                    throw xs.a(o_5);
                                }
                            }
                            try {
                                bl5 = kX.C() < 23;
                            }
                            catch (O_ o_6) {
                                throw xs.a(o_6);
                            }
                            bl4 = bl5;
                            qg2 = p_2.getThePlayer();
                            try {
                                block72: {
                                    try {
                                        try {
                                            if (!this.m.s().booleanValue()) break block71;
                                            if (qg2.O()) break block72;
                                        }
                                        catch (O_ o_7) {
                                            throw xs.a(o_7);
                                        }
                                        if (!(qg2.e() <= 0.0f)) break block73;
                                    }
                                    catch (O_ o_8) {
                                        throw xs.a(o_8);
                                    }
                                }
                                this.m();
                                return;
                            }
                            catch (O_ o_9) {
                                throw xs.a(o_9);
                            }
                        }
                        if (kX.C() >= 35) {
                            block74: {
                                eL2 = EP.X();
                                try {
                                    try {
                                        try {
                                            if (!eL2.r()) break block71;
                                            if (this.O) break block74;
                                        }
                                        catch (O_ o_10) {
                                            throw xs.a(o_10);
                                        }
                                        if (!eL2.B(eM.Yu)) break block74;
                                    }
                                    catch (O_ o_11) {
                                        throw xs.a(o_11);
                                    }
                                    this.O = true;
                                    this.m();
                                    return;
                                }
                                catch (O_ o_12) {
                                    throw xs.a(o_12);
                                }
                            }
                            this.O = false;
                        } else {
                            eL2 = EP.k();
                            if (eL2.r()) {
                                String string;
                                block75: {
                                    string = ((Eb)eL2).A();
                                    try {
                                        block76: {
                                            try {
                                                try {
                                                    try {
                                                        if (this.O || string == null) break block75;
                                                    }
                                                    catch (O_ o_13) {
                                                        throw xs.a(o_13);
                                                    }
                                                    if (string.toLowerCase().contains((CharSequence)((Object)xs.c("h", (int)xs.a("p", (int)26124, (long)(0x4360BFECCAB33C89L ^ l10)), (long)-1850557767546869193L, (long)l10)))) break block76;
                                                }
                                                catch (O_ o_14) {
                                                    throw xs.a(o_14);
                                                }
                                                if (!string.toLowerCase().contains((CharSequence)((Object)xs.c("h", (int)xs.a("p", (int)15321, (long)(0x21845F8F1AD76150L ^ l10)), (long)-1850557767546869193L, (long)l10)))) break block75;
                                            }
                                            catch (O_ o_15) {
                                                throw xs.a(o_15);
                                            }
                                        }
                                        this.O = true;
                                        this.m();
                                        return;
                                    }
                                    catch (O_ o_16) {
                                        throw xs.a(o_16);
                                    }
                                }
                                try {
                                    try {
                                        if (string != null && !string.equals("")) break block71;
                                    }
                                    catch (O_ o_17) {
                                        throw xs.a(o_17);
                                    }
                                    this.O = false;
                                }
                                catch (O_ o_18) {
                                    throw xs.a(o_18);
                                }
                            }
                        }
                    }
                    try {
                        try {
                            if (!this.B.s().booleanValue() || rT.e()) break block77;
                        }
                        catch (O_ o_19) {
                            throw xs.a(o_19);
                        }
                        this.N.clear();
                        return;
                    }
                    catch (O_ o_20) {
                        throw xs.a(o_20);
                    }
                }
                try {
                    this.e(qg2, p_2.getWorld());
                    if (!this.q()) {
                        return;
                    }
                }
                catch (O_ o_21) {
                    throw xs.a(o_21);
                }
                boolean bl6 = false;
                for (Qt qt2 : this.N) {
                    double d2;
                    if (!this.S(qg2, qt2) || !((d2 = (double)qg2.y(qt2)) <= (Double)this.T.J())) continue;
                    bl6 = true;
                    break;
                }
                try {
                    if (!bl6) {
                        return;
                    }
                }
                catch (O_ o_22) {
                    throw xs.a(o_22);
                }
                bl3 = false;
                bl2 = rT.H();
                tU2 = EP.N().D();
                try {
                    try {
                        if (!bl2 || !tU2.X()) break block78;
                    }
                    catch (O_ o_23) {
                        throw xs.a(o_23);
                    }
                    tU2.p(false);
                    return;
                }
                catch (O_ o_24) {
                    throw xs.a(o_24);
                }
            }
            for (Qt qt3 : this.N) {
                block81: {
                    block80: {
                        double d3;
                        block79: {
                            if (!this.S(qg2, qt3)) continue;
                            d3 = qg2.y(qt3);
                            try {
                                try {
                                    if (!(d3 <= (Double)this.T.J())) continue;
                                    if (!bl4) break block79;
                                }
                                catch (O_ o_25) {
                                    throw xs.a(o_25);
                                }
                                qg2.g();
                            }
                            catch (O_ o_26) {
                                throw xs.a(o_26);
                            }
                        }
                        try {
                            try {
                                if (!(d3 <= (Double)this.t.J())) break block80;
                                EP.n().R(qg2, qt3);
                                if (bl4) break block81;
                            }
                            catch (O_ o_27) {
                                throw xs.a(o_27);
                            }
                            qg2.g();
                            break block81;
                        }
                        catch (O_ o_28) {
                            throw xs.a(o_28);
                        }
                    }
                    try {
                        if (!bl4) {
                            qg2.g();
                            qg2.n();
                        }
                    }
                    catch (O_ o_29) {
                        throw xs.a(o_29);
                    }
                }
                if (!bl2) continue;
                bl3 = true;
                EP.N();
            }
            try {
                try {
                    if (bl3 || !bl2) break block82;
                }
                catch (O_ o_30) {
                    throw xs.a(o_30);
                }
                tU2.p(true);
            }
            catch (O_ o_31) {
                throw xs.a(o_31);
            }
        }
        this.h.Q();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void y(double d2, double d3, double d4, double d5) {
        double d6 = d4 / 2.0;
        double d7 = d2 + d6;
        double d9 = d3 + d6;
        double d10 = Math.toRadians(d5 -= 90.0);
        double d11 = d7 + (d6 + 0.0) * Math.cos(d10);
        double d12 = d9 + (d6 + 0.0) * Math.sin(d10);
        double d13 = d7 + (d6 - 4.0) * Math.cos(d10);
        double d14 = d9 + (d6 - 4.0) * Math.sin(d10);
        F8.g(d11, d12, d13, d14, 2.0f, Color.RED);
    }

    public boolean L() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || this.N.isEmpty()) break block4;
                    }
                    catch (O_ o_2) {
                        throw xs.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xs.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private void lambda$new$1(AtomicBoolean atomicBoolean, js js2) {
        try {
            if (atomicBoolean.get()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xs.a(o_2);
        }
        try {
            if ((Double)js2.J() > (Double)this.T.J()) {
                atomicBoolean.set(true);
                js2.r((Double)this.T.J() - js2.o());
                atomicBoolean.set(false);
            }
        }
        catch (O_ o_3) {
            throw xs.a(o_3);
        }
    }

    private void lambda$new$0(AtomicBoolean atomicBoolean, js js2) {
        try {
            if (atomicBoolean.get()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xs.a(o_2);
        }
        try {
            if ((Double)js2.J() < (Double)this.t.J()) {
                atomicBoolean.set(true);
                js2.r((Double)this.t.J() + js2.o());
                atomicBoolean.set(false);
            }
        }
        catch (O_ o_3) {
            throw xs.a(o_3);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xs.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xs.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public jU x() {
        return this.v;
    }

    private void N(QF qF2, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        block12: {
            double d9;
            double d10;
            block11: {
                block10: {
                    block9: {
                        double d11 = qF2.b() + (qF2.F() - qF2.b()) - tO.b();
                        double d12 = qF2.q() + (qF2.V() + (double)qF2.L() * 0.75 - qF2.q()) - tO.S();
                        double d13 = qF2.I() + (qF2.B() - qF2.I()) - tO.n();
                        double[] dArray = NY.E(d11, d12, d13);
                        double d14 = dArray[2];
                        float f10 = EP.P().J();
                        float f11 = Dy.v();
                        float f12 = EP.b();
                        d7 = dArray[0] / (double)f10 / (double)f11;
                        d6 = ((double)f12 - dArray[1] / (double)f11) / (double)f10;
                        if (d14 >= 1.0) {
                            d7 = (double)(EP.e() / 2) - d7;
                            d6 = (double)(EP.b() / 2) - d6;
                        }
                        F8.a();
                        d5 = 0.0;
                        d10 = d2 - d7;
                        d9 = d3 - d6;
                        try {
                            if (!(d9 > 0.0) || !(d10 > 0.0)) break block9;
                        }
                        catch (O_ o_2) {
                            throw xs.a(o_2);
                        }
                        d5 = Math.toDegrees(-Math.atan(d10 / d9));
                        break block12;
                    }
                    try {
                        if (!(d9 > 0.0) || !(d10 < 0.0)) break block10;
                    }
                    catch (O_ o_3) {
                        throw xs.a(o_3);
                    }
                    d5 = Math.toDegrees(-Math.atan(d10 / d9));
                    break block12;
                }
                try {
                    if (!(d9 < 0.0) || !(d10 > 0.0)) break block11;
                }
                catch (O_ o_4) {
                    throw xs.a(o_4);
                }
                d5 = -90.0 + Math.toDegrees(Math.atan(d9 / d10));
                break block12;
            }
            try {
                if (!(d9 < 0.0) || !(d10 < 0.0)) break block12;
            }
            catch (O_ o_5) {
                throw xs.a(o_5);
            }
            d5 = 90.0 + Math.toDegrees(Math.atan(d9 / d10));
        }
        F8.A(d7, d6, 2.0, 2.0, Color.RED);
        this.y(d2, d3, d4, d5);
        F8.Y();
    }

    @Override
    public void v() {
        super.v();
        this.N.clear();
    }

    private static Method d(long l10, long l11) {
        int n2 = xs.a(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xs.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xs.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xs.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xs.bb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xs.b(224916889671190L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xs.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xs.bb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xs.b(224916889671190L, 0L);
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

    public boolean S(Qg qg2, Qt qt2) {
        block25: {
            try {
                if (qt2.Y()) {
                    return false;
                }
            }
            catch (O_ o_2) {
                throw xs.a(o_2);
            }
            try {
                if (qt2.equals(qg2)) {
                    return false;
                }
            }
            catch (O_ o_3) {
                throw xs.a(o_3);
            }
            try {
                if (!this.B(qt2)) {
                    return false;
                }
            }
            catch (O_ o_4) {
                throw xs.a(o_4);
            }
            try {
                try {
                    if (!(qt2.e() <= 0.0f) && !qt2.O()) break block25;
                }
                catch (O_ o_5) {
                    throw xs.a(o_5);
                }
                return false;
            }
            catch (O_ o_6) {
                throw xs.a(o_6);
            }
        }
        try {
            if ((double)qg2.y(qt2) >= (Double)this.T.J()) {
                return false;
            }
        }
        catch (O_ o_7) {
            throw xs.a(o_7);
        }
        try {
            if (_Y.g(qg2, qt2) > ((Double)this.z.J()).intValue() / 2) {
                return false;
            }
        }
        catch (O_ o_8) {
            throw xs.a(o_8);
        }
        try {
            if (SE.h.j().h(qt2)) {
                return false;
            }
        }
        catch (O_ o_9) {
            throw xs.a(o_9);
        }
        try {
            if (qt2.equals(qg2.o())) {
                return false;
            }
        }
        catch (O_ o_10) {
            throw xs.a(o_10);
        }
        return true;
    }

    @Override
    public void h() {
        super.h();
        this.N.clear();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xs.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void e(Qg qg2, Dg dg) {
        block26: {
            block29: {
                block28: {
                    block27: {
                        block25: {
                            this.N.clear();
                            ArrayList arrayList = new ArrayList(dg.L());
                            for (Object e10 : arrayList) {
                                QF qF2 = new QF(e10);
                                try {
                                    try {
                                        if (rT.e && qF2.B(eM.PR)) {
                                            continue;
                                        }
                                    }
                                    catch (O_ o_2) {
                                        throw xs.a(o_2);
                                    }
                                }
                                catch (O_ o_3) {
                                    throw xs.a(o_3);
                                }
                                if (!qF2.B(eM.Ut)) continue;
                                Qt qt2 = new Qt(e10);
                                try {
                                    if (!this.S(qg2, qt2)) continue;
                                    this.N.add(qt2);
                                }
                                catch (O_ o_4) {
                                    throw xs.a(o_4);
                                }
                            }
                            try {
                                if (this.n.J() != this.o) break block25;
                                this.N.sort(new ZZ());
                                break block26;
                            }
                            catch (O_ o_5) {
                                throw xs.a(o_5);
                            }
                        }
                        try {
                            if (this.n.J() != this.x) break block27;
                            this.N.sort(new IB());
                            break block26;
                        }
                        catch (O_ o_6) {
                            throw xs.a(o_6);
                        }
                    }
                    try {
                        if (this.n.J() != this.F) break block28;
                        this.N.sort(new Je());
                        break block26;
                    }
                    catch (O_ o_7) {
                        throw xs.a(o_7);
                    }
                }
                try {
                    if (this.n.J() != this.b) break block29;
                    this.N.sort(new sW());
                    break block26;
                }
                catch (O_ o_8) {
                    throw xs.a(o_8);
                }
            }
            try {
                if (this.n.J() == this.R) {
                    this.N.sort(new FL());
                }
            }
            catch (O_ o_9) {
                throw xs.a(o_9);
            }
        }
        ArrayList<Qt> arrayList = new ArrayList<Qt>(this.N);
        this.N.clear();
        int n2 = ((Double)this.A.J()).intValue();
        int n3 = 0;
        try {
            while (true) {
                try {
                    if (n3 >= n2 || n3 >= arrayList.size()) break;
                }
                catch (O_ o_10) {
                    throw xs.a(o_10);
                }
                this.N.add((Qt)arrayList.get(n3));
                ++n3;
            }
        }
        catch (O_ o_11) {
            throw xs.a(o_11);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xs.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xs.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public xs() {
        long l10 = r ^ 0x33DDCF4BCB91L;
        super(a.cs((int)xs.a("p", (int)25880, (long)(0x122CB23446DFA1F4L ^ l10))), (int)xs.a("p", (int)14686, (long)(0x97F84132FB37DB0L ^ l10)), Oq.G, a.cs((int)xs.a("p", (int)28048, (long)(0x36492C08901297BL ^ l10))));
        this.l = j3.L(this);
        this.T = js.t(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)29509, (long)(0x7CDFD1ED1DFD37BEL ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)27011, (long)(0x547A5F62773A2D76L ^ l10)), (long)8663049836813218911L, (long)l10)), "", 0.0, 4.0, 6.0);
        this.t = js.t(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)15, (long)(0x1512423457C4C4E8L ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)6198, (long)(0x16B680FA9F675CC5L ^ l10)), (long)8663049836813218911L, (long)l10)), "", 0.0, 3.5, 6.0);
        this.B = jU.w(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)11208, (long)(0x5585C211E3B06F35L ^ l10)), (long)8663049836813218911L, (long)l10)), false);
        this.m = jU.w(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)27235, (long)(0x52D7EE1C3BF12E9CL ^ l10)), (long)8663049836813218911L, (long)l10)), false);
        this.G = jU.w(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)425, (long)(0x4A8C77027B8CC54AL ^ l10)), (long)8663049836813218911L, (long)l10)), false);
        this.Y = jU.R(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)15866, (long)(0x71B8067F49097900L ^ l10)), (long)8663049836813218911L, (long)l10)), false, (String)((Object)xs.c("h", (int)xs.a("p", (int)1227, (long)(0x4083EBBAE1CDC03BL ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.v = jU.R(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)29509, (long)(0xB1CAD0B91B0B7B9L ^ l10)), (long)8663049836813218911L, (long)l10)), true, (String)((Object)xs.c("h", (int)xs.a("p", (int)22157, (long)(0x4BEDCE1D4CFA926DL ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.j = jU.R(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)5266, (long)(0x4E0043AC9262D064L ^ l10)), (long)8663049836813218911L, (long)l10)), false, (String)((Object)xs.c("h", (int)xs.a("p", (int)2782, (long)(0x4BE789BDF8EFCE29L ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.h = jj.a(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)30205, (long)(0x7E94F1AFEF6EB112L ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)5932, (long)(0x162C3B3D52CA53DDL ^ l10)), (long)8663049836813218911L, (long)l10)), "", 1.0, 6.0, 13.0, 20.0);
        this.z = js.N(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)5486, (long)(0x12E0373D9475D1A5L ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)23002, (long)(0x147E62E91C581D33L ^ l10)), (long)8663049836813218911L, (long)l10)), "", 1.0, 90.0, 360.0, 5.0);
        this.A = js.N(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)20557, (long)(0x36C9B9AA239594BFL ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)720, (long)(0x642AC8F12D48463AL ^ l10)), (long)8663049836813218911L, (long)l10)), "", 1.0, 1.0, 6.0, 1.0);
        this.e = jk.M(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)11677, (long)(0x20387B3C9F86E963L ^ l10)), (long)8663049836813218911L, (long)l10)), new Color(255, 200, 112), 50);
        this.X = jk.C(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)31202, (long)(0x611A4C9CA59BD0AL ^ l10)), (long)8663049836813218911L, (long)l10)), new Color(255, 0, 0, 100));
        this.x = new jr((String)((Object)xs.c("h", (int)xs.a("p", (int)14773, (long)(0x4D0C0ED7A5527D4DL ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.o = new jr((String)((Object)xs.c("h", (int)xs.a("p", (int)9160, (long)(0x7797BB3CA9AFE72DL ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.b = new jr((String)((Object)xs.c("h", (int)xs.a("p", (int)28101, (long)(0x5A088305258D2921L ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.F = new jr((String)((Object)xs.c("h", (int)xs.a("p", (int)30776, (long)(0x262E713E8301BCDEL ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.R = new jr((String)((Object)xs.c("h", (int)xs.a("p", (int)5213, (long)(0x4194E350596250A4L ^ l10)), (long)8663049836813218911L, (long)l10)));
        this.Z = cp.o(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)238, (long)(0x7A6A6946F7534424L ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)11489, (long)(0x2939762B8F7A6803L ^ l10)), (long)8663049836813218911L, (long)l10)), cp.U, Collections.emptyList());
        this.K = new Bg();
        this.N = new CopyOnWriteArrayList<Qt>();
        this.n = jd.I(this, (String)((Object)xs.c("h", (int)xs.a("p", (int)8591, (long)(0x2168DEE09B75657BL ^ l10)), (long)8663049836813218911L, (long)l10)), (String)((Object)xs.c("h", (int)xs.a("p", (int)8873, (long)(0x3D4A2361FCD7E660L ^ l10)), (long)8663049836813218911L, (long)l10)), this.x, this.x, this.o, this.b, this.F, this.R);
        this.O = false;
        this.N(this.l, this.h, this.T, this.t, this.z, this.A, this.n);
        this.e(this.j, Na.MC_1_8_9.q());
        this.G.l(this.e, this.X);
        this.N(new jE[]{this.m, this.B, this.v, this.G, this.e, this.X, this.Y.l(this.Z), this.Z});
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.T.P(arg_0 -> this.lambda$new$0(atomicBoolean, arg_0));
        this.t.P(arg_0 -> this.lambda$new$1(atomicBoolean, arg_0));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xs.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xs.r = d8.a(-2547969935958548460L, 4159659535367968206L, MethodHandles.lookup().lookupClass()).a(132027238620172L);
                xs.bb = new Object[5];
                xs.fb = new String[5];
                xs.a();
                xs.V = new HashMap<K, V>(13);
                var0 = xs.r ^ 6837557540031L;
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
                var8_3 = new long[35];
                var5_4 = 0;
                var6_5 = "\u00f9&\u0091\u009ay\u00beY\u00e7\u00bc\u00a5\u00cf*}\u00dbI\u00d6\u000bb\u00b0\u00d8Y_\u0001D\u008c\u0006\\\u0084\u00a6\u0003\u00e7(\u0000\u0080\u00b8\u0015\u0086X\u00e7-\u00c4K\u0082\u00a9\u000e\u00c3\u00fea\u00e4\u0086\u008a\u00de\u00e1\u00e7:\u00ca\u00bc\u00a0\u00f5\u00b6`\u0094\u00e2\u00e8\u00e3F\u00a0\u0015q\"\u0018\u00f8\u008e\u00b6\"h.$u\u0005\u0080\u00eb\u00d4\u00bd\u0087\ri~\u00f2\u00f9\u00a1U\u00d0\u009ed.j\u0011\u00c6\u0081\u00efw\u00fc75\u00e7ZdP\u008f\u00ee\u00d75\fHO\u00e3{\u0081`C/\u00e9\u00aa\u009fK\u00af^KsA\u00fb\u00c8\u00b5\u00b9\u001d\u00a5\u0082_\u00e7\u00c1\u0081\u0085\u0005\u00ee\u00a8\u0089\u0090e\u00ca\u00caz\u00f9\u001f\u00b1\u0091N\u00c4\u00d71J\u00d9Q\u00e9\u008c\u00aa\u00d0JSo$\u00a6\u008c\u0004X\u00ca!\u00b4#\u00d9f\u008d\u00d69\u00c3\u0082K\u00a3v\u0010\u00ab\u00e0\u00b9\u00fc\u0014\u00c22nTK\u00d5%\u00c4bh@u\u00be\u00ee\u001b\u00af.\u0095\u00f7\u00ed\u00fa\u00f1\u009f\u0099 \u0086(\u00f0*\u00f6m\u00f9\u0094\u00a9Cw\u0019\u00e1\u00b1\u00c5c\u0080m\u00f9\u009dC\u00d4\u00d7\u00c7S\u00e9\u00d2<)\u001b\u0080\u00c2\u0014\u00a3\u00d6`S\u00b5\u00a9\u00ce\u000f\u0012\u0012\u00b9";
                var7_6 = "\u00f9&\u0091\u009ay\u00beY\u00e7\u00bc\u00a5\u00cf*}\u00dbI\u00d6\u000bb\u00b0\u00d8Y_\u0001D\u008c\u0006\\\u0084\u00a6\u0003\u00e7(\u0000\u0080\u00b8\u0015\u0086X\u00e7-\u00c4K\u0082\u00a9\u000e\u00c3\u00fea\u00e4\u0086\u008a\u00de\u00e1\u00e7:\u00ca\u00bc\u00a0\u00f5\u00b6`\u0094\u00e2\u00e8\u00e3F\u00a0\u0015q\"\u0018\u00f8\u008e\u00b6\"h.$u\u0005\u0080\u00eb\u00d4\u00bd\u0087\ri~\u00f2\u00f9\u00a1U\u00d0\u009ed.j\u0011\u00c6\u0081\u00efw\u00fc75\u00e7ZdP\u008f\u00ee\u00d75\fHO\u00e3{\u0081`C/\u00e9\u00aa\u009fK\u00af^KsA\u00fb\u00c8\u00b5\u00b9\u001d\u00a5\u0082_\u00e7\u00c1\u0081\u0085\u0005\u00ee\u00a8\u0089\u0090e\u00ca\u00caz\u00f9\u001f\u00b1\u0091N\u00c4\u00d71J\u00d9Q\u00e9\u008c\u00aa\u00d0JSo$\u00a6\u008c\u0004X\u00ca!\u00b4#\u00d9f\u008d\u00d69\u00c3\u0082K\u00a3v\u0010\u00ab\u00e0\u00b9\u00fc\u0014\u00c22nTK\u00d5%\u00c4bh@u\u00be\u00ee\u001b\u00af.\u0095\u00f7\u00ed\u00fa\u00f1\u009f\u0099 \u0086(\u00f0*\u00f6m\u00f9\u0094\u00a9Cw\u0019\u00e1\u00b1\u00c5c\u0080m\u00f9\u009dC\u00d4\u00d7\u00c7S\u00e9\u00d2<)\u001b\u0080\u00c2\u0014\u00a3\u00d6`S\u00b5\u00a9\u00ce\u000f\u0012\u0012\u00b9".length();
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
                    var6_5 = "`\u00ab'\u00c5\u0093\u0094\u00c0\u00c3f\u0081\u00ab\u00116?IV";
                    var7_6 = "`\u00ab'\u00c5\u0093\u0094\u00c0\u00c3f\u0081\u00ab\u00116?IV".length();
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
        xs.w = var8_3;
        xs.P = new Integer[35];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xs.a(l10, l11);
            object = bb[n2];
            try {
                if (!(object instanceof String)) break block2;
                xs.bb[n2] = clazz = Class.forName(fb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

