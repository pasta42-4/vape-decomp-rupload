/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.resilience.coordination.ResilienceCoordinationManager;
import com.ui.rendering.UIRenderingCoordinator;
import java.awt.Color;

class EventDispatchCoordinator2458
extends UIRenderingCoordinator {
    final ResilienceCoordinationManager D;

    @Override
    public double e() {
        return 68.0;
    }

    EventDispatchCoordinator2458(ResilienceCoordinationManager resilienceCoordinationManager, String string, double d2, double d3, double d4, double d5, boolean bl, boolean bl2, Color color) {
        this.D = resilienceCoordinationManager;
        super(string, d2, d3, d4, d5, bl, bl2, color);
    }
}

