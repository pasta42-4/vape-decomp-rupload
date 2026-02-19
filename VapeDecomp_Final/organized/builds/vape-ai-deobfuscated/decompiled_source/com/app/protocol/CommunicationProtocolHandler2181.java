/*
 * Decompiled with CFR 0.152.
 */
package com.app.protocol;

import com.app.core.interfaces.OperationExecutionInterface;
import com.system.resource.ComputationalResourceAllocator;
import com.temporal.metadata.TemporalMetadataResolver;

class CommunicationProtocolHandler2181
implements OperationExecutionInterface {
    final ComputationalResourceAllocator z;

    @Override
    public void R() {
        TemporalMetadataResolver.h.u().M();
        ComputationalResourceAllocator.e(this.z, System.currentTimeMillis());
        ComputationalResourceAllocator.p(this.z).N(false);
    }

    CommunicationProtocolHandler2181(ComputationalResourceAllocator computationalResourceAllocator) {
        this.z = computationalResourceAllocator;
    }
}

