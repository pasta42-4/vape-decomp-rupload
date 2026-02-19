/*
 * Decompiled with CFR 0.152.
 */
package com.network.routing;

import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherEncryptionWrapper;

class RequestDispatcher
extends CipherEncryptionWrapper {
    void m(int n, byte[] byArray, int n2, byte[] byArray2) {
        int n3;
        try {
            byte[] byArray3 = byArray2;
            int n4 = n2;
            n3 = (byArray[n] & 0xFF) == 167 ? 200 : 201;
        }
        catch (CustomSystemException customSystemException) {
            throw RequestDispatcher.a(customSystemException);
        }
        byArray3[n4] = (byte)n3;
        ConfigurationManager2137.C(this.x, byArray2, n2 + 1);
    }

    int W() {
        int n;
        try {
            n = this.M == 2 ? 2 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw RequestDispatcher.a(customSystemException);
        }
        return n;
    }

    RequestDispatcher(int n, int n2) {
        super(n, n2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

