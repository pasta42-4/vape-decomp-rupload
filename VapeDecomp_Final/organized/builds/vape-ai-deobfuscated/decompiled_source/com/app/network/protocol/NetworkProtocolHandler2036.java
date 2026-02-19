/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.protocol;

import com.core.computation.AbstractComputationKernel;
import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;

public class NetworkProtocolHandler2036
extends BytecodeTransformer {
    private static AbstractComputationKernel[] z;
    private final ReflectionUtilityManager680 u;

    public static void u(AbstractComputationKernel[] abstractComputationKernelArray) {
        z = abstractComputationKernelArray;
    }

    static {
        if (NetworkProtocolHandler2036.g() != null) {
            NetworkProtocolHandler2036.u(new AbstractComputationKernel[2]);
        }
    }

    public ReflectionUtilityManager680 o() {
        return this.u;
    }

    public static AbstractComputationKernel[] g() {
        return z;
    }

    public NetworkProtocolHandler2036(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680) {
        super(networkPacketInterceptor);
        this.u = reflectionUtilityManager680;
    }
}

