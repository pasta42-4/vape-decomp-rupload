/*
 * Decompiled with CFR 0.152.
 */
package com.error.handling;

import com.resilience.coordination.ResilienceCoordinationManager;
import com.security.crypto.CryptographicSecurityManager396;
import java.awt.Color;

class ErrorResolutionStrategy
extends CryptographicSecurityManager396 {
    final ResilienceCoordinationManager n;

    @Override
    public double e() {
        return 68.0;
    }

    ErrorResolutionStrategy(ResilienceCoordinationManager resilienceCoordinationManager, String string, String string2, double d2, double d3, Color color, boolean bl) {
        this.n = resilienceCoordinationManager;
        super(string, string2, d2, d3, color, bl);
    }
}

