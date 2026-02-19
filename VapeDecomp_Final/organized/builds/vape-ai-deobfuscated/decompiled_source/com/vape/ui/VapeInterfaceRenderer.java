/*
 * Decompiled with CFR 0.152.
 */
package com.vape.ui;

import com.app.core.interfaces.OperationExecutionInterface;
import com.crypto.engine.CipherTransformationEngine;
import com.security.access.SecurityAccessController1588;
import com.temporal.metadata.TemporalMetadataResolver;

class VapeInterfaceRenderer
implements OperationExecutionInterface {
    final CipherTransformationEngine m;
    final SecurityAccessController1588 F;

    @Override
    public void R() {
        TemporalMetadataResolver.h.n();
        TemporalMetadataResolver.h.j().y(this.F);
        this.m.T();
    }

    VapeInterfaceRenderer(CipherTransformationEngine cipherTransformationEngine, SecurityAccessController1588 securityAccessController1588) {
        this.m = cipherTransformationEngine;
        this.F = securityAccessController1588;
    }
}

