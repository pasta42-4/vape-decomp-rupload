/*
 * Decompiled with CFR 0.152.
 */
package com.game.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.game.rendering.GameRenderContextBridge;
import com.system.configuration.SystemConfigurationOrchestrator;

public class GameEventDispatcher1852
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker c = new ConcurrentRequestTracker();

    public SystemConfigurationOrchestrator getPlayer() {
        return ApplicationLifecycleManager.U();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return c;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return c;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

