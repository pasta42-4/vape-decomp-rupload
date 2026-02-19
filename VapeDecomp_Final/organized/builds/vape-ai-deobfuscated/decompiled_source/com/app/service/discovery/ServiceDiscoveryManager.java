/*
 * Decompiled with CFR 0.152.
 */
package com.app.service.discovery;

import com.app.core.interfaces.OperationExecutionInterface;
import com.network.protocol.NetworkProtocolResolver;
import com.temporal.metadata.TemporalMetadataResolver;

class ServiceDiscoveryManager
implements OperationExecutionInterface {
    final NetworkProtocolResolver W;

    ServiceDiscoveryManager(NetworkProtocolResolver networkProtocolResolver) {
        this.W = networkProtocolResolver;
    }

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().U();
    }
}

