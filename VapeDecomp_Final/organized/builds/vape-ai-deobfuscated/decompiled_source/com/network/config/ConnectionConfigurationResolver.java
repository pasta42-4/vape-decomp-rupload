/*
 * Decompiled with CFR 0.152.
 */
package com.network.config;

import com.app.logging.event.LoggingEventDispatcher;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.NetworkProtocolNegotiator2080;
import com.security.transform.CryptographicTransformer;
import java.util.List;

public class ConnectionConfigurationResolver
extends NetworkProtocolNegotiator {
    private static String g;

    public static void n(String string) {
        g = string;
    }

    public NetworkProtocolNegotiator2080 N() {
        return new NetworkProtocolNegotiator2080(ConnectionConfigurationResolver.U.u().di.n(this.H));
    }

    public ConnectionConfigurationResolver(Object object) {
        super(object);
    }

    @Override
    public CryptographicTransformer I(int n) {
        return new CryptographicTransformer(ConnectionConfigurationResolver.U.u().di.U(this.H, n));
    }

    public List f() {
        return super.L();
    }

    public LoggingEventDispatcher G() {
        return new LoggingEventDispatcher(ConnectionConfigurationResolver.U.u().di.V(this.H));
    }

    public static String d() {
        return g;
    }

    public void c(int n, CryptographicTransformer cryptographicTransformer) {
        ConnectionConfigurationResolver.U.u().di.t(this.H, n, cryptographicTransformer);
    }

    static {
        if (ConnectionConfigurationResolver.d() == null) {
            ConnectionConfigurationResolver.n("ClBqN");
        }
    }
}

