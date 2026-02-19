/*
 * Decompiled with CFR 0.152.
 */
package com.physics.simulation;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.validation.SystemStateValidator;

public class PhysicsSimulator
extends SystemStateValidator {
    public double T;
    public double f;

    @Override
    public boolean C() {
        boolean bl;
        block18: {
            block17: {
                block14: {
                    boolean bl2;
                    block16: {
                        block15: {
                            double d2;
                            double d3;
                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                            double[] dArray = new double[]{systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B()};
                            try {
                                PhysicsSimulator physicsSimulator = this;
                                d3 = this.B() ? 0.0 : this.f - dArray[0];
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PhysicsSimulator.b(customSystemException);
                            }
                            try {
                                physicsSimulator.r = d3;
                                PhysicsSimulator physicsSimulator = this;
                                d2 = this.H() ? 0.0 : this.T - dArray[2];
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PhysicsSimulator.b(customSystemException);
                            }
                            try {
                                try {
                                    try {
                                        physicsSimulator.t = d2;
                                        if (!this.N()) break block14;
                                        if (!(Math.abs(this.r) <= 0.1)) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PhysicsSimulator.b(customSystemException);
                                    }
                                    if (!(Math.abs(this.t) <= 0.1)) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PhysicsSimulator.b(customSystemException);
                                }
                                bl2 = true;
                                break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PhysicsSimulator.b(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                try {
                    try {
                        if (!(Math.abs(this.r) <= this.I()) || !(Math.abs(this.t) <= this.I())) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PhysicsSimulator.b(customSystemException);
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw PhysicsSimulator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void j(double d2, double d3) {
        this.f = d2;
        this.T = d3;
    }

    public PhysicsSimulator(double d2, double d3) {
        this.f = d2;
        this.T = d3;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

