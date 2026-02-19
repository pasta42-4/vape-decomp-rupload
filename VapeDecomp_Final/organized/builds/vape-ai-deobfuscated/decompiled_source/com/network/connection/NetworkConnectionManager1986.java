/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.Uf;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.List;

public class NetworkConnectionManager1986
extends ObjectLifecycleTracker {
    public static NetworkConnectionManager1986 k() {
        return new NetworkConnectionManager1986(Uf.H(NetworkConnectionManager1986.U.u().Q));
    }

    public NetworkConnectionManager1986(Object object) {
        super(object);
    }

    public List d() {
        return Uf.a(NetworkConnectionManager1986.U.u().Q, this.H);
    }
}

