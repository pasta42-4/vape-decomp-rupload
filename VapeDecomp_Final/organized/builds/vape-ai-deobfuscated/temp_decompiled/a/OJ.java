/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DM;
import a.Hc;
import a.O_;
import a.kX;

public class oj
extends Hc {
    public float Q() {
        return oj.U.u().gc.H(this.H);
    }

    public float H() {
        return oj.U.u().gc.v(this.H);
    }

    public static oj c(DM dM, float f10, boolean bl2) {
        if (bl2) {
            f10 *= (float)Math.PI / 180;
        }
        float f11 = (float)Math.sin(f10 / 2.0f);
        float f12 = dM.V() * f11;
        float f13 = dM.y() * f11;
        float f14 = dM.o() * f11;
        float f15 = (float)Math.cos(f10 / 2.0f);
        return new oj(oj.U.u().gc.d(f12, f13, f14, f15));
    }

    public oj(Object object) {
        super(object);
    }

    public float i() {
        return oj.U.u().gc.D(this.H);
    }

    public float G() {
        return oj.U.u().gc.O(this.H);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static oj o(float f10, float f11, float f12, boolean bl2) {
        block2: {
            block3: {
                try {
                    if (kX.C() < 50) break block2;
                    if (!bl2) break block3;
                }
                catch (O_ o_2) {
                    throw oj.a(o_2);
                }
                f10 *= (float)Math.PI / 180;
                f11 *= (float)Math.PI / 180;
                f12 *= (float)Math.PI / 180;
            }
            float f13 = (float)Math.sin(0.5f * f10);
            float f14 = (float)Math.cos(0.5f * f10);
            float f15 = (float)Math.sin(0.5f * f11);
            float f16 = (float)Math.cos(0.5f * f11);
            float f17 = (float)Math.sin(0.5f * f12);
            float f18 = (float)Math.cos(0.5f * f12);
            float f19 = f13 * f16 * f18 + f14 * f15 * f17;
            float f20 = f14 * f15 * f18 - f13 * f16 * f17;
            float f21 = f13 * f15 * f18 + f14 * f16 * f17;
            float f22 = f14 * f16 * f18 - f13 * f15 * f17;
            return new oj(oj.U.u().gc.d(f19, f20, f21, f22));
        }
        return new oj(oj.U.u().gc.A(f10, f11, f12, bl2));
    }
}

