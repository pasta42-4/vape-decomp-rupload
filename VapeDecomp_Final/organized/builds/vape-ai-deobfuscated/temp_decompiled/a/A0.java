/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.F2;
import a.O_;
import a.SE;
import a.Xm;
import java.util.HashMap;

public class a0 {
    private static boolean d;
    static HashMap<F2, Xm> q;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void n(String string, float f10, float f11, int n2) {
        try {
            F2 f22 = new F2(string, n2);
            a0.d(string, n2);
            int n3 = EP.X().L(string);
            int n4 = EP.X().B(string);
            q.get(f22).B(f10, f11, n3, n4);
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    public static void K(boolean bl2) {
        d = bl2;
    }

    static {
        q = new HashMap();
        a0.K(true);
    }

    private static void y(F2 f22) {
        Xm xm2 = new Xm();
        xm2.U(f22.S, f22.S());
        q.put(f22, xm2);
    }

    public static boolean V() {
        boolean bl2 = a0.w();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw a0.a(o_2);
        }
        return false;
    }

    public static boolean w() {
        return d;
    }

    public static void d(String string, int n2) {
        F2 f22 = new F2(string, n2);
        try {
            if (!q.containsKey(f22)) {
                a0.y(f22);
            }
        }
        catch (O_ o_2) {
            throw a0.a(o_2);
        }
    }
}

