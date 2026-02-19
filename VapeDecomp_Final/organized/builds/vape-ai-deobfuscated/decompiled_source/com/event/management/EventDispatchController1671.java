/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.analytics.computation.NumericComputationEngine1000;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.system.configuration.SystemConfigurationOrchestrator;

public class EventDispatchController1671
extends NumericComputationEngine1000 {
    private boolean C = false;

    @Override
    public void G() {
        float f;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            this.A(systemConfigurationOrchestrator);
            this.Z = systemConfigurationOrchestrator.q() + 180.0f;
            EventDispatchController1671 eventDispatchController1671 = this;
            f = this.C ? 0.0f : -systemConfigurationOrchestrator.S();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchController1671.a(customSystemException);
        }
        eventDispatchController1671.Q = f;
        super.G();
    }

    public EventDispatchController1671() {
        super(true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void z(boolean bl) {
        this.C = bl;
    }
}

