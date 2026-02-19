/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.cryptography;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.user.identity.UserIdentityManager;

public class CryptographicKeyManager2408
extends BytecodeTransformer {
    private final UserIdentityManager L;

    public CryptographicKeyManager2408(NetworkPacketInterceptor networkPacketInterceptor, UserIdentityManager userIdentityManager) {
        super(networkPacketInterceptor);
        this.L = userIdentityManager;
    }

    public UserIdentityManager R() {
        return this.L;
    }
}

