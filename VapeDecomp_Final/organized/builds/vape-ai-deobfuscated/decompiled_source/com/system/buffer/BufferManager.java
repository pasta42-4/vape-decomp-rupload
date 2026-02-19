/*
 * Decompiled with CFR 0.152.
 */
package com.system.buffer;

import com.security.crypto.CryptographicKeyGenerator2720;
import com.system.configuration.MultiParameterConfigurationManager;
import java.nio.ByteBuffer;

class BufferManager {
    private int d;
    private ByteBuffer G;
    private int m;
    private int S;
    private int Q;
    final MultiParameterConfigurationManager x;

    private BufferManager(MultiParameterConfigurationManager multiParameterConfigurationManager) {
        this.x = multiParameterConfigurationManager;
    }

    static int U(BufferManager bufferManager, int n) {
        bufferManager.S = n;
        return bufferManager.S;
    }

    static int M(BufferManager bufferManager, int n) {
        bufferManager.Q = n;
        return bufferManager.Q;
    }

    static int D(BufferManager bufferManager, int n) {
        bufferManager.d = n;
        return bufferManager.d;
    }

    static ByteBuffer h(BufferManager bufferManager, ByteBuffer byteBuffer) {
        bufferManager.G = byteBuffer;
        return bufferManager.G;
    }

    BufferManager(MultiParameterConfigurationManager multiParameterConfigurationManager, CryptographicKeyGenerator2720 cryptographicKeyGenerator2720) {
        this(multiParameterConfigurationManager);
    }

    static int u(BufferManager bufferManager, int n) {
        bufferManager.m = n;
        return bufferManager.m;
    }
}

