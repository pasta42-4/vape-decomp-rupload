/*
 * Decompiled with CFR 0.152.
 */
package com.game.state;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;

public class GameStateEventManager
extends GameRenderContextBridge {
    private static String[] w;
    static float N;
    private static final ConcurrentRequestTracker a;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void w(String[] stringArray) {
        w = stringArray;
    }

    static {
        N = 0.0f;
        a = new ConcurrentRequestTracker();
        GameStateEventManager.w(null);
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return a;
    }

    public static String[] s() {
        return w;
    }

    @Override
    public boolean fire() {
        try {
            N += 1.0f;
            if (N >= 100.0f) {
                N = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateEventManager.a(customSystemException);
        }
        try {
            if (N > 0.0f) {
                this.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateEventManager.a(customSystemException);
        }
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return a;
    }
}

