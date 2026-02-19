/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.synchronization;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSynchronizationLock
extends ReentrantReadWriteLock {
    public void Q() {
        this.readLock().unlock();
    }

    public void o() {
        this.writeLock().lock();
    }

    public void V() {
        this.readLock().lock();
    }

    public void j() {
        this.writeLock().unlock();
    }
}

