/*
 * Decompiled with CFR 0.152.
 */
package com.network.lifecycle;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.crypto.CryptoTransformationRegistry;

public class ConnectionLifecycleManager1740
implements DataTransformationContract2366 {
    private CryptoTransformationRegistry d;

    public ConnectionLifecycleManager1740() {
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.d);
    }

    public CryptoTransformationRegistry u() {
        return this.d;
    }

    public ConnectionLifecycleManager1740(CryptoTransformationRegistry cryptoTransformationRegistry) {
        this.d = cryptoTransformationRegistry;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.d = networkProtocolEncoder1013.L(CryptoTransformationRegistry.class);
    }
}

