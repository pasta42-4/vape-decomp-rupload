/*
 * Decompiled with CFR 0.152.
 */
package com.physics.simulation;

import com.event.management.ContextualEventDispatcher;
import com.spatial.events.SpatialEventEmitter;

public class PhysicsPositionTracker
extends SpatialEventEmitter {
    @Override
    public double getZ() {
        return super.getZ();
    }

    public Object getVector() {
        return ContextualEventDispatcher.N(this.getX(), this.getY(), this.getZ()).M();
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    public PhysicsPositionTracker(Object object) {
        this(new ContextualEventDispatcher(object).X(), new ContextualEventDispatcher(object).F(), new ContextualEventDispatcher(object).f());
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public PhysicsPositionTracker(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }
}

