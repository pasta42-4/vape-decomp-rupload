/*
 * Decompiled with CFR 0.152.
 */
package com.app.transactions;

import com.concurrency.async.AsyncOperationMediator;
import com.network.connection.NetworkConnectionHandler1281;
import com.network.session.ConnectionStateTracker2569;

public class TransactionOrchestrator1544
extends ConnectionStateTracker2569 {
    public NetworkConnectionHandler1281 d() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.p(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public NetworkConnectionHandler1281 q() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.o(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public NetworkConnectionHandler1281 X() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.N(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public NetworkConnectionHandler1281 s() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.C(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public NetworkConnectionHandler1281 V() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.I(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public NetworkConnectionHandler1281 Z() {
        return new NetworkConnectionHandler1281(AsyncOperationMediator.M(TransactionOrchestrator1544.U.u().G, this.H));
    }

    public TransactionOrchestrator1544(Object object) {
        super(object);
    }
}

