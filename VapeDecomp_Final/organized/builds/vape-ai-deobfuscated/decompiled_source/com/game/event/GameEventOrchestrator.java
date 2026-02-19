/*
 * Decompiled with CFR 0.152.
 */
package com.game.event;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import java.util.ArrayList;
import java.util.Collection;

public class GameEventOrchestrator
extends GameRenderContextBridge {
    private static boolean m;
    private static final ConcurrentRequestTracker P;

    @Override
    public boolean fire() {
        return m;
    }

    public static void setLocked(boolean bl) {
        m = bl;
    }

    static {
        P = new ConcurrentRequestTracker();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return P;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return P;
    }

    public Collection getScores() {
        return new ArrayList();
    }
}

