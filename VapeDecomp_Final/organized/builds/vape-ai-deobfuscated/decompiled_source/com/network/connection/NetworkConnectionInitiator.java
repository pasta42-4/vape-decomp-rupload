/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.financial.processing.TransactionCorrelationEngine;
import com.network.core.NetworkConnectionOrchestrator;

public class NetworkConnectionInitiator
extends NetworkConnectionOrchestrator {
    public NetworkConnectionInitiator(Object object) {
        super(object);
    }

    public boolean m(TransactionCorrelationEngine transactionCorrelationEngine) {
        return this.I().equals(transactionCorrelationEngine);
    }
}

