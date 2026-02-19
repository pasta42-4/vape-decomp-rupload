/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import com.app.core.interfaces.OperationExecutionInterface;
import com.network.protocol.NetworkProtocolResolver;

class EventDispatchService
implements OperationExecutionInterface {
    final NetworkProtocolResolver P;

    EventDispatchService(NetworkProtocolResolver networkProtocolResolver) {
        this.P = networkProtocolResolver;
    }

    @Override
    public void R() {
        this.P.F();
    }
}

