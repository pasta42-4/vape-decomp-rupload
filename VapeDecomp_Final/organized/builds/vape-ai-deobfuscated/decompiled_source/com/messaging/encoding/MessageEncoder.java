/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.encoding;

import com.communication.protocol.DataExchangeProtocol2090;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.messaging.core.MessageRoutingEngine1898;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.optimization.NetworkConnectionOptimizer;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.reflection.metadata.ReflectionMetadataResolver;

public class MessageEncoder
implements NetworkConfigurationResolver2717 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void s(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block9: {
            MessageRoutingEngine1898 messageRoutingEngine1898;
            NetworkConnectionOptimizer networkConnectionOptimizer;
            block8: {
                try {
                    if (!networkPacketOrchestrator1222.getPacket().B(ReflectionMetadataResolver.bI)) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageEncoder.a(customSystemException);
                }
                try {
                    if (GameVersionEnumerator.MC_1_20_6.H()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageEncoder.a(customSystemException);
                }
                networkConnectionOptimizer = new NetworkConnectionOptimizer(networkPacketOrchestrator1222.getPacket().M());
                messageRoutingEngine1898 = new MessageRoutingEngine1898(networkConnectionOptimizer.l());
                try {
                    messageRoutingEngine1898.fire();
                    if (!messageRoutingEngine1898.isCanceled()) break block8;
                    networkPacketOrchestrator1222.setCanceled(true);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageEncoder.a(customSystemException);
                }
            }
            networkConnectionOptimizer.e(messageRoutingEngine1898.getMessage());
        }
    }
}

