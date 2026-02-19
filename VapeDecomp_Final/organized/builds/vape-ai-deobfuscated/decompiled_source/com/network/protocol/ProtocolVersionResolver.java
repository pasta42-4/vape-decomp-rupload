/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.JF;
import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;

public class ProtocolVersionResolver
extends BytecodeTransformer {
    private final JF e;

    public JF g() {
        return this.e;
    }

    public ProtocolVersionResolver(NetworkPacketInterceptor networkPacketInterceptor, JF jF) {
        super(networkPacketInterceptor);
        this.e = jF;
    }
}

