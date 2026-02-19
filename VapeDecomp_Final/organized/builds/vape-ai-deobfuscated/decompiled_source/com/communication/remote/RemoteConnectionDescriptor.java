/*
 * Decompiled with CFR 0.152.
 */
package com.communication.remote;

import com.data.processing.MultiOperationProcessor;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.network.messaging.TransmissionPayload;
import com.system.compilation.CompilationDiagnosticException;

public class RemoteConnectionDescriptor
extends TransmissionPayload {
    protected DeclarativeEventOrchestrator r;
    private static final long serialVersionUID = 1L;

    public RemoteConnectionDescriptor(String string, DeclarativeEventOrchestrator declarativeEventOrchestrator) {
        super(string);
        this.r = declarativeEventOrchestrator;
    }

    public DeclarativeEventOrchestrator K() {
        return this.r;
    }

    @Override
    public String toString() {
        return this.e + ":" + this.r.S();
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.G(this);
    }
}

