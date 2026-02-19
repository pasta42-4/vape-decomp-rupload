/*
 * Decompiled with CFR 0.152.
 */
package com.inventory.management;

import com.app.logging.LoggingInterceptor2692;
import com.runtime.context.DynamicContextBroker;
import com.temporal.metadata.TemporalMetadataResolver;

class AssetDiscoveryStrategy
implements LoggingInterceptor2692 {
    final DynamicContextBroker Q;

    AssetDiscoveryStrategy(DynamicContextBroker dynamicContextBroker) {
        this.Q = dynamicContextBroker;
    }

    @Override
    public void g() {
        TemporalMetadataResolver.h.j().w();
    }
}

