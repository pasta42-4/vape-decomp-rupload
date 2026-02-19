/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolDefinition;
import com.security.context.SecureContextNegotiator;
import com.security.session.CipherSessionManager;

class SecurityTokenValidator
implements OperationExecutionInterface {
    final CipherSessionManager X;
    final SecureContextNegotiator x;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        try {
            if (this.X instanceof NetworkProtocolDefinition) {
                ((NetworkProtocolDefinition)((Object)this.X)).V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenValidator.a(customSystemException);
        }
    }

    SecurityTokenValidator(SecureContextNegotiator secureContextNegotiator, CipherSessionManager cipherSessionManager) {
        this.x = secureContextNegotiator;
        this.X = cipherSessionManager;
    }
}

