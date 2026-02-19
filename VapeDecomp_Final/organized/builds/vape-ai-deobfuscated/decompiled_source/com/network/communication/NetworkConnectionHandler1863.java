/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.execution.context.ExecutionContextOrchestrator;

class NetworkConnectionHandler1863
implements OperationExecutionInterface {
    final ExecutionContextOrchestrator e;

    NetworkConnectionHandler1863(ExecutionContextOrchestrator executionContextOrchestrator) {
        this.e = executionContextOrchestrator;
    }

    @Override
    public void R() {
        boolean bl;
        ExecutionContextOrchestrator executionContextOrchestrator;
        try {
            executionContextOrchestrator = this.e;
            bl = !ExecutionContextOrchestrator.d(this.e);
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler1863.a(customSystemException);
        }
        ExecutionContextOrchestrator.n(executionContextOrchestrator, bl);
        this.e.z();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

