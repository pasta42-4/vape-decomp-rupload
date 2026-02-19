/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.JM;
import a.Qf;
import a.Qg;
import java.util.ArrayList;
import java.util.List;

class l {
    private final List<Integer> c = new ArrayList<Integer>();
    private final int J;
    private final int G;

    public List<Integer> S() {
        return this.c;
    }

    public l(int n2, int n3) {
        this.G = n2;
        this.J = n3;
    }

    public void l() {
        Qg qg2 = EP.U();
        List<Qf> list = qg2.t().D();
        JM jM2 = new JM(this, list);
        this.c.sort(jM2);
    }

    static int Q(l l10) {
        return l10.J;
    }

    public void K(int n2) {
        this.c.add(n2);
    }

    public int G() {
        return this.J;
    }
}

