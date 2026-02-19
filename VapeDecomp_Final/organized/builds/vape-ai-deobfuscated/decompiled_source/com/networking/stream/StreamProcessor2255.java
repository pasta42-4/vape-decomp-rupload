/*
 * Decompiled with CFR 0.152.
 */
package com.networking.stream;

import com.app.transaction.validation.TransactionValidator2437;
import com.concurrency.synchronization.ThreadSynchronizationManager;
import com.game.configuration.GameVersionEnumerator;
import com.security.token.SecureTokenGenerator839;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamProcessor2255
extends ObjectLifecycleTracker {
    public StreamProcessor2255(Object object) {
        super(object);
    }

    public static ThreadSynchronizationManager Z(int n, int n2) {
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            TransactionValidator2437 transactionValidator2437 = TransactionValidator2437.a(n, n2, 0);
            return new ThreadSynchronizationManager(SecureTokenGenerator839.v(StreamProcessor2255.U.u().kC, transactionValidator2437.M()));
        }
        return new ThreadSynchronizationManager(SecureTokenGenerator839.m(StreamProcessor2255.U.u().kC, n, n2));
    }
}

