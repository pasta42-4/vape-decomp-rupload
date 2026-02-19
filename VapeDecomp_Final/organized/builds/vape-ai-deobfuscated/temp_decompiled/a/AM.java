/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.OY;
import a.O_;
import a.Rp;
import a.S3;
import a.fW;
import a.fu;
import a.ht;
import a.hx;
import a.sM;
import a.w6;

public class am
implements sM {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void x(S3 s32) {
        for (w6 w62 : Ao.F.Y()) {
            try {
                if (!(w62 instanceof fu)) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw am.a(o_2);
            }
            fu fu2 = (fu)w62;
            for (ht ht2 : fu2.A()) {
                try {
                    if (!(ht2 instanceof hx)) {
                        continue;
                    }
                }
                catch (O_ o_3) {
                    throw am.a(o_3);
                }
                hx hx2 = (hx)ht2;
                for (ht ht3 : hx2.X()) {
                    if (!(ht3 instanceof Rp)) continue;
                    Rp rp2 = (Rp)ht3;
                    rp2.D();
                }
            }
        }
        Ao.D(fW.class).Y();
    }
}

