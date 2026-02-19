/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a.XR;

public class a8
implements I4 {
    private long q;
    private String s;

    public a8(XR xR2, String string) {
        this.q = xR2.r();
        this.s = string;
    }

    @Override
    public void r(R8 r82) {
        this.q = r82.S();
        this.s = r82.b(16);
    }

    @Override
    public void y(R8 r82) {
        r82.Z(this.q);
        r82.J(this.s);
    }

    public String G() {
        return this.s;
    }

    public long N() {
        return this.q;
    }

    public a8() {
    }
}

