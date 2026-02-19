/*
 * Decompiled with CFR 0.152.
 */
package com.app.batch.processing;

import com.app.core.interfaces.OperationExecutionInterface;
import com.crypto.context.CipherContextFactory;
import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class BatchProcessingCoordinator
implements DataProcessingProtocol {
    final CipherContextFactory H;
    final OperationExecutionInterface y;

    BatchProcessingCoordinator(CipherContextFactory cipherContextFactory, OperationExecutionInterface operationExecutionInterface) {
        this.H = cipherContextFactory;
        this.y = operationExecutionInterface;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.y.R();
    }
}

