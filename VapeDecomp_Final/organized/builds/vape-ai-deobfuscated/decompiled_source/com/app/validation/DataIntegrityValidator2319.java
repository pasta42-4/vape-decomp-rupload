/*
 * Decompiled with CFR 0.152.
 */
package com.app.validation;

import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherEncryptionWrapper;

class DataIntegrityValidator2319
extends CipherEncryptionWrapper {
    int W() {
        int n;
        try {
            n = this.M == 2 ? 5 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw DataIntegrityValidator2319.a(customSystemException);
        }
        return n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    void m(int n, byte[] byArray, int n2, byte[] byArray2) {
        byArray2[n2] = (byte)this.S(byArray[n] & 0xFF);
        byArray2[n2 + 1] = 0;
        byArray2[n2 + 2] = 8;
        byArray2[n2 + 3] = -56;
        ConfigurationManager2137.C(this.x - 3, byArray2, n2 + 4);
    }

    int S(int n) {
        try {
            if (n == 198) {
                return 199;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataIntegrityValidator2319.a(customSystemException);
        }
        try {
            if (n == 199) {
                return 198;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataIntegrityValidator2319.a(customSystemException);
        }
        try {
            if ((n - 153 & 1) == 0) {
                return n + 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataIntegrityValidator2319.a(customSystemException);
        }
        return n - 1;
    }

    DataIntegrityValidator2319(int n, int n2) {
        super(n, n2);
    }
}

