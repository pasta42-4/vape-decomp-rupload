/*
 * Decompiled with CFR 0.152.
 */
package com.security.cryptography;

import com.concurrency.execution.HybridExecutionCoordinator;
import com.security.cryptography.SecurePayloadManager;
import com.ui.events.UserInteractionEventDispatcher;

class CipherKeyGenerator2379
extends SecurePayloadManager {
    final HybridExecutionCoordinator rk;

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        HybridExecutionCoordinator.X(this.rk, true);
        super.Z(userInteractionEventDispatcher);
    }

    CipherKeyGenerator2379(HybridExecutionCoordinator hybridExecutionCoordinator, String string, Runnable runnable, double d2, double d3, boolean bl, boolean bl2) {
        this.rk = hybridExecutionCoordinator;
        super(string, runnable, d2, d3, bl, bl2);
    }
}

