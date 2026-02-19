/*
 * Decompiled with CFR 0.152.
 */
package com.connection.pool;

import a.h6;
import com.resilience.coordination.ResilienceCoordinationManager;
import java.awt.Color;

class ConnectionPoolManager
extends h6 {
    final ResilienceCoordinationManager YR;

    @Override
    public double z() {
        return 8.0;
    }

    ConnectionPoolManager(ResilienceCoordinationManager resilienceCoordinationManager, String string, Color color) {
        this.YR = resilienceCoordinationManager;
        super(string, color);
    }

    @Override
    public double e() {
        return this.J().D(this.O()) + 3.0;
    }
}

