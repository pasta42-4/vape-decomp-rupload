/*
 * Decompiled with CFR 0.152.
 */
package com.compression.algorithm;

import com.cache.distribution.DistributedCacheManager;
import com.data.processing.CollectionFilterProcessor;

class CompressionAlgorithmHandler
extends CollectionFilterProcessor {
    final DistributedCacheManager a;

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public String D() {
        return null;
    }

    CompressionAlgorithmHandler(DistributedCacheManager distributedCacheManager) {
        this.a = distributedCacheManager;
    }

    @Override
    public void G() {
    }
}

