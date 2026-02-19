/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrent;

import com.data.processing.CollectionFilterProcessor;
import java.util.concurrent.CopyOnWriteArrayList;

class ThreadSafeIntegerQueue
extends CopyOnWriteArrayList<Integer> {
    final CollectionFilterProcessor d;

    public boolean R(Integer n) {
        return super.add(n);
    }

    ThreadSafeIntegerQueue(CollectionFilterProcessor collectionFilterProcessor) {
        this.d = collectionFilterProcessor;
    }
}

