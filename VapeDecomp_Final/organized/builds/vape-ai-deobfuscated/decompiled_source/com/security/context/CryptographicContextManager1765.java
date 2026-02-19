/*
 * Decompiled with CFR 0.152.
 */
package com.security.context;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;

public abstract class CryptographicContextManager1765
extends BytecodeTransformer {
    private static int u;
    private final ReflectionUtilityManager680 C;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptographicContextManager1765(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680) {
        super(networkPacketInterceptor);
        this.C = reflectionUtilityManager680;
    }

    static {
        if (CryptographicContextManager1765.G() == 0) {
            CryptographicContextManager1765.j(19);
        }
    }

    public static void j(int n) {
        u = n;
    }

    public static int G() {
        return u;
    }

    public static int l() {
        int n = CryptographicContextManager1765.G();
        try {
            if (n == 0) {
                return 65;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicContextManager1765.a(customSystemException);
        }
        return 0;
    }

    public ReflectionUtilityManager680 u() {
        return this.C;
    }
}

