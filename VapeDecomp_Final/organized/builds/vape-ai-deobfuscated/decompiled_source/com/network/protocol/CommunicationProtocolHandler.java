/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.core.interfaces.OperationExecutionInterface;
import com.app.system.configuration.RuntimeConfigurationBuilder;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionEngine;
import com.exception.system.CustomSystemException;
import com.math.strategy.MathematicalOperationStrategy;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.runtime.mediation.RuntimeContextMediator;

class CommunicationProtocolHandler
implements OperationExecutionInterface {
    final RuntimeContextMediator c;

    @Override
    public void R() {
        DataCompressionEngine dataCompressionEngine = RuntimeContextMediator.a(this.c);
        dataCompressionEngine.p((ReflectionMetadataExtractor1376)this.c.t());
        dataCompressionEngine.k();
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : dataCompressionEngine.w().Y()) {
            AbstractComputationKernel abstractComputationKernel;
            block6: {
                block5: {
                    abstractComputationKernel = RuntimeConfigurationBuilder.m(configurationProfileResolver);
                    try {
                        try {
                            if (abstractComputationKernel == null) continue;
                            if (configurationProfileResolver.G() == null) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CommunicationProtocolHandler.a(customSystemException);
                        }
                        abstractComputationKernel.Q(MathematicalOperationStrategy.M.a);
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CommunicationProtocolHandler.a(customSystemException);
                    }
                }
                abstractComputationKernel.Q(MathematicalOperationStrategy.M.W);
            }
            dataCompressionEngine.n(abstractComputationKernel, new Object[0]);
        }
        dataCompressionEngine.N(true);
        dataCompressionEngine.i(170.0);
        dataCompressionEngine.A();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    CommunicationProtocolHandler(RuntimeContextMediator runtimeContextMediator) {
        this.c = runtimeContextMediator;
    }
}

