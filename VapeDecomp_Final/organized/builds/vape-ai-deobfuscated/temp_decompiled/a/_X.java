/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dg;
import a.EP;
import a.F7;
import a.KE;
import a.OY;
import a.O_;
import a.QF;
import a.VX;
import a.eM;
import a.pa;
import a.sM;

public class _x
implements sM {
    private static int[] g;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static {
        if (_x.d() == null) {
            _x.O(new int[2]);
        }
    }

    public static void O(int[] nArray) {
        g = nArray;
    }

    @OY(b=F7.LOW)
    public void z(pa pa2) {
        try {
            if (!pa2.getPacket().B(eM.ET)) {
                return;
            }
        }
        catch (O_ o_2) {
            throw _x.a(o_2);
        }
        VX vX2 = new VX(pa2.getPacket().M());
        Dg dg = EP.c();
        try {
            if (dg.Y()) {
                return;
            }
        }
        catch (O_ o_3) {
            throw _x.a(o_3);
        }
        QF qF2 = dg.I(vX2.s());
        try {
            if (qF2.Y()) {
                return;
            }
        }
        catch (O_ o_4) {
            throw _x.a(o_4);
        }
        new KE(qF2).fire();
    }

    public static int[] d() {
        return g;
    }
}

