/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.QF;

public class p8
extends KG {
    private static float y;
    private final QF s;
    private static final Fm u;

    public double getStepHeight() {
        return this.s.m();
    }

    public static Fm getEventListeners() {
        return u;
    }

    public double getRealHeight() {
        return y;
    }

    static float access$000() {
        return y;
    }

    static {
        u = new Fm();
    }

    public QF getEntity() {
        return this.s;
    }

    public void setStepHeight(double d2) {
        this.s.Z((float)d2);
    }

    @Override
    public Fm getListeners() {
        return u;
    }

    static float access$002(float f10) {
        y = f10;
        return y;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    p8(Object object) {
        this.s = new QF(object);
    }
}

