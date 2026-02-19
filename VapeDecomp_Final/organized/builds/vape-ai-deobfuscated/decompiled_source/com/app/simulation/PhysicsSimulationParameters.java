/*
 * Decompiled with CFR 0.152.
 */
package com.app.simulation;

public class PhysicsSimulationParameters {
    public final int p;
    public final int v;
    public float g;
    public final int l;
    public float R;
    public float T;
    public final int u;
    public float L;

    public PhysicsSimulationParameters(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        this.p = n;
        this.l = n2;
        this.v = n3;
        this.u = n4;
        this.L = f;
        this.R = f2;
        this.T = f3;
        this.g = f4;
    }
}

