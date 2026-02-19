/*
 * Decompiled with CFR 0.152.
 */
package a;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class sc
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

