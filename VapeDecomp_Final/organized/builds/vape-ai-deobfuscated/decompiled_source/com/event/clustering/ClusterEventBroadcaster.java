/*
 * Decompiled with CFR 0.152.
 */
package com.event.clustering;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class ClusterEventBroadcaster
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker o = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return o;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return o;
    }
}

