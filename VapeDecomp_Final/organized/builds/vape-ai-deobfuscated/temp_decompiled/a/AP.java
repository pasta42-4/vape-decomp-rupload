/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.fp;
import a.rn;
import a.tU;
import java.awt.Color;

class ap {
    public rn Q;
    final fp y;
    public rn Z;
    boolean A;
    boolean h;
    tU G;

    ap(fp fp2, tU tU2) {
        this.y = fp2;
        this.Z = new rn(0.05, new Color(20, 20, 20, 180), new Color(255, 255, 255, 255));
        this.Q = new rn(0.05, new Color(255, 255, 255, 255), new Color(20, 20, 20, 255));
        this.A = true;
        this.G = tU2;
    }

    public rn C() {
        return this.Z;
    }

    public void U() {
        this.Z.c();
        this.Q.c();
        this.A = false;
    }

    public void l() {
    }

    public rn B() {
        return this.Q;
    }

    public boolean b() {
        return this.A;
    }

    public void h() {
        this.Z.q();
        this.Q.q();
        this.A = true;
    }
}

