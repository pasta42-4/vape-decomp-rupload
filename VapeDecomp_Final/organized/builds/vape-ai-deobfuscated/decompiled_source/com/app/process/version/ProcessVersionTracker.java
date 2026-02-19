/*
 * Decompiled with CFR 0.152.
 */
package com.app.process.version;

import com.event.management.ContextualEventDispatcher;
import com.spatial.events.SpatialEventEmitter;

public class ProcessVersionTracker
extends SpatialEventEmitter {
    public ProcessVersionTracker(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public ProcessVersionTracker(Object object) {
        this(new ContextualEventDispatcher(object).X(), new ContextualEventDispatcher(object).F(), new ContextualEventDispatcher(object).f());
    }
}

