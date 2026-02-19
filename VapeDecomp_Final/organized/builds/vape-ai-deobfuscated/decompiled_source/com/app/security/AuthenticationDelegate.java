/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import com.system.resource.ComputationalResourceAllocator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class AuthenticationDelegate
implements OperationExecutionInterface {
    final ComputationalResourceAllocator I;

    AuthenticationDelegate(ComputationalResourceAllocator computationalResourceAllocator) {
        this.I = computationalResourceAllocator;
    }

    @Override
    public void R() {
        boolean bl;
        EncryptionKeyGenerator encryptionKeyGenerator;
        TransactionLogOrchestrator transactionLogOrchestrator;
        EncryptionKeyGenerator encryptionKeyGenerator2;
        block9: {
            encryptionKeyGenerator2 = GraphicalRenderingController.D(EncryptionKeyGenerator.class);
            transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
            try {
                try {
                    if (encryptionKeyGenerator2 != null && transactionLogOrchestrator != null) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationDelegate.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationDelegate.a(customSystemException);
            }
        }
        try {
            encryptionKeyGenerator = encryptionKeyGenerator2;
            bl = !encryptionKeyGenerator2.f();
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationDelegate.a(customSystemException);
        }
        try {
            encryptionKeyGenerator.r(bl, false);
            if (encryptionKeyGenerator2.f()) {
                encryptionKeyGenerator2.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationDelegate.a(customSystemException);
        }
        encryptionKeyGenerator2.b(transactionLogOrchestrator.G());
        encryptionKeyGenerator2.M(transactionLogOrchestrator.W());
        encryptionKeyGenerator2.A();
        ((NumericTransformationEngine)encryptionKeyGenerator2).d();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

