/*
 * Decompiled with CFR 0.152.
 */
package com.entity.event;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class EntityEventMediator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker W = new ConcurrentRequestTracker();
    private final CryptographicTransformer v;

    public static ConcurrentRequestTracker getEventListeners() {
        return W;
    }

    public CryptographicTransformer getEntity() {
        return this.v;
    }

    public EntityEventMediator(CryptographicTransformer cryptographicTransformer) {
        this.v = cryptographicTransformer;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return W;
    }
}

