/*
 * Decompiled with CFR 0.152.
 */
package com.app.workflow.coordination;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.crypto.CryptographicKeyManager426;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class WorkflowOrchestrator2270
implements OperationExecutionInterface {
    final CryptographicKeyManager426 n;

    WorkflowOrchestrator2270(CryptographicKeyManager426 cryptographicKeyManager426) {
        this.n = cryptographicKeyManager426;
    }

    @Override
    public void R() {
        GraphicalRenderingController.a(TransactionLogOrchestrator.class, false);
    }
}

