/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.security.cryptography.CryptographicKeyManager1599;
import com.security.transaction.TransactionalCipherManager;
import com.transaction.model.TransactionDescriptor;

class NetworkPacketProcessor2286
extends CryptographicKeyManager1599 {
    final TransactionalCipherManager Eq;

    NetworkPacketProcessor2286(TransactionalCipherManager transactionalCipherManager, String string, TransactionDescriptor transactionDescriptor) {
        this.Eq = transactionalCipherManager;
        super(string, transactionDescriptor);
    }

    @Override
    public void O() {
        super.O();
        this.Eq.N(null);
        TransactionalCipherManager.D(this.Eq).P();
        this.n();
    }
}

