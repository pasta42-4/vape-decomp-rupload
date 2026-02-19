/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolResolver;
import com.security.configuration.SecurityEnumRegistry;
import com.security.crypto.AdvancedCryptoOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Point;

class MessageRoutingService1467
implements DataProcessingProtocol {
    final AdvancedCryptoOrchestrator W;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void M(Point point) {
    }

    MessageRoutingService1467(AdvancedCryptoOrchestrator advancedCryptoOrchestrator) {
        this.W = advancedCryptoOrchestrator;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block7: {
            try {
                if (securityEnumRegistry != SecurityEnumRegistry.LEFT_CLICK) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MessageRoutingService1467.a(customSystemException);
            }
            NetworkProtocolResolver networkProtocolResolver = this.W.n();
            try {
                try {
                    if (networkProtocolResolver.E() == null || !networkProtocolResolver.E().equals(this.W)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageRoutingService1467.a(customSystemException);
                }
                TemporalMetadataResolver.h.t().S().F();
            }
            catch (CustomSystemException customSystemException) {
                throw MessageRoutingService1467.a(customSystemException);
            }
        }
    }
}

