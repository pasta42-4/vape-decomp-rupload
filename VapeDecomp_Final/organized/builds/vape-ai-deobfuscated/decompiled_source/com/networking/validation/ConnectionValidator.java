/*
 * Decompiled with CFR 0.152.
 */
package com.networking.validation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.network.connection.NetworkConnectionOrchestrator1684;

class ConnectionValidator
implements OperationExecutionInterface {
    final NetworkConnectionOrchestrator1684 Y;

    @Override
    public void R() {
        NetworkConnectionOrchestrator1684.I(this.Y);
    }

    ConnectionValidator(NetworkConnectionOrchestrator1684 networkConnectionOrchestrator1684) {
        this.Y = networkConnectionOrchestrator1684;
    }
}

