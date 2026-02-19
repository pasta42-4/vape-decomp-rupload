/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.app.core.interfaces.OperationExecutionInterface;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

public class ReflectionMetadataResolver1754
implements OperationExecutionInterface {
    final TransactionLogOrchestrator q;
    private final Class v;

    public Class G() {
        return this.v;
    }

    public ReflectionMetadataResolver1754(TransactionLogOrchestrator transactionLogOrchestrator, Class clazz) {
        this.q = transactionLogOrchestrator;
        this.v = clazz;
    }

    @Override
    public void R() {
        GraphicalRenderingController.W(this.v);
    }
}

