/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.core;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.authentication.AuthenticationStateManager675;

public class MessageRoutingEngine1898
extends GameRenderContextBridge {
    private AuthenticationStateManager675 c;
    private static final ConcurrentRequestTracker p = new ConcurrentRequestTracker();

    public AuthenticationStateManager675 getMessage() {
        return this.c;
    }

    public MessageRoutingEngine1898(AuthenticationStateManager675 authenticationStateManager675) {
        this.c = authenticationStateManager675;
    }

    public void setMessage(AuthenticationStateManager675 authenticationStateManager675) {
        this.c = authenticationStateManager675;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return p;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return p;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

