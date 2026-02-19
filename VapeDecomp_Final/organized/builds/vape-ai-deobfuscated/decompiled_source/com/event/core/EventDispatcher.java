/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.exception.system.CustomSystemException;
import com.game.state.GameStateTransitionManager;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class EventDispatcher
extends ObjectLifecycleTracker {
    public float Q() {
        return EventDispatcher.U.u().gc.H(this.H);
    }

    public float H() {
        return EventDispatcher.U.u().gc.v(this.H);
    }

    public static EventDispatcher c(GameStateTransitionManager gameStateTransitionManager, float f, boolean bl) {
        if (bl) {
            f *= (float)Math.PI / 180;
        }
        float f2 = (float)Math.sin(f / 2.0f);
        float f3 = gameStateTransitionManager.V() * f2;
        float f4 = gameStateTransitionManager.y() * f2;
        float f5 = gameStateTransitionManager.o() * f2;
        float f6 = (float)Math.cos(f / 2.0f);
        return new EventDispatcher(EventDispatcher.U.u().gc.d(f3, f4, f5, f6));
    }

    public EventDispatcher(Object object) {
        super(object);
    }

    public float i() {
        return EventDispatcher.U.u().gc.D(this.H);
    }

    public float G() {
        return EventDispatcher.U.u().gc.O(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static EventDispatcher o(float f, float f2, float f3, boolean bl) {
        block2: {
            block3: {
                try {
                    if (GeometryCalculator.C() < 50) break block2;
                    if (!bl) break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatcher.a(customSystemException);
                }
                f *= (float)Math.PI / 180;
                f2 *= (float)Math.PI / 180;
                f3 *= (float)Math.PI / 180;
            }
            float f4 = (float)Math.sin(0.5f * f);
            float f5 = (float)Math.cos(0.5f * f);
            float f6 = (float)Math.sin(0.5f * f2);
            float f7 = (float)Math.cos(0.5f * f2);
            float f8 = (float)Math.sin(0.5f * f3);
            float f9 = (float)Math.cos(0.5f * f3);
            float f10 = f4 * f7 * f9 + f5 * f6 * f8;
            float f11 = f5 * f6 * f9 - f4 * f7 * f8;
            float f12 = f4 * f6 * f9 + f5 * f7 * f8;
            float f13 = f5 * f7 * f9 - f4 * f6 * f8;
            return new EventDispatcher(EventDispatcher.U.u().gc.d(f10, f11, f12, f13));
        }
        return new EventDispatcher(EventDispatcher.U.u().gc.A(f, f2, f3, bl));
    }
}

