/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.auth.tracking.AuthenticationStateTracker;
import com.compute.hybrid.HybridComputationOrchestrator;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.security.context.SecureContextBroker572;
import com.security.registry.CryptoAlgorithmRegistry893;
import java.awt.Point;

class EventInterceptor
implements DataProcessingProtocol {
    private boolean z;
    final HybridComputationOrchestrator T;
    final ConfigurationProfileResolver H;
    final AuthenticationStateTracker C;
    final CryptoAlgorithmRegistry893 V;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    EventInterceptor(HybridComputationOrchestrator hybridComputationOrchestrator, AuthenticationStateTracker authenticationStateTracker, CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893, ConfigurationProfileResolver configurationProfileResolver) {
        this.T = hybridComputationOrchestrator;
        this.C = authenticationStateTracker;
        this.V = cryptoAlgorithmRegistry893;
        this.H = configurationProfileResolver;
        this.z = this.C.s();
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        try {
            if (this.z != this.C.s()) {
                this.z = this.C.s();
                SecureContextBroker572.h().c().a(this.V, this.H.J());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventInterceptor.a(customSystemException);
        }
    }
}

