/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.DK;
import a.DT;
import a.Hv;
import a.IF;
import a.O_;
import a.QB;
import a.QF;
import a.QK;
import a.QL;
import a.QU;
import a.Qb;
import a.Qg;
import a.Qh;
import a.Qr;
import a.d8;
import a.eM;
import a.o0;
import a.o5;
import a.oH;
import a.oQ;
import a.oT;
import a.og;
import a.oo;
import a.ot;
import a.sy;
import a.zx;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class zq
extends zx {
    private static final long a = d8.a(-3551398118293219878L, 2522693864856147774L, MethodHandles.lookup().lookupClass()).a(83386597302881L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map e;

    public boolean L() {
        return true;
    }

    private void d() {
        this.y.R(this.y.i().A(0.0, -0.04f, 0.0));
    }

    private boolean a(DK dK) {
        boolean bl2;
        Object object = this.y.L();
        oQ oQ2 = oQ.E(dK.o(), ((oQ)object).c(), dK.j(), (double)dK.o() + 1.0, ((oQ)object).P(), (double)dK.j() + 1.0).U(1.0E-7);
        try {
            bl2 = !this.o.b(this.y, oQ2, this::lambda$shouldBlockPushPlayer$0);
        }
        catch (O_ o_2) {
            throw zq.a(o_2);
        }
        return bl2;
    }

    public DT m(DT dT, float f10) {
        DT dT2;
        block4: {
            this.y.l(this.y.s(f10), dT);
            this.y.R(this.y.M(this.y.i()));
            this.y.o(QL.s(), this.y.i());
            dT2 = this.y.i();
            try {
                try {
                    if (!this.y.P() && !this.y.A()) break block4;
                }
                catch (O_ o_2) {
                    throw zq.a(o_2);
                }
                if (!this.y.T()) break block4;
            }
            catch (O_ o_3) {
                throw zq.a(o_3);
            }
            dT2 = DT.N(dT2.X(), 0.2, dT2.f());
        }
        return dT2;
    }

    private void k() {
        block4: {
            long l10 = a ^ 0x77A9783C11E5L;
            this.y.h();
            this.w();
            CallSite callSite = zq.a("d", (int)14323, (long)(0x95411B8D036CFD5L ^ l10));
            double d2 = sy.Z(this.y.F(), -2.9999999E7, 2.9999999E7);
            double d3 = sy.Z(this.y.B(), -2.9999999E7, 2.9999999E7);
            try {
                try {
                    if (d2 == this.y.F() && d3 == this.y.B()) break block4;
                }
                catch (O_ o_2) {
                    throw zq.a(o_2);
                }
                this.y.R(d2, this.y.V(), d3);
            }
            catch (O_ o_3) {
                throw zq.a(o_3);
            }
        }
        this.y.r();
    }

    private void Z() {
        List list = this.o.P(this.y, this.y.S(), oH.I(this.S));
        if (!list.isEmpty()) {
            for (Object e10 : list) {
                try {
                    try {
                        try {
                            if (eM.rl.isInstance(e10) || e10 == this.y.M()) continue;
                        }
                        catch (O_ o_2) {
                            throw zq.a(o_2);
                        }
                        if (e10 == this.g.M()) continue;
                    }
                    catch (O_ o_3) {
                        throw zq.a(o_3);
                    }
                    this.y.v(new QF(e10));
                }
                catch (O_ o_4) {
                    throw zq.a(o_4);
                }
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean S() {
        boolean bl2;
        try {
            bl2 = this.x > 1.0E-5f;
        }
        catch (O_ o_2) {
            throw zq.a(o_2);
        }
        return bl2;
    }

    private void g(DT dT) {
        block15: {
            block14: {
                int n2;
                float f10;
                Qh qh2;
                double d2;
                block12: {
                    double d3;
                    block13: {
                        double d4;
                        this.y.G(false);
                        double d5 = this.y.F();
                        double d6 = this.y.V();
                        double d7 = this.y.B();
                        try {
                            if (!this.y.f() || this.y.d()) break block12;
                        }
                        catch (O_ o_2) {
                            throw zq.a(o_2);
                        }
                        d2 = this.y.q().F();
                        try {
                            d4 = d2 < -0.2 ? 0.085 : 0.06;
                        }
                        catch (O_ o_3) {
                            throw zq.a(o_3);
                        }
                        d3 = d4;
                        try {
                            try {
                                if (d2 <= 0.0 || this.y.A()) break block13;
                            }
                            catch (O_ o_4) {
                                throw zq.a(o_4);
                            }
                            if (this.o.T(DK.L(this.y.F(), this.y.V() + 1.0 - 0.1, this.y.B())).s().F()) break block12;
                        }
                        catch (O_ o_5) {
                            throw zq.a(o_5);
                        }
                    }
                    DT dT2 = this.y.i();
                    this.y.R(dT2.A(0.0, (d2 - dT2.F()) * d3, 0.0));
                }
                try {
                    if (!this.y.M().K() || this.y.d()) break block14;
                }
                catch (O_ o_6) {
                    throw zq.a(o_6);
                }
                d2 = this.y.i().F();
                float f11 = this.y.f();
                try {
                    qh2 = this.y;
                    f10 = this.y.M().G();
                    n2 = this.y.o() ? 2 : 1;
                }
                catch (O_ o_7) {
                    throw zq.a(o_7);
                }
                qh2.q(f10 * (float)n2);
                this.V(dT);
                DT dT3 = this.y.i();
                this.y.L(dT3.X(), d2 * 0.6, dT3.f());
                this.y.q(f11);
                this.y.V(0.0f);
                this.y.i(7, false);
                break block15;
            }
            this.V(dT);
        }
    }

    private void r(double d2, double d3) {
        block10: {
            DK dK = DK.L(d2, this.y.V(), d3);
            if (this.a(dK)) {
                double d4 = d2 - (double)dK.o();
                double d5 = d3 - (double)dK.j();
                o5 o52 = null;
                double d6 = Double.MAX_VALUE;
                oo[] ooArray = new oo[]{oo.A(), oo.F(), oo.O(), oo.G()};
                for (oo oo2 : ooArray) {
                    double d7;
                    o5 o53 = new o5(oo2.M());
                    double d9 = o53.J().m(d4, 0.0, d5);
                    try {
                        d7 = o53.s().equals(og.m()) ? 1.0 - d9 : d9;
                    }
                    catch (O_ o_2) {
                        throw zq.a(o_2);
                    }
                    double d10 = d7;
                    try {
                        if (!(d10 < d6) || this.a(dK.I(o53))) continue;
                    }
                    catch (O_ o_3) {
                        throw zq.a(o_3);
                    }
                    d6 = d10;
                    o52 = o53;
                }
                if (o52 != null) {
                    DT dT;
                    block9: {
                        dT = this.y.i();
                        try {
                            if (!o52.J().equals(o0.K())) break block9;
                            this.y.L(0.1 * (double)o52.P(), dT.F(), dT.f());
                            break block10;
                        }
                        catch (O_ o_4) {
                            throw zq.a(o_4);
                        }
                    }
                    this.y.L(dT.X(), dT.F(), 0.1 * (double)o52.i());
                }
            }
        }
    }

    private boolean E() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    if (!this.Z()) break block4;
                    bl2 = this.S();
                    break block5;
                }
                catch (O_ o_2) {
                    throw zq.a(o_2);
                }
            }
            try {
                bl2 = (double)this.x >= 0.8;
            }
            catch (O_ o_3) {
                throw zq.a(o_3);
            }
        }
        return bl2;
    }

    private void S() {
        this.y.G(this.y.S());
        this.y.z(this.y.q());
        this.y.W();
        this.y.d();
        this.y.s();
    }

    private void w() {
        this.y();
        this.p();
    }

    public void E() {
        try {
            this.H();
            this.y.q(0.02f);
            if (this.y.o()) {
                this.y.q((float)((double)this.y.f() + 0.005999999865889549));
            }
        }
        catch (O_ o_2) {
            throw zq.a(o_2);
        }
        this.y.A((float)this.y.Y(Qb.R()));
    }

    protected void a() {
        this.y.R(this.y.i().A(0.0, 0.04f, 0.0));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void g() {
        this.k();
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4983;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            zq.c[n3] = n4;
        }
        return c[n3];
    }

    private boolean lambda$shouldBlockPushPlayer$0(Object object, Object object2) {
        ot ot2 = new ot(object);
        return ot2.h(this.o.M(), object2);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = zq.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void H() {
        block46: {
            block37: {
                block42: {
                    block44: {
                        boolean bl2;
                        double d2;
                        block40: {
                            block39: {
                                block47: {
                                    block38: {
                                        try {
                                            if (this.y.S() > 0) {
                                                this.y.M(this.y.S() - 1);
                                            }
                                        }
                                        catch (O_ o_2) {
                                            throw zq.a(o_2);
                                        }
                                        try {
                                            if (!this.L()) {
                                                this.y.R(this.y.i().f(0.98));
                                            }
                                        }
                                        catch (O_ o_3) {
                                            throw zq.a(o_3);
                                        }
                                        DT dT = this.y.i();
                                        double d3 = dT.X();
                                        double d4 = dT.F();
                                        double d5 = dT.f();
                                        if (Math.abs(d3) < 0.003) {
                                            d3 = 0.0;
                                        }
                                        if (Math.abs(d4) < 0.003) {
                                            d4 = 0.0;
                                        }
                                        if (Math.abs(d5) < 0.003) {
                                            d5 = 0.0;
                                        }
                                        try {
                                            try {
                                                this.y.L(d3, d4, d5);
                                                this.N();
                                                if (!this.y.A() || this.y.M().K()) break block37;
                                            }
                                            catch (O_ o_4) {
                                                throw zq.a(o_4);
                                            }
                                            if (!this.y.x()) break block38;
                                        }
                                        catch (O_ o_5) {
                                            throw zq.a(o_5);
                                        }
                                        d2 = this.y.h(oT.u());
                                        break block47;
                                    }
                                    d2 = this.y.h(oT.G());
                                }
                                try {
                                    try {
                                        if (!this.y.F() || !(d2 > 0.0)) break block39;
                                    }
                                    catch (O_ o_6) {
                                        throw zq.a(o_6);
                                    }
                                    bl2 = true;
                                    break block40;
                                }
                                catch (O_ o_7) {
                                    throw zq.a(o_7);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl3 = bl2;
                        double d6 = this.m();
                        try {
                            try {
                                block45: {
                                    try {
                                        try {
                                            try {
                                                block43: {
                                                    try {
                                                        try {
                                                            try {
                                                                block41: {
                                                                    try {
                                                                        try {
                                                                            if (!bl3) break block41;
                                                                            if (!this.y.j()) break block42;
                                                                        }
                                                                        catch (O_ o_8) {
                                                                            throw zq.a(o_8);
                                                                        }
                                                                        if (d2 > d6) break block42;
                                                                    }
                                                                    catch (O_ o_9) {
                                                                        throw zq.a(o_9);
                                                                    }
                                                                }
                                                                if (!this.y.x()) break block43;
                                                            }
                                                            catch (O_ o_10) {
                                                                throw zq.a(o_10);
                                                            }
                                                            if (!this.y.j()) break block44;
                                                        }
                                                        catch (O_ o_11) {
                                                            throw zq.a(o_11);
                                                        }
                                                        if (d2 > d6) break block44;
                                                    }
                                                    catch (O_ o_12) {
                                                        throw zq.a(o_12);
                                                    }
                                                }
                                                if (this.y.j()) break block45;
                                            }
                                            catch (O_ o_13) {
                                                throw zq.a(o_13);
                                            }
                                            if (!bl3) break block46;
                                        }
                                        catch (O_ o_14) {
                                            throw zq.a(o_14);
                                        }
                                        if (!(d2 <= d6)) break block46;
                                    }
                                    catch (O_ o_15) {
                                        throw zq.a(o_15);
                                    }
                                }
                                if (this.y.S() != 0) break block46;
                            }
                            catch (O_ o_16) {
                                throw zq.a(o_16);
                            }
                            this.y.L();
                            this.y.M(10);
                            break block46;
                        }
                        catch (O_ o_17) {
                            throw zq.a(o_17);
                        }
                    }
                    this.a();
                    break block46;
                }
                this.a();
                break block46;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        DT dT = DT.N(this.y.w(), 0.0, this.y.u());
        this.g(dT);
        this.Z();
    }

    @Override
    public void J(IF iF2) {
        this.G = iF2.a;
        this.v = iF2.i;
        this.x = iF2.z;
        this.l = iF2.n;
        this.D = iF2.L;
        this.Y = iF2.W;
        this.y.B(iF2.s);
        this.y.Q(iF2.D);
        this.y.A(iF2.l);
        this.y.W(iF2.Q);
        this.y.X(iF2.q);
        this.y.p(iF2.J);
        DT dT = DT.N(iF2.k, iF2.G, iF2.b);
        this.y.R(dT);
        this.y.a(iF2.H);
        this.y.f(iF2.p);
        this.y.z(iF2.o);
        this.y.G(iF2.S);
        this.y.W(iF2.A);
        this.y.r(iF2.K);
        this.y.h(iF2.g);
        this.y.M(iF2.j);
        this.y.q(iF2.M);
        this.y.A(iF2.x);
        Qr qr2 = this.y.I(Qb.R());
        qr2.h();
        for (Object e10 : iF2.I) {
            qr2.V(new QB(e10));
        }
        this.N = iF2.O;
        this.d = iF2.B;
        this.V = iF2.P;
        this.A = iF2.F;
        this.n = iF2.V;
        this.W = iF2.y;
        this.U = iF2.w;
    }

    public boolean Z() {
        return this.y.q();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void V(DT dT) {
        double d2;
        DT dT2;
        float f10;
        block51: {
            double d3;
            block49: {
                block50: {
                    float f11;
                    block48: {
                        block47: {
                            DT dT3;
                            QU qU2;
                            boolean bl2;
                            block45: {
                                DT dT4;
                                float f12;
                                double d4;
                                block46: {
                                    float f13;
                                    block44: {
                                        boolean bl3;
                                        try {
                                            if (!this.L() && !this.y.c()) return;
                                        }
                                        catch (O_ o_2) {
                                            throw zq.a(o_2);
                                        }
                                        d3 = 0.08;
                                        try {
                                            bl3 = this.y.i().F() <= 0.0;
                                        }
                                        catch (O_ o_3) {
                                            throw zq.a(o_3);
                                        }
                                        bl2 = bl3;
                                        try {
                                            if (!bl2 || !this.y.e(Hv.Q)) break block44;
                                        }
                                        catch (O_ o_4) {
                                            throw zq.a(o_4);
                                        }
                                        d3 = 0.01;
                                        this.y.V(0.0f);
                                    }
                                    qU2 = this.o.V(this.y.C());
                                    try {
                                        try {
                                            if (!this.y.F() || !this.y.n()) break block45;
                                        }
                                        catch (O_ o_5) {
                                            throw zq.a(o_5);
                                        }
                                        if (this.y.O(qU2)) break block45;
                                    }
                                    catch (O_ o_6) {
                                        throw zq.a(o_6);
                                    }
                                    d4 = this.y.V();
                                    try {
                                        f13 = this.y.o() ? 0.9f : this.y.I();
                                    }
                                    catch (O_ o_7) {
                                        throw zq.a(o_7);
                                    }
                                    f12 = f13;
                                    float f14 = 0.02f;
                                    float f15 = QK.u(this.y);
                                    if (f15 > 3.0f) {
                                        f15 = 3.0f;
                                    }
                                    if (!this.y.j()) {
                                        f15 *= 0.5f;
                                    }
                                    if (f15 > 0.0f) {
                                        f12 += (0.54600006f - f12) * f15 / 3.0f;
                                        f14 += (this.y.a() - f14) * f15 / 3.0f;
                                    }
                                    if (this.y.e(Hv.Y)) {
                                        f12 = 0.96f;
                                    }
                                    this.y.l(f14, dT);
                                    this.y.o(QL.s(), this.y.i());
                                    dT4 = this.y.i();
                                    try {
                                        if (!this.y.P() || !this.y.T()) break block46;
                                    }
                                    catch (O_ o_8) {
                                        throw zq.a(o_8);
                                    }
                                    dT4 = DT.N(dT4.X(), 0.2, dT4.f());
                                }
                                this.y.R(dT4.U(f12, 0.8f, f12));
                                DT dT5 = this.y.X(d3, bl2, this.y.i());
                                try {
                                    try {
                                        this.y.R(dT5);
                                        if (!this.y.P() || !this.y.u(dT5.X(), dT5.F() + (double)0.6f - this.y.V() + d4, dT5.f())) return;
                                    }
                                    catch (O_ o_9) {
                                        throw zq.a(o_9);
                                    }
                                    this.y.L(dT5.X(), 0.3f, dT5.f());
                                    return;
                                }
                                catch (O_ o_10) {
                                    throw zq.a(o_10);
                                }
                            }
                            try {
                                try {
                                    if (!this.y.x() || !this.y.n()) break block47;
                                }
                                catch (O_ o_11) {
                                    throw zq.a(o_11);
                                }
                                if (this.y.O(qU2)) break block47;
                            }
                            catch (O_ o_12) {
                                throw zq.a(o_12);
                            }
                            double d5 = this.y.V();
                            this.y.l(0.02f, dT);
                            this.y.o(QL.s(), this.y.i());
                            if (this.y.h(oT.u()) <= this.m()) {
                                this.y.R(this.y.i().U(0.5, 0.8f, 0.5));
                                dT3 = this.y.X(d3, bl2, this.y.i());
                                this.y.R(dT3);
                            } else {
                                this.y.R(this.y.i().f(0.5));
                            }
                            try {
                                if (!this.y.s()) {
                                    this.y.R(this.y.i().A(0.0, -d3 / 4.0, 0.0));
                                }
                            }
                            catch (O_ o_13) {
                                throw zq.a(o_13);
                            }
                            dT3 = this.y.i();
                            try {
                                try {
                                    if (!this.y.P() || !this.y.u(dT3.X(), dT3.F() + (double)0.6f - this.y.V() + d5, dT3.f())) return;
                                }
                                catch (O_ o_14) {
                                    throw zq.a(o_14);
                                }
                                this.y.L(dT3.X(), 0.3f, dT3.f());
                                return;
                            }
                            catch (O_ o_15) {
                                throw zq.a(o_15);
                            }
                        }
                        try {
                            if (!this.y.C()) break block48;
                            return;
                        }
                        catch (O_ o_16) {
                            throw zq.a(o_16);
                        }
                    }
                    DK dK = this.y.o();
                    float f16 = this.o.T(dK).I().r();
                    try {
                        f11 = this.y.j() ? f16 * 0.91f : 0.91f;
                    }
                    catch (O_ o_17) {
                        throw zq.a(o_17);
                    }
                    f10 = f11;
                    dT2 = this.m(dT, f16);
                    d2 = dT2.F();
                    if (this.y.e(Hv.o)) {
                        d2 += (0.05 * (double)(this.y.W(Hv.o).y() + 1) - dT2.F()) * 0.2;
                        this.y.V(0.0f);
                    } else {
                        try {
                            if (this.o.P(dK)) break block49;
                            if (!(this.y.V() > 0.0)) break block50;
                        }
                        catch (O_ o_18) {
                            throw zq.a(o_18);
                        }
                        d2 = -0.1;
                    }
                    break block51;
                }
                d2 = 0.0;
                break block51;
            }
            if (!this.y.s()) {
                d2 -= d3;
            }
        }
        this.y.L(dT2.X() * (double)f10, d2 * (double)0.98f, dT2.f() * (double)f10);
    }

    @Override
    public void C() {
        this.v = this.S.N();
        this.G = this.S.o();
        Qr qr2 = this.g.I(Qb.R());
        Qr qr3 = this.y.I(Qb.R());
        qr3.h();
        for (Object e10 : qr2.D()) {
            qr3.V(new QB(e10));
        }
        this.y.X(this.g.u());
        this.y.c(this.g.w());
    }

    public double m() {
        double d2;
        try {
            d2 = (double)this.y.E() < 0.4 ? 0.0 : 0.4;
        }
        catch (O_ o_2) {
            throw zq.a(o_2);
        }
        return d2;
    }

    private void y() {
        this.S();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x599F6D6CE510L;
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
        String string = "Y9Z\u0019\rv\u0085\u0098c\u00cd\u0015\u00a5S\b\u00a3\u00ed";
        int n3 = "Y9Z\u0019\rv\u0085\u0098c\u00cd\u0015\u00a5S\b\u00a3\u00ed".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
    }

    private void N() {
        this.y.c(this.l);
        this.y.X(this.x);
        this.y.U(this.D);
    }

    public zq(Qh qh2, Qg qg2, Qh qh3, D0 d0) {
        super(qh2, qg2, qh3, d0);
    }

    public boolean a() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.y.V()) break block4;
                    }
                    catch (O_ o_2) {
                        throw zq.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw zq.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void R(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.N = bl2;
        this.d = bl3;
        this.V = bl4;
        this.A = bl5;
        this.W = bl6;
        this.n = bl7;
    }

    @Override
    public void B() {
        this.g();
    }

    public void Y(boolean bl2) {
        float f10;
        block14: {
            block13: {
                float f11;
                block12: {
                    block11: {
                        try {
                            zq zq2 = this;
                            if (this.N != this.d) break block11;
                            f11 = 0.0f;
                            break block12;
                        }
                        catch (O_ o_2) {
                            throw zq.a(o_2);
                        }
                    }
                    try {
                        f11 = this.N ? 1.0f : -1.0f;
                    }
                    catch (O_ o_3) {
                        throw zq.a(o_3);
                    }
                }
                try {
                    zq2.x = f11;
                    zq zq3 = this;
                    if (this.V != this.A) break block13;
                    f10 = 0.0f;
                    break block14;
                }
                catch (O_ o_4) {
                    throw zq.a(o_4);
                }
            }
            try {
                f10 = this.V ? 1.0f : -1.0f;
            }
            catch (O_ o_5) {
                throw zq.a(o_5);
            }
        }
        try {
            zq3.l = f10;
            this.D = this.W;
            this.Y = this.n;
            if (bl2) {
                this.l = (float)((double)this.l * 0.3);
                this.x = (float)((double)this.x * 0.3);
            }
        }
        catch (O_ o_6) {
            throw zq.a(o_6);
        }
    }

    public void p() {
        block102: {
            boolean bl2;
            block92: {
                boolean bl3;
                block99: {
                    boolean bl4;
                    block98: {
                        block97: {
                            boolean bl5;
                            block95: {
                                block94: {
                                    boolean bl6;
                                    block90: {
                                        boolean bl7;
                                        block88: {
                                            block89: {
                                                boolean bl8;
                                                boolean bl9;
                                                boolean bl10;
                                                long l10;
                                                block87: {
                                                    block86: {
                                                        block85: {
                                                            l10 = a ^ 0xD00DB5E94D5L;
                                                            try {
                                                                ++this.G;
                                                                if (this.v > 0) {
                                                                    --this.v;
                                                                }
                                                            }
                                                            catch (O_ o_2) {
                                                                throw zq.a(o_2);
                                                            }
                                                            boolean bl11 = this.Y;
                                                            boolean bl12 = this.D;
                                                            bl10 = this.Y;
                                                            bl9 = this.E();
                                                            this.Y(this.a());
                                                            bl7 = false;
                                                            try {
                                                                try {
                                                                    if (!bl7 || this.y.d()) break block85;
                                                                }
                                                                catch (O_ o_3) {
                                                                    throw zq.a(o_3);
                                                                }
                                                                this.l *= 0.2f;
                                                                this.x *= 0.2f;
                                                                this.v = 0;
                                                            }
                                                            catch (O_ o_4) {
                                                                throw zq.a(o_4);
                                                            }
                                                        }
                                                        double d2 = this.y.F();
                                                        double d3 = this.y.B();
                                                        double d4 = this.y.d();
                                                        try {
                                                            this.r(d2 - d4 * 0.35, d3 + d4 * 0.35);
                                                            this.r(d2 - d4 * 0.35, d3 - d4 * 0.35);
                                                            this.r(d2 + d4 * 0.35, d3 - d4 * 0.35);
                                                            this.r(d2 + d4 * 0.35, d3 + d4 * 0.35);
                                                            if (bl10) {
                                                                this.v = 0;
                                                            }
                                                        }
                                                        catch (O_ o_5) {
                                                            throw zq.a(o_5);
                                                        }
                                                        try {
                                                            try {
                                                                if (!((float)this.y.K().u() > 6.0f) && !this.y.M().w()) break block86;
                                                            }
                                                            catch (O_ o_6) {
                                                                throw zq.a(o_6);
                                                            }
                                                            bl8 = true;
                                                            break block87;
                                                        }
                                                        catch (O_ o_7) {
                                                            throw zq.a(o_7);
                                                        }
                                                    }
                                                    bl8 = false;
                                                }
                                                bl6 = bl8;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (!this.y.j() && !this.Z()) break block88;
                                                                                        }
                                                                                        catch (O_ o_8) {
                                                                                            throw zq.a(o_8);
                                                                                        }
                                                                                        if (bl10) break block88;
                                                                                    }
                                                                                    catch (O_ o_9) {
                                                                                        throw zq.a(o_9);
                                                                                    }
                                                                                    if (bl9) break block88;
                                                                                }
                                                                                catch (O_ o_10) {
                                                                                    throw zq.a(o_10);
                                                                                }
                                                                                if (!this.E()) break block88;
                                                                            }
                                                                            catch (O_ o_11) {
                                                                                throw zq.a(o_11);
                                                                            }
                                                                            if (this.y.o()) break block88;
                                                                        }
                                                                        catch (O_ o_12) {
                                                                            throw zq.a(o_12);
                                                                        }
                                                                        if (!bl6) break block88;
                                                                    }
                                                                    catch (O_ o_13) {
                                                                        throw zq.a(o_13);
                                                                    }
                                                                    if (bl7) break block88;
                                                                }
                                                                catch (O_ o_14) {
                                                                    throw zq.a(o_14);
                                                                }
                                                                if (this.y.e(Hv.h)) break block88;
                                                            }
                                                            catch (O_ o_15) {
                                                                throw zq.a(o_15);
                                                            }
                                                            if (this.v > 0) break block89;
                                                        }
                                                        catch (O_ o_16) {
                                                            throw zq.a(o_16);
                                                        }
                                                        if (this.U) break block89;
                                                    }
                                                    catch (O_ o_17) {
                                                        throw zq.a(o_17);
                                                    }
                                                    this.v = (int)zq.a("d", (int)19651, (long)(0x67A6576E5705B1D4L ^ l10));
                                                    break block88;
                                                }
                                                catch (O_ o_18) {
                                                    throw zq.a(o_18);
                                                }
                                            }
                                            this.y.h(true);
                                            this.G = 0;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                block91: {
                                                                    try {
                                                                        try {
                                                                            if (this.y.o()) break block90;
                                                                            if (!this.y.F()) break block91;
                                                                        }
                                                                        catch (O_ o_19) {
                                                                            throw zq.a(o_19);
                                                                        }
                                                                        if (!this.Z()) break block90;
                                                                    }
                                                                    catch (O_ o_20) {
                                                                        throw zq.a(o_20);
                                                                    }
                                                                }
                                                                if (!this.E()) break block90;
                                                            }
                                                            catch (O_ o_21) {
                                                                throw zq.a(o_21);
                                                            }
                                                            if (!bl6) break block90;
                                                        }
                                                        catch (O_ o_22) {
                                                            throw zq.a(o_22);
                                                        }
                                                        if (bl7) break block90;
                                                    }
                                                    catch (O_ o_23) {
                                                        throw zq.a(o_23);
                                                    }
                                                    if (this.y.e(Hv.h)) break block90;
                                                }
                                                catch (O_ o_24) {
                                                    throw zq.a(o_24);
                                                }
                                                if (!this.U) break block90;
                                            }
                                            catch (O_ o_25) {
                                                throw zq.a(o_25);
                                            }
                                            this.y.h(true);
                                            this.G = 0;
                                        }
                                        catch (O_ o_26) {
                                            throw zq.a(o_26);
                                        }
                                    }
                                    try {
                                        block93: {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block92;
                                                    if (!this.S()) break block93;
                                                }
                                                catch (O_ o_27) {
                                                    throw zq.a(o_27);
                                                }
                                                if (bl6) break block94;
                                            }
                                            catch (O_ o_28) {
                                                throw zq.a(o_28);
                                            }
                                        }
                                        bl5 = true;
                                        break block95;
                                    }
                                    catch (O_ o_29) {
                                        throw zq.a(o_29);
                                    }
                                }
                                bl5 = false;
                            }
                            bl2 = bl5;
                            try {
                                block96: {
                                    try {
                                        try {
                                            try {
                                                if (bl2 || this.y.P()) break block96;
                                            }
                                            catch (O_ o_30) {
                                                throw zq.a(o_30);
                                            }
                                            if (!this.y.F()) break block97;
                                        }
                                        catch (O_ o_31) {
                                            throw zq.a(o_31);
                                        }
                                        if (this.Z()) break block97;
                                    }
                                    catch (O_ o_32) {
                                        throw zq.a(o_32);
                                    }
                                }
                                bl4 = true;
                                break block98;
                            }
                            catch (O_ o_33) {
                                throw zq.a(o_33);
                            }
                        }
                        bl4 = false;
                    }
                    bl3 = bl4;
                    try {
                        block101: {
                            try {
                                block100: {
                                    try {
                                        try {
                                            try {
                                                if (!this.y.f()) break block99;
                                                if (this.y.j()) break block100;
                                            }
                                            catch (O_ o_34) {
                                                throw zq.a(o_34);
                                            }
                                            if (this.Y) break block100;
                                        }
                                        catch (O_ o_35) {
                                            throw zq.a(o_35);
                                        }
                                        if (bl2) break block101;
                                    }
                                    catch (O_ o_36) {
                                        throw zq.a(o_36);
                                    }
                                }
                                if (this.y.F()) break block92;
                            }
                            catch (O_ o_37) {
                                throw zq.a(o_37);
                            }
                        }
                        this.y.h(false);
                        this.G = 0;
                        break block92;
                    }
                    catch (O_ o_38) {
                        throw zq.a(o_38);
                    }
                }
                try {
                    if (bl3) {
                        this.y.h(false);
                        this.G = 0;
                    }
                }
                catch (O_ o_39) {
                    throw zq.a(o_39);
                }
            }
            bl2 = false;
            try {
                try {
                    try {
                        if (!this.y.F() || !this.Y) break block102;
                    }
                    catch (O_ o_40) {
                        throw zq.a(o_40);
                    }
                    if (this.y.M().K()) break block102;
                }
                catch (O_ o_41) {
                    throw zq.a(o_41);
                }
                this.d();
            }
            catch (O_ o_42) {
                throw zq.a(o_42);
            }
        }
        this.E();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

