/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.execution;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.security.crypto.CipherKeyGenerator1146;

class AsynchronousTaskExecutor2104
extends Thread {
    final CipherKeyGenerator1146 c;

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        ApplicationLifecycleManager.K().z(1.0f);
    }

    AsynchronousTaskExecutor2104(CipherKeyGenerator1146 cipherKeyGenerator1146) {
        this.c = cipherKeyGenerator1146;
    }
}

