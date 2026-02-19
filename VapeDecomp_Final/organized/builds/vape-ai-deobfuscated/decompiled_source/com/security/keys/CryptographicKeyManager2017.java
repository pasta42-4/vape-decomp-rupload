/*
 * Decompiled with CFR 0.152.
 */
package com.security.keys;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;
import com.user.identity.UserIdentityManager;

public class CryptographicKeyManager2017
extends BytecodeTransformer {
    private final UserIdentityManager m;
    private static String[] s;

    public static void M(String[] stringArray) {
        s = stringArray;
    }

    public UserIdentityManager e() {
        return this.m;
    }

    public CryptographicKeyManager2017(NetworkPacketInterceptor networkPacketInterceptor, UserIdentityManager userIdentityManager) {
        super(networkPacketInterceptor);
        this.m = userIdentityManager;
    }

    static {
        if (CryptographicKeyManager2017.r() == null) {
            CryptographicKeyManager2017.M(new String[5]);
        }
    }

    public static String[] r() {
        return s;
    }
}

