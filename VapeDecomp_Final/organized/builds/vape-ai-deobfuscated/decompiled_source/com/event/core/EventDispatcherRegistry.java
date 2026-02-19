/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventDispatcherRegistry
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker Q = new ConcurrentRequestTracker();

    public static ConcurrentRequestTracker getEventListeners() {
        return Q;
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
                    throw EventDispatcherRegistry.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatcherRegistry.a(customSystemException);
            }
        }
        jD2.B(this);
        return this.isCanceled();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return Q;
    }
}

