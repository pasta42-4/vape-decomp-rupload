/*
 * Decompiled with CFR 0.152.
 */
package com.rendering.core;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.event.dispatch.EventDispatchCoordinator2398;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class RenderBlockOrchestrator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker w = new ConcurrentRequestTracker();
    private EventDispatchCoordinator2398 v;
    private TransactionCorrelationEngine Q;

    public TransactionCorrelationEngine getBlock() {
        return this.Q;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean fire() {
        jD jD2;
        block4: {
            jD2 = TemporalMetadataResolver.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderBlockOrchestrator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw RenderBlockOrchestrator.a(customSystemException);
            }
        }
        jD2.U(this);
        return this.isCanceled();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return w;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return w;
    }

    public RenderBlockOrchestrator(Object object, Object object2) {
        this.v = new EventDispatchCoordinator2398(object);
        this.Q = new TransactionCorrelationEngine(object2);
    }

    public EventDispatchCoordinator2398 getRenderBlocks() {
        return this.v;
    }
}

