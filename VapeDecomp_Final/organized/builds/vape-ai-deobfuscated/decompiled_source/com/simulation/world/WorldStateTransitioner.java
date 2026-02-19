/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.simulation.world;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.network.config.ConnectionConfigurationResolver;
import org.jetbrains.annotations.Nullable;

public class WorldStateTransitioner
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker a = new ConcurrentRequestTracker();
    @Nullable
    private final ConnectionConfigurationResolver s;
    @Nullable
    private final ConnectionConfigurationResolver m;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return a;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return a;
    }

    @Nullable
    public ConnectionConfigurationResolver getPreviousWorld() {
        return this.s;
    }

    public WorldStateTransitioner(@Nullable ConnectionConfigurationResolver connectionConfigurationResolver, @Nullable ConnectionConfigurationResolver connectionConfigurationResolver2) {
        this.s = connectionConfigurationResolver;
        this.m = connectionConfigurationResolver2;
    }

    @Nullable
    public ConnectionConfigurationResolver getNewWorld() {
        return this.m;
    }
}

