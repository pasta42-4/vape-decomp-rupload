/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.core;

import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;
import com.service.orchestration.ServiceOrchestrationManager;

class TransactionProcessor1810
extends CipherManager {
    final ServiceOrchestrationManager eO;

    @Override
    public void O() {
        try {
            if (this.a().equals("")) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor1810.a(customSystemException);
        }
        ServiceOrchestrationManager.V(this.eO, this.a());
        this.y("");
    }

    @Override
    public double z() {
        return 22.0;
    }

    @Override
    public float C() {
        return 2.0f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    TransactionProcessor1810(ServiceOrchestrationManager serviceOrchestrationManager, String string) {
        this.eO = serviceOrchestrationManager;
        super(string);
    }

    @Override
    public double e() {
        return 104.0;
    }
}

