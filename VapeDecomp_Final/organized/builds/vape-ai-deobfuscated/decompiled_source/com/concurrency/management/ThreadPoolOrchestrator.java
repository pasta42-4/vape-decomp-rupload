/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.management;

import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;

public class ThreadPoolOrchestrator
extends CryptoProtocolEngine {
    private static int G;

    public static void q(int n) {
        G = n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int z() {
        return G;
    }

    public static int Q() {
        int n = ThreadPoolOrchestrator.z();
        try {
            if (n == 0) {
                return 35;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ThreadPoolOrchestrator.a(customSystemException);
        }
        return 0;
    }

    public ThreadPoolOrchestrator() {
        super(ReflectionMetadataResolver.Vm);
    }

    static {
        if (ThreadPoolOrchestrator.Q() != 0) {
            ThreadPoolOrchestrator.q(18);
        }
    }
}

