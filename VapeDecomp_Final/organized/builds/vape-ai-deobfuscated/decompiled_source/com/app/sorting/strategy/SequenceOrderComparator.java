/*
 * Decompiled with CFR 0.152.
 */
package com.app.sorting.strategy;

import com.data.serialization.JsonPayloadOrchestrator;
import com.security.crypto.CryptographicSecurityManager;
import java.util.Comparator;

class SequenceOrderComparator
implements Comparator<CryptographicSecurityManager> {
    final JsonPayloadOrchestrator W;

    public int f(CryptographicSecurityManager cryptographicSecurityManager, CryptographicSecurityManager cryptographicSecurityManager2) {
        return Integer.compare(cryptographicSecurityManager2.b(), cryptographicSecurityManager.b());
    }

    SequenceOrderComparator(JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        this.W = jsonPayloadOrchestrator;
    }
}

