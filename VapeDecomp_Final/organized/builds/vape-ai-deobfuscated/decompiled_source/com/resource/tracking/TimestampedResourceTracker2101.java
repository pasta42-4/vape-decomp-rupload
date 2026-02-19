/*
 * Decompiled with CFR 0.152.
 */
package com.resource.tracking;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;

public class TimestampedResourceTracker2101
extends BytecodeTransformer {
    private final String x;
    private final long d;

    public long c() {
        return this.d;
    }

    public TimestampedResourceTracker2101(NetworkPacketInterceptor networkPacketInterceptor, long l, String string) {
        super(networkPacketInterceptor);
        this.d = l;
        this.x = string;
    }

    public String b() {
        return this.x;
    }
}

