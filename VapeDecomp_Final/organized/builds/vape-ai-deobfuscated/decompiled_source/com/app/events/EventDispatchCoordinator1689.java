/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.network.connection.ConnectionPoolOrchestrator;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class EventDispatchCoordinator1689
implements OperationExecutionInterface {
    final ConnectionPoolOrchestrator R;

    EventDispatchCoordinator1689(ConnectionPoolOrchestrator connectionPoolOrchestrator) {
        this.R = connectionPoolOrchestrator;
    }

    @Override
    public void R() {
        boolean bl;
        ResourceLifecycleOrchestrator resourceLifecycleOrchestrator;
        ResourceLifecycleOrchestrator resourceLifecycleOrchestrator2;
        block9: {
            resourceLifecycleOrchestrator2 = GraphicalRenderingController.D(ResourceLifecycleOrchestrator.class);
            TransactionLogOrchestrator transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
            try {
                try {
                    if (resourceLifecycleOrchestrator2 != null && transactionLogOrchestrator != null) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1689.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1689.a(customSystemException);
            }
        }
        try {
            resourceLifecycleOrchestrator = resourceLifecycleOrchestrator2;
            bl = !resourceLifecycleOrchestrator2.f();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1689.a(customSystemException);
        }
        try {
            resourceLifecycleOrchestrator.N(bl);
            if (resourceLifecycleOrchestrator2.f()) {
                resourceLifecycleOrchestrator2.R();
                resourceLifecycleOrchestrator2.w(1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1689.a(customSystemException);
        }
        resourceLifecycleOrchestrator2.A();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

