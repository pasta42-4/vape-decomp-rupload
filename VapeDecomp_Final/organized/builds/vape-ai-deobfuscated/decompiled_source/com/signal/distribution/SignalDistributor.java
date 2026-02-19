/*
 * Decompiled with CFR 0.152.
 */
package com.signal.distribution;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.data.orchestration.ContextualDataOrchestrator;
import com.data.transformation.DataEncodingTransformer;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;

class SignalDistributor
implements OperationExecutionInterface {
    final ContextualDataOrchestrator e;
    final DataEncodingTransformer X;

    @Override
    public void R() {
        this.X.V(true);
        for (AbstractComputationKernel abstractComputationKernel : this.X.A()) {
            try {
                if (!(abstractComputationKernel instanceof DistributedResourceCoordinator)) continue;
                abstractComputationKernel.N(true);
            }
            catch (CustomSystemException customSystemException) {
                throw SignalDistributor.a(customSystemException);
            }
        }
        this.X.A();
    }

    SignalDistributor(ContextualDataOrchestrator contextualDataOrchestrator, DataEncodingTransformer dataEncodingTransformer) {
        this.e = contextualDataOrchestrator;
        this.X = dataEncodingTransformer;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

