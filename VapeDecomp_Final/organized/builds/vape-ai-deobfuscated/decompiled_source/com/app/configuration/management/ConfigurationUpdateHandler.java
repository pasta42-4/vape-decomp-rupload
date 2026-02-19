/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.crypto.stream.CipherStreamProcessor327;
import com.temporal.metadata.TemporalMetadataResolver;

class ConfigurationUpdateHandler
implements OperationExecutionInterface {
    final CipherStreamProcessor327 n;

    ConfigurationUpdateHandler(CipherStreamProcessor327 cipherStreamProcessor327) {
        this.n = cipherStreamProcessor327;
    }

    @Override
    public void R() {
        TemporalMetadataResolver.h.t().v();
    }
}

