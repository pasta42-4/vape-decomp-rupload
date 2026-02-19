/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.network.mapping.NetworkInterfaceMapper;
import com.system.validation.SafetyComplianceValidator;

class ResourceAllocationHandler2388
extends NetworkInterfaceMapper {
    final SafetyComplianceValidator s;
    final int v;

    ResourceAllocationHandler2388(SafetyComplianceValidator safetyComplianceValidator, SafetyComplianceValidator safetyComplianceValidator2, int n) {
        this.s = safetyComplianceValidator;
        this.v = n;
        super(safetyComplianceValidator2);
    }

    @Override
    protected boolean Z(ComplexEntityLifecycleManager complexEntityLifecycleManager, int n) {
        complexEntityLifecycleManager.B(this.v);
        complexEntityLifecycleManager.E(195);
        return false;
    }
}

