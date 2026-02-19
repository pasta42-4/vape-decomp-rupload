/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.app.resource.management.ResourceAllocator1162;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventDispatchRegistry2013
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker Z = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        ResourceAllocator1162.w(false);
        return super.fire();
    }

    public EventDispatchRegistry2013(float f) {
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return Z;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return Z;
    }
}

