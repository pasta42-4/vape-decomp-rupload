/*
 * Decompiled with CFR 0.152.
 */
package com.network.core;

import com.data.transformation.DataTransformationAgent;
import com.exception.system.CustomSystemException;
import com.simulation.core.ModelSimulationEngine;
import com.system.configuration.SystemConfigurationOrchestrator;

class NetworkConnectionManager1925
extends DataTransformationAgent {
    final ModelSimulationEngine P;

    NetworkConnectionManager1925(ModelSimulationEngine modelSimulationEngine, SystemConfigurationOrchestrator systemConfigurationOrchestrator, float f, float f2) {
        this.P = modelSimulationEngine;
        super(systemConfigurationOrchestrator, f, f2);
    }

    @Override
    public void X(boolean bl) {
        block3: {
            try {
                super.X(bl);
                if (!bl) break block3;
                if (ModelSimulationEngine.U(this.P).b(this.P)) {
                    // empty if block
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkConnectionManager1925.b(customSystemException);
            }
            ModelSimulationEngine.r(this.P, -999.0);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

