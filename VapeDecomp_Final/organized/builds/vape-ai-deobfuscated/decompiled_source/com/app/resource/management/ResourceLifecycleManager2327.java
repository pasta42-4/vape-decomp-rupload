/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.concurrent.resource.ThreadSafeResourceCoordinator;

class ResourceLifecycleManager2327
implements OperationExecutionInterface {
    final ThreadSafeResourceCoordinator j;

    @Override
    public void R() {
        ThreadSafeResourceCoordinator.z(this.j);
    }

    ResourceLifecycleManager2327(ThreadSafeResourceCoordinator threadSafeResourceCoordinator) {
        this.j = threadSafeResourceCoordinator;
    }
}

