/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import a.Z3;
import com.concurrency.tracking.ConcurrentRequestTracker;

public interface EventNotificationBroker2314 {
    public ConcurrentRequestTracker getListeners();

    default public boolean fire() {
        Z3.s().k(this);
        return true;
    }
}

