/*
 * Decompiled with CFR 0.152.
 */
package com.event.communication;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class EventBroadcastRegistry
extends GameRenderContextBridge {
    private final Object c;
    private static final ConcurrentRequestTracker E = new ConcurrentRequestTracker();
    private CryptographicTransformer u = null;

    public static ConcurrentRequestTracker getEventListeners() {
        return E;
    }

    public CryptographicTransformer getEntity() {
        try {
            if (this.u == null) {
                this.u = new CryptographicTransformer(this.c);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventBroadcastRegistry.a(customSystemException);
        }
        return this.u;
    }

    public EventBroadcastRegistry(Object object) {
        this.c = object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return E;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

