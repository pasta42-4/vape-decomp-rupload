/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.Eh;
import a.GH;
import a.N9;
import a.W0;
import a.WK;
import a.jC;
import java.util.Vector;

class Ny
implements WK<W0> {
    final jC P;
    final D0 O;

    @Override
    public int B() {
        return 4;
    }

    Ny(jC jC2, D0 d0) {
        this.P = jC2;
        this.O = d0;
    }

    @Override
    public boolean X(N9 n9) {
        Eh eh2 = this.O.N(n9.x(), n9.J(), n9.b());
        return GH.z(eh2);
    }

    @Override
    public int d(Vector<W0> vector) {
        return jC.c(this.P, this.O, vector);
    }
}

