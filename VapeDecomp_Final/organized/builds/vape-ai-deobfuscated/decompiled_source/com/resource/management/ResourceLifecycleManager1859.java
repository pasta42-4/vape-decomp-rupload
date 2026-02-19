/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.exception.system.CustomSystemException;
import com.security.exchange.CryptoKeyExchangeMapping;

public class ResourceLifecycleManager1859
extends CollectionOrchestrator1895 {
    private CryptoKeyExchangeMapping O;

    public void H() {
        this.O = null;
    }

    public ResourceLifecycleManager1859(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        super(-1);
        this.O = cryptoKeyExchangeMapping;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ResourceLifecycleManager1859() {
        super(-1);
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.z(this.i());
    }

    public CryptoKeyExchangeMapping i() {
        try {
            if (this.O == null) {
                this.O = new CryptoKeyExchangeMapping();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceLifecycleManager1859.a(customSystemException);
        }
        return this.O;
    }
}

