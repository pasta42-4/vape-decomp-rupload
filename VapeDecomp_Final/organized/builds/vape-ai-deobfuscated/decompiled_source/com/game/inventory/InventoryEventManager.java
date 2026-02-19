/*
 * Decompiled with CFR 0.152.
 */
package com.game.inventory;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.runtime.context.LightweightExecutionContext;

public class InventoryEventManager
extends GameRenderContextBridge {
    private final LightweightExecutionContext D;
    private static final ConcurrentRequestTracker g = new ConcurrentRequestTracker();

    public InventoryEventManager(Object object) {
        this.D = new LightweightExecutionContext(object);
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return g;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return g;
    }

    public LightweightExecutionContext getItemStack() {
        return this.D;
    }
}

