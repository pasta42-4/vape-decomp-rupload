/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.E4;
import a.Hp;
import a.Qt;
import a.pq;

public class D3
implements Hp {
    private final double b;
    private final double r;
    private final Qt Y;
    private final Object h;
    private final double u;

    public D3(Object object, double d2, double d3, double d4) {
        this(null, object, d2, d3, d4);
    }

    public D3(Object object, Object object2, double d2, double d3, double d4) {
        this.h = object;
        this.Y = new Qt(object2);
        this.b = d2;
        this.r = d3;
        this.u = d4;
    }

    public double getPosY() {
        return this.r;
    }

    public Qt getClientPlayer() {
        return this.Y;
    }

    @Override
    public boolean fire() {
        boolean bl2 = new pq(this.Y, this.b, this.r, this.u, null).fire();
        if (this.h != null) {
            E4 e42 = new E4(this.h);
            e42.Q(bl2);
        }
        return bl2;
    }

    public double getPosZ() {
        return this.u;
    }

    public double getPosX() {
        return this.b;
    }

    public Object getForgeEvent() {
        return this.h;
    }
}

