/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.transformation;

import com.data.protocol.DataProcessingProtocol;
import com.runtime.management.RuntimeExecutionCoordinator;
import com.security.configuration.SecurityEnumRegistry;
import com.system.resource.SystemResourceAllocator;
import java.awt.Point;

class DataTransformationHandler2187
implements DataProcessingProtocol {
    final RuntimeExecutionCoordinator g;
    final SystemResourceAllocator O;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.g.Q(this.O);
    }

    DataTransformationHandler2187(RuntimeExecutionCoordinator runtimeExecutionCoordinator, SystemResourceAllocator systemResourceAllocator) {
        this.g = runtimeExecutionCoordinator;
        this.O = systemResourceAllocator;
    }
}

