/*
 * Decompiled with CFR 0.152.
 */
package com.app.resources;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.monitoring.analytics.MetricAggregator;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ResourceAllocationTracker2173
extends ClassMetadataExtractor654 {
    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        MetricAggregator metricAggregator = new MetricAggregator(this.b, this.D, bytecodeAnalyzer, map);
        try {
            metricAggregator.K();
            return new ResourceAllocationTracker2173(bytecodeAnalyzer, this.n(), metricAggregator.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public ResourceAllocationTracker2173(BytecodeAnalyzer bytecodeAnalyzer, String string, byte[] byArray) {
        super(bytecodeAnalyzer, string, byArray);
    }

    ResourceAllocationTracker2173(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

