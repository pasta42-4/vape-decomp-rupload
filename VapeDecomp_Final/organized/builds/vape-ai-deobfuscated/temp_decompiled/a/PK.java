/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;

public class pk
extends KG {
    private double V;
    private double S;
    private double i;
    private static final Fm I = new Fm();

    public pk(double d2, double d3, double d4) {
        this.i = d2;
        this.V = d3;
        this.S = d4;
    }

    @Override
    public Fm getListeners() {
        return I;
    }

    public static Fm getEventListeners() {
        return I;
    }

    public pk setZ(double d2) {
        this.S = d2;
        return this;
    }

    public pk setY(double d2) {
        this.V = d2;
        return this;
    }

    public pk setX(double d2) {
        this.i = d2;
        return this;
    }

    public double getZ() {
        return this.S;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public double getY() {
        return this.V;
    }

    public double getX() {
        return this.i;
    }
}

