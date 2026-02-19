/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.F8;
import a.Fm;
import a.KG;
import a.O_;
import a.SE;
import a.kX;
import a.tl;

public class pt
extends KG {
    private static int f;
    private static final Fm Z;
    private static int Y;

    public static Fm getEventListeners() {
        return Z;
    }

    @Override
    public Fm getListeners() {
        return Z;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int getDisplayWidth() {
        return f;
    }

    static {
        Z = new Fm();
    }

    public int getDisplayHeight() {
        return Y;
    }

    public static void create() {
        block4: {
            try {
                try {
                    if (kX.C() < 37 || !EP.U().Y()) break block4;
                }
                catch (O_ o_2) {
                    throw pt.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw pt.a(o_3);
            }
        }
        f = EP.e();
        Y = EP.b();
        tl.l(770, 771, 1, 0);
        F8.R(f, Y);
        SE.h.U().K(Ao.class).X();
        pt pt2 = new pt();
        pt2.fire();
        F8.f(f, Y);
    }
}

