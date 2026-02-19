/*
 * Decompiled with CFR 0.152.
 */
package com.data.versioning;

import com.app.correlation.management.UuidCorrelationManager;
import com.app.data.storage.TimestampedDataContainer;
import com.network.protocol.NetworkProtocolEncoder1013;

public class DataVersionController
extends UuidCorrelationManager<TimestampedDataContainer> {
    private String M;

    public DataVersionController() {
    }

    public DataVersionController(String string) {
        this.M = string;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.M = networkProtocolEncoder1013.b(255);
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.J(this.M);
    }

    public String x() {
        return this.M;
    }
}

