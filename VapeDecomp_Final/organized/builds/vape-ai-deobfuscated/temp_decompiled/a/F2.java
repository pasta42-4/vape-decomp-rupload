/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.w6;

public abstract class f2
extends w6 {
    private static String[] Fj;

    public static void w(String[] stringArray) {
        Fj = stringArray;
    }

    @Override
    public void o(boolean bl2) {
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G() - 0.5;
            d4 = this.W() - 0.5;
            d3 = this.w() + 1.0;
            d2 = bl2 ? this.G5 + 2.0 : this.m() + 2.0;
        }
        catch (O_ o_2) {
            throw f2.c(o_2);
        }
        F8.U(d5, d4, d3, d2, f2.M.S, 2.1f, 1.0f, 1.0f);
        super.o(bl2);
    }

    public static String[] X() {
        return Fj;
    }

    @Override
    public void G() {
        super.G();
    }

    static {
        if (f2.X() == null) {
            f2.w(new String[1]);
        }
    }

    @Override
    public void E() {
        super.E();
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }
}

