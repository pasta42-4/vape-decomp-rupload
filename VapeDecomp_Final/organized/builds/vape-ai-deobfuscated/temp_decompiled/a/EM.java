/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._H;
import a.a4;
import a.eF;
import a.eR;
import a.zg;

public class em
extends eF
implements zg {
    private static final long serialVersionUID = 1L;
    protected int E;

    @Override
    protected String v() {
        return "op:" + this.p();
    }

    em(int n2, eR eR2, eF eF2) {
        super(eR2, eF2);
        this.E = n2;
    }

    public eR R() {
        return this.Z();
    }

    em(int n2, eR eR2) {
        super(eR2);
        this.E = n2;
    }

    public eR V() {
        return this.u().Z();
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.s(this);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void P(eR eR2) {
        this.M(eR2);
    }

    public static em n(int n2, eR eR2, eR eR3) {
        return new em(n2, eR2, new eF(eR3));
    }

    public static em f(int n2, eR eR2) {
        return new em(n2, eR2);
    }

    public void Z(eR eR2) {
        this.u().M(eR2);
    }

    public String p() {
        int n2;
        block10: {
            n2 = this.E;
            try {
                if (n2 < 128) {
                    return String.valueOf((char)n2);
                }
            }
            catch (O_ o_2) {
                throw em.a(o_2);
            }
            try {
                try {
                    if (350 > n2 || n2 > 371) break block10;
                }
                catch (O_ o_3) {
                    throw em.a(o_3);
                }
                return p[n2 - 350];
            }
            catch (O_ o_4) {
                throw em.a(o_4);
            }
        }
        try {
            if (n2 == 323) {
                return "instanceof";
            }
        }
        catch (O_ o_5) {
            throw em.a(o_5);
        }
        return String.valueOf(n2);
    }

    public void U(int n2) {
        this.E = n2;
    }

    public int I() {
        return this.E;
    }
}

