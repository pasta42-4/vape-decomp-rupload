/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F7;
import a.OY;
import a.O_;
import a.Vh;
import a.Vt;
import a.eM;
import a.pN;
import a.rT;
import a.sM;

public class Gl
implements sM {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY(b=F7.LOWEST)
    public void j(pN pN2) {
        Vt vt2 = pN2.getPacket();
        if (vt2.B(eM.rZ)) {
            Vh vh2 = new Vh(vt2.M());
            int n2 = vh2.D();
            try {
                if (rT.s(n2)) {
                    pN2.setCanceled(true);
                }
            }
            catch (O_ o_2) {
                throw Gl.a(o_2);
            }
        }
    }
}

