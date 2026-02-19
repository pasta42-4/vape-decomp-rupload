/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.network.connection;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import org.jetbrains.annotations.Nullable;

public class ConnectionEndpointResolver
extends BytecodeTransformer {
    @Nullable
    private final String a;
    private final long v;

    @Nullable
    public String D() {
        return this.a;
    }

    public long R() {
        return this.v;
    }

    public ConnectionEndpointResolver(NetworkPacketInterceptor networkPacketInterceptor, long l, @Nullable String string) {
        super(networkPacketInterceptor);
        this.v = l;
        this.a = string;
    }
}

