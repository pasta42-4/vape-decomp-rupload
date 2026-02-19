/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._H;
import a.a4;
import a.eR;

public class e7
extends eR {
    private static final long serialVersionUID = 1L;
    protected int K;

    public e7(int n2) {
        this.K = n2;
    }

    @Override
    public String toString() {
        return "id:" + this.K;
    }

    public int X() {
        return this.K;
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.m(this);
    }
}

