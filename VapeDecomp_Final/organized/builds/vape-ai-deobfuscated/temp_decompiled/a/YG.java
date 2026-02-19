/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.yh;

public abstract class yg
extends yh {
    private static int xG;

    public static int G() {
        return xG;
    }

    static {
        if (yg.G() != 0) {
            yg.V(15);
        }
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public yg() {
        super(104.0);
        this.T(104.0);
        this.Q(yg.M.E);
    }

    public static int E() {
        int n2 = yg.G();
        try {
            if (n2 == 0) {
                return 41;
            }
        }
        catch (O_ o_2) {
            throw yg.b(o_2);
        }
        return 0;
    }

    public static void V(int n2) {
        xG = n2;
    }

    public abstract void O();
}

