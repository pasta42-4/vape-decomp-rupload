/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class PlayerMovementEventHandler
extends GameRenderContextBridge {
    private final boolean M;
    private final CryptographicTransformer j;
    private static final ConcurrentRequestTracker g = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return g;
    }

    public PlayerMovementEventHandler(Object object, boolean bl) {
        this.j = new CryptographicTransformer(object);
        this.M = bl;
    }

    public boolean isNewStateSprinting() {
        return this.M;
    }

    public CryptographicTransformer getEntity() {
        return this.j;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return g;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

