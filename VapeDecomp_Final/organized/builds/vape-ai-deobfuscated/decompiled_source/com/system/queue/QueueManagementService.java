/*
 * Decompiled with CFR 0.152.
 */
package com.system.queue;

import com.concurrency.management.AsyncExecutionCoordinator;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.runtime.management.RuntimeExecutionCoordinator;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class QueueManagementService
implements DataProcessingProtocol {
    final RuntimeExecutionCoordinator x;
    final AsyncExecutionCoordinator Z;

    QueueManagementService(RuntimeExecutionCoordinator runtimeExecutionCoordinator, AsyncExecutionCoordinator asyncExecutionCoordinator) {
        this.x = runtimeExecutionCoordinator;
        this.Z = asyncExecutionCoordinator;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block4: {
            try {
                try {
                    if (this.Z.s() || this.Z.S().s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw QueueManagementService.a(customSystemException);
                }
                GraphicalRenderingController.z(this.Z);
            }
            catch (CustomSystemException customSystemException) {
                throw QueueManagementService.a(customSystemException);
            }
        }
    }
}

