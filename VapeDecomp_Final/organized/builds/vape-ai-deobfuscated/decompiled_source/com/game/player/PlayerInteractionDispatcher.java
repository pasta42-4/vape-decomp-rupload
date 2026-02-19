/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.system.configuration.SystemConfigurationOrchestrator;

public class PlayerInteractionDispatcher
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker I = new ConcurrentRequestTracker();
    private final SystemConfigurationOrchestrator h;

    public static ConcurrentRequestTracker getEventListeners() {
        return I;
    }

    public SystemConfigurationOrchestrator getPlayer() {
        return this.h;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return I;
    }

    PlayerInteractionDispatcher(Object object) {
        this.h = new SystemConfigurationOrchestrator(object);
    }
}

