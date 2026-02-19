/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.TF;
import a.i6;
import a.sZ;

class in
extends i6 {
    private int q;
    private int v;

    @Override
    public int R(int n2, int n3, int n4) {
        block6: {
            block5: {
                try {
                    if (this.v != n2 + n3) break block5;
                    TF.e(n3 - this.q, this.I, n2 - 4);
                    break block6;
                }
                catch (O_ o_2) {
                    throw in.a(o_2);
                }
            }
            try {
                if (this.v == n2) {
                    TF.e(n3 + this.q, this.I, n2 - 4);
                }
            }
            catch (O_ o_3) {
                throw in.a(o_3);
            }
        }
        return super.R(n2, n3, n4);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public in(sZ sZ2, int n2, int n3) {
        super(sZ2);
        this.v = n2;
        this.q = n3;
    }
}

