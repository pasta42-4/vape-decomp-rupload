/*
 * Decompiled with CFR 0.152.
 */
package com.financial.processing;

import com.financial.processing.TransactionCorrelationEngine;
import com.network.protocol.ProtocolInteractionController;

public class PaymentExecutionHandler
extends ProtocolInteractionController {
    public TransactionCorrelationEngine u() {
        return new TransactionCorrelationEngine(PaymentExecutionHandler.U.u().Gj.D(this.H));
    }

    public PaymentExecutionHandler(Object object) {
        super(object);
    }
}

