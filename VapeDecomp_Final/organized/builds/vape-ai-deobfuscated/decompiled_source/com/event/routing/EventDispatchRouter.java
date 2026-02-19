/*
 * Decompiled with CFR 0.152.
 */
package com.event.routing;

import a.fG;
import com.app.core.interfaces.OperationExecutionInterface;
import com.network.protocol.NetworkProtocolEncoder220;
import com.network.protocol.NetworkProtocolInterceptor;
import com.numeric.transform.NumericTransformationEngine469;
import com.ui.rendering.GraphicalRenderingController;

class EventDispatchRouter
implements OperationExecutionInterface {
    final NumericTransformationEngine469 N;

    EventDispatchRouter(NumericTransformationEngine469 numericTransformationEngine469) {
        this.N = numericTransformationEngine469;
    }

    @Override
    public void R() {
        GraphicalRenderingController.D(NetworkProtocolEncoder220.class).O();
        GraphicalRenderingController.W(NetworkProtocolInterceptor.class);
        NetworkProtocolInterceptor.Jl = false;
        GraphicalRenderingController.D(fG.class).N(false);
    }
}

