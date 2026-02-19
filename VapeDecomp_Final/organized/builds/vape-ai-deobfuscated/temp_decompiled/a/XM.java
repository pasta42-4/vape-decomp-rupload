/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Aq;
import a.BD;
import a.Dy;
import a.E;
import a.F8;
import a.FG;
import a.G5;
import a.NY;
import a.Ne;
import a.OY;
import a.O_;
import a.QF;
import a.Qt;
import a.SE;
import a.ZN;
import a._q;
import a.eM;
import a.k2;
import a.kX;
import a.oQ;
import a.pq;
import a.pt;
import a.tl;
import a.vF;
import a.x4;
import a.xi;
import a.z6;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class xm
extends x4<Aq> {
    private final List<BD> V;
    private final Aq e = (Aq)this.n();

    @OY
    public void r(pt pt2) {
        block73: {
            block72: {
                try {
                    if (E.n()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw xm.a(o_2);
                }
                G5 g5 = SE.h.W().u(0.9, true);
                Ne.h.z();
                float f10 = 1.0f;
                float f11 = 2.0f;
                Ne.h.J(f10, f10, f10);
                tl.s();
                float f12 = Dy.v();
                boolean bl2 = GL11.glIsEnabled((int)3042);
                FG.V();
                for (BD bD2 : this.V) {
                    block63: {
                        double d2;
                        boolean bl3;
                        boolean bl4;
                        double d3;
                        double d4;
                        double d5;
                        double d6;
                        block57: {
                            block58: {
                                boolean bl5;
                                block56: {
                                    block55: {
                                        float f13;
                                        if (kX.C() >= 35) {
                                            f13 = pt2.getRenderManager().k();
                                            float f14 = pt2.getRenderManager().r();
                                        }
                                        f13 = pt2.getDisplayHeight();
                                        d6 = bD2.j / (double)f11 / (double)f10 / (double)f12;
                                        d5 = bD2.u / (double)f11 / (double)f10 / (double)f12;
                                        d4 = ((double)f13 - bD2.T / (double)f12) / (double)f11 / (double)f10;
                                        d3 = ((double)f13 - bD2.E / (double)f12) / (double)f11 / (double)f10;
                                        tl.R();
                                        Ne.h.h(1.0f);
                                        tl.N();
                                        String string = bD2.V.g();
                                        bl4 = bD2.V.Y();
                                        boolean bl6 = bD2.V.E();
                                        try {
                                            try {
                                                if (!bl6 && !bl4) break block55;
                                            }
                                            catch (O_ o_3) {
                                                throw xm.a(o_3);
                                            }
                                            bl5 = true;
                                            break block56;
                                        }
                                        catch (O_ o_4) {
                                            throw xm.a(o_4);
                                        }
                                    }
                                    bl5 = false;
                                }
                                bl3 = bl5;
                                try {
                                    try {
                                        if (!this.e.n.s().booleanValue()) break block57;
                                        if (!this.e.l.s().booleanValue()) break block58;
                                    }
                                    catch (O_ o_5) {
                                        throw xm.a(o_5);
                                    }
                                    if (!bl3) break block57;
                                }
                                catch (O_ o_6) {
                                    throw xm.a(o_6);
                                }
                            }
                            float f15 = (float)bD2.U.getAlpha() / 255.0f;
                            if (F8.U()) {
                                double d7 = d3 - d4;
                                d2 = d5 - d6;
                                double d9 = 1.0;
                                z6.M(d6, d4, d2, d9, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d6, d4, d9, d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d5, d3, -d9, -d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d5, d3, -d2, -d9, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                d7 = (d3 -= 1.0) - (d4 += 1.0);
                                d2 = (d5 -= 1.0) - (d6 += 1.0);
                                z6.M(d6, d4, d2, d9, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d6, d4, d9, d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d5, d3, -d9, -d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                z6.M(d5, d3, -d2, -d9, new Color(0.0f, 0.0f, 0.0f, 0.4f * f15));
                                d7 = (d3 += 0.5) - (d4 -= 0.5);
                                d2 = (d5 += 0.5) - (d6 -= 0.5);
                                z6.M(d6, d4, d2, d9, bD2.U);
                                z6.M(d6, d4, d9, d7, bD2.U);
                                z6.M(d5, d3, -d9, -d7, bD2.U);
                                z6.M(d5, d3, -d2, -d9, bD2.U);
                            } else {
                                Ne.h.R(0.0, 0.0, 0.0, 0.4 * (double)f15);
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)d6, (double)d4);
                                GL11.glVertex2d((double)d5, (double)d4);
                                GL11.glVertex2d((double)d5, (double)d3);
                                GL11.glVertex2d((double)d6, (double)d3);
                                GL11.glEnd();
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)(d6 + 1.0), (double)(d4 + 1.0));
                                GL11.glVertex2d((double)(d5 - 1.0), (double)(d4 + 1.0));
                                GL11.glVertex2d((double)(d5 - 1.0), (double)(d3 - 1.0));
                                GL11.glVertex2d((double)(d6 + 1.0), (double)(d3 - 1.0));
                                GL11.glEnd();
                                tl.N();
                                FG.Y(bD2.U);
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)(d6 + 0.5), (double)(d4 + 0.5));
                                GL11.glVertex2d((double)(d5 - 0.5), (double)(d4 + 0.5));
                                GL11.glVertex2d((double)(d5 - 0.5), (double)(d3 - 0.5));
                                GL11.glVertex2d((double)(d6 + 0.5), (double)(d3 - 0.5));
                                GL11.glEnd();
                                tl.j();
                            }
                        }
                        if (bD2.s.B(eM.Ut)) {
                            int n2;
                            double d10;
                            double d11;
                            String string;
                            G5 g52;
                            String string2;
                            block67: {
                                block71: {
                                    float f16;
                                    float f17;
                                    float f18;
                                    float f19;
                                    Color color;
                                    double d12;
                                    Color color2;
                                    block70: {
                                        Color color3;
                                        double d13;
                                        Color color4;
                                        Qt qt2;
                                        block69: {
                                            block68: {
                                                _q _q2;
                                                block66: {
                                                    String string3;
                                                    block65: {
                                                        block59: {
                                                            double d14;
                                                            double d15;
                                                            double d16;
                                                            double d17;
                                                            double d18;
                                                            block62: {
                                                                double d19;
                                                                block61: {
                                                                    block60: {
                                                                        qt2 = new Qt(bD2.s.M());
                                                                        float f20 = bD2.V.C();
                                                                        try {
                                                                            try {
                                                                                if (!this.e.j.s().booleanValue() || !(f20 >= 0.0f)) break block59;
                                                                            }
                                                                            catch (O_ o_7) {
                                                                                throw xm.a(o_7);
                                                                            }
                                                                            if (!(bD2.V.n() >= 0.0f)) break block59;
                                                                        }
                                                                        catch (O_ o_8) {
                                                                            throw xm.a(o_8);
                                                                        }
                                                                        d19 = Math.min(1.0f, f20 / bD2.V.n());
                                                                        try {
                                                                            if (!F8.U()) break block60;
                                                                            z6.n(d6 - 2.0, d3 - 0.5, d6 - 2.0, d4 + 0.5, d6 - 4.0, d4 + 0.5, d6 - 4.0, d3 - 0.5, new Color(0.0f, 0.0f, 0.0f, 0.4f));
                                                                            break block61;
                                                                        }
                                                                        catch (O_ o_9) {
                                                                            throw xm.a(o_9);
                                                                        }
                                                                    }
                                                                    tl.N();
                                                                    Ne.h.R(0.0, 0.0, 0.0, 0.4);
                                                                    GL11.glBegin((int)7);
                                                                    GL11.glVertex2d((double)(d6 - 2.0), (double)(d3 - 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 2.0), (double)(d4 + 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 4.0), (double)(d4 + 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 4.0), (double)(d3 - 0.5));
                                                                    GL11.glEnd();
                                                                }
                                                                double d20 = d3 - d4 - 1.0;
                                                                d18 = d4 + d20 * d19;
                                                                d17 = 0.0;
                                                                d16 = 0.0;
                                                                d15 = 0.0;
                                                                d14 = 0.0;
                                                                if (d19 >= 0.9) {
                                                                    d17 = 0.0;
                                                                    d16 = 1.0;
                                                                    d15 = 0.0;
                                                                    d14 = 1.0;
                                                                } else if (d19 >= 0.75) {
                                                                    d17 = 0.9;
                                                                    d16 = 1.0;
                                                                    d15 = 0.0;
                                                                    d14 = 1.0;
                                                                } else if (d19 >= 0.5) {
                                                                    d17 = 1.0;
                                                                    d16 = 1.0;
                                                                    d15 = 0.0;
                                                                    d14 = 1.0;
                                                                } else if (d19 >= 0.25) {
                                                                    d17 = 1.0;
                                                                    d16 = 0.5;
                                                                    d15 = 0.0;
                                                                    d14 = 1.0;
                                                                } else if (d19 >= 0.0) {
                                                                    d17 = 1.0;
                                                                    d16 = 0.0;
                                                                    d15 = 0.0;
                                                                    d14 = 1.0;
                                                                }
                                                                try {
                                                                    if (!F8.U()) break block62;
                                                                    z6.n(d6 - 2.5, d18, d6 - 2.5, d4 + 1.0, d6 - 3.5, d4 + 1.0, d6 - 3.5, d18, new Color((int)(d17 * 255.0), (int)(d16 * 255.0), (int)(d15 * 255.0), (int)(d14 * 255.0)));
                                                                    break block59;
                                                                }
                                                                catch (O_ o_10) {
                                                                    throw xm.a(o_10);
                                                                }
                                                            }
                                                            GL11.glColor4d((double)d17, (double)d16, (double)d15, (double)d14);
                                                            GL11.glBegin((int)7);
                                                            GL11.glVertex2d((double)(d6 - 2.5), (double)d18);
                                                            GL11.glVertex2d((double)(d6 - 2.5), (double)(d4 + 1.0));
                                                            GL11.glVertex2d((double)(d6 - 3.5), (double)(d4 + 1.0));
                                                            GL11.glVertex2d((double)(d6 - 3.5), (double)d18);
                                                            GL11.glEnd();
                                                        }
                                                        try {
                                                            block64: {
                                                                try {
                                                                    try {
                                                                        if (!this.e.V.s().booleanValue()) break block63;
                                                                        if (!this.e.Y.s().booleanValue()) break block64;
                                                                    }
                                                                    catch (O_ o_11) {
                                                                        throw xm.a(o_11);
                                                                    }
                                                                    if (!bl3) break block65;
                                                                }
                                                                catch (O_ o_12) {
                                                                    throw xm.a(o_12);
                                                                }
                                                            }
                                                            string3 = bD2.V.g();
                                                            break block66;
                                                        }
                                                        catch (O_ o_13) {
                                                            throw xm.a(o_13);
                                                        }
                                                    }
                                                    string3 = string2 = bD2.V.B();
                                                }
                                                if (this.e.Y.s().booleanValue()) {
                                                    string2 = string2.replaceAll("[^\u00a7^\\x00-\\x7F]", "");
                                                }
                                                if (bl4 && (_q2 = SE.h.j().A(bD2.V.g())) != null) {
                                                    string2 = _q2.x();
                                                }
                                                d2 = g5.D(string2);
                                                try {
                                                    try {
                                                        if (!this.e.e.s().booleanValue()) break block67;
                                                        if (!bl3) break block68;
                                                    }
                                                    catch (O_ o_14) {
                                                        throw xm.a(o_14);
                                                    }
                                                    color4 = bD2.U;
                                                    break block69;
                                                }
                                                catch (O_ o_15) {
                                                    throw xm.a(o_15);
                                                }
                                            }
                                            color4 = new Color(0, 0, 0, 95);
                                        }
                                        color2 = color4;
                                        tl.R();
                                        boolean bl7 = qt2.H();
                                        try {
                                            d13 = bl7 ? 1.5 : 0.5;
                                        }
                                        catch (O_ o_16) {
                                            throw xm.a(o_16);
                                        }
                                        d12 = d13;
                                        try {
                                            color3 = bl7 ? new Color(255, 0, 0, 200) : new Color(0, 0, 0, 102);
                                        }
                                        catch (O_ o_17) {
                                            throw xm.a(o_17);
                                        }
                                        color = color3;
                                        f19 = (float)(d5 + (d6 - d5) / 2.0 - d2 / 2.0 - 1.5);
                                        f18 = (float)(d4 - 10.0);
                                        f17 = (float)(d5 + (d6 - d5) / 2.0 + d2 / 2.0 + 1.5);
                                        f16 = (float)(d4 - 1.0);
                                        try {
                                            if (!F8.U()) break block70;
                                            z6.h(f19, f18 + 1.0f, f17 - f19, f16 - f18 + 1.0f, d12, color2, color);
                                            break block71;
                                        }
                                        catch (O_ o_18) {
                                            throw xm.a(o_18);
                                        }
                                    }
                                    FG.n(f19, f18, f17, f16, d12, color2, color);
                                }
                                tl.B();
                            }
                            try {
                                g52 = g5;
                                string = string2;
                                d11 = d5 + (d6 - d5) / 2.0 - d2 / 2.0;
                                d10 = d4 - 8.0;
                                n2 = bl3 ? -1 : bD2.U.getRGB();
                            }
                            catch (O_ o_19) {
                                throw xm.a(o_19);
                            }
                            g52.S(string, d11, d10, n2);
                        }
                    }
                    Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                    Ne.h.z(2848);
                    tl.B();
                }
                try {
                    FG.E();
                    if (!bl2) break block72;
                    tl.N();
                    break block73;
                }
                catch (O_ o_20) {
                    throw xm.a(o_20);
                }
            }
            tl.j();
        }
        NY.J();
        this.V.clear();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void d(pq pq2) {
        block10: {
            try {
                if (pq2.getWorld().Y()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw xm.a(o_2);
            }
            QF qF2 = pq2.getEntity();
            double d2 = pq2.getX();
            double d3 = pq2.getY();
            double d4 = pq2.getZ();
            k2 k22 = this.e.K(pq2.getThePlayer(), qF2.M());
            try {
                if (k22 == null) {
                    return;
                }
            }
            catch (O_ o_3) {
                throw xm.a(o_3);
            }
            Qt qt2 = new Qt(qF2.M());
            NY.Y();
            float f10 = qF2.g();
            oQ oQ2 = qF2.L().B(f10, f10, f10);
            oQ oQ3 = oQ.E(oQ2.F() - qF2.F(), oQ2.c() - qF2.V(), oQ2.v() - qF2.B(), oQ2.f() - qF2.F(), oQ2.P() - qF2.V(), oQ2.R() - qF2.B());
            ZN zN2 = vF.a(qt2, pq2.getThePlayer());
            BD bD2 = new BD(d2, d3, d4, oQ3, qF2, zN2, k22);
            try {
                try {
                    if (!bD2.B) break block10;
                    this.V.add(bD2);
                    if (!this.e.V.s().booleanValue()) break block10;
                }
                catch (O_ o_4) {
                    throw xm.a(o_4);
                }
                pq2.setCanceled(true);
            }
            catch (O_ o_5) {
                throw xm.a(o_5);
            }
        }
        NY.J();
    }

    public xm(xi xi2, String string) {
        super(xi2, string);
        this.V = new ArrayList<BD>();
    }
}

