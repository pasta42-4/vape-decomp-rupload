/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.B7;
import a.EP;
import a.Eh;
import a.F8;
import a.FG;
import a.G5;
import a.Ne;
import a.O2;
import a.O_;
import a.Rc;
import a.SE;
import a.oQ;
import a.sy;
import a.zD;
import a.z_;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class sl
extends Rc {
    private static int[] V;

    public static int[] S() {
        return V;
    }

    static {
        if (sl.S() == null) {
            sl.X(new int[5]);
        }
    }

    public void P(oQ oQ2, Color color, float f10) {
        try {
            if (F8.U()) {
                zD.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), f10, color);
                zD.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), f10, color);
                zD.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), f10, color);
                zD.N(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), f10, color);
                zD.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), f10, color);
                zD.N(oQ2.f(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.R(), f10, color);
                zD.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.c(), oQ2.R(), f10, color);
                zD.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), f10, color);
                zD.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), f10, color);
                zD.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), f10, color);
                zD.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.c(), oQ2.R(), f10, color);
                zD.N(oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), f10, color);
                return;
            }
        }
        catch (O_ o_2) {
            throw sl.a(o_2);
        }
        Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    @Override
    public O2 n() {
        return O2.n((int)this.P(), (int)this.K(), (int)this.N());
    }

    @Override
    public void G() {
        double d2;
        double d3;
        double d4;
        block10: {
            d4 = sy.Q(this.P());
            d3 = sy.Q(this.K());
            d2 = sy.Q(this.N());
            Eh eh2 = EP.c().R(d4, d3, d2);
            try {
                try {
                    if (eh2 != null && !eh2.Y()) break block10;
                }
                catch (O_ o_2) {
                    throw sl.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw sl.a(o_3);
            }
        }
        Ne.h.z();
        boolean bl2 = Ne.h.k(3042);
        try {
            if (!bl2) {
                Ne.h.y(3042);
            }
        }
        catch (O_ o_4) {
            throw sl.a(o_4);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.y(2848);
        Ne.h.h(2.0f);
        Ne.h.z(3553);
        Ne.h.E(false);
        double d5 = EP.r().L();
        double d6 = EP.r().D();
        double d7 = EP.r().s();
        Ne.h.m(-d5, -d6, -d7);
        Ne.h.m(d4, d3, d2);
        FG.V();
        Color color = Color.red;
        Color color2 = Color.red;
        try {
            this.x(oQ.E(-0.001, -0.001, -0.001, 1.001, 1.001, 1.001), color);
            this.P(oQ.E(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).B(0.002f, 0.002f, 0.002f), color2, 2.0f);
            Ne.h.E(true);
            FG.E();
            Ne.h.y(3553);
            if (!bl2) {
                Ne.h.z(3042);
            }
        }
        catch (O_ o_5) {
            throw sl.a(o_5);
        }
        Ne.h.z(2848);
        Ne.h.X();
    }

    public void x(oQ oQ2, Color color) {
        try {
            if (F8.U()) {
                zD.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), color);
                zD.F(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), color);
                zD.F(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                zD.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), color);
                zD.F(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), color);
                zD.F(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                return;
            }
        }
        catch (O_ o_2) {
            throw sl.a(o_2);
        }
        Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 0.6f);
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    public sl(z_ z_2, double[] dArray) {
        super(z_2, dArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void D(boolean bl2) {
        Color color = B7.U(this.d());
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 12.0;
        double d5 = d4 / 2.0;
        F8.r((float)(0.0 - d5), (float)(0.0 - d5 - 8.0), (float)d4, 6.0f, 1.0f, color);
        G5 g5 = SE.h.W().u(1.0, false);
        g5.P(this.z(), 0.0, 0.0 + d5 - 6.0, color);
    }

    public static void X(int[] nArray) {
        V = nArray;
    }
}

