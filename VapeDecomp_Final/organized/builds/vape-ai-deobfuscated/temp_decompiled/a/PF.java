/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DT;
import a.pk;

public class pf
extends pk {
    @Override
    public double getZ() {
        return super.getZ();
    }

    public Object getVector() {
        return DT.N(this.getX(), this.getY(), this.getZ()).M();
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    public pf(Object object) {
        this(new DT(object).X(), new DT(object).F(), new DT(object).f());
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public pf(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }
}

