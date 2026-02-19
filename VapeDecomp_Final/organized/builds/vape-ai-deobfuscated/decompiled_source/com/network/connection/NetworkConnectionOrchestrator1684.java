/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.wM;
import com.app.service.core.ServiceOrchestrator;
import com.network.connection.NetworkConnectionManager2517;
import com.networking.validation.ConnectionValidator;
import com.temporal.metadata.TemporalMetadataResolver;

public class NetworkConnectionOrchestrator1684
extends wM {
    private final NetworkConnectionManager2517 eu;

    private void L() {
        TemporalMetadataResolver.h.O().u().q(this.eu);
    }

    static void I(NetworkConnectionOrchestrator1684 networkConnectionOrchestrator1684) {
        networkConnectionOrchestrator1684.O();
    }

    private void O() {
        TemporalMetadataResolver.h.O().u().b(this.eu);
    }

    public NetworkConnectionOrchestrator1684(NetworkConnectionManager2517 networkConnectionManager2517) {
        super(networkConnectionManager2517, null);
        this.eu = networkConnectionManager2517;
        this.q().N(new ConnectionValidator(this));
        this.G().n(this.q(), new Object[0]);
        this.Z().N(new ServiceOrchestrator(this));
    }

    static void n(NetworkConnectionOrchestrator1684 networkConnectionOrchestrator1684) {
        networkConnectionOrchestrator1684.L();
    }
}

