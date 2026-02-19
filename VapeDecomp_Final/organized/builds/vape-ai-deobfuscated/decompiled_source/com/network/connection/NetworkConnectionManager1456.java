/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.api.request.RequestHandler;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.crypto.CipherTransformationRegistry;

public class NetworkConnectionManager1456
extends UuidCorrelationManager<RequestHandler> {
    private CipherTransformationRegistry j;

    public NetworkConnectionManager1456(RequestHandler requestHandler, CipherTransformationRegistry cipherTransformationRegistry) {
        super(requestHandler);
        this.j = cipherTransformationRegistry;
    }

    public CipherTransformationRegistry S() {
        return this.j;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.j = networkProtocolEncoder1013.L(CipherTransformationRegistry.class);
    }

    public NetworkConnectionManager1456() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.j);
    }
}

