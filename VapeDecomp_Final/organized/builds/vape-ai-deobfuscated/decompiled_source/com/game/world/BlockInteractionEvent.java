/*
 * Decompiled with CFR 0.152.
 */
package com.game.world;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class BlockInteractionEvent
extends GameRenderContextBridge {
    private final TransactionCorrelationEngine c;
    private static final ConcurrentRequestTracker F = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return F;
    }

    public TransactionCorrelationEngine getBlock() {
        return this.c;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public BlockInteractionEvent(Object object) {
        this.c = new TransactionCorrelationEngine(object);
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
                    throw BlockInteractionEvent.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw BlockInteractionEvent.a(customSystemException);
            }
        }
        jD2.p(this);
        return this.isCanceled();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return F;
    }
}

