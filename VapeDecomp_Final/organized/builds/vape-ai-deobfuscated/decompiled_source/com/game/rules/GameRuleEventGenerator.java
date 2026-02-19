/*
 * Decompiled with CFR 0.152.
 */
package com.game.rules;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;

public class GameRuleEventGenerator
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker y;
    private static String[] H;
    static float m;
    static float s;

    public static void O(String[] stringArray) {
        H = stringArray;
    }

    static {
        m = 0.0f;
        GameRuleEventGenerator.O(new String[4]);
        s = 0.0f;
        y = new ConcurrentRequestTracker();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return y;
    }

    @Override
    public boolean fire() {
        float f;
        block7: {
            f = ApplicationLifecycleManager.K().h();
            try {
                try {
                    s += 1.0f;
                    if (f == m || !(s >= 10.0f)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameRuleEventGenerator.a(customSystemException);
                }
                s = 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw GameRuleEventGenerator.a(customSystemException);
            }
        }
        try {
            if (s > 0.0f) {
                this.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRuleEventGenerator.a(customSystemException);
        }
        m = f;
        return super.fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String[] j() {
        return H;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return y;
    }
}

