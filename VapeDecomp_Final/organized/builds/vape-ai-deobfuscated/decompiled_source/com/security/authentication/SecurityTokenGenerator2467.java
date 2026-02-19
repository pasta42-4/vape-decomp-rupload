/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.concurrency.tasks.AsynchronousTaskExecutor1485;
import com.data.processing.CollectionFilterProcessor;
import com.graphics.rendering.GraphicalRenderingController249;
import com.temporal.metadata.TemporalMetadataResolver;

class SecurityTokenGenerator2467
extends AsynchronousTaskExecutor1485 {
    final GraphicalRenderingController249 g;

    SecurityTokenGenerator2467(GraphicalRenderingController249 graphicalRenderingController249, CollectionFilterProcessor collectionFilterProcessor) {
        this.g = graphicalRenderingController249;
        super(collectionFilterProcessor);
    }

    @Override
    public void d() {
        TemporalMetadataResolver.h.n();
    }
}

