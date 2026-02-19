/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.codec;

import com.compute.hybrid.HybridComputationOrchestrator;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import java.awt.Point;

class MessageCodec
implements DataProcessingProtocol {
    final HybridComputationOrchestrator P;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    MessageCodec(HybridComputationOrchestrator hybridComputationOrchestrator) {
        this.P = hybridComputationOrchestrator;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (HybridComputationOrchestrator.g(this.P).C().T(point) || HybridComputationOrchestrator.M(this.P).C().T(point)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageCodec.a(customSystemException);
                }
                HybridComputationOrchestrator.Q(this.P);
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw MessageCodec.a(customSystemException);
            }
        }
        return DataProcessingProtocol.super.o(point);
    }
}

