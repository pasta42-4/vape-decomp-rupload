/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.synchronization;

import com.integration.transformation.InteroperabilityTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ThreadSynchronizationManager
extends ObjectLifecycleTracker {
    public ThreadSynchronizationManager(Object object) {
        super(object);
    }

    public int r() {
        return InteroperabilityTransformer.b(ThreadSynchronizationManager.U.u().GG, this.H);
    }
}

