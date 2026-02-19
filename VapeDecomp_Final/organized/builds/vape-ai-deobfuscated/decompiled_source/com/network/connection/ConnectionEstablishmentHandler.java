/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.network.connection.NetworkConnectionManager2404;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConnectionEstablishmentHandler
extends ObjectLifecycleTracker {
    public ConnectionEstablishmentHandler(Object object) {
        super(object);
    }

    public NetworkConnectionManager2404 T() {
        return new NetworkConnectionManager2404(ConnectionEstablishmentHandler.U.u().f.V(this.H));
    }
}

