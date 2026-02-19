/*
 * Decompiled with CFR 0.152.
 */
package com.data.stream;

import com.app.correlation.management.UuidCorrelationManager;
import com.cache.management.CacheDispatcher;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.crypto.CipherTransformationType;

public class StreamProcessor1422
extends UuidCorrelationManager<CacheDispatcher> {
    private CipherTransformationType A;

    public StreamProcessor1422() {
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.A = networkProtocolEncoder1013.L(CipherTransformationType.class);
    }

    public CipherTransformationType m() {
        return this.A;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.A);
    }

    public StreamProcessor1422(CacheDispatcher cacheDispatcher, CipherTransformationType cipherTransformationType) {
        super(cacheDispatcher);
        this.A = cipherTransformationType;
    }
}

