/*
 * Decompiled with CFR 0.152.
 */
package com.financial.validation;

import a.h6;
import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.ui.events.UserInteractionEventDispatcher;

public class TransactionValidator1458
extends AbstractComputationKernel {
    private h6 L;

    @Override
    public void U() {
    }

    @Override
    public void g() {
    }

    public TransactionValidator1458(String string, OperationExecutionInterface operationExecutionInterface) {
        this.L = new h6(string, TransactionValidator1458.M.S);
        this.L.N(operationExecutionInterface);
        this.o(this.L);
    }

    @Override
    public double z() {
        return 15.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    @Override
    public void G() {
        this.L.b(this.G() + 5.0);
        this.L.M(this.W() + 1.0);
        this.L.T(this.w() - 10.0);
        this.L.w(this.b() - 2.0);
    }

    @Override
    public void d() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }
}

