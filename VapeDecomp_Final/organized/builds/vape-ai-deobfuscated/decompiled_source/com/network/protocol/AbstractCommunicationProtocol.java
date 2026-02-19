/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.aX;
import com.security.crypto.EncryptionContextInitializer;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.security.orchestration.CryptoOperationOrchestrator951;

final class AbstractCommunicationProtocol
extends CryptoOperationOrchestrator951 {
    void o(int n, int n2, EncryptionContextInitializer encryptionContextInitializer, aX aX2) {
        super.o(n, n2, encryptionContextInitializer, aX2);
        CryptoOperationOrchestrator951 cryptoOperationOrchestrator951 = new CryptoOperationOrchestrator951(null);
        this.Z(aX2, cryptoOperationOrchestrator951, 0);
        this.P(cryptoOperationOrchestrator951);
    }

    AbstractCommunicationProtocol(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        super(cryptoKeyExchangeMapping);
    }
}

