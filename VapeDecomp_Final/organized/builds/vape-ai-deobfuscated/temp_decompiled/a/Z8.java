/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.D1;
import a.DJ;
import a.DK;
import a.DT;
import a.DU;
import a.Eh;
import a.Hc;
import a.Hv;
import a.IF;
import a.O_;
import a.QB;
import a.QE;
import a.QF;
import a.QJ;
import a.QL;
import a.QU;
import a.Qb;
import a.Qg;
import a.Qh;
import a.Qr;
import a.V3;
import a.cF;
import a.d8;
import a.eM;
import a.o0;
import a.o5;
import a.oH;
import a.oQ;
import a.oT;
import a.oV;
import a.og;
import a.ok;
import a.oo;
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
public class z8
extends zx {
    private static final Map f;
    private static final long[] b;
    private static final Integer[] e;
    private static final long a;
    private boolean c;

    private void C(DT dT) {
        block7: {
            double d2;
            DT dT2;
            float f10;
            block6: {
                float f11;
                DK dK = this.y.o();
                try {
                    f11 = this.y.j() ? this.o.T(dK).I().r() : 1.0f;
                }
                catch (O_ o_2) {
                    throw z8.a(o_2);
                }
                float f12 = f11;
                f10 = f12 * 0.91f;
                dT2 = this.j(dT, f12);
                d2 = dT2.F();
                if (this.y.e(Hv.o)) {
                    V3 v32 = this.y.W(Hv.o);
                    d2 += (0.05 * (double)(v32.y() + 1) - dT2.F()) * 0.2;
                } else {
                    d2 -= this.y.X();
                }
                try {
                    if (!this.y.X()) break block6;
                    this.y.L(dT2.X(), d2, dT2.f());
                    break block7;
                }
                catch (O_ o_3) {
                    throw z8.a(o_3);
                }
            }
            float f13 = 0.98f;
            this.y.L(dT2.X() * (double)f10, d2 * (double)f13, dT2.f() * (double)f10);
        }
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

    private boolean a() {
        boolean bl2;
        try {
            bl2 = this.x > 1.0E-5f;
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        return bl2;
    }

    private void K() {
        List list = this.o.P(this.y, this.y.S(), oH.I(this.S));
        if (!list.isEmpty()) {
            for (Object e10 : list) {
                try {
                    try {
                        try {
                            if (eM.rl.isInstance(e10) || e10 == this.y.M()) continue;
                        }
                        catch (O_ o_2) {
                            throw z8.a(o_2);
                        }
                        if (e10 == this.g.M()) continue;
                    }
                    catch (O_ o_3) {
                        throw z8.a(o_3);
                    }
                    this.y.v(new QF(e10));
                }
                catch (O_ o_4) {
                    throw z8.a(o_4);
                }
            }
        }
    }

    public boolean I() {
        boolean bl2;
        try {
            bl2 = this.x > 1.0E-5f;
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        return bl2;
    }

    private static float Y(boolean bl2, boolean bl3) {
        float f10;
        try {
            if (bl2 == bl3) {
                return 0.0f;
            }
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        try {
            f10 = bl2 ? 1.0f : -1.0f;
        }
        catch (O_ o_3) {
            throw z8.a(o_3);
        }
        return f10;
    }

    private void w() {
        block48: {
            block39: {
                block44: {
                    block46: {
                        boolean bl2;
                        double d2;
                        block42: {
                            block41: {
                                block49: {
                                    block40: {
                                        block38: {
                                            block37: {
                                                try {
                                                    if (this.y.S() > 0) {
                                                        this.y.M(this.y.S() - 1);
                                                    }
                                                }
                                                catch (O_ o_2) {
                                                    throw z8.a(o_2);
                                                }
                                                DT dT = this.y.i();
                                                double d3 = dT.X();
                                                double d4 = dT.F();
                                                double d5 = dT.f();
                                                if (Math.abs(dT.X()) < 0.003) {
                                                    d3 = 0.0;
                                                }
                                                if (Math.abs(dT.F()) < 0.003) {
                                                    d4 = 0.0;
                                                }
                                                if (Math.abs(dT.f()) < 0.003) {
                                                    d5 = 0.0;
                                                }
                                                try {
                                                    this.y.L(d3, d4, d5);
                                                    if (!this.y.b()) break block37;
                                                    this.y.U(false);
                                                    this.y.c(0.0f);
                                                    this.y.X(0.0f);
                                                    break block38;
                                                }
                                                catch (O_ o_3) {
                                                    throw z8.a(o_3);
                                                }
                                            }
                                            this.h();
                                        }
                                        try {
                                            try {
                                                if (!this.y.A() || !this.y.n()) break block39;
                                            }
                                            catch (O_ o_4) {
                                                throw z8.a(o_4);
                                            }
                                            if (!this.y.x()) break block40;
                                        }
                                        catch (O_ o_5) {
                                            throw z8.a(o_5);
                                        }
                                        d2 = this.y.h(oT.u());
                                        break block49;
                                    }
                                    d2 = this.y.h(oT.G());
                                }
                                try {
                                    try {
                                        if (!this.y.F() || !(d2 > 0.0)) break block41;
                                    }
                                    catch (O_ o_6) {
                                        throw z8.a(o_6);
                                    }
                                    bl2 = true;
                                    break block42;
                                }
                                catch (O_ o_7) {
                                    throw z8.a(o_7);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl3 = bl2;
                        double d6 = this.h();
                        try {
                            try {
                                block47: {
                                    try {
                                        try {
                                            try {
                                                block45: {
                                                    try {
                                                        try {
                                                            try {
                                                                block43: {
                                                                    try {
                                                                        try {
                                                                            if (!bl3) break block43;
                                                                            if (!this.y.j()) break block44;
                                                                        }
                                                                        catch (O_ o_8) {
                                                                            throw z8.a(o_8);
                                                                        }
                                                                        if (d2 > d6) break block44;
                                                                    }
                                                                    catch (O_ o_9) {
                                                                        throw z8.a(o_9);
                                                                    }
                                                                }
                                                                if (!this.y.x()) break block45;
                                                            }
                                                            catch (O_ o_10) {
                                                                throw z8.a(o_10);
                                                            }
                                                            if (!this.y.j()) break block46;
                                                        }
                                                        catch (O_ o_11) {
                                                            throw z8.a(o_11);
                                                        }
                                                        if (d2 > d6) break block46;
                                                    }
                                                    catch (O_ o_12) {
                                                        throw z8.a(o_12);
                                                    }
                                                }
                                                if (this.y.j()) break block47;
                                            }
                                            catch (O_ o_13) {
                                                throw z8.a(o_13);
                                            }
                                            if (!bl3) break block48;
                                        }
                                        catch (O_ o_14) {
                                            throw z8.a(o_14);
                                        }
                                        if (!(d2 <= d6)) break block48;
                                    }
                                    catch (O_ o_15) {
                                        throw z8.a(o_15);
                                    }
                                }
                                if (this.y.S() != 0) break block48;
                            }
                            catch (O_ o_16) {
                                throw z8.a(o_16);
                            }
                            this.y.L();
                            this.y.M(10);
                            break block48;
                        }
                        catch (O_ o_17) {
                            throw z8.a(o_17);
                        }
                    }
                    this.z();
                    break block48;
                }
                this.z();
                break block48;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        Object object = this.y.L();
        DT dT = DT.N(this.y.w(), 0.0, this.y.u());
        this.a(dT);
        if (!this.o.s()) {
            // empty if block
        }
        this.y.W();
        this.y.I();
        this.K();
    }

    @Override
    public void B() {
        this.W();
    }

    public boolean o() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.V() || this.y.F()) break block4;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw z8.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = z8.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void p() {
        try {
            this.l();
            if (!this.y.O()) {
                this.t();
            }
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        if (this.y.C()) {
            // empty if block
        }
        try {
            if (this.y.M()) {
                this.y.f(0.0f);
            }
        }
        catch (O_ o_3) {
            throw z8.a(o_3);
        }
        float f10 = this.y.y();
        try {
            if (f10 != this.y.Y()) {
                this.y.g(f10);
                this.y.P();
            }
        }
        catch (O_ o_4) {
            throw z8.a(o_4);
        }
    }

    private void W() {
        try {
            if (this.S.U()) {
                this.j();
            }
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
    }

    private boolean y() {
        boolean bl2;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (this.y.C() || this.U()) break block8;
                                }
                                catch (O_ o_2) {
                                    throw z8.a(o_2);
                                }
                                if (this.C()) break block8;
                            }
                            catch (O_ o_3) {
                                throw z8.a(o_3);
                            }
                            if (!this.y.d()) break block9;
                        }
                        catch (O_ o_4) {
                            throw z8.a(o_4);
                        }
                    }
                    bl2 = true;
                    break block10;
                }
                catch (O_ o_5) {
                    throw z8.a(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private boolean B(DK dK) {
        Object object = this.y.L();
        oQ oQ2 = oQ.E(dK.o(), ((oQ)object).c(), dK.j(), (double)dK.o() + 1.0, ((oQ)object).P(), (double)dK.j() + 1.0).x(1.0E-7);
        return this.o.b(this.y, oQ2);
    }

    private boolean C() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.o()) break block4;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw z8.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public z8(Qh qh2, Qg qg2, Qh qh3, D0 d0) {
        super(qh2, qg2, qh3, d0);
    }

    private void Y() {
        this.D = this.W;
        this.Y = this.n;
        this.x = z8.Y(this.N, this.d);
        this.l = z8.Y(this.V, this.A);
    }

    private void h() {
        this.y.c(this.l);
        this.y.X(this.x);
        this.y.U(this.W);
    }

    private boolean d() {
        boolean bl2;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (this.y.d() || (float)this.y.K().u() > 6.0f) break block6;
                            }
                            catch (O_ o_2) {
                                throw z8.a(o_2);
                            }
                            if (!this.y.M().w()) break block7;
                        }
                        catch (O_ o_3) {
                            throw z8.a(o_3);
                        }
                    }
                    bl2 = true;
                    break block8;
                }
                catch (O_ o_4) {
                    throw z8.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public double h() {
        double d2;
        try {
            d2 = (double)this.y.E() < 0.4 ? 0.0 : 0.4;
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        return d2;
    }

    private DT q(DT dT) {
        double d2;
        double d3;
        DT dT2;
        block6: {
            double d4;
            float f10;
            block5: {
                dT2 = this.y.q();
                f10 = this.y.S() * ((float)Math.PI / 180);
                d3 = dT2.G();
                d2 = dT.G();
                double d5 = this.y.X();
                double d6 = cF.o(Math.cos(f10));
                dT = dT.A(0.0, d5 * (-1.0 + d6 * 0.75), 0.0);
                try {
                    if (!(dT.F() < 0.0) || !(d3 > 0.0)) break block5;
                }
                catch (O_ o_2) {
                    throw z8.a(o_2);
                }
                d4 = dT.F() * -0.1 * d6;
                dT = dT.A(dT2.X() * d4 / d3, d4, dT2.f() * d4 / d3);
            }
            try {
                if (!(f10 < 0.0f) || !(d3 > 0.0)) break block6;
            }
            catch (O_ o_3) {
                throw z8.a(o_3);
            }
            d4 = d2 * (double)(-cF.z(f10)) * 0.04;
            dT = dT.A(-dT2.X() * d4 / d3, d4 * 3.2, -dT2.f() * d4 / d3);
        }
        if (d3 > 0.0) {
            dT = dT.A((dT2.X() / d3 * d2 - dT.X()) * 0.1, 0.0, (dT2.f() / d3 * d2 - dT.f()) * 0.1);
        }
        return dT.U(0.99f, 0.98f, 0.99f);
    }

    @Override
    public void J(IF iF2) {
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
        Qr qr2 = this.y.x(Qb.L());
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

    private void l() {
        try {
            this.y.H(null);
            this.y.m(this.y.a());
            this.y.i(false);
            this.y.W();
            this.y.d();
            this.y.s();
            if (this.y.x()) {
                this.y.V(this.y.W() * 0.5f);
            }
        }
        catch (O_ o_2) {
            throw z8.a(o_2);
        }
        this.y.p();
    }

    private void M() {
        this.y.R(this.y.i().A(0.0, -0.04f, 0.0));
    }

    private void t() {
        block88: {
            boolean bl2;
            block77: {
                boolean bl3;
                block85: {
                    boolean bl4;
                    block84: {
                        block83: {
                            boolean bl5;
                            block80: {
                                block79: {
                                    block76: {
                                        boolean bl6;
                                        block74: {
                                            block75: {
                                                boolean bl7;
                                                boolean bl8;
                                                long l10;
                                                block73: {
                                                    block72: {
                                                        boolean bl9;
                                                        l10 = a ^ 0x38FEA7BF74B5L;
                                                        try {
                                                            if (this.v > 0) {
                                                                --this.v;
                                                            }
                                                        }
                                                        catch (O_ o_2) {
                                                            throw z8.a(o_2);
                                                        }
                                                        boolean bl10 = this.D;
                                                        boolean bl11 = this.Y;
                                                        boolean bl12 = this.L();
                                                        QE qE2 = this.y.M();
                                                        try {
                                                            this.Y();
                                                            if (this.y()) {
                                                                this.y.h(false);
                                                            }
                                                        }
                                                        catch (O_ o_3) {
                                                            throw z8.a(o_3);
                                                        }
                                                        if (this.C()) {
                                                            float f10 = (float)this.y.o(Qb.u());
                                                            this.l *= f10;
                                                            this.x *= f10;
                                                        }
                                                        if (!this.y.L()) {
                                                            double d2 = this.y.F();
                                                            double d3 = this.y.B();
                                                            float f11 = this.y.d();
                                                            this.k(d2 - (double)f11 * 0.35, d3 + (double)f11 * 0.35);
                                                            this.k(d2 - (double)f11 * 0.35, d3 - (double)f11 * 0.35);
                                                            this.k(d2 + (double)f11 * 0.35, d3 - (double)f11 * 0.35);
                                                            this.k(d2 + (double)f11 * 0.35, d3 + (double)f11 * 0.35);
                                                        }
                                                        try {
                                                            if (bl11) {
                                                                this.v = 0;
                                                            }
                                                        }
                                                        catch (O_ o_4) {
                                                            throw z8.a(o_4);
                                                        }
                                                        bl6 = this.Z();
                                                        try {
                                                            bl9 = this.y.d() ? this.y.o().j() : this.y.j();
                                                        }
                                                        catch (O_ o_5) {
                                                            throw z8.a(o_5);
                                                        }
                                                        bl8 = bl9;
                                                        try {
                                                            try {
                                                                if (bl11 || bl12) break block72;
                                                            }
                                                            catch (O_ o_6) {
                                                                throw z8.a(o_6);
                                                            }
                                                            bl7 = true;
                                                            break block73;
                                                        }
                                                        catch (O_ o_7) {
                                                            throw z8.a(o_7);
                                                        }
                                                    }
                                                    bl7 = false;
                                                }
                                                boolean bl13 = bl7;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (!bl8 && !this.y.q()) break block74;
                                                                    }
                                                                    catch (O_ o_8) {
                                                                        throw z8.a(o_8);
                                                                    }
                                                                    if (!bl13) break block74;
                                                                }
                                                                catch (O_ o_9) {
                                                                    throw z8.a(o_9);
                                                                }
                                                                if (!bl6) break block74;
                                                            }
                                                            catch (O_ o_10) {
                                                                throw z8.a(o_10);
                                                            }
                                                            if (this.v > 0) break block75;
                                                        }
                                                        catch (O_ o_11) {
                                                            throw z8.a(o_11);
                                                        }
                                                        if (this.U) break block75;
                                                    }
                                                    catch (O_ o_12) {
                                                        throw z8.a(o_12);
                                                    }
                                                    this.v = (int)z8.a("p", (int)7541, (long)(0x12E5FD3081082402L ^ l10));
                                                    break block74;
                                                }
                                                catch (O_ o_13) {
                                                    throw z8.a(o_13);
                                                }
                                            }
                                            this.y.h(true);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (this.y.F() && !this.y.q()) break block76;
                                                    }
                                                    catch (O_ o_14) {
                                                        throw z8.a(o_14);
                                                    }
                                                    if (!bl6) break block76;
                                                }
                                                catch (O_ o_15) {
                                                    throw z8.a(o_15);
                                                }
                                                if (!this.U) break block76;
                                            }
                                            catch (O_ o_16) {
                                                throw z8.a(o_16);
                                            }
                                            this.y.h(true);
                                        }
                                        catch (O_ o_17) {
                                            throw z8.a(o_17);
                                        }
                                    }
                                    try {
                                        block78: {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block77;
                                                    if (!this.a()) break block78;
                                                }
                                                catch (O_ o_18) {
                                                    throw z8.a(o_18);
                                                }
                                                if (this.d()) break block79;
                                            }
                                            catch (O_ o_19) {
                                                throw z8.a(o_19);
                                            }
                                        }
                                        bl5 = true;
                                        break block80;
                                    }
                                    catch (O_ o_20) {
                                        throw z8.a(o_20);
                                    }
                                }
                                bl5 = false;
                            }
                            bl2 = bl5;
                            try {
                                block81: {
                                    try {
                                        try {
                                            block82: {
                                                try {
                                                    try {
                                                        if (bl2) break block81;
                                                        if (!this.y.P()) break block82;
                                                    }
                                                    catch (O_ o_21) {
                                                        throw z8.a(o_21);
                                                    }
                                                    if (!this.y.Q()) break block81;
                                                }
                                                catch (O_ o_22) {
                                                    throw z8.a(o_22);
                                                }
                                            }
                                            if (!this.y.F()) break block83;
                                        }
                                        catch (O_ o_23) {
                                            throw z8.a(o_23);
                                        }
                                        if (this.y.q()) break block83;
                                    }
                                    catch (O_ o_24) {
                                        throw z8.a(o_24);
                                    }
                                }
                                bl4 = true;
                                break block84;
                            }
                            catch (O_ o_25) {
                                throw z8.a(o_25);
                            }
                        }
                        bl4 = false;
                    }
                    bl3 = bl4;
                    try {
                        block87: {
                            try {
                                block86: {
                                    try {
                                        try {
                                            try {
                                                if (!this.y.f()) break block85;
                                                if (this.y.j()) break block86;
                                            }
                                            catch (O_ o_26) {
                                                throw z8.a(o_26);
                                            }
                                            if (this.n) break block86;
                                        }
                                        catch (O_ o_27) {
                                            throw z8.a(o_27);
                                        }
                                        if (bl2) break block87;
                                    }
                                    catch (O_ o_28) {
                                        throw z8.a(o_28);
                                    }
                                }
                                if (this.y.F()) break block77;
                            }
                            catch (O_ o_29) {
                                throw z8.a(o_29);
                            }
                        }
                        this.y.h(false);
                        break block77;
                    }
                    catch (O_ o_30) {
                        throw z8.a(o_30);
                    }
                }
                try {
                    if (bl3) {
                        this.y.h(false);
                    }
                }
                catch (O_ o_31) {
                    throw z8.a(o_31);
                }
            }
            bl2 = false;
            try {
                try {
                    try {
                        if (!this.y.F() || !this.n) break block88;
                    }
                    catch (O_ o_32) {
                        throw z8.a(o_32);
                    }
                    if (!this.y.n()) break block88;
                }
                catch (O_ o_33) {
                    throw z8.a(o_33);
                }
                this.M();
            }
            catch (O_ o_34) {
                throw z8.a(o_34);
            }
        }
        this.R();
    }

    private void k(double d2, double d3) {
        block10: {
            DK dK = DK.L(d2, this.y.V(), d3);
            if (this.B(dK)) {
                double d4 = d2 - (double)dK.o();
                double d5 = d3 - (double)dK.j();
                o5 o52 = null;
                double d6 = Double.MAX_VALUE;
                oo[] ooArray = new oo[]{o5.A(), o5.F(), o5.O(), o5.G()};
                for (oo oo2 : ooArray) {
                    double d7;
                    o5 o53 = new o5(oo2.M());
                    double d9 = o53.J().m(d4, 0.0, d5);
                    try {
                        d7 = o53.s().equals(og.m()) ? 1.0 - d9 : d9;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                    double d10 = d7;
                    try {
                        if (!(d10 < d6) || this.B(dK.I(o53))) continue;
                    }
                    catch (O_ o_3) {
                        throw z8.a(o_3);
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
                            this.y.L(0.1 * (double)o52.I(), dT.F(), dT.f());
                            break block10;
                        }
                        catch (O_ o_4) {
                            throw z8.a(o_4);
                        }
                    }
                    this.y.L(dT.X(), dT.F(), 0.1 * (double)o52.R());
                }
            }
        }
    }

    public void t(QL qL2, DT dT) {
        block43: {
            Hc hc2;
            boolean bl2;
            boolean bl3;
            DT dT2;
            block54: {
                block53: {
                    block48: {
                        boolean bl4;
                        Qh qh2;
                        block52: {
                            block51: {
                                boolean bl5;
                                Qh qh3;
                                block50: {
                                    block49: {
                                        boolean bl6;
                                        Qh qh4;
                                        block47: {
                                            block46: {
                                                boolean bl7;
                                                boolean bl8;
                                                block44: {
                                                    block45: {
                                                        block42: {
                                                            try {
                                                                if (!this.y.L()) break block42;
                                                                this.y.R(this.y.F() + dT.X(), this.y.V() + dT.F(), this.y.B() + dT.f());
                                                                break block43;
                                                            }
                                                            catch (O_ o_2) {
                                                                throw z8.a(o_2);
                                                            }
                                                        }
                                                        if (qL2.equals(QL.U())) {
                                                            dT = this.y.W(dT);
                                                            try {
                                                                if (dT.equals(DT.x())) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (O_ o_3) {
                                                                throw z8.a(o_3);
                                                            }
                                                        }
                                                        if (this.y.x().R() > 1.0E-7) {
                                                            dT = dT.D(this.y.x());
                                                            this.y.Z(DT.x());
                                                            this.y.R(DT.x());
                                                        }
                                                        dT = this.y.g(dT, qL2);
                                                        dT2 = this.y.I(dT);
                                                        double d2 = dT2.R();
                                                        try {
                                                            try {
                                                                try {
                                                                    if (!(d2 > 1.0E-7) && !(dT.R() - d2 < 1.0E-7)) break block44;
                                                                }
                                                                catch (O_ o_4) {
                                                                    throw z8.a(o_4);
                                                                }
                                                                if (this.y.W() == 0.0f) break block45;
                                                            }
                                                            catch (O_ o_5) {
                                                                throw z8.a(o_5);
                                                            }
                                                            if (!(d2 >= 1.0)) break block45;
                                                        }
                                                        catch (O_ o_6) {
                                                            throw z8.a(o_6);
                                                        }
                                                        ok ok2 = this.o.g(D1.Q(this.y.g(), this.y.g().P(dT2), DU.g(), DJ.a(), this.y));
                                                        try {
                                                            if (!ok2.q().equals(oV.u())) {
                                                                this.y.V(0.0f);
                                                            }
                                                        }
                                                        catch (O_ o_7) {
                                                            throw z8.a(o_7);
                                                        }
                                                    }
                                                    this.y.R(this.y.F() + dT2.X(), this.y.V() + dT2.F(), this.y.B() + dT2.f());
                                                }
                                                try {
                                                    bl8 = !cF.z(dT.X(), dT2.X());
                                                }
                                                catch (O_ o_8) {
                                                    throw z8.a(o_8);
                                                }
                                                bl3 = bl8;
                                                try {
                                                    bl7 = !cF.z(dT.f(), dT2.f());
                                                }
                                                catch (O_ o_9) {
                                                    throw z8.a(o_9);
                                                }
                                                bl2 = bl7;
                                                try {
                                                    try {
                                                        qh4 = this.y;
                                                        if (!bl3 && !bl2) break block46;
                                                    }
                                                    catch (O_ o_10) {
                                                        throw z8.a(o_10);
                                                    }
                                                    bl6 = true;
                                                    break block47;
                                                }
                                                catch (O_ o_11) {
                                                    throw z8.a(o_11);
                                                }
                                            }
                                            bl6 = false;
                                        }
                                        try {
                                            try {
                                                qh4.y(bl6);
                                                if (!(Math.abs(dT.F()) > 0.0)) break block48;
                                                qh3 = this.y;
                                                if (dT.F() == dT2.F()) break block49;
                                            }
                                            catch (O_ o_12) {
                                                throw z8.a(o_12);
                                            }
                                            bl5 = true;
                                            break block50;
                                        }
                                        catch (O_ o_13) {
                                            throw z8.a(o_13);
                                        }
                                    }
                                    bl5 = false;
                                }
                                try {
                                    try {
                                        qh3.g(bl5);
                                        qh2 = this.y;
                                        if (!this.y.D() || !(dT.F() < 0.0)) break block51;
                                    }
                                    catch (O_ o_14) {
                                        throw z8.a(o_14);
                                    }
                                    bl4 = true;
                                    break block52;
                                }
                                catch (O_ o_15) {
                                    throw z8.a(o_15);
                                }
                            }
                            bl4 = false;
                        }
                        qh2.s(bl4);
                        this.y.R(this.y.i(), this.y.P(), dT2);
                    }
                    try {
                        if (!this.y.P()) break block53;
                        this.y.x(this.o(dT2));
                        break block54;
                    }
                    catch (O_ o_16) {
                        throw z8.a(o_16);
                    }
                }
                this.y.x(false);
            }
            if (this.y.P()) {
                double d3;
                double d4;
                double d5;
                Qh qh5;
                hc2 = this.y.i();
                try {
                    qh5 = this.y;
                    d5 = bl3 ? 0.0 : ((DT)hc2).X();
                }
                catch (O_ o_17) {
                    throw z8.a(o_17);
                }
                try {
                    d4 = ((DT)hc2).F();
                    d3 = bl2 ? 0.0 : ((DT)hc2).f();
                }
                catch (O_ o_18) {
                    throw z8.a(o_18);
                }
                qh5.L(d5, d4, d3);
            }
            hc2 = this.y.e();
            Eh eh2 = this.o.T((DK)hc2).I();
            try {
                if (dT.F() != dT2.F()) {
                    eh2.h(this.o, this.y);
                }
            }
            catch (O_ o_19) {
                throw z8.a(o_19);
            }
            float f10 = this.y.O();
            this.y.R(this.y.i().U(f10, 1.0, f10));
        }
    }

    @Override
    public void C() {
        this.v = this.S.N();
        Qr qr2 = this.g.x(Qb.L());
        Qr qr3 = this.y.x(Qb.L());
        qr3.h();
        for (Object e10 : qr2.D()) {
            qr3.V(new QB(e10));
        }
    }

    private void a(DT dT) {
        block12: {
            double d2;
            block14: {
                block11: {
                    try {
                        if (!this.y.d()) break block11;
                        this.U(dT);
                        break block12;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                }
                if (this.y.f()) {
                    double d3;
                    block13: {
                        double d4;
                        d2 = this.y.q().F();
                        try {
                            d4 = d2 < -0.2 ? 0.085 : 0.06;
                        }
                        catch (O_ o_3) {
                            throw z8.a(o_3);
                        }
                        d3 = d4;
                        try {
                            try {
                                if (d2 <= 0.0 || this.y.A()) break block13;
                            }
                            catch (O_ o_4) {
                                throw z8.a(o_4);
                            }
                            if (this.o.V(DK.L(this.y.F(), this.y.V() + 1.0 - 0.1, this.y.B())).F()) break block14;
                        }
                        catch (O_ o_5) {
                            throw z8.a(o_5);
                        }
                    }
                    DT dT2 = this.y.i();
                    this.y.R(dT2.A(0.0, (d2 - dT2.F()) * d3, 0.0));
                }
            }
            if (this.y.M().K()) {
                d2 = this.y.i().F();
                this.U(dT);
                this.y.R(this.y.i().z(o0.Q(), d2 * 0.6));
            } else {
                this.U(dT);
            }
        }
    }

    private boolean T() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    if (!this.B()) break block4;
                    bl2 = this.I();
                    break block5;
                }
                catch (O_ o_2) {
                    throw z8.a(o_2);
                }
            }
            try {
                bl2 = (double)this.x >= 0.8;
            }
            catch (O_ o_3) {
                throw z8.a(o_3);
            }
        }
        return bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean g() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.y.V()) break block4;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw z8.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private boolean U() {
        return this.y.e(Hv.h);
    }

    private boolean L() {
        boolean bl2;
        block5: {
            block4: {
                double d2 = 0.8;
                try {
                    if (!this.y.q()) break block4;
                    bl2 = this.a();
                    break block5;
                }
                catch (O_ o_2) {
                    throw z8.a(o_2);
                }
            }
            try {
                bl2 = (double)this.x >= 0.8;
            }
            catch (O_ o_3) {
                throw z8.a(o_3);
            }
        }
        return bl2;
    }

    private DT j(DT dT, float f10) {
        DT dT2;
        block8: {
            block9: {
                this.y.l(this.y.s(f10), dT);
                this.y.R(this.y.M(this.y.i()));
                this.t(QL.s(), this.y.i());
                dT2 = this.y.i();
                try {
                    try {
                        try {
                            try {
                                if (!this.y.P() && !this.y.A()) break block8;
                            }
                            catch (O_ o_2) {
                                throw z8.a(o_2);
                            }
                            if (this.y.T()) break block9;
                        }
                        catch (O_ o_3) {
                            throw z8.a(o_3);
                        }
                        if (!this.y.X().m(QJ.W())) break block8;
                    }
                    catch (O_ o_4) {
                        throw z8.a(o_4);
                    }
                    if (!Eh.U(this.y)) break block8;
                }
                catch (O_ o_5) {
                    throw z8.a(o_5);
                }
            }
            dT2 = DT.N(dT2.X(), 0.2, dT2.f());
        }
        return dT2;
    }

    private void z() {
        this.y.R(this.y.i().A(0.0, 0.04f, 0.0));
    }

    public boolean B() {
        return this.y.q();
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2A9F;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/z8", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z8.e[n3] = n4;
        }
        return e[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(-8248469039860490356L, 9100955957451298911L, MethodHandles.lookup().lookupClass()).a(175844567030220L);
        f = new HashMap(13);
        long l10 = a ^ 0x550295EF9591L;
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
        String string = "\u00f3\u00b25\u0006\u009d\u00f5\b\u0098.\u00bb0\u00fd\u0098\u00a3\u00b1\u00c9";
        int n3 = "\u00f3\u00b25\u0006\u009d\u00f5\b\u0098.\u00bb0\u00fd\u0098\u00a3\u00b1\u00c9".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        e = new Integer[2];
    }

    private float x() {
        return (float)this.y.o(Qb.L());
    }

    private void a() {
        DT dT = this.y.i();
        this.y.R(this.q(dT));
        this.t(QL.s(), this.y.i());
    }

    protected boolean o(DT dT) {
        block4: {
            boolean bl2;
            float f10 = this.y.q() * ((float)Math.PI / 180);
            double d2 = cF.z(f10);
            double d3 = cF.O(f10);
            double d4 = (double)this.y.w() * d3 - (double)this.y.u() * d2;
            double d5 = (double)this.y.u() * d3 + (double)this.y.w() * d2;
            double d6 = cF.o(d4) + cF.o(d5);
            double d7 = cF.o(dT.X()) + cF.o(dT.f());
            try {
                if (d6 < (double)1.0E-5f || d7 < (double)1.0E-5f) break block4;
            }
            catch (O_ o_2) {
                throw z8.a(o_2);
            }
            double d9 = d4 * dT.X() + d5 * dT.f();
            double d10 = Math.acos(d9 / Math.sqrt(d6 * d7));
            try {
                bl2 = d10 < 0.13962633907794952;
            }
            catch (O_ o_3) {
                throw z8.a(o_3);
            }
            return bl2;
        }
        return false;
    }

    private void o() {
        block9: {
            long l10;
            block8: {
                l10 = a ^ 0x5CF6F25D84C9L;
                try {
                    try {
                        this.y.G(false);
                        if (!this.y.I() && !this.y.d()) break block8;
                    }
                    catch (O_ o_2) {
                        throw z8.a(o_2);
                    }
                    this.y.W(false);
                }
                catch (O_ o_3) {
                    throw z8.a(o_3);
                }
            }
            this.y.h();
            this.p();
            CallSite callSite = z8.a("p", (int)17084, (long)(0x642E1ADA5B250BB6L ^ l10));
            double d2 = cF.F(this.y.F(), -2.9999999E7, 2.9999999E7);
            double d3 = cF.F(this.y.B(), -2.9999999E7, 2.9999999E7);
            try {
                try {
                    if (d2 == this.y.F() && d3 == this.y.B()) break block9;
                }
                catch (O_ o_4) {
                    throw z8.a(o_4);
                }
                this.y.R(d2, this.y.V(), d3);
            }
            catch (O_ o_5) {
                throw z8.a(o_5);
            }
        }
        this.y.r();
    }

    public void U(DT dT) {
        block11: {
            block12: {
                block10: {
                    QU qU2 = this.o.V(this.y.C());
                    try {
                        try {
                            try {
                                try {
                                    if (!this.y.F() && !this.y.x()) break block10;
                                }
                                catch (O_ o_2) {
                                    throw z8.a(o_2);
                                }
                                if (!this.y.n()) break block10;
                            }
                            catch (O_ o_3) {
                                throw z8.a(o_3);
                            }
                            if (this.y.O(qU2)) break block10;
                        }
                        catch (O_ o_4) {
                            throw z8.a(o_4);
                        }
                        this.M(dT);
                        break block11;
                    }
                    catch (O_ o_5) {
                        throw z8.a(o_5);
                    }
                }
                try {
                    if (!this.y.C()) break block12;
                    this.a();
                    break block11;
                }
                catch (O_ o_6) {
                    throw z8.a(o_6);
                }
            }
            this.C(dT);
        }
    }

    private void M(DT dT) {
        block24: {
            double d2;
            block25: {
                double d3;
                boolean bl2;
                block20: {
                    DT dT2;
                    float f10;
                    block23: {
                        float f11;
                        block22: {
                            block21: {
                                boolean bl3;
                                try {
                                    bl3 = this.y.i().F() <= 0.0;
                                }
                                catch (O_ o_2) {
                                    throw z8.a(o_2);
                                }
                                bl2 = bl3;
                                d2 = this.y.V();
                                d3 = this.y.X();
                                try {
                                    try {
                                        if (!this.y.F()) break block20;
                                        if (!this.y.o()) break block21;
                                    }
                                    catch (O_ o_3) {
                                        throw z8.a(o_3);
                                    }
                                    f11 = 0.9f;
                                    break block22;
                                }
                                catch (O_ o_4) {
                                    throw z8.a(o_4);
                                }
                            }
                            f11 = this.y.I();
                        }
                        f10 = f11;
                        float f12 = 0.02f;
                        float f13 = (float)this.y.o(Qb.X());
                        if (!this.y.j()) {
                            f13 *= 0.5f;
                        }
                        if (f13 > 0.0f) {
                            f10 += (0.54600006f - f10) * f13;
                            f12 += (this.x() - f12) * f13;
                        }
                        if (this.y.e(Hv.Y)) {
                            f10 = 0.96f;
                        }
                        this.y.l(f12, dT);
                        this.t(QL.s(), this.y.i());
                        dT2 = this.y.i();
                        try {
                            if (!this.y.P() || !this.y.T()) break block23;
                        }
                        catch (O_ o_5) {
                            throw z8.a(o_5);
                        }
                        dT2 = DT.N(dT2.X(), 0.2, dT2.f());
                    }
                    dT2 = dT2.U(f10, 0.8f, f10);
                    this.y.R(this.y.X(d3, bl2, dT2));
                    break block25;
                }
                this.y.l(0.02f, dT);
                this.t(QL.s(), this.y.i());
                if (this.y.h(oT.u()) <= this.h()) {
                    this.y.R(this.y.i().U(0.5, 0.8f, 0.5));
                    DT dT3 = this.y.X(d3, bl2, this.y.i());
                    this.y.R(dT3);
                } else {
                    this.y.R(this.y.i().f(0.5));
                }
                try {
                    if (d3 != 0.0) {
                        this.y.R(this.y.i().A(0.0, -d3 / 4.0, 0.0));
                    }
                }
                catch (O_ o_6) {
                    throw z8.a(o_6);
                }
            }
            DT dT4 = this.y.i();
            try {
                try {
                    if (!this.y.P() || !this.y.u(dT4.X(), dT4.F() + (double)0.6f - this.y.V() + d2, dT4.f())) break block24;
                }
                catch (O_ o_7) {
                    throw z8.a(o_7);
                }
                this.y.L(dT4.X(), 0.3f, dT4.f());
            }
            catch (O_ o_8) {
                throw z8.a(o_8);
            }
        }
    }

    private boolean Z() {
        boolean bl2;
        block18: {
            block16: {
                try {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (this.y.o() || !this.L()) break block16;
                                                }
                                                catch (O_ o_2) {
                                                    throw z8.a(o_2);
                                                }
                                                if (!this.d()) break block16;
                                            }
                                            catch (O_ o_3) {
                                                throw z8.a(o_3);
                                            }
                                            if (this.U()) break block16;
                                        }
                                        catch (O_ o_4) {
                                            throw z8.a(o_4);
                                        }
                                        if (this.y.d()) break block16;
                                    }
                                    catch (O_ o_5) {
                                        throw z8.a(o_5);
                                    }
                                    if (this.y.C()) break block16;
                                }
                                catch (O_ o_6) {
                                    throw z8.a(o_6);
                                }
                                if (!this.C()) break block17;
                            }
                            catch (O_ o_7) {
                                throw z8.a(o_7);
                            }
                            if (!this.y.q()) break block16;
                        }
                        catch (O_ o_8) {
                            throw z8.a(o_8);
                        }
                    }
                    bl2 = true;
                    break block18;
                }
                catch (O_ o_9) {
                    throw z8.a(o_9);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private void j() {
        this.o();
    }

    private void R() {
        this.w();
        this.y.q((float)this.y.o(Qb.L()));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

