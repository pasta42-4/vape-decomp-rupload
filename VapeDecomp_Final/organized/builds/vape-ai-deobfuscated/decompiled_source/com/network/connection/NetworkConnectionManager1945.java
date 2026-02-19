/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkConnectionManager1945
extends ObjectLifecycleTracker {
    public static NetworkConnectionManager1945 L(String string) {
        return new NetworkConnectionManager1945(NetworkConnectionManager1945.U.u().GA.B(string));
    }

    public String y() {
        return NetworkConnectionManager1945.U.u().GA.F(this.H);
    }

    public NetworkConnectionManager1945(Object object) {
        super(object);
    }
}

