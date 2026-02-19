/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.core.computation.AbstractComputationKernel;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.session.CipherSessionManager;
import java.awt.Point;

class AuthenticationStrategy
implements DataProcessingProtocol {
    final CipherSessionManager h;
    final AbstractComputationKernel W;
    final CipherSessionManager A;

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.A.C().T(point) || this.h.C().T(point)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationStrategy.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationStrategy.a(customSystemException);
            }
        }
        return DataProcessingProtocol.super.o(point);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    AuthenticationStrategy(AbstractComputationKernel abstractComputationKernel, CipherSessionManager cipherSessionManager, CipherSessionManager cipherSessionManager2) {
        this.W = abstractComputationKernel;
        this.A = cipherSessionManager;
        this.h = cipherSessionManager2;
    }
}

