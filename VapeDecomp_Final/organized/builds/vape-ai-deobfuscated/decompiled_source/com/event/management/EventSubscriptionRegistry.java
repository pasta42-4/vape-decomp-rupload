/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import a.Qh;
import com.app.transactions.TransactionOrchestrator1544;
import com.crypto.token.CryptoTokenExchangeManager;
import com.financial.transaction.TransactionGateway;
import com.state.management.StateTransitionManager;

public class EventSubscriptionRegistry
extends TransactionGateway<Qh> {
    public EventSubscriptionRegistry(Object object) {
        super(object);
    }

    public TransactionOrchestrator1544 u() {
        return new TransactionOrchestrator1544(CryptoTokenExchangeManager.b(EventSubscriptionRegistry.U.u().L5, this.H));
    }

    public StateTransitionManager f() {
        return new StateTransitionManager(CryptoTokenExchangeManager.b(EventSubscriptionRegistry.U.u().L5, this.H));
    }
}

