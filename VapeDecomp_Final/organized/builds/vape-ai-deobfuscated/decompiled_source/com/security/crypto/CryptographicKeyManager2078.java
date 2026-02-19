/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.exception.system.CustomSystemException;
import com.security.crypto.EncryptionSchemeDefinition;

public class CryptographicKeyManager2078 {
    private final EncryptionSchemeDefinition E;
    private static int q;

    public static int p() {
        return q;
    }

    static {
        if (CryptographicKeyManager2078.M() == 0) {
            CryptographicKeyManager2078.S(93);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int M() {
        int n = CryptographicKeyManager2078.p();
        try {
            if (n == 0) {
                return 56;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager2078.b(customSystemException);
        }
        return 0;
    }

    public EncryptionSchemeDefinition s() {
        return this.E;
    }

    public CryptographicKeyManager2078(EncryptionSchemeDefinition encryptionSchemeDefinition) {
        this.E = encryptionSchemeDefinition;
    }

    public static void S(int n) {
        q = n;
    }
}

