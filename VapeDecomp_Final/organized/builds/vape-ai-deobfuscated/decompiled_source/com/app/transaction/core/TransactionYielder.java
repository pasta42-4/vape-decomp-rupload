/*
 * Decompiled with CFR 0.152.
 */
package com.app.transaction.core;

import com.concurrency.tasks.AsyncTaskCoordinator;
import com.data.compression.DataCompressionManager;
import com.data.filtering.StreamFilterManager;

public class TransactionYielder
extends StreamFilterManager {
    public AsyncTaskCoordinator S(DataCompressionManager dataCompressionManager) {
        return new AsyncTaskCoordinator(TransactionYielder.U.u().GE.a(this.M(), dataCompressionManager.M()));
    }

    public TransactionYielder(Object object) {
        super(object);
    }
}

