/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.validation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.security.transform.GenericCryptoTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

class NetworkRequestValidator
implements OperationExecutionInterface {
    final ConcurrentFilteringCoordinator W;
    final GenericCryptoTransformer j;

    @Override
    public void R() {
        TemporalMetadataResolver.h.m().Y(this.W);
        this.j.Z();
    }

    NetworkRequestValidator(GenericCryptoTransformer genericCryptoTransformer, ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        this.j = genericCryptoTransformer;
        this.W = concurrentFilteringCoordinator;
    }
}

