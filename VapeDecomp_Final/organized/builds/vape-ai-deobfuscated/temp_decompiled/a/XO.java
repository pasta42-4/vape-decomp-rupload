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
import a.Ya;
import a._2;
import a._Y;
import a.au;
import a.d8;
import a.jF;
import a.js;
import a.kX;
import a.oQ;
import a.oV;
import a.on;
import a.pt;
import a.rT;
import a.sy;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xo
extends x4<Ay> {
    x5 K;
    private boolean N;
    private boolean l;
    private V4 t;
    private Bg x;
    au xC;
    private Bg z;
    private double[] R;
    float[] x3;
    private boolean h;
    private final tU G;
    boolean xQ;
    private ArrayList<Integer> n;
    private final js A;
    private static final Object[] kb;
    private static final Map hb;
    private static final long bb;
    ArrayList<Integer> xr;
    private final tU xy;
    private int d;
    private double[] Z;
    private boolean e;
    Ay L;
    private int r;
    private static final Integer[] gb;
    private int xv;
    private boolean j;
    private boolean v;
    private boolean xb;
    private static final String[] lb;
    private boolean Y;
    private static final long[] fb;
    private final tU o;
    private boolean V;
    private boolean T;
    private int P;
    private int m;
    private double[] O;
    private boolean B;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void E(Qg qg2) {
        block19: {
            try {
                if (this.d != 0) break block19;
                this.x3 = new float[]{qg2.q(), 90.0f};
                return;
            }
            catch (O_ o_2) {
                throw xo.a(o_2);
            }
        }
        if (this.d < 5) {
            float[] fArray = this.x3;
            try {
                block20: {
                    try {
                        try {
                            try {
                                this.x3 = this.Q(qg2, this.r(this.Z, this.d, this.T), this.d);
                                if (this.L.R == null || fArray == null) break block20;
                            }
                            catch (O_ o_3) {
                                throw xo.a(o_3);
                            }
                            if (fArray[0] != this.x3[0]) break block20;
                        }
                        catch (O_ o_4) {
                            throw xo.a(o_4);
                        }
                        if (fArray[1] == this.x3[1]) return;
                    }
                    catch (O_ o_5) {
                        throw xo.a(o_5);
                    }
                }
                this.L.b(this.x3, this.t(this.x3, 15));
                return;
            }
            catch (O_ o_6) {
                throw xo.a(o_6);
            }
        }
        float[] fArray = this.x3;
        try {
            block21: {
                try {
                    try {
                        try {
                            this.x3 = this.n(qg2, this.T);
                            if (this.L.R == null || fArray == null) break block21;
                        }
                        catch (O_ o_7) {
                            throw xo.a(o_7);
                        }
                        if (fArray[0] != this.x3[0]) break block21;
                    }
                    catch (O_ o_8) {
                        throw xo.a(o_8);
                    }
                    if (fArray[1] == this.x3[1]) return;
                }
                catch (O_ o_9) {
                    throw xo.a(o_9);
                }
            }
            this.L.b(this.x3, this.t(this.x3, 15));
            return;
        }
        catch (O_ o_10) {
            throw xo.a(o_10);
        }
    }

    private double[] r(double[] dArray, int n2, boolean bl2) {
        double d2;
        double d3;
        block30: {
            block31: {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block24: {
                                    block25: {
                                        block22: {
                                            block23: {
                                                block20: {
                                                    block21: {
                                                        block18: {
                                                            block19: {
                                                                block16: {
                                                                    block17: {
                                                                        d3 = dArray[0];
                                                                        d2 = dArray[1];
                                                                        try {
                                                                            if (n2 != 1) break block16;
                                                                            if (!bl2) break block17;
                                                                        }
                                                                        catch (O_ o_2) {
                                                                            throw xo.a(o_2);
                                                                        }
                                                                        d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.65)).doubleValue();
                                                                        d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.35)).doubleValue();
                                                                        break block30;
                                                                    }
                                                                    d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.35)).doubleValue();
                                                                    d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.65)).doubleValue();
                                                                    break block30;
                                                                }
                                                                try {
                                                                    if (n2 != 2) break block18;
                                                                    if (!bl2) break block19;
                                                                }
                                                                catch (O_ o_3) {
                                                                    throw xo.a(o_3);
                                                                }
                                                                d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.65)).doubleValue();
                                                                d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.65)).doubleValue();
                                                                break block30;
                                                            }
                                                            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.35)).doubleValue();
                                                            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.35)).doubleValue();
                                                            break block30;
                                                        }
                                                        try {
                                                            if (n2 != 3) break block20;
                                                            if (!bl2) break block21;
                                                        }
                                                        catch (O_ o_4) {
                                                            throw xo.a(o_4);
                                                        }
                                                        d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.35)).doubleValue();
                                                        d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.65)).doubleValue();
                                                        break block30;
                                                    }
                                                    d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.65)).doubleValue();
                                                    d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.35)).doubleValue();
                                                    break block30;
                                                }
                                                try {
                                                    if (n2 != 4) break block22;
                                                    if (!bl2) break block23;
                                                }
                                                catch (O_ o_5) {
                                                    throw xo.a(o_5);
                                                }
                                                d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.35)).doubleValue();
                                                d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.35)).doubleValue();
                                                break block30;
                                            }
                                            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.65)).doubleValue();
                                            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.65)).doubleValue();
                                            break block30;
                                        }
                                        try {
                                            if (n2 != 6) break block24;
                                            if (!bl2) break block25;
                                        }
                                        catch (O_ o_6) {
                                            throw xo.a(o_6);
                                        }
                                        d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.8)).doubleValue();
                                        d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.8)).doubleValue();
                                        break block30;
                                    }
                                    d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.8)).doubleValue();
                                    d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.2)).doubleValue();
                                    break block30;
                                }
                                try {
                                    if (n2 != 8) break block26;
                                    if (!bl2) break block27;
                                }
                                catch (O_ o_7) {
                                    throw xo.a(o_7);
                                }
                                d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.2)).doubleValue();
                                d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.2)).doubleValue();
                                break block30;
                            }
                            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.2)).doubleValue();
                            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.8)).doubleValue();
                            break block30;
                        }
                        try {
                            if (n2 != 7) break block28;
                            if (!bl2) break block29;
                        }
                        catch (O_ o_8) {
                            throw xo.a(o_8);
                        }
                        d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.2)).doubleValue();
                        d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.8)).doubleValue();
                        break block30;
                    }
                    d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.8)).doubleValue();
                    d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.8)).doubleValue();
                    break block30;
                }
                try {
                    if (n2 != 5) break block30;
                    if (!bl2) break block31;
                }
                catch (O_ o_9) {
                    throw xo.a(o_9);
                }
                d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.8)).doubleValue();
                d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.2)).doubleValue();
                break block30;
            }
            d3 = new BigDecimal(String.valueOf((double)sy.Q(d3) + 0.2)).doubleValue();
            d2 = new BigDecimal(String.valueOf((double)sy.Q(d2) + 0.2)).doubleValue();
        }
        return new double[]{d3, d2};
    }

    private void b(Qg qg2) {
        block19: {
            block21: {
                block22: {
                    boolean bl2;
                    block18: {
                        block20: {
                            boolean bl3;
                            try {
                                if (EP.X().M() == null) {
                                    Ji.l();
                                }
                            }
                            catch (O_ o_2) {
                                throw xo.a(o_2);
                            }
                            boolean bl4 = this.v(qg2, this.d);
                            try {
                                bl3 = this.d < 5;
                            }
                            catch (O_ o_3) {
                                throw xo.a(o_3);
                            }
                            bl2 = bl3;
                            try {
                                if (!bl4) {
                                    this.x.m();
                                }
                            }
                            catch (O_ o_4) {
                                throw xo.a(o_4);
                            }
                            try {
                                try {
                                    try {
                                        this.xb = bl4;
                                        if (!bl4) break block18;
                                        Fp.d(this.xy, false);
                                        Fp.d(this.o, false);
                                        Fp.d(this.G, false);
                                        if (bl2) break block19;
                                    }
                                    catch (O_ o_5) {
                                        throw xo.a(o_5);
                                    }
                                    if (!this.T) break block20;
                                }
                                catch (O_ o_6) {
                                    throw xo.a(o_6);
                                }
                                Fp.d(this.G, false);
                                break block19;
                            }
                            catch (O_ o_7) {
                                throw xo.a(o_7);
                            }
                        }
                        Fp.d(this.o, false);
                        break block19;
                    }
                    try {
                        try {
                            Fp.d(this.xy, true);
                            if (bl2) break block21;
                            if (!this.T) break block22;
                        }
                        catch (O_ o_8) {
                            throw xo.a(o_8);
                        }
                        Fp.d(this.G, true);
                        break block19;
                    }
                    catch (O_ o_9) {
                        throw xo.a(o_9);
                    }
                }
                Fp.d(this.o, true);
                break block19;
            }
            Fp.d(this.o, false);
            Fp.d(this.G, false);
        }
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = " \f?";
        objectArray[1] = Integer.TYPE;
        xo.lb[1] = "java/lang/Integer";
        objectArray[2] = "\rpq5\u000bS\u0006\u007f`zvK\u0015xi3";
        objectArray[3] = "a,PLp&j#A\u0003\u0011(a(EY";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "3m\\{Ar:m\u001d\u0016\u0013bW(@g\u001b'<hE.x *(O(\u0016x*7P\u0016";
    }

    public boolean X(Qg qg2) {
        boolean bl2;
        int n2;
        block16: {
            boolean bl3;
            block18: {
                block17: {
                    on on2;
                    block14: {
                        on2 = XO.b.m();
                        try {
                            try {
                                if (!on2.Y() && on2.q().equals(oV.Y())) break block14;
                            }
                            catch (O_ o_2) {
                                throw xo.a(o_2);
                            }
                            return false;
                        }
                        catch (O_ o_3) {
                            throw xo.a(o_3);
                        }
                    }
                    n2 = on2.j();
                    double d2 = qg2.x();
                    try {
                        try {
                            block15: {
                                try {
                                    try {
                                        if (d2 > 0.1 || d2 < -0.1) break block15;
                                    }
                                    catch (O_ o_4) {
                                        throw xo.a(o_4);
                                    }
                                    if (!this.v) break block16;
                                }
                                catch (O_ o_5) {
                                    throw xo.a(o_5);
                                }
                            }
                            if (n2 == 0) break block17;
                        }
                        catch (O_ o_6) {
                            throw xo.a(o_6);
                        }
                        bl3 = true;
                        break block18;
                    }
                    catch (O_ o_7) {
                        throw xo.a(o_7);
                    }
                }
                bl3 = false;
            }
            return bl3;
        }
        try {
            bl2 = n2 > 1;
        }
        catch (O_ o_8) {
            throw xo.a(o_8);
        }
        return bl2;
    }

    @OY
    public void L(pt pt2) {
        this.L.Z();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xo.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean A() {
        block10: {
            block12: {
                block11: {
                    try {
                        try {
                            try {
                                try {
                                    if (this.xC == null) break block10;
                                    if (this.xC.S()) break block11;
                                }
                                catch (O_ o_2) {
                                    throw xo.a(o_2);
                                }
                                if (this.m >= this.r) break block11;
                            }
                            catch (O_ o_3) {
                                throw xo.a(o_3);
                            }
                            ++this.m;
                            if (!this.h) break block10;
                        }
                        catch (O_ o_4) {
                            throw xo.a(o_4);
                        }
                        return true;
                    }
                    catch (O_ o_5) {
                        throw xo.a(o_5);
                    }
                }
                try {
                    if (!this.xC.S()) break block12;
                    this.m = 0;
                    this.h = false;
                    break block10;
                }
                catch (O_ o_6) {
                    throw xo.a(o_6);
                }
            }
            this.xC.g(true);
            this.L.P();
            this.xC = null;
            this.m = 0;
            this.h = false;
            return true;
        }
        return false;
    }

    @OY
    public void N(Kb kb2) {
        try {
            if (EP.U().Y()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        try {
            if (this.xQ) {
                this.K.S(kb2);
            }
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
    }

    public float[] Q(Qg qg2, double[] dArray, int n2) {
        float f10;
        float[] fArray;
        float f11 = 0.1f * this.D(dArray, new double[]{qg2.F(), qg2.B()}, n2);
        float f12 = n2 == 1 ? 135.0f - f11 : (n2 == 2 ? -135.0f - f11 : (n2 == 3 ? -45.0f - f11 : 45.0f - f11));
        try {
            float[] fArray2 = new float[2];
            fArray2[0] = f12;
            float[] fArray3 = fArray2;
            fArray = fArray2;
            int n3 = 1;
            f10 = this.x.d() > 500L ? 83.0f : 81.0f;
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        fArray3[n3] = f10;
        return fArray;
    }

    private boolean w(Qg qg2) {
        block10: {
            int n2;
            block11: {
                n2 = this.L.l();
                try {
                    if (n2 == -1) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw xo.a(o_2);
                }
                try {
                    if (this.t == null || qg2.a().equals(this.t)) break block10;
                }
                catch (O_ o_3) {
                    throw xo.a(o_3);
                }
                int n3 = this.L.Z(qg2, this.t);
                try {
                    if (n3 == -1) break block11;
                    this.L.Q(n3);
                    break block10;
                }
                catch (O_ o_4) {
                    throw xo.a(o_4);
                }
            }
            try {
                if (qg2.l().v() != n2) {
                    this.L.Q(n2);
                }
            }
            catch (O_ o_5) {
                throw xo.a(o_5);
            }
        }
        return true;
    }

    private void N() {
        long l10 = bb ^ 0x1DEAAAD0F88DL;
        this.xQ = true;
        this.Z = null;
        this.xC = null;
        this.m = 0;
        this.x3 = null;
        this.j = false;
        this.N = false;
        this.e = false;
        this.v = false;
        this.xb = true;
        this.d = 0;
        this.P = 0;
        this.n = new ArrayList();
        this.r = (int)xo.a("k", (int)14957, (long)(0x1047AE80AE7A18FAL ^ l10));
        this.t = null;
        this.B = false;
        this.Y = true;
        _2.l.m(this);
        _2.i.Z();
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

    private void d(double[] dArray, boolean bl2, boolean bl3, boolean bl4, int n2) {
        this.xC = new au(dArray[0], dArray[1]);
        this.h = bl2;
        this.xC.b(bl3);
        this.xC.r(bl4);
        G2.c.N(this.xC);
        this.m = 0;
        this.r = n2;
    }

    public double[] K(int n2) {
        try {
            if (n2 == 6) {
                return new double[]{135.0, 45.0};
            }
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        try {
            if (n2 == 8) {
                return new double[]{315.0, 225.0};
            }
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
        try {
            if (n2 == 7) {
                return new double[]{225.0, 135.0};
            }
        }
        catch (O_ o_4) {
            throw xo.a(o_4);
        }
        try {
            if (n2 == 5) {
                return new double[]{45.0, 315.0};
            }
        }
        catch (O_ o_5) {
            throw xo.a(o_5);
        }
        return new double[0];
    }

    /*
     * Unable to fully structure code
     */
    private boolean q(Qg var1_1) {
        block127: {
            block100: {
                block122: {
                    block114: {
                        block121: {
                            block120: {
                                block115: {
                                    block119: {
                                        block118: {
                                            block117: {
                                                block110: {
                                                    block113: {
                                                        block112: {
                                                            block111: {
                                                                block133: {
                                                                    block109: {
                                                                        block108: {
                                                                            block107: {
                                                                                block106: {
                                                                                    block101: {
                                                                                        block105: {
                                                                                            block104: {
                                                                                                block103: {
                                                                                                    block102: {
                                                                                                        block98: {
                                                                                                            block132: {
                                                                                                                block99: {
                                                                                                                    try {
                                                                                                                        if (EP.X().M() == null) {
                                                                                                                            Ji.l();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (O_ v0) {
                                                                                                                        throw xo.a(v0);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (this.xC == null || !this.xC.S()) break block98;
                                                                                                                            }
                                                                                                                            catch (O_ v1) {
                                                                                                                                throw xo.a(v1);
                                                                                                                            }
                                                                                                                            if (!this.v) break block98;
                                                                                                                        }
                                                                                                                        catch (O_ v2) {
                                                                                                                            throw xo.a(v2);
                                                                                                                        }
                                                                                                                        this.xb = true;
                                                                                                                        this.xC = null;
                                                                                                                        this.Z = this.O;
                                                                                                                        this.d = this.P;
                                                                                                                        this.T = this.B;
                                                                                                                        this.v = false;
                                                                                                                        this.e = false;
                                                                                                                        Fp.N();
                                                                                                                        this.x.m();
                                                                                                                        this.z.m();
                                                                                                                        if (this.d >= 5) break block99;
                                                                                                                    }
                                                                                                                    catch (O_ v3) {
                                                                                                                        throw xo.a(v3);
                                                                                                                    }
                                                                                                                    var2_2 = this.Q(var1_1, this.r(this.Z, this.d, this.T), this.d);
                                                                                                                    this.q(var2_2, this.t(var2_2, 15));
                                                                                                                    break block132;
                                                                                                                }
                                                                                                                var2_3 = this.n(var1_1, this.T);
                                                                                                                this.q(var2_3, this.t(var2_3, 12));
                                                                                                            }
                                                                                                            this.V = true;
                                                                                                            return true;
                                                                                                        }
                                                                                                        var2_4 = rT.s(EP.N().y());
                                                                                                        var3_5 = rT.s(EP.N().h());
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (this.v) break block100;
                                                                                                                        if (!this.Y) break block101;
                                                                                                                    }
                                                                                                                    catch (O_ v4) {
                                                                                                                        throw xo.a(v4);
                                                                                                                    }
                                                                                                                    if (!var2_4) break block102;
                                                                                                                }
                                                                                                                catch (O_ v5) {
                                                                                                                    throw xo.a(v5);
                                                                                                                }
                                                                                                                if (this.j) break block102;
                                                                                                            }
                                                                                                            catch (O_ v6) {
                                                                                                                throw xo.a(v6);
                                                                                                            }
                                                                                                            v7 = true;
                                                                                                            break block103;
                                                                                                        }
                                                                                                        catch (O_ v8) {
                                                                                                            throw xo.a(v8);
                                                                                                        }
                                                                                                    }
                                                                                                    v7 = false;
                                                                                                }
                                                                                                var4_6 = v7;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!var3_5 || this.N) break block104;
                                                                                                    }
                                                                                                    catch (O_ v9) {
                                                                                                        throw xo.a(v9);
                                                                                                    }
                                                                                                    v10 = true;
                                                                                                    break block105;
                                                                                                }
                                                                                                catch (O_ v11) {
                                                                                                    throw xo.a(v11);
                                                                                                }
                                                                                            }
                                                                                            v10 = false;
                                                                                        }
                                                                                        var5_8 = v10;
                                                                                        break block133;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var2_4 || !this.j) break block106;
                                                                                        }
                                                                                        catch (O_ v12) {
                                                                                            throw xo.a(v12);
                                                                                        }
                                                                                        v13 = true;
                                                                                        break block107;
                                                                                    }
                                                                                    catch (O_ v14) {
                                                                                        throw xo.a(v14);
                                                                                    }
                                                                                }
                                                                                v13 = false;
                                                                            }
                                                                            var4_6 = v13;
                                                                            try {
                                                                                try {
                                                                                    if (var3_5 || !this.N) break block108;
                                                                                }
                                                                                catch (O_ v15) {
                                                                                    throw xo.a(v15);
                                                                                }
                                                                                v16 = true;
                                                                                break block109;
                                                                            }
                                                                            catch (O_ v17) {
                                                                                throw xo.a(v17);
                                                                            }
                                                                        }
                                                                        v16 = false;
                                                                    }
                                                                    var5_8 = v16;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                this.j = var2_4;
                                                                                this.N = var3_5;
                                                                                if (!this.Y || !this.z.m(0L)) break block110;
                                                                            }
                                                                            catch (O_ v18) {
                                                                                throw xo.a(v18);
                                                                            }
                                                                            v19 = this;
                                                                            if (var4_6) break block111;
                                                                        }
                                                                        catch (O_ v20) {
                                                                            throw xo.a(v20);
                                                                        }
                                                                        if (var5_8) break block111;
                                                                    }
                                                                    catch (O_ v21) {
                                                                        throw xo.a(v21);
                                                                    }
                                                                    v22 = true;
                                                                    break block112;
                                                                }
                                                                catch (O_ v23) {
                                                                    throw xo.a(v23);
                                                                }
                                                            }
                                                            v22 = false;
                                                        }
                                                        try {
                                                            v19.Y = v22;
                                                            if (!var4_6) break block113;
                                                            this.P = this.m(this.d, 1);
                                                            break block114;
                                                        }
                                                        catch (O_ v24) {
                                                            throw xo.a(v24);
                                                        }
                                                    }
                                                    try {
                                                        if (!var5_8) ** GOTO lbl206
                                                        this.P = this.m(this.d, -1);
                                                    }
                                                    catch (O_ v25) {
                                                        throw xo.a(v25);
                                                    }
                                                }
                                                try {
                                                    block116: {
                                                        try {
                                                            try {
                                                                if (this.Y) break block115;
                                                                v26 = this;
                                                                if (var4_6) break block116;
                                                            }
                                                            catch (O_ v27) {
                                                                throw xo.a(v27);
                                                            }
                                                            if (!var5_8) break block117;
                                                        }
                                                        catch (O_ v28) {
                                                            throw xo.a(v28);
                                                        }
                                                    }
                                                    v29 = true;
                                                    break block118;
                                                }
                                                catch (O_ v30) {
                                                    throw xo.a(v30);
                                                }
                                            }
                                            v29 = false;
                                        }
                                        try {
                                            v26.Y = v29;
                                            if (!var4_6) break block119;
                                            this.P = this.m(this.d, -1);
                                            break block114;
                                        }
                                        catch (O_ v31) {
                                            throw xo.a(v31);
                                        }
                                    }
                                    try {
                                        if (!var5_8) ** GOTO lbl206
                                        this.P = this.m(this.d, 1);
                                    }
                                    catch (O_ v32) {
                                        throw xo.a(v32);
                                    }
                                }
                                try {
                                    if (!var2_4) break block120;
                                    Fp.d(this.o, false);
                                    break block121;
                                }
                                catch (O_ v33) {
                                    throw xo.a(v33);
                                }
                            }
                            try {
                                if (var3_5) {
                                    Fp.d(this.G, false);
                                }
                            }
                            catch (O_ v34) {
                                throw xo.a(v34);
                            }
                        }
                        return false;
                    }
                    try {
                        try {
                            v35 = this;
                            if (!var4_6 && !var5_8) break block122;
                        }
                        catch (O_ v36) {
                            throw xo.a(v36);
                        }
                        v37 = true;
                        break block100;
                    }
                    catch (O_ v38) {
                        throw xo.a(v38);
                    }
                }
                v37 = v35.v = false;
            }
            if (this.v) {
                block131: {
                    block129: {
                        block130: {
                            block123: {
                                block128: {
                                    block126: {
                                        this.xC = null;
                                        var4_7 = new double[]{sy.Q(var1_1.F()), this.L.h(var1_1), sy.Q(var1_1.B())};
                                        try {
                                            block125: {
                                                try {
                                                    try {
                                                        try {
                                                            block124: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (this.L.L(var4_7) || this.x(var1_1)) break block123;
                                                                                }
                                                                                catch (O_ v39) {
                                                                                    throw xo.a(v39);
                                                                                }
                                                                                if (this.m(var1_1, this.d)) break block123;
                                                                            }
                                                                            catch (O_ v40) {
                                                                                throw xo.a(v40);
                                                                            }
                                                                            this.B = this.S(var1_1, this.P);
                                                                            this.O = this.r(new double[]{var4_7[0], var4_7[2]}, this.P, this.B);
                                                                            this.L.A();
                                                                            if (this.d <= 4) break block124;
                                                                        }
                                                                        catch (O_ v41) {
                                                                            throw xo.a(v41);
                                                                        }
                                                                        if (this.T) break block124;
                                                                    }
                                                                    catch (O_ v42) {
                                                                        throw xo.a(v42);
                                                                    }
                                                                    if (this.P == this.m(this.d, -1)) break block125;
                                                                }
                                                                catch (O_ v43) {
                                                                    throw xo.a(v43);
                                                                }
                                                            }
                                                            if (this.d <= 4) break block126;
                                                        }
                                                        catch (O_ v44) {
                                                            throw xo.a(v44);
                                                        }
                                                        if (!this.T) break block126;
                                                    }
                                                    catch (O_ v45) {
                                                        throw xo.a(v45);
                                                    }
                                                    if (this.P != this.m(this.d, 1)) break block126;
                                                }
                                                catch (O_ v46) {
                                                    throw xo.a(v46);
                                                }
                                            }
                                            this.xC = new au(0.0, 0.0);
                                            this.xC.g(true);
                                            break block127;
                                        }
                                        catch (O_ v47) {
                                            throw xo.a(v47);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!(Math.abs(var1_1.F() - this.O[0]) > 0.15) && !(Math.abs(var1_1.B() - this.O[1]) > 0.15)) break block128;
                                        }
                                        catch (O_ v48) {
                                            throw xo.a(v48);
                                        }
                                        this.W(this.O, true, false, 40);
                                        break block127;
                                    }
                                    catch (O_ v49) {
                                        throw xo.a(v49);
                                    }
                                }
                                this.xC = new au(0.0, 0.0);
                                this.xC.g(true);
                                break block127;
                            }
                            try {
                                try {
                                    try {
                                        if (this.T) break block129;
                                        if (!var2_4) break block130;
                                    }
                                    catch (O_ v50) {
                                        throw xo.a(v50);
                                    }
                                    if (!this.v(var1_1, this.d)) break block130;
                                }
                                catch (O_ v51) {
                                    throw xo.a(v51);
                                }
                                Fp.d(this.o, false);
                                break block127;
                            }
                            catch (O_ v52) {
                                throw xo.a(v52);
                            }
                        }
                        try {
                            if (!var3_5) ** GOTO lbl332
                            Fp.d(this.G, false);
                        }
                        catch (O_ v53) {
                            throw xo.a(v53);
                        }
                    }
                    try {
                        try {
                            if (!var3_5 || !this.v(var1_1, this.d)) break block131;
                        }
                        catch (O_ v54) {
                            throw xo.a(v54);
                        }
                        Fp.d(this.G, false);
                        break block127;
                    }
                    catch (O_ v55) {
                        throw xo.a(v55);
                    }
                }
                try {
                    if (var2_4) {
                        Fp.d(this.o, false);
                    }
                }
                catch (O_ v56) {
                    throw xo.a(v56);
                }
            }
        }
        return false;
    }

    private static Method d(long l10, long l11) {
        int n2 = xo.a(l10, l11);
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
                clazz3 = xo.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xo.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xo.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xo.kb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xo.b(270099386041331L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xo.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xo.kb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xo.b(270099386041331L, 0L);
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

    private void W(double[] dArray, boolean bl2, boolean bl3, int n2) {
        this.xC = new au(dArray[0], dArray[1]);
        this.h = bl2;
        this.xC.b(bl3);
        G2.c.N(this.xC);
        this.m = 0;
        this.r = n2;
    }

    @Override
    public void h() {
        this.xQ = true;
    }

    @OY
    public void A(KB kB2) {
        Qg qg2;
        block35: {
            block37: {
                block34: {
                    block33: {
                        block32: {
                            try {
                                try {
                                    if (!EP.U().Y() && !EP.c().Y()) break block32;
                                }
                                catch (O_ o_2) {
                                    throw xo.a(o_2);
                                }
                                return;
                            }
                            catch (O_ o_3) {
                                throw xo.a(o_3);
                            }
                        }
                        qg2 = EP.U();
                        try {
                            try {
                                if (this.xQ || !this.X(qg2)) break block33;
                            }
                            catch (O_ o_4) {
                                throw xo.a(o_4);
                            }
                            EP.N().D().X(1);
                        }
                        catch (O_ o_5) {
                            throw xo.a(o_5);
                        }
                    }
                    try {
                        try {
                            try {
                                if (this.xQ || this.V) break block34;
                            }
                            catch (O_ o_6) {
                                throw xo.a(o_6);
                            }
                            if (this.h) break block34;
                        }
                        catch (O_ o_7) {
                            throw xo.a(o_7);
                        }
                        this.b(qg2);
                    }
                    catch (O_ o_8) {
                        throw xo.a(o_8);
                    }
                }
                try {
                    block36: {
                        try {
                            try {
                                if (!this.xQ) break block35;
                                if (this.xC != null) break block36;
                            }
                            catch (O_ o_9) {
                                throw xo.a(o_9);
                            }
                            if (this.x3 == null) break block37;
                        }
                        catch (O_ o_10) {
                            throw xo.a(o_10);
                        }
                    }
                    this.L.A();
                    this.K.h();
                }
                catch (O_ o_11) {
                    throw xo.a(o_11);
                }
            }
            this.N();
            this.xQ = this.c(qg2);
            _2.l.m(this);
            _2.i.Z();
            return;
        }
        try {
            _2.l.E(this);
            _2.i.I();
            if (this.W(qg2)) {
                this.L.e();
                this.K.h();
                _2.l.m(this);
                _2.i.Z();
                return;
            }
        }
        catch (O_ o_12) {
            throw xo.a(o_12);
        }
        try {
            if (this.S()) {
                return;
            }
        }
        catch (O_ o_13) {
            throw xo.a(o_13);
        }
        try {
            if (this.q(qg2)) {
                return;
            }
        }
        catch (O_ o_14) {
            throw xo.a(o_14);
        }
        try {
            if (this.Q(qg2)) {
                return;
            }
        }
        catch (O_ o_15) {
            throw xo.a(o_15);
        }
        this.E(qg2);
        float f10 = Math.abs(qg2.q());
        this.b(qg2);
    }

    private boolean m(Qg qg2, int n2) {
        block53: {
            boolean bl2;
            block55: {
                block54: {
                    double d2;
                    double d3;
                    block50: {
                        boolean bl3;
                        block52: {
                            block51: {
                                block47: {
                                    boolean bl4;
                                    block49: {
                                        block48: {
                                            double d4;
                                            double d5;
                                            block44: {
                                                boolean bl5;
                                                block46: {
                                                    block45: {
                                                        block41: {
                                                            boolean bl6;
                                                            block43: {
                                                                block42: {
                                                                    block38: {
                                                                        boolean bl7;
                                                                        block40: {
                                                                            block39: {
                                                                                block35: {
                                                                                    boolean bl8;
                                                                                    block37: {
                                                                                        block36: {
                                                                                            block32: {
                                                                                                boolean bl9;
                                                                                                block34: {
                                                                                                    block33: {
                                                                                                        d5 = qg2.F();
                                                                                                        d3 = qg2.B();
                                                                                                        d4 = sy.Q(d5);
                                                                                                        d2 = sy.Q(d3);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (n2 != 1) break block32;
                                                                                                                if (!(d5 - d4 + (d3 - d2) > 1.0)) break block33;
                                                                                                            }
                                                                                                            catch (O_ o_2) {
                                                                                                                throw xo.a(o_2);
                                                                                                            }
                                                                                                            bl9 = true;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        catch (O_ o_3) {
                                                                                                            throw xo.a(o_3);
                                                                                                        }
                                                                                                    }
                                                                                                    bl9 = false;
                                                                                                }
                                                                                                return bl9;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (n2 != 2) break block35;
                                                                                                    if (!(d4 - d5 + (d3 - d2) > 1.0)) break block36;
                                                                                                }
                                                                                                catch (O_ o_4) {
                                                                                                    throw xo.a(o_4);
                                                                                                }
                                                                                                bl8 = true;
                                                                                                break block37;
                                                                                            }
                                                                                            catch (O_ o_5) {
                                                                                                throw xo.a(o_5);
                                                                                            }
                                                                                        }
                                                                                        bl8 = false;
                                                                                    }
                                                                                    return bl8;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (n2 != 3) break block38;
                                                                                        if (!(d4 - d5 + (d2 - d3) > 1.0)) break block39;
                                                                                    }
                                                                                    catch (O_ o_6) {
                                                                                        throw xo.a(o_6);
                                                                                    }
                                                                                    bl7 = true;
                                                                                    break block40;
                                                                                }
                                                                                catch (O_ o_7) {
                                                                                    throw xo.a(o_7);
                                                                                }
                                                                            }
                                                                            bl7 = false;
                                                                        }
                                                                        return bl7;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (n2 != 4) break block41;
                                                                            if (!(d5 - d4 + (d2 - d3) > 1.0)) break block42;
                                                                        }
                                                                        catch (O_ o_8) {
                                                                            throw xo.a(o_8);
                                                                        }
                                                                        bl6 = true;
                                                                        break block43;
                                                                    }
                                                                    catch (O_ o_9) {
                                                                        throw xo.a(o_9);
                                                                    }
                                                                }
                                                                bl6 = false;
                                                            }
                                                            return bl6;
                                                        }
                                                        try {
                                                            try {
                                                                if (n2 != 6) break block44;
                                                                if (!(d5 - d4 > 0.5)) break block45;
                                                            }
                                                            catch (O_ o_10) {
                                                                throw xo.a(o_10);
                                                            }
                                                            bl5 = true;
                                                            break block46;
                                                        }
                                                        catch (O_ o_11) {
                                                            throw xo.a(o_11);
                                                        }
                                                    }
                                                    bl5 = false;
                                                }
                                                return bl5;
                                            }
                                            try {
                                                try {
                                                    if (n2 != 8) break block47;
                                                    if (!(d4 - d5 > 0.5)) break block48;
                                                }
                                                catch (O_ o_12) {
                                                    throw xo.a(o_12);
                                                }
                                                bl4 = true;
                                                break block49;
                                            }
                                            catch (O_ o_13) {
                                                throw xo.a(o_13);
                                            }
                                        }
                                        bl4 = false;
                                    }
                                    return bl4;
                                }
                                try {
                                    try {
                                        if (n2 != 7) break block50;
                                        if (!(d3 - d2 > 0.5)) break block51;
                                    }
                                    catch (O_ o_14) {
                                        throw xo.a(o_14);
                                    }
                                    bl3 = true;
                                    break block52;
                                }
                                catch (O_ o_15) {
                                    throw xo.a(o_15);
                                }
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    try {
                        try {
                            if (n2 != 5) break block53;
                            if (!(d2 - d3 > 0.5)) break block54;
                        }
                        catch (O_ o_16) {
                            throw xo.a(o_16);
                        }
                        bl2 = true;
                        break block55;
                    }
                    catch (O_ o_17) {
                        throw xo.a(o_17);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x839;
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
                throw new RuntimeException("a/xo", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xo.gb[n3] = n4;
        }
        return gb[n3];
    }

    private float[] n(Qg qg2, boolean bl2) {
        int n2;
        float[] fArray;
        double d2;
        double d3 = qg2.q();
        double d4 = qg2.f();
        double d5 = qg2.n();
        double d6 = d3;
        double d7 = d3;
        if (this.d == 6) {
            d6 = 135.0 + 20.0 * (this.Z[1] - d5);
            d7 = 45.0 + 20.0 * (this.Z[1] - d5);
        } else if (this.d == 8) {
            d6 = -45.0 - 20.0 * (this.Z[1] - d5);
            d7 = -135.0 - 20.0 * (this.Z[1] - d5);
        } else if (this.d == 7) {
            d6 = -135.0 - 20.0 * (this.Z[0] - d4);
            d7 = 135.0 + 20.0 * (d4 - this.Z[0]);
        } else if (this.d == 5) {
            d6 = 45.0 + 20.0 * (this.Z[0] - d4);
            d7 = -45.0 - 20.0 * (d4 - this.Z[0]);
        }
        try {
            d2 = bl2 ? d6 : d7;
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        d3 = d2;
        try {
            float[] fArray2 = new float[2];
            fArray2[0] = (float)d3;
            float[] fArray3 = fArray2;
            fArray = fArray2;
            int n3 = 1;
            n2 = this.x.m(300L) ? 80 : 78;
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
        fArray3[n3] = n2;
        return fArray;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d5' || c10 == 'T' || c10 == 'b' || c10 == '\u00d0') {
                field = xo.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xo.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean m(Qg qg2) {
        boolean bl2;
        double d2 = qg2.F();
        double d3 = qg2.B();
        if (this.d == 1) {
            d2 += 0.2;
            d3 += 0.2;
        } else if (this.d == 2) {
            d2 -= 0.2;
            d3 += 0.2;
        } else if (this.d == 3) {
            d2 -= 0.2;
            d3 -= 0.2;
        } else if (this.d == 4) {
            d2 += 0.2;
            d3 -= 0.2;
        } else if (this.d == 6) {
            d2 += 0.25;
            d3 = this.Z[1];
        } else if (this.d == 8) {
            d2 -= 0.25;
            d3 = this.Z[1];
        } else if (this.d == 7) {
            d2 = this.Z[0];
            d3 += 0.25;
        } else if (this.d == 5) {
            d2 = this.Z[0];
            d3 -= 0.25;
        } else {
            return true;
        }
        d2 = sy.Q(d2);
        double d4 = this.L.h(qg2);
        d3 = sy.Q(d3);
        try {
            bl2 = !this.L.O(d2, d4, d3);
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        return bl2;
    }

    @OY
    public void c(Kd kd2) {
        try {
            if (this.xQ) {
                this.K.X(kd2);
            }
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
    }

    private float t(float[] fArray, int n2) {
        return (float)Math.min(2.0 + this.L.U(_Y.T(), fArray[0]) / (double)n2, 12.0);
    }

    private boolean Q(Qg qg2) {
        if (this.x.m(800L)) {
            double[] dArray = this.c(qg2, this.d);
            this.Z = this.r(new double[]{dArray[0], dArray[2]}, this.d, this.T);
            this.x3 = this.n(qg2, this.T);
            this.L.b(this.x3, this.t(this.x3, 15));
            this.W(this.Z, true, false, 40);
            this.xb = true;
            this.x.m();
            return true;
        }
        return false;
    }

    private boolean k() {
        block9: {
            block10: {
                try {
                    try {
                        try {
                            if (this.L.R == null) break block9;
                            if (!(this.L.U(_Y.T(), this.L.R.a) > 4.0)) break block10;
                        }
                        catch (O_ o_2) {
                            throw xo.a(o_2);
                        }
                        if (!this.V) break block9;
                    }
                    catch (O_ o_3) {
                        throw xo.a(o_3);
                    }
                    return true;
                }
                catch (O_ o_4) {
                    throw xo.a(o_4);
                }
            }
            try {
                if (this.V) {
                    this.L.e();
                    this.V = false;
                }
            }
            catch (O_ o_5) {
                throw xo.a(o_5);
            }
        }
        return false;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xo.a(l10, l11);
            object = kb[n2];
            try {
                if (!(object instanceof String)) break block2;
                xo.kb[n2] = clazz = Class.forName(lb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xo.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field c(long l10, long l11) {
        int n2 = xo.a(l10, l11);
        Object object = kb[n2];
        if (object instanceof String) {
            String string = lb[n2];
            int n3 = string.indexOf(8);
            Class clazz = xo.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xo.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xo.a(clazz3, string2, clazz2)) != null) {
                    xo.kb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xo.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xo.kb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xo.b(270099386041331L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xo.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xo.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean S() {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3 = this.k();
                boolean bl4 = this.A();
                try {
                    try {
                        if (!bl3 && !bl4) break block4;
                    }
                    catch (O_ o_2) {
                        throw xo.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xo.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private boolean x(Qg qg2) {
        boolean bl2;
        double d2;
        Object object;
        double d3 = -0.2;
        if (kX.C() >= 15) {
            object = qg2.L();
        } else {
            Object object2 = qg2.L();
            object = ((oQ)object2).h();
        }
        double d4 = qg2.G();
        try {
            d2 = kX.C() >= 50 ? 1.0 : -1.0;
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        double d5 = d2;
        double d6 = qg2.o();
        oQ oQ2 = ((oQ)object).B(d3, 0.0, d3).s(d4, d5, d6);
        int n2 = EP.c().v(qg2, oQ2).size();
        try {
            bl2 = n2 == 0;
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
        return bl2;
    }

    public xo(xi xi2, String string) {
        long l10 = bb ^ 0x429310A9041BL;
        super(xi2, string);
        this.A = js.b(this, (String)((Object)xo.c("E", (int)xo.a("k", (int)23842, (long)(0x3DAF451DD6430321L ^ l10)), (long)-3009801491531460214L, (long)l10)), (String)((Object)xo.c("E", (int)xo.a("k", (int)14434, (long)(0xD2B9213AF946662L ^ l10)), (long)-3009801491531460214L, (long)l10)), "", 1.0, 2.0, 4.0, (String)((Object)xo.c("E", (int)xo.a("k", (int)1445, (long)(0x48695A461BB8DBA2L ^ l10)), (long)-3009801491531460214L, (long)l10)));
        this.L = (Ay)this.n();
        this.K = new x5((xi)this.n(), (String)((Object)xo.c("E", (int)xo.a("k", (int)17043, (long)(0x140C0A3E6CC39C91L ^ l10)), (long)-3009801491531460214L, (long)l10)));
        this.xC = null;
        this.d = 0;
        this.x = new Bg();
        this.z = new Bg();
        this.xr = new ArrayList<Integer>(Arrays.asList(5, 4, 6, 1, 7, 2, 8, 3));
        this.j = false;
        this.N = false;
        this.e = false;
        this.v = false;
        this.xb = false;
        this.l = false;
        this.h = false;
        this.V = false;
        this.n = new ArrayList();
        this.Y = true;
        this.xy = EP.N().w();
        this.G = EP.N().h();
        this.o = EP.N().y();
        this.N(this.A);
    }

    @Override
    public void v() {
        this.L.A();
        this.N();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xo.bb = d8.a(8426704656321794970L, -308214835067331418L, MethodHandles.lookup().lookupClass()).a(200401324812353L);
                xo.kb = new Object[5];
                xo.lb = new String[5];
                xo.a();
                xo.hb = new HashMap<K, V>(13);
                var0 = xo.bb ^ 128409726682641L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00b8\u00fd\u00fb\u001a\u001a\u00aa\u008fXd\u00bd\u00c9\u00ec\u00c9\u00f9\u00bel\u000e\u00c8\u00d8\u0016\u0010\u0006\u00b7\u00f7";
                var7_6 = "\u00b8\u00fd\u00fb\u001a\u001a\u00aa\u008fXd\u00bd\u00c9\u00ec\u00c9\u00f9\u00bel\u000e\u00c8\u00d8\u0016\u0010\u0006\u00b7\u00f7".length();
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
                    var6_5 = "\u009bk5\u000b\u009a\u0015\u0083\u001b&\u00df\u009c1[\u0012P\f";
                    var7_6 = "\u009bk5\u000b\u009a\u0015\u0083\u001b&\u00df\u009c1[\u0012P\f".length();
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
        xo.fb = var8_3;
        xo.gb = new Integer[5];
    }

    public float D(double[] dArray, double[] dArray2, int n2) {
        double[] dArray3 = this.L.j(new double[]{dArray[0], 0.0, dArray[1]}, (int)(_Y.V(dArray[0], 0.0, dArray[1], dArray2[0], 0.0, dArray2[1]) + (double)this.L.c(1)), n2);
        float f10 = (float)((dArray3[0] - dArray[0]) * (dArray2[1] - dArray[1]) - (dArray3[2] - dArray[1]) * (dArray2[0] - dArray[0]));
        return f10;
    }

    private boolean v(Qg qg2, int n2) {
        boolean bl2;
        double d2;
        Object object;
        boolean bl3 = rT.s(EP.N().r());
        if (n2 > 4) {
            double d3 = qg2.F();
            double d4 = qg2.B();
            this.l = bl3;
            if (n2 == 6) {
                d3 += -0.15;
                d4 = this.Z[1];
            } else if (n2 == 8) {
                d3 -= -0.15;
                d4 = this.Z[1];
            } else if (n2 == 7) {
                d3 = this.Z[0];
                d4 += -0.15;
            } else if (n2 == 5) {
                d3 = this.Z[0];
                d4 -= -0.15;
            }
            d3 = sy.Q(d3);
            double d5 = this.L.h(qg2);
            d4 = sy.Q(d4);
            return this.L.O(d3, d5, d4);
        }
        double d6 = -0.16;
        this.l = bl3;
        if (kX.C() >= 15) {
            object = qg2.L();
        } else {
            Object object2 = qg2.L();
            object = ((oQ)object2).h();
        }
        double d7 = qg2.G();
        try {
            d2 = kX.C() >= 50 ? 1.0 : -1.0;
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        double d9 = d2;
        double d10 = qg2.o();
        oQ oQ2 = ((oQ)object).B(d6, 0.0, d6).s(d7, d9, d10);
        int n3 = EP.c().v(qg2, oQ2).size();
        try {
            bl2 = n3 == 0;
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
        return bl2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private double[] c(Qg qg2, int n2) {
        double d2;
        double[] dArray;
        try {
            double[] dArray2 = new double[3];
            dArray2[0] = sy.Q(qg2.F());
            double[] dArray3 = dArray2;
            dArray = dArray2;
            int n3 = 1;
            d2 = qg2.x() > 0.0 ? this.L.h(qg2) + 1.0 : this.L.h(qg2);
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        dArray3[n3] = d2;
        dArray[2] = sy.Q(qg2.B());
        double[] dArray4 = dArray;
        if (this.L.L(dArray4) && this.L.L(dArray4 = this.L.j(dArray4, -1, n2)) && this.L.L(dArray4 = this.L.j(dArray4, 1, this.m(n2, 2)))) {
            dArray4 = this.L.j(dArray4, -2, this.m(n2, 2));
        }
        return dArray4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int m(int n2, int n3) {
        int n4;
        try {
            n4 = this.xr.indexOf(n2) + n3 < 0 ? (this.xr.indexOf(n2) + n3) % this.xr.size() + this.xr.size() : (this.xr.indexOf(n2) + n3) % this.xr.size();
        }
        catch (O_ o_2) {
            throw xo.a(o_2);
        }
        int n5 = n4;
        return this.xr.get(n5);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xo.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xo.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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
                n4 = 57;
                break;
            }
            case 1: {
                n4 = 34;
                break;
            }
            case 2: {
                n4 = 22;
                break;
            }
            case 3: {
                n4 = 53;
                break;
            }
            case 4: {
                n4 = 31;
                break;
            }
            case 5: {
                n4 = 9;
                break;
            }
            case 6: {
                n4 = 30;
                break;
            }
            case 7: {
                n4 = 21;
                break;
            }
            case 8: {
                n4 = 3;
                break;
            }
            case 9: {
                n4 = 37;
                break;
            }
            case 10: {
                n4 = 61;
                break;
            }
            case 11: {
                n4 = 63;
                break;
            }
            case 12: {
                n4 = 50;
                break;
            }
            case 13: {
                n4 = 6;
                break;
            }
            case 14: {
                n4 = 56;
                break;
            }
            case 15: {
                n4 = 52;
                break;
            }
            case 16: {
                n4 = 47;
                break;
            }
            case 17: {
                n4 = 42;
                break;
            }
            case 18: {
                n4 = 38;
                break;
            }
            case 19: {
                n4 = 45;
                break;
            }
            case 20: {
                n4 = 2;
                break;
            }
            case 21: {
                n4 = 43;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 14;
                break;
            }
            case 24: {
                n4 = 32;
                break;
            }
            case 25: {
                n4 = 46;
                break;
            }
            case 26: {
                n4 = 40;
                break;
            }
            case 27: {
                n4 = 8;
                break;
            }
            case 28: {
                n4 = 16;
                break;
            }
            case 29: {
                n4 = 24;
                break;
            }
            case 30: {
                n4 = 18;
                break;
            }
            case 31: {
                n4 = 33;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 1;
                break;
            }
            case 34: {
                n4 = 29;
                break;
            }
            case 35: {
                n4 = 28;
                break;
            }
            case 36: {
                n4 = 44;
                break;
            }
            case 37: {
                n4 = 7;
                break;
            }
            case 38: {
                n4 = 60;
                break;
            }
            case 39: {
                n4 = 55;
                break;
            }
            case 40: {
                n4 = 35;
                break;
            }
            case 41: {
                n4 = 59;
                break;
            }
            case 42: {
                n4 = 0;
                break;
            }
            case 43: {
                n4 = 10;
                break;
            }
            case 44: {
                n4 = 54;
                break;
            }
            case 45: {
                n4 = 39;
                break;
            }
            case 46: {
                n4 = 51;
                break;
            }
            case 47: {
                n4 = 5;
                break;
            }
            case 48: {
                n4 = 25;
                break;
            }
            case 49: {
                n4 = 62;
                break;
            }
            case 50: {
                n4 = 19;
                break;
            }
            case 51: {
                n4 = 15;
                break;
            }
            case 52: {
                n4 = 58;
                break;
            }
            case 53: {
                n4 = 13;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 48;
                break;
            }
            case 56: {
                n4 = 11;
                break;
            }
            case 57: {
                n4 = 27;
                break;
            }
            case 58: {
                n4 = 36;
                break;
            }
            case 59: {
                n4 = 20;
                break;
            }
            case 60: {
                n4 = 12;
                break;
            }
            case 61: {
                n4 = 41;
                break;
            }
            case 62: {
                n4 = 17;
                break;
            }
            default: {
                n4 = 49;
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
        xo.lb[n5] = new String(cArray);
        return n5;
    }

    public boolean S(Qg qg2, int n2) {
        boolean bl2;
        if (n2 > 4) {
            boolean bl3;
            double d2 = _Y.T();
            double[] dArray = this.K(n2);
            try {
                bl3 = this.L.U(d2, dArray[0]) <= this.L.U(d2, dArray[1]);
            }
            catch (O_ o_2) {
                throw xo.a(o_2);
            }
            return bl3;
        }
        try {
            bl2 = !this.T;
        }
        catch (O_ o_3) {
            throw xo.a(o_3);
        }
        return bl2;
    }

    private void q(float[] fArray, float f10) {
        block3: {
            block2: {
                try {
                    if (this.L.R != null) break block2;
                    this.L.R = new Ya(fArray[0], fArray[1]);
                    this.L.R.L(Math.min(Math.max(2.0f, f10), 12.0f));
                    this.L.R.F(true);
                    this.L.R.N(0.0f);
                    this.L.R.J(true);
                    this.L.R.i(true);
                    this.L.R.q(true);
                    XO.b.W(this.L.R);
                    break block3;
                }
                catch (O_ o_2) {
                    throw xo.a(o_2);
                }
            }
            this.L.R.L(Math.min(Math.max(2.0f, f10), 12.0f));
            this.L.R.v(fArray[0], fArray[1]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(Qg qg2) {
        double[] dArray;
        block38: {
            block39: {
                block35: {
                    double[] dArray2;
                    block37: {
                        double[] dArray3;
                        block36: {
                            int n2;
                            double d2;
                            double d3;
                            double d4;
                            block34: {
                                d4 = sy.Q(qg2.F());
                                d3 = sy.Q(qg2.B());
                                d2 = this.L.h(qg2);
                                try {
                                    if (!this.L.v(qg2.a())) {
                                        this.R = null;
                                        this.xv = 0;
                                        return true;
                                    }
                                }
                                catch (O_ o_2) {
                                    throw xo.a(o_2);
                                }
                                n2 = this.L.y();
                                try {
                                    try {
                                        if (this.d == 0 || n2 == this.d) break block34;
                                    }
                                    catch (O_ o_3) {
                                        throw xo.a(o_3);
                                    }
                                    this.R = null;
                                    this.xv = 0;
                                }
                                catch (O_ o_4) {
                                    throw xo.a(o_4);
                                }
                            }
                            this.d = n2;
                            dArray = new double[]{d4, d2, d3};
                            dArray3 = this.L.j(dArray, 1, this.d);
                            dArray2 = this.L.j(dArray, 2, this.d);
                            try {
                                try {
                                    try {
                                        if (this.R != null || !qg2.j()) break block35;
                                    }
                                    catch (O_ o_5) {
                                        throw xo.a(o_5);
                                    }
                                    if (!this.L.L(dArray)) break block36;
                                }
                                catch (O_ o_6) {
                                    throw xo.a(o_6);
                                }
                                this.R = dArray;
                                return true;
                            }
                            catch (O_ o_7) {
                                throw xo.a(o_7);
                            }
                        }
                        try {
                            if (!this.L.L(dArray3)) break block37;
                            this.R = dArray3;
                            return true;
                        }
                        catch (O_ o_8) {
                            throw xo.a(o_8);
                        }
                    }
                    try {
                        if (!this.L.L(dArray2)) return true;
                        this.R = dArray2;
                        return true;
                    }
                    catch (O_ o_9) {
                        throw xo.a(o_9);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (this.R == null) return true;
                                if (!((double)this.xv >= (Double)this.A.J())) break block38;
                            }
                            catch (O_ o_10) {
                                throw xo.a(o_10);
                            }
                            this.T = this.S(qg2, this.d);
                            this.Z = this.r(new double[]{this.R[0], this.R[2]}, this.d, this.T);
                            this.t = qg2.a();
                            if (rT.s(EP.N().r())) break block39;
                        }
                        catch (O_ o_11) {
                            throw xo.a(o_11);
                        }
                        if (qg2.M().K()) break block39;
                    }
                    catch (O_ o_12) {
                        throw xo.a(o_12);
                    }
                    this.W(this.Z, true, false, 40);
                    this.x3 = this.n(qg2, this.T);
                    this.L.b(this.x3, this.t(this.x3, 15));
                }
                catch (O_ o_13) {
                    throw xo.a(o_13);
                }
            }
            this.xv = 0;
            this.R = null;
            this.x.m();
            return false;
        }
        if (!this.L.L(this.R)) {
            boolean bl2;
            block40: {
                ++this.xv;
                double[] dArray4 = this.L.j(this.R, 1, this.d);
                bl2 = this.L.L(dArray4);
                try {
                    try {
                        if (!bl2 || !((double)this.xv < (Double)this.A.J())) break block40;
                    }
                    catch (O_ o_14) {
                        throw xo.a(o_14);
                    }
                    this.R = dArray4;
                    return true;
                }
                catch (O_ o_15) {
                    throw xo.a(o_15);
                }
            }
            try {
                if (bl2) return true;
                this.R = null;
                this.xv = 0;
                return true;
            }
            catch (O_ o_16) {
                throw xo.a(o_16);
            }
        }
        try {
            if (!this.L.P(this.R, dArray, this.d, (Double)this.A.J(), this.xv)) return true;
            this.R = null;
            this.xv = 0;
            return true;
        }
        catch (O_ o_17) {
            throw xo.a(o_17);
        }
    }

    private boolean W(Qg qg2) {
        block18: {
            block16: {
                block17: {
                    try {
                        if (!_2.O.z(this.L)) {
                            this.xQ = true;
                            Fp.A();
                            return true;
                        }
                    }
                    catch (O_ o_2) {
                        throw xo.a(o_2);
                    }
                    try {
                        if (!this.w(qg2)) {
                            this.xQ = true;
                            Fp.N();
                            return true;
                        }
                    }
                    catch (O_ o_3) {
                        throw xo.a(o_3);
                    }
                    try {
                        try {
                            try {
                                if (rT.s(this.xy)) break block16;
                                if (qg2.M().K()) break block17;
                            }
                            catch (O_ o_4) {
                                throw xo.a(o_4);
                            }
                            if (this.m(qg2)) break block17;
                        }
                        catch (O_ o_5) {
                            throw xo.a(o_5);
                        }
                        return false;
                    }
                    catch (O_ o_6) {
                        throw xo.a(o_6);
                    }
                }
                Fp.N();
                this.xQ = true;
                return true;
            }
            try {
                try {
                    if (jF.b()) break block18;
                    this.n = this.L.u(this.n);
                    if (this.L.z(this.n) < 10) break block18;
                }
                catch (O_ o_7) {
                    throw xo.a(o_7);
                }
                Fp.N();
                this.xQ = true;
                return true;
            }
            catch (O_ o_8) {
                throw xo.a(o_8);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

