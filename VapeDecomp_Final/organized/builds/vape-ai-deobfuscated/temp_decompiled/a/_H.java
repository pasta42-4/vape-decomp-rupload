/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.IG;
import a.Iv;
import a.Rl;
import a.fe;

class _h
implements IG {
    final int h;
    final Rl w;
    final fe A;

    _h(Rl rl2, fe fe2, int n2) {
        this.w = rl2;
        this.A = fe2;
        this.h = n2;
    }

    @Override
    public void O() {
        this.A.m().J().set(this.h, new Iv(0));
    }

    @Override
    public void R() {
        this.A.P(this.h);
    }
}

