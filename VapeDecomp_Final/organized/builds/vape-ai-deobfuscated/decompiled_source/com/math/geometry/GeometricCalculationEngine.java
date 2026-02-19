/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

public class GeometricCalculationEngine {
    public float h;
    public float a;
    public float X;

    public float V() {
        return this.a;
    }

    public void L(float f) {
        this.a = f;
    }

    public float o() {
        return this.X;
    }

    public void b(float f) {
        this.h = f;
    }

    public GeometricCalculationEngine(float f, float f2, float f3) {
        this.h = f;
        this.X = f2;
        this.a = f3;
    }

    public void p(float f) {
        this.X = f;
    }

    public float z() {
        return this.h;
    }
}

