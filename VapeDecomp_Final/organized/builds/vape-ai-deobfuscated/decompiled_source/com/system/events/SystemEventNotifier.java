/*
 * Decompiled with CFR 0.152.
 */
package com.system.events;

import a.Ia;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolResolver;
import com.security.configuration.SecurityEnumRegistry;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Point;

class SystemEventNotifier
implements DataProcessingProtocol {
    final Ia W;

    @Override
    public void M(Point point) {
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
                throw SystemEventNotifier.a(customSystemException);
            }
            NetworkProtocolResolver networkProtocolResolver = this.W.n();
            try {
                try {
                    if (networkProtocolResolver.E() == null || !networkProtocolResolver.E().equals(this.W)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemEventNotifier.a(customSystemException);
                }
                TemporalMetadataResolver.h.t().S().F();
            }
            catch (CustomSystemException customSystemException) {
                throw SystemEventNotifier.a(customSystemException);
            }
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    SystemEventNotifier(Ia ia) {
        this.W = ia;
    }
}

