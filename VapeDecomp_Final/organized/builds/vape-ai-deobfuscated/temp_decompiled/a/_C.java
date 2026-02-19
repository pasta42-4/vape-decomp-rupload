/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D;
import a.GM;
import a.Ge;
import a.IR;
import a.Ix;
import a.NS;
import a.O4;
import a.WJ;
import a.WW;
import a.ZV;
import a._H;
import a._s;
import a._y;
import a.a7;
import a.c4;
import a.eq;
import a.er;
import a.h2;
import a.sS;
import a.sY;
import a.sr;

public abstract class _c
extends _y {
    protected c4 G;

    /*
     * Unable to fully structure code
     */
    public void X(String var1_1, boolean var2_2, boolean var3_3) throws WW {
        var4_4 = this.k;
        var4_4.m();
        var5_5 = this.G.v();
        var6_6 = this.G.Z();
        try {
            if (var6_6 == null) {
                throw new WW("no method body");
            }
        }
        catch (WJ v0) {
            throw _c.a(v0);
        }
        var7_7 = var6_6.h();
        var8_8 = var6_6.i();
        var9_9 = new IR(var5_5, 0, var8_8 + 1);
        var9_9.Z(var6_6.Q() + 1);
        var10_10 = new h2(var9_9, var4_4);
        try {
            var11_11 = var10_10.n(this.C(), Ix.O(this.A()));
            var10_10.K(var6_6, var11_11);
            var12_15 = this.P();
            var13_16 = var10_10.Y(var12_15, true);
            var10_10.X(var6_6, 0);
            var14_17 = this.O(var2_2, var9_9, var12_15, var13_16, var10_10, var1_1);
            var15_18 = var7_7.d();
            try {
                if (var2_2) {
                    var6_6.u().E(this.p(var6_6), var15_18, var15_18, 0);
                }
            }
            catch (WJ v1) {
                throw _c.a(v1);
            }
            var16_19 = 0;
            var17_20 = 0;
            var18_21 = true;
            while (var7_7.L()) {
                block30: {
                    block32: {
                        block31: {
                            block37: {
                                block36: {
                                    block35: {
                                        block34: {
                                            block33: {
                                                var19_22 = var7_7.S();
                                                try {
                                                    if (var19_22 >= var15_18) {
                                                        break;
                                                    }
                                                }
                                                catch (WJ v2) {
                                                    throw _c.a(v2);
                                                }
                                                var20_23 = var7_7.z(var19_22);
                                                if (var20_23 == 176) ** GOTO lbl75
                                                if (var20_23 == 172) ** GOTO lbl75
                                                break block33;
                                                catch (WJ v3) {
                                                    throw _c.a(v3);
                                                }
                                            }
                                            if (var20_23 == 174) ** GOTO lbl75
                                            break block34;
                                            catch (WJ v4) {
                                                throw _c.a(v4);
                                            }
                                        }
                                        if (var20_23 == 173) ** GOTO lbl75
                                        break block35;
                                        catch (WJ v5) {
                                            throw _c.a(v5);
                                        }
                                    }
                                    if (var20_23 == 175) ** GOTO lbl75
                                    break block36;
                                    catch (WJ v6) {
                                        throw _c.a(v6);
                                    }
                                }
                                if (var20_23 != 177) continue;
                                break block37;
                                catch (WJ v7) {
                                    throw _c.a(v7);
                                }
                            }
                            try {
                                block38: {
                                    if (!var3_3) break block30;
                                    break block38;
                                    catch (WJ v8) {
                                        throw _c.a(v8);
                                    }
                                }
                                var7_7.D(var15_18);
                                if (!var18_21) break block31;
                            }
                            catch (WJ v9) {
                                throw _c.a(v9);
                            }
                            var18_21 = false;
                            var21_24 = var9_9;
                            var22_25 = var10_10;
                            var23_26 = var13_16;
                            break block32;
                        }
                        var21_24 = new IR(var5_5, 0, var8_8 + 1);
                        var21_24.Z(var6_6.Q() + 1);
                        var22_25 = new h2(var21_24, var4_4);
                        var24_27 = var22_25.n(this.C(), Ix.O(this.A()));
                        var22_25.K(var6_6, var24_27);
                        var23_26 = var22_25.Y(var12_15, true);
                        var22_25.X(var6_6, 0);
                    }
                    var24_27 = this.i(var21_24, var22_25, var1_1, var5_5, var12_15, var23_26);
                    var25_28 = var7_7.z(var21_24.u());
                    var7_7.J(var21_24.w(), var25_28);
                    var26_29 = var7_7.d() - var24_27;
                    this.g(var7_7, var26_29, var19_22);
                    var15_18 = var7_7.f();
                    continue;
                }
                if (var18_21) {
                    var16_19 = this.i(var9_9, var10_10, var1_1, var5_5, var12_15, var13_16);
                    var15_18 = var7_7.z(var9_9.u());
                    var7_7.J(var9_9.w(), var15_18);
                    var17_20 = var7_7.d() - var16_19;
                    var14_17 = var17_20 - var15_18;
                    var18_21 = false;
                }
                this.g(var7_7, var17_20, var19_22);
                var17_20 = var7_7.d() - var16_19;
                var15_18 = var17_20 - var14_17;
            }
            if (var18_21) {
                var15_18 = var7_7.z(var9_9.u());
                var7_7.J(var9_9.w(), var15_18);
            }
            var6_6.D(var9_9.L());
            var6_6.J(var9_9.D());
            this.G.w(var4_4.K(), var4_4.o());
        }
        catch (WJ var11_12) {
            throw new WW(var11_12);
        }
        catch (_H var11_13) {
            throw new WW(var11_13);
        }
        catch (a7 var11_14) {
            throw new WW(var11_14);
        }
    }

    protected _c(GM gM, c4 c42) {
        super(gM);
        this.G = c42;
    }

    public int E(int n2, boolean bl2, String string) throws WW {
        sS sS2 = this.G.Z();
        try {
            if (sS2 == null) {
                throw new WW("no method body");
            }
        }
        catch (WJ wJ2) {
            throw _c.a(wJ2);
        }
        sY sY2 = (sY)sS2.G("LineNumberTable");
        try {
            if (sY2 == null) {
                throw new WW("no line number info");
            }
        }
        catch (WJ wJ3) {
            throw _c.a(wJ3);
        }
        er er2 = sY2.B(n2);
        n2 = er2.u;
        int n3 = er2.n;
        try {
            if (!bl2) {
                return n2;
            }
        }
        catch (WJ wJ4) {
            throw _c.a(wJ4);
        }
        GM gM = this.k;
        gM.m();
        NS nS = sS2.h();
        h2 h22 = new h2(gM);
        try {
            h22.X(sS2, n3);
            h22.n(this.C(), Ix.O(this.A()));
            h22.A(sS2.i());
            h22.b(string);
            IR iR2 = h22.k();
            int n4 = iR2.D();
            int n5 = iR2.L();
            try {
                sS2.J(n4);
                if (n5 > sS2.Q()) {
                    sS2.D(n5);
                }
            }
            catch (WJ wJ5) {
                throw _c.a(wJ5);
            }
            n3 = nS.z(n3, iR2.u());
            nS.P(iR2.w(), n3);
            this.G.w(gM.K(), gM.o());
            return n2;
        }
        catch (WJ wJ6) {
            throw new WW(wJ6);
        }
        catch (_H _H2) {
            throw new WW(_H2);
        }
        catch (a7 a72) {
            throw new WW(a72);
        }
    }

    public void x(D d2) throws WW {
        try {
            if (this.k.c()) {
                this.k.m();
            }
        }
        catch (WW wW2) {
            throw _c.a(wW2);
        }
        try {
            if (d2.Y(this.k, this.G)) {
                this.k.m();
            }
        }
        catch (WW wW3) {
            throw _c.a(wW3);
        }
    }

    public void V(String string) throws WW {
        this.L(string, true);
    }

    public c4 a() {
        return this.G;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void L(String string, boolean bl2) throws WW {
        GM gM = this.k;
        gM.m();
        sS sS2 = this.G.Z();
        try {
            if (sS2 == null) {
                throw new WW("no method body");
            }
        }
        catch (WJ wJ2) {
            throw _c.a(wJ2);
        }
        NS nS = sS2.h();
        h2 h22 = new h2(gM);
        try {
            int n2 = h22.n(this.C(), Ix.O(this.A()));
            h22.K(sS2, n2);
            h22.X(sS2, 0);
            h22.Y(this.P(), false);
            h22.b(string);
            IR iR2 = h22.k();
            int n3 = iR2.L();
            int n4 = iR2.D();
            try {
                if (n3 > sS2.Q()) {
                    sS2.D(n3);
                }
            }
            catch (WJ wJ3) {
                throw _c.a(wJ3);
            }
            try {
                if (n4 > sS2.i()) {
                    sS2.J(n4);
                }
            }
            catch (WJ wJ4) {
                throw _c.a(wJ4);
            }
            int n5 = nS.X(iR2.u());
            try {
                nS.P(iR2.w(), n5);
                if (bl2) {
                    this.G.w(gM.K(), gM.o());
                }
            }
            catch (WJ wJ5) {
                throw _c.a(wJ5);
            }
        }
        catch (WJ wJ6) {
            throw new WW(wJ6);
        }
        catch (_H _H2) {
            throw new WW(_H2);
        }
        catch (a7 a72) {
            throw new WW(a72);
        }
    }

    public void o(String string, GM gM) throws WW {
        this.k.m();
        eq eq2 = this.G.v();
        sS sS2 = this.G.Z();
        try {
            if (sS2 == null) {
                throw new WW("no method body");
            }
        }
        catch (WW wW2) {
            throw _c.a(wW2);
        }
        sr sr2 = (sr)sS2.G("LocalVariableTable");
        if (sr2 == null) {
            sr2 = new sr(eq2);
            sS2.w().add(sr2);
        }
        int n2 = sS2.i();
        String string2 = _s.H(gM);
        sr2.D(0, sS2.O(), eq2.D(string), eq2.D(string2), n2);
        sS2.J(n2 + _s.q(string2));
    }

    public GM[] C() throws WJ {
        return _s.Z(this.G.b(), this.k.K());
    }

    @Override
    public String I() {
        return this.G.b();
    }

    private int O(boolean bl2, IR iR2, GM gM, int n2, h2 h22, String string) throws _H {
        int n3;
        int n4;
        block14: {
            try {
                if (!bl2) {
                    return 0;
                }
            }
            catch (_H _H2) {
                throw _c.a(_H2);
            }
            n4 = iR2.D();
            iR2.J(1);
            n3 = iR2.H();
            iR2.S(n4);
            if (gM.m()) {
                block17: {
                    char c10;
                    block16: {
                        block15: {
                            block13: {
                                c10 = ((Ge)gM).y();
                                try {
                                    if (c10 != 'D') break block13;
                                    iR2.p(0.0);
                                    iR2.N(n2);
                                    break block14;
                                }
                                catch (_H _H3) {
                                    throw _c.a(_H3);
                                }
                            }
                            try {
                                if (c10 != 'F') break block15;
                                iR2.s(0.0f);
                                iR2.q(n2);
                                break block14;
                            }
                            catch (_H _H4) {
                                throw _c.a(_H4);
                            }
                        }
                        try {
                            if (c10 != 'J') break block16;
                            iR2.M(0L);
                            iR2.x(n2);
                            break block14;
                        }
                        catch (_H _H5) {
                            throw _c.a(_H5);
                        }
                    }
                    try {
                        if (c10 != 'V') break block17;
                        iR2.E(1);
                        iR2.S(n2);
                        break block14;
                    }
                    catch (_H _H6) {
                        throw _c.a(_H6);
                    }
                }
                iR2.a(0);
                iR2.o(n2);
            } else {
                iR2.E(1);
                iR2.S(n2);
            }
        }
        h22.b(string);
        iR2.B(n4);
        iR2.E(191);
        return iR2.H() - n3;
    }

    public void P(String string, GM gM) throws WW {
        this.C(string, gM, "$e");
    }

    @Override
    public int A() {
        return ZV.X(this.G.Z());
    }

    private int i(IR iR2, h2 h22, String string, eq eq2, GM gM, int n2) throws _H {
        int n3;
        block7: {
            block8: {
                block6: {
                    n3 = iR2.H();
                    try {
                        try {
                            if (gM != GM.M) break block6;
                            iR2.E(1);
                            iR2.S(n2);
                            h22.b(string);
                            iR2.E(177);
                            if (iR2.D() >= 1) break block7;
                        }
                        catch (_H _H2) {
                            throw _c.a(_H2);
                        }
                        iR2.e(1);
                        break block7;
                    }
                    catch (_H _H3) {
                        throw _c.a(_H3);
                    }
                }
                try {
                    iR2.P(n2, gM);
                    h22.b(string);
                    iR2.y(n2, gM);
                    if (!gM.m()) break block8;
                    iR2.E(((Ge)gM).G());
                    break block7;
                }
                catch (_H _H4) {
                    throw _c.a(_H4);
                }
            }
            iR2.E(176);
        }
        return iR2.H() - n3;
    }

    public void C(String string, GM gM, String string2) throws WW {
        GM gM2 = this.k;
        gM2.m();
        eq eq2 = this.G.v();
        sS sS2 = this.G.Z();
        NS nS = sS2.h();
        IR iR2 = new IR(eq2, sS2.Q(), sS2.i());
        iR2.Z(1);
        h2 h22 = new h2(iR2, gM2);
        try {
            h22.n(this.C(), Ix.O(this.A()));
            int n2 = h22.a(gM, string2);
            iR2.S(n2);
            h22.b(string);
            int n3 = iR2.L();
            int n4 = iR2.D();
            try {
                if (n3 > sS2.Q()) {
                    sS2.D(n3);
                }
            }
            catch (WJ wJ2) {
                throw _c.a(wJ2);
            }
            try {
                if (n4 > sS2.i()) {
                    sS2.J(n4);
                }
            }
            catch (WJ wJ3) {
                throw _c.a(wJ3);
            }
            int n5 = nS.d();
            int n6 = nS.z(iR2.u());
            sS2.u().E(this.p(sS2), n5, n5, eq2.A(gM));
            nS.J(iR2.w(), n6);
            this.G.w(gM2.K(), gM2.o());
        }
        catch (WJ wJ4) {
            throw new WW(wJ4);
        }
        catch (_H _H2) {
            throw new WW(_H2);
        }
        catch (a7 a72) {
            throw new WW(a72);
        }
    }

    private void g(NS nS, int n2, int n3) throws a7 {
        block10: {
            O4 o42;
            block11: {
                int n4;
                block9: {
                    int n5;
                    boolean bl2;
                    try {
                        nS.q(n2);
                        nS.g(0, n3);
                        bl2 = n2 + 2 - n3 > Short.MAX_VALUE;
                    }
                    catch (a7 a72) {
                        throw _c.a(a72);
                    }
                    boolean bl3 = bl2;
                    try {
                        n5 = bl3 ? 4 : 2;
                    }
                    catch (a7 a73) {
                        throw _c.a(a73);
                    }
                    int n6 = n5;
                    o42 = nS.J(n3, n6, false);
                    n3 = o42.m + o42.X - n6;
                    n4 = nS.M() - n3;
                    try {
                        if (!bl3) break block9;
                        nS.g(200, n3);
                        nS.k(n4, n3 + 1);
                        break block10;
                    }
                    catch (a7 a74) {
                        throw _c.a(a74);
                    }
                }
                try {
                    if (n4 > Short.MAX_VALUE) break block11;
                    nS.g(167, n3);
                    nS.V(n4, n3 + 1);
                    break block10;
                }
                catch (a7 a75) {
                    throw _c.a(a75);
                }
            }
            if (o42.X < 4) {
                O4 o43 = nS.J(o42.m, 2, false);
                n3 = o43.m + o43.X + o42.X - 4;
            }
            nS.g(200, n3);
            nS.k(nS.M() - n3, n3 + 1);
        }
    }

    GM P() throws WJ {
        return _s.X(this.G.b(), this.k.K());
    }

    int p(sS sS2) throws WW {
        return 0;
    }

    public void j(String string) throws WW {
        this.X(string, false, false);
    }

    public int p(int n2, String string) throws WW {
        return this.E(n2, true, string);
    }

    @Override
    protected void r(StringBuilder stringBuilder) {
        stringBuilder.append(' ');
        stringBuilder.append(this.l());
        stringBuilder.append(' ');
        stringBuilder.append(this.G.b());
    }
}

