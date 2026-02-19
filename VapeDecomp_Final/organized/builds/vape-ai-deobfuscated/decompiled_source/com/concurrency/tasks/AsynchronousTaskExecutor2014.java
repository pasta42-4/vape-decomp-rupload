/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.app.concurrency.ThreadSynchronizer;
import com.app.signal.SignalBroadcaster;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;

public class AsynchronousTaskExecutor2014
extends ThreadSynchronizer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void call() {
        try {
            if (Thread.currentThread().equals(EventBroadcastCoordinator.W.R())) {
                new SignalBroadcaster().fire();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskExecutor2014.a(customSystemException);
        }
    }
}

