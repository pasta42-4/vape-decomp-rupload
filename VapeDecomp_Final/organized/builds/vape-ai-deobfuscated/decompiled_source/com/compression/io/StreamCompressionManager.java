/*
 * Decompiled with CFR 0.152.
 */
package com.compression.io;

import com.app.core.interfaces.OperationExecutionInterface;
import com.concurrent.resource.ThreadSafeResourceCoordinator;

class StreamCompressionManager
implements OperationExecutionInterface {
    final ThreadSafeResourceCoordinator B;

    StreamCompressionManager(ThreadSafeResourceCoordinator threadSafeResourceCoordinator) {
        this.B = threadSafeResourceCoordinator;
    }

    @Override
    public void R() {
        ThreadSafeResourceCoordinator.z(this.B);
    }
}

