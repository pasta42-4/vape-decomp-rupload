/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import com.stream.processing.StreamProcessor;

public class NetworkProtocolManager1476
extends UuidCorrelationManager<StreamProcessor> {
    private ReflectionUtilityManager680 B;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.B = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public NetworkProtocolManager1476() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.B.o(networkProtocolEncoder1013);
    }

    public ReflectionUtilityManager680 d() {
        return this.B;
    }

    public NetworkProtocolManager1476(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.B = reflectionUtilityManager680;
    }
}

