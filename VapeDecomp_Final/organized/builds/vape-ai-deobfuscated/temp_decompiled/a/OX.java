/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dt;
import a.Hc;
import a.O1;
import a.O_;
import a.Pb;
import a.kX;

public class ox
extends Hc {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String x() {
        if (kX.C() >= 50) {
            Dt dt = O1.R();
            return dt.p(this.H).y();
        }
        try {
            if (kX.C() >= 35) {
                return Pb.C(ox.U.u().Gv, this.H);
            }
        }
        catch (O_ o_2) {
            throw ox.a(o_2);
        }
        return Pb.m(ox.U.u().Gv, this.H);
    }

    public ox(Object object) {
        super(object);
    }
}

