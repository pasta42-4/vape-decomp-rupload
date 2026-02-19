/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

public class PixelCoordinateCalculator {
    private int I;
    private int m;
    private int U;
    private int A;
    private int Z;

    public PixelCoordinateCalculator(int n, int n2, int n3, int n4, int n5) {
        this.U = n;
        this.I = n2;
        this.Z = n3;
        this.A = n4;
        this.m = n5;
    }

    public int F() {
        return this.U;
    }

    public int N() {
        return this.I;
    }

    public int V() {
        return this.Z;
    }

    public int f() {
        return this.m;
    }

    public int J() {
        return this.A;
    }

    public void O(int n, int n2, int n3, int n4, int n5) {
        this.U = n;
        this.I = n2;
        this.Z = n3;
        this.A = n4;
        this.m = n5;
    }
}

