/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.stream.processing.StreamProcessingOrchestrator372;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.management.WorkflowStateController;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

class EventFilterProcessor
implements DataProcessingProtocol {
    final AtomicBoolean l;
    final StreamProcessingOrchestrator372 F;
    final Consumer i;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        for (WorkflowStateController workflowStateController : StreamProcessingOrchestrator372.B(this.F)) {
            block5: {
                try {
                    try {
                        if (!workflowStateController.s()) continue;
                        if (!this.l.get()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventFilterProcessor.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventFilterProcessor.a(customSystemException);
                }
            }
            this.l.set(true);
            GraphicalRenderingController.st.execute(() -> this.lambda$onClick$0(workflowStateController, this.i, this.l));
            return;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    EventFilterProcessor(StreamProcessingOrchestrator372 streamProcessingOrchestrator372, AtomicBoolean atomicBoolean, Consumer consumer) {
        this.F = streamProcessingOrchestrator372;
        this.l = atomicBoolean;
        this.i = consumer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lambda$onClick$0(WorkflowStateController workflowStateController, Consumer consumer, AtomicBoolean atomicBoolean) {
        try {
            this.F.i(workflowStateController);
            consumer.accept(workflowStateController);
        }
        finally {
            atomicBoolean.set(false);
        }
    }
}

