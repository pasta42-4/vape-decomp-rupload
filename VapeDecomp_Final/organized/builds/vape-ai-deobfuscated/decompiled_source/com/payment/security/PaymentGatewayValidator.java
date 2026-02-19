/*
 * Decompiled with CFR 0.152.
 */
package com.payment.security;

import com.app.core.interfaces.OperationExecutionInterface;
import com.resource.management.ResourceAllocationTracker127;

class PaymentGatewayValidator
implements OperationExecutionInterface {
    final ResourceAllocationTracker127 Y;

    PaymentGatewayValidator(ResourceAllocationTracker127 resourceAllocationTracker127) {
        this.Y = resourceAllocationTracker127;
    }

    @Override
    public void R() {
        ResourceAllocationTracker127.j(this.Y);
    }
}

