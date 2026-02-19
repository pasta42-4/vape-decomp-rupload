/*
 * Decompiled with CFR 0.152.
 */
package com.network.event;

import com.app.collection.CollectionOrchestrator;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.messaging.core.MessageInterceptor;
import com.network.connection.ConnectionLifecycleHandler;
import com.object.lifecycle.ObjectLifecycleMediator;

public class NetworkEventDispatcher
extends GameRenderContextBridge {
    private boolean D = false;
    private static final ConcurrentRequestTracker C = new ConcurrentRequestTracker();
    private MessageInterceptor b;
    private ConnectionLifecycleHandler w;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void setPacket(ConnectionLifecycleHandler connectionLifecycleHandler) {
        this.w = connectionLifecycleHandler;
        this.D = true;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return C;
    }

    @Override
    public boolean fire() {
        try {
            if (ObjectLifecycleMediator.P.w(this.w)) {
                ObjectLifecycleMediator.P.e(this);
                return this.isCanceled();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEventDispatcher.a(customSystemException);
        }
        try {
            if (CollectionOrchestrator.R(this.w)) {
                CollectionOrchestrator.w(this.w);
                return this.isCanceled();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEventDispatcher.a(customSystemException);
        }
        return super.fire();
    }

    public boolean wasModified() {
        return this.D;
    }

    public MessageInterceptor getNetworkManager() {
        return this.b;
    }

    public NetworkEventDispatcher(Object object, Object object2) {
        this.b = new MessageInterceptor(object);
        this.w = new ConnectionLifecycleHandler(object2);
    }

    public ConnectionLifecycleHandler getPacket() {
        return this.w;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return C;
    }

    public void forceCancel() {
        CollectionOrchestrator.z(this.w);
        this.setCanceled(true);
    }

    public Object getPacketInstance() {
        return this.w.M();
    }

    @Override
    public void setCanceled(boolean bl) {
        super.setCanceled(bl);
    }
}

