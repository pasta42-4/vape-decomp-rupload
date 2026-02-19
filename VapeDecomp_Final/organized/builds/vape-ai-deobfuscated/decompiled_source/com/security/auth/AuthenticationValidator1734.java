/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class AuthenticationValidator1734
implements DataTransformationContract2366 {
    private ReflectionUtilityManager680 K;

    public ReflectionUtilityManager680 I() {
        return this.K;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.K.o(networkProtocolEncoder1013);
    }

    public AuthenticationValidator1734() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.K = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public AuthenticationValidator1734(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.K = reflectionUtilityManager680;
    }
}

