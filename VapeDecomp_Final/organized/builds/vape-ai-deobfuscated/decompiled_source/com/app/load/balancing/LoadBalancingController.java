/*
 * Decompiled with CFR 0.152.
 */
package com.app.load.balancing;

import com.app.core.interfaces.OperationExecutionInterface;
import com.crypto.stream.CipherStreamProcessor327;
import com.temporal.metadata.TemporalMetadataResolver;
import com.validation.core.ObjectReferenceValidator;

class LoadBalancingController
implements OperationExecutionInterface {
    final CipherStreamProcessor327 u;

    LoadBalancingController(CipherStreamProcessor327 cipherStreamProcessor327) {
        this.u = cipherStreamProcessor327;
    }

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().j(ObjectReferenceValidator.COMPLETED_ALL);
    }
}

