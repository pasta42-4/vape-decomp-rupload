/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.cluster;

import com.app.concurrency.management.ThreadPoolOrchestrator2584;
import com.app.network.NetworkConnectionHandler1792;
import com.caching.strategy.CacheInvalidationStrategy;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ClusterNodeCoordinator1923
extends ObjectLifecycleTracker {
    public ClusterNodeCoordinator1923(Object object) {
        super(object);
    }

    public NetworkConnectionHandler1792 k() {
        return new NetworkConnectionHandler1792(ClusterNodeCoordinator1923.U.u().O.o(this.H));
    }

    public ThreadPoolOrchestrator2584 b() {
        CacheInvalidationStrategy cacheInvalidationStrategy = new CacheInvalidationStrategy(ClusterNodeCoordinator1923.U.u().O.G(this.H));
        return new ThreadPoolOrchestrator2584(cacheInvalidationStrategy.b());
    }
}

