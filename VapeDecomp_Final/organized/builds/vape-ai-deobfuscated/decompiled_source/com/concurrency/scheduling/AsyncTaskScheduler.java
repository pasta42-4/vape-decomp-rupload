/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.scheduling;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class AsyncTaskScheduler
extends CryptoProtocolEngine {
    private static String[] X;

    public static String[] Z() {
        return X;
    }

    static {
        if (AsyncTaskScheduler.Z() != null) {
            AsyncTaskScheduler.U(new String[5]);
        }
    }

    public static void U(String[] stringArray) {
        X = stringArray;
    }

    public AsyncTaskScheduler() {
        super(ReflectionMetadataResolver.bo);
    }
}

