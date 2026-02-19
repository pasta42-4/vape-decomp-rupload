/*
 * Decompiled with CFR 0.152.
 */
package com.review.sorting;

import a.V3;
import com.app.resources.ResourceLifecycleManager1543;
import com.network.streaming.DataStreamProcessor1233;
import com.runtime.context.LightweightExecutionContext;
import com.stream.processing.StreamProcessingOrchestrator;
import java.util.Comparator;
import java.util.List;

class ReviewSortingStrategy
implements Comparator<ResourceLifecycleManager1543> {
    final StreamProcessingOrchestrator H;

    public int T(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager15432.y();
        List<V3> list = new DataStreamProcessor1233(lightweightExecutionContext.C()).g(lightweightExecutionContext);
        List<V3> list2 = new DataStreamProcessor1233(lightweightExecutionContext2.C()).g(lightweightExecutionContext2);
        int n = 0;
        for (V3 v3 : list) {
            int n2 = v3.n();
            for (V3 v32 : list2) {
                int n3 = v32.n();
                if (n2 != n3) continue;
                n += Integer.compare(v3.y(), v32.y());
            }
        }
        return n;
    }

    ReviewSortingStrategy(StreamProcessingOrchestrator streamProcessingOrchestrator) {
        this.H = streamProcessingOrchestrator;
    }
}

