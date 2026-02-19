/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventDispatcherRegistry1766
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker M = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        block4: {
            jD jD2 = TemporalMetadataResolver.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatcherRegistry1766.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatcherRegistry1766.a(customSystemException);
            }
        }
        this.setCanceled(true);
        return true;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return M;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return M;
    }
}

