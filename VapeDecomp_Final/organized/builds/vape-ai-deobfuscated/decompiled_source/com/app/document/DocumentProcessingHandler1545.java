/*
 * Decompiled with CFR 0.152.
 */
package com.app.document;

import a.Qm;
import com.app.error.handling.ErrorHandlingMechanism;
import com.context.mapping.AdaptiveContextMapper;
import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.transaction.management.TransactionOrchestrator1017;

public class DocumentProcessingHandler1545
extends ObjectLifecycleTracker {
    public LightweightExecutionContext J() {
        return new LightweightExecutionContext(DocumentProcessingHandler1545.U.u().dg.T(this.H));
    }

    public void Y(Qm qm2) {
        AdaptiveContextMapper.F(DocumentProcessingHandler1545.U.u().dg, this.H, qm2.M());
    }

    public void c(TransactionOrchestrator1017 transactionOrchestrator1017, LightweightExecutionContext lightweightExecutionContext, ErrorHandlingMechanism errorHandlingMechanism) {
        DocumentProcessingHandler1545.U.u().dg.c(this.H, transactionOrchestrator1017.M(), lightweightExecutionContext.M(), errorHandlingMechanism.M());
    }

    public DocumentProcessingHandler1545(Object object) {
        super(object);
    }

    public float B() {
        return DocumentProcessingHandler1545.U.u().dg.M(this.H);
    }

    public float n() {
        return DocumentProcessingHandler1545.U.u().dg.l(this.H);
    }
}

