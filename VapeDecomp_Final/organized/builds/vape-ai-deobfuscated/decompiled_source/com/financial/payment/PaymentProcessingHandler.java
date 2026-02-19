/*
 * Decompiled with CFR 0.152.
 */
package com.financial.payment;

import a.UU;
import com.network.core.NetworkConnectionManager2538;
import com.runtime.context.LightweightExecutionContext;

public class PaymentProcessingHandler
extends NetworkConnectionManager2538 {
    public PaymentProcessingHandler(Object object) {
        super(object);
    }

    public LightweightExecutionContext a() {
        return new LightweightExecutionContext(UU.a(PaymentProcessingHandler.U.u().L, this.M()));
    }
}

