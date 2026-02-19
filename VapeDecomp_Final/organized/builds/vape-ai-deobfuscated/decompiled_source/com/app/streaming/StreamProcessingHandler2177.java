/*
 * Decompiled with CFR 0.152.
 */
package com.app.streaming;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class StreamProcessingHandler2177
extends CryptoProtocolEngine {
    private static int[] M;

    public static void u(int[] nArray) {
        M = nArray;
    }

    public StreamProcessingHandler2177() {
        super(ReflectionMetadataResolver.Pe);
    }

    public static int[] t() {
        return M;
    }

    static {
        if (StreamProcessingHandler2177.t() == null) {
            StreamProcessingHandler2177.u(new int[2]);
        }
    }
}

