/*
 * Decompiled with CFR 0.152.
 */
package com.network.config;

import com.network.auth.NetworkCredentialEncoder;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkConfigurationManager1905
extends ObjectLifecycleTracker {
    public static NetworkConfigurationManager1905 W() {
        return new NetworkConfigurationManager1905(NetworkCredentialEncoder.J(NetworkConfigurationManager1905.U.u().gb));
    }

    public static NetworkConfigurationManager1905 a() {
        return new NetworkConfigurationManager1905(NetworkCredentialEncoder.z(NetworkConfigurationManager1905.U.u().gb));
    }

    public NetworkConfigurationManager1905(Object object) {
        super(object);
    }

    public static NetworkConfigurationManager1905 I() {
        return new NetworkConfigurationManager1905(NetworkCredentialEncoder.Z(NetworkConfigurationManager1905.U.u().gb));
    }
}

