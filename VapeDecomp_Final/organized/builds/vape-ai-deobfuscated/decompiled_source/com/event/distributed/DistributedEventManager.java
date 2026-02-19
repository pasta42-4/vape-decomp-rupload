/*
 * Decompiled with CFR 0.152.
 */
package com.event.distributed;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class DistributedEventManager
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker o = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return o;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return o;
    }
}

