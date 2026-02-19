/*
 * Decompiled with CFR 0.152.
 */
package com.financial.validation;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;

public class TransactionValidator2148
extends BytecodeTransformer {
    private static int[] e;

    public static int[] S() {
        return e;
    }

    public TransactionValidator2148(NetworkPacketInterceptor networkPacketInterceptor) {
        super(networkPacketInterceptor);
    }

    public static void x(int[] nArray) {
        e = nArray;
    }

    static {
        if (TransactionValidator2148.S() != null) {
            TransactionValidator2148.x(new int[5]);
        }
    }
}

