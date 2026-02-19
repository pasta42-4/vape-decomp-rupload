/*
 * Decompiled with CFR 0.152.
 */
package com.network.session;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class ConnectionSession
implements DataTransformationContract2366 {
    private long F;
    private String h;
    private long R;

    public ConnectionSession(long l, String string) {
        this.F = l;
        this.h = string;
        this.R = System.currentTimeMillis();
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.F);
        networkProtocolEncoder1013.J(this.h);
        networkProtocolEncoder1013.Z(this.R);
    }

    public long L() {
        return this.F;
    }

    public long u() {
        return this.R;
    }

    public ConnectionSession() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.F = networkProtocolEncoder1013.S();
        this.h = networkProtocolEncoder1013.b(255);
        this.R = networkProtocolEncoder1013.S();
    }

    public String h() {
        return this.h;
    }
}

