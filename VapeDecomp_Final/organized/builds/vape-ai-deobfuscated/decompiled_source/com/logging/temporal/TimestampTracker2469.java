/*
 * Decompiled with CFR 0.152.
 */
package com.logging.temporal;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;

public class TimestampTracker2469
extends BytecodeTransformer {
    private final long z;

    public TimestampTracker2469(NetworkPacketInterceptor networkPacketInterceptor, long l) {
        super(networkPacketInterceptor);
        this.z = l;
    }

    public long M() {
        return this.z;
    }
}

