/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transactions;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine;
import com.security.session.CipherSessionManager;
import com.ui.events.UserInteractionEventDispatcher;

public abstract class TransactionProcessor1610
extends NumericTransformationEngine {
    @Override
    public void i() {
        try {
            if (this.F() instanceof CipherSessionManager) {
                this.F().b((double)(ApplicationLifecycleManager.e() / 4) - this.e() / 2.0);
                this.F().M((double)(ApplicationLifecycleManager.b() / 4) - this.z() / 2.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor1610.b(customSystemException);
        }
    }

    @Override
    public double e() {
        return 20.0;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public void C() {
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void u() {
    }

    @Override
    public double z() {
        return 20.0;
    }
}

