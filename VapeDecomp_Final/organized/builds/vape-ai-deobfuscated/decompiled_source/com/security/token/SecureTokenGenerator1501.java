/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.policy.SecurityPolicyValidator;

public class SecureTokenGenerator1501
implements DataTransformationContract2366 {
    private static String y;
    private SecurityPolicyValidator V;

    static {
        if (SecureTokenGenerator1501.L() != null) {
            SecureTokenGenerator1501.y("f64vk");
        }
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.V);
    }

    public static void y(String string) {
        y = string;
    }

    public SecurityPolicyValidator h() {
        return this.V;
    }

    public static String L() {
        return y;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.V = networkProtocolEncoder1013.L(SecurityPolicyValidator.class);
    }

    public SecureTokenGenerator1501() {
    }

    public SecureTokenGenerator1501(SecurityPolicyValidator securityPolicyValidator) {
        this.V = securityPolicyValidator;
    }
}

