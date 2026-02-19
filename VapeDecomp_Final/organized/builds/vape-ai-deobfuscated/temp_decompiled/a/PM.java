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

public class pm
extends KG {
    private final Qh C;
    private static final Fm D = new Fm();
    private final Dn w;
    private final float o;
    private final tH Z;

    public Qh getEntityPlayer() {
        return this.C;
    }

    @Override
    public Fm getListeners() {
        return D;
    }

    public pm(Object object, Object object2, float f10) {
        this.Z = new tH(object);
        this.C = new Qh(object2);
        this.o = f10;
        this.w = null;
    }

    public tH getRenderer() {
        return this.Z;
    }

    public pm(Object object, Object object2, float f10, Object object3) {
        this.Z = new tH(object);
        this.C = new Qh(object2);
        this.o = f10;
        this.w = new Dn(object3);
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public pm(Object object, Object object2, Object object3) {
        this.Z = new tH(object3);
        this.C = new Qh(object);
        this.w = new Dn(object2);
        this.o = EP.K().h();
    }

    public static Fm getEventListeners() {
        return D;
    }

    public Dn getMatrixStack() {
        return this.w;
    }

    public float getPartialTicks() {
        return this.o;
    }
}

