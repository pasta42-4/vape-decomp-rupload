/*
 * Decompiled with CFR 0.152.
 */
package com.app.temporal.sequencing;

import com.app.events.EventNotificationBroker2314;
import com.monitoring.performance.PerformanceMetricTracker;
import java.util.ArrayList;
import java.util.List;

public class TemporalDataSequencer {
    private final Class<? extends EventNotificationBroker2314> X;
    private final long K;
    private long B;
    private final List<PerformanceMetricTracker> n = new ArrayList<PerformanceMetricTracker>();

    public void T(PerformanceMetricTracker performanceMetricTracker) {
        this.n.add(performanceMetricTracker);
    }

    public void z() {
        this.B = System.nanoTime();
    }

    public long C() {
        return this.K;
    }

    public Class<? extends EventNotificationBroker2314> u() {
        return this.X;
    }

    public long d() {
        return this.B - this.K;
    }

    public TemporalDataSequencer(Class<? extends EventNotificationBroker2314> clazz) {
        this.X = clazz;
        this.K = System.nanoTime();
    }

    public List<PerformanceMetricTracker> X() {
        return this.n;
    }
}

