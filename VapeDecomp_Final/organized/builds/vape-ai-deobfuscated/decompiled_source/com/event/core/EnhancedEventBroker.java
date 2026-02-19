/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EnhancedEventBroker
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker C = new ConcurrentRequestTracker();
    int u;
    boolean L;
    private static String[] G;

    public EnhancedEventBroker(int n, boolean bl) {
        this.u = n;
        this.L = bl;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return C;
    }

    public static void M(String[] stringArray) {
        G = stringArray;
    }

    @Override
    public boolean fire() {
        if (this.u > 0) {
            // empty if block
        }
        return super.fire();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return C;
    }

    public static String[] z() {
        return G;
    }

    static {
        EnhancedEventBroker.M(new String[3]);
    }
}

