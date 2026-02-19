/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.cache.distribution.DistributedCacheManager;
import com.data.processing.CollectionFilterProcessor;
import com.event.processing.EventStreamProcessor;

class ResourceLifecycleHandler
extends CollectionFilterProcessor {
    final DistributedCacheManager z;

    @Override
    public void G() {
        EventStreamProcessor.B.v();
    }

    ResourceLifecycleHandler(DistributedCacheManager distributedCacheManager) {
        this.z = distributedCacheManager;
    }

    @Override
    public String D() {
        return null;
    }

    @Override
    public boolean v() {
        return false;
    }
}

