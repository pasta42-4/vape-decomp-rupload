/*
 * Decompiled with CFR 0.152.
 */
package com.security.obfuscation;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class ObfuscationUtility
extends CryptoProtocolEngine {
    private static String g;

    static {
        if (ObfuscationUtility.p() != null) {
            ObfuscationUtility.i("ogCPyb");
        }
    }

    public static String p() {
        return g;
    }

    public ObfuscationUtility() {
        super(ReflectionMetadataResolver.Vh);
    }

    public static void i(String string) {
        g = string;
    }
}

