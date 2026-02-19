/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataEncodingTransformer;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;

class NetworkConnectionManager1686
implements OperationExecutionInterface {
    final DataEncodingTransformer n;

    NetworkConnectionManager1686(DataEncodingTransformer dataEncodingTransformer) {
        this.n = dataEncodingTransformer;
    }

    @Override
    public void R() {
        this.n.V(false);
        for (AbstractComputationKernel abstractComputationKernel : this.n.A()) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof DistributedResourceCoordinator) || ((DistributedResourceCoordinator)abstractComputationKernel).Q().T()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkConnectionManager1686.a(customSystemException);
                }
                abstractComputationKernel.N(false);
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkConnectionManager1686.a(customSystemException);
            }
        }
        this.n.A();
        DataEncodingTransformer.a(this.n).N(false);
        DataEncodingTransformer.h(this.n).N(true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

