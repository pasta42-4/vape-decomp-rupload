/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.data.orchestration.ContextualDataOrchestrator;
import com.data.transformation.DataEncodingTransformer;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;

class AuthenticationDelegate1590
implements OperationExecutionInterface {
    final DataEncodingTransformer M;
    final ContextualDataOrchestrator x;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        this.M.V(false);
        for (AbstractComputationKernel abstractComputationKernel : this.M.A()) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof DistributedResourceCoordinator) || ((DistributedResourceCoordinator)abstractComputationKernel).Q().T()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationDelegate1590.a(customSystemException);
                }
                abstractComputationKernel.N(false);
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationDelegate1590.a(customSystemException);
            }
        }
        this.M.A();
    }

    AuthenticationDelegate1590(ContextualDataOrchestrator contextualDataOrchestrator, DataEncodingTransformer dataEncodingTransformer) {
        this.x = contextualDataOrchestrator;
        this.M = dataEncodingTransformer;
    }
}

