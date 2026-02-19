/*
 * Decompiled with CFR 0.152.
 */
package com.event.orchestration;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class ClusterEventOrchestrator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker s = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return s;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return s;
    }
}

