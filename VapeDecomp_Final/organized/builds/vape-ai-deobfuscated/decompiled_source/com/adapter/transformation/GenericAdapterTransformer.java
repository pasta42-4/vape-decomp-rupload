/*
 * Decompiled with CFR 0.152.
 */
package com.adapter.transformation;

import a.oQ;
import com.app.context.transformation.ContextTransformationEngine;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.math.orchestration.NumericTransformationOrchestrator;
import com.physics.simulation.PhysicsPositionTracker;
import com.runtime.context.ContextualExecutionFramework;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
import java.util.List;

public class GenericAdapterTransformer
extends ContextTransformationEngine<NumericTransformationOrchestrator> {
    private final NumericTransformationOrchestrator V = (NumericTransformationOrchestrator)this.n();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GenericAdapterTransformer(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    @DataExchangeProtocol2090
    public void I(PhysicsPositionTracker physicsPositionTracker) {
        block52: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block53: {
                block46: {
                    block44: {
                        block43: {
                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                            try {
                                if (systemConfigurationOrchestrator.F()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericAdapterTransformer.a(customSystemException);
                            }
                            try {
                                try {
                                    if (systemConfigurationOrchestrator.u() != 0.0f || systemConfigurationOrchestrator.w() != 0.0f) break block43;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericAdapterTransformer.a(customSystemException);
                                }
                                this.V.o = this.V.V();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericAdapterTransformer.a(customSystemException);
                            }
                        }
                        try {
                            block45: {
                                try {
                                    try {
                                        try {
                                            if (this.V.V != 1 || !systemConfigurationOrchestrator.D()) break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericAdapterTransformer.a(customSystemException);
                                        }
                                        if (systemConfigurationOrchestrator.u() != 0.0f) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GenericAdapterTransformer.a(customSystemException);
                                    }
                                    if (systemConfigurationOrchestrator.w() == 0.0f) break block44;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericAdapterTransformer.a(customSystemException);
                                }
                            }
                            this.V.o = 0.25 + this.V.V() - 0.01;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GenericAdapterTransformer.a(customSystemException);
                        }
                    }
                    try {
                        block47: {
                            try {
                                try {
                                    if (this.V.V != 2) break block46;
                                    if (systemConfigurationOrchestrator.u() != 0.0f) break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericAdapterTransformer.a(customSystemException);
                                }
                                if (systemConfigurationOrchestrator.w() == 0.0f) break block46;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericAdapterTransformer.a(customSystemException);
                            }
                        }
                        if (!systemConfigurationOrchestrator.j()) break block46;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericAdapterTransformer.a(customSystemException);
                    }
                    double d2 = 0.42f;
                    if (systemConfigurationOrchestrator.e(ObjectPipelineManager.T)) {
                        d2 += (double)((float)(systemConfigurationOrchestrator.W(ObjectPipelineManager.T).y() + 1) * 0.1f);
                    }
                    physicsPositionTracker.setY(d2);
                    systemConfigurationOrchestrator.z(d2);
                    this.V.o *= 2.149;
                    break block53;
                }
                if (this.V.V == 3) {
                    double d3 = 0.66 * (this.V.m - this.V.V());
                    this.V.o = this.V.m - d3;
                } else {
                    block48: {
                        int n;
                        block51: {
                            block50: {
                                block49: {
                                    oQ oQ2 = null;
                                    oQ2 = GeometryCalculator.C() == 13 ? ((oQ)systemConfigurationOrchestrator.L()).h().V(0.0, systemConfigurationOrchestrator.x(), 0.0) : ((oQ)systemConfigurationOrchestrator.L()).V(0.0, systemConfigurationOrchestrator.x(), 0.0);
                                    List list = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (list.size() <= 0 && !systemConfigurationOrchestrator.D()) break block48;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GenericAdapterTransformer.a(customSystemException);
                                                }
                                                if (this.V.V <= 0) break block48;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GenericAdapterTransformer.a(customSystemException);
                                            }
                                            if (!(1.35 * this.V.V() - 0.01 > this.V.o)) break block49;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericAdapterTransformer.a(customSystemException);
                                        }
                                        this.V.V = 0;
                                        break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GenericAdapterTransformer.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        NumericTransformationOrchestrator numericTransformationOrchestrator = this.V;
                                        if (systemConfigurationOrchestrator.u() == 0.0f && systemConfigurationOrchestrator.w() == 0.0f) break block50;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GenericAdapterTransformer.a(customSystemException);
                                    }
                                    n = 1;
                                    break block51;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericAdapterTransformer.a(customSystemException);
                                }
                            }
                            n = 0;
                        }
                        numericTransformationOrchestrator.V = n;
                    }
                    this.V.o = this.V.m - this.V.m / 159.0;
                }
            }
            try {
                if (this.V.V > 0) {
                    this.V.o = Math.max(this.V.o, this.V.V());
                    this.V.e(physicsPositionTracker, this.V.o, systemConfigurationOrchestrator);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericAdapterTransformer.a(customSystemException);
            }
            try {
                try {
                    if (systemConfigurationOrchestrator.u() == 0.0f && systemConfigurationOrchestrator.w() == 0.0f) break block52;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericAdapterTransformer.a(customSystemException);
                }
                ++this.V.V;
            }
            catch (CustomSystemException customSystemException) {
                throw GenericAdapterTransformer.a(customSystemException);
            }
        }
    }
}

