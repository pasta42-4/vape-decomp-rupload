/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.A0;
import a.Qf;
import a.rT;
import java.util.Comparator;

class eb
implements Comparator<Qf> {
    final A0 o;

    eb(A0 a02) {
        this.o = a02;
    }

    public int F(Qf qf2, Qf qf3) {
        return Double.compare(rT.S(qf2.y()), rT.S(qf3.y()));
    }
}

