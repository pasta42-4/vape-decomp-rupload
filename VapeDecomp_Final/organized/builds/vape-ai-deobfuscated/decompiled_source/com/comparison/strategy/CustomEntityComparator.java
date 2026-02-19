/*
 * Decompiled with CFR 0.152.
 */
package com.comparison.strategy;

import com.app.resources.ResourceLifecycleManager1543;
import com.runtime.context.DynamicContextBroker;
import com.stream.processing.StreamProcessingOrchestrator;
import java.util.Comparator;

class CustomEntityComparator
implements Comparator<ResourceLifecycleManager1543> {
    final StreamProcessingOrchestrator v;

    CustomEntityComparator(StreamProcessingOrchestrator streamProcessingOrchestrator) {
        this.v = streamProcessingOrchestrator;
    }

    public int B(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        return Double.compare(DynamicContextBroker.q(resourceLifecycleManager1543.y()), DynamicContextBroker.q(resourceLifecycleManager15432.y()));
    }
}

