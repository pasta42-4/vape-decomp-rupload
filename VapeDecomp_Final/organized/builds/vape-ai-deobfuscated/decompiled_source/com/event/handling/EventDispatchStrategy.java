/*
 * Decompiled with CFR 0.152.
 */
package com.event.handling;

import com.configuration.management.ConfigurationParameterController;
import com.data.mapping.IntegerMappingRegistry;
import com.data.protocol.DataProcessingProtocol;
import com.event.processing.EventOrchestrationEngine;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class EventDispatchStrategy
implements DataProcessingProtocol {
    final ConfigurationParameterController Y;
    final EventOrchestrationEngine l;

    private void lambda$onClick$0(ConfigurationParameterController configurationParameterController) {
        EventOrchestrationEngine.K(this.l, IntegerMappingRegistry.T(configurationParameterController));
        EventOrchestrationEngine.j(this.l).remove(configurationParameterController.Z());
        this.l.R();
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        GraphicalRenderingController.st.execute(() -> this.lambda$onClick$0(this.Y));
    }

    EventDispatchStrategy(EventOrchestrationEngine eventOrchestrationEngine, ConfigurationParameterController configurationParameterController) {
        this.l = eventOrchestrationEngine;
        this.Y = configurationParameterController;
    }
}

