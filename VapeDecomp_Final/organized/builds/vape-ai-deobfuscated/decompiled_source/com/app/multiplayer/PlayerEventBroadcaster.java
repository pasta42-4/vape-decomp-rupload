/*
 * Decompiled with CFR 0.152.
 */
package com.app.multiplayer;

import a.Qh;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.metadata.ReflectionMetadataResolver;

public class PlayerEventBroadcaster
extends GameRenderContextBridge {
    private Qh j;
    private final Object z;
    private static final ConcurrentRequestTracker i = new ConcurrentRequestTracker();

    public static ConcurrentRequestTracker getEventListeners() {
        return i;
    }

    public Qh getPlayer() {
        try {
            if (this.j == null) {
                this.j = new Qh(this.z);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerEventBroadcaster.a(customSystemException);
        }
        return this.j;
    }

    @Override
    public boolean fire() {
        try {
            if (!ReflectionMetadataResolver.rl.isInstance(this.z)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerEventBroadcaster.a(customSystemException);
        }
        return super.fire();
    }

    PlayerEventBroadcaster(Object object) {
        this.z = object;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return i;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

