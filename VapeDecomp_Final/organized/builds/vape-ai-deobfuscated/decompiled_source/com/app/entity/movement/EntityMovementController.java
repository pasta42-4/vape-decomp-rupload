/*
 * Decompiled with CFR 0.152.
 */
package com.app.entity.movement;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class EntityMovementController
extends GameRenderContextBridge {
    static boolean g;
    private static float N;
    private static final ConcurrentRequestTracker D;
    public static CryptographicTransformer P;
    private static CryptographicTransformer Q;
    private static boolean c;
    private static float T;

    static float access$002(float f) {
        T = f;
        return T;
    }

    public static void setRotationYaw(float f) {
        T = f;
    }

    public static void setRotationPitch(float f) {
        N = f;
    }

    public static void setShouldAlwaysSend(boolean bl) {
        g = bl;
    }

    public static float getRotationPitch() {
        return N;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return D;
    }

    static CryptographicTransformer access$302(CryptographicTransformer cryptographicTransformer) {
        Q = cryptographicTransformer;
        return Q;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static boolean shouldAlwaysSend() {
        return g;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return D;
    }

    public static float getRotationYaw() {
        return T;
    }

    public static void setOnGround(boolean bl) {
        c = bl;
    }

    static float access$102(float f) {
        N = f;
        return N;
    }

    public static boolean isOnGround() {
        return c;
    }

    static {
        D = new ConcurrentRequestTracker();
    }

    static CryptographicTransformer access$300() {
        return Q;
    }

    EntityMovementController(CryptographicTransformer cryptographicTransformer) {
        P = cryptographicTransformer;
    }

    static boolean access$202(boolean bl) {
        c = bl;
        return c;
    }
}

