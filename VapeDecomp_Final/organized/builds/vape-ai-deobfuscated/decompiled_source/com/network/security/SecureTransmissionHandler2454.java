/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;

public class SecureTransmissionHandler2454
extends BytecodeTransformer {
    private final ReflectionUtilityManager680 u;

    public SecureTransmissionHandler2454(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680) {
        super(networkPacketInterceptor);
        this.u = reflectionUtilityManager680;
    }

    public ReflectionUtilityManager680 r() {
        return this.u;
    }
}

