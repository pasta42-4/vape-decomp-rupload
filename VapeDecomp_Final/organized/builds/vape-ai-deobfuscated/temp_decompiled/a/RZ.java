/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a.XR;

public class rz
implements I4 {
    private long t;
    private boolean p;

    public rz(XR xR2, boolean bl2) {
        this.t = xR2.r();
        this.p = bl2;
    }

    public long I() {
        return this.t;
    }

    public rz() {
    }

    public boolean T() {
        return this.p;
    }

    @Override
    public void y(R8 r82) {
        r82.Z(this.t);
        r82.W(this.p);
    }

    @Override
    public void r(R8 r82) {
        this.t = r82.S();
        this.p = r82.B();
    }
}

