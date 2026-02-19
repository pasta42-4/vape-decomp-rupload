/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Rv;
import a.TA;
import a.fx;

class g
implements TA {
    final Rv G;
    final fx P;

    g(Rv rv2, fx fx2) {
        this.G = rv2;
        this.P = fx2;
    }

    @Override
    public void p(char c10, int n2) {
        this.P.j(Rv.p(this.G).a());
    }
}

