/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Ge;
import a.IR;
import a.JH;
import a.JR;
import a._H;
import a.a_;
import a.av;
import a.eF;

class h_
implements JR {
    GM M;
    int k;
    int a;
    int l;

    h_(GM gM, int n2, int n3, int n4) {
        this.M = gM;
        this.k = n4;
        this.a = n2;
        this.l = n3;
    }

    private static _H a(_H _H2) {
        return _H2;
    }

    @Override
    public void o(av av2, IR iR2, eF eF2) throws _H {
        int n2;
        try {
            if (av2.Y(eF2) != 1) {
                throw new _H("$proceed() cannot take more than one parameter for field writing");
            }
        }
        catch (_H _H2) {
            throw h_.a(_H2);
        }
        if (JH.n(this.a)) {
            n2 = 0;
        } else {
            n2 = -1;
            iR2.B(this.k);
        }
        av2.F(eF2, new int[1], new int[1], new String[1]);
        av2.v(this.M);
        n2 = this.M instanceof Ge ? (n2 -= ((Ge)this.M).m()) : --n2;
        iR2.w(this.a);
        iR2.m(this.l);
        iR2.R(n2);
        av2.w(GM.M);
        av2.A();
    }

    @Override
    public void u(a_ a_2, eF eF2) throws _H {
        a_2.e(eF2, new int[1], new int[1], new String[1]);
        a_2.I(GM.M);
        a_2.Y();
    }
}

