/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.protocol;

import com.app.context.transformation.ContextTransformationEngine;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.orchestration.NumericTransformationOrchestrator;
import com.physics.simulation.PhysicsPositionTracker;
import com.runtime.context.ContextualExecutionFramework;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;

public class ProtocolAdapterResolver
extends ContextTransformationEngine<NumericTransformationOrchestrator> {
    private final NumericTransformationOrchestrator O = (NumericTransformationOrchestrator)this.n();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void R(PhysicsPositionTracker physicsPositionTracker) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block8: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.F()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ProtocolAdapterResolver.a(customSystemException);
            }
            try {
                try {
                    if (systemConfigurationOrchestrator.u() == 0.0f && systemConfigurationOrchestrator.w() == 0.0f) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ProtocolAdapterResolver.a(customSystemException);
                }
                if (!systemConfigurationOrchestrator.D()) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw ProtocolAdapterResolver.a(customSystemException);
            }
            double d2 = 0.42f;
            if (systemConfigurationOrchestrator.e(ObjectPipelineManager.T)) {
                d2 += (double)((float)(systemConfigurationOrchestrator.W(ObjectPipelineManager.T).y() + 1) * 0.1f);
            }
            physicsPositionTracker.setY(d2);
            systemConfigurationOrchestrator.z(d2);
        }
        this.O.e(physicsPositionTracker, 0.4199999976158142, systemConfigurationOrchestrator);
    }

    public ProtocolAdapterResolver(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }
}

