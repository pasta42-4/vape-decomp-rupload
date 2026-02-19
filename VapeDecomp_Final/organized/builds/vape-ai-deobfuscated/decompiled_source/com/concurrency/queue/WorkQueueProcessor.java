/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.queue;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.context.SecureContextNegotiator;
import com.security.protocol.SecurityProtocolMediator;

class WorkQueueProcessor
extends GenericTypeInspector<AbstractComputationKernel> {
    final SecurityProtocolMediator q;

    @Override
    public boolean f(AbstractComputationKernel abstractComputationKernel) {
        boolean bl;
        try {
            bl = !(abstractComputationKernel instanceof SecureContextNegotiator);
        }
        catch (CustomSystemException customSystemException) {
            throw WorkQueueProcessor.a(customSystemException);
        }
        return bl;
    }

    WorkQueueProcessor(SecurityProtocolMediator securityProtocolMediator, Class clazz) {
        this.q = securityProtocolMediator;
        super(clazz);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

