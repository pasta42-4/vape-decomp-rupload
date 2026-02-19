/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ay;
import a.Bg;
import a.EP;
import a.Fp;
import a.G2;
import a.Ji;
import a.KB;
import a.Kb;
import a.Kd;
import a.OY;
import a.O_;
import a.Qg;
import a.V4;
import a.XO;
import a._2;
import a._Y;
import a.au;
import a.cd;
import a.d8;
import a.jU;
import a.js;
import a.oV;
import a.on;
import a.pt;
import a.rT;
import a.sy;
import a.t1;
import a.tU;
import a.x4;
import a.x5;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xx
extends x4<Ay> {
    private V4 A;
    t1 T;
    private static final long bb;
    private static final Integer[] gb;
    tU K;
    private final jU O;
    private ArrayList<Integer> Z;
    private final js j;
    private Bg ds;
    au P;
    private Bg N;
    double[] n;
    tU V;
    private static final Map hb;
    tU d;
    private int dQ;
    private ArrayList<double[]> x;
    private static final Object[] kb;
    Ay L;
    private double[] l;
    private boolean dh;
    x5 t;
    private int B;
    private boolean R;
    private double[] v;
    private int m;
    private int r;
    tU Y;
    boolean z;
    private boolean G;
    private Bg h;
    private static final long[] fb;
    private static final String[] lb;
    float[] o;
    private final js e;

    @OY
    public void u(Kb kb2) {
        try {
            if (this.z) {
                this.t.S(kb2);
            }
        }
        catch (O_ o_2) {
            throw xx.a(o_2);
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = xx.a(l10, l11);
        Object object = kb[n2];
        if (object instanceof String) {
            String string = lb[n2];
            int n3 = string.indexOf(8);
            Class clazz = xx.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xx.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xx.a(clazz3, string2, clazz2)) != null) {
                    xx.kb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xx.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xx.kb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xx.b(631071114574290L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xx.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(long l10, long l11) {
        int n2 = xx.a(l10, l11);
        Object object = kb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xx.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xx.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xx.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xx.kb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xx.b(631071114574290L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xx.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xx.kb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xx.b(631071114574290L, 0L);
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

    private boolean A(int n2) {
        return false;
    }

    private boolean B(Qg qg2, double[] dArray) {
        double d2 = dArray[0];
        double d3 = dArray[2];
        double d4 = 0.8;
        if (this.m == 6) {
            boolean bl2;
            double d5 = qg2.F() - (d2 += d4);
            try {
                bl2 = d5 >= -0.05;
            }
            catch (O_ o_2) {
                throw xx.a(o_2);
            }
            return bl2;
        }
        if (this.m == 8) {
            boolean bl3;
            double d6 = qg2.F() - (d2 -= 1.0 - d4);
            try {
                bl3 = d6 <= 0.05;
            }
            catch (O_ o_3) {
                throw xx.a(o_3);
            }
            return bl3;
        }
        if (this.m == 7) {
            boolean bl4;
            double d7 = qg2.B() - (d3 += d4);
            try {
                bl4 = d7 >= -0.05;
            }
            catch (O_ o_4) {
                throw xx.a(o_4);
            }
            return bl4;
        }
        if (this.m == 5) {
            boolean bl5;
            double d9 = qg2.B() - (d3 -= 1.0 - d4);
            try {
                bl5 = d9 <= 0.05;
            }
            catch (O_ o_5) {
                throw xx.a(o_5);
            }
            return bl5;
        }
        return false;
    }

    private boolean y(Qg qg2) {
        boolean bl2;
        block13: {
            block12: {
                double d2 = qg2.F();
                double d3 = qg2.B();
                if (this.m == 6) {
                    d2 += 0.15;
                } else if (this.m == 8) {
                    d2 -= 0.15;
                } else if (this.m == 7) {
                    d3 += 0.15;
                } else if (this.m == 5) {
                    d3 -= 0.15;
                } else {
                    return true;
                }
                d2 = sy.Q(d2);
                double d4 = this.L.h(qg2);
                d3 = sy.Q(d3);
                try {
                    try {
                        if (this.L.O(d2, d4, d3) || !qg2.j()) break block12;
                    }
                    catch (O_ o_2) {
                        throw xx.a(o_2);
                    }
                    bl2 = true;
                    break block13;
                }
                catch (O_ o_3) {
                    throw xx.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private void r(Qg qg2) {
        block9: {
            long l10 = bb ^ 0x4EC298A64839L;
            double[] dArray = this.t();
            try {
                block8: {
                    try {
                        try {
                            try {
                                if (this.n == null || sy.Q(this.n[0]) != sy.Q(dArray[0])) break block8;
                            }
                            catch (O_ o_2) {
                                throw xx.a(o_2);
                            }
                            if (sy.Q(this.n[1]) != sy.Q(dArray[1])) break block8;
                        }
                        catch (O_ o_3) {
                            throw xx.a(o_3);
                        }
                        if (sy.Q(this.n[2]) == sy.Q(dArray[2])) break block9;
                    }
                    catch (O_ o_4) {
                        throw xx.a(o_4);
                    }
                }
                this.n = dArray;
                xx.c("\u00dd", (Object)this.L, (Object)this.n, (float)this.L.J(this.m), (int)this.m, (Object)this.x.get(this.x.size() - 1), (long)1724898462198851819L, (long)l10);
            }
            catch (O_ o_5) {
                throw xx.a(o_5);
            }
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3172;
        if (gb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = fb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xx.gb[n3] = n4;
        }
        return gb[n3];
    }

    private double[] S(boolean bl2) {
        double[] dArray;
        block7: {
            block4: {
                int n2;
                double[] dArray2;
                Ay ay2;
                block6: {
                    block5: {
                        try {
                            try {
                                if (!bl2) break block4;
                                ay2 = this.L;
                                dArray2 = this.x.get(this.x.size() - 1);
                                if (!this.dh) break block5;
                            }
                            catch (O_ o_2) {
                                throw xx.a(o_2);
                            }
                            n2 = 4;
                            break block6;
                        }
                        catch (O_ o_3) {
                            throw xx.a(o_3);
                        }
                    }
                    n2 = 3;
                }
                dArray = ay2.j(dArray2, n2, this.m);
                break block7;
            }
            dArray = this.L.j(this.x.get(this.x.size() - 1), 2, this.m);
        }
        double[] dArray3 = dArray;
        return this.h(new double[]{dArray3[0], dArray3[2]});
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

    private void k(Qg qg2) {
        block18: {
            int n2;
            block19: {
                n2 = this.x.size();
                try {
                    if (n2 == 0) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw xx.a(o_2);
                }
                try {
                    try {
                        try {
                            if (!qg2.j()) break block18;
                            if (this.B != 0) break block19;
                        }
                        catch (O_ o_3) {
                            throw xx.a(o_3);
                        }
                        if (this.B != 0) break block18;
                    }
                    catch (O_ o_4) {
                        throw xx.a(o_4);
                    }
                    if (!qg2.o()) break block18;
                }
                catch (O_ o_5) {
                    throw xx.a(o_5);
                }
            }
            double[] dArray = this.x.get(n2 - 1);
            try {
                if (this.B(qg2, dArray)) {
                    Fp.d(this.d, true);
                    return;
                }
            }
            catch (O_ o_6) {
                throw xx.a(o_6);
            }
        }
        try {
            if (this.d.X()) {
                Fp.d(this.d, false);
            }
        }
        catch (O_ o_7) {
            throw xx.a(o_7);
        }
        try {
            if (!this.K.X()) {
                Fp.d(this.K, true);
            }
        }
        catch (O_ o_8) {
            throw xx.a(o_8);
        }
    }

    @OY
    public void v(Kd kd2) {
        try {
            if (this.z) {
                this.t.X(kd2);
            }
        }
        catch (O_ o_2) {
            throw xx.a(o_2);
        }
    }

    private boolean d(Qg qg2) {
        block12: {
            int n2;
            block13: {
                block11: {
                    n2 = this.L.l();
                    try {
                        try {
                            if (n2 != -1 && this.L.c(1) >= 5) break block11;
                        }
                        catch (O_ o_2) {
                            throw xx.a(o_2);
                        }
                        return false;
                    }
                    catch (O_ o_3) {
                        throw xx.a(o_3);
                    }
                }
                try {
                    if (this.A == null || qg2.a().equals(this.A)) break block12;
                }
                catch (O_ o_4) {
                    throw xx.a(o_4);
                }
                int n3 = this.L.Z(qg2, this.A);
                try {
                    if (n3 == -1) break block13;
                    this.L.Q(n3);
                    break block12;
                }
                catch (O_ o_5) {
                    throw xx.a(o_5);
                }
            }
            try {
                if (qg2.l().v() != n2) {
                    this.L.Q(n2);
                }
            }
            catch (O_ o_6) {
                throw xx.a(o_6);
            }
        }
        return true;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xx.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xx.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean V(Qg qg2) {
        boolean bl2;
        block6: {
            boolean bl3;
            block8: {
                block7: {
                    try {
                        try {
                            if (this.m % 2 != 0) break block6;
                            if (!(Math.abs(qg2.G()) >= 0.1)) break block7;
                        }
                        catch (O_ o_2) {
                            throw xx.a(o_2);
                        }
                        bl3 = true;
                        break block8;
                    }
                    catch (O_ o_3) {
                        throw xx.a(o_3);
                    }
                }
                bl3 = false;
            }
            return bl3;
        }
        try {
            bl2 = Math.abs(qg2.o()) >= 0.1;
        }
        catch (O_ o_4) {
            throw xx.a(o_4);
        }
        return bl2;
    }

    public boolean a(Qg qg2) {
        boolean bl2;
        block32: {
            block31: {
                boolean bl3;
                boolean bl4;
                block33: {
                    boolean bl5;
                    int n2;
                    block28: {
                        boolean bl6;
                        block30: {
                            block29: {
                                boolean bl7;
                                on on2;
                                block27: {
                                    block26: {
                                        block25: {
                                            on2 = XO.b.m();
                                            try {
                                                block24: {
                                                    try {
                                                        try {
                                                            if (on2.Y() || !on2.q().equals(oV.Y())) break block24;
                                                        }
                                                        catch (O_ o_2) {
                                                            throw xx.a(o_2);
                                                        }
                                                        if (this.x.size() >= 1) break block25;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw xx.a(o_3);
                                                    }
                                                }
                                                return false;
                                            }
                                            catch (O_ o_4) {
                                                throw xx.a(o_4);
                                            }
                                        }
                                        double[] dArray = this.x.get(this.x.size() - 1);
                                        double[] dArray2 = new double[]{sy.Q((double)on2.p()), sy.Q((double)on2.b()), sy.Q((double)on2.m())};
                                        try {
                                            try {
                                                try {
                                                    if (dArray[0] != dArray2[0] || dArray[1] != dArray2[1]) break block26;
                                                }
                                                catch (O_ o_5) {
                                                    throw xx.a(o_5);
                                                }
                                                if (dArray[2] != dArray2[2]) break block26;
                                            }
                                            catch (O_ o_6) {
                                                throw xx.a(o_6);
                                            }
                                            bl7 = true;
                                            break block27;
                                        }
                                        catch (O_ o_7) {
                                            throw xx.a(o_7);
                                        }
                                    }
                                    bl7 = false;
                                }
                                bl4 = bl7;
                                n2 = on2.j();
                                try {
                                    try {
                                        try {
                                            if (this.B == 0 || this.x.size() != 4) break block28;
                                        }
                                        catch (O_ o_8) {
                                            throw xx.a(o_8);
                                        }
                                        if (n2 != 1) break block29;
                                    }
                                    catch (O_ o_9) {
                                        throw xx.a(o_9);
                                    }
                                    bl6 = true;
                                    break block30;
                                }
                                catch (O_ o_10) {
                                    throw xx.a(o_10);
                                }
                            }
                            bl6 = false;
                        }
                        bl3 = bl6;
                        break block33;
                    }
                    try {
                        bl5 = n2 > 1;
                    }
                    catch (O_ o_11) {
                        throw xx.a(o_11);
                    }
                    bl3 = bl5;
                }
                try {
                    try {
                        if (!bl4 || !bl3) break block31;
                    }
                    catch (O_ o_12) {
                        throw xx.a(o_12);
                    }
                    bl2 = true;
                    break block32;
                }
                catch (O_ o_13) {
                    throw xx.a(o_13);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private void M() {
        this.z = true;
        this.r = 0;
        this.P = null;
        this.h.m();
        this.o = null;
        this.R = false;
        this.m = 0;
        this.x.clear();
        this.A = null;
    }

    private void p(double[] dArray, boolean bl2) {
        this.P = new au(dArray[0], dArray[1]);
        this.P.b(bl2);
        this.P.s(true);
        G2.c.N(this.P);
        this.h.m();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(Qg qg2) {
        double[] dArray;
        block32: {
            block29: {
                double[] dArray2;
                block31: {
                    double[] dArray3;
                    block30: {
                        int n2;
                        double d2;
                        double d3;
                        double d4;
                        block28: {
                            d4 = sy.Q(qg2.F());
                            d3 = sy.Q(qg2.B());
                            d2 = this.L.h(qg2);
                            try {
                                if (!this.L.v(qg2.a())) {
                                    this.v = null;
                                    this.dQ = 0;
                                    return true;
                                }
                            }
                            catch (O_ o_2) {
                                throw xx.a(o_2);
                            }
                            n2 = this.L.y();
                            try {
                                try {
                                    if (this.m == 0 || n2 == this.m) break block28;
                                }
                                catch (O_ o_3) {
                                    throw xx.a(o_3);
                                }
                                this.v = null;
                                this.dQ = 0;
                            }
                            catch (O_ o_4) {
                                throw xx.a(o_4);
                            }
                        }
                        this.m = n2;
                        dArray = new double[]{d4, d2, d3};
                        dArray3 = this.L.j(dArray, 1, this.m);
                        dArray2 = this.L.j(dArray, 2, this.m);
                        try {
                            try {
                                try {
                                    if (this.v != null || !qg2.j()) break block29;
                                }
                                catch (O_ o_5) {
                                    throw xx.a(o_5);
                                }
                                if (!this.L.L(dArray)) break block30;
                            }
                            catch (O_ o_6) {
                                throw xx.a(o_6);
                            }
                            this.v = dArray;
                            return true;
                        }
                        catch (O_ o_7) {
                            throw xx.a(o_7);
                        }
                    }
                    try {
                        if (!this.L.L(dArray3)) break block31;
                        this.v = dArray3;
                        return true;
                    }
                    catch (O_ o_8) {
                        throw xx.a(o_8);
                    }
                }
                try {
                    if (!this.L.L(dArray2)) return true;
                    this.v = dArray2;
                    return true;
                }
                catch (O_ o_9) {
                    throw xx.a(o_9);
                }
            }
            try {
                if (this.v == null) return true;
                if (!((double)this.dQ >= (Double)this.j.J())) break block32;
            }
            catch (O_ o_10) {
                throw xx.a(o_10);
            }
            this.x.add(this.v);
            this.dQ = 0;
            double[] dArray4 = this.L.T(this.L.j(this.v, -1, this.m), 0.0, this.m);
            this.p(this.h(new double[]{dArray4[0], dArray4[2]}), false);
            this.A = qg2.a();
            this.v = null;
            this.dh = true;
            return false;
        }
        if (!this.L.L(this.v)) {
            boolean bl2;
            block33: {
                ++this.dQ;
                double[] dArray5 = this.L.j(this.v, 1, this.m);
                bl2 = this.L.L(dArray5);
                try {
                    try {
                        if (!bl2 || !((double)this.dQ < (Double)this.j.J())) break block33;
                    }
                    catch (O_ o_11) {
                        throw xx.a(o_11);
                    }
                    this.v = dArray5;
                    return true;
                }
                catch (O_ o_12) {
                    throw xx.a(o_12);
                }
            }
            try {
                if (bl2) return true;
                this.v = null;
                this.dQ = 0;
                return true;
            }
            catch (O_ o_13) {
                throw xx.a(o_13);
            }
        }
        try {
            if (!this.L.P(this.v, dArray, this.m, (Double)this.j.J(), this.dQ)) return true;
            this.v = null;
            this.dQ = 0;
            return true;
        }
        catch (O_ o_14) {
            throw xx.a(o_14);
        }
    }

    private boolean x(Qg qg2) {
        double d2 = this.x.get(this.x.size() - 1)[0];
        double d3 = this.x.get(this.x.size() - 1)[2];
        double d4 = 1.0;
        double d5 = 0.1;
        if (this.m == 6) {
            boolean bl2;
            block21: {
                block20: {
                    d3 += 0.6;
                    double d6 = qg2.F() - (d2 += d4);
                    try {
                        try {
                            if (!(d6 < -d5) || !(Math.abs(qg2.B() - d3) <= 0.15)) break block20;
                        }
                        catch (O_ o_2) {
                            throw xx.a(o_2);
                        }
                        bl2 = true;
                        break block21;
                    }
                    catch (O_ o_3) {
                        throw xx.a(o_3);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        if (this.m == 8) {
            boolean bl3;
            block23: {
                block22: {
                    d3 += 0.4;
                    double d7 = qg2.F() - (d2 -= 1.0 - d4);
                    try {
                        try {
                            if (!(d7 > d5) || !(Math.abs(qg2.B() - d3) <= 0.15)) break block22;
                        }
                        catch (O_ o_4) {
                            throw xx.a(o_4);
                        }
                        bl3 = true;
                        break block23;
                    }
                    catch (O_ o_5) {
                        throw xx.a(o_5);
                    }
                }
                bl3 = false;
            }
            return bl3;
        }
        if (this.m == 7) {
            boolean bl4;
            block25: {
                block24: {
                    d2 += 0.4;
                    double d9 = qg2.B() - (d3 += d4);
                    try {
                        try {
                            if (!(d9 < -d5) || !(Math.abs(qg2.F() - d2) <= 0.15)) break block24;
                        }
                        catch (O_ o_6) {
                            throw xx.a(o_6);
                        }
                        bl4 = true;
                        break block25;
                    }
                    catch (O_ o_7) {
                        throw xx.a(o_7);
                    }
                }
                bl4 = false;
            }
            return bl4;
        }
        if (this.m == 5) {
            boolean bl5;
            block27: {
                block26: {
                    d2 += 0.6;
                    double d10 = qg2.B() - (d3 -= 1.0 - d4);
                    try {
                        try {
                            if (!(d10 > d5) || !(Math.abs(qg2.F() - d2) <= 0.15)) break block26;
                        }
                        catch (O_ o_8) {
                            throw xx.a(o_8);
                        }
                        bl5 = true;
                        break block27;
                    }
                    catch (O_ o_9) {
                        throw xx.a(o_9);
                    }
                }
                bl5 = false;
            }
            return bl5;
        }
        return false;
    }

    private double[] t() {
        double[] dArray;
        block6: {
            int n2;
            block5: {
                n2 = this.x.size();
                try {
                    if (n2 == 0) {
                        return null;
                    }
                }
                catch (O_ o_2) {
                    throw xx.a(o_2);
                }
                try {
                    if (this.B == 0 || n2 != 4) break block5;
                }
                catch (O_ o_3) {
                    throw xx.a(o_3);
                }
                dArray = this.L.T(this.x.get(n2 - 1), 0.2, this.m);
                break block6;
            }
            double d2 = 0.3;
            double d3 = 0.2;
            dArray = this.L.B(this.x.get(n2 - 1), d2, d3, this.m);
        }
        return dArray;
    }

    private boolean J(Qg qg2) {
        boolean bl2;
        block6: {
            boolean bl3;
            block8: {
                block7: {
                    try {
                        try {
                            if (this.m % 2 != 0) break block6;
                            if (!(Math.abs(qg2.G()) < 0.6)) break block7;
                        }
                        catch (O_ o_2) {
                            throw xx.a(o_2);
                        }
                        bl3 = true;
                        break block8;
                    }
                    catch (O_ o_3) {
                        throw xx.a(o_3);
                    }
                }
                bl3 = false;
            }
            return bl3;
        }
        try {
            bl2 = Math.abs(qg2.o()) < 0.6;
        }
        catch (O_ o_4) {
            throw xx.a(o_4);
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xx.bb = d8.a(-3929750803506082833L, 4319268322485639138L, MethodHandles.lookup().lookupClass()).a(152619737177285L);
                xx.kb = new Object[11];
                xx.lb = new String[11];
                xx.a();
                xx.hb = new HashMap<K, V>(13);
                var0 = xx.bb ^ 12422589811321L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "T<c0OA\u00b2\u00c9\u00c2\u007f\u00be\u00e0\u00ae\u009c\u0095\u00af\u00a8g\u00a4\u00ca\u00007}\u00d5l\u0091\u00cf\u00eb\u00af\u00de\u00d8\u00d3\u00d2h\u00e3\b\u00aa7\u00c39\u00eb\u008f\u00d6t\u00af\u00ec/H";
                var7_6 = "T<c0OA\u00b2\u00c9\u00c2\u007f\u00be\u00e0\u00ae\u009c\u0095\u00af\u00a8g\u00a4\u00ca\u00007}\u00d5l\u0091\u00cf\u00eb\u00af\u00de\u00d8\u00d3\u00d2h\u00e3\b\u00aa7\u00c39\u00eb\u008f\u00d6t\u00af\u00ec/H".length();
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
                    var6_5 = "Gm\u00f1/\u00d9\u0089z{%\u000b\u00f1\u0085\u001aZ\u00de\u00db";
                    var7_6 = "Gm\u00f1/\u00d9\u0089z{%\u000b\u00f1\u0085\u001aZ\u00de\u00db".length();
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
        xx.fb = var8_3;
        xx.gb = new Integer[8];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'v' || c10 == 'U' || c10 == '\u00aa' || c10 == 'Z') {
                field = xx.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'U' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xx.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xx.a(l10, l11);
            object = kb[n2];
            try {
                if (!(object instanceof String)) break block2;
                xx.kb[n2] = clazz = Class.forName(lb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void h() {
        this.z = true;
    }

    private void N(Qg qg2) {
        block40: {
            block47: {
                block45: {
                    block46: {
                        int n2;
                        block44: {
                            block43: {
                                try {
                                    if (EP.X().M() == null) {
                                        Ji.l();
                                    }
                                }
                                catch (O_ o_2) {
                                    throw xx.a(o_2);
                                }
                                try {
                                    if (!this.R) {
                                        return;
                                    }
                                }
                                catch (O_ o_3) {
                                    throw xx.a(o_3);
                                }
                                try {
                                    if (!qg2.j()) {
                                        this.G = true;
                                    }
                                }
                                catch (O_ o_4) {
                                    throw xx.a(o_4);
                                }
                                try {
                                    block42: {
                                        try {
                                            try {
                                                try {
                                                    block41: {
                                                        try {
                                                            try {
                                                                this.O();
                                                                if (!qg2.j()) break block40;
                                                                if (this.dh) break block41;
                                                            }
                                                            catch (O_ o_5) {
                                                                throw xx.a(o_5);
                                                            }
                                                            if (!this.G) break block40;
                                                        }
                                                        catch (O_ o_6) {
                                                            throw xx.a(o_6);
                                                        }
                                                    }
                                                    xx xx2 = this;
                                                    if (this.dh) break block42;
                                                }
                                                catch (O_ o_7) {
                                                    throw xx.a(o_7);
                                                }
                                                if (this.V(qg2)) break block43;
                                            }
                                            catch (O_ o_8) {
                                                throw xx.a(o_8);
                                            }
                                            if (!this.x(qg2)) break block43;
                                        }
                                        catch (O_ o_9) {
                                            throw xx.a(o_9);
                                        }
                                    }
                                    n2 = 0;
                                    break block44;
                                }
                                catch (O_ o_10) {
                                    throw xx.a(o_10);
                                }
                            }
                            n2 = 1;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        xx2.B = n2;
                                        this.dh = false;
                                        this.n = null;
                                        this.l = null;
                                        if (this.r < this.R() || this.B != 1) break block45;
                                    }
                                    catch (O_ o_11) {
                                        throw xx.a(o_11);
                                    }
                                    if ((Double)this.e.J() != 0.0) break block46;
                                }
                                catch (O_ o_12) {
                                    throw xx.a(o_12);
                                }
                                if (this.J(qg2)) break block46;
                            }
                            catch (O_ o_13) {
                                throw xx.a(o_13);
                            }
                            this.p(this.S(false), false);
                            this.v(5);
                            this.G = false;
                            break block40;
                        }
                        catch (O_ o_14) {
                            throw xx.a(o_14);
                        }
                    }
                    try {
                        this.B = 0;
                        if (this.l == null) {
                            this.l = this.L.T(this.L.j(this.x.get(this.x.size() - 1), 1, this.m), 0.0, this.m);
                            this.p(this.h(new double[]{this.l[0], this.l[2]}), false);
                        }
                    }
                    catch (O_ o_15) {
                        throw xx.a(o_15);
                    }
                    this.v(1);
                    this.r(qg2);
                    return;
                }
                try {
                    if (this.B != 0) break block47;
                    this.o = this.q(qg2, this.m);
                    this.L.b(this.o, this.L.i(this.o));
                    this.ds.m();
                    Fp.d(this.K, true);
                    this.p(this.S(true), false);
                    this.v(1);
                    this.G = false;
                    this.r = 0;
                    break block40;
                }
                catch (O_ o_16) {
                    throw xx.a(o_16);
                }
            }
            this.p(this.S(false), false);
            this.v(4);
            ++this.r;
            this.G = false;
        }
        try {
            if (!qg2.j()) {
                this.r(qg2);
            }
        }
        catch (O_ o_17) {
            throw xx.a(o_17);
        }
        try {
            this.k(qg2);
            if (this.A(10000)) {
                return;
            }
        }
        catch (O_ o_18) {
            throw xx.a(o_18);
        }
    }

    private int R() {
        int n2;
        int n3;
        double d2 = Math.random();
        int n4 = ((Double)this.e.J()).intValue();
        try {
            n3 = n4 == 0 ? 0 : n4 - 1;
        }
        catch (O_ o_2) {
            throw xx.a(o_2);
        }
        int n5 = n3;
        try {
            n2 = n4 == 0 ? 0 : n4 + 1;
        }
        catch (O_ o_3) {
            throw xx.a(o_3);
        }
        int n6 = n2;
        try {
            if (d2 < 0.15) {
                return n6;
            }
        }
        catch (O_ o_4) {
            throw xx.a(o_4);
        }
        try {
            if (d2 < 0.25) {
                return n5;
            }
        }
        catch (O_ o_5) {
            throw xx.a(o_5);
        }
        return n4;
    }

    public xx(xi xi2, String string) {
        long l10 = bb ^ 0x570FC6B02E48L;
        super(xi2, string);
        this.j = js.b(this, (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)6925, (long)(0x1D8BF46B12F55BFCL ^ l10)), (long)8179079552957474835L, (long)l10)), (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)10319, (long)(0x4DA4DBAE6E9E68B8L ^ l10)), (long)8179079552957474835L, (long)l10)), "", 1.0, 2.0, 4.0, (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)23318, (long)(0x681E204FB3B31BE0L ^ l10)), (long)8179079552957474835L, (long)l10)));
        this.e = js.N(this, (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)3470, (long)(0x360DD183E00DCD7CL ^ l10)), (long)8179079552957474835L, (long)l10)), (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)11390, (long)(0x269BCBABA6046C8EL ^ l10)), (long)8179079552957474835L, (long)l10)), "", 0.0, 1.0, 3.0, 1.0);
        this.O = jU.R(this, (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)8254, (long)(0x2A35CAB9A40E60CAL ^ l10)), (long)8179079552957474835L, (long)l10)), true, (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)2922, (long)(0x1CD2BBEAE038CB99L ^ l10)), (long)8179079552957474835L, (long)l10)));
        this.L = (Ay)this.n();
        this.P = null;
        this.t = new x5((xi)this.n(), (String)((Object)xx.c("\u00f3", (int)xx.a("k", (int)26589, (long)(0x2C34AE36E6BDA728L ^ l10)), (long)8179079552957474835L, (long)l10)));
        this.R = false;
        this.m = 0;
        this.h = new Bg();
        this.N = new Bg();
        this.x = new ArrayList();
        this.v = null;
        this.l = null;
        this.ds = new Bg();
        this.dQ = 0;
        this.T = EP.N();
        this.Y = this.T.D();
        this.V = this.T.w();
        this.K = this.T.N();
        this.d = this.T.r();
        this.B = 0;
        this.r = 0;
        this.Z = new ArrayList();
        this.N(this.O, this.j, this.e);
    }

    @Override
    public void v() {
        this.L.A();
        this.M();
    }

    private double[] m(double[] dArray, int n2) {
        double d2;
        double d3;
        double d4;
        block10: {
            block9: {
                int n3 = n2;
                d4 = dArray[0];
                d3 = dArray[1];
                d2 = dArray[2];
                try {
                    if (this.B == 0 || n3 != 4) break block9;
                }
                catch (O_ o_2) {
                    throw xx.a(o_2);
                }
                d3 += 1.0;
                break block10;
            }
            if (this.m == 6) {
                d4 += 1.0;
            } else if (this.m == 8) {
                d4 -= 1.0;
            } else if (this.m == 7) {
                d2 += 1.0;
            } else if (this.m == 5) {
                d2 -= 1.0;
            }
        }
        return new double[]{d4, d3, d2};
    }

    private float[] q(Qg qg2, int n2) {
        double d2;
        double d3;
        double d4 = _Y.T();
        double d5 = 90.0;
        if (n2 == 6) {
            d4 = 230.0;
        } else if (n2 == 8) {
            d4 = 50.0;
        } else if (n2 == 7) {
            d4 = 320.0;
        } else if (n2 == 5) {
            d4 = 140.0;
        }
        try {
            d3 = d4;
            d2 = Math.random() < 0.5 ? Math.random() * -4.0 : Math.random() * 4.0;
        }
        catch (O_ o_2) {
            throw xx.a(o_2);
        }
        d4 = d3 + d2;
        return new float[]{(float)d4, (float)(d5 += Math.random() * -5.0)};
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private double[] h(double[] dArray) {
        double d2 = dArray[0];
        double d3 = dArray[1];
        if (this.m == 6) {
            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.3)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.6)).doubleValue();
        } else if (this.m == 8) {
            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.7)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.4)).doubleValue();
        } else if (this.m == 7) {
            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.4)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.3)).doubleValue();
        } else if (this.m == 5) {
            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.6)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.7)).doubleValue();
        }
        return new double[]{d2, d3};
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xx.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xx.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @OY
    public void H(KB kB2) {
        Qg qg2;
        block31: {
            block29: {
                block30: {
                    block28: {
                        block27: {
                            block26: {
                                block25: {
                                    try {
                                        try {
                                            if (!EP.U().Y() && !EP.c().Y()) break block25;
                                        }
                                        catch (O_ o_2) {
                                            throw xx.a(o_2);
                                        }
                                        return;
                                    }
                                    catch (O_ o_3) {
                                        throw xx.a(o_3);
                                    }
                                }
                                qg2 = EP.U();
                                try {
                                    if (!this.R) break block26;
                                    _2.l.E(this);
                                    _2.i.I();
                                    break block27;
                                }
                                catch (O_ o_4) {
                                    throw xx.a(o_4);
                                }
                            }
                            _2.l.m(this);
                            _2.i.Z();
                        }
                        try {
                            try {
                                try {
                                    if (this.z || !this.R) break block28;
                                }
                                catch (O_ o_5) {
                                    throw xx.a(o_5);
                                }
                                if (!this.a(qg2)) break block28;
                            }
                            catch (O_ o_6) {
                                throw xx.a(o_6);
                            }
                            this.Y.X(1);
                        }
                        catch (O_ o_7) {
                            throw xx.a(o_7);
                        }
                    }
                    try {
                        try {
                            if (!this.z) break block29;
                            if (!this.R) break block30;
                        }
                        catch (O_ o_8) {
                            throw xx.a(o_8);
                        }
                        this.t.h();
                        this.L.A();
                    }
                    catch (O_ o_9) {
                        throw xx.a(o_9);
                    }
                }
                this.M();
                this.z = this.l(qg2);
                return;
            }
            try {
                if (this.u(qg2)) {
                    this.t.h();
                    return;
                }
            }
            catch (O_ o_10) {
                throw xx.a(o_10);
            }
            try {
                try {
                    try {
                        if (this.R || this.P == null) break block31;
                    }
                    catch (O_ o_11) {
                        throw xx.a(o_11);
                    }
                    if (!this.P.S()) break block31;
                }
                catch (O_ o_12) {
                    throw xx.a(o_12);
                }
                this.R = true;
            }
            catch (O_ o_13) {
                throw xx.a(o_13);
            }
        }
        this.N(qg2);
    }

    private void v(int n2) {
        double[] dArray = this.x.get(this.x.size() - 1);
        this.x.clear();
        try {
            while (this.x.size() != n2) {
                this.x.add(dArray);
            }
        }
        catch (O_ o_2) {
            throw xx.a(o_2);
        }
    }

    private boolean u(Qg qg2) {
        block29: {
            block26: {
                block27: {
                    block28: {
                        boolean bl2;
                        boolean bl3;
                        block25: {
                            block24: {
                                try {
                                    if (!_2.O.z(this.L)) {
                                        this.z = true;
                                        Fp.A();
                                        return true;
                                    }
                                }
                                catch (O_ o_2) {
                                    throw xx.a(o_2);
                                }
                                try {
                                    if (!this.d(qg2)) {
                                        this.z = true;
                                        Fp.D();
                                        return true;
                                    }
                                }
                                catch (O_ o_3) {
                                    throw xx.a(o_3);
                                }
                                bl3 = rT.s(this.V);
                                try {
                                    try {
                                        if (this.O.s().booleanValue() && !cd.A()) break block24;
                                    }
                                    catch (O_ o_4) {
                                        throw xx.a(o_4);
                                    }
                                    bl2 = true;
                                    break block25;
                                }
                                catch (O_ o_5) {
                                    throw xx.a(o_5);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl4 = bl2;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (bl3 && bl4) break block26;
                                        }
                                        catch (O_ o_6) {
                                            throw xx.a(o_6);
                                        }
                                        if (!this.R) break block27;
                                    }
                                    catch (O_ o_7) {
                                        throw xx.a(o_7);
                                    }
                                    if (qg2.M().K()) break block28;
                                }
                                catch (O_ o_8) {
                                    throw xx.a(o_8);
                                }
                                if (this.y(qg2)) break block28;
                            }
                            catch (O_ o_9) {
                                throw xx.a(o_9);
                            }
                            return false;
                        }
                        catch (O_ o_10) {
                            throw xx.a(o_10);
                        }
                    }
                    Fp.D();
                }
                this.z = true;
                return true;
            }
            try {
                try {
                    this.Z = this.L.u(this.Z);
                    if (!this.R || this.L.z(this.Z) < 10) break block29;
                }
                catch (O_ o_11) {
                    throw xx.a(o_11);
                }
                Fp.D();
                this.z = true;
                this.N.m();
                return true;
            }
            catch (O_ o_12) {
                throw xx.a(o_12);
            }
        }
        return false;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "D\u001dcT";
        objectArray[1] = "\u0018h";
        objectArray[2] = Float.TYPE;
        xx.lb[2] = "java/lang/Float";
        objectArray[3] = Integer.TYPE;
        xx.lb[3] = "java/lang/Integer";
        objectArray[4] = "&\r";
        objectArray[5] = Void.TYPE;
        xx.lb[5] = "java/lang/Void";
        objectArray[6] = "\u0018M*";
        objectArray[7] = "w\u001e\u0010$}\u0014|\u0011\u0001k\u0000\fo\u0016\b\"";
        objectArray[8] = "CW\u0001<pQHX\u0010s\u0011_CS\u0014)";
        objectArray[9] = "\u0014F-Iv\u000eR\u001de0&j\u0010\u0015qAqWHAa^OSK\u0011~]\"\fD\u001d\u007f0u\u0005\u0010\u001coZ-\u0007\u0014\u0017\u001d\u000b!\u0006ZE Su\u0016E{&W(\u0015\u001a\u0007%M(\u0013+";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "0IC}L5l\u001dPe,bwy\u0005h\u0017n~\u0013]j\u0013e\fEM{]8`\t@=\u0014\t";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xx.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void O() {
        block13: {
            double[] dArray;
            block14: {
                int n2 = this.x.size() - 1;
                try {
                    while (true) {
                        try {
                            if (n2 < Math.max(0, this.x.size() - 3) || !this.L.L(this.x.get(n2))) break;
                        }
                        catch (O_ o_2) {
                            throw xx.a(o_2);
                        }
                        this.n = null;
                        this.x.remove(n2);
                        --n2;
                    }
                }
                catch (O_ o_3) {
                    throw xx.a(o_3);
                }
                n2 = this.x.size();
                try {
                    if (n2 == 0) {
                        return;
                    }
                }
                catch (O_ o_4) {
                    throw xx.a(o_4);
                }
                dArray = this.m(this.x.get(n2 - 1), n2);
                try {
                    try {
                        if (this.L.O(dArray[0], dArray[1], dArray[2])) break block13;
                        if (n2 != 6) break block14;
                    }
                    catch (O_ o_5) {
                        throw xx.a(o_5);
                    }
                    this.x.clear();
                }
                catch (O_ o_6) {
                    throw xx.a(o_6);
                }
            }
            this.x.add(new double[]{dArray[0], dArray[1], dArray[2]});
            this.L.e();
        }
    }

    @OY
    public void i(pt pt2) {
        this.L.Z();
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (lb[n5] != null) {
            return n5;
        }
        Object object = kb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 33;
                break;
            }
            case 2: {
                n4 = 52;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 37;
                break;
            }
            case 5: {
                n4 = 32;
                break;
            }
            case 6: {
                n4 = 22;
                break;
            }
            case 7: {
                n4 = 9;
                break;
            }
            case 8: {
                n4 = 4;
                break;
            }
            case 9: {
                n4 = 26;
                break;
            }
            case 10: {
                n4 = 61;
                break;
            }
            case 11: {
                n4 = 28;
                break;
            }
            case 12: {
                n4 = 19;
                break;
            }
            case 13: {
                n4 = 8;
                break;
            }
            case 14: {
                n4 = 56;
                break;
            }
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 55;
                break;
            }
            case 18: {
                n4 = 14;
                break;
            }
            case 19: {
                n4 = 57;
                break;
            }
            case 20: {
                n4 = 5;
                break;
            }
            case 21: {
                n4 = 51;
                break;
            }
            case 22: {
                n4 = 29;
                break;
            }
            case 23: {
                n4 = 23;
                break;
            }
            case 24: {
                n4 = 17;
                break;
            }
            case 25: {
                n4 = 45;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 63;
                break;
            }
            case 28: {
                n4 = 42;
                break;
            }
            case 29: {
                n4 = 13;
                break;
            }
            case 30: {
                n4 = 34;
                break;
            }
            case 31: {
                n4 = 58;
                break;
            }
            case 32: {
                n4 = 30;
                break;
            }
            case 33: {
                n4 = 53;
                break;
            }
            case 34: {
                n4 = 10;
                break;
            }
            case 35: {
                n4 = 62;
                break;
            }
            case 36: {
                n4 = 47;
                break;
            }
            case 37: {
                n4 = 41;
                break;
            }
            case 38: {
                n4 = 43;
                break;
            }
            case 39: {
                n4 = 2;
                break;
            }
            case 40: {
                n4 = 15;
                break;
            }
            case 41: {
                n4 = 44;
                break;
            }
            case 42: {
                n4 = 25;
                break;
            }
            case 43: {
                n4 = 1;
                break;
            }
            case 44: {
                n4 = 6;
                break;
            }
            case 45: {
                n4 = 49;
                break;
            }
            case 46: {
                n4 = 7;
                break;
            }
            case 47: {
                n4 = 3;
                break;
            }
            case 48: {
                n4 = 35;
                break;
            }
            case 49: {
                n4 = 46;
                break;
            }
            case 50: {
                n4 = 36;
                break;
            }
            case 51: {
                n4 = 16;
                break;
            }
            case 52: {
                n4 = 54;
                break;
            }
            case 53: {
                n4 = 31;
                break;
            }
            case 54: {
                n4 = 0;
                break;
            }
            case 55: {
                n4 = 48;
                break;
            }
            case 56: {
                n4 = 60;
                break;
            }
            case 57: {
                n4 = 11;
                break;
            }
            case 58: {
                n4 = 12;
                break;
            }
            case 59: {
                n4 = 24;
                break;
            }
            case 60: {
                n4 = 59;
                break;
            }
            case 61: {
                n4 = 20;
                break;
            }
            case 62: {
                n4 = 18;
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
        xx.lb[n5] = new String(cArray);
        return n5;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

