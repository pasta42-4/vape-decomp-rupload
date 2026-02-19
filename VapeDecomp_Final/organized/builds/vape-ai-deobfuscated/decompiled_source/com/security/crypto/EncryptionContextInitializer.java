/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.zY;
import com.exception.system.CustomSystemException;

abstract class EncryptionContextInitializer {
    final String V;
    final long g;
    final String k;
    final int c;
    final String i;
    int K;
    final int Z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    EncryptionContextInitializer(int n, int n2, String string, String string2, String string3, long l) {
        this.Z = n;
        this.c = n2;
        this.k = string;
        this.V = string2;
        this.i = string3;
        this.g = l;
    }

    int d() {
        try {
            if (this.K == 0) {
                this.K = zY.m(this.i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionContextInitializer.a(customSystemException);
        }
        return this.K;
    }
}

