/*
 * Decompiled with CFR 0.152.
 */
package com.io.buffer;

import com.api.response.ResponseMapper;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class StreamBufferManager
extends UuidCorrelationManager<ResponseMapper> {
    private long w;

    public StreamBufferManager(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.w = reflectionUtilityManager680.r();
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.w);
    }

    public long v() {
        return this.w;
    }

    public StreamBufferManager() {
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.w = networkProtocolEncoder1013.S();
    }
}

