/*
 * Decompiled with CFR 0.152.
 */
package com.app.game.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class GameEventDispatcher2026
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker Y = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return Y;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return Y;
    }
}

