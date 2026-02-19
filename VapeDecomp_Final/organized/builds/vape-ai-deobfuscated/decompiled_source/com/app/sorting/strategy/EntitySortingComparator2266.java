/*
 * Decompiled with CFR 0.152.
 */
package com.app.sorting.strategy;

import com.app.resources.ResourceLifecycleManager1543;
import com.runtime.context.DynamicContextBroker;
import com.stream.processing.StreamProcessingOrchestrator;
import java.util.Comparator;

class EntitySortingComparator2266
implements Comparator<ResourceLifecycleManager1543> {
    final StreamProcessingOrchestrator k;

    EntitySortingComparator2266(StreamProcessingOrchestrator streamProcessingOrchestrator) {
        this.k = streamProcessingOrchestrator;
    }

    public int g(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        return Double.compare(DynamicContextBroker.y(resourceLifecycleManager1543.y()), DynamicContextBroker.y(resourceLifecycleManager15432.y()));
    }
}

