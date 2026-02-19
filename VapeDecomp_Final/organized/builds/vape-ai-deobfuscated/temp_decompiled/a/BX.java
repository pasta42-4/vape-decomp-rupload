/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.ht;
import a.rn;
import java.awt.Color;

public class bx
extends ht {
    private static int E;
    private final rn F;

    public static int H() {
        int n2 = bx.t();
        try {
            if (n2 == 0) {
                return 45;
            }
        }
        catch (O_ o_2) {
            throw bx.a(o_2);
        }
        return 0;
    }

    static {
        if (bx.t() == 0) {
            bx.d(4);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void d(int n2) {
        E = n2;
    }

    public static int t() {
        return E;
    }

    public bx(double d2, double d3) {
        this.getClass();
        this.F = new rn(0.15 * 4.0, new Color(32, 32, 32, 32), new Color(128, 128, 128, 64));
        this.T(d2);
        this.w(d3);
    }

    @Override
    public void G() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.F.F()) break block4;
                        if (!this.F.C()) break block5;
                    }
                    catch (O_ o_2) {
                        throw bx.a(o_2);
                    }
                    this.F.q();
                    break block4;
                }
                catch (O_ o_3) {
                    throw bx.a(o_3);
                }
            }
            this.F.o();
        }
        F8.S(this.G(), this.W(), this.w(), this.b(), this.F.k());
    }
}

