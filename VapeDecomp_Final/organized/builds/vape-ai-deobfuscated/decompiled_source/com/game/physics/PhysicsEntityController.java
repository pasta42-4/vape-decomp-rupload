/*
 * Decompiled with CFR 0.152.
 */
package com.game.physics;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class PhysicsEntityController
extends GameRenderContextBridge {
    private static float y;
    private final CryptographicTransformer s;
    private static final ConcurrentRequestTracker u;

    public double getStepHeight() {
        return this.s.m();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return u;
    }

    public double getRealHeight() {
        return y;
    }

    static float access$000() {
        return y;
    }

    static {
        u = new ConcurrentRequestTracker();
    }

    public CryptographicTransformer getEntity() {
        return this.s;
    }

    public void setStepHeight(double d2) {
        this.s.Z((float)d2);
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return u;
    }

    static float access$002(float f) {
        y = f;
        return y;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    PhysicsEntityController(Object object) {
        this.s = new CryptographicTransformer(object);
    }
}

