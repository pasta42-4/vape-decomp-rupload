/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.async.AsynchronousCipherManager;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class NetworkProtocolHandler1767
implements DataProcessingProtocol {
    final AsynchronousCipherManager S;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        try {
            if (securityEnumRegistry != SecurityEnumRegistry.LEFT_CLICK) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1767.a(customSystemException);
        }
        AsynchronousCipherManager.o(this.S).T();
    }

    NetworkProtocolHandler1767(AsynchronousCipherManager asynchronousCipherManager) {
        this.S = asynchronousCipherManager;
    }
}

