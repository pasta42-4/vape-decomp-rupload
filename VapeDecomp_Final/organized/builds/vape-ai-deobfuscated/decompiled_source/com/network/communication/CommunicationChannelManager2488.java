/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.adapter.management.GenericAdapterManager;
import com.execution.validation.ExecutionStateValidator;
import com.security.cryptography.EncryptionKeyGenerator;
import com.system.configuration.ConfigurationResolver;
import com.temporal.metadata.TemporalMetadataResolver;

class CommunicationChannelManager2488
extends ExecutionStateValidator<ConfigurationResolver> {
    final EncryptionKeyGenerator b;

    @Override
    public void b() {
        TemporalMetadataResolver.h.e().n((ConfigurationResolver)this.y());
    }

    CommunicationChannelManager2488(EncryptionKeyGenerator encryptionKeyGenerator, GenericAdapterManager genericAdapterManager) {
        this.b = encryptionKeyGenerator;
        super(genericAdapterManager);
    }
}

