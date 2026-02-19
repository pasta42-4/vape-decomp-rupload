/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import java.util.UUID;

public class CryptographicTokenManager1366
implements DataTransformationContract2366 {
    private long H;
    private UUID W;
    private String V;

    public CryptographicTokenManager1366() {
    }

    public UUID Q() {
        return this.W;
    }

    public long n() {
        return this.H;
    }

    public String x() {
        return this.V;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.H);
        networkProtocolEncoder1013.i(this.W);
        networkProtocolEncoder1013.J(this.V);
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.H = networkProtocolEncoder1013.S();
        this.W = networkProtocolEncoder1013.x();
        this.V = networkProtocolEncoder1013.b(16);
    }

    public CryptographicTokenManager1366(ReflectionUtilityManager680 reflectionUtilityManager680, UUID uUID, String string) {
        this.H = reflectionUtilityManager680.r();
        this.W = uUID;
        this.V = string;
    }
}

