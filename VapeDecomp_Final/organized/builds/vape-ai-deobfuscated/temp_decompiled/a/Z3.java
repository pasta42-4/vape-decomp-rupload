/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.O_;
import a.WC;
import a.ej;
import a.z6;
import org.lwjgl.opengl.GL11;

public class z3
implements WC {
    private int[] r = new int[]{3008, 3553, 2896};

    @Override
    public void z() {
        z6.D.F();
    }

    @Override
    public void b(double d2, double d3, double d4) {
        this.t((float)d2, (float)d3, (float)d4);
    }

    @Override
    public float h(int n2) {
        try {
            if (n2 == 3010) {
                return 0.0f;
            }
        }
        catch (O_ o_2) {
            throw z3.a(o_2);
        }
        return GL11.glGetFloat((int)n2);
    }

    @Override
    public void a(float f10, float f11, float f12) {
    }

    @Override
    public void x(double d2, double d3, double d4) {
        this.J((float)d2, (float)d3, (float)d4);
    }

    @Override
    public void m(double d2, float f10, float f11) {
    }

    @Override
    public void h(float f10) {
    }

    @Override
    public void i(int n2) {
    }

    @Override
    public void R(double d2, double d3, double d4, double d5) {
    }

    @Override
    public void d(float f10, float f11, float f12) {
        z6.D.e(f10, f11, f12);
    }

    @Override
    public void z(int n2) {
        for (int n3 : this.r) {
            try {
                if (n2 != n3) continue;
                return;
            }
            catch (O_ o_2) {
                throw z3.a(o_2);
            }
        }
        z6.N.j(n2);
        GL11.glDisable((int)n2);
    }

    @Override
    public void C(int n2, int n3, int n4, int n5) {
        z6.i = new ej(n2, n3, n4, n5);
        GL11.glScissor((int)n2, (int)n3, (int)n4, (int)n5);
    }

    @Override
    public void q(float f10, float f11, float f12, float f13) {
    }

    @Override
    public void E(boolean bl2) {
        z6.N.X(bl2);
    }

    @Override
    public void X() {
        z6.D.J();
    }

    @Override
    public boolean k(int n2) {
        int n3 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n3 >= this.r.length) break;
                        if (n2 != this.r[n3]) break block5;
                    }
                    catch (O_ o_2) {
                        throw z3.a(o_2);
                    }
                    return false;
                }
                catch (O_ o_3) {
                    throw z3.a(o_3);
                }
            }
            ++n3;
        }
        return GL11.glIsEnabled((int)n2);
    }

    @Override
    public void O(float f10, double d2, double d3, double d4) {
        this.f(f10, (float)d2, (float)d3, (float)d4);
    }

    @Override
    public void t(double d2, double d3, double d4) {
    }

    @Override
    public int S(int n2) {
        try {
            if (n2 == 3009) {
                return 0;
            }
        }
        catch (O_ o_2) {
            throw z3.a(o_2);
        }
        return GL11.glGetInteger((int)n2);
    }

    @Override
    public void t(float f10, float f11, float f12) {
    }

    @Override
    public void w() {
    }

    @Override
    public void p(int n2, float f10) {
    }

    @Override
    public void f(float f10, float f11, float f12, float f13) {
        z6.D.G(f10, f11, f12, f13);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void a() {
    }

    @Override
    public void m(double d2, double d3, double d4) {
        this.d((float)d2, (float)d3, (float)d4);
    }

    @Override
    public void J(float f10, float f11, float f12) {
        z6.D.I(f10, f11, f12);
    }

    @Override
    public void y(int n2) {
        for (int n3 : this.r) {
            try {
                if (n2 != n3) continue;
                return;
            }
            catch (O_ o_2) {
                throw z3.a(o_2);
            }
        }
        z6.N.e(n2);
        GL11.glEnable((int)n2);
    }
}

