/*
 * Decompiled with CFR 0.152.
 */
package com.event.notification;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventNotificationBroker
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker u = new ConcurrentRequestTracker();

    public static ConcurrentRequestTracker getEventListeners() {
        return u;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return u;
    }

    @Override
    public boolean fire() {
        this.setCanceled(true);
        return super.fire();
    }
}

