/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class NetworkConnectionManager2147
extends CryptoProtocolEngine {
    private static int[] G;

    static {
        if (NetworkConnectionManager2147.i() == null) {
            NetworkConnectionManager2147.O(new int[3]);
        }
    }

    public NetworkConnectionManager2147() {
        super(ReflectionMetadataResolver.Yo);
    }

    public static void O(int[] nArray) {
        G = nArray;
    }

    public static int[] i() {
        return G;
    }
}

