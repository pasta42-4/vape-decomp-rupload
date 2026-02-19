/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import a.Uq;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.UUID;

public class NetworkConnectionHandler1792
extends ObjectLifecycleTracker {
    public NetworkConnectionManager1945 v() {
        return new NetworkConnectionManager1945(Uq.A(NetworkConnectionHandler1792.U.u().dN, this.H));
    }

    public double y() {
        return NetworkConnectionHandler1792.U.u().dN.K(this.H);
    }

    public NetworkConnectionHandler1792(Object object) {
        super(object);
    }

    public UUID r() {
        return Uq.P(NetworkConnectionHandler1792.U.u().dN, this.H);
    }
}

