/*
 * Decompiled with CFR 0.152.
 */
package com.networking.protocol;

import com.app.core.interfaces.OperationExecutionInterface;
import com.event.management.EventDispatchCoordinator511;
import com.game.core.GameStateController;

class NetworkConnectionHandler2244
implements OperationExecutionInterface {
    final GameStateController U;
    final EventDispatchCoordinator511 Q;

    @Override
    public void R() {
        this.U.g(false);
    }

    NetworkConnectionHandler2244(EventDispatchCoordinator511 eventDispatchCoordinator511, GameStateController gameStateController) {
        this.Q = eventDispatchCoordinator511;
        this.U = gameStateController;
    }
}

