/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.core.interfaces.OperationExecutionInterface;
import com.resource.management.ResourceAllocationTracker127;

class AbstractProtocolHandler
implements OperationExecutionInterface {
    final ResourceAllocationTracker127 K;

    @Override
    public void R() {
        ResourceAllocationTracker127.j(this.K);
    }

    AbstractProtocolHandler(ResourceAllocationTracker127 resourceAllocationTracker127) {
        this.K = resourceAllocationTracker127;
    }
}

