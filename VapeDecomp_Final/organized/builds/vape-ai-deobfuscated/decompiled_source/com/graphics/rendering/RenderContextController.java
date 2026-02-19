/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;
import com.tree.structure.RecursiveNodeManager;

public class RenderContextController
extends GameRenderContextBridge {
    private final TransactionCorrelationEngine o;
    private static final ConcurrentRequestTracker a = new ConcurrentRequestTracker();
    private boolean L;
    private final RecursiveNodeManager W;

    public boolean shouldRender() {
        return this.L;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return a;
    }

    public RecursiveNodeManager getEnumWorldBlockLayer() {
        return this.W;
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
                    throw RenderContextController.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw RenderContextController.a(customSystemException);
            }
        }
        jD2.V(this);
        return super.isCanceled();
    }

    public RenderContextController(Object object, Object object2) {
        this.o = new TransactionCorrelationEngine(object);
        this.W = new RecursiveNodeManager(object2);
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return a;
    }

    public void setShouldRender(boolean bl) {
        this.L = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionCorrelationEngine getBlock() {
        return this.o;
    }
}

