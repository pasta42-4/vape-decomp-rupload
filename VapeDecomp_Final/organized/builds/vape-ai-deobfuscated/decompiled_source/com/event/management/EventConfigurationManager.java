/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class EventConfigurationManager
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker B = new ConcurrentRequestTracker();
    private String G;
    private float S;
    private boolean J;
    private int V;
    private Object I;
    private float L;

    public int getX() {
        return (int)this.L;
    }

    public EventConfigurationManager(Object object, String string, float f, float f2, int n, boolean bl) {
        this.I = object;
        this.G = string;
        this.L = f;
        this.S = f2;
        this.V = n;
        this.J = bl;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return B;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return B;
    }
}

