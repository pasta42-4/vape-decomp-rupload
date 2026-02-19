/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.crypto;

import com.batch.processing.BatchWorker;
import com.core.lifecycle.ObjectLifecycleManager;

class BinaryKeyGenerator
extends BatchWorker {
    final ObjectLifecycleManager J;

    BinaryKeyGenerator(ObjectLifecycleManager objectLifecycleManager, int n) {
        this.J = objectLifecycleManager;
        super(n);
    }

    @Override
    public void G() {
    }
}

