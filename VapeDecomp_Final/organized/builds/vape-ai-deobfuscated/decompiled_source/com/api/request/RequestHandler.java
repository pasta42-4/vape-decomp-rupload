/*
 * Decompiled with CFR 0.152.
 */
package com.api.request;

import com.app.correlation.management.UuidCorrelationManager;
import com.network.connection.NetworkConnectionManager1456;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class RequestHandler
extends UuidCorrelationManager<NetworkConnectionManager1456> {
    private long A;

    public RequestHandler() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.A);
    }

    public long k() {
        return this.A;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.A = networkProtocolEncoder1013.S();
    }

    public RequestHandler(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.A = reflectionUtilityManager680.r();
    }
}

