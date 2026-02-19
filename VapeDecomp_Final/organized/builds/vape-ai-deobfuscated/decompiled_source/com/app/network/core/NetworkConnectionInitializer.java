/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.core;

import com.app.core.interfaces.OperationExecutionInterface;
import com.compute.hybrid.HybridComputationOrchestrator;

class NetworkConnectionInitializer
implements OperationExecutionInterface {
    final HybridComputationOrchestrator f;

    @Override
    public void R() {
        HybridComputationOrchestrator.h(this.f);
    }

    NetworkConnectionInitializer(HybridComputationOrchestrator hybridComputationOrchestrator) {
        this.f = hybridComputationOrchestrator;
    }
}

