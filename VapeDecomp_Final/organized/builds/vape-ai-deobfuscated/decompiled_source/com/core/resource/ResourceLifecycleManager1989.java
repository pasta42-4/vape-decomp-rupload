/*
 * Decompiled with CFR 0.152.
 */
package com.core.resource;

import a.h6;
import com.resilience.coordination.ResilienceCoordinationManager;
import java.awt.Color;

class ResourceLifecycleManager1989
extends h6 {
    final ResilienceCoordinationManager Rq;

    ResourceLifecycleManager1989(ResilienceCoordinationManager resilienceCoordinationManager, String string, Color color) {
        this.Rq = resilienceCoordinationManager;
        super(string, color);
    }

    @Override
    public double e() {
        return this.J().D(this.O()) + 3.0;
    }

    @Override
    public double z() {
        return 8.0;
    }
}

