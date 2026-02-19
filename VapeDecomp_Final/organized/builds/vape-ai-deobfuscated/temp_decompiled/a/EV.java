/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DT;
import a.IF;
import a.Qt;
import a.Yu;
import a.kg;
import a.on;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ev {
    private double R;
    private float x;
    private IF V;
    private boolean Z;
    private boolean D;
    private on N;
    private float l;
    private double T;
    private kg v;
    private double k;
    private kg f;
    private boolean p;

    public Yu b() {
        return new Yu(this.x, this.l);
    }

    public ev(Qt qt2) {
        this.T = qt2.F();
        this.k = qt2.V();
        this.R = qt2.B();
        this.x = qt2.q();
        this.l = qt2.S();
        this.D = qt2.j();
        this.Z = qt2.H();
        this.p = qt2.o();
    }

    public boolean F() {
        return this.Z;
    }

    public kg J() {
        return new kg(this.T, this.k, this.R);
    }

    public void e(kg kg2) {
        this.v = kg2;
    }

    public double A() {
        return this.k;
    }

    public on U() {
        return this.N;
    }

    public double g() {
        return this.R;
    }

    public IF M() {
        return this.V;
    }

    public boolean M() {
        return this.D;
    }

    public void D(IF iF2) {
        this.V = iF2;
    }

    public float u() {
        return this.x;
    }

    public kg L() {
        return this.v;
    }

    public double z() {
        return this.T;
    }

    public DT W() {
        return DT.N(this.T, this.k, this.R);
    }

    public void I(on on2) {
        this.N = on2;
    }

    public boolean Z() {
        return this.p;
    }

    public void j(kg kg2) {
        this.f = kg2;
    }

    public kg E() {
        return this.f;
    }

    public float n() {
        return this.l;
    }
}

