/*
 * Decompiled with CFR 0.152.
 */
package com.spatial.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class SpatialEventEmitter
extends GameRenderContextBridge {
    private double V;
    private double S;
    private double i;
    private static final ConcurrentRequestTracker I = new ConcurrentRequestTracker();

    public SpatialEventEmitter(double d2, double d3, double d4) {
        this.i = d2;
        this.V = d3;
        this.S = d4;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return I;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return I;
    }

    public SpatialEventEmitter setZ(double d2) {
        this.S = d2;
        return this;
    }

    public SpatialEventEmitter setY(double d2) {
        this.V = d2;
        return this;
    }

    public SpatialEventEmitter setX(double d2) {
        this.i = d2;
        return this;
    }

    public double getZ() {
        return this.S;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public double getY() {
        return this.V;
    }

    public double getX() {
        return this.i;
    }
}

