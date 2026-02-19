/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.KB;
import com.communication.protocol.DataExchangeProtocol2090;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.NetworkProtocolDecoder;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class DataTransformationHandler1402
implements NetworkConfigurationResolver2717 {
    private GraphicalRenderingController n;

    @DataExchangeProtocol2090
    public void x(KB kB) {
        GraphicalRenderingController graphicalRenderingController = this.P();
        try {
            if (graphicalRenderingController == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1402.a(customSystemException);
        }
        graphicalRenderingController.W(kB);
    }

    @DataExchangeProtocol2090
    public void Q(EventTriggerEngine eventTriggerEngine) {
        GraphicalRenderingController graphicalRenderingController = this.P();
        try {
            if (graphicalRenderingController == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1402.a(customSystemException);
        }
        try {
            NetworkProtocolDecoder.B.W(eventTriggerEngine);
            if (!this.n.P) {
                GraphicsBufferAllocator.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1402.a(customSystemException);
        }
        graphicalRenderingController.B(eventTriggerEngine);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private GraphicalRenderingController P() {
        try {
            if (this.n == null) {
                this.n = TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1402.a(customSystemException);
        }
        return this.n;
    }
}

