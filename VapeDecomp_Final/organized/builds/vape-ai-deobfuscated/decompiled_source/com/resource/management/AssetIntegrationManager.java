/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.asset.management.AssetOrchestrator;
import com.distributed.topology.DistributedResourceTopologyManager;

class AssetIntegrationManager
extends AssetOrchestrator {
    final DistributedResourceTopologyManager P;

    AssetIntegrationManager(DistributedResourceTopologyManager distributedResourceTopologyManager, ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        this.P = distributedResourceTopologyManager;
        super(distributedResourceTopologyManager, connectionPoolOrchestrator1192);
    }
}

