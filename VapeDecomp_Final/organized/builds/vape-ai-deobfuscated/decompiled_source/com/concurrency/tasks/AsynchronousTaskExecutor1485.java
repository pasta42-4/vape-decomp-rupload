/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.concurrency.execution.AsynchronousTaskExecutor;
import com.data.processing.CollectionFilterProcessor;
import com.exception.system.CustomSystemException;

public abstract class AsynchronousTaskExecutor1485
implements Runnable {
    private CollectionFilterProcessor N;
    private AsynchronousTaskExecutor i;

    @Override
    public void run() {
        try {
            if (this.i == null) {
                this.i = new AsynchronousTaskExecutor(this, null);
                this.i.start();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskExecutor1485.a(customSystemException);
        }
    }

    public void H(CollectionFilterProcessor collectionFilterProcessor) {
        this.N = collectionFilterProcessor;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public abstract void d();

    static CollectionFilterProcessor P(AsynchronousTaskExecutor1485 asynchronousTaskExecutor1485) {
        return asynchronousTaskExecutor1485.N;
    }

    public boolean F() {
        boolean bl;
        try {
            bl = this.i != null;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskExecutor1485.a(customSystemException);
        }
        return bl;
    }

    public AsynchronousTaskExecutor1485(CollectionFilterProcessor collectionFilterProcessor) {
        this.N = collectionFilterProcessor;
    }

    public final void o() {
        this.i = null;
        this.d();
    }
}

