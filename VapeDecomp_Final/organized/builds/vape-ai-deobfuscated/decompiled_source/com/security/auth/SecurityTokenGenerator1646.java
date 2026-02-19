/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.UUID;

public class SecurityTokenGenerator1646
implements DataTransformationContract2366 {
    private String a;
    private UUID n;

    public SecurityTokenGenerator1646() {
    }

    public String d() {
        return this.a;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.i(this.n);
        networkProtocolEncoder1013.J(this.a);
    }

    public SecurityTokenGenerator1646(UUID uUID, String string) {
        this.n = uUID;
        this.a = string;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.n = networkProtocolEncoder1013.x();
        this.a = networkProtocolEncoder1013.b(16);
    }

    public UUID w() {
        return this.n;
    }
}

