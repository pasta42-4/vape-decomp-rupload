/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.streaming.DataStreamTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

class ResourceCleanupCoordinator
implements OperationExecutionInterface {
    final DataStreamTransformer R;

    ResourceCleanupCoordinator(DataStreamTransformer dataStreamTransformer) {
        this.R = dataStreamTransformer;
    }

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().d();
    }
}

