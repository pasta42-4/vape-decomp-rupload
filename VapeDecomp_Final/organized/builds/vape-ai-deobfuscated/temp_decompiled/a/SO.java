/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.Fl;
import a.O_;
import a.Qt;
import a.SE;
import a.Wm;
import a.Zj;
import a.ce;
import java.awt.Color;
import java.util.HashMap;

public class so {
    static HashMap<ce, Fl> k = new HashMap();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void n(Qt qt2) {
        ce ce2 = new ce(qt2);
        try {
            if (!k.containsKey(ce2)) {
                so.y(qt2, ce2);
            }
        }
        catch (O_ o_2) {
            throw so.a(o_2);
        }
    }

    public static void t(Qt qt2, float f10, float f11, int n2, int n3, Color color, float f12) {
        try {
            ce ce2 = new ce(qt2);
            so.n(qt2);
            k.get(ce2).H(f10, f11, n2, n3, color, f12);
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static void y(Qt qt2, ce ce2) {
        Fl fl2 = F8.U() ? new Zj() : new Wm();
        fl2.Q(qt2);
        k.put(ce2, fl2);
    }
}

