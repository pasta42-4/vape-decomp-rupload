/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.TF;
import a.sZ;

public class i6 {
    byte[] I;

    public void c(int n2, int n3) {
    }

    public int q(int n2, int n3, int n4, boolean bl2) {
        for (int i10 = 0; i10 < n4; ++i10) {
            n2 = this.Z(i10, n2);
        }
        return n2;
    }

    public void J() {
        int n2 = TF.M(this.I, 0);
        int n3 = 2;
        for (int i10 = 0; i10 < n2; ++i10) {
            int n4 = TF.M(this.I, n3);
            int n5 = TF.M(this.I, n3 + 2);
            n3 = this.R(n3 + 4, n4, n5);
            int n6 = TF.M(this.I, n3);
            n3 = this.l(n3 + 2, n4, n6);
        }
    }

    public void G(int n2, byte by2) {
    }

    public i6(sZ sZ2) {
        this.I = sZ2.p();
    }

    int Z(int n2, int n3) {
        byte by2 = this.I[n3];
        if (by2 == 7) {
            int n4 = TF.M(this.I, n3 + 1);
            this.c(n3, n4);
            n3 += 3;
        } else if (by2 == 8) {
            int n5 = TF.M(this.I, n3 + 1);
            this.H(n3, n5);
            n3 += 3;
        } else {
            this.G(n3, by2);
            ++n3;
        }
        return n3;
    }

    public void H(int n2, int n3) {
    }

    public int R(int n2, int n3, int n4) {
        return this.q(n2, n3, n4, true);
    }

    public int l(int n2, int n3, int n4) {
        return this.q(n2, n3, n4, false);
    }
}

