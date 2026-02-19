/*
 * Decompiled with CFR 0.152.
 */
package com.client.event;

import a.Qh;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class ClientEventOrchestrator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker G = new ConcurrentRequestTracker();
    private final Qh S;
    private final float W;

    @Override
    public boolean fire() {
        return super.fire();
    }

    public ClientEventOrchestrator(Object object, float f) {
        this.S = new Qh(object);
        this.W = f;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return G;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return G;
    }

    public float getPartial() {
        return this.W;
    }

    public Qh getClientPlayer() {
        return this.S;
    }
}

