/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dn;
import a.Fm;
import a.KG;
import a.O_;
import a.QF;

public class pq
extends KG {
    private final double i;
    private Dn F;
    private final double I;
    private static final Fm k = new Fm();
    private QF f;
    private final Object g;
    private final double J;
    private final Object u;

    public double getZ() {
        return this.I;
    }

    public QF getEntity() {
        try {
            if (this.f == null) {
                this.f = new QF(this.u);
            }
        }
        catch (O_ o_2) {
            throw pq.a(o_2);
        }
        return this.f;
    }

    public static Fm getEventListeners() {
        return k;
    }

    public double getY() {
        return this.i;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public Fm getListeners() {
        return k;
    }

    public pq(Object object, double d2, double d3, double d4, Object object2) {
        this.u = object;
        this.g = object2;
        this.J = d2;
        this.i = d3;
        this.I = d4;
    }

    public Dn getMatrixStack() {
        try {
            if (this.F == null) {
                this.F = new Dn(this.g);
            }
        }
        catch (O_ o_2) {
            throw pq.a(o_2);
        }
        return this.F;
    }

    public double getX() {
        return this.J;
    }
}

