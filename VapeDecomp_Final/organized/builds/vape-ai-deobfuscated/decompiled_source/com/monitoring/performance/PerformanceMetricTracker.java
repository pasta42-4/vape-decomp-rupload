/*
 * Decompiled with CFR 0.152.
 */
package com.monitoring.performance;

import com.core.proxy.ServiceProxyDelegate;

public class PerformanceMetricTracker {
    private long v;
    private final ServiceProxyDelegate E;
    private final long l;

    public PerformanceMetricTracker(ServiceProxyDelegate serviceProxyDelegate) {
        this.E = serviceProxyDelegate;
        this.l = System.nanoTime();
    }

    public long z() {
        return this.v;
    }

    public ServiceProxyDelegate q() {
        return this.E;
    }

    public void Y() {
        this.v = System.nanoTime() - this.l;
    }
}

