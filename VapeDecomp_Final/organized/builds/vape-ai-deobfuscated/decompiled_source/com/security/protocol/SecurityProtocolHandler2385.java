/*
 * Decompiled with CFR 0.152.
 */
package com.security.protocol;

import com.data.mapping.DataMappingOrchestrator;
import com.data.transformation.DataTransformationAgent;
import com.system.configuration.SystemConfigurationOrchestrator;

class SecurityProtocolHandler2385
extends DataTransformationAgent {
    final DataMappingOrchestrator O;

    @Override
    public void X(boolean bl) {
        super.X(true);
        if (DataMappingOrchestrator.t(this.O).b(this.O)) {
            // empty if block
        }
    }

    SecurityProtocolHandler2385(DataMappingOrchestrator dataMappingOrchestrator, SystemConfigurationOrchestrator systemConfigurationOrchestrator, float f, float f2) {
        this.O = dataMappingOrchestrator;
        super(systemConfigurationOrchestrator, f, f2);
    }
}

