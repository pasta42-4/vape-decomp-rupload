/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import com.concurrency.management.AsynchronousTaskCoordinator826;
import com.financial.transactions.TransactionValidator1679;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamEncryptionHandler
extends ObjectLifecycleTracker {
    public TransactionValidator1679 e() {
        return new TransactionValidator1679(AsynchronousTaskCoordinator826.T(StreamEncryptionHandler.U.u().Lu, this.H));
    }

    public StreamEncryptionHandler(Object object) {
        super(object);
    }
}

