/*
 * Decompiled with CFR 0.152.
 */
package com.resource.tracking;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;

public class ContextualResourceTracker
extends BytecodeTransformer {
    private final ReflectionUtilityManager680 L;
    private final String z;

    public ContextualResourceTracker(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        super(networkPacketInterceptor);
        this.L = reflectionUtilityManager680;
        this.z = string;
    }

    public ReflectionUtilityManager680 v() {
        return this.L;
    }

    public String D() {
        return this.z;
    }
}

