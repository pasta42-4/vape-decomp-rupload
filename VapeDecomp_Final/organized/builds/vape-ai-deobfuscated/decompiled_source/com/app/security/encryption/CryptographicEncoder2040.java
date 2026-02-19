/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.encryption;

import com.network.connection.NetworkConnectionManager1945;
import com.temporal.metadata.TemporalMetadataResolver;

public class CryptographicEncoder2040 {
    private static String S;

    public static void n(String string) {
        S = string;
    }

    static {
        if (CryptographicEncoder2040.k() != null) {
            CryptographicEncoder2040.n("BXblW");
        }
    }

    public static NetworkConnectionManager1945 X() {
        return new NetworkConnectionManager1945(TemporalMetadataResolver.h.u().dI.s());
    }

    public static String k() {
        return S;
    }
}

