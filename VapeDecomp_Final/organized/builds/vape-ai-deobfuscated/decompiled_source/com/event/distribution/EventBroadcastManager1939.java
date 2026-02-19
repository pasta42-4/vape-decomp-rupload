/*
 * Decompiled with CFR 0.152.
 */
package com.event.distribution;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventBroadcastManager1939
extends GameRenderContextBridge {
    private static String v = null;
    private static final ConcurrentRequestTracker h;
    private static String z;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return h;
    }

    static {
        z = null;
        h = new ConcurrentRequestTracker();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return h;
    }

    EventBroadcastManager1939() {
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

