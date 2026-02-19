/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.encryption;

import a.JF;
import com.deobfuscation.bytecode.BytecodeTransformer;
import com.network.protocol.NetworkPacketInterceptor;

public class EncryptionEngine
extends BytecodeTransformer {
    private final JF a;

    public JF E() {
        return this.a;
    }

    public EncryptionEngine(NetworkPacketInterceptor networkPacketInterceptor, JF jF) {
        super(networkPacketInterceptor);
        this.a = jF;
    }
}

