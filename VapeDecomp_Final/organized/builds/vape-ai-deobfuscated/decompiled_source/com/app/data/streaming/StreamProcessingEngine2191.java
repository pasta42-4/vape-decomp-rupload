/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.streaming;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class StreamProcessingEngine2191
extends CryptoProtocolEngine {
    private static int[] k;

    public static int[] m() {
        return k;
    }

    public static void w(int[] nArray) {
        k = nArray;
    }

    static {
        if (StreamProcessingEngine2191.m() == null) {
            StreamProcessingEngine2191.w(new int[4]);
        }
    }

    public StreamProcessingEngine2191() {
        super(ReflectionMetadataResolver.FH);
    }
}

