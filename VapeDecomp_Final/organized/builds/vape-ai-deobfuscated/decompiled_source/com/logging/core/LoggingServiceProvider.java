/*
 * Decompiled with CFR 0.152.
 */
package com.logging.core;

import com.app.core.interfaces.OperationExecutionInterface;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;

class LoggingServiceProvider
implements OperationExecutionInterface {
    final TransactionDescriptor Q;
    final DistributedResourceCoordinator k;

    @Override
    public void R() {
        try {
            if (TemporalMetadataResolver.h.o().W().equals(this.Q)) {
                this.Q.y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LoggingServiceProvider.a(customSystemException);
        }
        this.k.R();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    LoggingServiceProvider(DistributedResourceCoordinator distributedResourceCoordinator, TransactionDescriptor transactionDescriptor) {
        this.k = distributedResourceCoordinator;
        this.Q = transactionDescriptor;
    }
}

