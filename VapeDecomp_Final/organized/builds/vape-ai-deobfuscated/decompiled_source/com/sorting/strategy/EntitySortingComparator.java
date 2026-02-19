/*
 * Decompiled with CFR 0.152.
 */
package com.sorting.strategy;

import com.app.resources.ResourceLifecycleManager1543;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.SecurityTokenManager2051;
import com.stream.processing.StreamProcessingOrchestrator;
import java.util.Comparator;

class EntitySortingComparator
implements Comparator<ResourceLifecycleManager1543> {
    final StreamProcessingOrchestrator j;

    EntitySortingComparator(StreamProcessingOrchestrator streamProcessingOrchestrator) {
        this.j = streamProcessingOrchestrator;
    }

    public int y(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager15432.y();
        SecurityTokenManager2051 securityTokenManager2051 = new SecurityTokenManager2051(lightweightExecutionContext.C());
        SecurityTokenManager2051 securityTokenManager20512 = new SecurityTokenManager2051(lightweightExecutionContext2.C());
        float f = (float)securityTokenManager2051.W() * securityTokenManager2051.x();
        float f2 = (float)securityTokenManager20512.W() * securityTokenManager20512.x();
        return Float.compare(f, f2);
    }
}

