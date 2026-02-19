/*
 * Decompiled with CFR 0.152.
 */
package com.api.response;

import com.app.correlation.management.UuidCorrelationManager;
import com.io.buffer.StreamBufferManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.cipher.CipherConfigurationMode984;

public class ResponseMapper
extends UuidCorrelationManager<StreamBufferManager> {
    private CipherConfigurationMode984 m;

    public ResponseMapper() {
    }

    public CipherConfigurationMode984 K() {
        return this.m;
    }

    public ResponseMapper(StreamBufferManager streamBufferManager, CipherConfigurationMode984 cipherConfigurationMode984) {
        super(streamBufferManager);
        this.m = cipherConfigurationMode984;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.m);
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.m = networkProtocolEncoder1013.L(CipherConfigurationMode984.class);
    }
}

