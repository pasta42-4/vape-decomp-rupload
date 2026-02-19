/*
 * Decompiled with CFR 0.152.
 */
package com.caching.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;

class CacheInvalidationHandler2293
implements OperationExecutionInterface {
    final ResourceLifecycleOrchestrator q;

    CacheInvalidationHandler2293(ResourceLifecycleOrchestrator resourceLifecycleOrchestrator) {
        this.q = resourceLifecycleOrchestrator;
    }

    @Override
    public void R() {
        ResourceLifecycleOrchestrator.J(this.q, 3);
    }
}

