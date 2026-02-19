/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.event;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.flow.TransactionFlowController;

public class RenderEventOrchestrator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker P = new ConcurrentRequestTracker();
    private static int[] Y;
    private final TransactionCorrelationEngine r;
    private final TransactionFlowController f;

    public TransactionCorrelationEngine getBlock() {
        return this.r;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return P;
    }

    RenderEventOrchestrator(Object object) {
        this.r = new TransactionCorrelationEngine(object);
        this.f = TransactionFlowController.g();
    }

    public static void g(int[] nArray) {
        Y = nArray;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return P;
    }

    public TransactionFlowController getTessellator() {
        return this.f;
    }

    @Override
    public boolean fire() {
        block9: {
            jD jD2;
            block8: {
                jD2 = TemporalMetadataResolver.h.U().l();
                try {
                    try {
                        if (jD2 != null && jD2.Z()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RenderEventOrchestrator.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderEventOrchestrator.a(customSystemException);
                }
            }
            try {
                try {
                    if (jD2.t(this.r) || !this.f.F()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderEventOrchestrator.a(customSystemException);
                }
                this.f.x(255, 255, 255, jD2.i());
            }
            catch (CustomSystemException customSystemException) {
                throw RenderEventOrchestrator.a(customSystemException);
            }
        }
        return this.isCanceled();
    }

    static {
        RenderEventOrchestrator.g(null);
    }

    public static int[] l() {
        return Y;
    }
}

