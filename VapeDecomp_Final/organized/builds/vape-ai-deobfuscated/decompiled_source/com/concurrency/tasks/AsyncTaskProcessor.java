/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.network.connection.NetworkConnectionManager1945;
import com.security.crypto.CryptoSecurityManager907;
import com.system.lifecycle.ObjectLifecycleTracker;

public class AsyncTaskProcessor
extends ObjectLifecycleTracker {
    public NetworkConnectionManager1945 S() {
        return new NetworkConnectionManager1945(CryptoSecurityManager907.o(AsyncTaskProcessor.U.u().gp, this.H));
    }

    public AsyncTaskProcessor(Object object) {
        super(object);
    }
}

