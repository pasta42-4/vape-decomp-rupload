/*
 * Decompiled with CFR 0.152.
 */
package com.game.state;

import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.tokens.SecureTokenLifecycleManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class GameStateTransitionManager
extends ObjectLifecycleTracker {
    public float o() {
        return GameStateTransitionManager.U.u().LW.l(this.H);
    }

    public float y() {
        return GameStateTransitionManager.U.u().LW.u(this.H);
    }

    public float V() {
        return GameStateTransitionManager.U.u().LW.t(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public EventDispatcher r(float f) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return EventDispatcher.c(this, f, true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateTransitionManager.a(customSystemException);
        }
        return new EventDispatcher(GameStateTransitionManager.U.u().LW.x(this.H, f));
    }

    public GameStateTransitionManager(Object object) {
        super(object);
    }

    public static GameStateTransitionManager T(float f, float f2, float f3) {
        return new GameStateTransitionManager(SecureTokenLifecycleManager.g(GameStateTransitionManager.U.u().LW, f, f2, f3));
    }
}

