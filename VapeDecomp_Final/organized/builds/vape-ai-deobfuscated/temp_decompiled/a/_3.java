/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.NS;
import a.O_;
import a.WW;
import a._c;
import a.a7;
import a.c4;
import a.sS;

public final class _3
extends _c {
    @Override
    public String l() {
        try {
            if (this.G.R()) {
                return "<clinit>";
            }
        }
        catch (O_ o_2) {
            throw _3.a(o_2);
        }
        return this.k.P();
    }

    protected _3(c4 c42, GM gM) {
        super(gM, c42);
    }

    public boolean N() {
        return this.G.O();
    }

    @Override
    int p(sS sS2) throws WW {
        NS nS = sS2.h();
        try {
            nS.W();
            return nS.S();
        }
        catch (a7 a72) {
            throw new WW(a72);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean Y() {
        return this.G.R();
    }
}

