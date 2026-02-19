/*
 * Decompiled with CFR 0.152.
 */
package com.app.cluster.management;

import a.fO;
import com.app.core.interfaces.OperationExecutionInterface;
import com.network.connection.ConnectionPoolOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class ClusterNodeRegistrar
implements OperationExecutionInterface {
    final ConnectionPoolOrchestrator M;

    @Override
    public void R() {
        GraphicalRenderingController.W(fO.class);
    }

    ClusterNodeRegistrar(ConnectionPoolOrchestrator connectionPoolOrchestrator) {
        this.M = connectionPoolOrchestrator;
    }
}

