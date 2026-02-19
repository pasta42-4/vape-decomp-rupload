/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import com.concurrency.management.AsyncExecutionCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class ResourceAllocationTracker1709
implements DataProcessingProtocol {
    final AsyncExecutionCoordinator y;
    final AbstractComputationKernel F;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ResourceAllocationTracker1709(AsyncExecutionCoordinator asyncExecutionCoordinator, AbstractComputationKernel abstractComputationKernel) {
        this.y = asyncExecutionCoordinator;
        this.F = abstractComputationKernel;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block5: {
            try {
                if (this.y.s() || this.F.s()) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker1709.a(customSystemException);
            }
            GraphicalRenderingController.z(this.y);
            Runnable runnable = AsyncExecutionCoordinator.d(this.y);
            try {
                if (runnable != null) {
                    runnable.run();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker1709.a(customSystemException);
            }
        }
    }
}

