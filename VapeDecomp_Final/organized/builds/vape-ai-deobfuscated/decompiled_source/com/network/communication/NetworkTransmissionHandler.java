/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.security.crypto.CipherManager;
import com.security.crypto.CryptoAlgorithmResolver;

class NetworkTransmissionHandler
extends CipherManager {
    final double q3;
    final CryptoAlgorithmResolver qm;

    @Override
    public void O() {
    }

    @Override
    public double z() {
        return 16.0;
    }

    NetworkTransmissionHandler(CryptoAlgorithmResolver cryptoAlgorithmResolver, String string, double d2) {
        this.qm = cryptoAlgorithmResolver;
        this.q3 = d2;
        super(string);
    }

    @Override
    public double e() {
        return this.q3;
    }
}

