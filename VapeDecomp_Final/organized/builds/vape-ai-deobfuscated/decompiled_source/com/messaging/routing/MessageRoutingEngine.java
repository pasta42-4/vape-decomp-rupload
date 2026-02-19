/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import a.HK;
import com.app.core.configuration.ConfigurationInitializer;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.validation.MethodValidationProxy;
import com.security.crypto.EncryptionTransformer;

class MessageRoutingEngine
extends ConfigurationInitializer {
    final EncryptionTransformer v;
    final HK Q;
    final String J;

    @Override
    public void P(MethodValidationProxy methodValidationProxy) throws ContextualExceptionHandler {
        block4: {
            try {
                try {
                    if (!methodValidationProxy.g().equals(this.Q.B()) || !methodValidationProxy.t().equals(this.Q.G())) break block4;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw MessageRoutingEngine.a(contextualExceptionHandler);
                }
                methodValidationProxy.N(this.J);
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw MessageRoutingEngine.a(contextualExceptionHandler);
            }
        }
    }

    MessageRoutingEngine(EncryptionTransformer encryptionTransformer, HK hK, String string) {
        this.v = encryptionTransformer;
        this.Q = hK;
        this.J = string;
    }

    private static ContextualExceptionHandler a(ContextualExceptionHandler contextualExceptionHandler) {
        return contextualExceptionHandler;
    }
}

