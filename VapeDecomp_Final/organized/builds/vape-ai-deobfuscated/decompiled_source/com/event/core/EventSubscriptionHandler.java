/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.concurrency.execution.HybridExecutionCoordinator;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.math.precision.PrecisionMathOrchestrator;
import com.security.configuration.SecurityEnumRegistry;
import com.system.resource.ResourceAllocationManager1348;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicBoolean;

class EventSubscriptionHandler
implements DataProcessingProtocol {
    final PrecisionMathOrchestrator V;
    final AtomicBoolean m;
    final ResourceAllocationManager1348 X;
    final HybridExecutionCoordinator S;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        try {
            if (this.m.get()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventSubscriptionHandler.a(customSystemException);
        }
        this.m.set(true);
        GraphicalRenderingController.st.execute(() -> this.lambda$onClick$0(this.V, this.X, this.m));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lambda$onClick$0(PrecisionMathOrchestrator precisionMathOrchestrator, ResourceAllocationManager1348 resourceAllocationManager1348, AtomicBoolean atomicBoolean) {
        try {
            HybridExecutionCoordinator.c(this.S).J(precisionMathOrchestrator);
            HybridExecutionCoordinator.f(this.S).u(resourceAllocationManager1348);
        }
        finally {
            atomicBoolean.set(false);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    EventSubscriptionHandler(HybridExecutionCoordinator hybridExecutionCoordinator, AtomicBoolean atomicBoolean, PrecisionMathOrchestrator precisionMathOrchestrator, ResourceAllocationManager1348 resourceAllocationManager1348) {
        this.S = hybridExecutionCoordinator;
        this.m = atomicBoolean;
        this.V = precisionMathOrchestrator;
        this.X = resourceAllocationManager1348;
    }
}

