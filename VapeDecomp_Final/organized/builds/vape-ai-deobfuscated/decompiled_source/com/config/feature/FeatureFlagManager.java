/*
 * Decompiled with CFR 0.152.
 */
package com.config.feature;

import com.app.events.EventDispatchProtocol2682;
import com.exception.system.CustomSystemException;
import com.logging.error.ErrorLoggingBridge;

public final class FeatureFlagManager {
    private static EventDispatchProtocol2682 L;
    private static boolean E;
    private static boolean F;
    private static boolean K;

    public static void j(Throwable throwable) {
        L.s(throwable);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        F = true;
        FeatureFlagManager.k(false);
        K = false;
        L = new ErrorLoggingBridge();
    }

    public static boolean J() {
        boolean bl = FeatureFlagManager.U();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FeatureFlagManager.a(customSystemException);
        }
        return false;
    }

    public static boolean U() {
        return E;
    }

    public static void k(boolean bl) {
        E = bl;
    }
}

