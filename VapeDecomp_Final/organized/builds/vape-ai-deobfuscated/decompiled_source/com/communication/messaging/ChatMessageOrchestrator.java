/*
 * Decompiled with CFR 0.152.
 */
package com.communication.messaging;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.network.transmission.PacketFragmentationHandler;
import com.security.authentication.AuthenticationStateManager675;

public class ChatMessageOrchestrator
extends GameRenderContextBridge {
    private Object H;
    private final Object N;
    private final Object r;
    private final Object p;
    private PacketFragmentationHandler V;
    private AuthenticationStateManager675 J;
    private final Object b;
    private static final ConcurrentRequestTracker g = new ConcurrentRequestTracker();

    public Object getOutputContentComponent() {
        return this.H;
    }

    public PacketFragmentationHandler getChatComponent() {
        try {
            if (this.V == null) {
                this.V = new PacketFragmentationHandler(this.N);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ChatMessageOrchestrator.a(customSystemException);
        }
        return this.V;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return g;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public ChatMessageOrchestrator(Object object, Object object2, Object object3, Object object4) {
        this.N = object;
        this.p = object2;
        this.r = object3;
        this.b = object4;
        this.H = object2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthenticationStateManager675 getContentComponent() {
        try {
            if (this.J == null) {
                this.J = new AuthenticationStateManager675(this.p);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ChatMessageOrchestrator.a(customSystemException);
        }
        return this.J;
    }

    public Object getGuiMessageTag() {
        return this.b;
    }

    public void setOutputContentComponent(AuthenticationStateManager675 authenticationStateManager675) {
        this.H = authenticationStateManager675.M();
    }

    public Object getMessageSignature() {
        return this.r;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return g;
    }
}

