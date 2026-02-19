/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataEncodingTransformer;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;

class AuthenticationBroker
implements OperationExecutionInterface {
    final DataEncodingTransformer M;

    @Override
    public void R() {
        this.M.V(true);
        for (AbstractComputationKernel abstractComputationKernel : this.M.A()) {
            try {
                if (!(abstractComputationKernel instanceof DistributedResourceCoordinator)) continue;
                abstractComputationKernel.N(true);
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationBroker.a(customSystemException);
            }
        }
        this.M.A();
        DataEncodingTransformer.a(this.M).N(true);
        DataEncodingTransformer.h(this.M).N(false);
    }

    AuthenticationBroker(DataEncodingTransformer dataEncodingTransformer) {
        this.M = dataEncodingTransformer;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

