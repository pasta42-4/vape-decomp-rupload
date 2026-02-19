/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.EP;
import a.F8;
import a.KP;
import a.Ne;
import a.O_;
import a.SE;
import a.WB;
import a.e;
import a.tl;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;

public class r {
    private int J;
    private int W = -1;
    private int t;
    private static int e;
    private boolean X = false;

    static {
        if (r.x() == 0) {
            r.h(87);
        }
    }

    public void Z(int n2, int n3) {
        block4: {
            double d2 = SE.h.a().b();
            n2 = (int)((double)n2 * d2);
            n3 = (int)((double)n3 * d2);
            try {
                try {
                    if (this.J != n2 || this.t != n3) break block4;
                }
                catch (O_ o_2) {
                    throw r.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw r.a(o_3);
            }
        }
        this.J = n2;
        this.t = n3;
        this.X = false;
    }

    public void q(int n2, int n3, float f10, float f11) {
        e e10;
        Supplier<Void> supplier;
        int n4;
        try {
            if (!EP.N().s()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw r.a(o_2);
        }
        float f12 = 2.0f;
        double d2 = SE.h.a().b();
        n2 = (int)((double)n2 * d2);
        n3 = (int)((double)n3 * d2);
        int n5 = EP.b();
        int n6 = (int)((float)n5 - (float)n3 * f12 - (float)this.t);
        try {
            if (!this.X) {
                this.q();
            }
        }
        catch (O_ o_3) {
            throw r.a(o_3);
        }
        float f13 = 0.5f;
        f13 = (float)((double)f13 / d2);
        try {
            Ne.h.z();
            if (!F8.U()) {
                Ne.h.x(f13, f13, f13);
            }
        }
        catch (O_ o_4) {
            throw r.a(o_4);
        }
        try {
            if (!F8.U()) {
                GL11.glBindTexture((int)3553, (int)this.W);
            }
        }
        catch (O_ o_5) {
            throw r.a(o_5);
        }
        if (F8.U()) {
            block24: {
                n4 = n2;
                supplier = () -> this.lambda$renderBlur$0(n4, f12, n6);
                try {
                    try {
                        if (this.J != 0 && this.t != 0) break block24;
                    }
                    catch (O_ o_6) {
                        throw r.a(o_6);
                    }
                    return;
                }
                catch (O_ o_7) {
                    throw r.a(o_7);
                }
            }
            e10 = new e().Q(supplier).D(new WB(this.W)).E(n2, n3, (float)this.J / 2.0f, (float)this.t / 2.0f, f10, f11, 1.0f, 0.0f);
            KP.x().p(e10);
        } else {
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n2 * f12)), (int)n6, (int)this.J, (int)this.t);
            F8.g((float)n2 * f12, (float)n3 * f12, this.J, this.t, f10, f11, 1.0f, 0);
        }
        if (F8.U()) {
            block25: {
                n4 = n2;
                supplier = () -> this.lambda$renderBlur$1(n4, f12, n6);
                try {
                    try {
                        if (this.J != 0 && this.t != 0) break block25;
                    }
                    catch (O_ o_8) {
                        throw r.a(o_8);
                    }
                    return;
                }
                catch (O_ o_9) {
                    throw r.a(o_9);
                }
            }
            e10 = new e().Q(supplier).D(new WB(this.W)).E(n2, n3, (float)this.J / 2.0f, (float)this.t / 2.0f, f10, f11, 1.0f, 1.0f);
            KP.x().p(e10);
        } else {
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n2 * f12)), (int)n6, (int)this.J, (int)this.t);
            F8.g((float)n2 * f12, (float)n3 * f12, this.J, this.t, f10, f11, 1.0f, 1);
        }
        Ne.h.X();
        tl.O(0);
    }

    public static void h(int n2) {
        e = n2;
    }

    private void q() {
        this.W = GL11.glGenTextures();
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)this.J, (int)this.t, (int)0, (int)6407, (int)5121, (ByteBuffer)null);
        this.X = true;
    }

    public static int x() {
        return e;
    }

    public static int I() {
        int n2 = r.x();
        try {
            if (n2 == 0) {
                return 66;
            }
        }
        catch (O_ o_2) {
            throw r.a(o_2);
        }
        return 0;
    }

    private Void lambda$renderBlur$1(int n2, float f10, int n3) {
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n2 * f10)), (int)n3, (int)this.J, (int)this.t);
        return null;
    }

    private Void lambda$renderBlur$0(int n2, float f10, int n3) {
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n2 * f10)), (int)n3, (int)this.J, (int)this.t);
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public r(int n2, int n3) {
        this.J = n2;
        this.t = n3;
    }
}

