/*
 * Decompiled with CFR 0.152.
 */
package com.system.memory;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor;
import com.security.registry.CryptoAlgorithmRegistry893;

public class CacheMemoryManager1616
extends BytecodeTransformer {
    private final Object y;
    private static int i;
    private final CryptoAlgorithmRegistry893 l;

    static {
        if (CacheMemoryManager1616.Y() == 0) {
            CacheMemoryManager1616.V(83);
        }
    }

    public static int Y() {
        return i;
    }

    public Object i() {
        return this.y;
    }

    public CacheMemoryManager1616(NetworkPacketInterceptor networkPacketInterceptor, CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893, Object object) {
        super(networkPacketInterceptor);
        this.l = cryptoAlgorithmRegistry893;
        this.y = object;
    }

    public static int T() {
        int n = CacheMemoryManager1616.Y();
        try {
            if (n == 0) {
                return 51;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheMemoryManager1616.a(customSystemException);
        }
        return 0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptoAlgorithmRegistry893 r() {
        return this.l;
    }

    public static void V(int n) {
        i = n;
    }
}

