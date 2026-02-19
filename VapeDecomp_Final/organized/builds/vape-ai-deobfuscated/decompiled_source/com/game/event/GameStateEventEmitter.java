/*
 * Decompiled with CFR 0.152.
 */
package com.game.event;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.game.rendering.GameRenderContextBridge;
import com.network.io.NetworkStreamHandler;

public class GameStateEventEmitter
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker f = new ConcurrentRequestTracker();
    private final float S;

    public float getTicks() {
        return this.S;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return f;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return f;
    }

    GameStateEventEmitter(NetworkStreamHandler networkStreamHandler) {
        this.S = networkStreamHandler.B(false);
    }

    GameStateEventEmitter(float f) {
        this.S = f == -1.0f ? ApplicationLifecycleManager.K().h() : f;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

