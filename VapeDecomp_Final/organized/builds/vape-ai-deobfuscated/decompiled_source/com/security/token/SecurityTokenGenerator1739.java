/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import com.data.contract.DataTransformationContract2366;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkProtocolEncoder1013;

public class SecurityTokenGenerator1739
implements DataTransformationContract2366 {
    private NetworkEndpointIdentifier P;

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.P = new NetworkEndpointIdentifier(networkProtocolEncoder1013);
    }

    public SecurityTokenGenerator1739(NetworkEndpointIdentifier networkEndpointIdentifier) {
        this.P = networkEndpointIdentifier;
    }

    public SecurityTokenGenerator1739() {
    }

    public NetworkEndpointIdentifier M() {
        return this.P;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.P.p(networkProtocolEncoder1013);
    }
}

