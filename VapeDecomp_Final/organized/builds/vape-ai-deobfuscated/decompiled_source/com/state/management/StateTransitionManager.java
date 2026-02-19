/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import com.app.transactions.TransactionOrchestrator1544;
import com.network.connection.NetworkConnectionHandler1281;

public class StateTransitionManager
extends TransactionOrchestrator1544 {
    public NetworkConnectionHandler1281 U() {
        return new NetworkConnectionHandler1281(StateTransitionManager.U.u().dE.V(this.H));
    }

    public NetworkConnectionHandler1281 F() {
        return new NetworkConnectionHandler1281(StateTransitionManager.U.u().dE.B(this.H));
    }

    public StateTransitionManager(Object object) {
        super(object);
    }

    public NetworkConnectionHandler1281 N() {
        return new NetworkConnectionHandler1281(StateTransitionManager.U.u().dE.x(this.H));
    }

    @Override
    public NetworkConnectionHandler1281 M() {
        return new NetworkConnectionHandler1281(StateTransitionManager.U.u().dE.k(this.H));
    }

    public NetworkConnectionHandler1281 a() {
        return new NetworkConnectionHandler1281(StateTransitionManager.U.u().dE.s(this.H));
    }
}

