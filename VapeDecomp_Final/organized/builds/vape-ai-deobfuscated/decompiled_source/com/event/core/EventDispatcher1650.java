/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolInterceptor;
import com.security.cryptography.CryptographicResourceManager;

class EventDispatcher1650
implements OperationExecutionInterface {
    final NetworkProtocolInterceptor K;
    final CryptographicResourceManager f;

    @Override
    public void R() {
        try {
            if (NetworkProtocolInterceptor.J(this.K) == this.f) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatcher1650.a(customSystemException);
        }
        NetworkProtocolInterceptor.E(this.K, this.f);
        NetworkProtocolInterceptor.Jr.O();
        this.K.V();
    }

    EventDispatcher1650(NetworkProtocolInterceptor networkProtocolInterceptor, CryptographicResourceManager cryptographicResourceManager) {
        this.K = networkProtocolInterceptor;
        this.f = cryptographicResourceManager;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

