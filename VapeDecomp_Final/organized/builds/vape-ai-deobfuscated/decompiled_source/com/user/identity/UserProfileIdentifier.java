/*
 * Decompiled with CFR 0.152.
 */
package com.user.identity;

import com.app.adapter.GenericTransformationAdapter;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.UUID;

public class UserProfileIdentifier
extends UuidCorrelationManager<GenericTransformationAdapter> {
    private String L;
    private UUID j;
    private String E;

    public UUID X() {
        return this.j;
    }

    public String P() {
        return this.E;
    }

    public UserProfileIdentifier() {
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.E = networkProtocolEncoder1013.b(255);
        this.j = networkProtocolEncoder1013.x();
        this.L = networkProtocolEncoder1013.b(16);
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.J(this.E);
        networkProtocolEncoder1013.i(this.j);
        networkProtocolEncoder1013.J(this.L);
    }

    public String I() {
        return this.L;
    }

    public UserProfileIdentifier(String string, UUID uUID, String string2) {
        this.E = string;
        this.j = uUID;
        this.L = string2;
    }
}

