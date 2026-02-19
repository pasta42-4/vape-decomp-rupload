/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.connectivity;

import com.app.transformation.TransformationPipelineFilter;
import com.network.clustering.ClusterNodeRegistry1151;

public class NetworkConnectionResolver
implements TransformationPipelineFilter {
    int K;

    public NetworkConnectionResolver(int n) {
        this.K = n;
    }

    @Override
    public boolean c(long l, long l2) {
        return ClusterNodeRegistry1151.W().Y().g(this.K, false);
    }
}

