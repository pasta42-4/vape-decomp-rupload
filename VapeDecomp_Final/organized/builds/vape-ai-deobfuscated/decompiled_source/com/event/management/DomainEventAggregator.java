/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class DomainEventAggregator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker y = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return y;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return y;
    }
}

