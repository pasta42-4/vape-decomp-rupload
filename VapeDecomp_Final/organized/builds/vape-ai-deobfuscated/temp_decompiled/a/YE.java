/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.Sz;
import a.h6;
import a.ht;

public class ye
extends ht {
    private h6 L;

    @Override
    public void U() {
    }

    @Override
    public void g() {
    }

    public ye(String string, IG iG2) {
        this.L = new h6(string, ye.M.S);
        this.L.N(iG2);
        this.o(this.L);
    }

    @Override
    public double z() {
        return 15.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    @Override
    public void G() {
        this.L.b(this.G() + 5.0);
        this.L.M(this.W() + 1.0);
        this.L.T(this.w() - 10.0);
        this.L.w(this.b() - 2.0);
    }

    @Override
    public void d() {
    }

    @Override
    public void Z(Sz sz2) {
    }
}

