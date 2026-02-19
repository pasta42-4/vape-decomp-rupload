/*
 * Decompiled with CFR 0.152.
 */
package com.app.event;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventDispatchCenter
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker m = new ConcurrentRequestTracker();

    @Override
    public boolean fire() {
        block4: {
            jD jD2 = TemporalMetadataResolver.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCenter.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCenter.a(customSystemException);
            }
        }
        return true;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return m;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return m;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

