/*
 * Decompiled with CFR 0.152.
 */
package com.network.transmission;

import a.h6;
import com.resilience.coordination.ResilienceCoordinationManager;
import java.awt.Color;

class DataTransmissionChannel
extends h6 {
    final ResilienceCoordinationManager yT;

    @Override
    public double z() {
        return 8.0;
    }

    @Override
    public double e() {
        return this.J().D(this.O());
    }

    DataTransmissionChannel(ResilienceCoordinationManager resilienceCoordinationManager, String string, Color color) {
        this.yT = resilienceCoordinationManager;
        super(string, color);
    }
}

