/*
 * Decompiled with CFR 0.152.
 */
package com.caching.strategy;

import a.h6;
import com.resilience.coordination.ResilienceCoordinationManager;
import java.awt.Color;

class CacheInvalidationStrategy1973
extends h6 {
    final ResilienceCoordinationManager Bx;

    CacheInvalidationStrategy1973(ResilienceCoordinationManager resilienceCoordinationManager, String string, Color color) {
        this.Bx = resilienceCoordinationManager;
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

