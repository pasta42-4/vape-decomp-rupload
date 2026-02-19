/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrency.monitoring;

import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;

public class ThreadHealthMonitor
extends ObjectLifecycleTracker {
    public void E(boolean bl) {
        TemporalMetadataResolver.h.u().dR.E(this.H, bl);
    }

    public ThreadHealthMonitor(Object object) {
        super(object);
    }
}

