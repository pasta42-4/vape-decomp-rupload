/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.auth;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.EncryptionKeyGenerator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class AuthenticationDelegate2186
implements OperationExecutionInterface {
    final EncryptionKeyGenerator f;

    @Override
    public void R() {
        TransactionLogOrchestrator transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
        transactionLogOrchestrator.m(this.f.G(), this.f.W());
        transactionLogOrchestrator.r(true, false);
    }

    AuthenticationDelegate2186(EncryptionKeyGenerator encryptionKeyGenerator) {
        this.f = encryptionKeyGenerator;
    }
}

