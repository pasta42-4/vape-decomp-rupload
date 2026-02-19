/*
 * Decompiled with CFR 0.152.
 */
package com.protocol.management;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class ProtocolDispatcher
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker i = new ConcurrentRequestTracker();
    private static String g;
    private final CryptographicTransformer b;

    ProtocolDispatcher(Object object) {
        this.b = new CryptographicTransformer(object);
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return i;
    }

    public static String G() {
        return g;
    }

    public CryptographicTransformer getTarget() {
        return this.b;
    }

    public static void w(String string) {
        g = string;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return i;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    static {
        ProtocolDispatcher.w(null);
    }
}

