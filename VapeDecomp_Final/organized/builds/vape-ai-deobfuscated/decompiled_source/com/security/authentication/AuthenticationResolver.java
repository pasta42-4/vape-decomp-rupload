/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.security.crypto.CipherManager;
import com.security.crypto.CryptoAlgorithmResolver;

class AuthenticationResolver
extends CipherManager {
    final double iE;
    final CryptoAlgorithmResolver io;

    @Override
    public void O() {
    }

    AuthenticationResolver(CryptoAlgorithmResolver cryptoAlgorithmResolver, String string, double d2) {
        this.io = cryptoAlgorithmResolver;
        this.iE = d2;
        super(string);
    }

    @Override
    public double z() {
        return 16.0;
    }

    @Override
    public double e() {
        return this.iE;
    }
}

