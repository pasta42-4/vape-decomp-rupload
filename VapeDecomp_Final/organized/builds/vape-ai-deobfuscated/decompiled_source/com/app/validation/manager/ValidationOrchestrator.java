/*
 * Decompiled with CFR 0.152.
 */
package com.app.validation.manager;

import com.financial.transaction.TransactionProcessor1409;
import com.network.connection.ConnectionLifecycleHandler;
import com.text.transformation.StringTransformationEngine;

public class ValidationOrchestrator
extends ConnectionLifecycleHandler {
    public ValidationOrchestrator(Object object) {
        super(object);
    }

    public static ValidationOrchestrator z(TransactionProcessor1409 transactionProcessor1409) {
        return new ValidationOrchestrator(StringTransformationEngine.o(ValidationOrchestrator.U.u().gB, transactionProcessor1409.M()));
    }
}

