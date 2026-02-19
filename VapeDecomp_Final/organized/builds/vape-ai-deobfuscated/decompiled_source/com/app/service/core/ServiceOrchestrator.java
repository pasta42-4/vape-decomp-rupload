/*
 * Decompiled with CFR 0.152.
 */
package com.app.service.core;

import com.app.core.interfaces.OperationExecutionInterface;
import com.network.connection.NetworkConnectionOrchestrator1684;

class ServiceOrchestrator
implements OperationExecutionInterface {
    final NetworkConnectionOrchestrator1684 y;

    ServiceOrchestrator(NetworkConnectionOrchestrator1684 networkConnectionOrchestrator1684) {
        this.y = networkConnectionOrchestrator1684;
    }

    @Override
    public void R() {
        NetworkConnectionOrchestrator1684.n(this.y);
    }
}

