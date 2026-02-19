/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.pool;

import com.app.core.interfaces.OperationExecutionInterface;
import com.protocol.adapter.ProtocolAdapterManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.validation.core.ObjectReferenceValidator;

class ConnectionPoolManager2202
implements OperationExecutionInterface {
    final ProtocolAdapterManager p;

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().j(ObjectReferenceValidator.FINISHED);
    }

    ConnectionPoolManager2202(ProtocolAdapterManager protocolAdapterManager) {
        this.p = protocolAdapterManager;
    }
}

