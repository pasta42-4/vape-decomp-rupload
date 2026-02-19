/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.management;

import com.network.connection.NetworkConnectionManager1945;
import com.security.transform.CryptoTransformationEngine786;
import com.system.lifecycle.ObjectLifecycleTracker;

public class AsyncOperationOrchestrator
extends ObjectLifecycleTracker {
    public AsyncOperationOrchestrator(Object object) {
        super(object);
    }

    public NetworkConnectionManager1945 o() {
        return new NetworkConnectionManager1945(CryptoTransformationEngine786.Q(AsyncOperationOrchestrator.U.u().kY, this.H));
    }
}

