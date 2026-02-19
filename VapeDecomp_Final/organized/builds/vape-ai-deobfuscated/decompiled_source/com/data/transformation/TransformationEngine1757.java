/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.ui.rendering.UIRenderingController1597;
import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;

public class TransformationEngine1757
extends UIRenderingController1597 {
    private ConcurrentFilteringCoordinator j;
    private int u;

    public int C() {
        return this.u;
    }

    public TransformationEngine1757(int n, int n2, int n3, int n4, ConcurrentFilteringCoordinator concurrentFilteringCoordinator, AtomicBoolean atomicBoolean, int n5) {
        super(n, n2, n3, n4, concurrentFilteringCoordinator.e(), atomicBoolean);
        this.j = concurrentFilteringCoordinator;
        this.u = n5;
    }

    public void z(int n) {
        this.u = n;
    }

    public void R(int n, int n2, int n3, int n4, ConcurrentFilteringCoordinator concurrentFilteringCoordinator, AtomicBoolean atomicBoolean, int n5) {
        this.N = n;
        this.n = n2;
        this.D = n3;
        this.x = n4;
        this.j = concurrentFilteringCoordinator;
        this.h = atomicBoolean;
        this.u = n5;
    }

    public boolean N() {
        return this.j.f();
    }

    public Color c() {
        return this.j.e();
    }
}

