/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.Qt;
import a.ht;
import a.so;
import java.awt.Color;

public class bw
extends ht {
    private Qt v;

    public void D(Qt qt2) {
        this.v = qt2;
    }

    public Qt K() {
        return this.v;
    }

    public bw(double d2, double d3) {
        this.T(d2);
        this.w(d3);
    }

    @Override
    public void G() {
        block4: {
            try {
                try {
                    if (this.K() != null && !this.K().Y()) break block4;
                }
                catch (O_ o_2) {
                    throw bw.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw bw.a(o_3);
            }
        }
        F8.s(this.G(), this.W() + 1.0, this.w(), this.b(), 12.0f, 1.0f, new Color(100, 100, 100, 70));
        so.t(this.K(), (float)this.G(), (float)this.W(), (int)this.w(), (int)this.b(), Color.WHITE, 1.0f);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

