/*
 * Decompiled with CFR 0.152.
 */
package com.metrics.analysis;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.protocol.dynamic.DynamicProtocolResolver;

public class DimensionalMetricsTracker {
    private final int D;
    private final int v;
    private final int V;
    private final int m;

    public static DynamicProtocolResolver X() {
        return new DynamicProtocolResolver();
    }

    public int q() {
        return this.V;
    }

    public DimensionalMetricsTracker(int n, int n2, int n3, int n4) {
        this.D = n;
        this.v = n2;
        this.V = n3;
        this.m = n4;
    }

    public int j() {
        return this.D;
    }

    public void H() {
        ApplicationLifecycleManager.n().e(this.D, this.v, this.V, this.m, ApplicationLifecycleManager.U());
    }

    public int N() {
        return this.v;
    }

    public int n() {
        return this.m;
    }
}

