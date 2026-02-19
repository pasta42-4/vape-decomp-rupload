/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.OE;
import a.R8;

public class en
implements I4 {
    private OE d;

    public en() {
    }

    @Override
    public void y(R8 r82) {
        r82.N(this.d);
    }

    public OE u() {
        return this.d;
    }

    public en(OE oE2) {
        this.d = oE2;
    }

    @Override
    public void r(R8 r82) {
        this.d = r82.L(OE.class);
    }
}

