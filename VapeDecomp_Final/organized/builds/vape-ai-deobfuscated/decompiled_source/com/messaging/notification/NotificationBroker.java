/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.notification;

import com.communication.protocol.DataExchangeProtocol2090;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.event.NetworkEventDispatcher;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.security.execution.CryptoOperationCoordinator;

public class NotificationBroker
implements NetworkConfigurationResolver2717 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void j(NetworkEventDispatcher networkEventDispatcher) {
        ConnectionLifecycleHandler connectionLifecycleHandler = networkEventDispatcher.getPacket();
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rZ)) {
            CryptoOperationCoordinator cryptoOperationCoordinator = new CryptoOperationCoordinator(connectionLifecycleHandler.M());
            int n = cryptoOperationCoordinator.D();
            try {
                if (DynamicContextBroker.s(n)) {
                    networkEventDispatcher.setCanceled(true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NotificationBroker.a(customSystemException);
            }
        }
    }
}

