/*
 * Decompiled with CFR 0.152.
 */
package com.finance.validation;

import com.crypto.config.CipherConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionValidationService
extends ObjectLifecycleTracker {
    public static TransactionValidationService k() {
        return new TransactionValidationService(CipherConfigurationManager.x(TransactionValidationService.U.u().Lp));
    }

    public TransactionValidationService(Object object) {
        super(object);
    }

    public static TransactionValidationService i() {
        return new TransactionValidationService(CipherConfigurationManager.E(TransactionValidationService.U.u().Lp));
    }

    public static TransactionValidationService m() {
        return new TransactionValidationService(CipherConfigurationManager.l(TransactionValidationService.U.u().Lp));
    }
}

