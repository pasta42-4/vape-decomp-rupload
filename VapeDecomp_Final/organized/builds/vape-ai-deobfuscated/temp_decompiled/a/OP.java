/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.O_;
import a.Pi;
import a.kX;
import a.oE;
import a.ob;
import a.oi;

public class op
extends Hc {
    public String G() {
        try {
            if (kX.C() >= 35) {
                return this.H().i();
            }
        }
        catch (O_ o_2) {
            throw op.a(o_2);
        }
        return Pi.p(op.U.u().g0, this.H);
    }

    public ob H() {
        ob ob2 = new ob(Pi.d(op.U.u().g0, this.H));
        return ob2;
    }

    public oi f() {
        return new oi(Pi.B(op.U.u().g0, this.H));
    }

    public op(Object object) {
        super(object);
    }

    public oE A() {
        return new oE(Pi.g(op.U.u().g0, this.H));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

