/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.O_;
import a.RC;
import a.bI;

class Gb
implements IG {
    final bI G;
    final RC O;

    @Override
    public void R() {
        block4: {
            try {
                try {
                    if (!this.G.equals(RC.l(this.O)) || RC.i(this.O).size() <= 0) break block4;
                }
                catch (O_ o_2) {
                    throw Gb.a(o_2);
                }
                this.O.C((bI)RC.i(this.O).get(0));
            }
            catch (O_ o_3) {
                throw Gb.a(o_3);
            }
        }
        this.O.G(this.G);
        this.O.D();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    Gb(RC rC2, bI bI2) {
        this.O = rC2;
        this.G = bI2;
    }
}

