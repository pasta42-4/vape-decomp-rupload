/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import a.jD;
import com.app.concurrency.monitoring.ThreadHealthMonitor;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventBroadcastManager
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker y = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return y;
    }

    public static Object getVisibility() {
        ThreadHealthMonitor threadHealthMonitor = new ThreadHealthMonitor(TemporalMetadataResolver.h.u().dR.B.A(new Object[0]));
        threadHealthMonitor.E(true);
        return threadHealthMonitor.M();
    }

    public EventBroadcastManager(Object object) {
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return y;
    }

    public EventBroadcastManager() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean fire() {
        block4: {
            jD jD2 = TemporalMetadataResolver.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventBroadcastManager.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventBroadcastManager.a(customSystemException);
            }
        }
        this.setCanceled(true);
        return true;
    }
}

