/*
 * Decompiled with CFR 0.152.
 */
package com.app.compression.tools;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkPacketInterceptor;

public abstract class CompressionUtility2038
extends BytecodeTransformer {
    private static int[] S;
    private final NetworkEndpointIdentifier N;

    public static void e(int[] nArray) {
        S = nArray;
    }

    public CompressionUtility2038(NetworkPacketInterceptor networkPacketInterceptor, NetworkEndpointIdentifier networkEndpointIdentifier) {
        super(networkPacketInterceptor);
        this.N = networkEndpointIdentifier;
    }

    public static int[] e() {
        return S;
    }

    static {
        if (CompressionUtility2038.e() == null) {
            CompressionUtility2038.e(new int[1]);
        }
    }

    public NetworkEndpointIdentifier y() {
        return this.N;
    }
}

