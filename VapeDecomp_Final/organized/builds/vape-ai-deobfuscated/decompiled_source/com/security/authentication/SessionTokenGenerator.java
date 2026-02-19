/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.UUID;

public class SessionTokenGenerator {
    private final String X;
    private final UUID z;

    public void u(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.i(this.z);
        networkProtocolEncoder1013.J(this.X);
    }

    public SessionTokenGenerator(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.z = networkProtocolEncoder1013.x();
        this.X = networkProtocolEncoder1013.b(16);
    }

    public String l() {
        return this.X;
    }

    public SessionTokenGenerator(UUID uUID, String string) {
        this.z = uUID;
        this.X = string;
    }

    public UUID j() {
        return this.z;
    }
}

