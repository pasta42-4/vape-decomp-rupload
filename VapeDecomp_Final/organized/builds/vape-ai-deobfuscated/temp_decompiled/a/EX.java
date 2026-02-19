/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._H;
import a.a4;
import a.e5;
import a.eh;

public class ex
extends e5 {
    protected eh r;
    private static final long serialVersionUID = 1L;

    public ex(String string, eh eh2) {
        super(string);
        this.r = eh2;
    }

    public eh K() {
        return this.r;
    }

    @Override
    public String toString() {
        return this.e + ":" + this.r.S();
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.G(this);
    }
}

