/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import com.identity.management.UniversalIdentityManager;
import com.network.protocol.NetworkPacketInterceptor;
import com.security.context.CryptographicContextManager1765;

public class SessionEncryptionManager
extends CryptographicContextManager1765 {
    private final UniversalIdentityManager j;

    public UniversalIdentityManager D() {
        return this.j;
    }

    public SessionEncryptionManager(NetworkPacketInterceptor networkPacketInterceptor, UniversalIdentityManager universalIdentityManager) {
        super(networkPacketInterceptor, universalIdentityManager.d());
        this.j = universalIdentityManager;
    }
}

