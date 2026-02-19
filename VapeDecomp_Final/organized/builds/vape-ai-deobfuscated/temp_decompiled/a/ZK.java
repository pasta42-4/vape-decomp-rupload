/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a.XR;

public class zk
implements I4 {
    private XR q;

    public zk(XR xR2) {
        this.q = xR2;
    }

    public XR P() {
        return this.q;
    }

    @Override
    public void y(R8 r82) {
        this.q.o(r82);
    }

    public zk() {
    }

    @Override
    public void r(R8 r82) {
        this.q = new XR(r82);
    }
}

