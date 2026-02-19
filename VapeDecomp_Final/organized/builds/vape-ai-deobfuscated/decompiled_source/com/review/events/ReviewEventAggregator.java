/*
 * Decompiled with CFR 0.152.
 */
package com.review.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.conversion.TemporalDataTransformer;
import com.game.rendering.GameRenderContextBridge;

public class ReviewEventAggregator
extends GameRenderContextBridge {
    private final TemporalDataTransformer z;
    private static final ConcurrentRequestTracker r = new ConcurrentRequestTracker();

    public ReviewEventAggregator(TemporalDataTransformer temporalDataTransformer) {
        this.z = temporalDataTransformer;
    }

    public TemporalDataTransformer getReview() {
        return this.z;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return r;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return r;
    }
}

