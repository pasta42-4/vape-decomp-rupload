/*
 * Decompiled with CFR 0.152.
 */
package com.networking.protocol;

import com.app.core.interfaces.OperationExecutionInterface;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.mediation.RuntimeContextMediator;

class ProtocolNegotiator
implements OperationExecutionInterface {
    final RuntimeContextMediator o;

    ProtocolNegotiator(RuntimeContextMediator runtimeContextMediator) {
        this.o = runtimeContextMediator;
    }

    @Override
    public void R() {
        RuntimeContextMediator.z(this.o, false);
        ((ContextualExecutionFramework)this.o.t()).T(false);
        this.o.N(false);
    }
}

