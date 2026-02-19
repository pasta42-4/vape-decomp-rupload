/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.protocol.EncryptionProtocolHandler;

class TokenAuthenticator1788
implements OperationExecutionInterface {
    final EncryptionProtocolHandler p;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        boolean bl;
        EncryptionProtocolHandler encryptionProtocolHandler;
        try {
            encryptionProtocolHandler = this.p;
            bl = !EncryptionProtocolHandler.C(this.p);
        }
        catch (CustomSystemException customSystemException) {
            throw TokenAuthenticator1788.a(customSystemException);
        }
        EncryptionProtocolHandler.s(encryptionProtocolHandler, bl);
        this.p.F().A();
    }

    TokenAuthenticator1788(EncryptionProtocolHandler encryptionProtocolHandler) {
        this.p = encryptionProtocolHandler;
    }
}

