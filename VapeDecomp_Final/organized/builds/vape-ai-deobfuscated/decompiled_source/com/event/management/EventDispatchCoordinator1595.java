/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.policy.PolicyEnforcementHandler;
import com.system.configuration.SystemConfigurationOrchestrator;

class EventDispatchCoordinator1595
extends CryptographicSecurityProvider {
    final PolicyEnforcementHandler Di;

    EventDispatchCoordinator1595(PolicyEnforcementHandler policyEnforcementHandler) {
        this.Di = policyEnforcementHandler;
    }

    @Override
    public float e() {
        double d2;
        block5: {
            double d3 = 0.65;
            double d4 = 0.25;
            double d5 = Math.random();
            double d6 = Math.random();
            if (d5 < 1.0E-4) {
                d5 = 1.0E-4;
            }
            double d7 = Math.sqrt(-2.0 * Math.log(d5)) * Math.cos(Math.PI * 2 * d6);
            double d8 = Math.exp(d3 + d4 * d7);
            d8 = Math.max(1.4, Math.min(3.0, d8));
            d2 = (double)((Double)this.Di.Au.J()).floatValue() * d8;
            if (PolicyEnforcementHandler.w(this.Di).z(this.Di)) {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (!systemConfigurationOrchestrator.r() || PolicyEnforcementHandler.w(this.Di) == null) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1595.d(customSystemException);
                }
                double d9 = systemConfigurationOrchestrator.w(PolicyEnforcementHandler.w(this.Di).F(), PolicyEnforcementHandler.w(this.Di).V(), PolicyEnforcementHandler.w(this.Di).B());
                if (d9 < 0.8) {
                    double d10 = d9 / 0.8;
                    d2 *= d10;
                }
            }
        }
        return (float)d2;
    }

    private static CustomSystemException d(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

