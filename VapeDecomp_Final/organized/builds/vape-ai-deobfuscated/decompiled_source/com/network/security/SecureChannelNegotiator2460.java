/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;

public class SecureChannelNegotiator2460
extends BytecodeTransformer {
    private final ReflectionUtilityManager680 l;

    public SecureChannelNegotiator2460(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680) {
        super(networkPacketInterceptor);
        this.l = reflectionUtilityManager680;
    }

    public ReflectionUtilityManager680 g() {
        return this.l;
    }
}

