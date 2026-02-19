/*
 * Decompiled with CFR 0.152.
 */
package com.game.rendering;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class EntityRenderEvent
extends GameRenderContextBridge {
    private final CryptographicTransformer L;
    private static final ConcurrentRequestTracker v = new ConcurrentRequestTracker();
    private int D;
    private final float w;

    public void setResult(int n) {
        this.D = n;
    }

    public int getResult() {
        return this.D;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return v;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return v;
    }

    public float getPartialTick() {
        return this.w;
    }

    public EntityRenderEvent(Object object, int n, float f) {
        this.L = new CryptographicTransformer(object);
        this.D = n;
        this.w = f;
    }

    public CryptographicTransformer getEntity() {
        return this.L;
    }
}

