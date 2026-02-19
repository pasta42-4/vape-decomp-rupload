/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.allocation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.streaming.DataStreamTransformer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.validation.core.ObjectReferenceValidator;

class ResourceAllocationCoordinator2200
implements OperationExecutionInterface {
    final DataStreamTransformer R;

    ResourceAllocationCoordinator2200(DataStreamTransformer dataStreamTransformer) {
        this.R = dataStreamTransformer;
    }

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().j(ObjectReferenceValidator.COMPLETED_ALL);
    }
}

