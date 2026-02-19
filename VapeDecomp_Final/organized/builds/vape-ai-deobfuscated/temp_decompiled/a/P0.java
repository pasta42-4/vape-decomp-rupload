/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dn;
import a.EP;
import a.Fm;
import a.KG;
import a.Qh;
import a.tH;

public class p0
extends KG {
    private final tH Q;
    private static final Fm u = new Fm();
    private double o;
    private double Z;
    private final Qh f;
    private final Dn e;
    private final float h;
    private double E;

    public double getX() {
        return this.o;
    }

    public Dn getMatrixStack() {
        return this.e;
    }

    public p0(Object object, Object object2, Object object3) {
        this.Q = new tH(object3);
        this.f = new Qh(object);
        this.e = new Dn(object2);
        this.h = EP.K().h();
        this.o = this.f.F();
        this.E = this.f.V();
        this.Z = this.f.B();
    }

    public float getPartialTicks() {
        return this.h;
    }

    public Qh getEntityPlayer() {
        return this.f;
    }

    public p0(Object object, Object object2, float f10, Object object3) {
        this.Q = new tH(object);
        this.f = new Qh(object2);
        this.h = f10;
        this.e = new Dn(object3);
        this.o = this.f.F();
        this.E = this.f.V();
        this.Z = this.f.B();
    }

    @Override
    public Fm getListeners() {
        return u;
    }

    public static Fm getEventListeners() {
        return u;
    }

    public double getZ() {
        return this.Z;
    }

    public tH getRenderer() {
        return this.Q;
    }

    public p0(Object object, Object object2, double d2, double d3, double d4, float f10) {
        this.Q = new tH(object);
        this.f = new Qh(object2);
        this.h = f10;
        this.e = null;
        this.o = d2;
        this.E = d3;
        this.Z = d4;
    }

    public double getY() {
        return this.E;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

