/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.finance.transaction;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import org.jetbrains.annotations.Nullable;

class TransactionProcessor1417
extends AbstractComputationKernel {
    @Nullable
    private OperationExecutionInterface V;

    public TransactionProcessor1417(@Nullable OperationExecutionInterface operationExecutionInterface) {
        this.V = operationExecutionInterface;
    }

    public void A(@Nullable OperationExecutionInterface operationExecutionInterface) {
        this.V = operationExecutionInterface;
    }

    @Override
    public void G() {
        try {
            if (this.s()) {
                ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), TransactionProcessor1417.M.S);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor1417.a(customSystemException);
        }
    }

    public TransactionProcessor1417() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        OperationExecutionInterface operationExecutionInterface = this.V;
        try {
            if (operationExecutionInterface != null) {
                operationExecutionInterface.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor1417.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public OperationExecutionInterface L() {
        return this.V;
    }
}

