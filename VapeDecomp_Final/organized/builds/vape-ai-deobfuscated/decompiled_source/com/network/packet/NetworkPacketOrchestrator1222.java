/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.network.packet;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.messaging.core.MessageInterceptor;
import com.network.connection.ConnectionLifecycleHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.auth.AuthorizationManager;
import org.jetbrains.annotations.Nullable;

public class NetworkPacketOrchestrator1222
extends GameRenderContextBridge {
    @Nullable
    private MessageInterceptor B;
    private final Object D;
    private static final ConcurrentRequestTracker N = new ConcurrentRequestTracker();
    @Nullable
    private ConnectionLifecycleHandler K;
    private final Object c;

    public AuthorizationManager getNetHandler() {
        return new AuthorizationManager(this.getNetworkManager().A());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkPacketOrchestrator1222(Object object, Object object2) {
        this.c = object;
        this.D = object2;
    }

    public MessageInterceptor getNetworkManager() {
        try {
            if (this.B == null) {
                this.B = new MessageInterceptor(this.c);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketOrchestrator1222.a(customSystemException);
        }
        return this.B;
    }

    public void setPacket(ConnectionLifecycleHandler connectionLifecycleHandler) {
        this.K = connectionLifecycleHandler;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return N;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return N;
    }

    public ConnectionLifecycleHandler getPacket() {
        try {
            if (this.K == null) {
                this.K = new ConnectionLifecycleHandler(this.D);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketOrchestrator1222.a(customSystemException);
        }
        return this.K;
    }

    @Override
    public boolean fire() {
        try {
            if (!this.getNetworkManager().A().B(ReflectionMetadataResolver.US)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketOrchestrator1222.a(customSystemException);
        }
        return super.fire();
    }

    public Object getPacketInstance() {
        return this.D;
    }
}

