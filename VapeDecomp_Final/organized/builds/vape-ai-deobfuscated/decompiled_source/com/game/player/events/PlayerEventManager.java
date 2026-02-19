/*
 * Decompiled with CFR 0.152.
 */
package com.game.player.events;

import a.Qh;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.authentication.AuthenticationStateManager675;

public class PlayerEventManager
extends GameRenderContextBridge {
    private AuthenticationStateManager675 I;
    private static final ConcurrentRequestTracker t = new ConcurrentRequestTracker();
    private final Qh E;

    @Override
    public boolean fire() {
        return super.fire();
    }

    public void setDisplayName(AuthenticationStateManager675 authenticationStateManager675) {
        this.I = authenticationStateManager675;
    }

    public AuthenticationStateManager675 getDisplayName() {
        return this.I;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return t;
    }

    public PlayerEventManager(Qh qh, AuthenticationStateManager675 authenticationStateManager675) {
        this.E = qh;
        this.I = authenticationStateManager675;
    }

    public Qh getPlayer() {
        return this.E;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return t;
    }
}

