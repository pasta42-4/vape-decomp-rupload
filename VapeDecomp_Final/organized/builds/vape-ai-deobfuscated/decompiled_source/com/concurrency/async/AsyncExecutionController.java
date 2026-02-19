/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.async;

import a.Kf;
import com.app.concurrency.ThreadSynchronizer;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;

public class AsyncExecutionController
extends ThreadSynchronizer {
    public static void call() {
        try {
            if (Thread.currentThread().equals(EventBroadcastCoordinator.W.R())) {
                new Kf().fire();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncExecutionController.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

