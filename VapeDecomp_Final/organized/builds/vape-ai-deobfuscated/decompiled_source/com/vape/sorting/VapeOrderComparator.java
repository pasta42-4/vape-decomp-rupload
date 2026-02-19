/*
 * Decompiled with CFR 0.152.
 */
package com.vape.sorting;

import com.app.resources.ResourceLifecycleManager1543;
import com.runtime.context.DynamicContextBroker;
import com.stream.processing.StreamProcessingOrchestrator;
import java.util.Comparator;

class VapeOrderComparator
implements Comparator<ResourceLifecycleManager1543> {
    final StreamProcessingOrchestrator o;

    VapeOrderComparator(StreamProcessingOrchestrator streamProcessingOrchestrator) {
        this.o = streamProcessingOrchestrator;
    }

    public int F(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        return Double.compare(DynamicContextBroker.S(resourceLifecycleManager1543.y()), DynamicContextBroker.S(resourceLifecycleManager15432.y()));
    }
}

