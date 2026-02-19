/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.block;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;
import com.tree.structure.RecursiveNodeManager;

public class BlockRenderEventProcessor
extends GameRenderContextBridge {
    private final TransactionCorrelationEngine W;
    private static final ConcurrentRequestTracker H = new ConcurrentRequestTracker();
    private boolean e;
    private static int i;

    public static int a() {
        int n = BlockRenderEventProcessor.z();
        try {
            if (n == 0) {
                return 86;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BlockRenderEventProcessor.a(customSystemException);
        }
        return 0;
    }

    public static void e(int n) {
        i = n;
    }

    public TransactionCorrelationEngine getBlock() {
        return this.W;
    }

    public BlockRenderEventProcessor(Object object) {
        this.W = new TransactionCorrelationEngine(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int z() {
        return i;
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
                    throw BlockRenderEventProcessor.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw BlockRenderEventProcessor.a(customSystemException);
            }
        }
        jD2.a(this);
        return true;
    }

    static {
        BlockRenderEventProcessor.e(94);
    }

    public void setShouldRender(boolean bl) {
        this.e = bl;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return H;
    }

    public Object getBlockLayer() {
        Object object;
        try {
            object = this.e ? RecursiveNodeManager.J().M() : RecursiveNodeManager.Z().M();
        }
        catch (CustomSystemException customSystemException) {
            throw BlockRenderEventProcessor.a(customSystemException);
        }
        return object;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return H;
    }
}

