/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a._I;

public class Gc
implements I4 {
    private _I x;

    @Override
    public void y(R8 r82) {
        this.x.N(r82);
    }

    public _I Y() {
        return this.x;
    }

    public Gc(_I _I2) {
        this.x = _I2;
    }

    public Gc() {
    }

    @Override
    public void r(R8 r82) {
        this.x = new _I(r82);
    }
}

