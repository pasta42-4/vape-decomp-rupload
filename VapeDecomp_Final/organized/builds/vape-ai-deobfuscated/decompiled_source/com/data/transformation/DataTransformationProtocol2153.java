/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.event.management.ContextualEventDispatcher;

public interface DataTransformationProtocol2153 {
    default public void q(double d2, double d3, double d4) {
        this.F(ContextualEventDispatcher.N(d2, d3, d4));
    }

    public void F(ContextualEventDispatcher var1);

    default public void t(int n, int n2, int n3) {
        this.F(ContextualEventDispatcher.N(n, n2, n3));
    }

    public ContextualEventDispatcher N();

    default public void X(float f, float f2, float f3) {
        this.F(ContextualEventDispatcher.N(f, f2, f3));
    }
}

