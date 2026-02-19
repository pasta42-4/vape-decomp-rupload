/*
 * Decompiled with CFR 0.152.
 */
package com.app.context;

import a.HK;
import com.app.core.configuration.ConfigurationInitializer;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.validation.MethodValidationProxy;
import com.security.crypto.EncryptionTransformer;

class GenericContextResolver
extends ConfigurationInitializer {
    final HK p;
    final String u;
    final EncryptionTransformer N;

    GenericContextResolver(EncryptionTransformer encryptionTransformer, HK hK, String string) {
        this.N = encryptionTransformer;
        this.p = hK;
        this.u = string;
    }

    @Override
    public void P(MethodValidationProxy methodValidationProxy) throws ContextualExceptionHandler {
        block4: {
            try {
                try {
                    if (!methodValidationProxy.g().equals(this.p.B()) || !methodValidationProxy.t().equals(this.p.G())) break block4;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw GenericContextResolver.a(contextualExceptionHandler);
                }
                methodValidationProxy.N(this.u);
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw GenericContextResolver.a(contextualExceptionHandler);
            }
        }
    }

    private static ContextualExceptionHandler a(ContextualExceptionHandler contextualExceptionHandler) {
        return contextualExceptionHandler;
    }
}

