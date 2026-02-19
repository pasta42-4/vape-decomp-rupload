/*
 * Decompiled with CFR 0.152.
 */
package com.app.ui;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;
import java.nio.FloatBuffer;

public class UIRenderingController1449
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker t = new ConcurrentRequestTracker();
    private static boolean c;
    private static float B;
    private static float l;
    private static float V;
    private static float Q;

    public UIRenderingController1449() {
        Q = 1.0f;
        l = 0.0f;
        V = 0.0f;
        B = GeometryCalculator.C() == 13 ? 0.4f : 0.3f;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return t;
    }

    public static void setColor(float f, float f2, float f3, float f4) {
        Q = f;
        l = f2;
        V = f3;
        B = f4;
        c = true;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return t;
    }

    public static void flip(FloatBuffer floatBuffer) {
        try {
            if (!c) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UIRenderingController1449.a(customSystemException);
        }
        floatBuffer.position(0);
        floatBuffer.put(Q);
        floatBuffer.put(l);
        floatBuffer.put(V);
        floatBuffer.put(B);
        c = false;
    }
}

