/*
 * Decompiled with CFR 0.152.
 */
package com.security.cryptography;

import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;

public class CryptographicKeyManager1599
extends CipherManager {
    private final TransactionDescriptor kb;

    public CryptographicKeyManager1599(String string, TransactionDescriptor transactionDescriptor) {
        super(string);
        this.kb = transactionDescriptor;
        this.i(false);
        this.o(48);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void O() {
        try {
            if (!this.E()) {
                this.y("");
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager1599.a(customSystemException);
        }
        String string = this.a();
        TransactionDescriptor transactionDescriptor = TemporalMetadataResolver.h.o().Y(string);
        try {
            if (transactionDescriptor != null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager1599.a(customSystemException);
        }
        this.kb.R(string);
        this.kb.j(true);
        TemporalMetadataResolver.h.o().R(this.kb, true);
        TemporalMetadataResolver.h.o().q(this.kb);
        this.y("");
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public double M() {
        return this.w() + 2.5;
    }
}

