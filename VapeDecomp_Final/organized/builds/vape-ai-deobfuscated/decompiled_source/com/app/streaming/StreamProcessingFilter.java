/*
 * Decompiled with CFR 0.152.
 */
package com.app.streaming;

import a.HK;
import com.game.events.PlayerEventMediator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.CryptographicTransformer406;
import com.security.crypto.EncryptionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

public class StreamProcessingFilter
extends EncryptionTransformer {
    @Override
    public void y() {
        HK hK = TemporalMetadataResolver.h.u().k6.H;
        CryptographicTransformer406 cryptographicTransformer406 = new CryptographicTransformer406(hK, PlayerEventMediator.class);
        cryptographicTransformer406.c(true);
        this.S(cryptographicTransformer406);
    }

    public StreamProcessingFilter() {
        super(ReflectionMetadataResolver.bY);
    }
}

