/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.core;

import com.concurrency.tasks.AsyncTaskProcessor;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionProcessor1655
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AsyncTaskProcessor A() {
        return new AsyncTaskProcessor(TransactionProcessor1655.U.u().d.L(this.H));
    }

    public NetworkConnectionManager1945 I() {
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                return this.A().S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor1655.a(customSystemException);
        }
        return new NetworkConnectionManager1945(TransactionProcessor1655.U.u().d.W(this.H));
    }

    public TransactionProcessor1655(Object object) {
        super(object);
    }
}

