/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventDispatcherRegistry1993
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker G = new ConcurrentRequestTracker();

    public static ConcurrentRequestTracker getEventListeners() {
        return G;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return G;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public EventDispatcherRegistry1993(Object object) {
    }
}

