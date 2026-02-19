/*
 * Decompiled with CFR 0.152.
 */
package com.sorting.comparators;

import com.app.resources.ResourceLifecycleManager1543;
import com.collections.sequence.IntegerSequenceManager;
import com.event.routing.EventRoutingController;
import com.runtime.context.LightweightExecutionContext;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Comparator;
import java.util.List;

class IntegerSortingComparator
implements Comparator<Integer> {
    final List d;
    final IntegerSequenceManager w;

    public int A(Integer n, Integer n2) {
        try {
            LightweightExecutionContext lightweightExecutionContext = ((ResourceLifecycleManager1543)this.d.get(n)).y();
            LightweightExecutionContext lightweightExecutionContext2 = ((ResourceLifecycleManager1543)this.d.get(n2)).y();
            double d2 = EventRoutingController.G(lightweightExecutionContext);
            double d3 = EventRoutingController.G(lightweightExecutionContext2);
            return Double.compare(d2, d3);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            return 0;
        }
    }

    IntegerSortingComparator(IntegerSequenceManager integerSequenceManager, List list) {
        this.w = integerSequenceManager;
        this.d = list;
    }
}

