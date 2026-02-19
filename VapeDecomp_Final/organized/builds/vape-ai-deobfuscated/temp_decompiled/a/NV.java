/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.CP;
import a.IG;
import a.O_;
import a.fq;

class Nv
implements IG {
    final CP G;
    final fq r;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void R() {
        block7: {
            try {
                try {
                    if (this.r.q() != 3 && this.r.q() != 4) break block7;
                }
                catch (O_ o_2) {
                    throw Nv.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw Nv.a(o_3);
            }
        }
        try {
            if (this.r.f()) {
                this.r.O(3);
                this.r.R();
            }
        }
        catch (O_ o_4) {
            throw Nv.a(o_4);
        }
    }

    Nv(CP cP2, fq fq2) {
        this.G = cP2;
        this.r = fq2;
    }
}

