/*
 * Decompiled with CFR 0.152.
 */
package com.app.processing;

import com.configuration.management.ConfigurationParameterController;
import com.data.mapping.IntegerMappingRegistry;
import com.data.protocol.DataProcessingProtocol;
import com.event.processing.EventOrchestrationEngine;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class DataTransformationHandler2167
implements DataProcessingProtocol {
    final ConfigurationParameterController n;
    final EventOrchestrationEngine Y;

    DataTransformationHandler2167(EventOrchestrationEngine eventOrchestrationEngine, ConfigurationParameterController configurationParameterController) {
        this.Y = eventOrchestrationEngine;
        this.n = configurationParameterController;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        EventOrchestrationEngine.K(this.Y, IntegerMappingRegistry.T(this.n));
    }
}

