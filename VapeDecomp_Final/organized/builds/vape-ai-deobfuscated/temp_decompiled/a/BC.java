/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Bg;
import a.EP;
import a.F8;
import a.FG;
import a.G5;
import a.HC;
import a.Ne;
import a.O_;
import a.Rs;
import a.SE;
import a.Sz;
import a.X4;
import a.X_;
import a.d8;
import a.ea;
import a.ht;
import a.jG;
import a.k2;
import a.kT;
import a.sX;
import a.tl;
import a.wj;
import a.xU;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bc
extends ht {
    private List<xi> D;
    private static final long n;
    private HashSet<xi> L;
    private static final Map db;
    private xU v = SE.h.U().K(xU.class);
    private final Comparator<xi> R;
    private Bg Y;
    private wj b;
    private static final String[] fb;
    private HashMap<xi, Double> E = new HashMap();
    public G5 F;
    public G5 V;
    private static final long[] ab;
    private HashMap<xi, ea> B;
    private static final Object[] eb;
    private static final Integer[] bb;

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bc.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public void G() {
        this.E(false);
    }

    private Color U(xi xi2) {
        jG jG2 = (jG)this.v.O.J();
        try {
            if (jG2.equals(this.v.e)) {
                return M.j();
            }
        }
        catch (O_ o_2) {
            throw bc.a(o_2);
        }
        try {
            if (jG2.equals(this.v.X)) {
                return this.v.N.L();
            }
        }
        catch (O_ o_3) {
            throw bc.a(o_3);
        }
        return new Color(xi2.N());
    }

    @Override
    public void U() {
        this.E(true);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public bc(wj wj2) {
        this.L = new HashSet();
        this.B = new HashMap();
        this.D = new ArrayList<xi>();
        this.Y = new Bg();
        this.R = new HC(this);
        this.b = wj2;
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean X() {
        boolean bl2;
        try {
            bl2 = this.v.o.s() == false;
        }
        catch (O_ o_2) {
            throw bc.a(o_2);
        }
        return bl2;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (fb[n5] != null) {
            return n5;
        }
        Object object = eb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 61;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 19;
                break;
            }
            case 5: {
                n4 = 30;
                break;
            }
            case 6: {
                n4 = 22;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 3;
                break;
            }
            case 9: {
                n4 = 14;
                break;
            }
            case 10: {
                n4 = 26;
                break;
            }
            case 11: {
                n4 = 39;
                break;
            }
            case 12: {
                n4 = 31;
                break;
            }
            case 13: {
                n4 = 20;
                break;
            }
            case 14: {
                n4 = 10;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 45;
                break;
            }
            case 18: {
                n4 = 37;
                break;
            }
            case 19: {
                n4 = 63;
                break;
            }
            case 20: {
                n4 = 21;
                break;
            }
            case 21: {
                n4 = 29;
                break;
            }
            case 22: {
                n4 = 33;
                break;
            }
            case 23: {
                n4 = 12;
                break;
            }
            case 24: {
                n4 = 25;
                break;
            }
            case 25: {
                n4 = 9;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 36;
                break;
            }
            case 28: {
                n4 = 55;
                break;
            }
            case 29: {
                n4 = 0;
                break;
            }
            case 30: {
                n4 = 28;
                break;
            }
            case 31: {
                n4 = 34;
                break;
            }
            case 32: {
                n4 = 58;
                break;
            }
            case 33: {
                n4 = 17;
                break;
            }
            case 34: {
                n4 = 35;
                break;
            }
            case 35: {
                n4 = 11;
                break;
            }
            case 36: {
                n4 = 32;
                break;
            }
            case 37: {
                n4 = 53;
                break;
            }
            case 38: {
                n4 = 41;
                break;
            }
            case 39: {
                n4 = 15;
                break;
            }
            case 40: {
                n4 = 18;
                break;
            }
            case 41: {
                n4 = 42;
                break;
            }
            case 42: {
                n4 = 59;
                break;
            }
            case 43: {
                n4 = 2;
                break;
            }
            case 44: {
                n4 = 51;
                break;
            }
            case 45: {
                n4 = 5;
                break;
            }
            case 46: {
                n4 = 47;
                break;
            }
            case 47: {
                n4 = 54;
                break;
            }
            case 48: {
                n4 = 49;
                break;
            }
            case 49: {
                n4 = 23;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 62;
                break;
            }
            case 52: {
                n4 = 13;
                break;
            }
            case 53: {
                n4 = 6;
                break;
            }
            case 54: {
                n4 = 16;
                break;
            }
            case 55: {
                n4 = 60;
                break;
            }
            case 56: {
                n4 = 8;
                break;
            }
            case 57: {
                n4 = 48;
                break;
            }
            case 58: {
                n4 = 7;
                break;
            }
            case 59: {
                n4 = 57;
                break;
            }
            case 60: {
                n4 = 46;
                break;
            }
            case 61: {
                n4 = 43;
                break;
            }
            case 62: {
                n4 = 44;
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
        bc.fb[n5] = new String(cArray);
        return n5;
    }

    static xU u(bc bc2) {
        return bc2.v;
    }

    @Override
    public void d() {
        block9: {
            try {
                try {
                    if (!Ao.K.P && this.v.P.s().booleanValue()) break block9;
                }
                catch (O_ o_2) {
                    throw bc.a(o_2);
                }
                this.L.clear();
            }
            catch (O_ o_3) {
                throw bc.a(o_3);
            }
        }
        for (xi xi2 : this.B.keySet()) {
            ea ea2 = this.B.get(xi2);
            try {
                try {
                    if (ea.n(ea2) == null || xi2.Z()) continue;
                }
                catch (O_ o_4) {
                    throw bc.a(o_4);
                }
                ea.i(ea2, null);
            }
            catch (O_ o_5) {
                throw bc.a(o_5);
            }
        }
    }

    private static Method h(long l10, long l11) {
        int n2 = bc.e(l10, l11);
        Object object = eb[n2];
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
                clazz3 = bc.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bc.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bc.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bc.eb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bc.f(211650626342753L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bc.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bc.eb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bc.f(211650626342753L, 0L);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bc.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bc.e(l10, l11);
            object = eb[n2];
            try {
                if (!(object instanceof String)) break block2;
                bc.eb[n2] = clazz = Class.forName(fb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = eb;
        eb[0] = "~'X";
        objectArray[1] = Integer.TYPE;
        bc.fb[1] = "java/lang/Integer";
        objectArray[2] = "*\u0011U\n,\u0014!\u001eDEQ\f2\u0019M\f";
        objectArray[3] = "4Z$\tC\\?U5F\"R4^1\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001fJ2\u0006xDN\u0003h=x@vK0TbU\n\u001cp\u0003k;LHq[hU\n\u00027\u0003\u0013";
    }

    @Override
    public double e() {
        return 110.0;
    }

    private void E(boolean bl2) {
        int n2;
        int n3;
        int n4;
        int n5;
        float f10;
        float f11;
        boolean bl3;
        Color color;
        Color color2;
        ArrayList arrayList;
        boolean bl4;
        boolean bl5;
        float f12;
        G5 g5;
        G5 g52;
        float f13;
        sX sX2;
        long l10;
        block161: {
            G5 g53;
            String string;
            block189: {
                Color color3;
                double d2;
                double d3;
                String string2;
                G5 g54;
                block166: {
                    block165: {
                        block162: {
                            Color color4;
                            double d4;
                            double d5;
                            String string3;
                            G5 g55;
                            block164: {
                                block163: {
                                    float f14;
                                    block158: {
                                        double d6;
                                        block160: {
                                            double d7;
                                            block159: {
                                                double d9;
                                                boolean bl6;
                                                double d10;
                                                double d11;
                                                int n6;
                                                l10 = n ^ 0x4BDB7075B369L;
                                                sX2 = FG.b();
                                                f13 = ((Double)this.v.w.J()).floatValue();
                                                g52 = this.y((int)(16.0f * f13));
                                                try {
                                                    n6 = this.v.o.s() != false ? 14 : 16;
                                                }
                                                catch (O_ o_2) {
                                                    throw bc.a(o_2);
                                                }
                                                int n7 = n6;
                                                g5 = this.y((int)((float)n7 * f13));
                                                try {
                                                    d11 = (float)this.W();
                                                    d10 = bl2 ? this.b.Q().b() : -4.0;
                                                }
                                                catch (O_ o_3) {
                                                    throw bc.a(o_3);
                                                }
                                                f12 = (float)(d11 - d10);
                                                try {
                                                    bl6 = this.G() + this.w() / 2.0 >= (double)(EP.e() / 4) / SE.h.a().b();
                                                }
                                                catch (O_ o_4) {
                                                    throw bc.a(o_4);
                                                }
                                                bl5 = bl6;
                                                bl4 = SE.h.a().q.j();
                                                double d12 = 10.0;
                                                CopyOnWriteArrayList<xi> copyOnWriteArrayList = new CopyOnWriteArrayList<xi>();
                                                for (xi object22 : SE.h.U().q()) {
                                                    block155: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!object22.Z() || object22.N() == 0) continue;
                                                                        }
                                                                        catch (O_ o_5) {
                                                                            throw bc.a(o_5);
                                                                        }
                                                                        if (!object22.u()) continue;
                                                                    }
                                                                    catch (O_ o_6) {
                                                                        throw bc.a(o_6);
                                                                    }
                                                                    if (!this.v.t.s().booleanValue()) break block155;
                                                                }
                                                                catch (O_ o_7) {
                                                                    throw bc.a(o_7);
                                                                }
                                                                if (this.v.L.q(object22.O(), false)) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (O_ o_8) {
                                                                throw bc.a(o_8);
                                                            }
                                                        }
                                                        catch (O_ o_9) {
                                                            throw bc.a(o_9);
                                                        }
                                                    }
                                                    copyOnWriteArrayList.add(object22);
                                                }
                                                this.z(copyOnWriteArrayList);
                                                this.D.clear();
                                                this.D.addAll(copyOnWriteArrayList);
                                                for (xi xi2 : this.B.keySet()) {
                                                    ea ea2;
                                                    block156: {
                                                        block157: {
                                                            ea2 = this.B.get(xi2);
                                                            try {
                                                                try {
                                                                    if (!this.L.contains(xi2)) break block156;
                                                                    if (!xi2.Z()) break block157;
                                                                }
                                                                catch (O_ o_10) {
                                                                    throw bc.a(o_10);
                                                                }
                                                                ea2.d(true);
                                                                ea2.H(1.0f);
                                                                ea2.L(true);
                                                                this.L.remove(xi2);
                                                                break block156;
                                                            }
                                                            catch (O_ o_11) {
                                                                throw bc.a(o_11);
                                                            }
                                                        }
                                                        try {
                                                            ea2.d(true);
                                                            ea2.H(1.0f);
                                                            ea2.L(false);
                                                            if (!copyOnWriteArrayList.contains(xi2)) {
                                                                copyOnWriteArrayList.add(xi2);
                                                            }
                                                        }
                                                        catch (O_ o_12) {
                                                            throw bc.a(o_12);
                                                        }
                                                    }
                                                    try {
                                                        if (ea.V(ea2)) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (O_ o_13) {
                                                        throw bc.a(o_13);
                                                    }
                                                    try {
                                                        try {
                                                            if (ea.l(ea2) || !(ea.f(ea2) > 0.0f)) continue;
                                                        }
                                                        catch (O_ o_14) {
                                                            throw bc.a(o_14);
                                                        }
                                                        copyOnWriteArrayList.add(xi2);
                                                    }
                                                    catch (O_ o_15) {
                                                        throw bc.a(o_15);
                                                    }
                                                }
                                                this.h(copyOnWriteArrayList);
                                                arrayList = new ArrayList();
                                                for (xi xi3 : copyOnWriteArrayList) {
                                                    String string4;
                                                    G5 g56;
                                                    double d13;
                                                    arrayList.add(xi3);
                                                    String string5 = xi3.O();
                                                    String string6 = xi3.G(this.v.p());
                                                    try {
                                                        d13 = g52.l(string5, this.X());
                                                        g56 = g5;
                                                        string4 = string6.isEmpty() ? "" : string6 + (String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)26396, (long)(0x48793812838ED346L ^ l10)), (long)7501646511212703955L, (long)l10));
                                                    }
                                                    catch (O_ o_16) {
                                                        throw bc.a(o_16);
                                                    }
                                                    double d14 = d13 + g56.l(string4, this.X());
                                                    d12 = Math.max(d12, d14);
                                                }
                                                if (this.v.h.s().booleanValue()) {
                                                    d12 = Math.max(d12, 60.0);
                                                }
                                                color2 = M.j();
                                                color = new Color(20, 20, 20, 160);
                                                bl3 = this.v.T.s();
                                                try {
                                                    d9 = bl5 ? this.G() + this.w() - d12 : this.G();
                                                }
                                                catch (O_ o_17) {
                                                    throw bc.a(o_17);
                                                }
                                                d7 = d9;
                                                try {
                                                    try {
                                                        Ao.K.n();
                                                        if (!this.v.h.s().booleanValue()) break block158;
                                                        if (!bl5) break block159;
                                                    }
                                                    catch (O_ o_18) {
                                                        throw bc.a(o_18);
                                                    }
                                                    d6 = d7 + d12 - (double)(58.0f * f13);
                                                    break block160;
                                                }
                                                catch (O_ o_19) {
                                                    throw bc.a(o_19);
                                                }
                                            }
                                            d6 = d7;
                                        }
                                        float f15 = (float)d6;
                                        f11 = f15 + 40.0f * f13;
                                        float f16 = 12.0f * f13;
                                        X_.B(M.j(), f15, f12, (String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)5773, (long)(0x50AD4757273CA2D5L ^ l10)), (long)7501646511212703955L, (long)l10)), f16, f16, this.v.n.s());
                                        X_.B(Color.WHITE, f11, f12, (String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)25018, (long)(0x12330D506B6355E8L ^ l10)), (long)7501646511212703955L, (long)l10)), f16, f16, this.v.n.s());
                                        f12 += 15.0f * f13;
                                    }
                                    try {
                                        if (!this.v.Y.s().booleanValue() || ((String)this.v.A.J()).length() <= 0) break block161;
                                    }
                                    catch (O_ o_20) {
                                        throw bc.a(o_20);
                                    }
                                    string = ((String)this.v.A.J()).replace((CharSequence)((Object)bc.c("\u00c8", (int)bc.b("e", (int)27157, (long)(0x3FFB86F86569DE4AL ^ l10)), (long)7501646511212703955L, (long)l10)), "\u00a7");
                                    g53 = SE.h.W().L(kT.PROXIMA, (int)(22.0f * f13), true);
                                    double d15 = g53.l(string, this.X());
                                    try {
                                        f14 = bl5 ? (float)(this.G() + this.w() - 4.0 - d15) : (float)(this.G() + 2.0);
                                    }
                                    catch (O_ o_21) {
                                        throw bc.a(o_21);
                                    }
                                    f10 = f14;
                                    try {
                                        try {
                                            try {
                                                if (!this.v.n.s().booleanValue()) break block162;
                                                g55 = g53;
                                                string3 = string;
                                                d5 = f10;
                                                d4 = f12;
                                                if (!this.v.x.s().booleanValue()) break block163;
                                            }
                                            catch (O_ o_22) {
                                                throw bc.a(o_22);
                                            }
                                            if (SE.h.a().q.j()) break block163;
                                        }
                                        catch (O_ o_23) {
                                            throw bc.a(o_23);
                                        }
                                        color4 = this.v.z.L();
                                        break block164;
                                    }
                                    catch (O_ o_24) {
                                        throw bc.a(o_24);
                                    }
                                }
                                color4 = M.j();
                            }
                            g55.t(string3, d5, d4, color4, this.X());
                            break block189;
                        }
                        try {
                            try {
                                g54 = g53;
                                string2 = string;
                                d3 = f10;
                                d2 = f12;
                                if (!this.v.x.s().booleanValue() || SE.h.a().q.j()) break block165;
                            }
                            catch (O_ o_25) {
                                throw bc.a(o_25);
                            }
                            color3 = this.v.z.L();
                            break block166;
                        }
                        catch (O_ o_26) {
                            throw bc.a(o_26);
                        }
                    }
                    color3 = M.j();
                }
                g54.u(string2, d3, d2, color3, this.X());
            }
            f12 = (float)((double)f12 + (g53.g(string, this.X()) + (double)(4.0f * f13)));
        }
        float[] fArray = new float[3];
        fArray = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), fArray);
        f11 = fArray[0];
        int n7 = -1;
        try {
            n5 = bl5 ? 1 : 2;
        }
        catch (O_ o_27) {
            throw bc.a(o_27);
        }
        int n8 = n5;
        try {
            n4 = bl5 ? 8 : 4;
        }
        catch (O_ o_28) {
            throw bc.a(o_28);
        }
        int n9 = n4;
        try {
            n3 = bl5 ? 2 : 1;
        }
        catch (O_ o_29) {
            throw bc.a(o_29);
        }
        int n10 = n3;
        try {
            n2 = bl5 ? 4 : 8;
        }
        catch (O_ o_30) {
            throw bc.a(o_30);
        }
        int n11 = n2;
        tl.N();
        tl.s();
        tl.P();
        for (int i10 = 0; i10 < arrayList.size(); ++i10) {
            int n12;
            block188: {
                double d16;
                double d17;
                String string;
                String string7;
                block187: {
                    double d18;
                    block192: {
                        k2 k22;
                        block184: {
                            int n13;
                            int n14;
                            k2 k23;
                            k2 k24;
                            block186: {
                                block185: {
                                    block181: {
                                        k2 k25;
                                        block183: {
                                            block182: {
                                                float f17;
                                                double d19;
                                                double d20;
                                                boolean bl7;
                                                int n15;
                                                boolean bl8;
                                                block180: {
                                                    ea ea3;
                                                    double d21;
                                                    block190: {
                                                        double d22;
                                                        xi xi4;
                                                        block191: {
                                                            int n16;
                                                            Color color5;
                                                            float f18;
                                                            float f19;
                                                            float f20;
                                                            boolean bl9;
                                                            Color color6;
                                                            double d23;
                                                            double d24;
                                                            double d25;
                                                            double d26;
                                                            block179: {
                                                                boolean bl10;
                                                                block178: {
                                                                    double d27;
                                                                    double d28;
                                                                    double d29;
                                                                    double d30;
                                                                    double d31;
                                                                    float f21;
                                                                    Color color7;
                                                                    boolean bl11;
                                                                    float f22;
                                                                    double d32;
                                                                    block173: {
                                                                        int n17;
                                                                        Color color8;
                                                                        float f23;
                                                                        float f24;
                                                                        float f25;
                                                                        boolean bl12;
                                                                        Color color9;
                                                                        double d33;
                                                                        double d34;
                                                                        double d35;
                                                                        double d36;
                                                                        block177: {
                                                                            block176: {
                                                                                double d37;
                                                                                double d38;
                                                                                block175: {
                                                                                    block174: {
                                                                                        boolean bl13;
                                                                                        double d39;
                                                                                        double d40;
                                                                                        block172: {
                                                                                            Color color10;
                                                                                            int n18;
                                                                                            block171: {
                                                                                                block170: {
                                                                                                    Color color11;
                                                                                                    boolean bl14;
                                                                                                    double d41;
                                                                                                    double d42;
                                                                                                    xi xi5;
                                                                                                    block169: {
                                                                                                        block167: {
                                                                                                            double d43;
                                                                                                            double d44;
                                                                                                            float f26;
                                                                                                            String string8;
                                                                                                            G5 g57;
                                                                                                            xi4 = (xi)arrayList.get(i10);
                                                                                                            bl8 = this.L.contains(xi4);
                                                                                                            string7 = xi4.O();
                                                                                                            string = xi4.G(this.v.p());
                                                                                                            if (bl8) {
                                                                                                                string = "\u00a77| Disabled";
                                                                                                            }
                                                                                                            k22 = new k2(this.U(xi4));
                                                                                                            if (bl4) {
                                                                                                                int n19;
                                                                                                                float f27;
                                                                                                                float f28;
                                                                                                                float f29;
                                                                                                                k2 k26;
                                                                                                                k2 k27;
                                                                                                                if ((f11 -= 0.025f) <= 0.0f) {
                                                                                                                    f11 = 1.0f;
                                                                                                                }
                                                                                                                try {
                                                                                                                    k2 k28;
                                                                                                                    fArray[0] = f11;
                                                                                                                    k27 = k28;
                                                                                                                    k26 = k28;
                                                                                                                    f29 = f11;
                                                                                                                    f28 = fArray[1];
                                                                                                                    f27 = fArray[2];
                                                                                                                    n19 = bl3 ? 8 : 4;
                                                                                                                }
                                                                                                                catch (O_ o_31) {
                                                                                                                    throw bc.a(o_31);
                                                                                                                }
                                                                                                                k27(Rs.f(f29, f28, f27, n19));
                                                                                                                k22 = k26;
                                                                                                            }
                                                                                                            d21 = g52.l(string7, this.X());
                                                                                                            try {
                                                                                                                g57 = g5;
                                                                                                                string8 = string.isEmpty() ? "" : string;
                                                                                                            }
                                                                                                            catch (O_ o_32) {
                                                                                                                throw bc.a(o_32);
                                                                                                            }
                                                                                                            double d45 = g57.l(string8, this.X());
                                                                                                            double d46 = g52.l((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)5333, (long)(0x519E33AD7BB7A086L ^ l10)), (long)7501646511212703955L, (long)l10)), this.X());
                                                                                                            d21 += d45;
                                                                                                            if (!string.isEmpty()) {
                                                                                                                d21 += d46;
                                                                                                                if (this.X()) {
                                                                                                                    d21 -= (double)(1.0f * f13);
                                                                                                                }
                                                                                                                if (bl5) {
                                                                                                                    d21 += 1.0;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                f26 = bl5 ? (float)(this.G() + this.w() - 4.0 - d21) : (float)(this.G() + 2.0);
                                                                                                            }
                                                                                                            catch (O_ o_33) {
                                                                                                                throw bc.a(o_33);
                                                                                                            }
                                                                                                            f10 = f26;
                                                                                                            double d47 = g52.g((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)22795, (long)(0x41ECA1348DFA6D57L ^ l10)), (long)7501646511212703955L, (long)l10)), this.X());
                                                                                                            try {
                                                                                                                d44 = f10;
                                                                                                                d43 = bl5 ? d21 + 3.5 : -1.5;
                                                                                                            }
                                                                                                            catch (O_ o_34) {
                                                                                                                throw bc.a(o_34);
                                                                                                            }
                                                                                                            d32 = d44 + d43;
                                                                                                            if (i10 == 0) {
                                                                                                                f12 += 1.0f * f13;
                                                                                                            }
                                                                                                            n15 = (int)(f12 - 1.0f * f13);
                                                                                                            n12 = (int)(d47 + 2.0);
                                                                                                            d22 = d21 + (double)(7.0f * f13);
                                                                                                            if (bl5) {
                                                                                                                d32 -= d21 + 5.0;
                                                                                                            }
                                                                                                            if (n7 != -1) {
                                                                                                                n15 = n7;
                                                                                                            }
                                                                                                            bl7 = false;
                                                                                                            try {
                                                                                                                if (!this.v.P.s().booleanValue() || !this.B.containsKey(xi4)) break block167;
                                                                                                            }
                                                                                                            catch (O_ o_35) {
                                                                                                                throw bc.a(o_35);
                                                                                                            }
                                                                                                            ea ea4 = this.B.get(xi4);
                                                                                                            ea4.i(d32, n15, d22, n12);
                                                                                                            if (ea.n(ea4).T(sX2)) {
                                                                                                                bl7 = true;
                                                                                                            }
                                                                                                        }
                                                                                                        if (bl7) {
                                                                                                            block168: {
                                                                                                                int n20 = Rs.H(k22);
                                                                                                                try {
                                                                                                                    if (n20 <= 200) break block168;
                                                                                                                    k22.l(new Color(100, 100, 100, 100), 0.1f);
                                                                                                                    break block169;
                                                                                                                }
                                                                                                                catch (O_ o_36) {
                                                                                                                    throw bc.a(o_36);
                                                                                                                }
                                                                                                            }
                                                                                                            k22.l(new Color(255, 255, 255, 255), 0.2f);
                                                                                                        }
                                                                                                    }
                                                                                                    n12 = (int)((float)n12 + 1.0f * f13);
                                                                                                    f22 = 2.0f * f13;
                                                                                                    if (!this.v.o.s().booleanValue()) {
                                                                                                        f22 = 0.0f;
                                                                                                    }
                                                                                                    n18 = 0;
                                                                                                    if (i10 > 0) {
                                                                                                        xi5 = (xi)arrayList.get(i10 - 1);
                                                                                                        if (this.E.containsKey(xi5) && (d42 = this.E.get(xi5).doubleValue()) < d22) {
                                                                                                            n18 |= n8;
                                                                                                        }
                                                                                                    } else {
                                                                                                        n18 |= n8;
                                                                                                    }
                                                                                                    if (i10 < arrayList.size() - 1) {
                                                                                                        xi5 = (xi)arrayList.get(i10 + 1);
                                                                                                        if (this.E.containsKey(xi5)) {
                                                                                                            d42 = this.E.get(xi5);
                                                                                                            d41 = d22 - d42;
                                                                                                            if (Math.abs(d41) < (double)f22) {
                                                                                                                d22 = d42;
                                                                                                                if (bl5) {
                                                                                                                    d32 += d41;
                                                                                                                }
                                                                                                            }
                                                                                                            if (d42 < d22) {
                                                                                                                n18 |= n9;
                                                                                                                if (d41 < (double)f22) {
                                                                                                                    d22 += (double)f22 - d41;
                                                                                                                    if (bl5) {
                                                                                                                        d32 -= (double)f22 - d41;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        n18 |= n9;
                                                                                                    }
                                                                                                    if (i10 > 0 && this.E.containsKey(xi5 = (xi)arrayList.get(i10 - 1)) && (d41 = d22 - (d42 = this.E.get(xi5).doubleValue())) == 0.0) {
                                                                                                        n18 &= ~n8;
                                                                                                    }
                                                                                                    try {
                                                                                                        bl14 = i10 == 0;
                                                                                                    }
                                                                                                    catch (O_ o_37) {
                                                                                                        throw bc.a(o_37);
                                                                                                    }
                                                                                                    bl11 = bl14;
                                                                                                    try {
                                                                                                        boolean bl15 = bl10 = i10 == arrayList.size() - 1;
                                                                                                    }
                                                                                                    catch (O_ o_38) {
                                                                                                        throw bc.a(o_38);
                                                                                                    }
                                                                                                    if (bl11) {
                                                                                                        n18 |= n10;
                                                                                                    }
                                                                                                    if (bl10) {
                                                                                                        n18 |= n11;
                                                                                                    }
                                                                                                    color10 = color;
                                                                                                    try {
                                                                                                        color11 = bl8 ? new Color(20, 20, 20, 100) : k22;
                                                                                                    }
                                                                                                    catch (O_ o_39) {
                                                                                                        throw bc.a(o_39);
                                                                                                    }
                                                                                                    color7 = color11;
                                                                                                    f21 = 1.5f * f13;
                                                                                                    d40 = d32;
                                                                                                    d39 = d22 - (double)f21;
                                                                                                    try {
                                                                                                        if (!bl5) break block170;
                                                                                                        if ((n18 & n9) == 0) break block171;
                                                                                                    }
                                                                                                    catch (O_ o_40) {
                                                                                                        throw bc.a(o_40);
                                                                                                    }
                                                                                                    d39 -= (double)f22;
                                                                                                    d40 += (double)f22;
                                                                                                    break block171;
                                                                                                }
                                                                                                d40 += (double)f21;
                                                                                                if ((n18 & n9) != 0) {
                                                                                                    d39 -= (double)f22;
                                                                                                }
                                                                                            }
                                                                                            double d48 = d32;
                                                                                            double d49 = n15 - 1;
                                                                                            double d50 = d22;
                                                                                            d31 = n12 + 2;
                                                                                            ea3 = null;
                                                                                            if (this.B.containsKey(xi4)) {
                                                                                                ea3 = this.B.get(xi4);
                                                                                                if (bl5) {
                                                                                                    d32 += d22 - d22 * (double)ea.f(ea3);
                                                                                                } else {
                                                                                                    d22 *= (double)ea.f(ea3);
                                                                                                }
                                                                                            }
                                                                                            FG.e(d48, d49, d50, d31);
                                                                                            if (!bl3) break block190;
                                                                                            F8.g(d32, n15, d22, n12, color10, false, f22, 1.0f, 0.0f, null, n18);
                                                                                            bl13 = true;
                                                                                            try {
                                                                                                if (ea3 == null || ea.V(ea3)) break block172;
                                                                                            }
                                                                                            catch (O_ o_41) {
                                                                                                throw bc.a(o_41);
                                                                                            }
                                                                                            bl13 = false;
                                                                                        }
                                                                                        if (bl13) {
                                                                                            float f30 = 1.0f * f13;
                                                                                            F8.r(d40, (float)(n15 + n12) - f30 / 2.0f, d39, f30, new Color(30, 30, 30, 40));
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (!F8.U() || !this.X()) break block173;
                                                                                                }
                                                                                                catch (O_ o_42) {
                                                                                                    throw bc.a(o_42);
                                                                                                }
                                                                                                d38 = d32;
                                                                                                if (!bl5) break block174;
                                                                                            }
                                                                                            catch (O_ o_43) {
                                                                                                throw bc.a(o_43);
                                                                                            }
                                                                                            d37 = d22 - 1.5 * (double)f13;
                                                                                            break block175;
                                                                                        }
                                                                                        catch (O_ o_44) {
                                                                                            throw bc.a(o_44);
                                                                                        }
                                                                                    }
                                                                                    d37 = 0.0;
                                                                                }
                                                                                try {
                                                                                    d36 = d38 + d37;
                                                                                    d35 = n15;
                                                                                    d34 = f21;
                                                                                    d33 = n12;
                                                                                    color9 = color7;
                                                                                    bl12 = false;
                                                                                    f25 = f22;
                                                                                    f24 = 1.0f;
                                                                                    f23 = 0.0f;
                                                                                    color8 = null;
                                                                                    if (!bl11) break block176;
                                                                                    n17 = n10;
                                                                                    break block177;
                                                                                }
                                                                                catch (O_ o_45) {
                                                                                    throw bc.a(o_45);
                                                                                }
                                                                            }
                                                                            try {
                                                                                n17 = bl10 ? n11 : 0;
                                                                            }
                                                                            catch (O_ o_46) {
                                                                                throw bc.a(o_46);
                                                                            }
                                                                        }
                                                                        F8.g(d36, d35, d34, d33, color9, bl12, f25, f24, f23, color8, n17);
                                                                        break block191;
                                                                    }
                                                                    try {
                                                                        d30 = d32;
                                                                        d29 = bl5 ? d22 - 1.5 * (double)f13 : 0.0;
                                                                    }
                                                                    catch (O_ o_47) {
                                                                        throw bc.a(o_47);
                                                                    }
                                                                    try {
                                                                        FG.e(d30 + d29, n15, f21, d31);
                                                                        d28 = d32;
                                                                        d27 = bl5 ? d22 - 5.0 : 0.0;
                                                                    }
                                                                    catch (O_ o_48) {
                                                                        throw bc.a(o_48);
                                                                    }
                                                                    try {
                                                                        d26 = d28 + d27;
                                                                        d25 = n15;
                                                                        d24 = 5.0;
                                                                        d23 = n12;
                                                                        color6 = color7;
                                                                        bl9 = false;
                                                                        f20 = f22;
                                                                        f19 = 1.0f;
                                                                        f18 = 0.0f;
                                                                        color5 = null;
                                                                        if (!bl11) break block178;
                                                                        n16 = n10;
                                                                        break block179;
                                                                    }
                                                                    catch (O_ o_49) {
                                                                        throw bc.a(o_49);
                                                                    }
                                                                }
                                                                try {
                                                                    n16 = bl10 ? n11 : 0;
                                                                }
                                                                catch (O_ o_50) {
                                                                    throw bc.a(o_50);
                                                                }
                                                            }
                                                            F8.g(d26, d25, d24, d23, color6, bl9, f20, f19, f18, color5, n16);
                                                            FG.F();
                                                        }
                                                        n7 = n15 + n12;
                                                        f10 += 2.0f * f13;
                                                        this.E.put(xi4, d22);
                                                    }
                                                    try {
                                                        if (ea3 == null || ea3.K()) break block180;
                                                    }
                                                    catch (O_ o_51) {
                                                        throw bc.a(o_51);
                                                    }
                                                    double d51 = -(d21 - d21 * (double)ea.f(ea3));
                                                    if (bl5) {
                                                        d51 = -d51;
                                                    }
                                                    f10 = (float)((double)f10 + d51);
                                                    k22.I((int)(255.0f * ea.f(ea3)));
                                                    k22 = new k2(k22.getRed(), k22.getGreen(), k22.getBlue(), k22.getAlpha());
                                                }
                                                try {
                                                    d20 = n15 + n12 / 2;
                                                    d19 = g52.g((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)12640, (long)(0x5CB30A70DA4B853BL ^ l10)), (long)7501646511212703955L, (long)l10)), this.X());
                                                    f17 = this.X() ? 0.0f : 2.0f * f13;
                                                }
                                                catch (O_ o_52) {
                                                    throw bc.a(o_52);
                                                }
                                                d17 = d20 - (d19 + (double)f17) / 2.0;
                                                try {
                                                    try {
                                                        if (!bl8) break block181;
                                                        if (!bl7) break block182;
                                                    }
                                                    catch (O_ o_53) {
                                                        throw bc.a(o_53);
                                                    }
                                                    k25 = new k2(200, 200, 200, 255);
                                                    break block183;
                                                }
                                                catch (O_ o_54) {
                                                    throw bc.a(o_54);
                                                }
                                            }
                                            k25 = new k2(175, 175, 175, 255);
                                        }
                                        k22 = k25;
                                    }
                                    try {
                                        try {
                                            k2 k29;
                                            tl.a(1.0f, 1.0f, 1.0f, 1.0f);
                                            if (!this.v.n.s().booleanValue()) break block184;
                                            k24 = k29;
                                            k23 = k29;
                                            n14 = 0;
                                            if (!bl3) break block185;
                                        }
                                        catch (O_ o_55) {
                                            throw bc.a(o_55);
                                        }
                                        n13 = 80;
                                        break block186;
                                    }
                                    catch (O_ o_56) {
                                        throw bc.a(o_56);
                                    }
                                }
                                n13 = 170;
                            }
                            k24(n14, n13);
                            k2 k210 = k23;
                            if (k22.equals(Color.BLACK)) {
                                k22 = new k2(1, 1, 1, 255);
                            }
                            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                            g52.D(string7, f10, d17, k22, k210, this.X());
                            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                            break block192;
                        }
                        g52.u(string7, f10, d17, k22, this.X());
                    }
                    double d52 = g52.g((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)31463, (long)(0x5AF9B5F15B8DCEB1L ^ l10)), (long)7501646511212703955L, (long)l10)), this.X());
                    double d53 = g5.g((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)13308, (long)(0x5058062559FA87A5L ^ l10)), (long)7501646511212703955L, (long)l10)), this.X());
                    d16 = d18 = d52 - d53;
                    try {
                        try {
                            if (!bl3 && this.v.n.s().booleanValue()) break block187;
                        }
                        catch (O_ o_57) {
                            throw bc.a(o_57);
                        }
                        g5.u(string, (double)f10 + g52.l(string7, this.X()) + g52.D((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)27182, (long)(0x57ABDC34B1FD5E7EL ^ l10)), (long)7501646511212703955L, (long)l10))), d17 + d16, new Color(150, 150, 150, 255), this.X());
                        break block188;
                    }
                    catch (O_ o_58) {
                        throw bc.a(o_58);
                    }
                }
                g5.t(string, (double)f10 + g52.l(string7, this.X()) + g52.D((String)((Object)bc.c("\u00c8", (int)bc.b("e", (int)21916, (long)(0x23CAA91B0C09E1CDL ^ l10)), (long)7501646511212703955L, (long)l10))), d17 + d16, new Color(150, 150, 150, 255), this.X());
            }
            FG.F();
            f12 += (float)n12;
        }
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private G5 y(int n2) {
        block4: {
            kT kT2 = SE.h.e().l().W();
            try {
                try {
                    if (kT2 == null || kT2 == kT.PROXIMA) break block4;
                }
                catch (O_ o_2) {
                    throw bc.a(o_2);
                }
                return SE.h.W().L(kT2, n2, false);
            }
            catch (O_ o_3) {
                throw bc.a(o_3);
            }
        }
        return SE.h.W().z(n2);
    }

    @Override
    public double z() {
        return 0.0;
    }

    private void z(List<xi> list) {
        ea ea2;
        block25: {
            ArrayList<xi> arrayList = new ArrayList<xi>();
            ArrayList<xi> arrayList2 = new ArrayList<xi>();
            for (xi xi2 : list) {
                try {
                    if (this.D.contains(xi2)) continue;
                    arrayList.add(xi2);
                }
                catch (O_ o_2) {
                    throw bc.a(o_2);
                }
            }
            for (xi xi2 : this.D) {
                try {
                    if (list.contains(xi2)) continue;
                    arrayList2.add(xi2);
                }
                catch (O_ o_3) {
                    throw bc.a(o_3);
                }
            }
            for (xi xi2 : arrayList) {
                ea2 = new ea(xi2);
                ea2.L(true);
                ea2.H(0.0f);
                this.B.put(xi2, ea2);
            }
            for (xi xi2 : arrayList2) {
                ea2 = new ea(xi2);
                ea2.L(false);
                ea2.H(1.0f);
                this.B.put(xi2, ea2);
            }
            try {
                try {
                    if (this.Y.m(10L) || !this.v.K.s().booleanValue()) break block25;
                }
                catch (O_ o_4) {
                    throw bc.a(o_4);
                }
                return;
            }
            catch (O_ o_5) {
                throw bc.a(o_5);
            }
        }
        this.Y.m();
        for (xi xi2 : this.B.keySet()) {
            ea ea3;
            block26: {
                block27: {
                    ea2 = this.B.get(xi2);
                    try {
                        if (ea.V(ea2)) {
                            continue;
                        }
                    }
                    catch (O_ o_6) {
                        throw bc.a(o_6);
                    }
                    try {
                        try {
                            if (this.v.K.s().booleanValue()) break block26;
                            if (!ea.l(ea2)) break block27;
                        }
                        catch (O_ o_7) {
                            throw bc.a(o_7);
                        }
                        ea.a(ea2, 1.0f);
                        ea2.d(true);
                        continue;
                    }
                    catch (O_ o_8) {
                        throw bc.a(o_8);
                    }
                }
                ea.a(ea2, 0.0f);
                ea2.d(true);
                continue;
            }
            if (ea.l(ea2)) {
                ea3 = ea2;
                try {
                    ea.a(ea3, (float)((double)ea.f(ea3) + 0.08));
                    if (!(ea.f(ea2) >= 1.0f)) continue;
                    ea.a(ea2, 1.0f);
                    ea2.d(true);
                    continue;
                }
                catch (O_ o_9) {
                    throw bc.a(o_9);
                }
            }
            ea3 = ea2;
            try {
                ea.a(ea3, (float)((double)ea.f(ea3) - 0.08));
                if (!(ea.f(ea2) <= 0.0f)) continue;
                ea.a(ea2, 0.0f);
                ea2.d(true);
            }
            catch (O_ o_10) {
                throw bc.a(o_10);
            }
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5C40;
        if (bb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = ab[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bc", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bc.bb[n3] = n4;
        }
        return bb[n3];
    }

    static boolean y(bc bc2) {
        return bc2.X();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bc.n = d8.a(-3697550299691762072L, -7365302367519023284L, MethodHandles.lookup().lookupClass()).a(169679614019695L);
                bc.eb = new Object[5];
                bc.fb = new String[5];
                bc.a();
                bc.db = new HashMap<K, V>(13);
                var0 = bc.n ^ 27239443453183L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00ff\u00ca\u00d2\u0002\t*\u008e\u0016#\u00c4\u00ac\u00d7!\u0080u\u00bb\u00f4E\u00e2\u0014T\u0088G\u00d6\u00c00h\u0086\u00d8e\u0092\u00f9E\u00c6\u00f5\u00ae>\u00d0Lg\"\u0093\u00b3\u00ab1\u00e4\u00a2M\u00ae+G\u00fb\u000b\u0085K4\u00d5N\u00fc\u009c\u008e\u0084\u00b1\u008e\u00d0\"\u0015SOj\u0080\u00e2\u00ea_\u00c3\u008b\u00ac;\u001cIF\u001a\u00afE\u00d8\u00a5\"\u000b";
                var7_6 = "\u00ff\u00ca\u00d2\u0002\t*\u008e\u0016#\u00c4\u00ac\u00d7!\u0080u\u00bb\u00f4E\u00e2\u0014T\u0088G\u00d6\u00c00h\u0086\u00d8e\u0092\u00f9E\u00c6\u00f5\u00ae>\u00d0Lg\"\u0093\u00b3\u00ab1\u00e4\u00a2M\u00ae+G\u00fb\u000b\u0085K4\u00d5N\u00fc\u009c\u008e\u0084\u00b1\u008e\u00d0\"\u0015SOj\u0080\u00e2\u00ea_\u00c3\u008b\u00ac;\u001cIF\u001a\u00afE\u00d8\u00a5\"\u000b".length();
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
                    var6_5 = "\u00bfe\u00e2\u008f\u00fe\u000e\u0012[\u009el)\\\u001d\u001a\u008a\u00a2";
                    var7_6 = "\u00bfe\u00e2\u008f\u00fe\u000e\u0012[\u009el)\\\u001d\u001a\u008a\u00a2".length();
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
        bc.ab = var8_3;
        bc.bb = new Integer[13];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bc.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bc.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f8' || c10 == '\u00d5' || c10 == '\u00e0' || c10 == '\u00ef') {
                field = bc.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bc.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bc.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bc.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void O(Sz sz2) {
        block12: {
            try {
                try {
                    super.O(sz2);
                    if (this.v.P.s().booleanValue() && !Ao.K.P) break block12;
                }
                catch (O_ o_2) {
                    throw bc.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw bc.a(o_3);
            }
        }
        for (xi xi2 : this.B.keySet()) {
            block13: {
                ea ea2 = this.B.get(xi2);
                try {
                    if (ea.n(ea2) == null) {
                        continue;
                    }
                }
                catch (O_ o_4) {
                    throw bc.a(o_4);
                }
                X4 x42 = ea.n(ea2);
                try {
                    try {
                        if (!x42.O(sz2.getX(), sz2.getY())) continue;
                        if (!xi2.Z()) break block13;
                    }
                    catch (O_ o_5) {
                        throw bc.a(o_5);
                    }
                    xi2.T(false);
                    this.L.add(xi2);
                    break;
                }
                catch (O_ o_6) {
                    throw bc.a(o_6);
                }
            }
            xi2.T(true);
            this.L.remove(xi2);
            this.D.add(xi2);
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void h(List<xi> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Field g(long l10, long l11) {
        int n2 = bc.e(l10, l11);
        Object object = eb[n2];
        if (object instanceof String) {
            String string = fb[n2];
            int n3 = string.indexOf(8);
            Class clazz = bc.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bc.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bc.c(clazz3, string2, clazz2)) != null) {
                    bc.eb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bc.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bc.eb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bc.f(211650626342753L, 0L);
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
            return MethodHandles.lookup().findStatic(bc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

