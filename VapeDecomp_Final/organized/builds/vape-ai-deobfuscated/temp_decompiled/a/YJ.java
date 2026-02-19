/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.ht;
import a.yG;

class yj
extends yG {
    final ht R0;

    yj(double d2, double d3, ht ht2) {
        this.R0 = ht2;
        super(d2, d3);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean G() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!super.G() && !this.R0.G()) break block4;
                    }
                    catch (O_ o_2) {
                        throw yj.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw yj.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }
}

