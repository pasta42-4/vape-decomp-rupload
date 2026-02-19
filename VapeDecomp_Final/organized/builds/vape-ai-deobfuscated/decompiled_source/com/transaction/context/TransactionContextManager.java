/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.context;

import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;
import com.security.context.CryptographicContextManager1765;

public class TransactionContextManager
extends CryptographicContextManager1765 {
    private final ReflectionUtilityManager680 X;
    private final String d;

    public ReflectionUtilityManager680 h() {
        return this.X;
    }

    public TransactionContextManager(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680, ReflectionUtilityManager680 reflectionUtilityManager6802, String string) {
        super(networkPacketInterceptor, reflectionUtilityManager680);
        this.X = reflectionUtilityManager6802;
        this.d = string;
    }

    public String e() {
        return this.d;
    }
}

