/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.bytecode;

import com.app.resources.ResourceAllocationTracker1690;
import com.network.protocol.NetworkPacketInterceptor;

public abstract class BytecodeTransformer {
    private static int[] O;
    private final NetworkPacketInterceptor q;

    public void t() {
        ResourceAllocationTracker1690.H.E(this);
    }

    static {
        if (BytecodeTransformer.X() == null) {
            BytecodeTransformer.n(new int[3]);
        }
    }

    public BytecodeTransformer(NetworkPacketInterceptor networkPacketInterceptor) {
        this.q = networkPacketInterceptor;
    }

    public static int[] X() {
        return O;
    }

    public NetworkPacketInterceptor k() {
        return this.q;
    }

    public static void n(int[] nArray) {
        O = nArray;
    }
}

