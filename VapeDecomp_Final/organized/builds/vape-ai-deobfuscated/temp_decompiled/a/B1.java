/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.bE;
import a.ht;

public class b1
extends bE {
    private final ht b;
    private final bE D;

    @Override
    public double b() {
        return this.b.b();
    }

    public b1(ht ht2, double d2, bE bE2) {
        super(d2, 0.0);
        this.b = ht2;
        this.D = bE2;
    }

    public b1(ht ht2, bE bE2) {
        this(ht2, 0.0, bE2);
    }

    @Override
    public double z() {
        return this.b.b();
    }

    @Override
    public void G() {
        super.G();
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.P(-1.0);
        this.D.w(this.b());
        this.D.E();
    }
}

