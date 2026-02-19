/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B9;
import a.KX;
import a.Ky;
import a.OY;
import a.O_;
import a.sM;
import java.util.ArrayList;

public class hp
implements sM {
    private static String l;
    private static final ArrayList<B9> U;

    public static void c(B9 b92) {
        U.add(b92);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void x(Ky ky2) {
        try {
            if (!ky2.getButtonState()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw hp.a(o_2);
        }
        for (B9 b92 : U) {
            b92.d(-100 + ky2.getButton());
        }
    }

    public static String H() {
        return l;
    }

    @OY
    public void U(KX kX2) {
        try {
            if (!kX2.isDown()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw hp.a(o_2);
        }
        for (B9 b92 : U) {
            b92.d(kX2.getKey());
        }
    }

    static {
        U = new ArrayList();
        hp.h(null);
    }

    public static void h(String string) {
        l = string;
    }
}

