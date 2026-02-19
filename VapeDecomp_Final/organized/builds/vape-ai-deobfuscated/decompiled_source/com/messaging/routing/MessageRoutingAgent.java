/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import com.app.transformation.TransformationPipelineFilter;
import com.network.clustering.ClusterNodeRegistry1151;

public class MessageRoutingAgent
implements TransformationPipelineFilter {
    int r;

    @Override
    public boolean c(long l, long l2) {
        return ClusterNodeRegistry1151.W().Y().g(this.r, true);
    }

    public MessageRoutingAgent(int n) {
        this.r = n;
    }
}

