/*
 * Decompiled with CFR 0.152.
 */
package com.network.socket;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.reflection.ReflectionContextManager;
import com.ui.rendering.GraphicalRenderingController;

class SocketCommunicationHandler
implements OperationExecutionInterface {
    final ReflectionContextManager v;

    @Override
    public void R() {
        GraphicalRenderingController.z(ReflectionContextManager.f(this.v));
        ReflectionContextManager.J(this.v, null);
        ReflectionContextManager.K(this.v, null);
    }

    SocketCommunicationHandler(ReflectionContextManager reflectionContextManager) {
        this.v = reflectionContextManager;
    }
}

