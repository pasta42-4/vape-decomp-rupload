/*
 * Decompiled with CFR 0.152.
 */
package com.game.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class PlayerEventMediator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker v = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        try {
            if (!TemporalMetadataResolver.h.V()) {
                this.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerEventMediator.a(customSystemException);
        }
        return super.fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return v;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return v;
    }
}

