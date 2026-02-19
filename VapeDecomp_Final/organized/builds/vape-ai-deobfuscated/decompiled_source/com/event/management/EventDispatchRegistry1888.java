/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventDispatchRegistry1888
extends GameRenderContextBridge {
    private Object t;
    private boolean G;
    private int s;
    private static final ConcurrentRequestTracker B = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return B;
    }

    public EventDispatchRegistry1888(Object object, int n, boolean bl) {
        this.t = object;
        this.s = n;
        this.G = bl;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return B;
    }
}

