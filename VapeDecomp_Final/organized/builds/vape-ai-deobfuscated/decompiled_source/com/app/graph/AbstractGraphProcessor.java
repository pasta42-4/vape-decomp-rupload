/*
 * Decompiled with CFR 0.152.
 */
package com.app.graph;

import a.oQ;
import com.app.context.transformation.ContextTransformationEngine;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.propagation.EventPropagationDispatcher;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicContextManager1918;
import com.system.configuration.SystemConfigurationOrchestrator;

public class AbstractGraphProcessor
extends ContextTransformationEngine {
    public AbstractGraphProcessor(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    @DataExchangeProtocol2090
    public void G(EventPropagationDispatcher eventPropagationDispatcher) {
        block9: {
            double d2;
            double d3;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block10: {
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractGraphProcessor.a(customSystemException);
                }
                double d4 = 0.163;
                double d5 = Math.cos(Math.toRadians(systemConfigurationOrchestrator.q() + 90.0f));
                double d6 = Math.sin(Math.toRadians(systemConfigurationOrchestrator.q() + 90.0f));
                d3 = (double)systemConfigurationOrchestrator.W().t() * d4 * d5 + (double)systemConfigurationOrchestrator.W().m() * d4 * d6;
                d2 = (double)systemConfigurationOrchestrator.W().t() * d4 * d6 - (double)systemConfigurationOrchestrator.W().m() * d4 * d5;
                try {
                    try {
                        try {
                            if (!systemConfigurationOrchestrator.P() || systemConfigurationOrchestrator.T()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractGraphProcessor.a(customSystemException);
                        }
                        if (GeometryCalculator.C() <= 13) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractGraphProcessor.a(customSystemException);
                    }
                    systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.a(systemConfigurationOrchestrator.F() + d3, systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B() + d2, false));
                    systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() - 0.4982374987, systemConfigurationOrchestrator.B(), false));
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractGraphProcessor.a(customSystemException);
                }
            }
            systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.e(systemConfigurationOrchestrator.F() + d3, ((oQ)systemConfigurationOrchestrator.L()).c(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B() + d2, false));
            systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.e(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c() - 0.4982374987, systemConfigurationOrchestrator.V() - 0.4982374987, systemConfigurationOrchestrator.B(), false));
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

