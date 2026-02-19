/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Jt;
import a.O_;
import a.Oy;
import a.V4;
import a.ih;
import a.rp;

public class im
extends ih {
    private final Jt r;
    private final int u;

    private static O_ b(O_ o_2) {
        return o_2;
    }

    im(Oy oy2) {
        super(oy2);
        this.u = oy2.h();
        this.r = oy2.E();
    }

    @Override
    public boolean z(rp rp2) {
        V4 v42 = rp2.W();
        try {
            if (v42 == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw im.b(o_2);
        }
        return this.r.W(v42.D(), this.u);
    }
}

