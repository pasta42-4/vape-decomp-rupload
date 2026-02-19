/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.X_;
import a.hs;
import java.awt.Color;

public class hj
extends hs {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    public hj(String string) {
        super(string);
    }

    @Override
    public void G() {
        block5: {
            Color color;
            float f10;
            float f11;
            float f12;
            float f13;
            block4: {
                f13 = (float)X_.V(this.T());
                f12 = (float)X_.D(this.T());
                f11 = (float)(this.G() + this.w() / 2.0);
                f11 -= f13 / 4.0f;
                f10 = (float)(this.W() + this.b() / 2.0);
                f10 -= f12 / 4.0f;
                f11 = (int)f11;
                f10 = (int)f10;
                try {
                    if (this.t() == null) break block4;
                    X_.B(this.t(), f11, f10, this.T(), f13 / 2.0f, f12 / 2.0f, false);
                    break block5;
                }
                catch (O_ o_2) {
                    throw hj.a(o_2);
                }
            }
            try {
                color = this.s() ? this.y() : this.H();
            }
            catch (O_ o_3) {
                throw hj.a(o_3);
            }
            X_.B(color, f11, f10, this.T(), f13 / 2.0f, f12 / 2.0f, false);
        }
    }
}

