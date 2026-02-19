/*
 * Decompiled with CFR 0.152.
 */
package com.event.distribution;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

@Deprecated
public class EventBroadcastCenter
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker s = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return s;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return s;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

