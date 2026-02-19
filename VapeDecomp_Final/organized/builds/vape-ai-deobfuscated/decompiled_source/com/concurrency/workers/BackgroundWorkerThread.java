/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.workers;

import com.math.geometry.GeometricComputationEngine;
import com.temporal.metadata.TemporalMetadataResolver;

class BackgroundWorkerThread
extends Thread {
    final GeometricComputationEngine G;

    @Override
    public void run() {
        while (!TemporalMetadataResolver.h.V()) {
            try {
                Thread.sleep(1L);
                if (!this.G.Z()) continue;
                GeometricComputationEngine.B(this.G);
            }
            catch (Exception exception) {}
        }
    }

    BackgroundWorkerThread(GeometricComputationEngine geometricComputationEngine) {
        this.G = geometricComputationEngine;
    }
}

