/*
 * Decompiled with CFR 0.152.
 */
package com.app.input.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class InputEventBroker
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker L = new ConcurrentRequestTracker();

    public static ConcurrentRequestTracker getEventListeners() {
        return L;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return L;
    }
}

