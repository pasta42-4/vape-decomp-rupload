/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.reflection.ReflectionContextManager;

class CommunicationProtocolAdapter2306
implements OperationExecutionInterface {
    final ReflectionContextManager o;

    @Override
    public void R() {
        ReflectionContextManager.C(this.o);
    }

    CommunicationProtocolAdapter2306(ReflectionContextManager reflectionContextManager) {
        this.o = reflectionContextManager;
    }
}

