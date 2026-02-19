/*
 * Decompiled with CFR 0.152.
 */
package com.app.database.optimization;

import com.compute.hybrid.HybridComputationOrchestrator;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.system.configuration.ConfigurationManager;

class QueryOptimizer
extends GraphicalRenderEngine1082 {
    final HybridComputationOrchestrator PK;

    @Override
    public void o(boolean bl) {
        ConfigurationManager.A(this.G(), this.W() - 4.0, this.w(), this.b() + 2.0 + 4.0, QueryOptimizer.M.W);
    }

    QueryOptimizer(HybridComputationOrchestrator hybridComputationOrchestrator, double d2, double d3) {
        this.PK = hybridComputationOrchestrator;
        super(d2, d3);
    }
}

