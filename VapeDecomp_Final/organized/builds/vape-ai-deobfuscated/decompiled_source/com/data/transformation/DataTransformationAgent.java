/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.Ya;
import com.exception.system.CustomSystemException;
import com.security.event.SecureEventOrchestrator;
import com.system.configuration.SystemConfigurationOrchestrator;

public class DataTransformationAgent
extends Ya {
    final double y;
    final double i;

    public DataTransformationAgent(SystemConfigurationOrchestrator systemConfigurationOrchestrator, float f, float f2) {
        super(systemConfigurationOrchestrator.q() - f, systemConfigurationOrchestrator.S() - f2);
        this.y = Math.abs(f);
        this.i = Math.abs(f2);
    }

    private static CustomSystemException d(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block20: {
            boolean bl;
            boolean bl2;
            block19: {
                try {
                    if (secureEventOrchestrator.r()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationAgent.d(customSystemException);
                }
                bl2 = false;
                bl = false;
                if ((double)this.p() >= this.y) {
                    bl2 = true;
                }
                if ((double)this.u() >= this.i) {
                    bl = true;
                }
                boolean bl3 = false;
                boolean bl4 = false;
                if (!bl2 && (bl3 = this.q())) {
                    bl2 = true;
                }
                if (!bl && (bl4 = this.x())) {
                    bl = true;
                }
                try {
                    try {
                        try {
                            try {
                                if (!bl3 || !bl4) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataTransformationAgent.d(customSystemException);
                            }
                            if (!(Math.abs(this.u) < 1.0f)) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationAgent.d(customSystemException);
                        }
                        if (!(Math.abs(this.k) < 1.0f)) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationAgent.d(customSystemException);
                    }
                    this.X(true);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationAgent.d(customSystemException);
                }
            }
            try {
                try {
                    if (!bl2 || !bl) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationAgent.d(customSystemException);
                }
                this.X(true);
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationAgent.d(customSystemException);
            }
        }
    }
}

