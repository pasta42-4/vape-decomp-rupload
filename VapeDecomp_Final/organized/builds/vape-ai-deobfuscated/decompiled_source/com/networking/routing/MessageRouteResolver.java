/*
 * Decompiled with CFR 0.152.
 */
package com.networking.routing;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.EncryptionKeyGenerator;
import com.temporal.metadata.TemporalMetadataResolver;

class MessageRouteResolver
implements OperationExecutionInterface {
    final EncryptionKeyGenerator I;

    @Override
    public void R() {
        TemporalMetadataResolver.h.o().q();
    }

    MessageRouteResolver(EncryptionKeyGenerator encryptionKeyGenerator) {
        this.I = encryptionKeyGenerator;
    }
}

