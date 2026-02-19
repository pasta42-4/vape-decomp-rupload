/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a.XR;

public class e9
implements I4 {
    private XR O;

    @Override
    public void y(R8 r82) {
        this.O.o(r82);
    }

    public e9() {
    }

    public e9(XR xR2) {
        this.O = xR2;
    }

    public XR v() {
        return this.O;
    }

    @Override
    public void r(R8 r82) {
        this.O = new XR(r82);
    }
}

