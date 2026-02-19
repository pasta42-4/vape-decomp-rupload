/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ConcurrentSet
 */
package com.object.lifecycle;

import com.app.collection.CollectionOrchestrator;
import com.app.data.processing.StreamTransformationProcessor;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.synchronization.ThreadSynchronizationLock;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.messaging.core.MessageInterceptor;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.security.auth.AuthorizationManager;
import io.netty.util.internal.ConcurrentSet;
import java.util.Set;

public class ObjectLifecycleMediator
implements NetworkConfigurationResolver2717 {
    private boolean Z = false;
    private final Set<Object> a = new ConcurrentSet();
    public static ObjectLifecycleMediator P = new ObjectLifecycleMediator();
    private final ThreadSynchronizationLock U = new ThreadSynchronizationLock();

    public void q(ConnectionLifecycleHandler connectionLifecycleHandler) {
        this.a.remove(connectionLifecycleHandler.M());
    }

    public static void y(MessageInterceptor messageInterceptor, Runnable runnable) {
        block3: {
            block2: {
                try {
                    if (!messageInterceptor.Z().eventLoop().inEventLoop()) break block2;
                    runnable.run();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ObjectLifecycleMediator.a(customSystemException);
                }
            }
            messageInterceptor.Z().eventLoop().execute(runnable);
        }
    }

    private void lambda$invokeWrite$1(NetworkEventDispatcher networkEventDispatcher) {
        this.G(networkEventDispatcher);
    }

    public boolean n(ConnectionLifecycleHandler connectionLifecycleHandler) {
        boolean bl;
        boolean bl2 = this.a.add(connectionLifecycleHandler.M());
        try {
            bl = !bl2;
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectLifecycleMediator.a(customSystemException);
        }
        return bl;
    }

    private void lambda$invokeRead$0(ConnectionLifecycleHandler connectionLifecycleHandler, AuthorizationManager authorizationManager) {
        this.Q(connectionLifecycleHandler, authorizationManager);
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void e(NetworkEventDispatcher networkEventDispatcher) {
        this.q(networkEventDispatcher.getPacket());
    }

    public void Q(ConnectionLifecycleHandler connectionLifecycleHandler, AuthorizationManager authorizationManager) {
        try {
            if (authorizationManager.Y()) {
                return;
            }
        }
        catch (Exception exception) {
            throw ObjectLifecycleMediator.a(exception);
        }
        MessageInterceptor messageInterceptor = authorizationManager.f();
        if (messageInterceptor.Z().eventLoop().inEventLoop()) {
            this.n(connectionLifecycleHandler);
            try {
                connectionLifecycleHandler.p(authorizationManager);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.q(connectionLifecycleHandler);
        } else {
            messageInterceptor.Z().eventLoop().execute(() -> this.lambda$invokeRead$0(connectionLifecycleHandler, authorizationManager));
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean G(NetworkEventDispatcher networkEventDispatcher) {
        try {
            if (CollectionOrchestrator.R(networkEventDispatcher.getPacket())) {
                return false;
            }
        }
        catch (Exception exception) {
            throw ObjectLifecycleMediator.a(exception);
        }
        try {
            if (CollectionOrchestrator.C(networkEventDispatcher.getPacket())) {
                return false;
            }
        }
        catch (Exception exception) {
            throw ObjectLifecycleMediator.a(exception);
        }
        MessageInterceptor messageInterceptor = networkEventDispatcher.getNetworkManager();
        if (messageInterceptor.Z().eventLoop().inEventLoop()) {
            this.n(networkEventDispatcher.getPacket());
            try {
                messageInterceptor.c(networkEventDispatcher.getPacket());
                return true;
            }
            catch (Exception exception) {}
        } else {
            messageInterceptor.Z().eventLoop().execute(() -> this.lambda$invokeWrite$1(networkEventDispatcher));
        }
        return false;
    }

    public static void R(Runnable runnable) {
        block6: {
            MessageInterceptor messageInterceptor;
            block5: {
                StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
                try {
                    if (streamTransformationProcessor.Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ObjectLifecycleMediator.a(customSystemException);
                }
                AuthorizationManager authorizationManager = streamTransformationProcessor.u();
                messageInterceptor = authorizationManager.f();
                try {
                    if (!messageInterceptor.Z().eventLoop().inEventLoop()) break block5;
                    runnable.run();
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ObjectLifecycleMediator.a(customSystemException);
                }
            }
            messageInterceptor.Z().eventLoop().execute(runnable);
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void J(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        this.q(networkPacketOrchestrator1222.getPacket());
    }

    public boolean w(ConnectionLifecycleHandler connectionLifecycleHandler) {
        boolean bl = this.a.contains(connectionLifecycleHandler.M());
        return bl;
    }
}

