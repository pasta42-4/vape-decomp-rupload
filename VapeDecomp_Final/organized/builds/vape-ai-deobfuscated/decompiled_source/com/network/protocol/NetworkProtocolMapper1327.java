/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.correlation.management.UuidCorrelationManager;
import com.event.management.EventDispatchQueue;
import com.network.protocol.NetworkProtocolEncoder1013;

public class NetworkProtocolMapper1327
extends UuidCorrelationManager<EventDispatchQueue> {
    private int h;
    private static String a;

    public static void i(String string) {
        a = string;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.e(this.h);
    }

    static {
        if (NetworkProtocolMapper1327.I() != null) {
            NetworkProtocolMapper1327.i("j7kQmb");
        }
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.h = networkProtocolEncoder1013.U();
    }

    public NetworkProtocolMapper1327() {
    }

    public NetworkProtocolMapper1327(int n) {
        this.h = n;
    }

    public static String I() {
        return a;
    }

    public int H() {
        return this.h;
    }
}

