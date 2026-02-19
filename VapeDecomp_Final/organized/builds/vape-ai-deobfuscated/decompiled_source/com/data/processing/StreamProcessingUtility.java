/*
 * Decompiled with CFR 0.152.
 */
package com.data.processing;

import a.Sc;
import com.security.streaming.StreamCipherOrchestrator183;

class StreamProcessingUtility {
    StreamCipherOrchestrator183 n;
    Sc H;
    Runnable A;

    public StreamProcessingUtility(StreamCipherOrchestrator183 streamCipherOrchestrator183, Sc sc, Runnable runnable) {
        this.n = streamCipherOrchestrator183;
        this.H = sc;
        this.A = runnable;
    }
}

