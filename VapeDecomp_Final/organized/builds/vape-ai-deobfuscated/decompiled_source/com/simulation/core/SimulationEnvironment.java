/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.core;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.system.resource.ResourceAllocationController2377;

public class SimulationEnvironment
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker B = new ConcurrentRequestTracker();
    private Object z;
    private long N = 0L;

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return B;
    }

    public void setWorldTime(long l) {
        this.N = l;
        this.setCanceled(true);
    }

    public long getWorldTime() {
        return this.N;
    }

    public ResourceAllocationController2377 getInstance() {
        return new ResourceAllocationController2377(this.z);
    }

    public SimulationEnvironment(Object object) {
        this.z = object;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return B;
    }
}

