/*
 * Decompiled with CFR 0.152.
 */
package com.network.registry;

import com.core.computation.AbstractComputationKernel;
import com.deobfuscation.bytecode.BytecodeTransformer;
import com.identity.management.UniversalIdentityManager;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkPacketInterceptor;
import java.util.ArrayList;
import java.util.List;

public class NetworkEndpointRegistry
extends BytecodeTransformer {
    private static AbstractComputationKernel[] a;
    private final List<NetworkEndpointIdentifier> t;
    private final List<NetworkEndpointIdentifier> I;
    private final List<UniversalIdentityManager> C = new ArrayList<UniversalIdentityManager>();

    static {
        if (NetworkEndpointRegistry.a() != null) {
            NetworkEndpointRegistry.z(new AbstractComputationKernel[1]);
        }
    }

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        a = abstractComputationKernelArray;
    }

    public List<UniversalIdentityManager> Q() {
        return this.C;
    }

    public List<NetworkEndpointIdentifier> S() {
        return this.t;
    }

    public List<NetworkEndpointIdentifier> T() {
        return this.I;
    }

    public NetworkEndpointRegistry(NetworkPacketInterceptor networkPacketInterceptor, List<UniversalIdentityManager> list, List<NetworkEndpointIdentifier> list2, List<NetworkEndpointIdentifier> list3) {
        super(networkPacketInterceptor);
        this.t = new ArrayList<NetworkEndpointIdentifier>();
        this.I = new ArrayList<NetworkEndpointIdentifier>();
        this.C.addAll(list);
        this.t.addAll(list2);
        this.I.addAll(list3);
    }

    public static AbstractComputationKernel[] a() {
        return a;
    }
}

