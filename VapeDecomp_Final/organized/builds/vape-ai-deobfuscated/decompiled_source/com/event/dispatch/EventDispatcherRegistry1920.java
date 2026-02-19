/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventDispatcherRegistry1920
extends GameRenderContextBridge {
    public final float H;
    public final float K;
    private static final ConcurrentRequestTracker M = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return M;
    }

    public EventDispatcherRegistry1920(float f, float f2) {
        this.K = f;
        this.H = f2;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return M;
    }
}

