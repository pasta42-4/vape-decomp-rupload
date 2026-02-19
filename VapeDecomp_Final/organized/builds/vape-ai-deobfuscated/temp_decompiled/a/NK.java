/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.FG;
import a.KB;
import a.OY;
import a.O_;
import a.SE;
import a.bX;
import a.pO;
import a.sM;

public class Nk
implements sM {
    private Ao n;

    @OY
    public void x(KB kB2) {
        Ao ao2 = this.P();
        try {
            if (ao2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw Nk.a(o_2);
        }
        ao2.W(kB2);
    }

    @OY
    public void Q(pO pO2) {
        Ao ao2 = this.P();
        try {
            if (ao2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw Nk.a(o_2);
        }
        try {
            bX.B.W(pO2);
            if (!this.n.P) {
                FG.j();
            }
        }
        catch (O_ o_3) {
            throw Nk.a(o_3);
        }
        ao2.B(pO2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private Ao P() {
        try {
            if (this.n == null) {
                this.n = SE.h.U().K(Ao.class);
            }
        }
        catch (O_ o_2) {
            throw Nk.a(o_2);
        }
        return this.n;
    }
}

