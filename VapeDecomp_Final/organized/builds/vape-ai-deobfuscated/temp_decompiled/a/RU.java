/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DT;

public interface ru {
    default public void q(double d2, double d3, double d4) {
        this.F(DT.N(d2, d3, d4));
    }

    public void F(DT var1);

    default public void t(int n2, int n3, int n4) {
        this.F(DT.N(n2, n3, n4));
    }

    public DT N();

    default public void X(float f10, float f11, float f12) {
        this.F(DT.N(f10, f11, f12));
    }
}

