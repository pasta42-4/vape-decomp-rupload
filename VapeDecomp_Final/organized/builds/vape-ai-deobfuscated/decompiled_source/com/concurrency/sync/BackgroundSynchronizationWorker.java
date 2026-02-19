/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.sync;

import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.concurrent.atomic.AtomicBoolean;

public class BackgroundSynchronizationWorker
implements Runnable {
    private final NetworkConfigManager h = new NetworkConfigManager();
    private final AtomicBoolean Q = new AtomicBoolean();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        while (true) {
            try {
                if (TemporalMetadataResolver.h.V()) break;
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw BackgroundSynchronizationWorker.a(customSystemException);
            }
            if (!this.Q.get()) continue;
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            TemporalMetadataResolver.h.u().G();
            this.Q.set(false);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void z() {
        this.Q.set(true);
    }
}

