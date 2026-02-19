/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.EncryptionKeyGenerator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class AuthenticationMediator2179
implements OperationExecutionInterface {
    final EncryptionKeyGenerator G;

    @Override
    public void R() {
        TransactionLogOrchestrator transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
        transactionLogOrchestrator.m(this.G.G(), this.G.W());
        transactionLogOrchestrator.r(true, false);
        this.G.r(false, false);
    }

    AuthenticationMediator2179(EncryptionKeyGenerator encryptionKeyGenerator) {
        this.G = encryptionKeyGenerator;
    }
}

