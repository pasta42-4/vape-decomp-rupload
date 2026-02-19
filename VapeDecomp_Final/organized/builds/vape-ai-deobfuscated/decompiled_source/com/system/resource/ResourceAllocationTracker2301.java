/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.core.interfaces.OperationExecutionInterface;
import com.resource.management.ResourceAllocationTracker127;

class ResourceAllocationTracker2301
implements OperationExecutionInterface {
    final ResourceAllocationTracker127 l;

    ResourceAllocationTracker2301(ResourceAllocationTracker127 resourceAllocationTracker127) {
        this.l = resourceAllocationTracker127;
    }

    @Override
    public void R() {
        ResourceAllocationTracker127.J(this.l);
    }
}

