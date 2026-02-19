/*
 * Decompiled with CFR 0.152.
 */
package com.game.event;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.physics.PhysicsEntityController;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class GameEventDispatcher
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker M = new ConcurrentRequestTracker();
    private final CryptographicTransformer i;

    public static ConcurrentRequestTracker getEventListeners() {
        return M;
    }

    @Override
    public boolean fire() {
        this.i.Z(PhysicsEntityController.access$000());
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return M;
    }

    public GameEventDispatcher(Object object) {
        this.i = new CryptographicTransformer(object);
    }
}

