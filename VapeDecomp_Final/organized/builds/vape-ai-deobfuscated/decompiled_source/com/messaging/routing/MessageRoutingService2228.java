/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.allocation.SecureResourceAllocator;

class MessageRoutingService2228
implements OperationExecutionInterface {
    final SecureResourceAllocator A;

    @Override
    public void R() {
        this.A.P();
    }

    MessageRoutingService2228(SecureResourceAllocator secureResourceAllocator) {
        this.A = secureResourceAllocator;
    }
}

