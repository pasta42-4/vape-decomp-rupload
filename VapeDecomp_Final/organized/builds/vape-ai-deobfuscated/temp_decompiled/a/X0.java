/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.A_;
import a.Aq;
import a.NY;
import a.Ne;
import a.OY;
import a.O_;
import a.QF;
import a.SE;
import a.k2;
import a.oQ;
import a.p5;
import a.tO;
import a.x4;
import a.xi;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class x0
extends x4<Aq> {
    private A_ m;
    private final Aq B = (Aq)this.n();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void R(p5 p52) {
        p52.getEntityRenderer().H(1.0);
        NY.Y();
        boolean bl2 = Ne.h.k(3042);
        try {
            if (!bl2) {
                Ne.h.y(3042);
            }
        }
        catch (O_ o_2) {
            throw x0.a(o_2);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d2 = tO.b();
        double d3 = tO.S();
        double d4 = tO.n();
        try {
            if (this.m == null) {
                this.m = SE.h.U().K(A_.class);
            }
        }
        catch (O_ o_3) {
            throw x0.a(o_3);
        }
        for (Object e10 : p52.getWorld().L()) {
            float f10;
            float f11;
            QF qF2 = new QF(e10);
            try {
                try {
                    if (SE.h.a().P(qF2) && this.B.r.s().booleanValue()) {
                        continue;
                    }
                }
                catch (O_ o_4) {
                    throw x0.a(o_4);
                }
            }
            catch (O_ o_5) {
                throw x0.a(o_5);
            }
            k2 k22 = this.B.K(p52.getThePlayer(), e10);
            try {
                if (k22 == null) {
                    continue;
                }
            }
            catch (O_ o_6) {
                throw x0.a(o_6);
            }
            double d5 = qF2.b();
            double d6 = qF2.q();
            double d7 = qF2.I();
            double d9 = d5 + (qF2.F() - d5) * (double)p52.getTicks();
            double d10 = d6 + (qF2.V() - d6) * (double)p52.getTicks();
            double d11 = d7 + (qF2.B() - d7) * (double)p52.getTicks();
            try {
                f11 = qF2.g();
                f10 = this.B.v.s() != false ? this.m.F() : 0.0f;
            }
            catch (O_ o_7) {
                throw x0.a(o_7);
            }
            float f12 = f11 + f10;
            oQ oQ2 = qF2.L();
            oQ oQ3 = oQ2.B(f12, f12, f12);
            try {
                try {
                    NY.x(d9 - (oQ3.F() - oQ3.f()) / 2.0, d10 + (oQ3.c() - qF2.V()), d11 - (oQ3.v() - oQ3.R()) / 2.0, oQ3.v() - oQ3.R(), oQ3.P() - oQ3.c(), oQ3.F() - oQ3.f(), 0.1, k22, null, d2, d3, d4);
                    if (!(this.m.F() > 0.0f) || !this.B.v.s().booleanValue()) continue;
                }
                catch (O_ o_8) {
                    throw x0.a(o_8);
                }
                if (!this.B.m.s().booleanValue()) continue;
            }
            catch (O_ o_9) {
                throw x0.a(o_9);
            }
            oQ3 = oQ2.B(qF2.g(), qF2.g(), qF2.g());
            Color color = new Color(255 - ((Color)k22).getRed(), 255 - ((Color)k22).getGreen(), 255 - ((Color)k22).getBlue(), 70);
            NY.x(d9 - (oQ3.F() - oQ3.f()) / 2.0, d10 - (oQ3.c() - qF2.V()), d11 - (oQ3.v() - oQ3.R()) / 2.0, oQ3.v() - oQ3.R(), oQ3.P() - oQ3.c(), oQ3.F() - oQ3.f(), 0.1, color, null, d2, d3, d4);
        }
        try {
            Ne.h.E(true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl2) {
                Ne.h.z(3042);
            }
        }
        catch (O_ o_10) {
            throw x0.a(o_10);
        }
        NY.J();
        p52.getEntityRenderer().F(1.0);
    }

    public x0(xi xi2, String string) {
        super(xi2, string);
    }
}

