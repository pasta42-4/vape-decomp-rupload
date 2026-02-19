/*
 * Decompiled with CFR 0.152.
 */
package com.network.mapping;

import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.system.validation.SafetyComplianceValidator;

public abstract class NetworkInterfaceMapper {
    NetworkInterfaceMapper y;

    protected void J(SafetyComplianceValidator safetyComplianceValidator) {
        safetyComplianceValidator.Y = this.y;
    }

    protected abstract boolean Z(ComplexEntityLifecycleManager var1, int var2);

    protected NetworkInterfaceMapper(SafetyComplianceValidator safetyComplianceValidator) {
        this.y = safetyComplianceValidator.Y;
        safetyComplianceValidator.Y = this;
    }
}

