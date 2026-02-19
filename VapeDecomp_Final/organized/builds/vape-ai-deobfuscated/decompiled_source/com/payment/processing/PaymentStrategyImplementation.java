/*
 * Decompiled with CFR 0.152.
 */
package com.payment.processing;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.reflection.utils.ReflectionProxyHandler;

class PaymentStrategyImplementation
implements OperationExecutionInterface {
    final ReflectionProxyHandler H;

    PaymentStrategyImplementation(ReflectionProxyHandler reflectionProxyHandler) {
        this.H = reflectionProxyHandler;
    }

    @Override
    public void R() {
        try {
            if (ReflectionProxyHandler.h(this.H) != null) {
                ReflectionProxyHandler.e(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PaymentStrategyImplementation.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

