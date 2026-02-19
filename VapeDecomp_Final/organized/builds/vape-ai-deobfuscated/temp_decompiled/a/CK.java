/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.X5;
import a.X7;
import a.X8;
import a.XG;
import a.XL;
import a.XP;
import a.XS;
import a.XW;
import a.Xq;
import a.Xx;
import a.cw;
import a.eM;
import a.kX;

public class ck
extends cw {
    private boolean r;
    private static int W;

    static {
        if (ck.q() == 0) {
            ck.U(77);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static int q() {
        return W;
    }

    public static int h() {
        int n2 = ck.q();
        try {
            if (n2 == 0) {
                return 78;
            }
        }
        catch (O_ o_2) {
            throw ck.a(o_2);
        }
        return 0;
    }

    public void H() {
        block6: {
            block5: {
                try {
                    if (kX.C() != 13) break block5;
                    this.h.add(new X5());
                    this.h.add(new XP());
                    break block6;
                }
                catch (O_ o_2) {
                    throw ck.a(o_2);
                }
            }
            try {
                if (kX.C() < 35) {
                    this.h.add(new X8());
                    this.h.add(new XL());
                    this.h.add(new XS());
                    this.h.add(new Xq());
                    this.h.add(new Xx());
                    this.h.add(new XG());
                }
            }
            catch (O_ o_3) {
                throw ck.a(o_3);
            }
        }
        this.z();
        this.r = true;
    }

    public boolean a() {
        return this.r;
    }

    public static void U(int n2) {
        W = n2;
    }

    public ck() {
        XW.H(eM.rl);
        XW.H(eM.PE);
        XW.H(eM.Uu);
        XW.H(eM.bU);
        XW.H(eM.Uo);
        XW.H(eM.FK);
        XW.H(eM.FM);
        XW.H(eM.Et);
        XW.H(eM.l);
        if (kX.C() > 13) {
            XW.H(eM.PX);
            XW.H(eM.U0);
            XW.H(eM.P2);
            XW.H(eM.Pb);
            XW.H(eM.bE);
            XW.H(eM.Ei);
            XW.H(eM.ri);
            XW.H(eM.VJ);
            XW.H(eM.V7);
            XW.H(eM.E9);
        } else {
            XW.H(eM.VE);
            XW.H(eM.bD);
        }
        this.h.add(new X7());
    }
}

