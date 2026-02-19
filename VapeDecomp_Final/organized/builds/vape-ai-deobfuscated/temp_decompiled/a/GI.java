/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.HQ;
import a.O_;
import a.SE;
import a.f0;
import a.ht;
import a.sN;
import a.vi;
import a.w7;
import a.wH;
import a.wO;
import a.wg;
import a.wl;
import a.z_;

public final class Gi {
    private static String g;

    public static void I() {
        Ao.D(f0.class).v().y();
    }

    public static String i() {
        return g;
    }

    public static void y(wg wg2) {
        f0 f02 = Ao.D(f0.class);
        wl wl2 = f02.l().E().K();
        try {
            if (wl2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw Gi.a(o_2);
        }
        wl2.K().B().z(wg2);
    }

    public static void v() {
        Ao.D(f0.class).f().Y();
        Gi.I();
    }

    public static void k(z_ z_2, z_ z_3, String string) {
        z_ z_4;
        w7 w72 = SE.h.O().t().S(z_2.s().r());
        try {
            if (w72 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw Gi.a(o_2);
        }
        try {
            z_2.w(true);
            z_2.G(true);
            if (z_3 != null) {
                SE.h.c().t("Message from \u00a7f" + z_3.j(), string, HQ.FRIENDS_NEW_CHAT, 4000L);
            }
        }
        catch (O_ o_3) {
            throw Gi.a(o_3);
        }
        try {
            z_4 = z_3 == null ? SE.h.O().n() : z_3;
        }
        catch (O_ o_4) {
            throw Gi.a(o_4);
        }
        z_ z_5 = z_4;
        wH wH2 = new wH(z_5, new wO(string));
        w72.x().K().C().B().z(wH2);
        w72.x().K().C().B().A();
        w72.x().x();
    }

    public static void W(sN sN2) {
        Ao.D(f0.class).u().w(sN2);
    }

    public static void n(String string) {
        g = string;
    }

    public static void g(vi vi2, String string) {
        Gi.W(new sN(vi2, string));
    }

    public static f0 h(ht ht2) {
        while (!ht2.getClass().equals(f0.class)) {
            try {
                ht2 = ht2.F();
            }
            catch (Exception exception) {
                break;
            }
        }
        return (f0)ht2;
    }

    static {
        if (Gi.i() == null) {
            Gi.n("coEvjc");
        }
    }

    public static void w(vi vi2, String string) {
        Gi.W(new sN(vi2, string));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

