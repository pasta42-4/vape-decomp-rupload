/*
 * Decompiled with CFR 0.152.
 */
package com.app.system;

import a.HK;
import com.app.core.configuration.ConfigurationInitializer;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.validation.MethodValidationProxy;
import com.security.crypto.EncryptionTransformer;
import java.util.concurrent.atomic.AtomicInteger;

class SystemResourceAllocator1703
extends ConfigurationInitializer {
    final AtomicInteger n;
    final EncryptionTransformer Z;
    final HK Q;

    private static ContextualExceptionHandler a(ContextualExceptionHandler contextualExceptionHandler) {
        return contextualExceptionHandler;
    }

    SystemResourceAllocator1703(EncryptionTransformer encryptionTransformer, HK hK, AtomicInteger atomicInteger) {
        this.Z = encryptionTransformer;
        this.Q = hK;
        this.n = atomicInteger;
    }

    @Override
    public void P(MethodValidationProxy methodValidationProxy) throws ContextualExceptionHandler {
        block4: {
            try {
                try {
                    if (!methodValidationProxy.g().equals(this.Q.B()) || !methodValidationProxy.t().equals(this.Q.G())) break block4;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw SystemResourceAllocator1703.a(contextualExceptionHandler);
                }
                this.n.set(methodValidationProxy.H());
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw SystemResourceAllocator1703.a(contextualExceptionHandler);
            }
        }
    }
}

