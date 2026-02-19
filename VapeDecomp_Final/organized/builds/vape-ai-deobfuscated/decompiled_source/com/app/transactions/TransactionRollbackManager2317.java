/*
 * Decompiled with CFR 0.152.
 */
package com.app.transactions;

import com.app.system.resources.VirtualResourceAllocator;
import com.dataprocessing.transformation.GeneralTransformationHandler;
import com.financial.processing.TransactionValidationEngine;

public class TransactionRollbackManager2317
extends VirtualResourceAllocator {
    public void E(TransactionValidationEngine transactionValidationEngine) {
        GeneralTransformationHandler.Y(TransactionRollbackManager2317.U.u().kM, this.H, transactionValidationEngine.M());
    }

    public TransactionRollbackManager2317(Object object) {
        super(object);
    }
}

