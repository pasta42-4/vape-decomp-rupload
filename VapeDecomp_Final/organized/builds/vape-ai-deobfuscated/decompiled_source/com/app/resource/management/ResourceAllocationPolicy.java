/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.management;

import com.compute.hybrid.HybridComputationOrchestrator;
import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class ResourceAllocationPolicy
implements DataProcessingProtocol {
    final HybridComputationOrchestrator M;

    ResourceAllocationPolicy(HybridComputationOrchestrator hybridComputationOrchestrator) {
        this.M = hybridComputationOrchestrator;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        HybridComputationOrchestrator.j(this.M);
    }
}

