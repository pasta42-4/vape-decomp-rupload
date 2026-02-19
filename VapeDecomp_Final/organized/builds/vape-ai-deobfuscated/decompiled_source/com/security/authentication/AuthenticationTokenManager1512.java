/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.data.contract.DataTransformationContract2366;
import com.identifier.management.UniqueIdentifierManager1303;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.system.configuration.SystemConfigurationProfile;

public class AuthenticationTokenManager1512
implements DataTransformationContract2366 {
    private static int[] V;
    private UniqueIdentifierManager1303 p;
    private SystemConfigurationProfile D;

    public SystemConfigurationProfile g() {
        return this.D;
    }

    public static void z(int[] nArray) {
        V = nArray;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.p.P(networkProtocolEncoder1013);
        networkProtocolEncoder1013.N(this.D);
    }

    public AuthenticationTokenManager1512(UniqueIdentifierManager1303 uniqueIdentifierManager1303, SystemConfigurationProfile systemConfigurationProfile) {
        this.p = uniqueIdentifierManager1303;
        this.D = systemConfigurationProfile;
    }

    static {
        if (AuthenticationTokenManager1512.z() == null) {
            AuthenticationTokenManager1512.z(new int[3]);
        }
    }

    public UniqueIdentifierManager1303 u() {
        return this.p;
    }

    public AuthenticationTokenManager1512() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.p = new UniqueIdentifierManager1303(networkProtocolEncoder1013);
        this.D = networkProtocolEncoder1013.L(SystemConfigurationProfile.class);
    }

    public static int[] z() {
        return V;
    }
}

