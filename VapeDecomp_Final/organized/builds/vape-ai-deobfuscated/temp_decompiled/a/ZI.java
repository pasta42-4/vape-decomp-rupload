/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.O_;
import a.Qg;
import a.V0;
import a.VF;
import a.oQ;
import a.rT;

public class zi {
    private void B() {
        V0 v02;
        VF vF2;
        Qg qg2;
        block11: {
            qg2 = EP.U();
            try {
                try {
                    if (qg2.j() && qg2.D()) break block11;
                }
                catch (O_ o_2) {
                    throw zi.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw zi.a(o_3);
            }
        }
        for (int i10 = 0; i10 < 60; ++i10) {
            V0 v03;
            V0 v04;
            double d2 = 0.13029834580989086 + 7.045809890852092E-4 * Math.random();
            try {
                v04 = rT.e ? V0.a(qg2.F(), qg2.V() + d2, qg2.B(), false) : V0.e(qg2.F(), ((oQ)qg2.L()).c() + d2, qg2.V() + d2, qg2.B(), false);
            }
            catch (O_ o_4) {
                throw zi.a(o_4);
            }
            V0 v05 = v04;
            double d3 = 0.07029834580989085 + 7.045809890852092E-4 * Math.random();
            try {
                v03 = rT.e ? V0.a(qg2.F(), qg2.V() + d2, qg2.B(), false) : V0.e(qg2.F(), ((oQ)qg2.L()).c() + d3, qg2.V() + d3, qg2.B(), false);
            }
            catch (O_ o_5) {
                throw zi.a(o_5);
            }
            V0 v06 = v03;
            qg2.U().O(v05);
            qg2.U().O(v06);
        }
        try {
            vF2 = qg2.U();
            v02 = rT.e ? V0.a(qg2.F(), qg2.V(), qg2.B(), true) : V0.e(qg2.F(), ((oQ)qg2.L()).c(), qg2.V(), qg2.B(), true);
        }
        catch (O_ o_6) {
            throw zi.a(o_6);
        }
        vF2.O(v02);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

