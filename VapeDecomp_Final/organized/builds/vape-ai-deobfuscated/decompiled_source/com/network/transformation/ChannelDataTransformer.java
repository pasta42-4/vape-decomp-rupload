/*
 * Decompiled with CFR 0.152.
 */
package com.network.transformation;

import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.authentication.TokenAuthenticator;
import com.security.keygen.CipherKeyGenerationEnum;

public class ChannelDataTransformer
extends UuidCorrelationManager<TokenAuthenticator> {
    private CipherKeyGenerationEnum f;

    public ChannelDataTransformer(TokenAuthenticator tokenAuthenticator, CipherKeyGenerationEnum cipherKeyGenerationEnum) {
        super(tokenAuthenticator);
        this.f = cipherKeyGenerationEnum;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.f);
    }

    public CipherKeyGenerationEnum Q() {
        return this.f;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.f = networkProtocolEncoder1013.L(CipherKeyGenerationEnum.class);
    }

    public ChannelDataTransformer() {
    }
}

