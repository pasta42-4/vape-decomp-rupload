/*
 * Decompiled with CFR 0.152.
 */
package com.vape.network;

import com.app.transformation.TransformationPipelineFilter;
import com.configuration.management.ConfigurationParameterResolver;
import com.network.clustering.ClusterNodeRegistry1151;

public class VapeNetworkOrchestrator
implements TransformationPipelineFilter {
    @Override
    public boolean c(long l, long l2) {
        return ClusterNodeRegistry1151.W().Y().g(ConfigurationParameterResolver.R(l), true);
    }
}

