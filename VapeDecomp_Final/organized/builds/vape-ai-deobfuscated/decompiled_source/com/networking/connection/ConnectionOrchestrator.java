/*
 * Decompiled with CFR 0.152.
 */
package com.networking.connection;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.orchestration.ContextualDataOrchestrator;
import com.data.transformation.DataEncodingTransformer;

class ConnectionOrchestrator
implements OperationExecutionInterface {
    final DataEncodingTransformer b;
    final ContextualDataOrchestrator e;

    @Override
    public void R() {
        this.b.P();
    }

    ConnectionOrchestrator(ContextualDataOrchestrator contextualDataOrchestrator, DataEncodingTransformer dataEncodingTransformer) {
        this.e = contextualDataOrchestrator;
        this.b = dataEncodingTransformer;
    }
}

