/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bp;
import a.GM;
import a.Hd;
import a.IR;
import a.J5;
import a.JR;
import a.W2;
import a._7;
import a._H;
import a.at;
import a.av;
import a.eO;
import a.eR;
import a.sS;
import a.sr;

public class h2 {
    _7 I;
    private IR n;
    av z;

    public IR k() {
        return this.n;
    }

    public int n(GM[] gMArray, boolean bl2) throws _H {
        return this.z.u(gMArray, bl2, "$", "$args", "$$", this.I);
    }

    public boolean X(sS sS2, int n2) throws _H {
        sr sr2 = (sr)sS2.G("LocalVariableTable");
        try {
            if (sr2 == null) {
                return false;
            }
        }
        catch (_H _H2) {
            throw h2.a(_H2);
        }
        int n3 = sr2.o();
        for (int i10 = 0; i10 < n3; ++i10) {
            int n4 = sr2.R(i10);
            int n5 = sr2.U(i10);
            try {
                try {
                    if (n4 > n2 || n2 >= n4 + n5) continue;
                }
                catch (_H _H3) {
                    throw h2.a(_H3);
                }
                this.z.N(sr2.l(i10), sr2.T(i10), sr2.z(i10), this.I);
                continue;
            }
            catch (_H _H4) {
                throw h2.a(_H4);
            }
        }
        return true;
    }

    public h2(IR iR2, GM gM) {
        this.z = new av(iR2, gM, gM.K());
        this.I = new _7();
        this.n = iR2;
    }

    public void b(String string) throws _H {
        at at2 = new at(new Bp(string));
        _7 _72 = new _7(this.I);
        while (at2.e()) {
            eO eO2 = at2.t(_72);
            try {
                if (eO2 == null) continue;
                eO2.z(this.z);
            }
            catch (_H _H2) {
                throw h2.a(_H2);
            }
        }
    }

    public int W(String string, GM[] gMArray, boolean bl2, int n2, boolean bl3) throws _H {
        return this.z.k(gMArray, bl3, "$", "$args", "$$", bl2, n2, string, this.I);
    }

    private static _H a(_H _H2) {
        return _H2;
    }

    public h2(GM gM) {
        this(new IR(gM.o().X(), 0, 0), gM);
    }

    public void O(String string, String string2) throws _H {
        at at2 = new at(new Bp(string));
        eR eR2 = at2.I(this.I);
        String string3 = string2;
        W2 w22 = new W2(this, string3, eR2);
        this.z.i(w22, "$proceed");
    }

    public void Z(JR jR2) {
        this.z.i(jR2, "$proceed");
    }

    public void z(String string, String string2, String string3, String string4, int n2) throws _H {
        at at2 = new at(new Bp(string));
        eR eR2 = at2.I(this.I);
        J5 j52 = new J5(this, eR2, n2, string4, string2, string3);
        this.z.i(j52, "$proceed");
    }

    public int a(GM gM, String string) throws _H {
        return this.z.e(gM, string, this.I);
    }

    public boolean K(sS sS2, int n2) throws _H {
        sr sr2 = (sr)sS2.G("LocalVariableTable");
        try {
            if (sr2 == null) {
                return false;
            }
        }
        catch (_H _H2) {
            throw h2.a(_H2);
        }
        int n3 = sr2.o();
        for (int i10 = 0; i10 < n3; ++i10) {
            int n4 = sr2.z(i10);
            try {
                if (n4 >= n2) continue;
                this.z.N(sr2.l(i10), sr2.T(i10), n4, this.I);
                continue;
            }
            catch (_H _H3) {
                throw h2.a(_H3);
            }
        }
        return true;
    }

    public void A(int n2) {
        this.z.f(n2);
    }

    public void k(GM gM) {
        this.z.c(gM);
    }

    public int Y(GM gM, boolean bl2) throws _H {
        String string;
        String string2;
        GM gM2;
        av av2;
        try {
            this.z.c(gM);
            av2 = this.z;
            gM2 = gM;
            string2 = "$r";
            string = bl2 ? "$_" : null;
        }
        catch (_H _H2) {
            throw h2.a(_H2);
        }
        return av2.p(gM2, string2, string, this.I);
    }

    public void N(String string, String string2) throws _H {
        String string3 = string;
        String string4 = string2;
        Hd hd2 = new Hd(this, string3, string4);
        this.z.i(hd2, "$proceed");
    }
}

