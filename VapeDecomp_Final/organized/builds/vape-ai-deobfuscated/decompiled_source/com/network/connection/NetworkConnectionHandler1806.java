/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import com.system.orchestration.SystemOrchestrationManager;

class NetworkConnectionHandler1806
implements OperationExecutionInterface {
    final SystemOrchestrationManager v;
    final ContextualExecutionFramework B;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    NetworkConnectionHandler1806(SystemOrchestrationManager systemOrchestrationManager, ContextualExecutionFramework contextualExecutionFramework) {
        this.v = systemOrchestrationManager;
        this.B = contextualExecutionFramework;
    }

    @Override
    public void R() {
        boolean bl;
        ContextualExecutionFramework contextualExecutionFramework;
        try {
            contextualExecutionFramework = this.B;
            bl = !this.B.g();
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler1806.a(customSystemException);
        }
        contextualExecutionFramework.C(bl);
    }
}

