/*
 * Decompiled with CFR 0.152.
 */
package com.network.broker;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.context.SecureContextNegotiator;
import com.security.session.CipherSessionManager;

class ConnectionBroker
implements OperationExecutionInterface {
    final SecureContextNegotiator j;

    ConnectionBroker(SecureContextNegotiator secureContextNegotiator) {
        this.j = secureContextNegotiator;
    }

    @Override
    public void R() {
        boolean bl;
        CipherSessionManager cipherSessionManager;
        try {
            cipherSessionManager = this.j.h();
            bl = !this.j.h().F();
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionBroker.a(customSystemException);
        }
        cipherSessionManager.s(bl);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

