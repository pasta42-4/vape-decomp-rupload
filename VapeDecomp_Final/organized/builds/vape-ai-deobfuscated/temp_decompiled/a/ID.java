/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.TF;
import a.eq;
import a.i6;
import a.sZ;
import java.util.Map;

class id
extends i6 {
    eq S;
    Map<String, String> o;
    byte[] M;
    eq q;

    @Override
    public void H(int n2, int n3) {
        this.M[n2] = 8;
        TF.e(n3, this.M, n2 + 1);
    }

    @Override
    public int R(int n2, int n3, int n4) {
        TF.e(n3, this.M, n2 - 4);
        return super.R(n2, n3, n4);
    }

    @Override
    public int q(int n2, int n3, int n4, boolean bl2) {
        TF.e(n4, this.M, n2 - 2);
        return super.q(n2, n3, n4, bl2);
    }

    public sZ h() {
        return new sZ(this.S, this.M);
    }

    id(sZ sZ2, eq eq2, Map<String, String> map) {
        super(sZ2);
        this.q = sZ2.K();
        this.M = new byte[this.I.length];
        this.S = eq2;
        this.o = map;
    }

    @Override
    public void G(int n2, byte by2) {
        this.M[n2] = by2;
    }

    @Override
    public void c(int n2, int n3) {
        this.M[n2] = 7;
        int n4 = this.q.X(n3, this.S, this.o);
        TF.e(n4, this.M, n2 + 1);
    }

    @Override
    public void J() {
        int n2 = TF.M(this.I, 0);
        TF.e(n2, this.M, 0);
        super.J();
    }
}

